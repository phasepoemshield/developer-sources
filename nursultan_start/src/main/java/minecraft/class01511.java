/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.Lists
 *  minecraft.class00500
 *  minecraft.class01210
 *  minecraft.class01289
 *  minecraft.class04051
 *  minecraft.class04782
 *  minecraft.class05355
 *  minecraft.class05378
 *  minecraft.class05487
 *  minecraft.class06018
 *  minecraft.class07209
 *  minecraft.class07438
 *  net.caffeinemc.mods.lithium.common.ai.non_poi_block_search.CommonBlockSearchesCheckAndCache
 */
package minecraft;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import minecraft.class00500;
import minecraft.class01210;
import minecraft.class01289;
import minecraft.class01489;
import minecraft.class04051;
import minecraft.class04782;
import minecraft.class05355;
import minecraft.class05378;
import minecraft.class05487;
import minecraft.class06018;
import minecraft.class07209;
import minecraft.class07438;
import net.caffeinemc.mods.lithium.common.ai.non_poi_block_search.CommonBlockSearchesCheckAndCache;

public class class01511
extends class05355<class06018> {
    private static final Predicate N = class01511::N;

    private Optional<class07209> y(class04782 class047822, class06018 class060182) {
        return class07209.method_25997((class07209)class060182.method_24515(), (int)8, (int)4, class072092 -> class047822.method_8320(class072092).N(class01210.yR));
    }

    private Optional N(class01511 class015112, class04782 class047822, class06018 class060182) {
        return CommonBlockSearchesCheckAndCache.blockPosFindClosestMatch((class05487)class047822, (class07438)class060182, (int)8, (int)4, (Predicate)N, (boolean)true);
    }

    private static boolean N(class00500 class005002) {
        return class005002.N(class01210.yR);
    }

    public Set<class05378<?>> N() {
        return ImmutableSet.of((Object)class05378.B, (Object)class05378.No, (Object)class05378.NY, (Object)class05378.Nk, (Object)class05378.NO, (Object)class05378.Ng, (Object[])new class05378[0]);
    }

    protected void N(class04782 class047822, class06018 class060182) {
        class01289 var3 = class060182.method_18868();
        class06018 class060183 = class060182;
        class04782 class047823 = class047822;
        class01511 class015112 = this;
        var3.N(class05378.No, this.N(class015112, class047823, class060183));
        Optional<Object> optional = Optional.empty();
        int n = 0;
        ArrayList arrayList = Lists.newArrayList();
        for (class07438 class074383 : var3.L(class05378.B).orElse(class04051.N()).y(class074382 -> !class074382.method_6109() && (class074382 instanceof class01489 || class074382 instanceof class06018))) {
            class01489 class014892;
            if (class074383 instanceof class01489) {
                class014892 = (class01489)class074383;
                ++n;
                if (optional.isEmpty()) {
                    optional = Optional.of(class014892);
                }
            }
            if (!(class074383 instanceof class06018)) continue;
            class014892 = (class06018)class074383;
            arrayList.add(class014892);
        }
        var3.N(class05378.NY, optional);
        var3.N(class05378.Nk, (Object)arrayList);
        var3.N(class05378.NO, (Object)n);
        var3.N(class05378.Ng, (Object)arrayList.size());
    }
}

