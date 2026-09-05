/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00659
 *  minecraft.class01474
 *  minecraft.class05930
 *  minecraft.class06069
 *  minecraft.class07209
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00659;
import minecraft.class01474;
import minecraft.class05894;
import minecraft.class05930;
import minecraft.class06069;
import minecraft.class07209;

public class class05892
extends class01474 {
    public static final MapCodec<class05892> N = MapCodec.unit(() -> L);
    public static final class05892 L = new class05892();

    public void N(class05894 class058942) {
        class06069 class060692 = class058942.y();
        class058942.L().forEach(class072092 -> {
            class07209 class072093;
            if (class060692.y(3) > 0 && class058942.N(class072093 = class072092.method_10067())) {
                class058942.N(class072093, class00659.u);
            }
            if (class060692.y(3) > 0 && class058942.N(class072093 = class072092.method_10078())) {
                class058942.N(class072093, class00659.R);
            }
            if (class060692.y(3) > 0 && class058942.N(class072093 = class072092.method_10095())) {
                class058942.N(class072093, class00659.i);
            }
            if (class060692.y(3) > 0 && class058942.N(class072093 = class072092.method_10072())) {
                class058942.N(class072093, class00659.L);
            }
        });
    }

    protected class05930<?> N() {
        return class05930.N;
    }
}

