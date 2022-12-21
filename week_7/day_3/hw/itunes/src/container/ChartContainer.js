import React, { useState, useEffect } from 'react'
import SongList from '../components/SongList';

const ChartContainer = () => {
    const [songs, setSongs] = useState([]);

    useEffect(() => {
        getSongs();
    }, [])

    const getSongs = function(){
        fetch("https://itunes.apple.com/gb/rss/topsongs/limit=20/json")
        .then(res => res.json())
        .then(songs =>  setSongs(songs.feed.entry))
        
    }


    return (
        <div className='main-container'>
            <h1>Current UK Top 20</h1>
            <div class="hr"></div>
            <SongList songs={songs} />

        </div>
    )
}

export default ChartContainer;
