/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02102
 *  minecraft.class06478
 */
package minecraft;

import java.util.function.Consumer;
import minecraft.class02102;
import minecraft.class06478;

public class class02057
implements class02102 {
    private int N;
    private int y;
    private final int L;
    private final int u;

    public class02057(int n, int n2) {
        this(0, 0, n, n2);
    }

    public class02057(int n, int n2, int n3, int n4) {
        this.N = n;
        this.y = n2;
        this.L = n3;
        this.u = n4;
    }

    public static class02057 y(int n) {
        return new class02057(0, n);
    }

    public static class02057 N(int n) {
        return new class02057(n, 0);
    }

    public void method_48206(Consumer<class06478> consumer) {
    }

    public int method_46427() {
        return this.y;
    }

    public void method_46419(int n) {
        this.y = n;
    }

    public int method_46426() {
        return this.N;
    }

    public void method_46421(int n) {
        this.N = n;
    }

    public int method_25364() {
        return this.u;
    }

    public int method_25368() {
        return this.L;
    }
}

