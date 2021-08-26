'use strict'

import React, { Component } from 'react'

class App extends Component {
  constructor() {
    super()

    this.state = {
      value: 'type here'
    }
  }

  render() {
    return (
      <div>
        <form>
          {/* <textarea defaultValue='type here' /> */}
          <textarea
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
