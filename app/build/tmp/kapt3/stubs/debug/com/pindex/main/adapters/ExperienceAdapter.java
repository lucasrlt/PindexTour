package com.pindex.main.adapters;

import java.lang.System;

/**
 * An Experience can either be a Pindex Tour or a Pindex Activity/Event.
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00142\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0002\u0014\u0015B\u0005\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\f\u001a\u00020\u00072\n\u0010\r\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u001c\u0010\u0010\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000fH\u0016R(\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u00a8\u0006\u0016"}, d2 = {"Lcom/pindex/main/adapters/ExperienceAdapter;", "Landroidx/paging/PagingDataAdapter;", "Lcom/pindex/main/models/ExperienceDto;", "Lcom/pindex/main/adapters/ExperienceAdapter$ViewHolder;", "()V", "onItemClick", "Lkotlin/Function1;", "", "getOnItemClick", "()Lkotlin/jvm/functions/Function1;", "setOnItemClick", "(Lkotlin/jvm/functions/Function1;)V", "onBindViewHolder", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "ViewHolder", "app_debug"})
public final class ExperienceAdapter extends androidx.paging.PagingDataAdapter<com.pindex.main.models.ExperienceDto, com.pindex.main.adapters.ExperienceAdapter.ViewHolder> {
    
    /**
     * On item click function.
     *
     * Not a good practice to open an activity from a view holder context.
     * An activity should be opened from another activity.
     */
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function1<? super com.pindex.main.models.ExperienceDto, kotlin.Unit> onItemClick;
    private static final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.pindex.main.models.ExperienceDto> ExperiencesComparator = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.pindex.main.adapters.ExperienceAdapter.Companion Companion = null;
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function1<com.pindex.main.models.ExperienceDto, kotlin.Unit> getOnItemClick() {
        return null;
    }
    
    public final void setOnItemClick(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super com.pindex.main.models.ExperienceDto, kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.pindex.main.adapters.ExperienceAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.pindex.main.adapters.ExperienceAdapter.ViewHolder holder, int position) {
    }
    
    public ExperienceAdapter() {
        super(null, null, null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rR\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/pindex/main/adapters/ExperienceAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/pindex/main/adapters/ExperienceAdapter;Landroid/view/View;)V", "experienceDescription", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "experienceTitle", "experienceType", "bind", "", "experience", "Lcom/pindex/main/models/ExperienceDto;", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private android.widget.TextView experienceType;
        private android.widget.TextView experienceTitle;
        private android.widget.TextView experienceDescription;
        
        /**
         * Bind the given [experience] data to the view.
         */
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.pindex.main.models.ExperienceDto experience) {
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/pindex/main/adapters/ExperienceAdapter$Companion;", "", "()V", "ExperiencesComparator", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/pindex/main/models/ExperienceDto;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}