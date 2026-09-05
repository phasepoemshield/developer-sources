/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.api.VolumeCategory
 *  de.maxhenkel.voicechat.api.VolumeCategory$Builder
 *  javax.annotation.Nullable
 */
package de.maxhenkel.voicechat.plugins.impl;

import de.maxhenkel.voicechat.api.VolumeCategory;
import de.maxhenkel.voicechat.plugins.impl.VolumeCategoryImpl;
import javax.annotation.Nullable;

public class VolumeCategoryImpl$BuilderImpl
implements VolumeCategory.Builder {
    private String id;
    private String name;
    @Nullable
    private String nameTranslationKey;
    @Nullable
    private String description;
    @Nullable
    private String descriptionTranslationKey;
    @Nullable
    private int[][] icon;

    public VolumeCategory.Builder setId(String string) {
        this.id = string;
        return this;
    }

    public VolumeCategory.Builder setName(String string) {
        this.name = string;
        return this;
    }

    public VolumeCategory build() {
        if (this.id == null) {
            throw new IllegalStateException("id missing");
        }
        if (this.name == null) {
            throw new IllegalStateException("name missing");
        }
        return new VolumeCategoryImpl(this.id, this.name, this.nameTranslationKey, this.description, this.descriptionTranslationKey, this.icon);
    }

    public VolumeCategory.Builder setIcon(@Nullable int[][] nArray) {
        this.icon = nArray;
        return this;
    }

    public VolumeCategory.Builder setDescription(@Nullable String string) {
        this.description = string;
        return this;
    }

    public VolumeCategory.Builder setDescriptionTranslationKey(@Nullable String string) {
        this.descriptionTranslationKey = string;
        return this;
    }

    public VolumeCategory.Builder setNameTranslationKey(@Nullable String string) {
        this.nameTranslationKey = string;
        return this;
    }
}

