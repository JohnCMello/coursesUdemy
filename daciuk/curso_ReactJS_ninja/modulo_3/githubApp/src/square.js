'use strict'

import React from 'react'

const Square = ({ color }) => {
  return (
    <div style={{
      backgroundColor: color,
      height: '200px',
      width: '200px'
    }}
    />
  )
}

Square.defaultProps = {
  color: 'orange'
}

export default Square
