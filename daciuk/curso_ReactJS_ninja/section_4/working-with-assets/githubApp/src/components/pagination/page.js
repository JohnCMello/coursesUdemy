'use strict'

import React from 'react'

const Dots = () => <span></span>

export default Page = ({ page, pageLink, onClick }) => {
  const Component = page === '...' ? <Dots /> : 'a'

  const handleClick = !onClick ? null : (e) => {
    e.preventDefault()
    onClick(page)
  }

  return (
    <Component
      href={pageLink}
      onClick={handleClick}
    >
      {page}
    </Component>
  )
}