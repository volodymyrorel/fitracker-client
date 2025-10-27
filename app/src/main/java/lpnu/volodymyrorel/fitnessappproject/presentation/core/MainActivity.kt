package lpnu.volodymyrorel.fitnessappproject.presentation.core

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import dagger.hilt.android.AndroidEntryPoint
import lpnu.volodymyrorel.fitnessappproject.domain.navigation.Navigator
import lpnu.volodymyrorel.fitnessappproject.presentation.core.navigation.AppNavHost
import lpnu.volodymyrorel.fitnessappproject.presentation.core.theme.FitnessAppProjectTheme
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    @Inject
    lateinit var navigator: Navigator

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FitnessAppProjectTheme {
                val navHostController = rememberNavController()
                LaunchedEffect(navHostController) {
                    navigator.attach(navHostController, this@MainActivity)
                }
                AppNavHost(navHostController)
            }
        }
    }
}