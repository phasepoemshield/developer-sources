/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09965
 */
package Nursultan;

import Nursultan.class09965;

public final class class10012 {
    private final Float N;
    private final Integer y;
    private final class09965 L;

    public class09965 L() {
        return this.L;
    }

    private class10012(Float f, Integer n, class09965 class099652) {
        this.N = f;
        this.y = n;
        this.L = class099652;
    }

    public Integer y() {
        return this.y;
    }

    public class10012 N(class09965 class099652) {
        return new class10012(this.N, this.y, class099652);
    }

    public Float N() {
        return this.N;
    }

    public static class10012 N(float f, int n) {
        return new class10012(Float.valueOf(Math.max(0.0f, f)), n, null);
    }

    public class10012 N(float f) {
        return new class10012(this.N, this.y, class09965.N((float)f));
    }
}

