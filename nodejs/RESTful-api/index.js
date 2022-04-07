const http = require('http')
const https = require('https')
const url = require('url')
const StringDecoder = require('string_decoder').StringDecoder
const fs = require('fs')

const config = require('./config')

//instantiate HTTP server
const httpServer = http.createServer((req, res) => {
  serverLogic(req, res)
})

//start HTTP server
httpServer.listen(config.httpPort, () => {
  console.log(`server running on http://localhost:${config.httpPort} in ${config.envName} Environment`)
})

//instantiate HTTPS server
const httpsServerOptions = {
  'key': fs.readFileSync('./https/key.pem'),
  'cert': fs.readFileSync('./https/cert.pem')
}

const httpsServer = https.createServer(httpsServerOptions, (req, res) => {
  serverLogic(req, res)
})

//start HTTPS server
httpsServer.listen(config.httpsPort, () => {
  console.log(`server running on https://localhost:${config.httpsPort} in ${config.envName} Environment`)
})

//server logic http & https
const serverLogic = (req, res) => {
  const parsedUrl = url.parse(req.url, true)

  const path = parsedUrl.pathname

  //http://localhost:4200/foo : foo
  //http://localhost:4200/foo/bar/foo : foo/bar/foo
  const trimmedPath = path.replace(/^\/+|\/+$/g, '')

  //http://localhost:4200/foo?bar=cerveja : {bar=cerveja}
  const queryStringObject = parsedUrl.query

  const method = req.method.toLowerCase()

  const headers = req.headers

  //get payload (POST)
  const decoder = new StringDecoder('utf-8')
  let buffer = ''
  req.on('data', data => {
    buffer += decoder.write(data)
  })
  req.on('end', () => {
    buffer += decoder.end()

    //select handler
    const selectedHandler = typeof (router[trimmedPath]) !== 'undefined' ? router[trimmedPath] : handlers.notFound

    //construct data object
    const data = {
      'trimmedPath': trimmedPath,
      'queryStringObject': queryStringObject,
      'method': method,
      'headers': headers,
      'payload': buffer
    }

    //route the request to specific handler in router
    selectedHandler(data, (statusCode, payload) => {
      // use status code called by handler OR default 200
      statusCode = typeof (statusCode) === 'number' ? statusCode : 200

      // use payload called by handler OR default {}
      payload = typeof (payload) === 'object' ? payload : {}

      //convert payload to string
      const playloadString = JSON.stringify(payload)
    })
    res.setHeader('Content-Type', 'application/json')
    res.writeHead(statusCode)
    res.end(playloadString)
  })
}

//Handlers
const handlers = {}

//sample
handlers.sample = (data, cb) => {
  //callback a http status code, and playload object
  cb(333, { 'name': 'sample handler' })
}

//not found
handlers.notFound = (data, cb) => {
  cb(404)
}

//Router
const router = {
  'sample': handlers.sample
}
