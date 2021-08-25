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
    console.log('componentDidMount timer / this.state.time + 1')
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
    // console.log('shouldComponentUpdate timer', this.props, nextProps)
    return this.props.time !== nextProps.time
  }

  componentWillUpdate(nextProps, nextState) {
    console.log(
      'componentWillUpdate timer',
      'this.props', this.props,
      'this.state', this.state,
      'nextProps', nextProps,
      'nextState', nextState)

  }

  componentDidUpdate(prevProps, prevState) {
    console.log(
      'componentDidUpdate timer',
      'this.props', this.props,
      'this.state', this.state,
      'prevProps', prevProps,
      'prevState', prevState)
  }

  render() {
    return (
      <div> Timer: {this.props.time} </div>
    )
  }
}

export default Timer
