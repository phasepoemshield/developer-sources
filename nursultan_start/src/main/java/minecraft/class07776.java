/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class05908
 *  minecraft.class05952
 *  minecraft.class05955
 *  minecraft.class05957
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
import minecraft.class06551;
import minecraft.class07491;
import minecraft.class07693;

public class class07776
implements class05957 {
    private static final class07776 i = new class07776();
    public static final MapCodec<class07776> N = MapCodec.unit((Object)i);

    public static class05952 L() {
        return () -> i;
    }

    private class07776() {
    }

    public Set<class07491<?>> y() {
        return Set.of(class06551.u);
    }

    public boolean test(class05908 class059082) {
        return class059082.N(class06551.u);
    }

    public class05955 N() {
        return class07693.M;
    }
}

