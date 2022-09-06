package com.test.dynamiclinksplayground.ui.screen

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.core.net.toUri
import androidx.navigation.NavController
import coil.ImageLoader
import com.test.dynamiclinksplayground.datasource.FakeDataSource
import com.test.dynamiclinksplayground.ui.components.PostItem
import com.test.dynamiclinksplayground.ui.navigation.Navigation
import com.test.dynamiclinksplayground.utils.Constants
import com.test.dynamiclinksplayground.utils.generateSharingLink
import com.test.dynamiclinksplayground.utils.shareDeepLink

@Composable
fun ListPostScreen(
    imageLoader: ImageLoader,
    navController: NavController
) {
    LazyColumn(
        contentPadding = PaddingValues(20.dp)
    ) {
        items(FakeDataSource.listOfPost) { post ->
            val context = LocalContext.current

            PostItem(imageLoader = imageLoader,
                post = post,
                onShareButtonClicked = {
                    generateSharingLink(
                        deepLink = "${Constants.PREFIX}/post/${post.id}".toUri(),
                        previewImageLink = post.imageLink.toUri(),
                        getShareableLink = { generatedLink ->
                            context.shareDeepLink(
                                deepLink = generatedLink
                            )
                        }
                    )
                },
                onPostClicked = {
                    navController.navigate("${Navigation.PostDetailScreen.route}/${post.id}")
                }
            )
        }
    }
}
