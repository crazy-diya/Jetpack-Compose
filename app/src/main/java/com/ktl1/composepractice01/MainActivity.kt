package com.ktl1.composepractice01

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ktl1.composepractice01.ui.theme.ComposePractice01Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposePractice01Theme {
                // A surface container using the 'background' color from the theme
                Surface(
//                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    ImageCard(modifier = Modifier)
//                    Column(
//                        horizontalAlignment = Alignment.CenterHorizontally,
//                        verticalArrangement = Arrangement.SpaceEvenly,
//                        modifier = Modifier
//                            .background(color = Color.Gray)
//                            .fillMaxWidth()
//                            .fillMaxHeight()
//                            .padding(35.dp)
//                            .border(width = 10.dp, Color.Magenta)
//                            .background(Color.Green)
//                            .padding(25.dp)
//                            .border(width = 5.dp, Color.Red)
//                            .background(Color.LightGray)
//
//
//                    ) {
//                        Text(text = "Welcom", modifier = Modifier.offset(50.dp))
//                        Spacer(modifier = Modifier.height(100.dp))
//                        Text(text = "Dimuthu", modifier = Modifier
//                            .clickable {
//                                Log.i("MyTag", "Click")
//                                Toast
//                                    .makeText(this@MainActivity, "Click !", Toast.LENGTH_SHORT)
//                                    .show()
//                            }
////                            .offset((-50).dp)
//                            .background(Color(0xFF41D399))
//                            .padding(10.dp))
//
//                    }

                }
            }
        }
    }
}

@Composable
fun ImageCard(modifier: Modifier) {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {


        Card(
            modifier = Modifier
                .height(250.dp)
                .width(175.dp),
            shape = RoundedCornerShape(10.dp),


            ) {
            Box(
                modifier = Modifier
                    .height(250.dp)
                    .width(175.dp),
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(
                            Brush.verticalGradient(
                                colors = listOf(Color.Transparent, Color.Black),
                                startY = 300f
                            )
                        )
                )
                Image(
                    painter = painterResource(id = R.drawable.mario),
                    contentDescription = "mario",
                    contentScale = ContentScale.Crop
                )
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(10.dp),
                    contentAlignment = Alignment.BottomCenter
                ) {
                    Text(text = "Welcome Mario!", modifier = Modifier.clickable {

                    })
                }
            }

        }
    }
}
