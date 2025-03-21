package com.droidknights.app2023.tv.di

import android.app.Application
import android.content.Context
import com.droidknights.app2023.core.playback.session.SessionActivityIntentProvider
import com.droidknights.app2023.tv.misc.SessionActivityIntentProviderImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
internal object AndroidModule {
    @Provides
    fun provideContext(@ApplicationContext context: Context): Context = context

    @Provides
    fun toPlayerIntentProvider(
        impl: SessionActivityIntentProviderImpl
    ): SessionActivityIntentProvider = impl
}