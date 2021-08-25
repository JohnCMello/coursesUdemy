'use strict'

import React, { Component } from 'react'

class App extends Component {
  constructor() {
    super()

    this.state = {
      value: 'initial value'
    }
  }
  render() {
    return (
      <div>
        <form >
          <input
            type="text"
            value={this.state.value}
            onChange={(e) => {
              this.setState({
                value: e.target.value
              })
            }}
          />
        </form>
      </div>
    )
  }
}

export default App
