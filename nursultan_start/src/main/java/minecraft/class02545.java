/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02530
 *  minecraft.class02715
 *  minecraft.class03541
 *  minecraft.class03543
 *  minecraft.class04227
 *  minecraft.class04995
 *  minecraft.class05946
 *  minecraft.class06069
 *  minecraft.class06338
 *  minecraft.class06584
 *  minecraft.class07052
 *  minecraft.class07304
 *  minecraft.class07317
 *  minecraft.class07323
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.stream.Stream;
import minecraft.class02530;
import minecraft.class02715;
import minecraft.class03541;
import minecraft.class03543;
import minecraft.class04227;
import minecraft.class04995;
import minecraft.class05946;
import minecraft.class06069;
import minecraft.class06338;
import minecraft.class06584;
import minecraft.class07052;
import minecraft.class07304;
import minecraft.class07317;
import minecraft.class07323;

public final class class02545
extends Record
implements class02530 {
    private final class03543<class07304> enchantments;
    private final int minCost;
    private final int maxCostSpan;
    public static final int y = 10000;
    public static final MapCodec<class02545> L = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class03541.N((class05946)class04227.yR).fieldOf("enchantments").forGetter(class02545::y), (App)class06338.N((int)1, (int)10000).fieldOf("min_cost").forGetter(class02545::L), (App)class06338.N((int)0, (int)10000).fieldOf("max_cost_span").forGetter(class02545::u)).apply(instance, class02545::new));

    public int L() {
        return this.minCost;
    }

    public class02545(class03543<class07304> class035432, int n, int n2) {
        this.enchantments = class035432;
        this.minCost = n;
        this.maxCostSpan = n2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02545.class, "enchantments;minCost;maxCostSpan", "enchantments", "minCost", "maxCostSpan"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02545.class, "enchantments;minCost;maxCostSpan", "enchantments", "minCost", "maxCostSpan"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02545.class, "enchantments;minCost;maxCostSpan", "enchantments", "minCost", "maxCostSpan"}, this);
    }

    public int u() {
        return this.maxCostSpan;
    }

    public class03543<class07304> y() {
        return this.enchantments;
    }

    public void N(class06584 class065842, class02715 class027152, class06069 class060692, class07052 class070522) {
        float f = class070522.u();
        int n = class04995.y((class06069)class060692, (int)this.minCost, (int)(this.minCost + (int)(f * (float)this.maxCostSpan)));
        for (class07317 class073172 : class07323.y((class06069)class060692, (class06584)class065842, (int)n, (Stream)this.enchantments.N())) {
            class027152.y(class073172.y(), class073172.L());
        }
    }

    public MapCodec<class02545> N() {
        return L;
    }
}

