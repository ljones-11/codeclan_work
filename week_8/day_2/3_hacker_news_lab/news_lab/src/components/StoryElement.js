import React from 'react'

const StoryElement = ({title, url}) => {

    if (url) {
        return (
            
            <li><a href={url}>{title}</a></li>
        )
    } else {
        return null
    }
        
}

export default StoryElement;
