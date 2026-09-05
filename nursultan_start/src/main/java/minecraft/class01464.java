/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00659
 *  minecraft.class05894
 *  minecraft.class05930
 *  minecraft.class06069
 *  minecraft.class06667
 *  minecraft.class07209
 */
package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import minecraft.class00659;
import minecraft.class01474;
import minecraft.class05894;
import minecraft.class05930;
import minecraft.class06069;
import minecraft.class06667;
import minecraft.class07209;

public class class01464
extends class01474 {
    public static final MapCodec<class01464> N = Codec.floatRange((float)0.0f, (float)1.0f).fieldOf("probability").xmap(class01464::new, class014642 -> Float.valueOf(class014642.L));
    private final float L;

    public class01464(float f) {
        this.L = f;
    }

    @Override
    protected class05930<?> N() {
        return class05930.y;
    }

    private static void N(class07209 class072092, class06667 class066672, class05894 class058942) {
        class058942.N(class072092, class066672);
        class072092 = class072092.method_10074();
        for (int i = 4; class058942.N(class072092) && i > 0; --i) {
            class058942.N(class072092, class066672);
            class072092 = class072092.method_10074();
        }
    }

    @Override
    public void N(class05894 class058942) {
        class06069 class060692 = class058942.y();
        class058942.u().forEach(class072092 -> {
            class07209 class072093;
            if (class060692.z() < this.L && class058942.N(class072093 = class072092.method_10067())) {
                class01464.N(class072093, class00659.u, class058942);
            }
            if (class060692.z() < this.L && class058942.N(class072093 = class072092.method_10078())) {
                class01464.N(class072093, class00659.R, class058942);
            }
            if (class060692.z() < this.L && class058942.N(class072093 = class072092.method_10095())) {
                class01464.N(class072093, class00659.i, class058942);
            }
            if (class060692.z() < this.L && class058942.N(class072093 = class072092.method_10072())) {
                class01464.N(class072093, class00659.L, class058942);
            }
        });
    }
}

