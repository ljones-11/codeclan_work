import React from 'react';

const Song = ({song, index, image, audio, genre}) => {


    return (
        <div>
            <div className='list-div'>
                <li className='song-li'><span><h2>#{index +1}</h2></span><span className='span'>{song.title.label}</span>
                <div className='img-div'>
                    <img className='song-detail' src={image}></img>
                 </div> 
                 <div className='audio-div'>
                <audio className='audio' controls>
                    <source src={audio} type="audio/mpeg" />
                    <source src={audio} type="audio/mpeg" />
                    Your browser does not support the audio element.
                </audio>
                </div>
            {/* <li>({genre})</li> */}
            </li>
            </div>
    </div>
    )
}

export default Song;