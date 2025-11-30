package lpnu.volodymyrorel.fitnessappproject.presentation.feature.sign_up

data class SignUpState(
    val email: String,
    val password: String,
    val passwordRepeat: String,
    val weightKg: Double,
    val heightCm: Int,
    val age: Int?,
    val sex: String?,
    val goal: String?
) {
    companion object {
        val DEFAULT = SignUpState(
            email = "",
            password = "",
            passwordRepeat = "",
            weightKg = 60.0,
            heightCm = 160,
            age = null,
            sex = null,
            goal = null
        )
    }
}
