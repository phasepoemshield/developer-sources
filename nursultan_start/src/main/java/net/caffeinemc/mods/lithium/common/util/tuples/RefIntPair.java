/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.lithium.common.util.tuples;

import java.util.Objects;

public record RefIntPair<A>(A left, int right) {
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object == null || object.getClass() != ((Object)((Object)this)).getClass()) {
            return false;
        }
        RefIntPair refIntPair = (RefIntPair)((Object)object);
        return this.left == refIntPair.left && this.right == refIntPair.right;
    }

    public String toString() {
        return "RefIntPair[left=" + String.valueOf(this.left) + ", right=" + this.right + "]";
    }

    public int hashCode() {
        return Objects.hash(System.identityHashCode(this.left), this.right);
    }
}

