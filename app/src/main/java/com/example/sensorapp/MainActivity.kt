package com.example.sensorapp

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.sensorapp.ui.theme.SensorAppTheme
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import java.text.SimpleDateFormat
import java.util.Date

class MainActivity : ComponentActivity() {
    @SuppressLint("SimpleDateFormat")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SensorAppTheme {
                val currentTime = SimpleDateFormat("hh:mm").format(Date())
                GreetingImage(currentTime)
            }
        }
    }
}

@Composable
fun GreetingImage(currentTime: String) {
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.background),
            contentDescription = null,
            modifier = Modifier
                .fillMaxSize()
                .clip(RectangleShape),
            contentScale = ContentScale.Crop
        )

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.Start
            ) {
                Text(
                    text = "Good",
                    style = TextStyle(
                        color = Color.White,
                        fontSize = 25.sp,
                        fontWeight = FontWeight.Normal
                    )
                )

                Text(
                    text = "Morning",
                    style = TextStyle(
                        color = Color.White,
                        fontSize = 32.sp,
                        fontWeight = FontWeight.Bold
                    )
                )
            }

            Text(
                text = currentTime,
                style = TextStyle(
                    color = Color.White,
                    fontSize = 35.sp,
                    fontWeight = FontWeight.Bold
                )
            )
        }

        Spacer(modifier = Modifier.height(45.dp))

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
                .offset(y = 100.dp)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Box(
                    modifier = Modifier
                        .weight(1f)
                        .padding(8.dp)
                        .shadow(100.dp, RectangleShape)
                        .height(170.dp)
                        .clip(RoundedCornerShape(16.dp))
                        .background(
                            color = Color.White
                        )
                        .graphicsLayer(
                            clip = false,
                            alpha = 1f
                        )
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(16.dp)
                    ) {
                        Text(
                            text = "Home Temperature",
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold
                        )

                        Text(
                            text = "23°C",
                            fontSize = 30.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.padding(top = 8.dp)
                        )

                        Spacer(modifier = Modifier.height(16.dp))

                        Row(
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Switch(
                                checked = true,
                                onCheckedChange = { /* handle toggle state change */ },
                                modifier = Modifier.padding(end = 8.dp)
                            )

                            // Icône de chauffage
                            /*Image(
                                painter = painterResource(id = R.drawable.ic_heating),
                                contentDescription = null,
                                modifier = Modifier.size(24.dp)
                            )*/
                        }
                    }
                }

                Box(
                    modifier = Modifier
                        .weight(1f)
                        .padding(8.dp)
                        .height(170.dp)
                        .shadow(100.dp, RectangleShape)
                        .clip(RoundedCornerShape(16.dp))
                        .background(
                            color = Color.Gray.copy(alpha = 0.5f),
                        )
                        .graphicsLayer(
                            clip = false,
                            alpha = 1f
                        )
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(16.dp)
                    ) {
                        Text(
                            text = "Lights",
                            color = Color.White,
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold
                        )
                        Text(
                            text = "80 Lx",
                            color = Color.White,
                            fontSize = 35.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.padding(top = 8.dp)
                        )
                    }
                }
            }
        }

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
                .offset(y = 290.dp)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Box(
                    modifier = Modifier
                        .weight(1f)
                        .padding(8.dp)
                        .height(140.dp)
                        .shadow(100.dp, RectangleShape)
                        .clip(RoundedCornerShape(16.dp))
                        .background(
                            color = Color.Gray.copy(alpha = 0.5f),
                        )
                        .graphicsLayer(
                            clip = false,
                            alpha = 1f
                        )
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(16.dp)
                    ) {
                        Text(
                            text = "CO²",
                            color = Color.White,
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold
                        )

                        Text(
                            text = "1000 ppm",
                            color = Color.White,
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.padding(top = 8.dp)
                        )
                    }
                }

                Box(
                    modifier = Modifier
                        .weight(1f)
                        .padding(8.dp)
                        .height(140.dp)
                        .shadow(80.dp, RectangleShape)

                        .clip(RoundedCornerShape(16.dp))
                        .background(
                            color = Color.Gray.copy(alpha = 0.5f)
                        )
                        .graphicsLayer(
                            clip = false,
                            alpha = 1f
                        )
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(16.dp)
                    ) {
                        Text(
                            text = "Humidity",
                            color = Color.White,
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold
                        )
                        Text(
                            text = "52 %",
                            color = Color.White,
                            fontSize = 40.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.padding(top = 8.dp)
                        )
                    }
                }
            }
        }

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
                .offset(y = 450.dp)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Box(
                    modifier = Modifier
                        .weight(1f)
                        .padding(8.dp)
                        .height(125.dp)
                        .shadow(100.dp, RectangleShape)
                        .clip(RoundedCornerShape(16.dp))
                        .background(
                            color = Color.White
                        )
                        .graphicsLayer(
                            clip = false,
                            alpha = 1f
                        )
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(16.dp)
                    ) {
                        Text(
                            text = "Smoke",
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold
                        )
                        Text(
                            text = "10 µg/m³",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.padding(top = 8.dp)
                        )
                    }
                }
            }
        }

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
                    .offset(y = 595.dp)
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Box(
                        modifier = Modifier
                            .weight(1f)
                            .padding(8.dp)
                            .height(140.dp)
                            .shadow(100.dp, RectangleShape)
                            .clip(RoundedCornerShape(16.dp))
                            .background(
                                color = Color.Gray.copy(alpha = 0.5f),
                            )
                            .graphicsLayer(
                                clip = false,
                                alpha = 1f
                            )
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(16.dp)
                        ) {
                            Text(
                                text = "Présence",
                                color = Color.White,
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Bold
                            )

                            Text(
                                text = "50 dBA",
                                color = Color.White,
                                fontSize = 30.sp,
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier.padding(top = 8.dp)
                            )

                            Text(
                                text = "Oui",
                                color = Color.White,
                                fontSize = 25.sp,
                                fontWeight = FontWeight.Bold
                            )
                        }
                    }

                    Box(
                        modifier = Modifier
                            .weight(1f)
                            .padding(8.dp)
                            .height(140.dp)
                            .shadow(80.dp, RectangleShape)
                            .clip(RoundedCornerShape(16.dp))
                            .background(
                                color = Color.Gray.copy(alpha = 0.5f)
                            )
                            .graphicsLayer(
                                clip = false,
                                alpha = 1f
                            )
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(16.dp)
                        ) {
                            Text(
                                text = "Vibration",
                                color = Color.White,
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Bold
                            )

                            Text(
                                text = "None",
                                color = Color.White,
                                fontSize = 28.sp,
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier.padding(top = 8.dp)
                            )
                        }
                    }
                }

            }
        }
    }


private fun Unit.then(comparator: () -> Unit) {

}

@SuppressLint("SimpleDateFormat")
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SensorAppTheme {
        val currentTime = SimpleDateFormat("hh:mm").format(Date())
        GreetingImage(currentTime)
    }
}
