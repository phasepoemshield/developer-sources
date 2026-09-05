/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00453
 *  minecraft.class00471
 *  minecraft.class05908
 *  minecraft.class05957
 *  minecraft.class05959
 *  minecraft.class06584
 *  minecraft.class07439
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import minecraft.class00453;
import minecraft.class00471;
import minecraft.class05908;
import minecraft.class05957;
import minecraft.class05959;
import minecraft.class06584;
import minecraft.class07439;

public class class06810
extends class00453 {
    public static final MapCodec<class06810> N = RecordCodecBuilder.mapCodec(instance -> class06810.N(instance).apply(instance, class06810::new));

    public static class00471<?> L() {
        return class06810.N(class06810::new);
    }

    protected class06810(List<class05957> list) {
        super(list);
    }

    public class05959<class06810> N() {
        return class07439.A;
    }

    protected class06584 N(class06584 class065842, class05908 class059082) {
        return class06584.E;
    }
}

