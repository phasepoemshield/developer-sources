/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00453
 *  minecraft.class00471
 *  minecraft.class02477
 *  minecraft.class05908
 *  minecraft.class05957
 *  minecraft.class05959
 *  minecraft.class06584
 *  minecraft.class07439
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import minecraft.class00453;
import minecraft.class00471;
import minecraft.class02477;
import minecraft.class02678;
import minecraft.class05908;
import minecraft.class05957;
import minecraft.class05959;
import minecraft.class06584;
import minecraft.class07439;

public class class02702
extends class00453 {
    public static final MapCodec<class02702> N = RecordCodecBuilder.mapCodec(instance -> class02702.N(instance).and((App)class02678.y.fieldOf("components").forGetter(class027022 -> class027022.y)).apply(instance, class02702::new));
    private final class02678 y;

    private class02702(List<class05957> list, class02678 class026782) {
        super(list);
        this.y = class026782;
    }

    public class06584 N(class06584 class065842, class05908 class059082) {
        class065842.N(this.y);
        return class065842;
    }

    public class05959<class02702> N() {
        return class07439.U;
    }

    public static <T> class00471<?> N(class02477<T> class024772, T t) {
        return class02702.N((T list) -> new class02702((List<class05957>)list, class02678.N().N(class024772, t).N()));
    }
}

