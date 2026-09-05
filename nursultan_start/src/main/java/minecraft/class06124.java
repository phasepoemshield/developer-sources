/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00837
 *  minecraft.class00845
 */
package minecraft;

import java.util.Optional;
import minecraft.class00837;
import minecraft.class00845;
import minecraft.class06110;

public class class06124 {
    private Optional<class00845> N = Optional.empty();
    private Optional<class00845> y = Optional.empty();
    private Optional<class00845> L = Optional.empty();
    private Optional<class00845> u = Optional.empty();
    private Optional<class00845> i = Optional.empty();
    private Optional<class00845> R = Optional.empty();
    private Optional<class00845> M = Optional.empty();

    public class06124 L(class00837 class008372) {
        this.L = Optional.of(class008372.y());
        return this;
    }

    public class06124 M(class00837 class008372) {
        this.M = Optional.of(class008372.y());
        return this;
    }

    public class06124 i(class00837 class008372) {
        this.i = Optional.of(class008372.y());
        return this;
    }

    public class06124 u(class00837 class008372) {
        this.u = Optional.of(class008372.y());
        return this;
    }

    public class06110 y() {
        return new class06110(this.N, this.y, this.L, this.u, this.i, this.R, this.M);
    }

    public class06124 y(class00837 class008372) {
        this.y = Optional.of(class008372.y());
        return this;
    }

    public static class06124 N() {
        return new class06124();
    }

    public class06124 N(class00837 class008372) {
        this.N = Optional.of(class008372.y());
        return this;
    }

    public class06124 R(class00837 class008372) {
        this.R = Optional.of(class008372.y());
        return this;
    }
}

