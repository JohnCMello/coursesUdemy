const nome = "John"
const sobrenome = "Mello"

const falaNome = () => {
  console.log(nome, sobrenome)
}
// option 1
module.exports.nome = nome
module.exports.sobrenome = sobrenome
module.exports.falaNome = falaNome
// option 2
module.exports = {
  nome,
  sobrenome,
  falaNome
}
// option 3
exports.nome = nome
exports.sobrenome = sobrenome
exports.falaNome = falaNome

console.log(module.exports)
//option 4
class Pessoa {
  constructor(nome, sobrenome) {
    this.nome = nome
    this.sobrenome = sobrenome
  }
}

exports.Pessoa = Pessoa

exports = {}
// changes the ref in memory, points to another obj

const _Pessoa = Pessoa
export { _Pessoa as Pessoa }
export { Pessoa }
// dont work if npm isn't initialized
