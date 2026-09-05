/*
 * Decompiled with CFR 0.152.
 */
package baritone.api.utils;

import java.util.Objects;

public final class Pair<A, B> {
    private final A a;
    private final B b;

    public Pair(A a, B b) {
        this.a = a;
        this.b = b;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || object.getClass() != Pair.class) {
            return false;
        }
        Pair pair = (Pair)object;
        return Objects.equals(this.a, pair.a) && Objects.equals(this.b, pair.b);
    }

    public int hashCode() {
        return 31 * Objects.hashCode(this.a) + Objects.hashCode(this.b);
    }

    public A first() {
        return this.a;
    }

    public B second() {
        return this.b;
    }
}

