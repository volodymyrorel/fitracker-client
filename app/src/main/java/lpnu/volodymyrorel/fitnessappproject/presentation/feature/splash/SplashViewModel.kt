package lpnu.volodymyrorel.fitnessappproject.presentation.feature.splash

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import lpnu.volodymyrorel.fitnessappproject.domain.auth.AuthHelper
import lpnu.volodymyrorel.fitnessappproject.domain.navigation.Navigator
import javax.inject.Inject

@HiltViewModel
class SplashViewModel @Inject constructor(
    private val navigator: Navigator,
    private val authHelper: AuthHelper
) : ViewModel() {
    init {
        viewModelScope.launch {
            delay(600)
            if (authHelper.isLoggedIn()) {
                Log.d("test", "user is logged in.")
                navigator.navigateToSignInScreen()
            }
        }
    }
}