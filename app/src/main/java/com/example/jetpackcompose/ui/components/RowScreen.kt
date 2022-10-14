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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcompose.ui.theme.JetpackComposeTheme

@Composable
fun RowScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .verticalScroll(rememberScrollState())
    ) {
        Text(
            text = "Arrangement.Start",
            modifier = Modifier
                .padding(bottom = 16.dp)
                .align(alignment = Alignment.CenterHorizontally),
            fontSize = 16.sp
        )

        Row(
            horizontalArrangement = Arrangement.Start,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Cyan)
        ) {
            Text(text = "First", modifier = Modifier.padding(horizontal = 8.dp))
            Text(text = "Second", modifier = Modifier.padding(horizontal = 8.dp))
            Text(text = "Third", modifier = Modifier.padding(horizontal = 8.dp))
        }

        Text(
            text = "Arrangement.End",
            modifier = Modifier
                .padding(vertical = 16.dp)
                .align(alignment = Alignment.CenterHorizontally),
            fontSize = 16.sp
        )

        Row(
            horizontalArrangement = Arrangement.End,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Cyan)
        ) {
            Text(text = "First", modifier = Modifier.padding(horizontal = 8.dp))
            Text(text = "Second", modifier = Modifier.padding(horizontal = 8.dp))
            Text(text = "Third", modifier = Modifier.padding(horizontal = 8.dp))
        }

        Text(
            text = "Arrangement.Center",
            modifier = Modifier
                .padding(vertical = 16.dp)
                .align(alignment = Alignment.CenterHorizontally),
            fontSize = 16.sp
        )

        Row(
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Cyan)
        ) {
            Text(text = "First", modifier = Modifier.padding(horizontal = 8.dp))
            Text(text = "Second", modifier = Modifier.padding(horizontal = 8.dp))
            Text(text = "Third", modifier = Modifier.padding(horizontal = 8.dp))
        }

        Text(
            text = "Arrangement.SpaceAround",
            modifier = Modifier
                .padding(vertical = 16.dp)
                .align(alignment = Alignment.CenterHorizontally),
            fontSize = 16.sp
        )

        Row(
            horizontalArrangement = Arrangement.SpaceAround,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Cyan)
        ) {
            Text(text = "First", modifier = Modifier.padding(horizontal = 8.dp))
            Text(text = "Second", modifier = Modifier.padding(horizontal = 8.dp))
            Text(text = "Third", modifier = Modifier.padding(horizontal = 8.dp))
        }

        Text(
            text = "Arrangement.SpaceBetween",
            modifier = Modifier
                .padding(vertical = 16.dp)
                .align(alignment = Alignment.CenterHorizontally),
            fontSize = 16.sp
        )

        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Cyan)
        ) {
            Text(text = "First", modifier = Modifier.padding(horizontal = 8.dp))
            Text(text = "Second", modifier = Modifier.padding(horizontal = 8.dp))
            Text(text = "Third", modifier = Modifier.padding(horizontal = 8.dp))
        }

        Text(
            text = "Arrangement.SpaceEvenly",
            modifier = Modifier
                .padding(vertical = 16.dp)
                .align(alignment = Alignment.CenterHorizontally),
            fontSize = 16.sp
        )

        Row(
            horizontalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Cyan)
        ) {
            Text(text = "First", modifier = Modifier.padding(horizontal = 8.dp))
            Text(text = "Second", modifier = Modifier.padding(horizontal = 8.dp))
            Text(text = "Third", modifier = Modifier.padding(horizontal = 8.dp))
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
    JetpackComposeTheme {
        RowScreen()
    }
}