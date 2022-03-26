import React, { Component } from 'react'
import Result from '../components/Result'
import { Container, Row, Col } from 'react-bootstrap';

class App extends Component {// component stateful
  render() {
    return (
        <div className='main center-block container-fluid'>
        <h3 className='title'>Generar carta al azar</h3>
          <Result />
        </div>
    )
  }
}

export default App


