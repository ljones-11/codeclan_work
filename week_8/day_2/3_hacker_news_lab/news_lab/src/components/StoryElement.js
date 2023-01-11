import React from 'react'

const StoryElement = ({title, url}) => {

    if (url) {
        return (
            
            <li className='list-item'><a href={url}>{title}</a></li>
        )
    } else {
        return null
    }
        
}

export default StoryElement;
