import React from 'react';
import { Link } from 'react-router-dom'

const NavBar = () => {

        return(
                <div className='navbar-div'>
                    <h1>Router Practice</h1>
                    <ul className='navbar-list'>
                        <li>
                            <Link to="/" >Home</Link>
                        </li>
                        <li>
                            <Link to="/about" >About</Link>
                        </li>
                        <li>
                            <Link to="/pricing" >Pricing</Link>
                        </li>
                        <li>
                            <Link to="/contact" >Contact</Link>
                        </li>
                    </ul>
                </div>
        );
}

export default NavBar;