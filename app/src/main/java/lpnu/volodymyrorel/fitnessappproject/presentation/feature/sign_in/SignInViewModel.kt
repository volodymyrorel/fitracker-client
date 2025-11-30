package lpnu.volodymyrorel.fitnessappproject.presentation.feature.sign_in

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update
import lpnu.volodymyrorel.fitnessappproject.domain.navigation.Navigator
import javax.inject.Inject

@HiltViewModel
class SignInViewModel @Inject constructor(
    private val navigator: Navigator
) : ViewModel() {

    private val _state = MutableStateFlow(SignInState.DEFAULT)
    val state: StateFlow<SignInState>; get() = _state

    fun onEmailChanged(value: String) {
        _state.update { it.copy(email = value) }
    }

    fun onPasswordChanged(value: String) {
        _state.update { it.copy(password = value) }
    }

    fun onSignUpClicked() {
        navigator.navigateToSignUpScreen()
    }

    fun onSignInClicked() {

    }
}