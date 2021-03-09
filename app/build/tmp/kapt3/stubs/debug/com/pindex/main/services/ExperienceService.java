package com.pindex.main.services;

import java.lang.System;

/**
 * Experience Service for the Pindex experiences. This class needs
 * a repository in order to get the paginated data.
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lcom/pindex/main/services/ExperienceService;", "", "repository", "Lcom/pindex/main/repositories/ExperienceRepository;", "(Lcom/pindex/main/repositories/ExperienceRepository;)V", "getPage", "", "Lcom/pindex/main/models/ExperienceDto;", "limit", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class ExperienceService {
    private final com.pindex.main.repositories.ExperienceRepository repository = null;
    
    /**
     * Use the repository to get the next chunk of data, limited by the
     * given [limit]. The repository handles the pagination keys.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getPage(long limit, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.pindex.main.models.ExperienceDto>> p1) {
        return null;
    }
    
    public ExperienceService(@org.jetbrains.annotations.NotNull()
    com.pindex.main.repositories.ExperienceRepository repository) {
        super();
    }
}