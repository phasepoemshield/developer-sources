/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  minecraft.class00500
 *  minecraft.class00869
 *  minecraft.class01210
 *  minecraft.class01474
 *  minecraft.class05894
 *  minecraft.class05930
 *  minecraft.class06069
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07536
 *  minecraft.class08092
 *  minecraft.class08630
 */
package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.ArrayList;
import java.util.Optional;
import minecraft.class00325;
import minecraft.class00500;
import minecraft.class00869;
import minecraft.class01210;
import minecraft.class01474;
import minecraft.class05894;
import minecraft.class05930;
import minecraft.class06069;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07536;
import minecraft.class08092;
import minecraft.class08630;

public class class00317
extends class01474 {
    public static final MapCodec<class00317> N = Codec.floatRange((float)0.0f, (float)1.0f).fieldOf("probability").xmap(class00317::new, class003172 -> Float.valueOf(class003172.L));
    private final float L;

    public class00317(float f) {
        this.L = f;
    }

    protected class05930<?> N() {
        return class05930.u;
    }

    public void N(class05894 class058942) {
        class06069 class060692 = class058942.y();
        ObjectArrayList var3 = class058942.L();
        if (var3.isEmpty()) {
            return;
        }
        if (class060692.z() >= this.L) {
            return;
        }
        ArrayList arrayList = new ArrayList(var3);
        class07536.L(arrayList, (class06069)class060692);
        Optional<class07209> optional = arrayList.stream().filter(class072092 -> {
            for (class07211 class072112 : class07211.values()) {
                if (class058942.N(class072092.method_10093(class072112), (T class005002) -> class005002.N(class01210.g))) continue;
                return false;
            }
            return true;
        }).findFirst();
        if (optional.isEmpty()) {
            return;
        }
        class058942.N(optional.get(), (class00500)((class00500)class00869.Lp.W().y(class00325.L, (Comparable)class08630.field_55832)).y((class08092)class00325.u, (Comparable)Boolean.valueOf(true)));
    }
}

