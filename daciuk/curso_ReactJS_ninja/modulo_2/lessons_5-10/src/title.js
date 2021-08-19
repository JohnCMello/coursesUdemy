'use strict'

import React from 'react'

const Title = ({ name }) => <h1>{`Hello ${name}!`}</h1>

// const Title = React.createClass({
//   getDefaultProps: function () {
//     return {
//       defaultNumber: 6,
//       defaultArray: [4, 5, 6],
//       defaultObject: {
//         person: 'Zacarias'
//       }
//     }
//   },
//   render: function () {
//     return (
//       <div>
//         <h1> Hello {this.props.name}  </h1>
//         <h2> This is a Number via props: {this.props.number}  </h2>
//         <h2> This is an Array via props: {this.props.array} </h2>
//         <h2> This is an Object via props: {this.props.object.person} </h2>

//         <h1>getDefaultProps</h1>
//         <h2> This is a Number via defaultProps: {this.props.defaultNumber}  </h2>
//         <h2> This is an Array via defaultProps: {this.props.defaultArray} </h2>
//         <h2> This is an Object via defaultProps: {this.props.defaultObject.person} </h2>
//       </div>
//     )
//   }
// })

export default Title
