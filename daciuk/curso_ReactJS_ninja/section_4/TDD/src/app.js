'use strict'

import React, { Component } from 'react'

class App extends Component {
  constructor() {
    super()
    this.state = {
      name: 'John'
    }
  }

  render() {
    return (
      <div>Hello {this.state.name}</div>
    )
  }
}

export default App
