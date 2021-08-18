'use strict'

import React from 'react'
import Title from './title'

const App = React.createClass({
  render: function () {
    return (
      <div className='container'>
        <Title name='John' number={0} array={[1, 2, 3]} object={{ person: 'Mussum' }} />
      </div>
    )
  }

})

export default App
