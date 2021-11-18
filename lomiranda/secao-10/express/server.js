require('dotenv').config()

const express = require('express')
const app = express()
const mongoose = require('mongoose')

mongoose.connect(process.env.CONNECTIONSTRING)
  .then(() => {
    app.emit('ready')
  })
  .catch(err => console.log(err))

const session = require('express-session')
const connectMongo = require('connect-mongo')
const flash = require('connect-flash')

const routes = require('./routes')
const path = require('path')
const helmet = require('helmet')
const csrf = require('csurf')

const { myMiddleware } = require('./src/middlewares/middleware')
const MongoStore = require('connect-mongo')

app.use(helmet())

app.use(express.urlencoded({ extended: true }))

app.use(express.static(path.resolve(__dirname, 'public')))

const sessionOptions = session({
  secret: '.NfK2wR.+q:xuMA%#K+~;*u^gao>UW`~Bvf{f]}?h|V:K:Pz~^Z;?4Ow|+MTCpy',
  store: MongoStore.create({ mongoUrl: process.env.CONNECTIONSTRING }),
  resave: false,
  saveUninitialized: false,
  cookie: {
    maxAge: 1000 * 60 * 60 * 24 * 7,
    httpOnly: true
  }
})
app.use(sessionOptions)
app.use(flash())

app.set('views', path.resolve(__dirname, 'src', 'views'))
app.set('view engine', 'ejs')

app.use(csrf())

app.use(myMiddleware)

app.use(routes)

app.on('ready', () => {
  app.listen(4200, () => {
    console.log(`Server Running on 'http://localhost:4200'`)
  })
})