package lpnu.volodymyrorel.fitnessappproject.data.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import lpnu.volodymyrorel.fitnessappproject.data.navigation.NavigatorImpl
import lpnu.volodymyrorel.fitnessappproject.domain.navigation.Navigator
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class NavigatorModule {

    @Singleton
    @Binds
    internal abstract fun provideNavigator(impl: NavigatorImpl): Navigator
}