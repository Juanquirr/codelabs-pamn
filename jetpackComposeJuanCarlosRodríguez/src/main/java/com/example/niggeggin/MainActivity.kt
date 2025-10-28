package com.example.niggeggin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.niggeggin.ui.theme.HappyBirthdayTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HappyBirthdayTheme {
                Box(modifier = Modifier.fillMaxSize()) {
                    Image(
                        painter = painterResource(id = R.drawable.navidad),
                        contentDescription = null,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier.fillMaxSize(),
                        alpha = 0.9F
                    )
                    GreetingText(
                        message = "Estas navidades,",
                        from = "Te deseo lo mejor, amigo Pancho.",
                        modifier = Modifier
                            .align(Alignment.Center)
                            .padding(40.dp),
                    )
                }
            }
        }
    }
}


@Composable
fun GreetingText(message: String, from: String, modifier: Modifier = Modifier) {
    // Create a column so that texts don't overlap
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = modifier
    ) {
        Text(
            text = message,
            fontSize = 24.sp,
            lineHeight = 100.sp,
            textAlign = TextAlign.Left,
            modifier = Modifier.padding(top = 16.dp)
        )
        Text(
            text = from,
            fontSize = 42.sp,
            lineHeight = 70.sp,
            modifier = Modifier
                .padding(top = 16.dp)
                .padding(end = 16.dp)
                .align(alignment = Alignment.End)

        )
    }
}
@Composable
fun GreetingImage() {
    Image(
        painter = painterResource(id = R.drawable.navidad),
        contentDescription = null,
        contentScale = ContentScale.Crop,
        modifier = Modifier.fillMaxSize(),
        alpha = 0.9F
    )
}

@Preview(showBackground = true, showSystemUi = true, name = "myapp")
@Composable
private fun BirthdayCardPreview() {
    HappyBirthdayTheme {
        Box(
            modifier = Modifier
                .fillMaxSize()
        ) {
            GreetingImage()
            GreetingText(
                message = "Estas navidades,",
                from = "Te deseo lo mejor, amigo Pancho.",
                modifier = Modifier
                    .align(Alignment.Center)
                    .padding(40.dp),
            )
        }
    }
}
