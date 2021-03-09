package com.pindex.main.models;

import java.lang.System;

@kotlinx.android.parcel.Parcelize()
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u001c\b\u0002\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bJ\u001d\u0010\u0011\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005H\u00c6\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J3\u0010\u0013\u001a\u00020\u00002\u001c\b\u0002\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u0015H\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001J\u0019\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0015H\u00d6\u0001R.\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\""}, d2 = {"Lcom/pindex/main/models/BlocksWrapperDto;", "Landroid/os/Parcelable;", "blocks", "Ljava/util/ArrayList;", "Lcom/pindex/main/models/BlockDto;", "Lkotlin/collections/ArrayList;", "type", "Lcom/pindex/main/models/BlocksWrapperCategoryEnum;", "(Ljava/util/ArrayList;Lcom/pindex/main/models/BlocksWrapperCategoryEnum;)V", "getBlocks", "()Ljava/util/ArrayList;", "setBlocks", "(Ljava/util/ArrayList;)V", "getType", "()Lcom/pindex/main/models/BlocksWrapperCategoryEnum;", "setType", "(Lcom/pindex/main/models/BlocksWrapperCategoryEnum;)V", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
public final class BlocksWrapperDto implements android.os.Parcelable {
    @org.jetbrains.annotations.Nullable()
    private java.util.ArrayList<com.pindex.main.models.BlockDto> blocks;
    @org.jetbrains.annotations.Nullable()
    private com.pindex.main.models.BlocksWrapperCategoryEnum type;
    public static final android.os.Parcelable.Creator<com.pindex.main.models.BlocksWrapperDto> CREATOR = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<com.pindex.main.models.BlockDto> getBlocks() {
        return null;
    }
    
    public final void setBlocks(@org.jetbrains.annotations.Nullable()
    java.util.ArrayList<com.pindex.main.models.BlockDto> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.pindex.main.models.BlocksWrapperCategoryEnum getType() {
        return null;
    }
    
    public final void setType(@org.jetbrains.annotations.Nullable()
    com.pindex.main.models.BlocksWrapperCategoryEnum p0) {
    }
    
    public BlocksWrapperDto(@org.jetbrains.annotations.Nullable()
    java.util.ArrayList<com.pindex.main.models.BlockDto> blocks, @org.jetbrains.annotations.Nullable()
    com.pindex.main.models.BlocksWrapperCategoryEnum type) {
        super();
    }
    
    public BlocksWrapperDto() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<com.pindex.main.models.BlockDto> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.pindex.main.models.BlocksWrapperCategoryEnum component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.pindex.main.models.BlocksWrapperDto copy(@org.jetbrains.annotations.Nullable()
    java.util.ArrayList<com.pindex.main.models.BlockDto> blocks, @org.jetbrains.annotations.Nullable()
    com.pindex.main.models.BlocksWrapperCategoryEnum type) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel, int flags) {
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 3)
    public static final class Creator implements android.os.Parcelable.Creator<com.pindex.main.models.BlocksWrapperDto> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.pindex.main.models.BlocksWrapperDto[] newArray(int size) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.pindex.main.models.BlocksWrapperDto createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
    }
}