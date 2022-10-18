package com.example.jetpackcompose.ui.main

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.jetpackcompose.R
import com.example.jetpackcompose.ui.characters.CharactersScreen
import com.example.jetpackcompose.ui.components.*
import kotlinx.coroutines.launch

@Composable
fun MainScreen() {
    val coroutineScope = rememberCoroutineScope()
    val scaffoldState = rememberScaffoldState()
    val navController = rememberNavController()
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination

    Scaffold(topBar = {
        Toolbar(title = getNameByRoute(currentRoute?.route)) {
            coroutineScope.launch {
                scaffoldState.drawerState.open()
            }
        }
    }, scaffoldState = scaffoldState, drawerContent = {
        Drawer(screens = screens, onDestinationClicked = {
            coroutineScope.launch {
                scaffoldState.drawerState.close()

                navController.navigate(route = it) {
                    navController.graph.startDestinationRoute?.let { route ->
                        popUpTo(route) {
                            saveState = true
                        }
                    }
                    launchSingleTop = true
                    restoreState = true
                }
            }
        }, currentRoute?.route)
    }) {
        BackHandler(enabled = scaffoldState.drawerState.isOpen, onBack = {
            coroutineScope.launch {
                scaffoldState.drawerState.close()
            }
        })
        NavHost(navController = navController, startDestination = DrawerScreens.Box.route) {
            composable(DrawerScreens.Box.route) {
                BoxScreen()
            }
            composable(DrawerScreens.Row.route) {
                RowScreen()
            }
            composable(DrawerScreens.Column.route) {
                ColumnScreen()
            }
            composable(DrawerScreens.LazyColumn.route) {
                LazyColumnScreen()
            }
            composable(DrawerScreens.LazyRow.route) {
                LazyRowScreen()
            }
            composable(DrawerScreens.Components.route) {
                OthersComponents()
            }
            composable(DrawerScreens.AvatarCharacters.route) {
                CharactersScreen()
            }
        }
    }
}

@Composable
fun Toolbar(title: String, onClickDrawer: () -> Unit) {
    TopAppBar(title = { Text(text = title) }, navigationIcon = {
        IconButton(onClick = { onClickDrawer() }) {
            Icon(imageVector = Icons.Filled.Menu, contentDescription = "")
        }
    })
}

@Composable
fun Drawer(
    screens: List<DrawerScreens>,
    onDestinationClicked: (route: String) -> Unit,
    currentRoute: String?
) {
    Column(modifier = Modifier.padding(8.dp)) {
        Image(
            painter = painterResource(id = R.drawable.tigres),
            contentDescription = "",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .padding(top = 16.dp)
                .width(100.dp)
                .height(100.dp)
                .align(alignment = Alignment.CenterHorizontally)
                .clip(CircleShape)
        )
        Text(
            text = "José Manuel",
            modifier = Modifier
                .align(alignment = Alignment.CenterHorizontally)
                .padding(top = 16.dp, bottom = 16.dp),
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )
        screens.forEach {
            Text(
                text = it.title, modifier = Modifier
                    .fillMaxWidth()
                    .clickable { onDestinationClicked(it.route) }
                    .padding(8.dp),
                color = if (currentRoute == it.route) Color.Blue else Color.Black
            )
            Divider(modifier = Modifier.fillMaxWidth())
        }
    }
}

sealed class DrawerScreens(val title: String, val route: String) {
    object Box : DrawerScreens("Box", "box")
    object Row : DrawerScreens("Row", "row")
    object Column : DrawerScreens("Column", "column")
    object Components : DrawerScreens("Components", "others_components")
    object LazyColumn : DrawerScreens("LazyColumn", "lazy_column")
    object LazyRow : DrawerScreens("LazyRow/LazyVerticalGrid", "lazy_row")
    object AvatarCharacters : DrawerScreens("Avatar characters", "avatar_characters")
}

private val screens = listOf(
    DrawerScreens.Box,
    DrawerScreens.Row,
    DrawerScreens.Column,
    DrawerScreens.Components,
    DrawerScreens.LazyColumn,
    DrawerScreens.LazyRow,
    DrawerScreens.AvatarCharacters
)

private fun getNameByRoute(route: String?): String {
    return screens.find { it.route == route }?.title ?: ""
}