import React, { useState } from 'react'
import { connect, useDispatch, useSelector } from 'react-redux';
import { random } from '../slice/cardSlice'
import { fetchRandom, onlyNumbers } from '../actions'


const Result = (props) => {

  const [state, setState] = useState();
  const [checked, setChecked] = useState(false);

  const onClicker = (e) => {
    console.log(props)
    e.preventDefault();
    props.dispatch(fetchRandom(setState));
  };


  const onSubmit = (e) => {
    e.preventDefault();
    console.log(props)

    props.dispatch(onlyNumbers(setState));
  };

  const handleChange = () => {
    setChecked(!checked)
  }

  // <span>{props.data.image}</span>

  return (
    <div className='containerCard'>
      <form onSubmit={onSubmit}>
        <div>
          <a>
            Solo numeros
          </a>
          <input type='checkbox' checked={checked} onChange={handleChange} >

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
  return {
    data: state.random.result && state.numbers.result
  }
}


export default connect(stateMapToPros)(Result)

