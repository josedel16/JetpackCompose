package com.example.jetpackcompose.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcompose.ui.theme.JetpackComposeTheme

@Composable
fun BoxScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .verticalScroll(rememberScrollState())
    ) {
        Text(
            text = "Children with no align",
            modifier = Modifier
                .padding(bottom = 16.dp)
                .align(alignment = Alignment.CenterHorizontally),
            fontSize = 16.sp
        )
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(250.dp)
                .background(Color.Gray)
        ) {
            Box(
                modifier = Modifier
                    .width(200.dp)
                    .height(200.dp)
                    .background(Color.Green)
            )

            Box(
                modifier = Modifier
                    .width(150.dp)
                    .height(150.dp)
                    .background(Color.Blue)
            )

            Box(
                modifier = Modifier
                    .width(100.dp)
                    .height(100.dp)
                    .background(Color.Red)
            )
        }

        Text(
            text = "Children with topStart, center and bottomEnd align",
            modifier = Modifier
                .padding(bottom = 16.dp, top = 16.dp)
                .align(alignment = Alignment.CenterHorizontally),
            fontSize = 16.sp,
            textAlign = TextAlign.Center
        )
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(250.dp)
                .background(Color.Gray)
        ) {
            Box(
                modifier = Modifier
                    .width(200.dp)
                    .height(200.dp)
                    .background(Color.Green)
                    .align(alignment = Alignment.TopStart)
            )

            Box(
                modifier = Modifier
                    .width(150.dp)
                    .height(150.dp)
                    .background(Color.Blue)
                    .align(alignment = Alignment.Center)
            )

            Box(
                modifier = Modifier
                    .width(100.dp)
                    .height(100.dp)
                    .background(Color.Red)
                    .align(alignment = Alignment.BottomEnd)
            )

        }
    }
}

@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
    JetpackComposeTheme {
        BoxScreen()
    }
}