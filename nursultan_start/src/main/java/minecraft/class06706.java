/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.Sets
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00453
 *  minecraft.class01921
 *  minecraft.class01929
 *  minecraft.class03556
 *  minecraft.class04227
 *  minecraft.class05908
 *  minecraft.class05957
 *  minecraft.class05959
 *  minecraft.class06339
 *  minecraft.class06378
 *  minecraft.class06551
 *  minecraft.class06584
 *  minecraft.class07049
 *  minecraft.class07304
 *  minecraft.class07314
 *  minecraft.class07323
 *  minecraft.class07438
 *  minecraft.class07439
 *  minecraft.class07491
 */
package minecraft;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;
import minecraft.class00453;
import minecraft.class01921;
import minecraft.class01929;
import minecraft.class03556;
import minecraft.class04227;
import minecraft.class05908;
import minecraft.class05957;
import minecraft.class05959;
import minecraft.class06339;
import minecraft.class06378;
import minecraft.class06551;
import minecraft.class06584;
import minecraft.class06700;
import minecraft.class07049;
import minecraft.class07304;
import minecraft.class07314;
import minecraft.class07323;
import minecraft.class07438;
import minecraft.class07439;
import minecraft.class07491;

public class class06706
extends class00453 {
    public static final int N = 0;
    public static final MapCodec<class06706> y = RecordCodecBuilder.mapCodec(instance -> class06706.N(instance).and(instance.group((App)class07304.L.fieldOf("enchantment").forGetter(class067062 -> class067062.L), (App)class06339.N.fieldOf("count").forGetter(class067062 -> class067062.u), (App)Codec.INT.optionalFieldOf("limit", (Object)0).forGetter(class067062 -> class067062.i))).apply(instance, class06706::new));
    private final class03556<class07304> L;
    private final class06378 u;
    private final int i;

    private boolean L() {
        return this.i > 0;
    }

    class06706(List<class05957> list, class03556<class07304> class035562, class06378 class063782, int n) {
        super(list);
        this.L = class035562;
        this.u = class063782;
        this.i = n;
    }

    public Set<class07491<?>> y() {
        return Sets.union((Set)ImmutableSet.of((Object)class06551.R), (Set)this.u.y());
    }

    public class05959<class06706> N() {
        return class07439.W;
    }

    public static class06700 N(class01929 class019292, class06378 class063782) {
        class01921 class019212 = class019292.y(class04227.yR);
        return new class06700((class03556<class07304>)class019212.y(class07314.j), class063782);
    }

    public class06584 N(class06584 class065842, class05908 class059082) {
        class07049 class070492 = (class07049)class059082.L(class06551.R);
        if (class070492 instanceof class07438) {
            class07438 class074382 = (class07438)class070492;
            int n = class07323.N(this.L, (class07438)class074382);
            if (n == 0) {
                return class065842;
            }
            float f = (float)n * this.u.y(class059082);
            class065842.M(Math.round(f));
            if (this.L()) {
                class065842.R(this.i);
            }
        }
        return class065842;
    }
}

