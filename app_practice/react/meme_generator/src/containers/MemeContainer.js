import React, { useState, useEffect } from 'react'

const Meme = () => {

    // const [newMeme,setNewMeme] = useState('')
    const [meme, setMeme] = useState({
        topText: "",
        bottomText: "",
        randomImage: "http://i.imgflip.com/1bij.jpg"
    })

    const [allMemeImages, setAllMemeImages] = useState([])

    useEffect(() => {
        fetch("https://api.imgflip.com/get_memes")
        .then(res => res.json()
        .then(meme => setAllMemeImages(meme.data.memes)));
    }, [])


    function getMemeImage()  {

        const randomNum = Math.floor(Math.random() * allMemeImages.length)
        const url = allMemeImages[randomNum].url
        setMeme(prevMeme => ({
            ...prevMeme,
            randomImage: url,
            // topText:"",
            // bottomText:""

        }))
        
    }

    const handleChange = (event) => {
        const {name, value} = event.target
        setMeme(prevMeme => ({
            
            ...prevMeme,
                [name] : value
        }))
    }

    return (

        <main className='meme-container'>

            <div className='input-div'>
                <input name="topText" type='text' placeholder='Top text' className='input-text' onChange={handleChange} value={meme.topText}></input>
                <input name="bottomText" type='text' placeholder='Bottom text' className='input-text' onChange={handleChange} value={meme.bottomText}></input>
            </div>
            <div className='button-div'>
                <button onClick={getMemeImage} className='button'>Get new image</button>
            </div>
            <div className='meme-div'>
                <img src={meme.randomImage} className='meme--img'/>
                <h2 className='meme--text top'>{meme.topText}</h2>
                <h2 className='meme--text bottom'>{meme.bottomText}</h2>
            </div>
            
            
        </main>
    )
}


export default Meme;