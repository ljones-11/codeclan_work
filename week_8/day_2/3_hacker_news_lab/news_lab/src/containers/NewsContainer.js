import React, { useEffect, useState } from 'react'
import StoryElement from '../components/StoryElement';
import SearchBar from '../components/SearchBar';

const NewsContainer = () => {

    const [ news, setNews ] = useState([]);
    const [ allNews, setAllNews ] = useState([]);
    

    useEffect( () => {

        fetch('https://hacker-news.firebaseio.com/v0/topstories.json')
        .then(res => res.json())
        .then( data => {

        const storyPromises = data.slice(0,20).map((storyId) => {
            return fetch(`https://hacker-news.firebaseio.com/v0/item/${storyId}.json`).then(res => res.json());
        });

        Promise.all(storyPromises)
            .then(data => {
                setNews( data )
                setAllNews( data )
            })
            
            });
    }, [])


    const storyDetail = news.map((story) => {
        return <StoryElement title = {story.title} key= {story.id} url={story.url} />

    
});

 const filteredArticles = (searchTerm) => {
    const searchResults = allNews.filter((article)=>{
            return article.title.includes(searchTerm)
    })

    setNews(searchResults);
 }




    return (
        <div>
            <SearchBar filteredArticles = {filteredArticles} />
            <ul>
                {storyDetail}
            </ul>
        </div>
    )
}

export default NewsContainer;
