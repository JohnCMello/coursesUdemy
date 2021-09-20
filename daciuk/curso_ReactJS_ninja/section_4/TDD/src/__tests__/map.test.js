'use strict'

import { expect } from 'chai'
import mapI from '../map/mapImperative'
import mapF from '../map/mapFunctional'

//Imperative
it('mapI shopuld be a function', () => {
  expect(mapI).to.be.a('function')
})

it('mapI([1,2] should return [1,2]', () => {
  expect(mapI([1, 2], (item) => item)).to.be.deep.equal([1, 2])
})

it('mapI([3,4] should return [3,4]', () => {
  expect(mapI([3, 4], (item) => item)).to.be.deep.equal([3, 4])
})

it('mapI([1,2], (item) => item + 1) should return [2,3]', () => {
  expect(mapI([1, 2], (item) => item + 1)).to.be.deep.equal([2, 3])
})

it('mapI([4,6], (item) => item + 1) should return [5,7]', () => {
  expect(mapI([4, 6], (item) => item + 1)).to.be.deep.equal([5, 7])
})

it('mapI([1,2], (item, index) => index) should return [0,1]', () => {
  expect(mapI([1, 2], (item, index) => index)).to.be.deep.equal([0, 1])
})

it('mapI([3,5], (item, index, arr) => arr) should return [[3, 5], [3, 5]]', () => {
  expect(mapI([3, 5], (item, index, arr) => arr)).to.be.deep.equal([[3, 5], [3, 5]])
})

it('mapI() should return []', () => {
  expect(mapI()).to.be.deep.equal([])
})

it('mapI([1,2]) should return [1,2]', () => {
  expect(mapI([1, 2])).to.be.deep.equal([1, 2])
})

it('map(1) should throw a TypeError', () => {
  let error

  try {
    map(1)
  } catch (e) {
    error = e
  }
  expect(error.name).to.be.equal('TypeError')
})

//Recursive
it('mapF shopuld be a function', () => {
  expect(mapF).to.be.a('function')
})

it('mapF([1,2] should return [1,2]', () => {
  expect(mapF([1, 2], (item) => item)).to.be.deep.equal([1, 2])
})

it('mapF([3,4] should return [3,4]', () => {
  expect(mapF([3, 4], (item) => item)).to.be.deep.equal([3, 4])
})

it('mapF([1,2], (item) => item + 1) should return [2,3]', () => {
  expect(mapF([1, 2], (item) => item + 1)).to.be.deep.equal([2, 3])
})

it('mapF([4,6], (item) => item + 1) should return [5,7]', () => {
  expect(mapF([4, 6], (item) => item + 1)).to.be.deep.equal([5, 7])
})

it('mapF([1,2], (item, index) => index) should return [0,1]', () => {
  expect(mapF([1, 2], (item, index) => index)).to.be.deep.equal([0, 1])
})

it('mapF([3,5], (item, index, arr) => arr) should return [[3, 5], [3, 5]/', () => {
  expect(mapF([3, 5], (item, index, arr) => arr)).to.be.deep.equal([[3, 5], [3, 5]])
})

it('mapF() should return []', () => {
  expect(mapF()).to.be.deep.equal([])
})

it('mapF([1,2]) should return [1,2]', () => {
  expect(mapF([1, 2])).to.be.deep.equal([1, 2])
})