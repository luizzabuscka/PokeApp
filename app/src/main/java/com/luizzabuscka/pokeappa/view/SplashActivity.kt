package com.luizzabuscka.pokeappa.view

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import com.luizzabuscka.pokeappa.R.layout
import com.luizzabuscka.pokeappa.fadeIn
import com.luizzabuscka.pokeappa.startActivityWithFade
import kotlinx.android.synthetic.main.activity_splash.ivLogo
import java.util.Timer
import kotlin.concurrent.schedule

class SplashActivity : Activity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(layout.activity_splash)


    ivLogo.fadeIn(2000)


    callNextActivity(Intent(this, ListActivity::class.java))
  }

  fun callNextActivity(intent: Intent) {
    Timer("schedule", true).schedule(2000) {
      startActivityWithFade(intent, true)
    }
  }
}
