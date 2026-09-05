/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01065
 *  minecraft.class01894
 *  minecraft.class03428
 *  minecraft.class03457
 *  minecraft.class04355
 *  minecraft.class04995
 *  minecraft.class05216
 *  minecraft.class05220
 *  minecraft.class06202
 *  minecraft.class06478
 *  minecraft.class06611
 *  minecraft.class06744
 *  minecraft.class08394
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;
import java.util.function.BooleanSupplier;
import java.util.function.Function;
import java.util.function.Supplier;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01065;
import minecraft.class01894;
import minecraft.class03428;
import minecraft.class03457;
import minecraft.class04355;
import minecraft.class04995;
import minecraft.class05216;
import minecraft.class05220;
import minecraft.class06202;
import minecraft.class06308;
import minecraft.class06343;
import minecraft.class06347;
import minecraft.class06355;
import minecraft.class06363;
import minecraft.class06372;
import minecraft.class06478;
import minecraft.class06611;
import minecraft.class06744;
import minecraft.class08394;

public class class06366<T>
extends class06308
implements class06744 {
    public static final BooleanSupplier N = () -> class06202.Nq().U();
    private static final List<Boolean> y = ImmutableList.of((Object)Boolean.TRUE, (Object)Boolean.FALSE);
    private final Supplier<T> L;
    private final class00392 u;
    private int i;
    private T R;
    private final class06363<T> M;
    private final Function<T, class00392> B;
    private final Function<class06366<T>, class05216> Z;
    private final class06355<T> z;
    private final class06343 U;
    private final class04355<T> E;
    private final class06372<T> W;

    private class00392 L(T t) {
        return this.U == class06343.field_64540 ? this.B.apply(t) : this.u(t);
    }

    public class05216 L() {
        return class06366.method_32602((class00392)(this.U == class06343.field_64540 ? this.u(this.R) : this.method_25369()));
    }

    class06366(int n, int n2, int n3, int n4, class00392 class003922, class00392 class003923, int n5, T t, Supplier<T> supplier, class06363<T> class063632, Function<T, class00392> function, Function<class06366<T>, class05216> function2, class06355<T> class063552, class04355<T> class043552, class06343 class063432, class06372<T> class063722) {
        super(n, n2, n3, n4, class003922);
        this.u = class003923;
        this.i = n5;
        this.L = supplier;
        this.R = t;
        this.M = class063632;
        this.B = function;
        this.Z = function2;
        this.z = class063552;
        this.U = class063432;
        this.E = class043552;
        this.W = class063722;
        this.u();
    }

    private void u() {
        this.method_47400(this.E.apply(this.R));
    }

    private class05216 u(T t) {
        return class05220.N((class00392)this.u, (class00392)this.B.apply(t));
    }

    private T y(int n) {
        List<T> list = this.M.N();
        return list.get(class04995.L((int)(this.i + n), (int)list.size()));
    }

    public T y() {
        return this.R;
    }

    private void y(T t) {
        class00392 class003922 = this.L(t);
        this.method_25355(class003922);
        this.R = t;
        this.u();
    }

    public static class06347<Boolean> N(class00392 class003922, class00392 class003923, boolean bl2) {
        return new class06347<Boolean>(bl -> bl == Boolean.TRUE ? class003922 : class003923, () -> bl2).N((Collection<Boolean>)y);
    }

    public static <T> class06347<T> N(Function<T, class00392> function, T t) {
        return new class06347<Object>(function, () -> t);
    }

    public static class06347<Boolean> N(boolean bl2) {
        return new class06347<Boolean>(bl -> bl == Boolean.TRUE ? class05220.y : class05220.L, () -> bl2).N((Collection<Boolean>)y);
    }

    public void N() {
        this.N(this.L.get());
    }

    public void N(T t) {
        int n = this.M.N().indexOf(t);
        if (n != -1) {
            this.i = n;
        }
        this.y(t);
    }

    private void N(int n) {
        List<T> list = this.M.N();
        this.i = class04995.L((int)(this.i + n), (int)list.size());
        T t = list.get(this.i);
        this.y(t);
        this.z.onValueChange(this, t);
    }

    public static <T> class06347<T> N_58(Function<T, class00392> function, Supplier<T> supplier) {
        return new class06347<T>(function, supplier);
    }

    public boolean method_25401(double d, double d2, double d3, double d4) {
        if (d4 > 0.0) {
            this.N(-1);
        } else if (d4 < 0.0) {
            this.N(1);
        }
        return true;
    }

    @Override
    public void method_25306(class06611 class066112) {
        if (class066112.W()) {
            this.N(-1);
        } else {
            this.N(1);
        }
    }

    @Override
    protected void method_75752(class01054 class010542, int n, int n2, float f) {
        class01894 class018942 = this.W.apply(this, this.y());
        if (class018942 != null) {
            class010542.N(class08394.Na, class018942, this.method_46426(), this.method_46427(), this.method_25368(), this.method_25364());
        } else {
            this.method_75794(class010542);
        }
        if (this.U != class06343.field_64541) {
            this.method_75793(class010542.N((class06478)this, class01065.field_63850));
        }
    }

    public void method_47399(class03428 class034282) {
        class034282.N(class03457.field_33788, (class00392)this.method_25360());
        if (this.field_22763) {
            T t = this.y(1);
            class00392 class003922 = this.L(t);
            if (this.method_25370()) {
                class034282.N(class03457.field_33791, (class00392)class00392.N((String)"narration.cycle_button.usage.focused", (Object[])new Object[]{class003922}));
            } else {
                class034282.N(class03457.field_33791, (class00392)class00392.N((String)"narration.cycle_button.usage.hovered", (Object[])new Object[]{class003922}));
            }
        }
    }

    protected class05216 method_25360() {
        return this.Z.apply(this);
    }
}

