'use strict'

import React, { Component } from 'react'
import Square from './square'

class App extends Component {
  render() {
    return (
      <div>
        {['yellow', 'pink', 'gray', 'pink'].map((square, id) => (
          <Square key={id} color={square} />
        ))}
      </div>
    )
  }
}

// App.defaultProps= { }

export default App
