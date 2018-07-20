package com.luizzabuscka.pokeappa.presentation

import com.luizzabuscka.pokeappa.entities.Pokemon
import com.luizzabuscka.pokeappa.interactor.PokeInteractor
import com.luizzabuscka.pokeappa.interactor.PokeInteractorInterface
import com.luizzabuscka.pokeappa.view.PokeViewInterface

class PokePresenter(val pokeView : PokeViewInterface) : PokePresenterInterface {

  val pokeInteractor : PokeInteractorInterface = PokeInteractor(this)

  override fun getPokemons() {
    pokeInteractor.getPokemons()
  }

  override fun resultGetPokemons(result: List<Pokemon>) {
    pokeView.resultPokemons(result)
  }
}