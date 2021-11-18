exports.handleGet = (req, res) => {
  res.render('index', {
    title: 'Some Title',
    numbers: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
  })
}

exports.handlePost = (req, res) => {
  res.send(req.body)
}