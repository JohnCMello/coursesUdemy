'use strict'

import React from 'react'

const UserInfo = () => (
  <div className='user-info'>
    <img src='https://avatars.githubusercontent.com/u/65418937?v=4' />

    <h1 className='username'>
      <a href='http://api.github.com/users/JohnCMello'>John Mello</a>
    </h1>

    <ul className='repos-info'>
      <li> Repos </li>
      <li> Folowers </li>
      <li> Following </li>
    </ul>
  </div>
)

export default UserInfo