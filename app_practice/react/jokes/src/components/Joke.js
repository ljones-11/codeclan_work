import React, { useState } from 'react'

const Joke = ({setup, punchline, upvotes, downvotes}) => {

    const [showPunchline, setShowPunchline] = useState(false)


    const togglePunchline = () => {

        setShowPunchline((prevShowPunchline) => !prevShowPunchline)
        };

    

    return (
        <div className='joke-card'>
            <p className='joke-setup'>{setup}</p>
            {showPunchline && <p>{punchline}</p>}
            <button className="button"onClick={togglePunchline}>{showPunchline? "Hide" : `Reveal`}</button>
            {/* <span>&#11014;{upvotes} &#11015;{downvotes}</span> */}
        </div>
    );
}

export default Joke