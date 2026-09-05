/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00453
 *  minecraft.class01042
 *  minecraft.class01929
 *  minecraft.class02625
 *  minecraft.class03541
 *  minecraft.class03543
 *  minecraft.class04227
 *  minecraft.class05908
 *  minecraft.class05946
 *  minecraft.class05957
 *  minecraft.class05959
 *  minecraft.class06069
 *  minecraft.class06339
 *  minecraft.class06378
 *  minecraft.class06584
 *  minecraft.class07304
 *  minecraft.class07323
 *  minecraft.class07439
 *  minecraft.class07491
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import minecraft.class00453;
import minecraft.class01042;
import minecraft.class01929;
import minecraft.class02625;
import minecraft.class03541;
import minecraft.class03543;
import minecraft.class04227;
import minecraft.class05908;
import minecraft.class05946;
import minecraft.class05957;
import minecraft.class05959;
import minecraft.class06069;
import minecraft.class06339;
import minecraft.class06378;
import minecraft.class06584;
import minecraft.class07304;
import minecraft.class07323;
import minecraft.class07439;
import minecraft.class07491;
import minecraft.class08619;

public class class08611
extends class00453 {
    public static final MapCodec<class08611> N = RecordCodecBuilder.mapCodec(instance -> class08611.N(instance).and(instance.group((App)class06339.N.fieldOf("levels").forGetter(class086112 -> class086112.y), (App)class03541.N((class05946)class04227.yR).optionalFieldOf("options").forGetter(class086112 -> class086112.L))).apply(instance, class08611::new));
    private final class06378 y;
    private final Optional<class03543<class07304>> L;

    class08611(List<class05957> list, class06378 class063782, Optional<class03543<class07304>> optional) {
        super(list);
        this.y = class063782;
        this.L = optional;
    }

    public Set<class07491<?>> y() {
        return this.y.y();
    }

    public static class08619 N(class01929 class019292, class06378 class063782) {
        return new class08619(class063782).N((class03543<class07304>)class019292.y(class04227.yR).y(class02625.m));
    }

    public class06584 N(class06584 class065842, class05908 class059082) {
        class06069 class060692 = class059082.y();
        class01042 class010422 = class059082.u().method_30349();
        return class07323.N((class06069)class060692, (class06584)class065842, (int)this.y.N(class059082), (class01042)class010422, this.L);
    }

    public class05959<class08611> N() {
        return class07439.M;
    }
}

