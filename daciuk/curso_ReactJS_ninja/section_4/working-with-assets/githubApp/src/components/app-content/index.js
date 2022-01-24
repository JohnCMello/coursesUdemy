'use strict'

import React, { PropTypes } from 'react'
import Actions from '../actions'
import Repos from '../repos'
import Search from '../search'
import UserInfo from '../user-info'

import styles from './app.css'

const AppContent = ({
  userInfo,
  repos,
  starred,
  isFetching,
  handleSearch,
  getRepos,
  getStarredRepos
}) => (
  <div className={styles.app}>
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

    <div className={styles.reposContainer}>

      {!!repos.length &&
        <Repos
          className={styles.repos}
          title='Repositories'
          repos={repos}
        />
      }

      {!!starred.length &&
        <Repos
          className={styles.starred}
          title='Starred Repositories'
          repos={starred}
        />
      }
    </div>
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
