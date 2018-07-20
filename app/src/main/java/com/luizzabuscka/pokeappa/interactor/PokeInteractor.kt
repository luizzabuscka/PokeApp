package com.luizzabuscka.pokeappa.interactor

import com.luizzabuscka.pokeappa.entities.Pokemon
import com.luizzabuscka.pokeappa.presentation.PokePresenterInterface

class PokeInteractor(val pokePresenter : PokePresenterInterface) : PokeInteractorInterface {


  override fun getPokemons() {
    pokePresenter.resultGetPokemons(mockPokemons())
  }

  /**
   * Mothod just for mocking the pokemons
   */
  private fun mockPokemons() : List<Pokemon> {
    var pokemons = emptyList<Pokemon>()

    val poke1 = Pokemon(
        "Bulbasaur",
        "Grass | Poison",
        "#001",
        "Bulbasaur can be seen napping in bright sunlight. There is a seed on its back. By soaking up the sun's rays, the seed grows progressively larger.",
        "2", "3", "3", "2", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/001.png")
    pokemons = pokemons.plusElement(poke1)

    val poke2 = Pokemon(
        "Ivysaur",
        "Grass | Poison",
        "#002",
        "There is a bud on this Pokémon's back. To support its weight, Ivysaur's legs and trunk grow thick and strong. If it starts spending more time lying in the sunlight, it's a sign that the bud will bloom into a large flower soon.",
        "3", "3", "3", "3","https://assets.pokemon.com/assets/cms2/img/pokedex/full/002.png")
    pokemons = pokemons.plusElement(poke2)


    val poke3 = Pokemon(
        "Venusaur",
        "Grass | Poison",
        "#003",
        "There is a large flower on Venusaur's back. The flower is said to take on vivid colors if it gets plenty of nutrition and sunlight. The flower's aroma soothes the emotions of people.",
        "3", "4", "4", "4", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/003.png")
    pokemons = pokemons.plusElement(poke3)

    val poke4 = Pokemon(
        "Charmander",
        "Fire",
        "#004",
        "The flame that burns at the tip of its tail is an indication of its emotions. The flame wavers when Charmander is enjoying itself. If the Pokémon becomes enraged, the flame burns fiercely.",
        "2", "4", "3", "2", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/004.png")
    pokemons = pokemons.plusElement(poke4)

    val poke5 = Pokemon(
        "Charmeleon",
        "Fire",
        "#005",
        "Charmeleon mercilessly destroys its foes using its sharp claws. If it encounters a strong foe, it turns aggressive. In this excited state, the flame at the tip of its tail flares with a bluish white color.",
        "3", "4", "3", "3", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/005.png")
    pokemons = pokemons.plusElement(poke5)

    val poke6 = Pokemon(
        "Charizard",
        "Fire | Flying",
        "#006",
        "Charizard flies around the sky in search of powerful opponents. It breathes fire of such great heat that it melts anything. However, it never turns its fiery breath on any opponent weaker than itself.",
        "3", "5", "4", "3", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/006.png")
    pokemons = pokemons.plusElement(poke6)

    val poke7 = Pokemon(
        "Squirtle",
        "Water",
        "#007",
        "Squirtle's shell is not merely used for protection. The shell's rounded shape and the grooves on its surface help minimize resistance in water, enabling this Pokémon to swim at high speeds.",
        "2", "2", "3", "3", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/007.png")
    pokemons = pokemons.plusElement(poke7)

    val poke8 = Pokemon(
        "Wartortle",
        "Water",
        "#008",
        "Its tail is large and covered with a rich, thick fur. The tail becomes increasingly deeper in color as Wartortle ages. The scratches on its shell are evidence of this Pokémon's toughness as a battler.",
        "3", "3", "3", "4", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/008.png")
    pokemons = pokemons.plusElement(poke8)

    val poke9 = Pokemon(
        "Blastoise",
        "Water",
        "#009",
        "Blastoise has water spouts that protrude from its shell. The water spouts are very accurate. They can shoot bullets of water with enough accuracy to strike empty cans from a distance of over 160 feet.",
        "3", "4", "4", "4", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/009.png")
    pokemons = pokemons.plusElement(poke9)

    return pokemons
  }




}