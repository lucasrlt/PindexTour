package com.pindex.main.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0002J\u0010\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u000fH\u0002J\u0010\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\bH\u0002J\u0012\u0010\u0015\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0002J\u001a\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0002J\b\u0010\u0018\u001a\u00020\rH\u0002J\b\u0010\u0019\u001a\u00020\rH\u0007J\b\u0010\u001a\u001a\u00020\rH\u0007J\b\u0010\u001b\u001a\u00020\rH\u0007J\b\u0010\u001c\u001a\u00020\rH\u0007J\b\u0010\u001d\u001a\u00020\rH\u0007J\b\u0010\u001e\u001a\u00020\rH\u0007J\b\u0010\u001f\u001a\u00020\rH\u0007J\b\u0010 \u001a\u00020\rH\u0007J\b\u0010!\u001a\u00020\rH\u0002J\b\u0010\"\u001a\u00020\rH\u0007R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"}, d2 = {"Lcom/pindex/main/home/ExperienceActivityInstrumentedTest;", "", "()V", "activityScenario", "Landroidx/test/core/app/ActivityScenario;", "Lcom/pindex/main/home/ExperienceActivity;", "blocksList", "Ljava/util/ArrayList;", "Lcom/pindex/main/models/BlockDto;", "Lkotlin/collections/ArrayList;", "faker", "Lio/github/serpro69/kfaker/Faker;", "addAudioBlock", "", "name", "", "sectionTitle", "addBigHeaderBlock", "title", "addBlock", "block", "addBorderlessImageBlock", "addTextBlock", "text", "assertActivityIsDisplayed", "launchingExperienceActivityWithAudioBlockAndSectionTitleDisplaysThem", "launchingExperienceActivityWithAudioBlockDisplaysIt", "launchingExperienceActivityWithBigHeaderBlockDisplaysIt", "launchingExperienceActivityWithBorderlessImageBlockAndSectionTitleDisplaysThem", "launchingExperienceActivityWithBorderlessImageBlockDisplaysIt", "launchingExperienceActivityWithMultipleBlocksDisplaysThem", "launchingExperienceActivityWithTextBlockAndSectionTitleDisplaysThem", "launchingExperienceActivityWithTextBlockDisplaysIt", "startActivityWithBlocksList", "tearDown", "app_debug"})
@org.junit.runner.RunWith(value = androidx.test.ext.junit.runners.AndroidJUnit4.class)
public final class ExperienceActivityInstrumentedTest {
    
    /**
     * Test Experience Activity
     */
    private androidx.test.core.app.ActivityScenario<com.pindex.main.home.ExperienceActivity> activityScenario;
    
    /**
     * Experience Pindex blocks (for a single test at once)
     */
    private java.util.ArrayList<com.pindex.main.models.BlockDto> blocksList;
    
    /**
     * Data Faker
     */
    private final io.github.serpro69.kfaker.Faker faker = null;
    
    @org.junit.After()
    public final void tearDown() {
    }
    
    /**
     * Assert that the Experience activity is displayed.
     */
    private final void assertActivityIsDisplayed() {
    }
    
    /**
     * Add the given [block] to the blocks list.
     */
    private final void addBlock(com.pindex.main.models.BlockDto block) {
    }
    
    /**
     * Start the Experience Activity with the current blocks list.
     */
    private final void startActivityWithBlocksList() {
    }
    
    /**
     * Create and add an Audio block with the given [name] to the blocks list.
     * By passing a [sectionTitle] argument, it will also create a Section Title block.
     */
    private final void addAudioBlock(java.lang.String name, java.lang.String sectionTitle) {
    }
    
    /**
     * Create and add a Big Header block with the given [title] to the blocks list.
     */
    private final void addBigHeaderBlock(java.lang.String title) {
    }
    
    /**
     * Create and add a Borderless Image block to the blocks list.
     * By passing a [sectionTitle] argument, it will also create a Section Title block.
     */
    private final void addBorderlessImageBlock(java.lang.String sectionTitle) {
    }
    
    /**
     * Create and add a Text block with the given [text] to the blocks list.
     * By passing a [sectionTitle] argument, it will also create a Section Title block.
     */
    private final void addTextBlock(java.lang.String text, java.lang.String sectionTitle) {
    }
    
    /**
     * Test that the Experience Activity given an Audio block displays this block.
     */
    @org.junit.Test()
    public final void launchingExperienceActivityWithAudioBlockDisplaysIt() {
    }
    
    /**
     * Test that the Experience Activity given a Text block and a Section Title displays them.
     */
    @org.junit.Test()
    public final void launchingExperienceActivityWithAudioBlockAndSectionTitleDisplaysThem() {
    }
    
    /**
     * Test that the Experience Activity given a Big Header block displays this block.
     */
    @org.junit.Test()
    public final void launchingExperienceActivityWithBigHeaderBlockDisplaysIt() {
    }
    
    /**
     * Test that the Experience Activity given a Borderless Image block displays this block.
     */
    @org.junit.Test()
    public final void launchingExperienceActivityWithBorderlessImageBlockDisplaysIt() {
    }
    
    /**
     * Test that the Experience Activity given a Borderless Image block and a Section Title displays them.
     */
    @org.junit.Test()
    public final void launchingExperienceActivityWithBorderlessImageBlockAndSectionTitleDisplaysThem() {
    }
    
    /**
     * Test that the Experience Activity given a Text block displays this block.
     */
    @org.junit.Test()
    public final void launchingExperienceActivityWithTextBlockDisplaysIt() {
    }
    
    /**
     * Test that the Experience Activity given a Text block and a Section Title displays them.
     */
    @org.junit.Test()
    public final void launchingExperienceActivityWithTextBlockAndSectionTitleDisplaysThem() {
    }
    
    /**
     * Test that the Experience Activity given multiple blocks displays them.
     */
    @org.junit.Test()
    public final void launchingExperienceActivityWithMultipleBlocksDisplaysThem() {
    }
    
    public ExperienceActivityInstrumentedTest() {
        super();
    }
}