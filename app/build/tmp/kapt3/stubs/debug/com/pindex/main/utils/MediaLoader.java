package com.pindex.main.utils;

import java.lang.System;

/**
 * Singleton that provides functions to load media content
 * into views.
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\u000b"}, d2 = {"Lcom/pindex/main/utils/MediaLoader;", "", "()V", "loadImageFromFirebase", "", "imagePath", "", "view", "Landroidx/appcompat/widget/AppCompatImageView;", "loadImageFromURL", "imageURL", "app_debug"})
public final class MediaLoader {
    @org.jetbrains.annotations.NotNull()
    public static final com.pindex.main.utils.MediaLoader INSTANCE = null;
    
    /**
     * Load the image at the given [imageURL] and add it to the given [view].
     */
    public final void loadImageFromURL(@org.jetbrains.annotations.NotNull()
    java.lang.String imageURL, @org.jetbrains.annotations.NotNull()
    androidx.appcompat.widget.AppCompatImageView view) {
    }
    
    /**
     * Load the image from Firebase associated to the given [imagePath] and
     * add it to the given [view].
     */
    public final void loadImageFromFirebase(@org.jetbrains.annotations.NotNull()
    java.lang.String imagePath, @org.jetbrains.annotations.NotNull()
    androidx.appcompat.widget.AppCompatImageView view) {
    }
    
    private MediaLoader() {
        super();
    }
}