import React from 'react';
import Film from '../components/Film'

const FilmList = ({films}) => {
    const filmNodes = films.map((film) => {
        return (
            <Film key={film.id} name={film.name} url={film.url}>
                    <span>{film.name}</span>
            </Film>
        )
    });


    return (
        <div>
            <div className='list-container'>
                <ul>
                        {filmNodes}
                </ul>
            </div>
            <hr></hr>
        </div>
    )
}

export default FilmList;