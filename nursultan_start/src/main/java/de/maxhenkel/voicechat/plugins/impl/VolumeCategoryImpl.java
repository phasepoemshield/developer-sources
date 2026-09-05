/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.api.VolumeCategory
 *  javax.annotation.Nullable
 *  minecraft.class00392
 *  minecraft.class00667
 *  minecraft.class07018
 */
package de.maxhenkel.voicechat.plugins.impl;

import de.maxhenkel.voicechat.api.VolumeCategory;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import minecraft.class00392;
import minecraft.class00667;
import minecraft.class07018;

public class VolumeCategoryImpl
implements VolumeCategory {
    public static final Pattern ID_REGEX = Pattern.compile("^[a-z_]{1,16}$");
    private final String id;
    private final String name;
    @Nullable
    private final String nameTranslationKey;
    @Nullable
    private final String description;
    @Nullable
    private final String descriptionTranslationKey;
    @Nullable
    private final int[][] icon;

    public VolumeCategoryImpl(String string, String string2, @Nullable String string3, @Nullable String string4, @Nullable String string5, @Nullable int[][] nArray) {
        if (!ID_REGEX.matcher(string).matches()) {
            throw new IllegalArgumentException("Volume category ID can only contain a-z and _ with a maximum amount of 16 characters");
        }
        this.id = string;
        this.name = string2;
        this.nameTranslationKey = string3;
        this.description = string4;
        this.descriptionTranslationKey = string5;
        this.icon = nArray;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        VolumeCategoryImpl volumeCategoryImpl = (VolumeCategoryImpl)object;
        return this.id.equals(volumeCategoryImpl.id);
    }

    public int hashCode() {
        return this.id.hashCode();
    }

    public void toBytes(class00667 class006672) {
        class006672.N(this.id, 16);
        class006672.N(this.name, 16);
        VolumeCategoryImpl.writeOptionalString(class006672, this.nameTranslationKey);
        VolumeCategoryImpl.writeOptionalString(class006672, this.description);
        VolumeCategoryImpl.writeOptionalString(class006672, this.descriptionTranslationKey);
        class006672.writeBoolean(this.icon != null);
        if (this.icon != null) {
            if (this.icon.length != 16) {
                throw new IllegalStateException("Icon is not 16x16");
            }
            for (int i = 0; i < this.icon.length; ++i) {
                if (this.icon[i].length != 16) {
                    throw new IllegalStateException("Icon is not 16x16");
                }
                for (int j = 0; j < this.icon.length; ++j) {
                    class006672.writeInt(this.icon[i][j]);
                }
            }
        }
    }

    public String getName() {
        return this.name;
    }

    public String getId() {
        return this.id;
    }

    public class00392 getDisplayName() {
        if (this.nameTranslationKey != null) {
            return class00392.N((String)this.nameTranslationKey, (String)this.name);
        }
        return class00392.y((String)this.name);
    }

    @Nullable
    public String getDescription() {
        return this.description;
    }

    public static VolumeCategoryImpl fromBytes(class00667 class006672) {
        String string = class006672.u(16);
        String string2 = class006672.u(16);
        String string3 = VolumeCategoryImpl.readOptionalString(class006672);
        String string4 = VolumeCategoryImpl.readOptionalString(class006672);
        String string5 = VolumeCategoryImpl.readOptionalString(class006672);
        int[][] nArray = null;
        if (class006672.readBoolean()) {
            nArray = new int[16][16];
            for (int i = 0; i < nArray.length; ++i) {
                for (int j = 0; j < nArray.length; ++j) {
                    nArray[i][j] = class006672.readInt();
                }
            }
        }
        return new VolumeCategoryImpl(string, string2, string3, string4, string5, nArray);
    }

    @Nullable
    public String getNameTranslationKey() {
        return this.nameTranslationKey;
    }

    public class00392 getDisplayDescription() {
        if (this.descriptionTranslationKey != null) {
            return class00392.N((String)this.descriptionTranslationKey, (String)this.description);
        }
        return this.description != null ? class00392.y((String)this.description) : class00392.i();
    }

    private static void writeOptionalString(class00667 class006672, @Nullable String string) {
        class006672.writeBoolean(string != null);
        if (string != null) {
            class006672.N(string, Short.MAX_VALUE);
        }
    }

    @Nullable
    public String getDescriptionTranslationKey() {
        return this.descriptionTranslationKey;
    }

    public String getSearchName() {
        if (this.nameTranslationKey == null) {
            return this.name;
        }
        class07018 class070182 = class07018.y();
        return class070182.N(this.nameTranslationKey, this.name);
    }

    @Nullable
    private static String readOptionalString(class00667 class006672) {
        if (class006672.readBoolean()) {
            return class006672.u(Short.MAX_VALUE);
        }
        return null;
    }

    @Nullable
    public int[][] getIcon() {
        return this.icon;
    }
}

