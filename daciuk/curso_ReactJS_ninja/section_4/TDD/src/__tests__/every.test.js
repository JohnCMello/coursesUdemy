'use strict'

import { expect } from 'chai'
import everyI from '../every/everyImperative'
import everyF from '../every/everyFunctional'


//Imperative
it('everyI should be a func', () => {
  expect(everyI).to.be.a('function')
})

it('everyI([], (item) => item) should return true', () => {
  expect(everyI([], (item) => item)).to.be.ok
})

it('everyI([0,2,3], (item) => item should return false', () => {
  expect(everyI([0, 2, 3], (item) => item)).to.not.be.ok
})

it('everyI([1,2,3], (item) => item) should return true', () => {
  expect(everyI([1, 2, 3], (item) => item)).to.be.ok
})

it('everyI([1,2,3], (item, index) => index === item - 1) should return true', () => {
  expect(everyI([1, 2, 3], (item, index) => index === item - 1)).to.be.ok
})

it('everyI([1,2,3], (item, index, arr) => arr.length === 3) should return true', () => {
  expect(everyI([1, 2, 3], (item, index, arr) => arr.length === 3)).to.be.ok
})


//Recursive
it('everyF should be a func', () => {
  expect(everyF).to.be.a('function')
})

it('everyF([], (item) => item) should return true', () => {
  expect(everyF([], (item) => item)).to.be.ok
})

it('everyF([0,2,3], (item) => item should return false', () => {
  expect(everyF([0, 2, 3], (item) => item)).to.not.be.ok
})

it('everyF([1,2,3], (item) => item) should return true', () => {
  expect(everyF([1, 2, 3], (item) => item)).to.be.ok
})

it('everyF([1,2,3], (item, index) => index === item - 1) should return true', () => {
  expect(everyF([1, 2, 3], (item, index) => index === item - 1)).to.be.ok
})

it('everyF([1,2,3], (item, index, arr) => arr.length === 3) should return true', () => {
  expect(everyF([1, 2, 3], (item, index, arr) => arr.length === 3)).to.be.ok
})

