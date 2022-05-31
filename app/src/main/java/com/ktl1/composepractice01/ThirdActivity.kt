package com.ktl1.composepractice01

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.ktl1.composepractice01.ui.theme.ComposePractice01Theme
import kotlin.random.Random

class ThirdActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            var color = remember {
                mutableStateOf(Color.Yellow)
            }
            Column(Modifier.fillMaxSize()) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .weight(1f)
                        .background(color.value)
                )
                colorBox(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(color.value)
                        .weight(1f),

                    ){
                    color.value = it
                }
            }
        }
    }
}

@Composable
fun colorBox(
    modifier: Modifier,
    updateColor: (Color) -> Unit // Lambda Function
) {

    Box(modifier = modifier
        .background(Color.DarkGray)
        .clickable {
            updateColor(
                Color(
                    Random.nextFloat(),
                    Random.nextFloat(),
                    Random.nextFloat(),
                    Random.nextFloat(),
                )
            )
        })
}