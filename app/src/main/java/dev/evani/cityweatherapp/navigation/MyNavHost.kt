package dev.evani.cityweatherapp.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import dev.evani.cityweatherapp.HomeScreen

@Composable
fun MyNavHost(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    NavHost(
        navController =navController,
        startDestination = Screens.HOME.name,
        modifier =modifier) {

        composable("home") {HomeScreen(navController)}
    }
}