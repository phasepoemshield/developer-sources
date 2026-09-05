/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

import java.util.OptionalInt;
import minecraft.class01191;

public final class class01168
extends class01191 {
    private final int N;
    private final int y;

    @Override
    public OptionalInt L() {
        return OptionalInt.of(this.N);
    }

    public int M() {
        return this.y - this.N - 1;
    }

    protected class01168(int n, int n2) {
        this.N = n;
        this.y = n2;
        if (this.M() < 0) {
            throw new IllegalArgumentException("Column of negative height: " + String.valueOf(this));
        }
    }

    public String toString() {
        return "C(" + this.y + "-" + this.N + ")";
    }

    public int i() {
        return this.y;
    }

    @Override
    public OptionalInt u() {
        return OptionalInt.of(this.M());
    }

    @Override
    public OptionalInt y() {
        return OptionalInt.of(this.y);
    }

    public int R() {
        return this.N;
    }
}

