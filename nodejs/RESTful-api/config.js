const environments = {}

environments.staging = {
  'httpPort': 4200,
  'httpsPort': 4201,
  'envName': 'staging'
}

environments.production = {
  'httpPort': 5200,
  'httpsPort': 5201,
  'envName': 'production'
}

const currentEnvironment = typeof (process.env.NODE_ENV) === 'string'
  ? process.env.NODE_ENV.toLowerCase()
  : ''

const environmentToExport = typeof (environments[currentEnvironment]) === 'object'
  ? environments[currentEnvironment]
  : environments.staging

module.exports = environmentToExport