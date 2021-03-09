package com.pindex.main.di;

import java.lang.System;

/**
 * This class is used by Hilt in order to instantiate
 * an ExperienceRepository interface.
 */
@dagger.hilt.InstallIn(value = {dagger.hilt.android.components.ViewModelComponent.class})
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007\u00a8\u0006\u0005"}, d2 = {"Lcom/pindex/main/di/ExperienceRepositoryDI;", "", "()V", "provideExperienceRepositoryInterface", "Lcom/pindex/main/repositories/ExperienceRepository;", "app_debug"})
@dagger.Module()
public final class ExperienceRepositoryDI {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.scopes.ViewModelScoped()
    @dagger.Provides()
    public final com.pindex.main.repositories.ExperienceRepository provideExperienceRepositoryInterface() {
        return null;
    }
    
    public ExperienceRepositoryDI() {
        super();
    }
}