'use strict'

import { expect } from 'chai'
import reduceI from '../reduce/reduceImperative'
import reduceF from '../reduce/reduceFunctional'


//Imperative
it('reduceI should be a function', () => {
  expect(reduceI).to.be.a('function')
})

it('reduceI([1, 3, 5], (acc,item) => acc + item) should return 9', () => {
  expect(reduceI([1, 3, 5], (acc, item) => acc + item)).to.be.equal(9)
})

it('reduceI([1, 3, 5], (acc,item) => acc + item, 4) should return 13', () => {
  expect(reduceI([1, 3, 5], (acc, item) => acc + item, 4)).to.be.equal(13)
})

it('reduceI([2, 4, 6], (acc,item) => acc + item) should return 12', () => {
  expect(reduceI([2, 4, 6], (acc, item) => acc + item)).to.be.equal(12)
})

it('reduceI([2, 4, 6], (acc,item) => acc + item, 3) should return 15', () => {
  expect(reduceI([2, 4, 6], (acc, item) => acc + item, 3)).to.be.equal(15)
})

it('reduceI([2, 4, 6], (acc,item) => acc + index) should return 3', () => {
  expect(reduceI([2, 4, 6], (acc, item, index) => acc + index)).to.be.equal(3)
})

it('reduceI([2, 4, 6], (acc,item) => acc + index, 5) should return 8', () => {
  expect(reduceI([2, 4, 6], (acc, item, index) => acc + index, 5)).to.be.equal(8)
})

it(
  'reduceI([2, 4, 6], (acc, item, index) => { acc["number-"+ item] = item}, {}) should return {"number-2":2,"number-4":4, "number-6":6} ', () => {
    expect(reduceI(
      [2, 4, 6],
      (acc, item,) => {
        acc["number-" + item] = item
        return acc
      }, {})).to.be.deep.equal(
        {
          'number-2': 2,
          'number-4': 4,
          'number-6': 6
        }
      )
  }
)

it('reduceI([2, 4, 6], (acc,item, index, arr) => acc + arr[index],0) should return 12', () => {
  expect(reduceI([2, 4, 6], (acc, item, index, arr) => acc + arr[index], 0)).to.be.equal(12)
})


//Recursive
it('reduceF should be a function', () => {
  expect(reduceF).to.be.a('function')
})

it('reduceF([1, 3, 5], (acc,item) => acc + item) should return 9', () => {
  expect(reduceF([1, 3, 5], (acc, item) => acc + item)).to.be.equal(9)
})

it('reduceF([1, 3, 5], (acc,item) => acc + item, 4) should return 13', () => {
  expect(reduceF([1, 3, 5], (acc, item) => acc + item, 4)).to.be.equal(13)
})

it('reduceF([2, 4, 6], (acc,item) => acc + item) should return 12', () => {
  expect(reduceF([2, 4, 6], (acc, item) => acc + item)).to.be.equal(12)
})

it('reduceF([2, 4, 6], (acc,item) => acc + item, 3) should return 15', () => {
  expect(reduceF([2, 4, 6], (acc, item) => acc + item, 3)).to.be.equal(15)
})

it('reduceF([2, 4, 6], (acc,item) => acc + index) should return 3', () => {
  expect(reduceF([2, 4, 6], (acc, item, index) => acc + index)).to.be.equal(3)
})

it('reduceF([2, 4, 6], (acc,item) => acc + index, 5) should return 8', () => {
  expect(reduceF([2, 4, 6], (acc, item, index) => acc + index, 5)).to.be.equal(8)
})

it(
  'reduceF([2, 4, 6], (acc, item, index) => { acc["number-"+ item] = item}, {}) should return {"number-2":2,"number-4":4, "number-6":6} ', () => {
    expect(reduceF(
      [2, 4, 6],
      (acc, item,) => {
        acc["number-" + item] = item
        return acc
      }, {})).to.be.deep.equal(
        {
          'number-2': 2,
          'number-4': 4,
          'number-6': 6
        }
      )
  }
)

it('reduceF([2, 4, 6], (acc,item, index, arr) => acc + arr[index],0) should return 12', () => {
  expect(reduceF([2, 4, 6], (acc, item, index, arr) => acc + arr[index], 0)).to.be.equal(12)
})
