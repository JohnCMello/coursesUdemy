'use strict'

import React, { Component } from 'react'
import Title from './title'

class App extends Component {
  render() {
    return (
      // this.props
      <div className='container'>
        <Title name='John' />
      </div>
    )
  }
}

// App.defaultProps= { }

export default App
