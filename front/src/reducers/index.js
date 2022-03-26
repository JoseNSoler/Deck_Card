//reducers
import { combineReducers } from 'redux'

const initialState = {
    value: {}
};


function random(state = {
    result: {}
}, action) {
    switch (action.type) {
        case "Random": {
            return { result: action.data }
        }
        default: return state
    }
}

function numbers(state = {
    result: {}
}, action) {
    switch (action.type) {
        case "Numbers": {
            return { result: action.data }
        }
        default: return state
    }
}


const rootReducer = combineReducers({
    random, numbers
})

export default rootReducer