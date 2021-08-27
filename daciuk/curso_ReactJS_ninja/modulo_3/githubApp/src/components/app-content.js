'use strict'

import React from 'react'
import Actions from './actions'
import Repos from './repos'
import Search from './search'
import UserInfo from './user-info'


const AppContent = () => (
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

export default AppContent
