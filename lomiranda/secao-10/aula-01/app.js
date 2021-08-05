const mod01 = require('./mod01')
const nome = mod01.nome
const falaNome = mod01.falaNome()

const nome = require('./mod01').nome
const falaNome = require('./mod01').falaNome

const { nome, sobrenome, falaNome } = require('./mod01')

console.log(nome, sobrenome, falaNome())

import { Pessoa } from 'mod01'
// doesnt work if npm isn't initialized

const path = require('path')
const axios = require('axios')
const { Pessoa } = require('./mod01')

axios('https://www.otaviomiranda.com.br/files/json/pessoas.json')
  .then(res => console.log(res.data))
  .catch(err => console.log(err))

const pessoa1 = new Pessoa('John', 'Mello')
console.log(pessoa1)
