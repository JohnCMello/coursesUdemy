'use strict'

import { expect } from "chai"
import reduce from "./reduceImperative"

it('reduce should be a function', () => {
  expect(reduce).to.be.a('function')
})

it('reduce([1, 3, 5], (acc,item) => acc + item) should return 9', () => {
  expect(reduce([1, 3, 5], (acc, item) => acc + item)).to.be.equal(9)
})

it('reduce([1, 3, 5], (acc,item) => acc + item, 4) should return 13', () => {
  expect(reduce([1, 3, 5], (acc, item) => acc + item, 4)).to.be.equal(13)
})

it('reduce([2, 4, 6], (acc,item) => acc + item) should return 12', () => {
  expect(reduce([2, 4, 6], (acc, item) => acc + item)).to.be.equal(12)
})

it('reduce([2, 4, 6], (acc,item) => acc + item, 3) should return 15', () => {
  expect(reduce([2, 4, 6], (acc, item) => acc + item, 3)).to.be.equal(15)
})

it('reduce([2, 4, 6], (acc,item) => acc + index) should return 3', () => {
  expect(reduce([2, 4, 6], (acc, item, index) => acc + index)).to.be.equal(3)
})

it('reduce([2, 4, 6], (acc,item) => acc + index, 5) should return 8', () => {
  expect(reduce([2, 4, 6], (acc, item, index) => acc + index, 5)).to.be.equal(8)
})

it(
  'reduce([2, 4, 6], (acc, item, index) => { acc["number-"+ item] = item}, {}) should return {"number-2":2,"number-4":4, "number-6":6} ', () => {
    expect(reduce(
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

it('reduce([2, 4, 6], (acc,item, index, arr) => acc + arr[index],0) should return 12', () => {
  expect(reduce([2, 4, 6], (acc, item, index, arr) => acc + arr[index], 0)).to.be.equal(12)
})
