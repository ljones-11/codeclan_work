import React from 'react'
import Info from '../components/Info';
import Interests from '../components/Interests';
import About from '../components/About';
import Footer from '../components/Footer';

const CardContainer = () => {


    return (
            <div className='card-container'>
                <Info />
                <About />
                <Interests />
                <Footer />
            </div>
    )

}

export default CardContainer;