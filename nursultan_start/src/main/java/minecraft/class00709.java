/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  it.unimi.dsi.fastutil.objects.ObjectOpenHashSet
 *  minecraft.class00453
 *  minecraft.class02484
 *  minecraft.class02679
 *  minecraft.class02692
 *  minecraft.class03556
 *  minecraft.class05908
 *  minecraft.class05957
 *  minecraft.class05959
 *  minecraft.class06069
 *  minecraft.class06570
 *  minecraft.class06584
 *  minecraft.class07084
 *  minecraft.class07439
 *  minecraft.class07491
 *  minecraft.class07536
 */
package minecraft;

import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.List;
import java.util.Set;
import minecraft.class00453;
import minecraft.class00678;
import minecraft.class00714;
import minecraft.class02484;
import minecraft.class02679;
import minecraft.class02692;
import minecraft.class03556;
import minecraft.class05908;
import minecraft.class05957;
import minecraft.class05959;
import minecraft.class06069;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class07084;
import minecraft.class07439;
import minecraft.class07491;
import minecraft.class07536;

public class class00709
extends class00453 {
    private static final Codec<List<class00678>> y = class00678.N.listOf().validate(list -> {
        ObjectOpenHashSet objectOpenHashSet = new ObjectOpenHashSet();
        for (class00678 class006782 : list) {
            if (objectOpenHashSet.add(class006782.N())) continue;
            return DataResult.error(() -> "Encountered duplicate mob effect: '" + String.valueOf(class006782.N()) + "'");
        }
        return DataResult.success((Object)list);
    });
    public static final MapCodec<class00709> N = RecordCodecBuilder.mapCodec(instance -> class00709.N(instance).and((App)y.optionalFieldOf("effects", List.of()).forGetter(class007092 -> class007092.L)).apply(instance, class00709::new));
    private final List<class00678> L;

    public static class00714 L() {
        return new class00714();
    }

    class00709(List<class05957> list, List<class00678> list2) {
        super(list);
        this.L = list2;
    }

    public Set<class07491<?>> y() {
        return (Set)this.L.stream().flatMap(class006782 -> class006782.y().y().stream()).collect(ImmutableSet.toImmutableSet());
    }

    public class05959<class00709> N() {
        return class07439.b;
    }

    public class06584 N(class06584 class065842, class05908 class059082) {
        if (!class065842.N(class06570.dk) || this.L.isEmpty()) {
            return class065842;
        }
        class00678 class006782 = (class00678)((Object)class07536.N_77(this.L, (class06069)class059082.y()));
        class03556<class07084> class035562 = class006782.N();
        int n = class006782.y().N(class059082);
        if (!((class07084)class035562.N()).N()) {
            n *= 20;
        }
        class02679 class026792 = new class02679(class035562, n);
        class065842.N(class02484.NN, (Object)class02692.N, (Object)class026792, class02692::N);
        return class065842;
    }
}

