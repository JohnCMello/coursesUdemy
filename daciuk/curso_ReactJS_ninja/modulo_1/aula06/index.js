const Title = React.createClass({
  render: () => <h1>Title Component</h1>
})

const NestedTitle = React.createClass({
  render: () => {
    return (
      <h2>
        <span>span nested in h2</span>
      </h2>
    )
  }
})

const Header = React.createClass({
  render: () => {
    return (
      <header>
        <Title />
        <NestedTitle />
      </header>
    )
  }
})

ReactDOM.render(
  <Header />,
  document.getElementById('app')
)