package com.test.dynamiclinksplayground

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import coil.ImageLoader
import com.google.firebase.dynamiclinks.FirebaseDynamicLinks
import com.test.dynamiclinksplayground.ui.navigation.Navigation
import com.test.dynamiclinksplayground.ui.screen.ListPostScreen
import com.test.dynamiclinksplayground.ui.screen.PostDetailScreen
import com.test.dynamiclinksplayground.ui.theme.DynamicLinksPlaygroundTheme
import com.test.dynamiclinksplayground.utils.Constants.TAG

@ExperimentalAnimationApi
class MainActivityTest : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       setContentView(R.layout.test)
}

}
