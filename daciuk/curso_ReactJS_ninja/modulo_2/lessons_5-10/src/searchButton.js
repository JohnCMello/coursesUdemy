'use strict'

import React from 'react'
import Alert from './alert'
import Button from './button'

const SearchButton = () => (
  <Button handleClick={Alert}> Search</Button>
)

export default SearchButton
