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


const rootReducer = combineReducers({
    random
})

export default rootReducer