'use strict'

import { createElement } from 'react'
import { render } from 'react-dom'
import Title from './app'

render(
  createElement(Title),
  document.querySelector('[data-js="app"]')
)