package com.pindex.main.repositories;

import java.lang.System;

/**
 * Experience repository interface.
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\b"}, d2 = {"Lcom/pindex/main/repositories/ExperienceRepository;", "", "getPage", "", "Lcom/pindex/main/models/ExperienceDto;", "limit", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface ExperienceRepository {
    
    /**
     * Return a list of ExperienceDto whose size is defined
     * by the given [limit].
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getPage(long limit, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.pindex.main.models.ExperienceDto>> p1);
}