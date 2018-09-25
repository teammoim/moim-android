package io.github.teammoim.moim.view

import android.os.Bundle
import io.github.teammoim.moim.R
import io.github.teammoim.moim.base.BaseActivity
import kotlinx.android.synthetic.main.activity_splash.*
import org.jetbrains.anko.clearTop
import org.jetbrains.anko.intentFor
import org.jetbrains.anko.noHistory
import org.jetbrains.anko.startActivity

class SplashActivity:BaseActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        loginButton.setOnClickListener {
            startActivity(intentFor<LoginActivity>().clearTop().noHistory())
        }
    }
}