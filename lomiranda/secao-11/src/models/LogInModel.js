const mongoose = require('mongoose')
const validator = require('validator')
const bcryptjs = require('bcryptjs')

const LogInSchema = new mongoose.Schema({
  email: { type: String, required: true },
  password: { type: String, required: true }
})

const LogInModel = mongoose.model('LogIn', LogInSchema)

class LogIn {
  constructor(body) {
    this.body = body
    this.errors = []
    this.user = null
  }

  async login() {
    this.validate()
    if (this.errors.length > 0) return;
    this.user = await LogInModel.findOne({ email: this.body.email })
    if (!this.user) {
      this.errors.push('Check your email or password.')
      return
    }

    if (!bcryptjs.compareSync(this.bosy.password, this.user.password)) {
      this.errors.push('Invalid password')
      this.user = null
      return
    }
  }

  async register() {
    this.validate();
    if (this.errors.length > 0) return;
    await this.userExists();
    if (this.errors.length > 0) return;
    const salt = bcryptjs.genSaltSync();
    this.body.password = bcryptjs.hashSync(this.body.password, salt)
    this.user = await LogInModel.create(this.body)
  }

  async userExists() {
    this.user = await LogInModel.findOne({ email: this.body.email })
    if (this.user) this.errors.push('Email already in use.')
  }

  validate() {
    this.cleanUpData()

    if (!validator.isEmail(this.body.email))
      this.errors.push('Invalid email')

    if (this.body.password.length < 5)
      this.errors.push('Password must be at 5 least characters long')
  }

  cleanUpData() {
    for (const key in this.body) {
      if (typeof this.body[key] !== 'string') {
        this.body[key] = ''
      }
    }
    this.body = {
      email: this.body.email,
      password: this.body.password
    }
  }

}

module.exports = LogIn
