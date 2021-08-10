module.exports = class Dog {
  constuctor(name, breed) {
    this.name = name
    this.breed = breed
  }

  bark() {
    console.log(`${this.name} is barking! Auf,Auf!`)
  }
}

