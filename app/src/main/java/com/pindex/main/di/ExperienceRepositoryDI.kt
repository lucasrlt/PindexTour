package com.pindex.main.di

import com.pindex.main.repositories.ExperienceRepository
import com.pindex.main.repositories.FirebaseExperienceRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

/**
 * This class is used by Hilt in order to instantiate
 * an ExperienceRepository interface.
 */
@Module
@InstallIn(ViewModelComponent::class)
class ExperienceRepositoryDI {

    @Provides
    @ViewModelScoped
    fun provideExperienceRepositoryInterface(): ExperienceRepository {
        return FirebaseExperienceRepository()
    }

}