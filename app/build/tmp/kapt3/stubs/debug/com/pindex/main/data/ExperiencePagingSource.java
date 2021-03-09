package com.pindex.main.data;

import java.lang.System;

/**
 * Paging Source for the Pindex experiences. This class needs an
 * ExperienceService in order to get the paginated data.
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J7\u0010\u0007\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00030\b2\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lcom/pindex/main/data/ExperiencePagingSource;", "Landroidx/paging/PagingSource;", "", "Lcom/pindex/main/models/ExperienceDto;", "service", "Lcom/pindex/main/services/ExperienceService;", "(Lcom/pindex/main/services/ExperienceService;)V", "load", "Landroidx/paging/PagingSource$LoadResult;", "params", "Landroidx/paging/PagingSource$LoadParams;", "(Landroidx/paging/PagingSource$LoadParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class ExperiencePagingSource extends androidx.paging.PagingSource<java.util.List<? extends com.pindex.main.models.ExperienceDto>, com.pindex.main.models.ExperienceDto> {
    private final com.pindex.main.services.ExperienceService service = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object load(@org.jetbrains.annotations.NotNull()
    androidx.paging.PagingSource.LoadParams<java.util.List<com.pindex.main.models.ExperienceDto>> params, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.paging.PagingSource.LoadResult<java.util.List<com.pindex.main.models.ExperienceDto>, com.pindex.main.models.ExperienceDto>> p1) {
        return null;
    }
    
    public ExperiencePagingSource(@org.jetbrains.annotations.NotNull()
    com.pindex.main.services.ExperienceService service) {
        super();
    }
}