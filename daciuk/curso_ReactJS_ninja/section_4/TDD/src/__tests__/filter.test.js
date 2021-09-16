'use strict'

import { expect } from 'chai'
import filterI from '../filter/filterImperative'
import filterF from '../filter/filterFunctional'

//Imperative
it('filterI should be a function', () => {
  expect(filterI).to.be.a('function')
})

it('filterI([1,2,3], (item) => item) should return [1,2,3]', () => {
  expect(filterI([1, 2, 3], (item) => item)).to.be.deep.equal([1, 2, 3])
})

it('filterI([0,1,2,3], (item) => item) should return [1,2,3]', () => {
  expect(filterI([0, 1, 2, 3], (item) => item)).to.be.deep.equal([1, 2, 3])
})

it('filterI([1,2,3], (item) => item < 2) should return [1]', () => {
  expect(filterI([1, 2, 3], (item) => item < 2)).to.be.deep.equal([1])
})

it('filterI([1,2,3,6], (item, index) item === index + 1) should return [1,2,3]', () => {
  expect(filterI([1, 2, 3, 6], (item, index) => item === index + 1)).to.be.deep.equal([1, 2, 3])
})

it('filterI([1, 2, 3, 6, 3, 2, 5, 7, 9, 4, 2], (item, index, array) => index === array.indexOf(item)) should return [1,2,3]', () => {
  expect(filterI([1, 2, 3, 6, 3, 2, 5, 7, 9, 4, 2], (item, index, array) => index === array.indexOf(item))).to.be.deep.equal([1, 2, 3, 6, 5, 7, 9, 4])
})

//Recursive

it('filterF should be a function', () => {
  expect(filterF).to.be.a('function')
})

it('filterF([1,2,3], (item) => item) should return [1,2,3]', () => {
  expect(filterF([1, 2, 3], (item) => item)).to.be.deep.equal([1, 2, 3])
})

it('filterF([0,1,2,3], (item) => item) should return [1,2,3]', () => {
  expect(filterF([0, 1, 2, 3], (item) => item)).to.be.deep.equal([1, 2, 3])
})

it('filterF([1,2,3], (item) => item < 2) should return [1]', () => {
  expect(filterF([1, 2, 3], (item) => item < 2)).to.be.deep.equal([1])
})

it('filterF([1,2,3,6], (item, index) item === index + 1) should return [1,2,3]', () => {
  expect(filterF([1, 2, 3, 6], (item, index) => item === index + 1)).to.be.deep.equal([1, 2, 3])
})

it('filterF([1, 2, 3, 6, 3, 2, 5, 7, 9, 4, 2], (item, index, array) => index === array.indexOf(item)) should return [1,2,3]', () => {
  expect(filterF([1, 2, 3, 6, 3, 2, 5, 7, 9, 4, 2], (item, index, array) => index === array.indexOf(item))).to.be.deep.equal([1, 2, 3, 6, 5, 7, 9, 4])
})