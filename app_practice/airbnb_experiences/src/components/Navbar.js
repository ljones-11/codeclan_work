import React, { require } from 'react'

const Navbar = () => {

    const logo = require('../airbnblogo.png')

    return(
            <nav className='nav'>
                <img className='nav--logo' src={logo} />
            </nav>

    )

}

export default Navbar