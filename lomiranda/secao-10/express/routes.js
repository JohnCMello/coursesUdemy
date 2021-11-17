const express = require('express')
const route = express.Router()

const homeController = require('./src/controllers/homeController')
const aboutController = require('./src/controllers/aboutController')


//home
route.get('/', homeController.handleGet)
route.post('/', homeController.handlePost)

// about
route.get('/about', aboutController.handleGet)

module.exports = route