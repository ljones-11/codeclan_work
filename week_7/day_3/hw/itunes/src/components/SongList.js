import React from 'react';
import Song from "../components/Song.js"

const SongList = ({songs}) => {

    const songList = songs.map((song, index) => {
        console.log(song)
        return <Song song={song} key={index} index={index} image={song['im:image'][0].label} audio={song.link[1].attributes.href} genre={song.category.attributes.term}/>
            
            
    })





    return (
        <div className='list-container'>
            <ul className='ul-song-list'>
                {songList}
            </ul>
        </div>
    )
}

export default SongList;