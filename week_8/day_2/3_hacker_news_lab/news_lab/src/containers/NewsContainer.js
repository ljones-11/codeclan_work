import React, { useEffect, useState } from 'react'
import StoryElement from '../components/StoryElement';
import SearchBar from '../components/SearchBar';

const NewsContainer = () => {

    const [ news, setNews ] = useState([]);
    const [ allNews, setAllNews ] = useState([]);
    

    useEffect( () => {

        fetch('https://hacker-news.firebaseio.com/v0/topstories.json')
        .then(res => res.json())
        .then( storyIds => {

        const storyPromises = storyIds.slice(0,20).map((storyId) => {
            return fetch(`https://hacker-news.firebaseio.com/v0/item/${storyId}.json`)
                    .then(res => res.json());
        });

        Promise.all(storyPromises)
            .then(storyData => {
                setNews( storyData )
                setAllNews( storyData )
            })
            
            });
    }, [])


    const storyDetail = news.map((story) => {
        return <StoryElement title = {story.title} key= {story.id} url={story.url} author={story.by} />

    
});

    const filteredArticles = (searchTerm) => {
    const searchResults = allNews.filter((article)=>{
            return article.title.toLowerCase().includes(searchTerm.toLowerCase()) 
            || article.by.toLowerCase().includes(searchTerm.toLowerCase())
            
    })

    setNews(searchResults);
    }




    return (
        <main>
            <SearchBar filteredArticles = {filteredArticles} />
            <div className='news-div'>
                <ul className='news-ul'>
                    {storyDetail}
                </ul>
            </div>
        </main>
    )
}

export default NewsContainer;
