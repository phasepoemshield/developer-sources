/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03695
 */
package minecraft;

import minecraft.class03695;

public abstract class class02040
implements class03695 {
    private int L;
    private int u;
    protected int N;
    protected int y;

    public class02040(int n, int n2, int n3, int n4) {
        this.L = n;
        this.u = n2;
        this.N = n3;
        this.y = n4;
    }

    public int method_46427() {
        return this.u;
    }

    public void method_46419(int n) {
        this.N(class021022 -> {
            int n2 = class021022.method_46427() + (n - this.method_46427());
            class021022.method_46419(n2);
        });
        this.u = n;
    }

    public int method_46426() {
        return this.L;
    }

    public void method_46421(int n) {
        this.N(class021022 -> {
            int n2 = class021022.method_46426() + (n - this.method_46426());
            class021022.method_46421(n2);
        });
        this.L = n;
    }

    public int method_25364() {
        return this.y;
    }

    public int method_25368() {
        return this.N;
    }
}

