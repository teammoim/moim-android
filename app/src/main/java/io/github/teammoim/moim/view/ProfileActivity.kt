package io.github.teammoim.moim.view

import android.os.Bundle
import io.github.teammoim.moim.R
import io.github.teammoim.moim.base.BaseActivity

class ProfileActivity:BaseActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        overridePendingTransition(R.anim.left_to_right,R.anim.left_to_right)
    }
}