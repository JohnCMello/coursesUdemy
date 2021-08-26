'use strict'

import React, { Component } from 'react'

class App extends Component {
  constructor() {
    super()

    this.state = {
      value: 'Initial Value',
      checked: false
    }
  }

  render() {
    return (
      <div>
        <form>
          <input
            type='text'
            // editable component / uncontrolled
            // defaultValue='initial value'
            value={this.state.value}
            onChange={(e) => {
              this.setState({
                value: e.target.value
              })
            }}
          />

          <label htmlFor="">
            <input
              type="checkbox"
              value='my-checkbox'
              // defaultChecked={false}
              checked={this.state.checked}
              onChange={(e) => {
                this.setState({ checked: e.target.checked })
                // this.setState({ checked: !this.state.checked })
              }}
            />
            Checkbox
          </label>

          <input type="radio" name="rd" id='rd1' value='1' defaultChecked />Radio 1
          <input type="radio" name="rd" id='rd2 ' value='2' />Radio 2
        </form>
      </div>
    )
  }
}

export default App
