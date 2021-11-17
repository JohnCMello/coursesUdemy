exports.handleGet = (req, res) => {
  res.render('index')
}

exports.handlePost = (req, res) => {
  res.send(`post handled`)
}