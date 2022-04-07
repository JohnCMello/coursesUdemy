const express = require('express')
const route = express.Router()

// controllers
const homeController = require('./src/controllers/homeController')
const logInController = require('./src/controllers/logInController')

// ==Routes==

// Home
route.get('/', homeController.index)

// Login
route.get('/login/', logInController.index)
route.post('/login/register', logInController.register)
route.post('/login/login', logInController.login)

module.exports = route