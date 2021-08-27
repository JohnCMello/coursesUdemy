'use strict'

import React, { Component } from 'react'

class App extends Component {
  constructor() {
    super()
    this.state = {}
  }

  render() {
    return (
      <div className='app'>

        <div className='search'>
          <input type='search' placeholder='Type user name' />
        </div>

        <div className='user-info'>
          <img src='https://avatars.githubusercontent.com/u/65418937?v=4' />
          <h1>
            <a href='http://api.github.com/users/JohnCMello'>John Mello</a>
          </h1>

          <ul className='repos-info'>
            <li> Repos </li>
            <li> Folowers </li>
            <li> Following </li>
          </ul>

          <div className-='actions'>
            <button>Go to Repos</button>
            <button>Go to Stared Repos</button>
          </div>

          <div className='repos'>
            <h2>Repositories</h2>
            <ul>
              <li><a href="#">REPO NAME</a></li>
            </ul>
          </div>

          <div className='starred'>
            <h2>Starred Repositories</h2>
            <ul>
              <li><a href="#">REPO NAME</a></li>
            </ul>
          </div>

        </div>

      </div>
    )
  }
}

export default App
