' use strict'

import { expect } from 'chai'
import findI from '../find/findImperative'
import findF from '../find/findFunctional'

//Imperative
it('findI should be a function', () => {
  expect(findI).to.be.a('function')
})

it('findI([1,2,3], (item) => item === 1) should return 1', () => {
  expect(findI([1, 2, 3], (item) => item === 1)).to.be.equal(1)
})

it('findI([1,2,3], (item) => item === 3) should return 3', () => {
  expect(findI([1, 2, 3], (item) => item === 3)).to.be.equal(3)
})

it('findI([1, 2, 3, 4], (item, index) => index === 2) should return 3', () => {
  expect(findI([1, 2, 3, 4], (item, index) => index === 2)).to.be.equal(3)
})

it('findI([1, 2, 3, 4], (item, index, arr) => arr[index] === 3) should return 3', () => {
  expect(findI([1, 2, 3, 4], (item, index, arr) => arr[index] === 3)).to.be.equal(3)
})

it('findI([], (item) => item) should return undefined', () => {
  expect(findI([], (item) => item)).to.be.equal(undefined)
})

//Recursive
it('findF should be a function', () => {
  expect(findF).to.be.a('function')
})

it('findF([1,2,3], (item) => item === 1) should return 1', () => {
  expect(findF([1, 2, 3], (item) => item === 1)).to.be.equal(1)
})

it('findF([1,2,3], (item) => item === 3) should return 3', () => {
  expect(findF([1, 2, 3], (item) => item === 3)).to.be.equal(3)
})

it('findF([1, 2, 3, 4], (item, index) => index === 2) should return 3', () => {
  expect(findF([1, 2, 3, 4], (item, index) => index === 2)).to.be.equal(3)
})

it('findF([1, 2, 3, 4], (item, index, arr) => arr[index] === 3) should return 3', () => {
  expect(findF([1, 2, 3, 4], (item, index, arr) => arr[index] === 3)).to.be.equal(3)
})

it('findF([], (item) => item) should return undefined', () => {
  expect(findF([], (item) => item)).to.be.equal(undefined)
})