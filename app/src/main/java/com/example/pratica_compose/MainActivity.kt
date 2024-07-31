package com.example.pratica_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class ComposeScreen : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeCards()
        }
    }
}

@Composable
fun ComposeCards() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color.White
    ) {
        Column(
            modifier = Modifier.fillMaxSize()
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f),
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Quadrant(
                    color = Color(0xFFEADDFF),
                    title = "Text composable",
                    description = "Displays text and follows the recommended Material Design guidelines."
                )
                Quadrant(
                    color = Color(0xFFD0BCFF),
                    title = "Image composable",
                    description = "Creates a composable that lays out and draws a given Painter class object."
                )
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f),
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Quadrant(
                    color = Color(0xFFB69DF8),
                    title = "Row composable",
                    description = "A layout composable that places its children in a horizontal sequence."
                )
                Quadrant(
                    color = Color(0xFFF6EDFF),
                    title = "Column composable",
                    description = "A layout composable that places its children in a vertical sequence."
                )
            }
        }
    }
}

@Composable
fun Quadrant(color: Color, title: String, description: String) {
    Card(
        modifier = Modifier

            .fillMaxHeight()
            .padding(16.dp),
        shape = RoundedCornerShape(8.dp),
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(color)
                .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = title,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(bottom = 16.dp)
            )
            Text(
                text = description,
                fontSize = 16.sp
            )
        }
    }
}
