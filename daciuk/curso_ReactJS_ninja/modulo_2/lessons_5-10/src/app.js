'use strict'

import React, { Component } from 'react'
import Square from './square'
import Alert from './alert'
import Button from './button'

class App extends Component {
  render() {
    return (
      <div className='container' onClick={Alert}>
        <Square />
        <Button> Click Me! </Button>
      </div>
    )
  }
}

// App.defaultProps= { }

export default App
