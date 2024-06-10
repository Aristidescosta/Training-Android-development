package com.example.training

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
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
                    color = MaterialTheme.colorScheme.background,
                    contentColor = Color(0xFF3ddc84)
                ) {

                }
            }
        }
    }
}

@Composable
fun Card(modifier: Modifier = Modifier) {
    val scrollState = rememberScrollState()

    Column(
        modifier = modifier
            .verticalScroll(scrollState),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.iam),
                contentDescription = null
            )
            Text(
                text = "Aristides da Costa",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "Desenvolvedor de Android & Web",
                fontSize = 16.sp
            )
        }
        
        Column() {
            IconsDetails(
                icon = Icons.Default.Phone,
                iconTitle = "+244 938-260-570",
                iconDescrible = "Ícone de telefone"
            )
            IconsDetails(
                icon = Icons.Default.Share,
                iconTitle = "Desenvolvedor Android & Mobile",
                iconDescrible = "Ícone de partilha"
            )
            IconsDetails(
                icon = Icons.Default.Email,
                iconTitle = "aristidiscosta200@gmail.com",
                iconDescrible = "Ícone de email"
            )
        }
    }
}

@Composable
fun IconsDetails(
    icon: ImageVector,
    iconTitle: String,
    iconDescrible: String?,
    modifier: Modifier = Modifier
) {
    Row(modifier = modifier) {
        Icon(icon, contentDescription = iconDescrible)
        Spacer(modifier = Modifier.width(16.dp))
        Text(text = iconTitle)
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TrainingTheme {
        Card(modifier = Modifier.fillMaxSize())
    }
}