const HomeModel = require('../models/HomeModel')

HomeModel.create({
  title: 'a random title',
  description: 'a test description'
})
  .then(data => console.log(data))
  .catch(err => console.log(err))

exports.handleGet = (req, res) => {
  res.render('index')
}

exports.handlePost = (req, res) => {
  res.send(req.body)
}