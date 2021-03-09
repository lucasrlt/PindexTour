package com.pindex.main.ui.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\b\u0010\u000f\u001a\u00020\nH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/pindex/main/ui/fragments/ExperienceFragment;", "Landroidx/fragment/app/Fragment;", "()V", "adapter", "Lcom/pindex/main/adapters/ExperienceAdapter;", "rvActivity", "Landroidx/recyclerview/widget/RecyclerView;", "viewModel", "Lcom/pindex/main/viewmodels/ExperienceViewModel;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "setRecyclerViewOnItemClick", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class ExperienceFragment extends androidx.fragment.app.Fragment {
    private androidx.recyclerview.widget.RecyclerView rvActivity;
    private com.pindex.main.viewmodels.ExperienceViewModel viewModel;
    private com.pindex.main.adapters.ExperienceAdapter adapter;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * Display the clicked item activity.
     */
    private final void setRecyclerViewOnItemClick() {
    }
    
    public ExperienceFragment() {
        super();
    }
}