/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package de.maxhenkel.voicechat.api;

import de.maxhenkel.voicechat.api.VolumeCategory;
import javax.annotation.Nullable;

public interface VolumeCategory$Builder {
    public VolumeCategory$Builder setId(String var1);

    public VolumeCategory$Builder setName(String var1);

    public VolumeCategory build();

    public VolumeCategory$Builder setIcon(@Nullable int[][] var1);

    public VolumeCategory$Builder setDescription(@Nullable String var1);

    public VolumeCategory$Builder setDescriptionTranslationKey(@Nullable String var1);

    public VolumeCategory$Builder setNameTranslationKey(@Nullable String var1);
}

