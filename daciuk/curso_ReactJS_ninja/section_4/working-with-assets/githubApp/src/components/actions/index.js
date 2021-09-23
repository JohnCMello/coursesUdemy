'use strict'

import React, { PropTypes } from 'react'
import './actions.css'

const Actions = ({ getRepos, getStarredRepos }) => (
  <div className='actions'>
    <button onClick={getRepos}>Show Repos</button>
    <button onClick={getStarredRepos}>Show Starred Repos</button>
  </div>
)

Actions.propTypes = {
  getRepos: PropTypes.func.isRequired,
  getStarredRepos: PropTypes.func.isRequired
}

export default Actions
