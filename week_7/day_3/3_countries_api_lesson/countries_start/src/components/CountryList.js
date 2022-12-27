import React from 'react';
import ListItem from './ListItem';
import './App.css';

const CountryList = ({countries, onCountryClicked}) => {

    const countryItems = countries.map((country, index) => {
      return <ListItem country={country} key={index} onCountryClicked={on} />
    })

  return (
    <div>
    <ul className='ul'>
      {countryItems}
    </ul>
  </div>
  )
}

export default CountryList;