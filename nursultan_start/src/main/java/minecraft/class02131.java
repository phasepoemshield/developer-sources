/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04383
 */
package minecraft;

import minecraft.class04383;

public record class02131<T>(int N, class04383<T> y) {
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || ((Object)((Object)this)).getClass() != object.getClass()) {
            return false;
        }
        class02131 class021312 = (class02131)((Object)object);
        return this.N == class021312.N;
    }

    public String toString() {
        return "<entity data: " + this.N + ">";
    }

    public int hashCode() {
        return this.N;
    }
}

