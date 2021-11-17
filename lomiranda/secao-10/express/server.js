const express = require('express')
const app = express()

app.use(
  express.urlencoded(
    { extended: true }
  )
)

app.get('/', (req, res) => {
  res.send(`
    <form action='/' method='POST'>
      <label for='name'>
      Form <input type='text' id='name' name='nome'/>
      </label>
      <button>Send Form</button> 
    </form>
  `)
})

app.post('/', (req, res) => {
  console.log(req.body)
  res.send(`form sent with this info ${req.body.nome}`)
})

app.get('/about', (req, res) => {
  res.send('this page is about me.')
})

app.listen(4200, () => {
  console.log(`Server Running on 'http://localhost:4200'`)
})