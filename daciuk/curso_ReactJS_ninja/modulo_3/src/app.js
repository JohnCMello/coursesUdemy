'use strict'

import React, { Component } from 'react'

class App extends Component {
  constructor() {
    super()

    this.state = {
      checked: false,
      showContent: false
    }
  }

  render() {
    return (
      <div>
        <label>
          <input
            type='checkbox'
            checked={this.state.checked}
            onChange={() => {
              this.setState({
                checked: !this.state.checked
                // checked: e.target.checked
              }, () => {
                this.setState({
                  showContent: this.state.checked
                })
                console.log(this.state.checked)
              })
            }}
          /> Show content
        </label>
        {this.state.showContent && <div>I'm here!</div>}

      </div>
    )
  }
}

export default App
