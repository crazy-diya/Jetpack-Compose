package com.ktl1.composepractice01

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ktl1.composepractice01.ui.theme.ComposePractice01Theme

class FifthActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            /*val scrollState = rememberScrollState()
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .verticalScroll(scrollState),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                for (i in 1..500) {
                    Text(
                        "Item $i",
                        fontStyle = FontStyle.Italic,
                        fontSize = 24.sp,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.padding(vertical = 24.dp)
                    )
                }
            }*/

            LazyColumn(
                modifier = Modifier
                    .fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

//                items(5000) { item ->
//                    Text(
//                        "Item $item",
//                        fontStyle = FontStyle.Italic,
//                        fontSize = 24.sp,
//                        textAlign = TextAlign.Center,
//                        modifier = Modifier.padding(vertical = 24.dp)
//                    )
//                }


                itemsIndexed(
                    listOf(
                        "This",
                        "is",
                        "jetpack",
                        "compose",
                        "This",
                        "is",
                        "jetpack",
                        "compose",
                        "This",
                        "is",
                        "jetpack",
                        "compose"
                    )
                ) { index, item ->
                    Text(
                        "$item",
                        fontStyle = FontStyle.Italic,
                        fontSize = 24.sp,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.padding(vertical = 24.dp)
                    )
                }

            }
        }
    }
}
