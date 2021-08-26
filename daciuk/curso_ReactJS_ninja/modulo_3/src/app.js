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

        <form
          onSubmit={(e) => {
            e.preventDefault()
            console.log('event', e)
          }}

          onChange={(e) => {
            console.log('name', e.target.name)
            console.log('value', e.target.value)
          }}
        >

          {/* 

          <textarea defaultValue='type here' /> 
          
          <textarea
            name='textarea'
            value={this.state.value}
            onChange={(e) => {
              this.setState({
                value: e.target.value
              })
            }}
          />
          
          */}

          <input type="name" name='input-1-name' />
          <input type="email" name='input-2-email' />

          <input
            type="checkbox"
            onClick={(e) => {
              console.log(e)
            }}
          />

          <button type='submit'> Send </button>

        </form>

      </div>
    )
  }
}

export default App
