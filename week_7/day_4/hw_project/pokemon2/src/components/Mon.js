import React from 'react'

const Mon = ({name, number}) => {

const capitalisedName = name.charAt(0).toUpperCase() + name.slice(1);
    

    return (
        <div className='pokemon-namenum'>
            <h1>{capitalisedName}</h1>
            <h1> #{number}</h1>
        </div>
    )
}

export default Mon;