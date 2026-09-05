/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00405
 *  minecraft.class00647
 *  minecraft.class02102
 *  minecraft.class09013
 *  minecraft.class09022
 *  minecraft.class09034
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import minecraft.class00099;
import minecraft.class00105;
import minecraft.class00120;
import minecraft.class00134;
import minecraft.class00405;
import minecraft.class00647;
import minecraft.class02102;
import minecraft.class09013;
import minecraft.class09022;
import minecraft.class09034;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class00103 {
    private static final Logger N = LogUtils.getLogger();
    private static final Map<MapCodec<? extends class09034>, class00105<?>> y = new HashMap();

    public static <B extends class09034> @Nullable class02102 N(class00134<?> class001342, B b) {
        class00105<B> class001052 = class00103.N(b);
        if (class001052 == null) {
            N.warn("Unrecognized dialog body {}", b);
            return null;
        }
        return class001052.N(class001342, b);
    }

    static void N(class00134<?> class001342, @Nullable class00405 class004052) {
        class00647 class006472;
        if (class004052 != null && (class006472 = class004052.Z()) != null) {
            class001342.N(Optional.of(class006472));
        }
    }

    public static void N() {
        class00103.N(class09022.u, new class00099());
        class00103.N(class09013.L, new class00120());
    }

    private static <B extends class09034> void N(MapCodec<B> mapCodec, class00105<? super B> class001052) {
        y.put(mapCodec, class001052);
    }

    private static <B extends class09034> @Nullable class00105<B> N(B b) {
        return y.get(b.N());
    }
}

