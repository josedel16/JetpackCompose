package com.example.jetpackcompose.ui.components

import android.widget.Toast
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.example.jetpackcompose.data.Country

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun LazyColumnScreen() {
    val data = getData().groupBy { it.group }
    LazyColumn {
        data.forEach { (group, countries) ->

            stickyHeader {
                Text(
                    text = group,
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color.LightGray),
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold
                )
            }

            items(countries) {
                ItemView(item = it)
            }
        }
    }
}

@Composable
fun ItemView(item: Country) {
    val context = LocalContext.current
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(4.dp)
            .clickable {
                Toast
                    .makeText(context, item.name, Toast.LENGTH_SHORT)
                    .show()
            }
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        ) {
            AsyncImage(model = item.flag, contentDescription = "")
            Text(text = item.name, modifier = Modifier.padding(start = 16.dp), fontSize = 16.sp)
        }
    }
}

private fun getData(): List<Country> {
    return listOf(
        Country(
            "Qatar",
            "https://cloudinary.fifa.com/api/v3/picture/flags-sq-2/QAT?tx=c_fill,g_auto,q_auto",
            "Grupo A"
        ),
        Country(
            "Ecuador",
            "https://cloudinary.fifa.com/api/v3/picture/flags-sq-2/ECU?tx=c_fill,g_auto,q_auto",
            "Grupo A"
        ),
        Country(
            "Senegal",
            "https://cloudinary.fifa.com/api/v3/picture/flags-sq-2/SEN?tx=c_fill,g_auto,q_auto",
            "Grupo A"
        ),
        Country(
            "Países Bajos",
            "https://cloudinary.fifa.com/api/v3/picture/flags-sq-2/NED?tx=c_fill,g_auto,q_auto",
            "Grupo A"
        ),
        Country(
            "Inglaterra",
            "https://cloudinary.fifa.com/api/v3/picture/flags-sq-2/ENG?tx=c_fill,g_auto,q_auto",
            "Grupo B"
        ),
        Country(
            "RI de Irán",
            "https://cloudinary.fifa.com/api/v3/picture/flags-sq-2/IRN?tx=c_fill,g_auto,q_auto",
            "Grupo B"
        ),
        Country(
            "EEUU",
            "https://cloudinary.fifa.com/api/v3/picture/flags-sq-2/USA?tx=c_fill,g_auto,q_auto",
            "Grupo B"
        ),
        Country(
            "Gales",
            "https://cloudinary.fifa.com/api/v3/picture/flags-sq-2/WAL?tx=c_fill,g_auto,q_auto",
            "Grupo B"
        ),
        Country(
            "Argentina",
            "https://cloudinary.fifa.com/api/v3/picture/flags-sq-2/ARG?tx=c_fill,g_auto,q_auto",
            "Grupo C"
        ),
        Country(
            "Arabia Saudí",
            "https://cloudinary.fifa.com/api/v3/picture/flags-sq-2/KSA?tx=c_fill,g_auto,q_auto",
            "Grupo C"
        ),
        Country(
            "México",
            "https://cloudinary.fifa.com/api/v3/picture/flags-sq-2/MEX?tx=c_fill,g_auto,q_auto",
            "Grupo C"
        ),
        Country(
            "Polonia",
            "https://cloudinary.fifa.com/api/v3/picture/flags-sq-2/POL?tx=c_fill,g_auto,q_auto",
            "Grupo C"
        ),
        Country(
            "Francia",
            "https://cloudinary.fifa.com/api/v3/picture/flags-sq-2/FRA?tx=c_fill,g_auto,q_auto",
            "Grupo D"
        ),
        Country(
            "Dinamarca",
            "https://cloudinary.fifa.com/api/v3/picture/flags-sq-2/DEN?tx=c_fill,g_auto,q_auto",
            "Grupo D"
        ),
        Country(
            "Túnez",
            "https://cloudinary.fifa.com/api/v3/picture/flags-sq-2/TUN?tx=c_fill,g_auto,q_auto",
            "Grupo D"
        ),
        Country(
            "Australia",
            "https://cloudinary.fifa.com/api/v3/picture/flags-sq-2/AUS?tx=c_fill,g_auto,q_auto",
            "Grupo D"
        ),
        Country(
            "España",
            "https://cloudinary.fifa.com/api/v3/picture/flags-sq-2/ESP?tx=c_fill,g_auto,q_auto",
            "Grupo E"
        ),
        Country(
            "Alemania",
            "https://cloudinary.fifa.com/api/v3/picture/flags-sq-2/GER?tx=c_fill,g_auto,q_auto",
            "Grupo E"
        ),
        Country(
            "Japón",
            "https://cloudinary.fifa.com/api/v3/picture/flags-sq-2/JPN?tx=c_fill,g_auto,q_auto",
            "Grupo E"
        ),
        Country(
            "Costa Rica",
            "https://cloudinary.fifa.com/api/v3/picture/flags-sq-2/CRC?tx=c_fill,g_auto,q_auto",
            "Grupo E"
        ),
        Country(
            "Bélgica",
            "https://cloudinary.fifa.com/api/v3/picture/flags-sq-2/BEL?tx=c_fill,g_auto,q_auto",
            "Grupo F"
        ),
        Country(
            "Canadá",
            "https://cloudinary.fifa.com/api/v3/picture/flags-sq-2/CAN?tx=c_fill,g_auto,q_auto",
            "Grupo F"
        ),
        Country(
            "Marruecos",
            "https://cloudinary.fifa.com/api/v3/picture/flags-sq-2/MAR?tx=c_fill,g_auto,q_auto",
            "Grupo F"
        ),
        Country(
            "Croacia",
            "https://cloudinary.fifa.com/api/v3/picture/flags-sq-2/CRO?tx=c_fill,g_auto,q_auto",
            "Grupo F"
        ),
        Country(
            "Brasil",
            "https://cloudinary.fifa.com/api/v3/picture/flags-sq-2/BRA?tx=c_fill,g_auto,q_auto",
            "Grupo G"
        ),
        Country(
            "Serbia",
            "https://cloudinary.fifa.com/api/v3/picture/flags-sq-2/SRB?tx=c_fill,g_auto,q_auto",
            "Grupo G"
        ),
        Country(
            "Suiza",
            "https://cloudinary.fifa.com/api/v3/picture/flags-sq-2/SUI?tx=c_fill,g_auto,q_auto",
            "Grupo G"
        ),
        Country(
            "Camerún",
            "https://cloudinary.fifa.com/api/v3/picture/flags-sq-2/CMR?tx=c_fill,g_auto,q_auto",
            "Grupo G"
        ),
        Country(
            "Portugal",
            "https://cloudinary.fifa.com/api/v3/picture/flags-sq-2/POR?tx=c_fill,g_auto,q_auto",
            "Grupo H"
        ),
        Country(
            "Ghana",
            "https://cloudinary.fifa.com/api/v3/picture/flags-sq-2/GHA?tx=c_fill,g_auto,q_auto",
            "Grupo H"
        ),
        Country(
            "Uruguay",
            "https://cloudinary.fifa.com/api/v3/picture/flags-sq-2/URU?tx=c_fill,g_auto,q_auto",
            "Grupo H"
        ),
        Country(
            "República de Corea",
            "https://cloudinary.fifa.com/api/v3/picture/flags-sq-2/KOR?tx=c_fill,g_auto,q_auto",
            "Grupo H"
        )
    )
}