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
 *  minecraft.class03556
 *  minecraft.class04995
 *  minecraft.class05908
 *  minecraft.class05957
 *  minecraft.class05959
 *  minecraft.class06339
 *  minecraft.class06378
 *  minecraft.class06570
 *  minecraft.class06584
 *  minecraft.class07304
 *  minecraft.class07310
 *  minecraft.class07323
 *  minecraft.class07439
 *  minecraft.class07491
 */
package minecraft;

import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Set;
import minecraft.class00453;
import minecraft.class03556;
import minecraft.class04995;
import minecraft.class05908;
import minecraft.class05957;
import minecraft.class05959;
import minecraft.class06339;
import minecraft.class06378;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class07304;
import minecraft.class07310;
import minecraft.class07323;
import minecraft.class07439;
import minecraft.class07491;

public class class04815
extends class00453 {
    public static final MapCodec<class04815> N = RecordCodecBuilder.mapCodec(instance -> class04815.N(instance).and(instance.group((App)Codec.unboundedMap((Codec)class07304.L, (Codec)class06339.N).optionalFieldOf("enchantments", Map.of()).forGetter(class048152 -> class048152.y), (App)Codec.BOOL.fieldOf("add").orElse((Object)false).forGetter(class048152 -> class048152.L))).apply(instance, class04815::new));
    private final Map<class03556<class07304>, class06378> y;
    private final boolean L;

    class04815(List<class05957> list, Map<class03556<class07304>, class06378> map, boolean bl) {
        super(list);
        this.y = Map.copyOf(map);
        this.L = bl;
    }

    public Set<class07491<?>> y() {
        return (Set)this.y.values().stream().flatMap(class063782 -> class063782.y().stream()).collect(ImmutableSet.toImmutableSet());
    }

    public class06584 N(class06584 class065842, class05908 class059082) {
        if (class065842.N(class06570.jY)) {
            class065842 = class065842.N((class07310)class06570.Gq);
        }
        class07323.N((class06584)class065842, class027152 -> {
            if (this.L) {
                this.y.forEach((class035562, class063782) -> class027152.N(class035562, class04995.N((int)(class027152.N(class035562) + class063782.N(class059082)), (int)0, (int)255)));
            } else {
                this.y.forEach((class035562, class063782) -> class027152.N(class035562, class04995.N((int)class063782.N(class059082), (int)0, (int)255)));
            }
        });
        return class065842;
    }

    public class05959<class04815> N() {
        return class07439.Z;
    }
}

