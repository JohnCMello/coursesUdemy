'use strict'

import React, { Component } from 'react'
import Button from './button'
import Timer from './timer'

class App extends Component {
  constructor() {
    console.log('constructor')
    super()
    this.state = {
      time: 0,
      showTimer: true
    }
  }

  //deprecated - use componentDidMount
  componentWillMount() {
    console.log('componentWillMount')
  }

  componentDidMount() {
    console.log('componentDidMount')
  }

  render() {
    console.log('inside render')

    return (
      <div>

        <Timer time={this.state.time} />
        <Button
          handleClick={() => {
            this.setState({ time: this.state.time + 1 })
          }}
        >
          Change Props
        </Button>

      </div>
    )
  }
}

// App.defaultProps= { }

export default App

{
  /* 
  <Square color={this.state.color} />
    {['red', 'green', 'blue', 'orange', 'pink'].map(color => (
      <Button
        key={color}
        handleClick={() => this.setState({ color })}
    >
      {color}
    </Button>
  ))} 
  */
}