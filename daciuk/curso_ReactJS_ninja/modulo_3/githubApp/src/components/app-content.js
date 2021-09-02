'use strict'

import React, { PropTypes } from 'react'
import Actions from './actions'
import Repos from './repos'
import Search from './search'
import UserInfo from './user-info'

const AppContent = ({ userInfo, repos, starred, handleSearch, getRepos, getStarredRepos }) => (
  <div className='app'>
    <Search handleSearch={handleSearch} />

    {!!userInfo &&
      <UserInfo
        userInfo={userInfo}
      />
    }

    {!!userInfo &&
      <Actions
        getRepos={getRepos}
        getStarredRepos={getStarredRepos}
      />
    }

    {!!repos.length &&
      <Repos
        className='repos'
        title='Repositories'
        repos={repos}
      />
    }

    {!!starred.length &&
      <Repos
        className='starred'
        title='Starred Repositories'
        repos={starred}
      />
    }
  </div >
)

AppContent.propTypes = {
  userinfo: PropTypes.object,
  repos: PropTypes.array,
  starred: PropTypes.array,
  handleSearch: PropTypes.func,
  getRepos: PropTypes.func,
  getStarredRepos: PropTypes.func
}

export default AppContent
