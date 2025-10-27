package lpnu.volodymyrorel.fitnessappproject.presentation.feature.splash

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import lpnu.volodymyrorel.fitnessappproject.domain.navigation.Navigator
import javax.inject.Inject

@HiltViewModel
class SplashViewModel @Inject constructor(
    private val navigator: Navigator
) : ViewModel() {
//    init {
//        viewModelScope.launch {
//            delay(600)
//        }
//    }
}