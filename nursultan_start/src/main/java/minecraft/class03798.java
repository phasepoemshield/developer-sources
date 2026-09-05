/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class03328
 *  minecraft.class03366
 *  minecraft.class03556
 *  minecraft.class03942
 *  minecraft.class05908
 *  minecraft.class05950
 *  minecraft.class05957
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class07310
 *  minecraft.class08122
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;
import minecraft.class03328;
import minecraft.class03366;
import minecraft.class03556;
import minecraft.class03942;
import minecraft.class05908;
import minecraft.class05950;
import minecraft.class05957;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class07310;
import minecraft.class08122;

public class class03798
extends class03328 {
    public static final MapCodec<class03798> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class06581.u.fieldOf("name").forGetter(class037982 -> class037982.u)).and(class03798.y(instance)).apply(instance, class03798::new));
    private final class03556<class06581> u;

    private class03798(class03556<class06581> class035562, int n, int n2, List<class05957> list, List<class08122> list2) {
        super(n, n2, list, list2);
        this.u = class035562;
    }

    public class05950 N() {
        return class03942.L;
    }

    public void N(Consumer<class06584> consumer, class05908 class059082) {
        consumer.accept(new class06584(this.u));
    }

    public static class03366<?> N(class07310 class073102) {
        return class03798.N((n, n2, list, list2) -> new class03798((class03556<class06581>)class073102.B().i(), n, n2, list, list2));
    }
}

