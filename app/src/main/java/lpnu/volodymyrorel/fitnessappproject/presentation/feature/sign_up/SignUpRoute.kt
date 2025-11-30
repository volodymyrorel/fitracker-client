package lpnu.volodymyrorel.fitnessappproject.presentation.feature.sign_up

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.lifecycle.viewmodel.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import lpnu.volodymyrorel.fitnessappproject.presentation.core.theme.FitnessAppProjectTheme

@Composable
fun SignUpRoute(
    viewModel: SignUpViewModel = hiltViewModel()
) {
    val state by viewModel.state.collectAsStateWithLifecycle()

    SignUpScreen(
        state = state,
        onEmailChanged = viewModel::onEmailChanged,
        onPasswordChanged = viewModel::onPasswordChanged,
        onPasswordRepeatChanged = viewModel::onPasswordRepeatChanged,
        onWeightKgChanged = viewModel::onWeightKgChanged,
        onHeightCmChanged = viewModel::onHeightCmChanged,
        onAgeChanged = viewModel::onAgeChanged,
        onSexChanged = viewModel::onSexChanged,
        onGoalChanged = viewModel::onGoalChanged,
        onSignUpClicked = viewModel::onSignUpClicked
    )
}

@Composable
private fun SignUpScreen(
    state: SignUpState,
    onEmailChanged: (String) -> Unit,
    onPasswordChanged: (String) -> Unit,
    onPasswordRepeatChanged: (String) -> Unit,
    onWeightKgChanged: (Double) -> Unit,
    onHeightCmChanged: (Int) -> Unit,
    onAgeChanged: (Int) -> Unit,
    onSexChanged: (String) -> Unit,
    onGoalChanged: (String) -> Unit,
    onSignUpClicked: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "SignUpScreen",
            style = MaterialTheme.typography.titleLarge.copy(fontSize = 48.sp)
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun SignUpScreenPreview() {
    FitnessAppProjectTheme {
        SignUpScreen(
            state = SignUpState.DEFAULT,
            onEmailChanged = {},
            onPasswordChanged = {},
            onPasswordRepeatChanged = {},
            onWeightKgChanged = {},
            onHeightCmChanged = {},
            onAgeChanged = {},
            onSexChanged = {},
            onGoalChanged = {},
            onSignUpClicked = {}
        )
    }
}