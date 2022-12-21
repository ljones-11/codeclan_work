import React from 'react';

const Film = ({film}) => {
    return (
        <>
            <li>
                <a href={film.url}><p>{film.name}</p></a>
            </li>
        </>
    )
}

export default Film;