/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package com.viaversion.viaversion.api.data;

import com.viaversion.viaversion.api.data.FullMappings;
import org.checkerframework.checker.nullness.qual.Nullable;

public interface Mappings {
    default public boolean isIdentity() {
        return false;
    }

    public int size();

    default public boolean contains(int id) {
        return this.getNewId(id) != -1;
    }

    public Mappings inverse();

    public static boolean isFullIdentity(@Nullable Mappings mappings) {
        return mappings == null || mappings.isIdentity();
    }

    default public int getNewIdOrDefault(int id, int def) {
        int mappedId = this.getNewId(id);
        return mappedId != -1 ? mappedId : def;
    }

    public static boolean isIntIdIdentity(@Nullable Mappings mappings) {
        boolean bl;
        if (mappings == null) {
            return true;
        }
        if (mappings instanceof FullMappings) {
            FullMappings fullMappings = (FullMappings)mappings;
            bl = fullMappings.isIntIdIdentity();
        } else {
            bl = mappings.isIdentity();
        }
        return bl;
    }

    public void setNewId(int var1, int var2);

    public int getNewId(int var1);

    public int mappedSize();
}

