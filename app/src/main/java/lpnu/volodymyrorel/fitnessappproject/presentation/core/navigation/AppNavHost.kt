package lpnu.volodymyrorel.fitnessappproject.presentation.core.navigation

import androidx.compose.animation.EnterTransition
import androidx.compose.animation.ExitTransition
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import lpnu.volodymyrorel.fitnessappproject.presentation.feature.splash.SplashConstants
import lpnu.volodymyrorel.fitnessappproject.presentation.feature.splash.SplashRoute

@Composable
fun AppNavHost(navHostController: NavHostController) {
    NavHost(
        navController = navHostController,
        startDestination = SplashConstants.Args,
        enterTransition = { EnterTransition.None },
        exitTransition = { ExitTransition.None },
        popEnterTransition = { EnterTransition.None },
        popExitTransition = { ExitTransition.None }
    ) {
        composable<SplashConstants.Args> {
            SplashRoute()
        }
    }
}