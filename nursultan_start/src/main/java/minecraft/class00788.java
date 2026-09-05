/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class05908
 *  minecraft.class05952
 *  minecraft.class05955
 *  minecraft.class05957
 *  minecraft.class06069
 *  minecraft.class06551
 *  minecraft.class07491
 *  minecraft.class07693
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import java.util.Set;
import minecraft.class05908;
import minecraft.class05952;
import minecraft.class05955;
import minecraft.class05957;
import minecraft.class06069;
import minecraft.class06551;
import minecraft.class07491;
import minecraft.class07693;

public class class00788
implements class05957 {
    private static final class00788 i = new class00788();
    public static final MapCodec<class00788> N = MapCodec.unit((Object)i);

    public static class05952 L() {
        return () -> i;
    }

    private class00788() {
    }

    public Set<class07491<?>> y() {
        return Set.of(class06551.E);
    }

    public boolean test(class05908 class059082) {
        Float f = (Float)class059082.L(class06551.E);
        if (f != null) {
            class06069 class060692 = class059082.y();
            float f2 = 1.0f / f.floatValue();
            return class060692.z() <= f2;
        }
        return true;
    }

    public class05955 N() {
        return class07693.E;
    }
}

