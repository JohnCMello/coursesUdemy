'use strict'

import React from 'react'

const Title = React.createClass({
  getDefaultProps: function () {
    return {
      name: 'Mussum',
      catchPhrase: 'Cacilds'
    }
  },
  render: function () {
    return (
      <h1> Hello {this.props.name}. {this.props.catchPhrase}! </h1>
    )
  }
})

export default Title
