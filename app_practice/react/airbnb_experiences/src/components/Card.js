import React, { require } from'react'

const Card = ({...item}) => {

    const card = require(`../airbnbcard.png`)
    const star = require('../airbnbstar.png')

    let badgeText
    if (item.openSpots === 0) {
        badgeText = "SOLD OUT"
    } else if (item.location === "Online") {
        badgeText = "ONLINE"
    } else {
        badgeText = null
    }

    return (

        <div className='card-container'> 
            {badgeText && <div className='card--badge'> {badgeText}</div>}
            <img className='card--img' src={ card } />
            <div className='rating-container'>
                <img className='star--img' src={ star } />
                <span>{ item.stats.rating }</span>
                <span className='grey'>({ item.stats.reviewCount }) •&nbsp; </span>
                <span className='grey'>{ item.location }</span>
            </div>
            <p className='card--title'> { item.title }</p>
            <p className='card--price'><b>from £{ item.price }</b> / person</p>
        </div>
    )
}

export default Card;