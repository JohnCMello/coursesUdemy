'use strict'

import React, { PropTypes } from 'react'
import Actions from './actions'
import Repos from './repos'
import Search from './search'
import UserInfo from './user-info'


const AppContent = ({ userInfo, repos, starredRepos }) => (
  <div className='app'>
    <Search />

    {!!userInfo &&
      <UserInfo
        userInfo={userInfo}
      />
    }

    {!!userInfo &&
      <Actions />
    }

    {!!repos.length &&
      <Repos
        className='repos'
        title='Repositories'
        repos={repos}
      />
    }

    {!!starredRepos.length &&
      <Repos
        className='starred'
        title='Starred Repositories'
        repos={starredRepos}
      />
    }
  </div >
)

AppContent.propTypes = {
  userinfo: PropTypes.object,
  repos: PropTypes.array.isRequired,
  starredRepos: PropTypes.array.isRequired
}

export default AppContent
