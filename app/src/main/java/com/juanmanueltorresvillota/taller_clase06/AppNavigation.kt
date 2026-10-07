package com.juanmanueltorresvillota.taller_clase06

import android.util.Log
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument

@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    val listState = rememberLazyListState()

    NavHost(navController = navController, startDestination = "lista") {

        composable("lista") {
            ListaScreen(
                elementos = elementos,
                listState = listState,
                onElementoClick = { id ->
                    navController.navigate("detalle/$id") {
                        launchSingleTop = true
                    }
                }
            )
        }

        composable(
            route = "detalle/{elementoId}",
            arguments = listOf(navArgument("elementoId") { type = NavType.IntType })
        ) { backStackEntry ->
            val id = backStackEntry.arguments?.getInt("elementoId") ?: 0
            LaunchedEffect(Unit) {
                Log.d("NAV", "Detalle $id entró a la composición")
            }

            val elemento = elementos.firstOrNull { it.id == id }
            if (elemento != null) {
                DetalleScreen(elemento = elemento, onBack = { navController.popBackStack() })
            }
        }
    }
}