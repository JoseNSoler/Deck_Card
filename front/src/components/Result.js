import React, { useState } from 'react'
import { connect, useDispatch, useSelector } from 'react-redux';
import { random } from '../slice/cardSlice'
import { fetchRandom, onlyNumbers, onlyNumbers2 } from '../actions'
import List from 'react-list-select'
import Select from 'react-select'
import makeAnimated from 'react-select/animated';






const Result = (props) => {

  const [state, setState] = useState();

  const [btnCheck, setBtnCheck] = useState(false)
  
  const [checked, setChecked] = useState(['numeros']);

  let itemsSuit = ['DIAMONDS', 'SPADES', 'HEARTS', 'CLUBS'];


  const optionsSuit = [
    { value: 'DIAMONDS', label: 'Diamonds' },
    { value: 'SPADES', label: 'Spades' },
    { value: 'HEARTS', label: 'Hearts' },
    { value: 'CLUBS', label: 'Clubs' }
  ]
  const animatedComponents = makeAnimated();

  const [ suit, setSuit ] = useState()


  const Lists = () => {
    return (
      <div>
        <Select 
        closeMenuOnSelect={false}
        components={animatedComponents}
        defaultValue={[optionsSuit[0], optionsSuit[1]]}
        isMulti
        options={optionsSuit}/>
      </div>
    );
  }


  const onClicker = (e) => {
    e.preventDefault();
    props.dispatch(fetchRandom(setState));
  };


  const onSubmit = (e) => {
  
    e.preventDefault();

    console.log(props)

    if(!checked.includes("numeros")) props.dispatch(onlyNumbers2(setState, )) ;
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
      <form onSubmit={onSubmit} className="forms">
        <div>
          <a>
            Solo numeros
          </a>
          <input type='checkbox' checked={btnCheck} onChange={(e) => handleChange()} value='numeros' >

          </input>
        </div>
        <div className='listaSuit'>
        {Lists()}
        </div>
        

        <button type='submit' className='btn btn-primary btn-lg'
        aria-label="Increment value">
          CalcularNueva
        </button>
      </form>

      <div className='imagen'>
        <img src={props.data.image} />
      </div>
      

    </div>
  );
}


const stateMapToPros = state => {
  
 return { data: state.random.result}

  
}


export default connect(stateMapToPros)(Result)

