
export const fetchRandom = (state) => (dispatch) => {

    return fetch(`http://localhost:8080/cards/random`, {
        method: 'GET', // *GET, POST, PUT, DELETE, etc.
        headers: {
            'Content-Type': 'application/json'
        } // body data type must match "Content-Type" header
    }).then(response => response.json())
      .then(json => {
          dispatch({ type: "Random", data: json });
        })
}

export const onlyNumbers = (state) => (dispatch) => {
    return fetch(`http://localhost:8080/cards/onlyNumbers`, {
        method: 'GET', // *GET, POST, PUT, DELETE, etc.
        headers: {
            'Content-Type': 'application/json'
        } // body data type must match "Content-Type" header
    }).then(response => response.json())
      .then(json => {
          dispatch({ type: "Numbers", data: json });
        })
}


export const onlySuit = (state, change, numero) => (dispatch) => {

    console.log(numero)
    
    return fetch(`http://localhost:8080/cards/suit/${encodeURIComponent(change["value"])}`, {
        method: 'GET', // *GET, POST, PUT, DELETE, etc.
        headers: {
            'Content-Type': 'application/json'
        } // body data type must match "Content-Type" header
    }).then(response => response.json())
      .then(json => {
          dispatch({ type: "Suit", data: json });
        })
        
}


export const suitAndNumber = (state, numero, listChecked) => (dispatch) => {

    
    var bool = (numero !== false)
    console.log(listChecked)
    
    return fetch(`http://localhost:8080/cards/querySuitNumber/?suit=${encodeURIComponent(listChecked["value"])}&number=${encodeURIComponent( bool)}`, {
        method: 'GET', // *GET, POST, PUT, DELETE, etc.
        headers: {
            'Content-Type': 'application/json'
        } // body data type must match "Content-Type" header
    }).then(response => response.json())
      .then(json => {
          dispatch({ type: "SuitNumber", data: json });
        })
        
        
}




