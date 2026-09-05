/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

import java.util.OptionalInt;
import minecraft.class01191;

public final class class01160
extends class01191 {
    private final int N;
    private final boolean y;

    @Override
    public OptionalInt L() {
        return this.y ? OptionalInt.of(this.N) : OptionalInt.empty();
    }

    public class01160(int n, boolean bl) {
        this.N = n;
        this.y = bl;
    }

    public String toString() {
        return this.y ? "C(" + this.N + "-)" : "C(-" + this.N + ")";
    }

    @Override
    public OptionalInt u() {
        return OptionalInt.empty();
    }

    @Override
    public OptionalInt y() {
        return this.y ? OptionalInt.empty() : OptionalInt.of(this.N);
    }
}

