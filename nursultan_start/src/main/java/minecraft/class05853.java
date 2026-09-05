/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

import minecraft.class05845;

public class class05853
implements class05845 {
    private final int[] N;

    public class05853(int n) {
        this.N = new int[n];
    }

    @Override
    public int N() {
        return this.N.length;
    }

    @Override
    public void N(int n, int n2) {
        this.N[n] = n2;
    }

    @Override
    public int N(int n) {
        return this.N[n];
    }
}

