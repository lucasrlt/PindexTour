package com.pindex.main.viewmodels;

import java.lang.System;

/**
 * Experience view model that gets the data from a Pager.
 * The experience repository is injected at runtime.
 */
@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/pindex/main/viewmodels/ExperienceViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/pindex/main/repositories/ExperienceRepository;", "(Lcom/pindex/main/repositories/ExperienceRepository;)V", "flow", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/pindex/main/models/ExperienceDto;", "getFlow", "()Lkotlinx/coroutines/flow/Flow;", "app_debug"})
public final class ExperienceViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.pindex.main.models.ExperienceDto>> flow = null;
    private final com.pindex.main.repositories.ExperienceRepository repository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.pindex.main.models.ExperienceDto>> getFlow() {
        return null;
    }
    
    @javax.inject.Inject()
    public ExperienceViewModel(@org.jetbrains.annotations.NotNull()
    com.pindex.main.repositories.ExperienceRepository repository) {
        super();
    }
}