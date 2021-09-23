'use strict'

import React, { PropTypes } from 'react'
import './user-info.css'

const UserInfo = ({ userInfo }) => (
  <div className='user-info'>
    <img src={userInfo.photo} />

    <h1>
      <a href={`http://github.com/${userInfo.login}`}>
        {userInfo.username}
      </a>
    </h1>

    <ul className='repos-info'>
      <li> Repos <strong> {userInfo.repos} </strong> </li>
      <li> Folowers <strong> {userInfo.followers} </strong> </li>
      <li> Following <strong> {userInfo.following} </strong> </li>
    </ul>
  </div>
)

UserInfo.propTypes = {
  userInfo: PropTypes.shape({
    username: PropTypes.string.isRequired,
    photo: PropTypes.string.isRequired,
    login: PropTypes.string.isRequired,
    repos: PropTypes.number.isRequired,
    followers: PropTypes.number.isRequired,
    following: PropTypes.number.isRequired
  })
}
export default UserInfo
