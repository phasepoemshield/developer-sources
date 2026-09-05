/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02102
 *  minecraft.class03695
 *  minecraft.class06202
 */
package minecraft;

import java.util.function.Consumer;
import minecraft.class00131;
import minecraft.class02102;
import minecraft.class03695;
import minecraft.class06202;

public class class00104
implements class03695 {
    private static final int y = 4;
    private static final int L = 10;
    final class03695 N;
    private final class00131 u;
    private int i;
    private int R;

    public class00104(class06202 class062022, class03695 class036952, int n) {
        this.N = class036952;
        this.u = new class00131(this, class062022, 0, n);
    }

    public void y(int n) {
        this.R = n;
        this.u.method_53533(Math.min(this.N.method_25364(), n));
        this.u.method_65506();
    }

    public void N(Consumer<class02102> consumer) {
        consumer.accept((class02102)this.u);
    }

    public void N() {
        this.N.N();
        int n = this.N.method_25368();
        this.u.method_25358(Math.max(n + 20, this.i));
        this.u.method_53533(Math.min(this.N.method_25364(), this.R));
        this.u.method_65506();
    }

    public void N(int n) {
        this.i = n;
        this.u.method_25358(Math.max(this.N.method_25368(), n));
    }

    public int method_46427() {
        return this.u.method_46427();
    }

    public void method_46419(int n) {
        this.u.method_46419(n);
    }

    public int method_46426() {
        return this.u.method_46426();
    }

    public void method_46421(int n) {
        this.u.method_46421(n);
    }

    public int method_25364() {
        return this.u.method_25364();
    }

    public int method_25368() {
        return this.u.method_25368();
    }
}

