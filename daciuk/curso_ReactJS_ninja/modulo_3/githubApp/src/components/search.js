'use strict'

import React from 'react'
import ajax from '@fdaciuk/ajax'

const Search = () => (
  <div className='search'>
    <input
      type='search'
      placeholder='Type user name'
      onKeyUp={(e) => {
        const value = e.target.value
        const key = e.which || e.keyCode
        const ENTER = 13

        if (key === ENTER) {
          ajax().get(`http://api.github.com/users/${value}`)
            .then((result) => { console.log(result) })
        }
        console.log(key)
      }}
    />
  </div>
)

export default Search