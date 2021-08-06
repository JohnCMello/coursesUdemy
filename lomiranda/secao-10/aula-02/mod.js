module.exports = (x, y) => x * y

module.exports = class Cachorro {
  constuctor(name) {
    this.name = name
  }

  latir() {
    console.log('Au,Au!')
  }
}