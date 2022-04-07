'use strict'

import React from 'react'
import pagination from '../../../utils/pagination'
import Page from './page'


export default Pagination = ({ total, activePage, pageLink, onClick }) => {
  <ul>
    {pagination({ total, activePage }).map((page, index) => {
      <li key={index}>
        <Page page={page} pageLink={pageLink.replace('%page%', page)} onClick={onClick}></Page>
      </li>
    })}
  </ul>
}

Pagination.defaultProps = {
  pageLink: ''
}

Pagination.propTypes = {
  total: PropTypes.number,
  activePage: PropTypes.number,
  pageLink: PropTypes.string,
  onClick: PropTypes.func
}