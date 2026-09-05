/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  minecraft.class00500
 *  minecraft.class00869
 *  minecraft.class00900
 *  minecraft.class01474
 *  minecraft.class05894
 *  minecraft.class05930
 *  minecraft.class06069
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07221
 *  minecraft.class08092
 */
package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import minecraft.class00500;
import minecraft.class00869;
import minecraft.class00900;
import minecraft.class01474;
import minecraft.class05894;
import minecraft.class05930;
import minecraft.class06069;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07221;
import minecraft.class08092;

public class class01436
extends class01474 {
    public static final MapCodec<class01436> N = Codec.floatRange((float)0.0f, (float)1.0f).fieldOf("probability").xmap(class01436::new, class014362 -> Float.valueOf(class014362.L));
    private final float L;

    public class01436(float f) {
        this.L = f;
    }

    protected class05930<?> N() {
        return class05930.i;
    }

    public void N(class05894 class058942) {
        class06069 class060692 = class058942.y();
        if (class060692.z() >= this.L) {
            return;
        }
        ObjectArrayList var3 = class058942.L();
        if (var3.isEmpty()) {
            return;
        }
        int n = ((class07209)var3.getFirst()).method_10264();
        var3.stream().filter(class072092 -> class072092.method_10264() - n <= 2).forEach(class072092 -> {
            for (class07211 class072112 : class07221.field_11062) {
                class07211 class072113;
                class07209 class072093;
                if (!(class060692.z() <= 0.25f) || !class058942.N(class072093 = class072092.method_10069((class072113 = class072112.b()).P(), 0, class072113.T()))) continue;
                class058942.N(class072093, (class00500)((class00500)class00869.Mb.W().y((class08092)class00900.L, (Comparable)Integer.valueOf(class060692.y(3)))).y((class08092)class00900.R, (Comparable)class072112));
            }
        });
    }
}

