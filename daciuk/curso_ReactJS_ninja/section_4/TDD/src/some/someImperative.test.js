'use strict'

import { expect } from "chai"
import some from './someImperative'

it('some should be a func', () => {
  expect(some).to.be.a('function')
})

it('some([], (item) => item) should return false', () => {
  expect(some([], (item) => item)).to.not.be.ok
})

it('some([0,2,3], (item) => item should return true', () => {
  expect(some([0, 2, 3], (item) => item)).to.be.ok
})

it('some([1,2,3], (item) => item) should return true', () => {
  expect(some([1, 2, 3], (item) => item)).to.be.ok
})

it('some([1,3,5], (item) => item % 2 === 0) should return false', () => {
  expect(some([1, 3, 5], (item) => item % 2 === 0)).to.not.be.ok
})

it('some([1,2,3], (item, index) => index % 2=== 0) should return true', () => {
  expect(some([1, 2, 3], (item, index) => index % 2 === 0)).to.be.ok
})

it('some([1,2,3], (item, index, arr) => arr.length === 3) should return true', () => {
  expect(some([1, 2, 3], (item, index, arr) => arr.length === 3)).to.be.ok
})