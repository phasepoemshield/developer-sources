/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.MapCodec
 *  minecraft.class05096
 *  minecraft.class08997
 *  minecraft.class09011
 *  minecraft.class09015
 *  minecraft.class09020
 *  minecraft.class09035
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import java.util.HashMap;
import java.util.Map;
import minecraft.class00098;
import minecraft.class00110;
import minecraft.class00115;
import minecraft.class00127;
import minecraft.class00128;
import minecraft.class00129;
import minecraft.class05096;
import minecraft.class08997;
import minecraft.class09011;
import minecraft.class09015;
import minecraft.class09020;
import minecraft.class09035;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class00100 {
    private static final Logger N = LogUtils.getLogger();
    private static final Map<MapCodec<? extends class09015>, class00127<?>> y = new HashMap();

    public static <T extends class09015> void N(T t, class05096 class050962, class00129 class001292) {
        class00127<T> class001272 = class00100.N(t);
        if (class001272 == null) {
            N.warn("Unrecognized input control {}", t);
            return;
        }
        class001272.N(t, class050962, class001292);
    }

    public static void N() {
        class00100.N(class09035.N, new class00128());
        class00100.N(class08997.N, new class00115());
        class00100.N(class09020.N, new class00110());
        class00100.N(class09011.N, new class00098());
    }

    private static <T extends class09015> void N(MapCodec<T> mapCodec, class00127<? super T> class001272) {
        y.put(mapCodec, class001272);
    }

    private static <T extends class09015> @Nullable class00127<T> N(T t) {
        return y.get(t.N());
    }
}

