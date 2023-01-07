import React, {useState, useEffect} from 'react'
import Mon from './Mon'

const PokemonContainer = function() {

    const [pokemon, setPokemon] = useState([])

    useEffect (() => {
        getPokemon();
    }, [])


    const getPokemon = function(){
        fetch("https://pokeapi.co/api/v2/pokemon/?limit=151")
        .then(res => res.json())
        // .then(pokemonData => console.log(pokemonData))
        .then(pokemonData => setPokemon(pokemonData.results))
    }

    const pokemonNameNum = pokemon.map((mon, index) => {
        return  <Mon key = {index} name = {mon.name} number = {index+1} />
                

    })


    return (
        <div className='pokemon-card'>
            {pokemonNameNum}
        </div>
    );

}

export default PokemonContainer;