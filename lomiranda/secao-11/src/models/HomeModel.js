const mongoos = require('mongoose')

const HomeSchema = new mongoos.Schema({
  title: { type: String, required: true },
  description: String
})

const HomeModel = mongoos.model('Home', HomeSchema)

module.exports = HomeModel