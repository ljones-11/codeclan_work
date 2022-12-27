import React, {useState, useEffect} from 'react'
import PokemonInfo from './PokemonInfo'

const SinglePokemon = ({pokemon, index}) => {

  const [pokemonData, setPokemonData] = useState([])

  useEffect(() => {
      getPokemonData();
  }, [])


const getPokemonData = function(){
  fetch(`${pokemon.url}`)
  .then(res => res.json())
  .then(pokemonData => setPokemonData(pokemonData));
  

}

  return (
    <div>
      <li>
        <PokemonInfo pokemonData={pokemonData} />
        #{index} {pokemon.name}
      </li>
    </div>
  );
}

export default SinglePokemon;