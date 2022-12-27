import React, { require } from 'react'
import img from '../images/profile3.jpg'

const Info = () => {

    const img = require('../images/profile3.jpg');



    return (
        <div className="info-container">
            <img className="profile-img"src={img}></img>
            <div className='info'>
                <h2>Lee Jones</h2>
                <h4 className='h4-tag'>Retired Professional Rugby Player | Learning to Code</h4>
            </div>
            <div className='button-div'>
                <a href="mailto:ljones2806@gmail.com"><button className='email-button'>E-mail</button></a>
                <a href="https://www.linkedin.com/in/lee-jones-6175854a/"><button className='li-button'>LinkedIn</button></a>
            </div>
        </div>
    );
}

export default Info;