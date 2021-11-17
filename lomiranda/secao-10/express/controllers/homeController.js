exports.handleGet = (req, res) => {
  res.send(`
    <form action='/' method='POST'>
      <label for='name'>
      Form <input type='text' id='name' name='nome'/>
      </label>
      <button>Send Form</button> 
    </form>
  `)
}

exports.handlePost = (req, res) => {
  res.send(`post handled`)
}