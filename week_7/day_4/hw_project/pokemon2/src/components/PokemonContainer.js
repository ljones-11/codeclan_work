import React, {useState, useEffect} from 'react'

const PokemonContainer = function() {

    const [pokemon, setPokemon] = useState([])
    const [monSelected, setMonSelected] = useState(null)

    useEffect (() => {
        getPokemon();
    }, [])


    const getPokemon = function(){
        fetch("https://pokeapi.co/api/v2/pokemon/?limit=151")
        .then(res => res.json())
        // .then(pokemonData => console.log(pokemonData))
        .then(data => {
            console.log(data)
            const pokemonNames = data.results.map((mon) => {
                return  mon.name     
            })
                setPokemon(pokemonNames)
        })
    }

    const monNames = pokemon.map(name => (
        <option key={name} value={name}>{name}</option>
    ))  
    
    const handleChange = function(event) {
        const name = event.target.value;
        setMonSelected(name)
    }




    return (
        <div>
            <div>
                <select onChange={handleChange}>
                    <option selected>-- Choose a Pokemon --</option>
                    {monNames}
                </select>
            </div>
        </div>
    );

}

export default PokemonContainer;