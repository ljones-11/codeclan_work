import React from 'react'

const SinglePokemon = ({pokemon}) => {
  return (
    <div>
      <li>
        {pokemon.name}
      </li>
    </div>
  );
}

export default SinglePokemon;