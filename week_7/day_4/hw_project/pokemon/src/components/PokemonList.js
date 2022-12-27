import React, {useState, useEffect} from 'react'
import SinglePokemon from './SinglePokemon'

const PokemonList = ({pokemon}) => {

    const pokemonList = pokemon.map((pokemon, index) => {
        // console.log(pokemon, index)
        return (
                <SinglePokemon key={index} pokemon={pokemon} index={index+1}/>
        )
        
        
    })


    
    return (
        <div>
            <ul>
                {pokemonList}
            </ul>
        </div>
    );
}

export default PokemonList;