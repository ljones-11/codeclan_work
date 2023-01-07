import React, { require } from 'react'


const Header = () => {

    const logo = require('../jokeslogo.png')


    return (
        <div className='header'>
            <header className='header-logo'>
                <img src={logo} className='logo--img' />
                <h1 className='header-text'>Jokes</h1>
            </header>
        </div>
    )
}

export default Header;