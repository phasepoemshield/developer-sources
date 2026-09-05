/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09500
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.Lists
 *  minecraft.class00143
 *  minecraft.class00753
 *  minecraft.class01289
 *  minecraft.class01328
 *  minecraft.class04782
 *  minecraft.class04891
 *  minecraft.class04911
 *  minecraft.class04995
 *  minecraft.class05352
 *  minecraft.class05367
 *  minecraft.class05378
 *  minecraft.class05751
 *  minecraft.class05765
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07079
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07218
 *  minecraft.class07221
 *  minecraft.class07438
 *  minecraft.class07475
 *  minecraft.class07623
 *  minecraft.class07955
 */
package minecraft;

import Nursultan.class09500;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.ToIntFunction;
import minecraft.class00143;
import minecraft.class00753;
import minecraft.class01289;
import minecraft.class01328;
import minecraft.class04782;
import minecraft.class04891;
import minecraft.class04911;
import minecraft.class04995;
import minecraft.class05352;
import minecraft.class05367;
import minecraft.class05378;
import minecraft.class05751;
import minecraft.class05765;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07079;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07218;
import minecraft.class07221;
import minecraft.class07438;
import minecraft.class07475;
import minecraft.class07623;
import minecraft.class07955;

public class class01694<E extends class07475>
extends class05765<E> {
    public static final int N = 160;
    private final ToIntFunction<E> y;
    private final int L;
    private final int u;
    private final float i;
    private final class01328 R;
    private final int Z;
    private final Function<E, class04891> z;
    private Optional<Long> U = Optional.empty();
    private Optional<class09500> E = Optional.empty();

    protected boolean L(class04782 class047822, class07475 class074752, long l) {
        return this.E.isPresent() && this.E.get().L().method_5805();
    }

    public class01694(ToIntFunction<E> toIntFunction, int n, int n2, float f, class01328 class013282, int n3, Function<E, class04891> function) {
        super((Map)ImmutableMap.of((Object)class05378.P, (Object)class05367.field_18458, (Object)class05378.x, (Object)class05367.field_18457, (Object)class05378.B, (Object)class05367.field_18456, (Object)class05378.D, (Object)class05367.field_18457), 160);
        this.y = toIntFunction;
        this.L = n;
        this.u = n2;
        this.i = f;
        this.R = class013282;
        this.Z = n3;
        this.z = function;
    }

    protected void u(class04782 class047822, E e, long l) {
        if (this.E.isEmpty()) {
            return;
        }
        e.method_18868().N(class05378.m, (Object)new class05352(this.E.get().N(), this.i, 0));
        e.method_18868().N(class05378.P, (Object)new class05751((class07049)this.E.get().L(), true));
        if (!this.E.get().L().method_24515().equals((Object)this.E.get().y())) {
            class047822.method_8421(e, (byte)59);
            e.f().W();
            this.y((class07475)e, this.E.get().N);
        } else {
            class07209 class072092 = e.method_24515();
            if (class072092.equals((Object)this.E.get().N())) {
                class047822.method_8421(e, (byte)58);
                if (this.U.isEmpty()) {
                    this.U = Optional.of(l);
                }
                if (l - this.U.get() >= (long)this.Z) {
                    e.method_18868().N(class05378.D, (Object)this.N(class072092, this.E.get().y()));
                    class047822.method_43129(null, e, this.z.apply(e), class04911.field_15254, 1.0f, e.method_6017());
                    this.E = Optional.empty();
                }
            }
        }
    }

    private void y(class07475 class074752, class07438 class074382) {
        this.U = Optional.empty();
        this.E = this.N(class074752, class074382).map(class072092 -> new class09500(class072092, class074382.method_24515(), class074382));
    }

    protected void y(class04782 class047822, E e, long l) {
        class01289 var5 = e.method_18868();
        if (!var5.N(class05378.D)) {
            class047822.method_8421(e, (byte)59);
            var5.N(class05378.x, (Object)this.y.applyAsInt(e));
        }
    }

    protected void N(class04782 class047822, class07475 class074752, long l) {
        class074752.method_18868().L(class05378.B).flatMap(class040512 -> class040512.N(class074382 -> this.R.N(class047822, (class07438)class074752, class074382))).ifPresent(class074382 -> this.y(class074752, (class07438)class074382));
    }

    private class06889 N(class07209 class072092, class07209 class072093) {
        double d = 0.5;
        double d2 = 0.5 * (double)class04995.U((double)(class072093.method_10263() - class072092.method_10263()));
        double d3 = 0.5 * (double)class04995.U((double)(class072093.method_10260() - class072092.method_10260()));
        return class06889.L((class00753)class072093).y(d2, 0.0, d3);
    }

    private Optional<class07209> N(class07475 class074752, class07438 class074382) {
        class07209 class072093 = class074382.method_24515();
        if (!this.N(class074752, class072093)) {
            return Optional.empty();
        }
        ArrayList arrayList = Lists.newArrayList();
        class07218 class072182 = class072093.method_25503();
        for (class07211 class072112 : class07221.field_11062) {
            class072182.N((class00753)class072093);
            for (int i = 0; i < this.u; ++i) {
                if (this.N(class074752, (class07209)class072182.N(class072112))) continue;
                class072182.N(class072112.b());
                break;
            }
            if (class072182.method_19455((class00753)class072093) < this.L) continue;
            arrayList.add(class072182.method_10062());
        }
        class07623 class076232 = class074752.f();
        return arrayList.stream().sorted(Comparator.comparingDouble(arg_0 -> ((class07209)class074752.method_24515()).method_10262(arg_0))).filter(class072092 -> {
            class00143 class001432 = class076232.N(class072092, 0);
            return class001432 != null && class001432.z();
        }).findFirst();
    }

    private boolean N(class07475 class074752, class07209 class072092) {
        return class074752.f().N(class072092) && class074752.N(class07955.N((class07079)class074752, (class07209)class072092)) == 0.0f;
    }
}

