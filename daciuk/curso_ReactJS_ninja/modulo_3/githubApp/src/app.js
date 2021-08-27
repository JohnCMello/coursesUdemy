'use strict'

import React, { Component } from 'react'
import Actions from './components/actions'
import Repos from './components/repos'
import Search from './components/search'
import UserInfo from './components/user-info'

class App extends Component {
  constructor() {
    super()
    this.state = {}
  }

  render() {
    return (
      <div className='app'>
        <Search />

        <UserInfo />

        <Actions />

        <Repos
          className='repos'
          title='Repositories'
          repos={[{
            name: 'repo',
            link: '#',
            id: 'id-1'
          }]}
        />

        <Repos
          className='starred'
          title='Starred Repositories'
          repos={[{
            name: 'star-repo',
            link: '#',
            id: 'id-2'
          }]}
        />
      </div >
    )
  }
}

export default App
