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
fun ColumnScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .verticalScroll(rememberScrollState())
    ) {
        Text(
            text = "Arrangement.Top",
            modifier = Modifier
                .padding(bottom = 16.dp)
                .align(alignment = Alignment.CenterHorizontally),
            fontSize = 16.sp
        )

        Column(
            verticalArrangement = Arrangement.Top,
            modifier = Modifier
                .fillMaxWidth()
                .height(120.dp)
                .background(Color.Cyan)
        ) {
            Text(
                text = "First",
                modifier = Modifier.padding(start = 4.dp, top = 4.dp, bottom = 4.dp)
            )
            Text(
                text = "Second",
                modifier = Modifier.padding(start = 4.dp, top = 4.dp, bottom = 4.dp)
            )
            Text(
                text = "Third",
                modifier = Modifier.padding(start = 4.dp, top = 4.dp, bottom = 4.dp)
            )
        }

        Text(
            text = "Arrangement.Bottom",
            modifier = Modifier
                .padding(vertical = 16.dp)
                .align(alignment = Alignment.CenterHorizontally),
            fontSize = 16.sp
        )

        Column(
            verticalArrangement = Arrangement.Bottom,
            modifier = Modifier
                .fillMaxWidth()
                .height(120.dp)
                .background(Color.Cyan)
        ) {
            Text(
                text = "First",
                modifier = Modifier.padding(start = 4.dp, top = 4.dp, bottom = 4.dp)
            )
            Text(
                text = "Second",
                modifier = Modifier.padding(start = 4.dp, top = 4.dp, bottom = 4.dp)
            )
            Text(
                text = "Third",
                modifier = Modifier.padding(start = 4.dp, top = 4.dp, bottom = 4.dp)
            )
        }

        Text(
            text = "Arrangement.Center + Alignment.CenterHorizontally",
            modifier = Modifier
                .padding(vertical = 16.dp)
                .align(alignment = Alignment.CenterHorizontally),
            fontSize = 16.sp
        )

        Column(
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxWidth()
                .height(120.dp)
                .background(Color.Cyan)
        ) {
            Text(
                text = "First",
                modifier = Modifier
                    .padding(start = 4.dp, top = 4.dp, bottom = 4.dp)
                    .align(alignment = Alignment.CenterHorizontally)
            )
            Text(
                text = "Second",
                modifier = Modifier
                    .padding(start = 4.dp, top = 4.dp, bottom = 4.dp)
                    .align(alignment = Alignment.CenterHorizontally)
            )
            Text(
                text = "Third",
                modifier = Modifier
                    .padding(start = 4.dp, top = 4.dp, bottom = 4.dp)
                    .align(alignment = Alignment.CenterHorizontally)
            )
        }

        Text(
            text = "Arrangement.SpaceAround",
            modifier = Modifier
                .padding(vertical = 16.dp)
                .align(alignment = Alignment.CenterHorizontally),
            fontSize = 16.sp
        )

        Column(
            verticalArrangement = Arrangement.SpaceAround,
            modifier = Modifier
                .fillMaxWidth()
                .height(120.dp)
                .background(Color.Cyan)
        ) {
            Text(
                text = "First",
                modifier = Modifier.padding(start = 4.dp, top = 4.dp, bottom = 4.dp)
            )
            Text(
                text = "Second",
                modifier = Modifier.padding(start = 4.dp, top = 4.dp, bottom = 4.dp)
            )
            Text(
                text = "Third",
                modifier = Modifier.padding(start = 4.dp, top = 4.dp, bottom = 4.dp)
            )
        }

        Text(
            text = "Arrangement.SpaceEvenly",
            modifier = Modifier
                .padding(vertical = 16.dp)
                .align(alignment = Alignment.CenterHorizontally),
            fontSize = 16.sp
        )

        Column(
            verticalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier
                .fillMaxWidth()
                .height(120.dp)
                .background(Color.Cyan)
        ) {
            Text(
                text = "First",
                modifier = Modifier.padding(start = 4.dp, top = 4.dp, bottom = 4.dp)
            )
            Text(
                text = "Second",
                modifier = Modifier.padding(start = 4.dp, top = 4.dp, bottom = 4.dp)
            )
            Text(
                text = "Third",
                modifier = Modifier.padding(start = 4.dp, top = 4.dp, bottom = 4.dp)
            )
        }

        Text(
            text = "Arrangement.SpaceBetween",
            modifier = Modifier
                .padding(vertical = 16.dp)
                .align(alignment = Alignment.CenterHorizontally),
            fontSize = 16.sp
        )

        Column(
            verticalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
                .height(120.dp)
                .background(Color.Cyan)
        ) {
            Text(
                text = "First",
                modifier = Modifier.padding(start = 4.dp, top = 4.dp, bottom = 4.dp)
            )
            Text(
                text = "Second",
                modifier = Modifier.padding(start = 4.dp, top = 4.dp, bottom = 4.dp)
            )
            Text(
                text = "Third",
                modifier = Modifier.padding(start = 4.dp, top = 4.dp, bottom = 4.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
    JetpackComposeTheme {
        ColumnScreen()
    }
}