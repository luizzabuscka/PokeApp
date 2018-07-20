package com.luizzabuscka.pokeappa.presentation

import com.luizzabuscka.pokeappa.entities.Pokemon


interface PokePresenterInterface {
  fun getPokemons()
  fun resultGetPokemons(result : List<Pokemon>)
}