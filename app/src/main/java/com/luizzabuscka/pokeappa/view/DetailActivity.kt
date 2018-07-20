package com.luizzabuscka.pokeappa.view

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.luizzabuscka.pokeappa.R
import com.luizzabuscka.pokeappa.entities.Pokemon
import kotlinx.android.synthetic.main.activity_detail.ivImage
import kotlinx.android.synthetic.main.activity_detail.tvAttack
import kotlinx.android.synthetic.main.activity_detail.tvDefense
import kotlinx.android.synthetic.main.activity_detail.tvDescription
import kotlinx.android.synthetic.main.activity_detail.tvHp
import kotlinx.android.synthetic.main.activity_detail.tvSpeed
import kotlinx.android.synthetic.main.item_list.tvName

class DetailActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_detail)

    val pokemon = intent.extras["pokemon"] as Pokemon

    tvName.text = "${pokemon.id} ${pokemon.name}"
    tvDescription.text = pokemon.description
    tvHp.text = pokemon.hp
    tvSpeed.text = pokemon.speed
    tvAttack.text = pokemon.attack
    tvDefense.text = pokemon.defense

    Glide
        .with(this)
        .load(pokemon.image)
        .into(ivImage)
  }


}
