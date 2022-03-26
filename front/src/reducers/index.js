//reducers
import { combineReducers } from 'redux'

const initialState = {
    result: {}
};


function random(state = initialState, action) {
    switch (action.type) {
        case "Random": {
            return { result: action.data }
        }
        case "Numbers": {
            return { result: action.data }
        }
        case "Suit": {
            return { result: action.data }
        }

        default: return state
    }
}



const rootReducer = combineReducers({
    random
})

export default rootReducer