package lpnu.volodymyrorel.fitnessappproject.domain.navigation

import android.app.Activity
import androidx.navigation.NavHostController

interface Navigator {
    fun attach(_navHostController: NavHostController, _activity: Activity)
    fun detach()
    fun popBackStack()
    fun setBackResult(key: String, value: Any)
    fun navigateToSignInScreen()
    fun navigateToSignUpScreen()
}