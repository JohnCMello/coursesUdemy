'use strict'

import React, { Component } from 'react'
import Button from './button'
import Timer from './timer'

class App extends Component {
  constructor() {
    console.log('constructor')
    super()
    this.state = {
      showTimer: true
    }
  }

  //deprecated
  // componentWillMount() {
  //   console.log('componentWillMount')
  // }

  // componentDidMount() {
  //   console.log('componentDidMount')
  // }

  render() {
    console.log('inside render')

    return (
      <div>

        {this.state.showTimer && <Timer />}
        <Button
          handleClick={() => {
            this.setState({
              showTimer: !this.state.showTimer
            })
          }}
        >
          Show / Hide Time
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