const h1 = React.createElement('h1', null, React.createElement(
  'span',
  null,
  '<h1> standalone element created outside reactroot'
))

const chainingElements = React.createElement('div', null, [
  React.createElement(
    'div',
    null,
    `This is a div inside reactroot`
  ),
  React.createElement(
    'span',
    null,
    React.createElement(
      'i',
      null,
      '<i> nested in <span> nested in reactroot '
    )
  ),
  React.createElement(
    'button',
    null,
    'button inside reactroot'
  ),
  h1
])

ReactDOM.render(chainingElements, document.getElementById('app'))