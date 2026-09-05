/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class05715
 *  minecraft.class06555
 */
package minecraft;

import com.mojang.serialization.Codec;
import java.util.function.Supplier;
import minecraft.class05715;
import minecraft.class06555;

public record class08413<T extends class06555>(String N, Supplier<T> y, Codec<T> L, class05715 u) {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object object) {
        if (!(object instanceof class08413)) return false;
        class08413 class084132 = (class08413)((Object)object);
        if (!this.N.equals(class084132.N)) return false;
        return true;
    }

    public String toString() {
        return "SavedDataType[" + this.N + "]";
    }

    public int hashCode() {
        return this.N.hashCode();
    }
}

