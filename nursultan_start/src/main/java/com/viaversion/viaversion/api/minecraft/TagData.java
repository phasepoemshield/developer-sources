/*
 * Decompiled with CFR 0.152.
 */
package com.viaversion.viaversion.api.minecraft;

import java.util.Arrays;

public record TagData(String identifier, int[] entries) {
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || ((Object)((Object)this)).getClass() != o.getClass()) {
            return false;
        }
        TagData tagData = (TagData)((Object)o);
        if (!this.identifier.equals(tagData.identifier)) {
            return false;
        }
        return Arrays.equals(this.entries, tagData.entries);
    }

    public int hashCode() {
        int result = this.identifier.hashCode();
        result = 31 * result + Arrays.hashCode(this.entries);
        return result;
    }
}

