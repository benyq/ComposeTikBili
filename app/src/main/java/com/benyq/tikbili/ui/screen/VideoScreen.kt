package com.benyq.tikbili.ui.screen

import androidx.annotation.DrawableRes
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.benyq.tikbili.R


@Composable
fun VideoScreen(modifier: Modifier = Modifier, vm: VideoScreenViewModel = viewModel()) {

    Box(modifier) {

    }
}

@Composable
fun VideoRightPanel(modifier: Modifier = Modifier) {
    Column(modifier) {
        IconMessage(Modifier.padding(5.dp), "ddd", R.drawable.ic_favorite) {

        }
        Spacer(modifier = Modifier.height(5.dp))
        IconMessage(Modifier.padding(5.dp), "ddd", R.drawable.ic_star_normal) {

        }
        Spacer(modifier = Modifier.height(5.dp))
        IconMessage(Modifier.padding(5.dp), "ddd", R.drawable.ic_message) {

        }
        Spacer(modifier = Modifier.height(5.dp))
        IconMessage(Modifier.padding(5.dp), "ddd", R.drawable.ic_share) {

        }
    }
}


@Composable
fun IconMessage(modifier: Modifier = Modifier, message: String, @DrawableRes icon: Int, tint: Color = Color.White, onClick: ()->Unit) {
    Column(modifier) {
        Icon(painter = painterResource(id = icon),
            modifier = Modifier.clickable(onClick = onClick).size(24.dp),
            contentDescription = null, tint = tint)
        Text(text = message, style = TextStyle(color = Color.White))
    }
}


@Preview
@Composable
fun VideoRightPanelPreview() {
    VideoRightPanel()
}