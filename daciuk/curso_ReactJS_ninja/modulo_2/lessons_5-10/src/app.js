'use strict'

import { createClass, createElement } from 'react'

const Title = createClass({
  render: function () {
    return createElement('h1', null, 'Titulo')
  }
})

export default Title