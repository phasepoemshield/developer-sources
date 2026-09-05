/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00453
 *  minecraft.class02484
 *  minecraft.class02501
 *  minecraft.class02813
 *  minecraft.class02827
 *  minecraft.class05908
 *  minecraft.class05957
 *  minecraft.class05959
 *  minecraft.class06338
 *  minecraft.class06584
 *  minecraft.class07439
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import minecraft.class00453;
import minecraft.class02484;
import minecraft.class02501;
import minecraft.class02813;
import minecraft.class02827;
import minecraft.class05908;
import minecraft.class05957;
import minecraft.class05959;
import minecraft.class06338;
import minecraft.class06584;
import minecraft.class07439;

public class class02355
extends class00453 {
    public static final MapCodec<class02355> N = RecordCodecBuilder.mapCodec(instance -> class02355.N(instance).and(instance.group((App)class02501.N((Codec)class02827.L, (int)256).optionalFieldOf("explosions").forGetter(class023552 -> class023552.L), (App)class06338.s.optionalFieldOf("flight_duration").forGetter(class023552 -> class023552.u))).apply(instance, class02355::new));
    public static final class02813 y = new class02813(0, List.of());
    private final Optional<class02501<class02827>> L;
    private final Optional<Integer> u;

    protected class02355(List<class05957> list, Optional<class02501<class02827>> optional, Optional<Integer> optional2) {
        super(list);
        this.L = optional;
        this.u = optional2;
    }

    private class02813 N(class02813 class028132) {
        return new class02813(this.u.orElseGet(() -> ((class02813)class028132).N()).intValue(), this.L.map(class025012 -> class025012.N(class028132.y())).orElse(class028132.y()));
    }

    protected class06584 N(class06584 class065842, class05908 class059082) {
        class065842.N(class02484.NT, (Object)y, this::N);
        return class065842;
    }

    public class05959<class02355> N() {
        return class07439.V;
    }
}

