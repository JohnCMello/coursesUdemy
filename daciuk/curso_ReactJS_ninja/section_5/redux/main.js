'use strict'

const counter = (state = 0, action) => {
  switch (action.type) {
    case 'INCREMENT': return state + 1;
    case 'DECREMENT': return state - 1;
    default: return state;
  }
}

const { createStore } = Redux;
const store = createStore(counter);

console.log('store.getState', store.getState())
store.subscribe(() => {
  console.log('store.dispatch was called, an action happened - STATE:', store.getState())
})
store.dispatch({ type: 'INCREMENT' })
console.log('store.getState', store.getState())
store.dispatch({ type: 'DECREMENT' })
store.dispatch({ type: 'DECREMENT' })
store.dispatch({ type: 'DECREMENT' })
store.dispatch({ type: 'DECREMENT' })
console.log('store.getState', store.getState())
store.dispatch({ type: 'INCREMENT' })