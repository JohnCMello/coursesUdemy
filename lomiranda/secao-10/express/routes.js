const express = require('express')
const route = express.Router()

const homeController = require('./controllers/homeController')
const aboutController = require('./controllers/aboutController')


//home
route.get('/', homeController.handleGet)
route.post('/', homeController.handlePost)

// about
route.get('/about', aboutController.handleGet)

module.exports = route