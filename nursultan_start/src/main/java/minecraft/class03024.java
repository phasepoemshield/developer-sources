/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class01894
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

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;
import minecraft.class01894;
import minecraft.class03328;
import minecraft.class03366;
import minecraft.class03942;
import minecraft.class05908;
import minecraft.class05950;
import minecraft.class05957;
import minecraft.class06584;
import minecraft.class08122;

public class class03024
extends class03328 {
    public static final MapCodec<class03024> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class01894.N.fieldOf("name").forGetter(class030242 -> class030242.u)).and(class03024.y(instance)).apply(instance, class03024::new));
    private final class01894 u;

    private class03024(class01894 class018942, int n, int n2, List<class05957> list, List<class08122> list2) {
        super(n, n2, list, list2);
        this.u = class018942;
    }

    public class05950 N() {
        return class03942.i;
    }

    public void N(Consumer<class06584> consumer, class05908 class059082) {
        class059082.N(this.u, consumer);
    }

    public static class03366<?> N(class01894 class018942) {
        return class03024.N((n, n2, list, list2) -> new class03024(class018942, n, n2, list, list2));
    }
}

