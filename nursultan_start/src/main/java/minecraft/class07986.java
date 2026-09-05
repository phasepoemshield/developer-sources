/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00453
 *  minecraft.class01894
 *  minecraft.class02484
 *  minecraft.class02833
 *  minecraft.class02834
 *  minecraft.class03556
 *  minecraft.class05908
 *  minecraft.class05957
 *  minecraft.class05959
 *  minecraft.class06069
 *  minecraft.class06378
 *  minecraft.class06584
 *  minecraft.class07439
 *  minecraft.class07463
 *  minecraft.class07468
 *  minecraft.class07471
 *  minecraft.class07491
 *  minecraft.class07536
 */
package minecraft;

import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;
import minecraft.class00453;
import minecraft.class01894;
import minecraft.class02484;
import minecraft.class02833;
import minecraft.class02834;
import minecraft.class03556;
import minecraft.class05908;
import minecraft.class05957;
import minecraft.class05959;
import minecraft.class06069;
import minecraft.class06378;
import minecraft.class06584;
import minecraft.class07439;
import minecraft.class07463;
import minecraft.class07468;
import minecraft.class07471;
import minecraft.class07491;
import minecraft.class07536;
import minecraft.class07965;
import minecraft.class07968;
import minecraft.class07992;

public class class07986
extends class00453 {
    public static final MapCodec<class07986> N = RecordCodecBuilder.mapCodec(instance -> class07986.N(instance).and(instance.group((App)class07965.R.listOf().fieldOf("modifiers").forGetter(class079862 -> class079862.y), (App)Codec.BOOL.optionalFieldOf("replace", (Object)true).forGetter(class079862 -> class079862.L))).apply(instance, class07986::new));
    private final List<class07965> y;
    private final boolean L;

    public static class07992 L() {
        return new class07992();
    }

    class07986(List<class05957> list, List<class07965> list2, boolean bl) {
        super(list);
        this.y = List.copyOf(list2);
        this.L = bl;
    }

    public Set<class07491<?>> y() {
        return (Set)this.y.stream().flatMap(class079652 -> class079652.u().y().stream()).collect(ImmutableSet.toImmutableSet());
    }

    public class06584 N(class06584 class065842, class05908 class059082) {
        if (this.L) {
            class065842.N(class02484.b, (Object)this.N(class059082, class02833.N));
        } else {
            class065842.N(class02484.b, (Object)class02833.N, class028332 -> this.N(class059082, (class02833)class028332));
        }
        return class065842;
    }

    private class02833 N(class05908 class059082, class02833 class028332) {
        class06069 class060692 = class059082.y();
        for (class07965 class079652 : this.y) {
            class02834 class028342 = (class02834)class07536.N_77(class079652.i(), (class06069)class060692);
            class028332 = class028332.N(class079652.y(), new class07471(class079652.N(), (double)class079652.u().y(class059082), class079652.L()), class028342);
        }
        return class028332;
    }

    public static class07968 N(class01894 class018942, class03556<class07468> class035562, class07463 class074632, class06378 class063782) {
        return new class07968(class018942, class035562, class074632, class063782);
    }

    public class05959<class07986> N() {
        return class07439.P;
    }
}

