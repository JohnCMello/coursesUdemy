'use strict'

const webpack = require('webpack')
const WebpackDevServer = require('webpack-dev-server')
const config = require('./webpack.config')

new WebpackDevServer(webpack(config), {
  publicPath: config.output.publicPath,
  hot: true,
  historyApiFallback: true,
  stats: { colors: true }
}).listen(9000, (err) => {
  if (err) return console.log(err, "erro")
  console.log('Server is up. localhost:9000')
})
