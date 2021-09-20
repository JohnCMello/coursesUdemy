'use strict'

import { expect } from 'chai'
import reduceRightI from '../reduceRight/reduceRightImperative'
import reduceRightF from '../reduceRight/reduceRightFunctional'


//Imperative
it('reduceRightI should be a function', () => {
  expect(reduceRightI).to.be.a('function')
})

it('reduceRightI(["Mello", "John"], (acc, item) => acc + item) should return "John Mello"',
  () => {
    expect(reduceRightI(['Mello', 'John'], (acc, item) => acc + ' ' + item)).to.be.equal('John Mello')
  }
)

it('reduceRightI(["Mello", "John"], (acc, item) => acc + item, "My name is " ) should return "My name is John Mello"',
  () => {
    expect(reduceRightI(['Mello', 'John'], (acc, item) => acc + ' ' + item, 'My name is')).to.be.equal('My name is John Mello')
  }
)

//Recursive
it('reduceRightF should be a function', () => {
  expect(reduceRightF).to.be.a('function')
})

it('reduceRightF(["Mello", "John"], (acc, item) => acc + item) should return "John Mello"',
  () => {
    expect(reduceRightF(['Mello', 'John'], (acc, item) => acc + ' ' + item)).to.be.equal('John Mello')
  }
)

it('reduceRightF(["Mello", "John"], (acc, item) => acc + item, "My name is " ) should return "My name is John Mello"',
  () => {
    expect(reduceRightF(['Mello', 'John'], (acc, item) => acc + ' ' + item, 'My name is')).to.be.equal('My name is John Mello')
  }
)
