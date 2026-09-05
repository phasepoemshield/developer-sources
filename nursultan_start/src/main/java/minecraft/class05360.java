/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  minecraft.class00734
 *  minecraft.class01289
 *  minecraft.class04051
 *  minecraft.class04782
 *  minecraft.class05298
 *  minecraft.class07438
 */
package minecraft;

import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import minecraft.class00734;
import minecraft.class01289;
import minecraft.class04051;
import minecraft.class04782;
import minecraft.class05298;
import minecraft.class05355;
import minecraft.class05378;
import minecraft.class07438;

public class class05360<T extends class07438>
extends class05355<T> {
    @Override
    public Set<class05378<?>> N() {
        return ImmutableSet.of(class05378.M, class05378.B);
    }

    @Override
    protected void N(class04782 class047822, T t) {
        double d = t.method_45325(class05298.P);
        class00734 class007342 = t.method_5829().L(d, d, d);
        List var6 = class047822.N(class07438.class, class007342, (T class074383) -> class074383 != t && class074383.method_5805());
        var6.sort(Comparator.comparingDouble(arg_0 -> t.method_5858(arg_0)));
        class01289 var7 = t.method_18868();
        var7.N(class05378.M, (Object)var6);
        var7.N(class05378.B, (Object)new class04051(class047822, t, var6));
    }
}

