package lpnu.volodymyrorel.fitnessappproject.data.navigation

import android.app.Activity
import androidx.navigation.NavHostController
import lpnu.volodymyrorel.fitnessappproject.domain.navigation.Navigator
import javax.inject.Inject

internal class NavigatorImpl @Inject constructor(): Navigator {

    private var navHostController: NavHostController? = null
    private var activity: Activity? = null

    private val backResultMap = mutableMapOf<String, Any>()

    override fun attach(_navHostController: NavHostController, _activity: Activity) {
        navHostController = _navHostController
        activity = _activity
    }

    override fun detach() {
        navHostController = null
        activity = null
    }

    override fun popBackStack() {
        navHostController?.popBackStack()
    }

    override fun setBackResult(key: String, value: Any) {
        backResultMap[key] = value
    }
}