'use strict'

import React, { PropTypes } from 'react'

const Repos = ({ className, title, repos }) => (
  <div className={className}>
    <h2>{title}</h2>
    <ul>
      {repos.map((repo) => (
        <li key={repo.id}>
          <a href={repo.url}>{repo.name}</a>
        </li>
      ))}
    </ul>
  </div>
)

Repos.defaultProps = {
  className: ''
}

Repos.propTypes = {
  className: PropTypes.string.isRequired,
  title: PropTypes.string.isRequired,
  repos: PropTypes.array.isRequired,
}

export default Repos
