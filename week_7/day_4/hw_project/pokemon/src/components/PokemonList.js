import React from 'react'
import SinglePokemon from './SinglePokemon'

const PokemonList = ({pokemon}) => {

    const pokemonList = pokemon.map((pokemon, index) => {
        console.log(pokemon)
        return <SinglePokemon key={index} pokemon={pokemon}/>
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