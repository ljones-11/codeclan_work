import React, { useState, useEffect } from 'react'
import PokemonList from '../components/PokemonList'

const PokemonContainer = () => {
    const [pokemon, setPokemon] = useState([])

    useEffect(() => {
        getPokemon();
    }, [])

    const getPokemon = function(){
        fetch("https://pokeapi.co/api/v2/pokemon/?limit=151")
        .then(res => res.json())
        .then(pokemon => setPokemon(pokemon.results))
    }


    return (
        <div>
            <h1>Pokemon List</h1>
            <PokemonList pokemon={pokemon}/>
        </div>
    );
}

export default PokemonContainer;