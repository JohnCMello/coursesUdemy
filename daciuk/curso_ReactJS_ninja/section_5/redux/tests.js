//HOW TO TEST A REDUCER

/**
 * TEST EACH ACTION IN THE REDUCER
 */

console.assert(counter(0, { type: 'INCREMENT' }) === 1)

console.assert(counter(1, { type: 'INCREMENT' }) === 2)

console.assert(counter(2, { type: 'DECREMENT' }) === 1)

console.assert(counter(5, { type: 'DECREMENT' }) === 4)

/** 
 * TEST NONEXISTENT ACTION
 */

console.assert(counter(5, { type: 'ANYTHING' }) === 5)

/**
 *TEST FIRST ENTRY IN REDUCER - STATE = UNDEFINED
 */

console.assert(counter(undefined, {}) === 0)
