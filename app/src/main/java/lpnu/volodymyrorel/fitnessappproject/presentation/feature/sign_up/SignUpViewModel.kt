package lpnu.volodymyrorel.fitnessappproject.presentation.feature.sign_up

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update
import lpnu.volodymyrorel.fitnessappproject.domain.navigation.Navigator
import javax.inject.Inject

@HiltViewModel
class SignUpViewModel @Inject constructor(
    private val navigator: Navigator
) : ViewModel() {

    private val _state: MutableStateFlow<SignUpState> = MutableStateFlow(SignUpState.DEFAULT)
    val state: StateFlow<SignUpState>; get() = _state

    fun onEmailChanged(value: String) {
        _state.update { it.copy(email = value) }
    }

    fun onPasswordChanged(value: String) {
        _state.update { it.copy(password = value) }
    }

    fun onPasswordRepeatChanged(value: String) {
        _state.update { it.copy(passwordRepeat = value) }
    }

    fun onWeightKgChanged(value: Double) {
        _state.update { it.copy(weightKg = value) }
    }

    fun onHeightCmChanged(value: Int) {
        _state.update { it.copy(heightCm = value) }
    }

    fun onAgeChanged(value: Int) {
        _state.update { it.copy(age = value) }
    }

    fun onSexChanged(value: String) {
        _state.update { it.copy(sex = value) }
    }

    fun onGoalChanged(value: String) {
        _state.update { it.copy(goal = value) }
    }

    fun onSignUpClicked() {

    }
}