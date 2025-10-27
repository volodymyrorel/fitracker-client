package lpnu.volodymyrorel.fitnessappproject.data.auth

import lpnu.volodymyrorel.fitnessappproject.domain.auth.AuthHelper
import lpnu.volodymyrorel.fitnessappproject.domain.auth.entity.User
import javax.inject.Inject

internal class AuthHelperImpl @Inject constructor() : AuthHelper {
    override val user: User
        get() = User("vovka.orel@gmail.com")

    override fun isLoggedIn(): Boolean {
        return true
    }

    override suspend fun storeUser(user: User) {
//        TODO("Not yet implemented")
    }

    override suspend fun logOut() {
//        TODO("Not yet implemented")
    }

}