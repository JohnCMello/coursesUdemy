const express = require('express')
const app = express()

const routes = require('./routes')

app.use(
  express.urlencoded(
    { extended: true }
  )
)

app.use(routes)

app.listen(4200, () => {
  console.log(`Server Running on 'http://localhost:4200'`)
})