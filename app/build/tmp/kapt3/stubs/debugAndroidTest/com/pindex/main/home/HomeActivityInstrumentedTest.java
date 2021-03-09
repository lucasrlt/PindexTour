package com.pindex.main.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0013B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0007J\b\u0010\u0010\u001a\u00020\u000fH\u0007J\b\u0010\u0011\u001a\u00020\u000fH\u0007J\b\u0010\u0012\u001a\u00020\u000fH\u0007R\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048G\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u00020\t8GX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r\u00a8\u0006\u0014"}, d2 = {"Lcom/pindex/main/home/HomeActivityInstrumentedTest;", "", "()V", "activityScenarioRule", "Landroidx/test/ext/junit/rules/ActivityScenarioRule;", "Lcom/pindex/main/home/HomeActivity;", "getActivityScenarioRule", "()Landroidx/test/ext/junit/rules/ActivityScenarioRule;", "hiltRule", "Ldagger/hilt/android/testing/HiltAndroidRule;", "getHiltRule", "()Ldagger/hilt/android/testing/HiltAndroidRule;", "setHiltRule", "(Ldagger/hilt/android/testing/HiltAndroidRule;)V", "clean", "", "clickingOnARecyclerViewItemLaunchesTheExperienceActivity", "init", "launchingHomeActivityDisplaysExperiencesListFragmentAndRecyclerView", "TestExperienceRepositoryDI", "app_debug"})
@dagger.hilt.android.testing.HiltAndroidTest()
@dagger.hilt.android.testing.UninstallModules(value = {com.pindex.main.di.ExperienceRepositoryDI.class})
public final class HomeActivityInstrumentedTest {
    @org.jetbrains.annotations.NotNull()
    private dagger.hilt.android.testing.HiltAndroidRule hiltRule;
    @org.jetbrains.annotations.NotNull()
    private final androidx.test.ext.junit.rules.ActivityScenarioRule<com.pindex.main.home.HomeActivity> activityScenarioRule = null;
    
    @org.jetbrains.annotations.NotNull()
    @org.junit.Rule(order = 0)
    public final dagger.hilt.android.testing.HiltAndroidRule getHiltRule() {
        return null;
    }
    
    public final void setHiltRule(@org.jetbrains.annotations.NotNull()
    dagger.hilt.android.testing.HiltAndroidRule p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.junit.Rule(order = 1)
    public final androidx.test.ext.junit.rules.ActivityScenarioRule<com.pindex.main.home.HomeActivity> getActivityScenarioRule() {
        return null;
    }
    
    @org.junit.Before()
    public final void init() {
    }
    
    @org.junit.After()
    public final void clean() {
    }
    
    /**
     * Test that the Home activity displays the experiences list fragment
     * and the RecyclerView.
     */
    @org.junit.Test()
    public final void launchingHomeActivityDisplaysExperiencesListFragmentAndRecyclerView() {
    }
    
    /**
     * Test that the Experience activity is displayed after touching an
     * experience from the RecyclerView.
     */
    @org.junit.Test()
    public final void clickingOnARecyclerViewItemLaunchesTheExperienceActivity() {
    }
    
    public HomeActivityInstrumentedTest() {
        super();
    }
    
    /**
     * Use the FirebaseMockExperienceRepository for testing.
     */
    @dagger.hilt.InstallIn(value = {dagger.hilt.android.components.ViewModelComponent.class})
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007\u00a8\u0006\u0005"}, d2 = {"Lcom/pindex/main/home/HomeActivityInstrumentedTest$TestExperienceRepositoryDI;", "", "()V", "provideExperienceRepositoryInterface", "Lcom/pindex/main/repositories/ExperienceRepository;", "app_debug"})
    @dagger.Module()
    public static final class TestExperienceRepositoryDI {
        @org.jetbrains.annotations.NotNull()
        public static final com.pindex.main.home.HomeActivityInstrumentedTest.TestExperienceRepositoryDI INSTANCE = null;
        
        @org.jetbrains.annotations.NotNull()
        @dagger.hilt.android.scopes.ViewModelScoped()
        @dagger.Provides()
        public final com.pindex.main.repositories.ExperienceRepository provideExperienceRepositoryInterface() {
            return null;
        }
        
        private TestExperienceRepositoryDI() {
            super();
        }
    }
}