import React, { require } from 'react'

const Hero = () => {

    const hero = require('../airbnb.png')
    
    return (

        <div className='hero-div'>
            <hero>
                <img className='hero--img' src={hero} />
                <h1 className='hero-header'>Online Experiences</h1>
                <p className='header-p'>Join unique interactive activities led by one-of-a-kind hosts, all without leaving home.</p>
            </hero>
        </div>

    )
}

export default Hero;