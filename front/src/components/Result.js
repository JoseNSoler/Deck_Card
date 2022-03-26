import React, { useState } from 'react'
import { connect, useDispatch, useSelector } from 'react-redux';
import { random } from '../slice/cardSlice'
import { fetchRandom } from '../actions'


const Result = (props) => {

  const [state, setState] = useState();

  const onClicker = (e) => {
    console.log(props)
    e.preventDefault();
    props.dispatch(fetchRandom(setState));
  };

  // <span>{props.data.image}</span>
  
  return (<div className='containerCard'>
     <button
     className='btn btn-primary btn-lg'
      aria-label="Increment value"
      onClick={(e) => onClicker(e)}
     >
       RANDOM
     </button>
     

       <img src={props.data.image}/> 
     
  </div>
  );
}


const stateMapToPros = state => {
  return {
    data: state.random.result
  }
}


export default connect(stateMapToPros)(Result)

