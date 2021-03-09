package com.pindex.main.models;

import java.lang.System;

/**
 * An experience can either be a Pindex Tour or a Pindex Activity/Event.
 */
@kotlinx.android.parcel.Parcelize()
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001a\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u001c\b\u0002\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\fJ\u001d\u0010\u001d\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005H\u00c6\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003JW\u0010\"\u001a\u00020\u00002\u001c\b\u0002\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001J\t\u0010#\u001a\u00020$H\u00d6\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010\'\u001a\u0004\u0018\u00010(H\u00d6\u0003J\t\u0010)\u001a\u00020$H\u00d6\u0001J\t\u0010*\u001a\u00020\tH\u00d6\u0001J\u0019\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020$H\u00d6\u0001R.\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\n\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0016\"\u0004\b\u001a\u0010\u0018R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0012\"\u0004\b\u001c\u0010\u0014\u00a8\u00060"}, d2 = {"Lcom/pindex/main/models/ExperienceDto;", "Landroid/os/Parcelable;", "content", "Ljava/util/ArrayList;", "Lcom/pindex/main/models/ContentDto;", "Lkotlin/collections/ArrayList;", "createdAt", "Lcom/google/firebase/Timestamp;", "status", "", "type", "updatedAt", "(Ljava/util/ArrayList;Lcom/google/firebase/Timestamp;Ljava/lang/String;Ljava/lang/String;Lcom/google/firebase/Timestamp;)V", "getContent", "()Ljava/util/ArrayList;", "setContent", "(Ljava/util/ArrayList;)V", "getCreatedAt", "()Lcom/google/firebase/Timestamp;", "setCreatedAt", "(Lcom/google/firebase/Timestamp;)V", "getStatus", "()Ljava/lang/String;", "setStatus", "(Ljava/lang/String;)V", "getType", "setType", "getUpdatedAt", "setUpdatedAt", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
public final class ExperienceDto implements android.os.Parcelable {
    @org.jetbrains.annotations.Nullable()
    private java.util.ArrayList<com.pindex.main.models.ContentDto> content;
    @org.jetbrains.annotations.Nullable()
    private com.google.firebase.Timestamp createdAt;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String status;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String type;
    @org.jetbrains.annotations.Nullable()
    private com.google.firebase.Timestamp updatedAt;
    public static final android.os.Parcelable.Creator<com.pindex.main.models.ExperienceDto> CREATOR = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<com.pindex.main.models.ContentDto> getContent() {
        return null;
    }
    
    public final void setContent(@org.jetbrains.annotations.Nullable()
    java.util.ArrayList<com.pindex.main.models.ContentDto> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.google.firebase.Timestamp getCreatedAt() {
        return null;
    }
    
    public final void setCreatedAt(@org.jetbrains.annotations.Nullable()
    com.google.firebase.Timestamp p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStatus() {
        return null;
    }
    
    public final void setStatus(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getType() {
        return null;
    }
    
    public final void setType(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.google.firebase.Timestamp getUpdatedAt() {
        return null;
    }
    
    public final void setUpdatedAt(@org.jetbrains.annotations.Nullable()
    com.google.firebase.Timestamp p0) {
    }
    
    public ExperienceDto(@org.jetbrains.annotations.Nullable()
    java.util.ArrayList<com.pindex.main.models.ContentDto> content, @org.jetbrains.annotations.Nullable()
    com.google.firebase.Timestamp createdAt, @org.jetbrains.annotations.Nullable()
    java.lang.String status, @org.jetbrains.annotations.Nullable()
    java.lang.String type, @org.jetbrains.annotations.Nullable()
    com.google.firebase.Timestamp updatedAt) {
        super();
    }
    
    public ExperienceDto() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<com.pindex.main.models.ContentDto> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.google.firebase.Timestamp component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.google.firebase.Timestamp component5() {
        return null;
    }
    
    /**
     * An experience can either be a Pindex Tour or a Pindex Activity/Event.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.pindex.main.models.ExperienceDto copy(@org.jetbrains.annotations.Nullable()
    java.util.ArrayList<com.pindex.main.models.ContentDto> content, @org.jetbrains.annotations.Nullable()
    com.google.firebase.Timestamp createdAt, @org.jetbrains.annotations.Nullable()
    java.lang.String status, @org.jetbrains.annotations.Nullable()
    java.lang.String type, @org.jetbrains.annotations.Nullable()
    com.google.firebase.Timestamp updatedAt) {
        return null;
    }
    
    /**
     * An experience can either be a Pindex Tour or a Pindex Activity/Event.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    /**
     * An experience can either be a Pindex Tour or a Pindex Activity/Event.
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * An experience can either be a Pindex Tour or a Pindex Activity/Event.
     */
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
    public static final class Creator implements android.os.Parcelable.Creator<com.pindex.main.models.ExperienceDto> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.pindex.main.models.ExperienceDto[] newArray(int size) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.pindex.main.models.ExperienceDto createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
    }
}