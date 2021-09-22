'use strict'

import React, { PropTypes } from 'react'
import Actions from '../actions'
import Repos from '../repos'
import Search from '../search'
import UserInfo from '../user-info'

import './app-content.css'

const AppContent = ({
  userInfo,
  repos,
  starred,
  isFetching,
  handleSearch,
  getRepos,
  getStarredRepos
}) => (
  <div className='app'>
    <Search
      handleSearch={handleSearch}
      isSearchDisabled={isFetching}
    />

    {isFetching && <div>Loading...</div>}

    {!!userInfo && (isFetching ||
      <UserInfo
        userInfo={userInfo}
      />)
    }

    {!!userInfo && (isFetching ||
      <Actions
        getRepos={getRepos}
        getStarredRepos={getStarredRepos}
      />)
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
  repos: PropTypes.array.isRequired,
  starred: PropTypes.array.isRequired,
  isFetching: PropTypes.bool.isRequired,
  handleSearch: PropTypes.func.isRequired,
  getRepos: PropTypes.func.isRequired,
  getStarredRepos: PropTypes.func.isRequired,
}

export default AppContent
