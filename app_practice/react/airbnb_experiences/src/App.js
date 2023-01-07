import React, {require} from 'react'
import './App.css';
import Navbar from './components/Navbar';
import Hero from './components/Hero';
import Card from './components/Card';
import data from './data.js';


function App() {

    const cards = data.map((item) => {
      return (
        <Card
            key={item.id}
            {...item}
        />
      )
    })
  
  return (
    <div>
      <head><link rel="preconnect" href="https://fonts.googleapis.com" />
      <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin />
      <link href="https://fonts.googleapis.com/css2?family=Poppins&display=swap" rel="stylesheet" /></head>

      <Navbar />
      <Hero />
        <section className='cards-list'>
            {cards}
        </section>         
    </div>
  );
}

export default App;
