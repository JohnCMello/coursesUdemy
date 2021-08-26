'use strict'

import React, { Component } from 'react'

class App extends Component {
  constructor() {
    super()

    this.state = {
      value: '3'
    }
  }

  render() {
    return (
      <div>
        <form>
          <select
            // multiple value={['1', '3']}
            value={this.state.value}
            onChange={(e) => {
              this.setState({
                value: e.target.value
              })
            }}
          >
            <option value="1">option 1</option>
            <option value="2">option 2</option>
            <option value="3">option 3</option>
          </select>
        </form>
      </div>
    )
  }
}

export default App
