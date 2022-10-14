package com.example.jetpackcompose.ui.components

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcompose.R
import com.example.jetpackcompose.data.SuperHero

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun LazyRowScreen() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Text(
            text = "LazyRow",
            modifier = Modifier.padding(bottom = 16.dp),
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold
        )

        LazyRow(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
            items(getData()) {
                ItemHero(item = it)
            }
        }

        Text(
            text = "LazyVerticalGrid",
            modifier = Modifier.padding(vertical = 16.dp),
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold
        )
        LazyVerticalGrid(
            cells = GridCells.Fixed(2),
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
            content = {
                items(getData()) {
                    ItemHero(item = it)
                }
            })
    }

}

@Composable
fun ItemHero(item: SuperHero) {
    Card(modifier = Modifier.width(150.dp)) {
        Column() {
            Image(
                painter = painterResource(id = item.image), contentDescription = "",
                modifier = Modifier.fillMaxWidth(), contentScale = ContentScale.Crop
            )
            Text(text = item.name, modifier = Modifier.align(Alignment.CenterHorizontally))
        }
    }
}

private fun getData(): List<SuperHero> {
    return listOf(
        SuperHero("Spiderman", R.drawable.spiderman),
        SuperHero("Wolverine", R.drawable.logan),
        SuperHero("Batman", R.drawable.batman),
        SuperHero("Thor", R.drawable.thor),
        SuperHero("Flash", R.drawable.flash),
        SuperHero("Green Lantern", R.drawable.green_lantern),
        SuperHero("Wonder Woman", R.drawable.wonder_woman)
    )
}