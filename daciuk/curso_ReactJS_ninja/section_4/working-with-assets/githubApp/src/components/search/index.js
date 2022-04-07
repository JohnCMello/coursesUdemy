'use strict'

import React, { PropTypes } from 'react'
import styles from './search.css'

const Search = ({ handleSearch, isSearchDisabled }) => (
  <div className={styles.search}>
    <input
      type='search'
      placeholder='Type user name'
      onKeyUp={handleSearch}
      disabled={isSearchDisabled}
    />
  </div>
)

Search.propTypes = {
  handleSearch: PropTypes.func.isRequired,
  isSearchDisabled: PropTypes.bool.isRequired
}

export default Search
