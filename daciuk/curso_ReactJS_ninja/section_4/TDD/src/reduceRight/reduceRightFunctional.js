'use strict'

import reduce from '../reduce/reduceFunctional'
import reverse from '../reverse/reverseFunctional'

const reduceRight = (arr, ...params) => reduce(reverse(arr), ...params)

export default reduceRight