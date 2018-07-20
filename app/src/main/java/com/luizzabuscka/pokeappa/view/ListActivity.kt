package com.luizzabuscka.pokeappa.view

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import com.bumptech.glide.Glide
import com.github.felipehjcosta.recyclerviewdsl.onRecyclerView
import com.luizzabuscka.pokeappa.R
import com.luizzabuscka.pokeappa.R.layout
import com.luizzabuscka.pokeappa.entities.Pokemon
import com.luizzabuscka.pokeappa.presentation.PokePresenter
import com.luizzabuscka.pokeappa.presentation.PokePresenterInterface
import kotlinx.android.synthetic.main.activity_list.rvList

class ListActivity : AppCompatActivity(), PokeViewInterface {

  val pokePresenter : PokePresenterInterface = PokePresenter(this)

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(layout.activity_list)

    pokePresenter.getPokemons()
  }

  override fun resultPokemons(result: List<Pokemon>) {
    onRecyclerView(rvList) {
      withLinearLayout {
        orientation = LinearLayout.VERTICAL
        reverseLayout = false
      }

      bind(R.layout.item_list) {
        withItems(result) {
          on<TextView>(R.id.tvName) {
            it.view?.text = it.item?.name
          }

          on<TextView>(R.id.tvType) {
            it.view?.text = it.item?.type
          }

          on<TextView>(R.id.tvDetail) {
            var description = it.item?.description!!
            if (description.length > 100) description = description.substring(0, 100)+"..."
            it.view?.text = description
          }

          on<ImageView>(R.id.ivPokemon) {
            Glide
                .with(this@ListActivity)
                .load(it.item?.image)
                .into(it.view!!)
          }

          onClick { position, item ->
            val intent = Intent(baseContext, DetailActivity::class.java)
            intent.putExtra("pokemon", item)
            startActivity(intent)
          }
        }
      }
    }
  }
}
