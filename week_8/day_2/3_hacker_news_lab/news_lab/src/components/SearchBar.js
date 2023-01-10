import React, { useState, useEffect } from 'react'

const SearchBar = ({filteredArticles}) => {

    const [ searchQuery, setSearchQuery ] = useState("");
    
    const handleChange = (event) => {
        setSearchQuery(event.target.value)

    }

    useEffect(()=> {
        filteredArticles(searchQuery)
    }, [searchQuery])


        return (

        <div>
            <input type='search' onChange={handleChange} value={searchQuery}></input>
        </div>
    )

}

export default SearchBar;