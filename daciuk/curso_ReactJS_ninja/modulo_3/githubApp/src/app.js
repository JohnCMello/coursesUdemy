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

  getGitHubApiUrl(username, type) {
    const _user = username ? `/${username}` : ''
    const _type = type ? `/${type}` : ''
    return `http://api.github.com/users${_user}${_type}`
  }

  handleSearch(e) {
    const value = e.target.value
    const key = e.which || e.keyCode
    const ENTER = 13

    console.log(key)

    if (key === ENTER) {
      ajax()
        .get(this.getGitHubApiUrl(value))
        .then(({ name, avatar_url, login, public_repos, followers, following }) => {
          this.setState({
            userInfo: {
              username: name,
              photo: avatar_url,
              login,
              repos: public_repos,
              followers,
              following
            },
            repos: [],
            starred: []
          })
        })
    }
  }

  getRepos(repoType) {
    return (e) => {
      const username = this.state.userInfo.login
      ajax()
        .get(this.getGitHubApiUrl(username, repoType))
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
