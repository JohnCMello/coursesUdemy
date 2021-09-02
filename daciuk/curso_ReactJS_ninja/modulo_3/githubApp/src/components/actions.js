'use strict'

import React from 'react'

const Actions = ({ getRepos, getStarredRepos }) => (
  <div className='actions'>
    <button onClick={getRepos}>Show Repos</button>
    <button onClick={getStarredRepos}>Show Starred Repos</button>
  </div>
)

export default Actions
