package com.example.training

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.training.ui.theme.TrainingTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TrainingTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ArticleScreen()
                }
            }
        }
    }
}

@Composable
fun ArticleScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
    ) {
        BannerImage(modifier = Modifier.fillMaxWidth())
        Text(
            text = stringResource(R.string.jetpack_compose_tutorial),
            fontSize = 24.sp,
            modifier = Modifier.padding(16.dp)
        )
        Text(
            text = stringResource(R.string.subtitle),
            fontSize = 24.sp,
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(horizontal = 16.dp
            )
        )
        Text(
            text = stringResource(R.string.description),
            fontSize = 24.sp,
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(16.dp)
        )
    }
}

@Composable
fun BannerImage(modifier: Modifier = Modifier) {
    val imageId = painterResource(id = R.drawable.bg_compose_background)
    Image(
        painter = imageId,
        contentDescription = stringResource(R.string.banner_do_jetpack_compose),
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TrainingTheme {
        ArticleScreen()
    }
}