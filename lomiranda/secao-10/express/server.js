const path = require('path')
const express = require('express')
const app = express()

const routes = require('./routes')

app.use(express.urlencoded({ extended: true }))

app.use(express.static(path.resolve(__dirname, 'public')))

app.set('views', path.resolve(__dirname, 'src', 'views'))
app.set('view engine', 'ejs')

app.use(routes)

app.listen(4200, () => {
  console.log(`Server Running on 'http://localhost:4200'`)
})