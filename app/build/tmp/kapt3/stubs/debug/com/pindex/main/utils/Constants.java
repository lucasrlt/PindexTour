package com.pindex.main.utils;

import java.lang.System;

/**
 * Singleton that provides constants.
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0002\u0007\bB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/pindex/main/utils/Constants;", "", "()V", "ACTIVITY_EXPERIENCE_EXTRA_NAME", "", "EXPERIENCES_REPOSITORY_PAGE_SIZE", "", "BlockFragmentArguments", "BlocksTypes", "app_debug"})
public final class Constants {
    
    /**
     * The experience activity extra name to pass data.
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTIVITY_EXPERIENCE_EXTRA_NAME = "EXTRA_EXPERIENCE";
    
    /**
     * Number of experiences to fetch per request.
     */
    public static final long EXPERIENCES_REPOSITORY_PAGE_SIZE = 10L;
    @org.jetbrains.annotations.NotNull()
    public static final com.pindex.main.utils.Constants INSTANCE = null;
    
    private Constants() {
        super();
    }
    
    /**
     * The Pindex blocks fragments arguments names to pass data.
     */
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/pindex/main/utils/Constants$BlockFragmentArguments;", "", "()V", "AUDIO_BLOCK_AUDIO_PATH", "", "AUDIO_BLOCK_IMAGE_PATH", "AUDIO_BLOCK_NAME", "BIG_HEADER_BLOCK_TITLE", "BORDERLESS_IMAGE_BLOCK_TITLE", "SECTION_TITLE_BLOCK_TITLE", "TEXT_BLOCK_TEXT", "app_debug"})
    public static final class BlockFragmentArguments {
        
        /**
         * The audio block audio path argument.
         */
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String AUDIO_BLOCK_AUDIO_PATH = "audioPath";
        
        /**
         * The audio block image path argument.
         */
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String AUDIO_BLOCK_IMAGE_PATH = "imagePath";
        
        /**
         * The audio block name argument.
         */
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String AUDIO_BLOCK_NAME = "name";
        
        /**
         * The big header block title argument.
         */
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String BIG_HEADER_BLOCK_TITLE = "title";
        
        /**
         * The borderless image block image path argument.
         */
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String BORDERLESS_IMAGE_BLOCK_TITLE = "imagePath";
        
        /**
         * The section title block title argument.
         */
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String SECTION_TITLE_BLOCK_TITLE = "title";
        
        /**
         * The text block text argument.
         */
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String TEXT_BLOCK_TEXT = "text";
        @org.jetbrains.annotations.NotNull()
        public static final com.pindex.main.utils.Constants.BlockFragmentArguments INSTANCE = null;
        
        private BlockFragmentArguments() {
            super();
        }
    }
    
    /**
     * The Pindex blocks types.
     */
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/pindex/main/utils/Constants$BlocksTypes;", "", "()V", "AUDIO", "", "BIG_HEADER", "BORDERLESS_IMAGE", "TEXT", "app_debug"})
    public static final class BlocksTypes {
        
        /**
         * Audio block.
         */
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String AUDIO = "audio";
        
        /**
         * Big Header block.
         */
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String BIG_HEADER = "bigHeader";
        
        /**
         * Borderless Image block.
         */
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String BORDERLESS_IMAGE = "borderlessImage";
        
        /**
         * Text block.
         */
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String TEXT = "text";
        @org.jetbrains.annotations.NotNull()
        public static final com.pindex.main.utils.Constants.BlocksTypes INSTANCE = null;
        
        private BlocksTypes() {
            super();
        }
    }
}