/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03735
 */
package minecraft;

import minecraft.class03735;

public class class07726 {
    public static final int N = 0x200000;
    public static final int y = 0x6400000;
    private static final int L = 512;
    private final long u;
    private long i;
    private final int R;
    private int M;

    public static class07726 L() {
        return new class07726(Long.MAX_VALUE, 512);
    }

    public int M() {
        return this.M;
    }

    public class07726(long l, int n) {
        this.u = l;
        this.R = n;
    }

    public void i() {
        if (this.M <= 0) {
            throw new class03735("NBT-Accounter tried to pop stack-depth at top-level");
        }
        --this.M;
    }

    public void u() {
        if (this.M >= this.R) {
            throw new class03735("Tried to read NBT tag with too high complexity, depth > " + this.R);
        }
        ++this.M;
    }

    public void y(long l) {
        if (l < 0L) {
            throw new IllegalArgumentException("Tried to account NBT tag with negative size: " + l);
        }
        if (this.i + l > this.u) {
            throw new class03735("Tried to read NBT tag that was too big; tried to allocate: " + this.i + " + " + l + " bytes where max allowed: " + this.u);
        }
        this.i += l;
    }

    public static class07726 y() {
        return new class07726(0x6400000L, 512);
    }

    public void N(long l, long l2) {
        this.y(l * l2);
    }

    public static class07726 N() {
        return new class07726(0x200000L, 512);
    }

    public static class07726 N(long l) {
        return new class07726(l, 512);
    }

    public long R() {
        return this.i;
    }
}

