import React from 'react';

const Song = ({song, index, image, audio}) => {


    return (
        <>
        <li><span>{index +1}: {song.title.label} <img src={image}></img></span>
        <audio controls>
            <source src={audio} type="audio/mpeg" />
            <source src={audio} type="audio/mpeg" />
            Your browser does not support the audio element.
        </audio>
        </li>

        </>
    )
}

export default Song;