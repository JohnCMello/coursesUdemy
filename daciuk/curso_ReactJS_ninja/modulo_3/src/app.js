'use strict'

import React, { Component } from 'react'

class App extends Component {
  constructor() {
    super()
    this.state = {
      text: 'Hello State'
    }
  }
  
  render() {
    return (
      <div 
        className='container'  
        onClick={() => this.setState({
          text: 'Hello setState'
        })}
      >
        {this.state.text}
      </div>
    )
  }
}

// App.defaultProps= { }

export default App
