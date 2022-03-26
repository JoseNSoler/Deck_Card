import React, { useState } from 'react'
import { connect, useDispatch, useSelector } from 'react-redux';
import { random } from '../slice/cardSlice'
import { fetchRandom, onlyNumbers } from '../actions'


const Result = (props) => {

  const [state, setState] = useState();

  const [btnCheck, setBtnCheck] = useState(false)
  
  const [checked, setChecked] = useState(['numeros']);

  const onClicker = (e) => {
    e.preventDefault();
    props.dispatch(fetchRandom(setState));
  };


  const onSubmit = (e) => {
    e.preventDefault();

    console.log(props)

    if(!checked.includes("numeros")) props.dispatch(onlyNumbers(setState)) ;
    else props.dispatch(fetchRandom(setState)) 
  };

  const handleChange = () => {
    
    if(!checked.includes("numeros")) {
      setChecked(['numeros'])
      setBtnCheck(!checked);
    }
    else{ 
      console.log("sdasasd")
      setBtnCheck(checked)
      setChecked(checked.filter( item => item !== "numeros"))
    }

    console.log(checked)
  }

  // <span>{props.data.image}</span>

  return (
    <div className='containerCard'>
      <form onSubmit={onSubmit}>
        <div>
          <a>
            Solo numeros
          </a>
          <input type='checkbox' checked={btnCheck} onChange={(e) => handleChange()} value='numeros' >

          </input>
        </div>

        <button type='submit'>
          CalcularNueva
        </button>
      </form>
      <button
        className='btn btn-primary btn-lg'
        aria-label="Increment value"
        onClick={(e) => onClicker(e)}
      >
        RANDOM
      </button>

      <img src={props.data.image} />

    </div>
  );
}


const stateMapToPros = state => {
  
 return { data: state.random.result}

  
}


export default connect(stateMapToPros)(Result)

