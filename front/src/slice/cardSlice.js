import { createSlice } from '@reduxjs/toolkit'

export const cardSlice = createSlice({
    name: 'random',
    initialState: {
        value: {},
    },
    reducers: {
        random: (state) => {
            return fetch(`http://localhost:8080/cards/random`, {
                method: 'POST', // *GET, POST, PUT, DELETE, etc.
                headers: {
                    'Content-Type': 'application/json'
                },
                body: JSON.stringify({list: state})
            }).then(response => response.json())
              .then(json => {
                  state.valueImg = json;
              })
        }
    }
})

export const { random } = cardSlice.actions

export default cardSlice.reducer