/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class03328
 *  minecraft.class03366
 *  minecraft.class03942
 *  minecraft.class05908
 *  minecraft.class05950
 *  minecraft.class05957
 *  minecraft.class06584
 *  minecraft.class08122
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;
import minecraft.class03328;
import minecraft.class03366;
import minecraft.class03942;
import minecraft.class05908;
import minecraft.class05950;
import minecraft.class05957;
import minecraft.class06584;
import minecraft.class08122;

public class class03626
extends class03328 {
    public static final MapCodec<class03626> N = RecordCodecBuilder.mapCodec(instance -> class03626.y(instance).apply(instance, class03626::new));

    private class03626(int n, int n2, List<class05957> list, List<class08122> list2) {
        super(n, n2, list, list2);
    }

    public static class03366<?> y() {
        return class03626.N(class03626::new);
    }

    public class05950 N() {
        return class03942.y;
    }

    public void N(Consumer<class06584> consumer, class05908 class059082) {
    }
}

