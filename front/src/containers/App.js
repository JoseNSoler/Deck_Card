import React, { Component } from 'react'
import Result from '../components/Result'

class App extends Component {// component stateful
  render() {
    return (
      <div className='main center-block container-fluid'>
        <h3>Generar carta al azar</h3>
        <Result />
      </div>
    )
  }
}

export default App


