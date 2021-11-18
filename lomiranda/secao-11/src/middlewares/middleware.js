exports.myMiddleware = (req, res, next) => {
  res.locals.localVariable = 'testing local variable'
  next()
}

exports.checkCSRFError = (err, req, res, next) => {
  if (err && err.code === 'EBADCSRFTOKEN') {
    return res.send()
  }
}