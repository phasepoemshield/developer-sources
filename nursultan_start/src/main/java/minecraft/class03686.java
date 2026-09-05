/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01590
 *  minecraft.class02071
 *  minecraft.class02072
 *  minecraft.class02077
 *  minecraft.class02102
 *  minecraft.class05096
 */
package minecraft;

import java.util.function.Consumer;
import minecraft.class00392;
import minecraft.class01590;
import minecraft.class02071;
import minecraft.class02072;
import minecraft.class02077;
import minecraft.class02102;
import minecraft.class03695;
import minecraft.class05096;

public class class03686
implements class03695 {
    public static final int N = 13;
    public static final int y = 33;
    private static final int L = 30;
    private final class02077 u = new class02077();
    private final class02077 i = new class02077();
    private final class02077 R = new class02077();
    private final class05096 M;
    private int B;
    private int Z;

    public int L() {
        return this.B;
    }

    public <T extends class02102> T L(T t) {
        return (T)this.R.N(t);
    }

    public <T extends class02102> T L(T t, Consumer<class02072> consumer) {
        return (T)this.R.N(t, consumer);
    }

    public class03686(class05096 class050962) {
        this(class050962, 33);
    }

    public class03686(class05096 class050962, int n, int n2) {
        this.M = class050962;
        this.B = n;
        this.Z = n2;
        this.u.L().N(0.5f, 0.5f);
        this.i.L().N(0.5f, 0.5f);
    }

    public class03686(class05096 class050962, int n) {
        this(class050962, n, n);
    }

    public int u() {
        return this.M.field_22790 - this.L() - this.y();
    }

    public <T extends class02102> T y(T t, Consumer<class02072> consumer) {
        return (T)this.i.N(t, consumer);
    }

    public void y(int n) {
        this.B = n;
    }

    public <T extends class02102> T y(T t) {
        return (T)this.i.N(t);
    }

    public int y() {
        return this.Z;
    }

    @Override
    public void N() {
        int n = this.L();
        int n2 = this.y();
        this.u.y(this.M.field_22789);
        this.u.N(n);
        this.u.y(0, 0);
        this.u.N();
        this.i.y(this.M.field_22789);
        this.i.N(n2);
        this.i.N();
        this.i.method_46419(this.M.field_22790 - n2);
        this.R.y(this.M.field_22789);
        this.R.N();
        int n3 = n + 30;
        int n4 = this.M.field_22790 - n2 - this.R.method_25364();
        this.R.y(0, Math.min(n3, n4));
    }

    public <T extends class02102> T N(T t) {
        return (T)this.u.N(t);
    }

    public void N(class00392 class003922, class01590 class015902) {
        this.u.N((class02102)new class02071(class003922, class015902));
    }

    public <T extends class02102> T N(T t, Consumer<class02072> consumer) {
        return (T)this.u.N(t, consumer);
    }

    public void N(int n) {
        this.Z = n;
    }

    @Override
    public void N(Consumer<class02102> consumer) {
        this.u.N(consumer);
        this.R.N(consumer);
        this.i.N(consumer);
    }

    public int method_46427() {
        return 0;
    }

    public void method_46419(int n) {
    }

    public int method_46426() {
        return 0;
    }

    public void method_46421(int n) {
    }

    public int method_25364() {
        return this.M.field_22790;
    }

    public int method_25368() {
        return this.M.field_22789;
    }
}

