/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10416
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class04489
 *  minecraft.class05561
 *  minecraft.class05908
 *  minecraft.class05959
 *  minecraft.class06584
 *  minecraft.class07439
 *  minecraft.class08122
 */
package minecraft;

import Nursultan.class10416;
import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiFunction;
import minecraft.class04489;
import minecraft.class05561;
import minecraft.class05908;
import minecraft.class05959;
import minecraft.class06584;
import minecraft.class07439;
import minecraft.class08122;

public class class04812
implements class08122 {
    public static final MapCodec<class04812> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class07439.y.listOf().fieldOf("functions").forGetter(class048122 -> class048122.L)).apply(instance, class04812::new));
    public static final Codec<class04812> y = class07439.y.listOf().xmap(class04812::new, class048122 -> class048122.L);
    private final List<class08122> L;
    private final BiFunction<class06584, class05908, class06584> u;

    private class04812(List<class08122> list) {
        this.L = list;
        this.u = class07439.N(list);
    }

    public class06584 apply(class06584 class065842, class05908 class059082) {
        return this.u.apply(class065842, class059082);
    }

    public static class04812 N(List<class08122> list) {
        return new class04812(List.copyOf(list));
    }

    public class05959<class04812> N() {
        return class07439.q;
    }

    public void N(class05561 class055612) {
        super.N(class055612);
        for (int i = 0; i < this.L.size(); ++i) {
            this.L.get(i).N(class055612.N((class04489)new class10416("functions", i)));
        }
    }
}

