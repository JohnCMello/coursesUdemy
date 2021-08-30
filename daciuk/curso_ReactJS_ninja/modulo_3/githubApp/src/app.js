'use strict'

import React, { Component } from 'react'
import AppContent from './components/app-content'

class App extends Component {
  constructor() {
    super()
    this.state = {
      userInfo: {
        username: 'John Mello',
        photo: 'https://avatars.githubusercontent.com/u/65418937?v=4',
        login: 'johncmello',
        repos: 10,
        followers: 20,
        following: 30
      },
      repos: [{
        name: 'Repositories',
        url: 'http://test1.com'
      }],
      starredRepos: [{
        name: 'Starred Repositories',
        url: 'http://test2.com'
      }]
    }
  }

  render() {
    return (
      <AppContent
        userInfo={this.state.userInfo}
        repos={this.state.repos}
        starredRepos={this.state.starredRepos}
      />
    )
  }
}

export default App
