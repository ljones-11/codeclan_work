import React from 'react';

const Film = ({name, url}) => {
    return (
        <>
            <li>
                <a href={url}><p>{name}</p></a>
            </li>
        </>
    )
}

export default Film;