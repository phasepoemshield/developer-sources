/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10419
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class03328
 *  minecraft.class03942
 *  minecraft.class04489
 *  minecraft.class05561
 *  minecraft.class05908
 *  minecraft.class05950
 *  minecraft.class05957
 *  minecraft.class06584
 *  minecraft.class06834
 *  minecraft.class06848
 *  minecraft.class08122
 */
package minecraft;

import Nursultan.class10419;
import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;
import minecraft.class03328;
import minecraft.class03942;
import minecraft.class04489;
import minecraft.class05561;
import minecraft.class05908;
import minecraft.class05950;
import minecraft.class05957;
import minecraft.class06584;
import minecraft.class06834;
import minecraft.class06848;
import minecraft.class08122;

public class class07577
extends class03328 {
    public static final MapCodec<class07577> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class06848.y.fieldOf("slot_source").forGetter(class075772 -> class075772.u)).and(class07577.y(instance)).apply(instance, class07577::new));
    private final class06834 u;

    private class07577(class06834 class068342, int n, int n2, List<class05957> list, List<class08122> list2) {
        super(n, n2, list, list2);
        this.u = class068342;
    }

    public class05950 N() {
        return class03942.M;
    }

    public void N(Consumer<class06584> consumer, class05908 class059082) {
        this.u.N(class059082).itemCopies().filter(class065842 -> !class065842.R()).forEach(consumer);
    }

    public void N(class05561 class055612) {
        super.N(class055612);
        this.u.N(class055612.N((class04489)new class10419("slot_source")));
    }
}

