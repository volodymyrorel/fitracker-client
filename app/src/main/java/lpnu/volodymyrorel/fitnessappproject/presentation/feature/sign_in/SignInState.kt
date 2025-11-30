package lpnu.volodymyrorel.fitnessappproject.presentation.feature.sign_in

data class SignInState(
    val email: String,
    val password: String
) {
    companion object {
        val DEFAULT = SignInState(
            email = "",
            password = ""
        )
    }
}
