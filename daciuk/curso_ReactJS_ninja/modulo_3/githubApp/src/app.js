'use strict'

import React, { Component } from 'react'
import AppContent from './components/app-content'
import ajax from '@fdaciuk/ajax'


class App extends Component {
  constructor() {
    super()
    this.state = {
      userInfo: null,
      repos: [],
      starred: []
    }
  }

  handleSearch(e) {
    const value = e.target.value
    const key = e.which || e.keyCode
    const ENTER = 13

    console.log(key)

    if (key === ENTER) {
      ajax()
        .get(`http://api.github.com/users/${value}`)
        .then(({ name, avatar_url, login, public_repos, followers, following }) => {
          this.setState({
            userInfo: {
              username: name,
              photo: avatar_url,
              login,
              repos: public_repos,
              followers,
              following
            }
          })
        })
    }
  }

  getRepos(repoType) {
    return () => {
      ajax()
        .get(`http://api.github.com/users/${this.state.userInfo.login}/${repoType}`)
        .then((repos) => {
          // if empty array throws exception !!TODO: fix this shit!
          this.setState({
            [repoType]: repos.map(({ name, id, html_url }) => ({
              name,
              id,
              url: html_url
            }))
          })
          console.log(this.state)
        })
    }
  }

  render() {
    return (
      <AppContent
        userInfo={this.state.userInfo}
        repos={this.state.repos}
        starred={this.state.starred}
        handleSearch={(e) => this.handleSearch(e)}
        getRepos={this.getRepos('repos')}
        getStarredRepos={this.getRepos('starred')}
      />
    )
  }
}

export default App
