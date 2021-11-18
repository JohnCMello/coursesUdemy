exports.myMiddleware = (req, res, next) => {
  res.locals.localVariable = 'testing local variable'
  next()
}