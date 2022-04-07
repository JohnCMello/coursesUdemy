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

// NOT USING STORE
//                      $counter.innerText = +$counter.innerText + 1
const increment = () => store.dispatch({ type: 'INCREMENT' });
//                      $counter.innerText = +$counter.innerText - 1
const decrement = () => store.dispatch({ type: 'DECREMENT' });

const $counter = document.querySelector('[data-js="counter"]');
const $decrement = document.querySelector('[data-js="decrement"]');
const $increment = document.querySelector('[data-js="increment"]');

$decrement.addEventListener('click', decrement, false);
$increment.addEventListener('click', increment, false);


store.subscribe(() => {
  $counter.innerText = store.getState()
  console.log('store.dispatch was called, an action happened - STATE:', store.getState())
})



// console.log('store.getState', store.getState())
// store.dispatch({ type: 'INCREMENT' })
// console.log('store.getState', store.getState())
// store.dispatch({ type: 'DECREMENT' })
// store.dispatch({ type: 'DECREMENT' })
// store.dispatch({ type: 'DECREMENT' })
// store.dispatch({ type: 'DECREMENT' })
// console.log('store.getState', store.getState())
// store.dispatch({ type: 'INCREMENT' })

