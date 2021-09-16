'use strict'

import reduce from './../reduce/reduceImperative'
import reverse from './../reverse/reverseImperative'

const reduceRight = (arr, ...params) => reduce(reverse(arr), ...params)

export default reduceRight