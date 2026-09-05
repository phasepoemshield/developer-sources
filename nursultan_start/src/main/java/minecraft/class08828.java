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
 *  minecraft.class06069
 *  minecraft.class06551
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
import minecraft.class06069;
import minecraft.class06551;
import minecraft.class06584;
import minecraft.class07439;

public class class08828
extends class00453 {
    public static final MapCodec<class08828> N = RecordCodecBuilder.mapCodec(instance -> class08828.N(instance).apply(instance, class08828::new));

    public static class00471<?> L() {
        return class08828.N(class08828::new);
    }

    private class08828(List<class05957> list) {
        super(list);
    }

    public class05959<class08828> N() {
        return class07439.w;
    }

    public class06584 N(class06584 class065842, class05908 class059082) {
        Float f = (Float)class059082.L(class06551.E);
        if (f != null) {
            class06069 class060692 = class059082.y();
            float f2 = 1.0f / f.floatValue();
            int n = class065842.c();
            int n2 = 0;
            for (int i = 0; i < n; ++i) {
                if (!(class060692.z() <= f2)) continue;
                ++n2;
            }
            class065842.i(n2);
        }
        return class065842;
    }
}

