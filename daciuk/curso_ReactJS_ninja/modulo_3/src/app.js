'use strict'

import React, { Component } from 'react'
import Square from './square'
import Button from './button'

class App extends Component {
  constructor() {
    super()
    this.state = {
      color: 'blue'
    }
  }

  render() {
    return (
      <div>
        <Square color={this.state.color}/>

        {['red', 'green', 'blue', 'orange', 'pink'].map(color=> (
          <Button
            key={color}
            handleClick={()=> this.setState({color})}
          > 
            {color} 
          </Button>

        ))}
      </div>
    )
  }
}

// App.defaultProps= { }

export default App
