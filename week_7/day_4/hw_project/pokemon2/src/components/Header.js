import React, { require } from 'react'


const Header = () => {

    const logo1 = require('../images/pokedex_logo.png')
    const logo2 = require('../images/pokeball.png')


    return (
        <div className='header'>
            <header className='header-logo'>
                <img src={logo1} className='logo--img' />
                <img src={logo2} className='logo--img2' />
            </header>
        </div>
    )
}

export default Header;