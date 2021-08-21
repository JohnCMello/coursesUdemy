'use strict'

import React, { Component } from 'react'
import Square from './square'
import Alert from './alert'
import Button from './button'
import LikeButton from './likeButton'
import Searchbutton from './searchButton'

class App extends Component {
  render() {
    return (
      <div className='container' onClick={() => Alert('div')}>
        <Square />
        <Button handleClick={Alert}> Click Me! </Button>
        <LikeButton />
        <Searchbutton />
      </div>
    )
  }
}

// App.defaultProps= { }

export default App
