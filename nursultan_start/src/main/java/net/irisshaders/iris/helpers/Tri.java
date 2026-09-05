/*
 * Decompiled with CFR 0.152.
 */
package net.irisshaders.iris.helpers;

import java.util.Objects;

public record Tri<X, Y, Z>(X first, Y second, Z third) {
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof Tri)) {
            return false;
        }
        Tri tri = (Tri)((Object)object);
        return Objects.equals(tri.first, this.first) && Objects.equals(tri.second, this.second) && Objects.equals(tri.third, this.third);
    }

    public String toString() {
        return "First: " + this.first.toString() + " Second: " + this.second.toString() + " Third: " + this.third.toString();
    }

    public int hashCode() {
        int n = 31;
        int n2 = 1;
        n2 = 31 * n2 + (this.first == null ? 0 : this.first.hashCode());
        n2 = 31 * n2 + (this.second == null ? 0 : this.second.hashCode());
        n2 = 31 * n2 + (this.third == null ? 0 : this.third.hashCode());
        return n2;
    }
}

