/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02060
 *  minecraft.class02072
 *  minecraft.class02102
 *  minecraft.class03695
 *  minecraft.class07536
 */
package minecraft;

import java.util.function.Consumer;
import minecraft.class01855;
import minecraft.class02060;
import minecraft.class02072;
import minecraft.class02102;
import minecraft.class03695;
import minecraft.class07536;

public class class01885
implements class03695 {
    private final class02060 N;
    private final class01855 y;
    private int L = 0;

    public class02072 L() {
        return this.N.L();
    }

    private class01885(class01855 class018552) {
        this(0, 0, class018552);
    }

    public class01885(int n, int n2, class01855 class018552) {
        this.N = new class02060(n, n2);
        this.y = class018552;
    }

    public static class01885 i() {
        return new class01885(class01855.field_45403);
    }

    public static class01885 u() {
        return new class01885(class01855.field_45404);
    }

    public class02072 y() {
        return this.N.y();
    }

    public class01885 N(int n) {
        this.y.N(this.N, n);
        return this;
    }

    public void N(Consumer<class02102> consumer) {
        this.N.N(consumer);
    }

    public void N() {
        this.N.N();
    }

    public <T extends class02102> T N(T t) {
        return this.N(t, this.y());
    }

    public <T extends class02102> T N(T t, class02072 class020722) {
        return this.y.N(this.N, t, this.L++, class020722);
    }

    public <T extends class02102> T N(T t, Consumer<class02072> consumer) {
        return this.y.N(this.N, t, this.L++, (class02072)class07536.N((Object)this.y(), consumer));
    }

    public int method_46427() {
        return this.N.method_46427();
    }

    public void method_46419(int n) {
        this.N.method_46419(n);
    }

    public int method_46426() {
        return this.N.method_46426();
    }

    public void method_46421(int n) {
        this.N.method_46421(n);
    }

    public int method_25364() {
        return this.N.method_25364();
    }

    public int method_25368() {
        return this.N.method_25368();
    }
}

