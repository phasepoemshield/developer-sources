/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

import java.util.Optional;
import minecraft.class00820;

public class class00854 {
    private Optional<Boolean> N = Optional.empty();
    private Optional<Boolean> y = Optional.empty();
    private Optional<Boolean> L = Optional.empty();
    private Optional<Boolean> u = Optional.empty();
    private Optional<Boolean> i = Optional.empty();
    private Optional<Boolean> R = Optional.empty();
    private Optional<Boolean> M = Optional.empty();
    private Optional<Boolean> B = Optional.empty();
    private Optional<Boolean> Z = Optional.empty();

    public class00854 L(Boolean bl) {
        this.L = Optional.of(bl);
        return this;
    }

    public class00854 M(Boolean bl) {
        this.M = Optional.of(bl);
        return this;
    }

    public class00854 B(Boolean bl) {
        this.B = Optional.of(bl);
        return this;
    }

    public class00854 Z(Boolean bl) {
        this.Z = Optional.of(bl);
        return this;
    }

    public class00854 i(Boolean bl) {
        this.i = Optional.of(bl);
        return this;
    }

    public class00854 u(Boolean bl) {
        this.u = Optional.of(bl);
        return this;
    }

    public class00820 y() {
        return new class00820(this.N, this.y, this.L, this.u, this.i, this.R, this.M, this.B, this.Z);
    }

    public class00854 y(Boolean bl) {
        this.y = Optional.of(bl);
        return this;
    }

    public static class00854 N() {
        return new class00854();
    }

    public class00854 N(Boolean bl) {
        this.N = Optional.of(bl);
        return this;
    }

    public class00854 R(Boolean bl) {
        this.R = Optional.of(bl);
        return this;
    }
}

