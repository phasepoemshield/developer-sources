/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package de.maxhenkel.voicechat.api;

import javax.annotation.Nullable;

public interface VolumeCategory {
    public String getName();

    public String getId();

    @Nullable
    public String getDescription();

    @Nullable
    public String getNameTranslationKey();

    @Nullable
    public String getDescriptionTranslationKey();

    @Nullable
    public int[][] getIcon();
}

