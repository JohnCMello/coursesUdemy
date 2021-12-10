const LogIn = require('../models/LogInModel')

exports.index = (req, res) => {
  res.render('login')
}

exports.register = async (req, res) => {
  try {
    const login = new LogIn(req.body)
    await login.register()
    if (login.errors.length > 0) {
      req.flash('errors', login.errors)
      req.session.save(() => {
        res.redirect('back')
        return
      })
      return
    }
    req.flash('success', "User successfully created.")
    req.session.save(() => res.redirect('back'))
  } catch (e) {
    console.log(e)
    return res.render('404')
  }
}

exports.login = async (req, res) => {
  try {
    const login = new LogIn(req.body)
    await login.login()
    if (login.errors.length > 0) {
      req.flash('errors', login.errors)
      req.session.save(() => {
        res.redirect('back')
        return
      })
      return
    }
    req.flash('success', "You are logged in.")
    req.session.user = login.user
    req.session.save(function () {
      res.redirect('back')
    })
  } catch (e) {
    console.log(e)
    return res.render('404')
  }
}