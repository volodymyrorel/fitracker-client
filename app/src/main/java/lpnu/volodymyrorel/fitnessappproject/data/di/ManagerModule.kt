package lpnu.volodymyrorel.fitnessappproject.data.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import lpnu.volodymyrorel.fitnessappproject.data.auth.AuthHelperImpl
import lpnu.volodymyrorel.fitnessappproject.domain.auth.AuthHelper
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class ManagerModule {

    @Singleton
    @Binds
    internal abstract fun provideAuthHelper(impl: AuthHelperImpl): AuthHelper
}