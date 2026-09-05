/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

import java.util.Optional;
import java.util.OptionalInt;
import minecraft.class05987;
import minecraft.class06009;

public class class06016 {
    private OptionalInt N = OptionalInt.empty();
    private Optional<Integer> y = Optional.empty();
    private Optional<Integer> L = Optional.empty();
    private Optional<Integer> u = Optional.empty();
    private class06009 i = class06009.field_26426;

    public class06016 L(int n) {
        this.L = Optional.of(n);
        return this;
    }

    public class06016 u(int n) {
        this.u = Optional.of(n);
        return this;
    }

    public class06016 y(int n) {
        this.y = Optional.of(n);
        return this;
    }

    public class06016 N(class06009 class060092) {
        this.i = class060092;
        return this;
    }

    public class05987 N() {
        return new class05987(this.N.orElseThrow(() -> new IllegalStateException("Missing 'water' color.")), this.y, this.L, this.u, this.i);
    }

    public class06016 N(int n) {
        this.N = OptionalInt.of(n);
        return this;
    }
}

