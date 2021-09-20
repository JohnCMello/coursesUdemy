'use strict'

const find = (arr, func) => {
  return (function findInternal(arrIternal, counter) {
    const [head, ...tail] = arrIternal

    return arrIternal.length === 0
      ? undefined
      : func(head, counter, arr)
        ? head
        : findInternal(tail, counter + 1)
  })(arr, 0)
}

export default find