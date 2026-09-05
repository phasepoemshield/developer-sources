/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

import java.util.Optional;
import minecraft.class00759;
import minecraft.class00789;
import minecraft.class00798;
import minecraft.class00816;
import minecraft.class00821;

public class class00764 {
    private class00816 N = class00816.L;
    private class00816 y = class00816.L;
    private Optional<class00821> L = Optional.empty();
    private Optional<Boolean> u = Optional.empty();
    private Optional<class00759> i = Optional.empty();

    public class00798 y() {
        return new class00798(this.N, this.y, this.L, this.u, this.i);
    }

    public class00764 y(class00816 class008162) {
        this.y = class008162;
        return this;
    }

    public class00764 N(class00821 class008212) {
        this.L = Optional.of(class008212);
        return this;
    }

    public class00764 N(class00789 class007892) {
        this.i = Optional.of(class007892.y());
        return this;
    }

    public class00764 N(class00759 class007592) {
        this.i = Optional.of(class007592);
        return this;
    }

    public class00764 N(Boolean bl) {
        this.u = Optional.of(bl);
        return this;
    }

    public static class00764 N() {
        return new class00764();
    }

    public class00764 N(class00816 class008162) {
        this.N = class008162;
        return this;
    }
}

