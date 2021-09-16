'use strict'

import { expect } from "chai"
import reverse from './reverseImperative'

it('reverse should be a function', () => {
  expect(reverse).to.be.a('function')
})

it('reverse([2], (item) => item) should return [2]', () => {
  expect(reverse([2]), (item) => item).to.be.deep.equal([2])
})

it('reverse([2,1], (item) => item) should return [1,2]', () => {
  expect(reverse([2, 1]), (item) => item).to.be.deep.equal([1, 2])
})
