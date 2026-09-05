/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00500
 *  minecraft.class00891
 *  minecraft.class01362
 *  minecraft.class02625
 *  minecraft.class03530
 *  minecraft.class04206
 *  minecraft.class04782
 *  minecraft.class06113
 *  minecraft.class06584
 *  minecraft.class07049
 *  minecraft.class07078
 *  minecraft.class07299
 *  minecraft.class07305
 *  minecraft.class07323
 *  minecraft.class08092
 */
package minecraft;

import com.google.common.collect.Maps;
import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.function.Supplier;
import minecraft.class00500;
import minecraft.class00891;
import minecraft.class01362;
import minecraft.class02625;
import minecraft.class03530;
import minecraft.class04206;
import minecraft.class04782;
import minecraft.class06113;
import minecraft.class06584;
import minecraft.class07049;
import minecraft.class07078;
import minecraft.class07147;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07305;
import minecraft.class07323;
import minecraft.class08092;

public class class07137
extends class00891 {
    public static final MapCodec<class07137> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class04206.i.T().fieldOf("host").forGetter(class07137::y), (App)class07137.t()).apply(instance, class07137::new));
    private final class00891 y;
    private static final Map<class00891, class00891> L = Maps.newIdentityHashMap();
    private static final Map<class00500, class00500> u = Maps.newIdentityHashMap();
    private static final Map<class00500, class00500> i = Maps.newIdentityHashMap();

    public class00500 T(class00500 class005002) {
        return class07137.N(i, class005002, () -> this.y().W());
    }

    public class07137(class00891 class008912, class01362 class013622) {
        super(class013622.i(class008912.Y() / 2.0f).R(0.75f));
        this.y = class008912;
        L.put(class008912, this);
    }

    public static boolean U(class00500 class005002) {
        return L.containsKey(class005002.i());
    }

    public class00891 y() {
        return this.y;
    }

    public static class00500 E(class00500 class005002) {
        return class07137.N(u, class005002, () -> L.get(class005002.i()).W());
    }

    public MapCodec<? extends class07137> N() {
        return N;
    }

    private void N(class04782 class047822, class07209 class072092) {
        class07147 class071472 = (class07147)class07078.yW.N((class07299)class047822, class06113.field_16461);
        if (class071472 != null) {
            class071472.method_5808((double)class072092.method_10263() + 0.5, class072092.method_10264(), (double)class072092.method_10260() + 0.5, 0.0f, 0.0f);
            class047822.method_8649((class07049)class071472);
            class071472.h();
        }
    }

    protected void N(class00500 class005002, class04782 class047822, class07209 class072092, class06584 class065842, boolean bl) {
        super.N(class005002, class047822, class072092, class065842, bl);
        if (((Boolean)class047822.method_64395().N(class07305.u)).booleanValue() && !class07323.N((class06584)class065842, (class03530)class02625.v)) {
            this.N(class047822, class072092);
        }
    }

    private static class00500 N(Map<class00500, class00500> map, class00500 class005003, Supplier<class00500> supplier) {
        return map.computeIfAbsent(class005003, class005002 -> {
            class00500 class005003 = (class00500)supplier.get();
            for (class08092 class080922 : class005002.y()) {
                class005003 = class005003.y(class080922) ? (class00500)class005003.y(class080922, class005002.L(class080922)) : class005003;
            }
            return class005003;
        });
    }
}

