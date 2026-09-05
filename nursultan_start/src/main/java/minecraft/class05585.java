/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableMap$Builder
 *  minecraft.class01289
 *  minecraft.class04782
 *  minecraft.class04995
 *  minecraft.class05352
 *  minecraft.class05367
 *  minecraft.class05378
 *  minecraft.class05751
 *  minecraft.class05765
 *  minecraft.class05779
 *  minecraft.class07049
 *  minecraft.class07438
 *  minecraft.class07475
 *  minecraft.class07536
 *  minecraft.class08036
 */
package minecraft;

import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import minecraft.class01289;
import minecraft.class04782;
import minecraft.class04995;
import minecraft.class05352;
import minecraft.class05367;
import minecraft.class05378;
import minecraft.class05751;
import minecraft.class05765;
import minecraft.class05779;
import minecraft.class07049;
import minecraft.class07438;
import minecraft.class07475;
import minecraft.class07536;
import minecraft.class08036;

public class class05585
extends class05765<class07475> {
    public static final int N = 100;
    public static final double y = 2.5;
    public static final double L = 3.5;
    private final Function<class07438, Float> u;
    private final Function<class07438, Double> i;
    private final boolean R;

    protected void L(class04782 class047822, class07475 class074752, long l) {
        class01289 var5 = class074752.method_18868();
        var5.N(class05378.p, (Object)100);
        var5.y(class05378.A);
        var5.y(class05378.m);
        var5.y(class05378.P);
    }

    public class05585(Function<class07438, Float> function) {
        this(function, class074382 -> 2.5);
    }

    public class05585(Function<class07438, Float> function, Function<class07438, Double> function2, boolean bl) {
        super((Map)class07536.N(() -> {
            ImmutableMap.Builder builder = ImmutableMap.builder();
            builder.put((Object)class05378.P, (Object)class05367.field_18458);
            builder.put((Object)class05378.m, (Object)class05367.field_18458);
            builder.put((Object)class05378.p, (Object)class05367.field_18457);
            builder.put((Object)class05378.A, (Object)class05367.field_18457);
            builder.put((Object)class05378.a, (Object)class05367.field_18456);
            builder.put((Object)class05378.j, (Object)class05367.field_18457);
            builder.put((Object)class05378.NN, (Object)class05367.field_18457);
            return builder.build();
        }));
        this.u = function;
        this.i = function2;
        this.R = bl;
    }

    public class05585(Function<class07438, Float> function, Function<class07438, Double> function2) {
        this(function, function2, false);
    }

    protected void u(class04782 class047822, class07475 class074752, long l) {
        class08036 class080362 = this.y(class074752).get();
        class01289 var6 = class074752.method_18868();
        var6.N(class05378.P, (Object)new class05751((class07049)class080362, true));
        double d = this.i.apply((class07438)class074752);
        if (class074752.method_5858((class07049)class080362) < class04995.E((double)d)) {
            var6.y(class05378.m);
        } else {
            var6.N(class05378.m, (Object)new class05352((class05779)new class05751((class07049)class080362, this.R, this.R), this.N(class074752), 2));
        }
    }

    private Optional<class08036> y(class07475 class074752) {
        return class074752.method_18868().L(class05378.a);
    }

    protected void y(class04782 class047822, class07475 class074752, long l) {
        class074752.method_18868().N(class05378.A, (Object)true);
    }

    protected float N(class07475 class074752) {
        return this.u.apply((class07438)class074752).floatValue();
    }

    protected boolean N(long l) {
        return false;
    }

    protected boolean N(class04782 class047822, class07475 class074752, long l) {
        return this.y(class074752).isPresent() && !class074752.method_18868().N(class05378.j) && !class074752.method_18868().N(class05378.NN);
    }
}

