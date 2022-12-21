import React from 'react';
import Film from '../components/Film'

const FilmList = ({films}) => {
    const filmNodes = films.map((film) => {
        return (
            <Film film={film}>
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