'use strict'

import React, { Component } from 'react'
import Square from './square'
import Alert from './alert'

class App extends Component {
  render() {
    return (
      <div className='container' onClick={Alert}>
        <Square />
      </div >
    )
  }
}

// App.defaultProps= { }

export default App
