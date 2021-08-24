'use strict'

import React, { Component } from 'react'

class Timer extends Component {
  constructor() {
    console.log('constructor timer')
    super()

    this.state = {
      time: 0
    }

    this.timer
  }

  //mount / unmount
  componentDidMount() {
    console.log('componentDidMount timer')
    this.timer = setInterval(() => this.setState({ time: this.state.time + 1 }), 1000)
  }

  componentWillUnmount() {
    console.log('componentWillMount timer')
    clearInterval(this.timer)
  }

  //update
  //deprecated - use getDerivedStateFromProps
  componentWillReceiveProps(nextProps) {
    console.log('componentWillReceiveProps timer', this.props, nextProps)
  }

  shouldComponentUpdate(nextProps, nextState) {
    console.log('shouldComponentUpdate timer', this.props, nextProps)
    return this.state.time !== nextState.time
  }

  componentWillUpdate(nextProps, nextState) {
    console.log('componentWillUpdate timer', this.props, nextProps)

  }

  render() {
    return (
      <div> Timer: {this.props.time} </div>
    )
  }
}

export default Timer
