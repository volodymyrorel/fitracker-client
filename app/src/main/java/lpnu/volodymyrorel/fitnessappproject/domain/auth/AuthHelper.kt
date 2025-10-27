package lpnu.volodymyrorel.fitnessappproject.domain.auth

import lpnu.volodymyrorel.fitnessappproject.domain.auth.entity.User

interface AuthHelper {
    val user: User
    fun isLoggedIn(): Boolean
    suspend fun storeUser(user: User)
    suspend fun logOut()
}