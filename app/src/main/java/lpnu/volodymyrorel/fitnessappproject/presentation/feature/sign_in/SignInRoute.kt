package lpnu.volodymyrorel.fitnessappproject.presentation.feature.sign_in

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.lifecycle.viewmodel.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import lpnu.volodymyrorel.fitnessappproject.presentation.core.theme.FitnessAppProjectTheme
import lpnu.volodymyrorel.fitnessappproject.R

@Composable
fun SignInRoute(
    viewModel: SignInViewModel = hiltViewModel()
) {
    val state by viewModel.state.collectAsStateWithLifecycle()

    SignInScreen(
        state = state,
        onEmailChanged = viewModel::onEmailChanged,
        onPasswordChanged = viewModel::onPasswordChanged,
        onSignUpClicked = viewModel::onSignUpClicked,
        onSignInClicked = viewModel::onSignInClicked
    )
}

@Composable
private fun SignInScreen(
    state: SignInState,
    onEmailChanged: (String) -> Unit,
    onPasswordChanged: (String) -> Unit,
    onSignUpClicked: () -> Unit,
    onSignInClicked: () -> Unit
) {

    var isPasswordVisible by remember { mutableStateOf(false) }
    val icon = if (isPasswordVisible) painterResource(R.drawable.visibility_off_24)
        else painterResource(R.drawable.visibility_on_24)

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Text(
            text = "Fitracker",
            style = MaterialTheme.typography.titleMedium.copy(fontSize = 40.sp)
        )

        Spacer(modifier = Modifier.height(48.dp))
        Text(
            text = "Sign In",
            style = MaterialTheme.typography.titleLarge.copy(fontSize = 28.sp)
        )

        Spacer(modifier = Modifier.height(28.dp))
        OutlinedTextField(
            modifier = Modifier.fillMaxWidth(),
            value = state.email,
            onValueChange = { onEmailChanged(it) },
            label = { Text(text = "email") },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Email,
                imeAction = ImeAction.Next
            )
        )

        Spacer(modifier = Modifier.height(12.dp))
        OutlinedTextField(
            modifier = Modifier.fillMaxWidth(),
            value = state.password,
            onValueChange = { onPasswordChanged(it) },
            label = { Text(text = "password") },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Password,
                imeAction = ImeAction.Done
            ),
            trailingIcon = {
                IconButton(
                    onClick = { isPasswordVisible = !isPasswordVisible }
                ) {
                    Icon(
                        painter = icon,
                        contentDescription = ""
                    )
                }
            },
            visualTransformation =
                if (isPasswordVisible) VisualTransformation.None
                else PasswordVisualTransformation()
        )

        Spacer(modifier = Modifier.height(16.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {

            Spacer(modifier = Modifier.weight(0.5F))
            Text(
                modifier = Modifier
                    .weight(4F)
                    .clickable(
                        enabled = true,
                        onClick = onSignUpClicked,

                    ),
                text = "Sign Up",
                style = MaterialTheme.typography.labelLarge,
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.weight(0.5F))

            Button(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(4.5F),
                onClick = onSignInClicked
            ) {
                Text(
                    text = "Sign In",
                    style = MaterialTheme.typography.labelLarge
                )
            }
            Spacer(modifier = Modifier.weight(0.5F))
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun SignInScreenPreview() {
    FitnessAppProjectTheme {
        SignInScreen(
            state = SignInState(
                email = "vovka.orel@gmail.com",
                password = "123456"
            ),
            onEmailChanged = {},
            onPasswordChanged = {},
            onSignUpClicked = {},
            onSignInClicked = {}
        )
    }
}