import React from 'react';
import Song from "../components/Song.js"

const SongList = ({songs}) => {

    const songList = songs.map((song, index) => {
        console.log(song)
        return <Song song={song} key={index} index={index} image={song['im:image'][0].label} audio={song.link[1].attributes.href}/>
            
            
    })





    return (
        <div>
            <ul>
                {songList}
            </ul>
        </div>
    )
}

export default SongList;