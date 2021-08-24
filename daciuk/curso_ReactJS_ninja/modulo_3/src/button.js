'use strict'

import React from 'react'

const Button = ({ children, handleClick }) => (
  <button
    className='main-button'
    onClick={(e) => {
      e.stopPropagation()
      handleClick(children)
    }}
  >
    {children}
  </button>
)

export default Button
