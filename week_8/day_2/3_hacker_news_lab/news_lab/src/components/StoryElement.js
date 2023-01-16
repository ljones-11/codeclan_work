import React from 'react'

const StoryElement = ({title, url, author}) => {

    if (url) {
        return (
            
            <li className='list-item'>
                    <a href={url}>
                        {title}
                    </a>
                <p className='author'>by:{author}</p>
            
            </li>
        )
    } else {
        return null
    }
        
}

export default StoryElement;
