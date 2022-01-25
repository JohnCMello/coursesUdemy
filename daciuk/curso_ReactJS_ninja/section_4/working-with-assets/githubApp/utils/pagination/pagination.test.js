'use strict'

import { expect } from 'chai'
import pagination from './index'

test('pagination should be a function', () => {
  expect(pagination).to.be.a('function')
})

test('pagination({total:1, activePage: 1}) should return [1]', () => {
  const before = {
    total: 1,
    activePage: 1
  }
  const after = [1]
  expect(pagination(before)).to.be.deep.equal(after)
})

test('pagination({total:2, activePage: 1}) should return [1, 2]', () => {
  const before = {
    total: 2,
    activePage: 1
  }
  const after = [1, 2]
  expect(pagination(before)).to.be.deep.equal(after)
})

test('pagination({total:5, activePage: 1}) should return [1, 2, 3, 4, 5]', () => {
  const before = {
    total: 5,
    activePage: 1
  }
  const after = [1, 2, 3, 4, 5]
  expect(pagination(before)).to.be.deep.equal(after)
})

test('pagination({total:6, activePage: 1}) should return [1, 2, 3, ..., 6]', () => {
  const before = {
    total: 6,
    activePage: 1
  }
  const after = [1, 2, 3, '...', 6]
  expect(pagination(before)).to.be.deep.equal(after)
})

test('pagination({total:6, activePage: 2}) should return [1, 2, 3, ..., 6]', () => {
  const before = {
    total: 6,
    activePage: 2
  }
  const after = [1, 2, 3, '...', 6]
  expect(pagination(before)).to.be.deep.equal(after)
})

test('pagination({total:6, activePage: 3}) should return [1, 2, 3, 4, 5, 6]', () => {
  const before = {
    total: 6,
    activePage: 3
  }
  const after = [1, 2, 3, 4, 5, 6]
  expect(pagination(before)).to.be.deep.equal(after)
})

test('pagination({total:6, activePage: 4}) should return [1, 2, 3, 4, 5, 6]', () => {
  const before = {
    total: 6,
    activePage: 4
  }
  const after = [1, 2, 3, 4, 5, 6]
  expect(pagination(before)).to.be.deep.equal(after)
})

test('pagination({total:6, activePage: 5}) should return [1,..., 4, 5, 6]', () => {
  const before = {
    total: 6,
    activePage: 5
  }
  const after = [1, '...', 4, 5, 6]
  expect(pagination(before)).to.be.deep.equal(after)
})

test('pagination({total:6, activePage: 6}) should return [1,..., 4, 5, 6]', () => {
  const before = {
    total: 6,
    activePage: 6
  }
  const after = [1, '...', 4, 5, 6]
  expect(pagination(before)).to.be.deep.equal(after)
})

test('pagination({total:7, activePage: 1}) should return [1,2,3,..., 7]', () => {
  const before = {
    total: 7,
    activePage: 1
  }
  const after = [1, 2, 3, '...', 7]
  expect(pagination(before)).to.be.deep.equal(after)
})

test('pagination({total:7, activePage: 2}) should return [1,2,3,..., 7]', () => {
  const before = {
    total: 7,
    activePage: 2
  }
  const after = [1, 2, 3, '...', 7]
  expect(pagination(before)).to.be.deep.equal(after)
})

test('pagination({total:7, activePage: 3}) should return [1,2,3,4,..., 7]', () => {
  const before = {
    total: 7,
    activePage: 3
  }
  const after = [1, 2, 3, 4, '...', 7]
  expect(pagination(before)).to.be.deep.equal(after)
})

test('pagination({total:7, activePage: 4}) should return [1,2,3,4,5,6,7]', () => {
  const before = {
    total: 7,
    activePage: 4
  }
  const after = [1, 2, 3, 4, 5, 6, 7]
  expect(pagination(before)).to.be.deep.equal(after)
})

test('pagination({total:7, activePage: 5}) should return [1,...,4,5,6,7]', () => {
  const before = {
    total: 7,
    activePage: 5
  }
  const after = [1, '...', 4, 5, 6, 7]
  expect(pagination(before)).to.be.deep.equal(after)
})

test('pagination({total:7, activePage: 6}) should return [1,...,5,6,7]', () => {
  const before = {
    total: 7,
    activePage: 6
  }
  const after = [1, '...', 5, 6, 7]
  expect(pagination(before)).to.be.deep.equal(after)
})

test('pagination({total:7, activePage: 7}) should return [1,...,5,6,7]', () => {
  const before = {
    total: 7,
    activePage: 7
  }
  const after = [1, '...', 5, 6, 7]
  expect(pagination(before)).to.be.deep.equal(after)
})

test('pagination({total:15, activePage: 7}) should return [1,...,7,8,9,...,15]', () => {
  const before = {
    total: 15,
    activePage: 8
  }
  const after = [1, '...', 7, 8, 9, '...', 15]
  expect(pagination(before)).to.be.deep.equal(after)
})