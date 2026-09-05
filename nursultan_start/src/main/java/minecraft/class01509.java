/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.Lists
 *  minecraft.class00500
 *  minecraft.class00680
 *  minecraft.class00869
 *  minecraft.class01210
 *  minecraft.class01238
 *  minecraft.class01266
 *  minecraft.class01289
 *  minecraft.class04051
 *  minecraft.class04782
 *  minecraft.class05355
 *  minecraft.class05378
 *  minecraft.class05487
 *  minecraft.class05847
 *  minecraft.class06018
 *  minecraft.class07079
 *  minecraft.class07209
 *  minecraft.class07438
 *  minecraft.class08023
 *  minecraft.class08036
 *  net.caffeinemc.mods.lithium.common.ai.non_poi_block_search.CommonBlockSearchesCheckAndCache
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import minecraft.class00500;
import minecraft.class00680;
import minecraft.class00869;
import minecraft.class01210;
import minecraft.class01238;
import minecraft.class01266;
import minecraft.class01289;
import minecraft.class01489;
import minecraft.class01514;
import minecraft.class04051;
import minecraft.class04782;
import minecraft.class05355;
import minecraft.class05378;
import minecraft.class05487;
import minecraft.class05847;
import minecraft.class06018;
import minecraft.class07079;
import minecraft.class07209;
import minecraft.class07438;
import minecraft.class08023;
import minecraft.class08036;
import net.caffeinemc.mods.lithium.common.ai.non_poi_block_search.CommonBlockSearchesCheckAndCache;

public class class01509
extends class05355<class07438> {
    private static final Predicate N = class01509::N;

    public Optional L(class04782 class047822, class07438 class074382) {
        return CommonBlockSearchesCheckAndCache.blockPosFindClosestMatch((class05487)class047822, (class07438)class074382, (int)8, (int)4, (Predicate)N, (boolean)true);
    }

    private static Optional<class07209> u(class04782 class047822, class07438 class074382) {
        return class07209.method_25997((class07209)class074382.method_24515(), (int)8, (int)4, class072092 -> class01509.N(class047822, class072092));
    }

    private static boolean N(class00500 class005002) {
        boolean bl = class005002.N(class01210.Nl);
        return bl && class005002.N(class00869.sR) ? class05847.U((class00500)class005002) : bl;
    }

    public Set<class05378<?>> N() {
        return ImmutableSet.of((Object)class05378.B, (Object)class05378.M, (Object)class05378.c, (Object)class05378.Nl, (Object)class05378.NI, (Object)class05378.Nt, (Object[])new class05378[]{class05378.NG, class05378.Nw, class05378.Nd, class05378.NO, class05378.Ng, class05378.No});
    }

    private static boolean N(class04782 class047822, class07209 class072092) {
        class00500 class005002 = class047822.method_8320(class072092);
        boolean bl = class005002.N(class01210.Nl);
        if (bl && class005002.N(class00869.sR)) {
            return class05847.U((class00500)class005002);
        }
        return bl;
    }

    protected void N(class04782 class047822, class07438 class074383) {
        class01266 class012662;
        class06018 class060182;
        class01289 var3 = class074383.method_18868();
        class07438 class074384 = class074383;
        class04782 class047823 = class047822;
        var3.N(class05378.No, this.L(class047823, class074384));
        Optional<Object> optional = Optional.empty();
        Optional<Object> optional2 = Optional.empty();
        Optional<Object> optional3 = Optional.empty();
        Optional<Object> optional4 = Optional.empty();
        Optional<Object> optional5 = Optional.empty();
        Optional<Object> optional6 = Optional.empty();
        Optional<Object> optional7 = Optional.empty();
        int n = 0;
        ArrayList arrayList = Lists.newArrayList();
        ArrayList arrayList2 = Lists.newArrayList();
        for (class07438 class074385 : var3.L(class05378.B).orElse(class04051.N()).y(class074382 -> true)) {
            if (class074385 instanceof class06018) {
                class060182 = (class06018)class074385;
                if (class060182.method_6109() && optional3.isEmpty()) {
                    optional3 = Optional.of(class060182);
                    continue;
                }
                if (!class060182.m()) continue;
                ++n;
                if (!optional2.isEmpty() || !class060182.n()) continue;
                optional2 = Optional.of(class060182);
                continue;
            }
            if (class074385 instanceof class01266) {
                class012662 = (class01266)class074385;
                arrayList.add(class012662);
                continue;
            }
            if (class074385 instanceof class01489) {
                class01489 class014892 = (class01489)class074385;
                if (class014892.method_6109() && optional4.isEmpty()) {
                    optional4 = Optional.of(class014892);
                    continue;
                }
                if (!class014892.l()) continue;
                arrayList.add(class014892);
                continue;
            }
            if (class074385 instanceof class08036) {
                class08036 class080362 = (class08036)class074385;
                if (optional6.isEmpty() && !class01514.N((class07438)class080362) && class074383.method_18395(class074385)) {
                    optional6 = Optional.of(class080362);
                }
                if (!optional7.isEmpty() || class080362.method_7325() || !class01514.y((class07438)class080362)) continue;
                optional7 = Optional.of(class080362);
                continue;
            }
            if (optional.isEmpty() && (class074385 instanceof class08023 || class074385 instanceof class00680)) {
                optional = Optional.of((class07079)class074385);
                continue;
            }
            if (!optional5.isEmpty() || !class01514.N(class074385.method_5864())) continue;
            optional5 = Optional.of(class074385);
        }
        List list = (List)var3.L(class05378.M).orElse(ImmutableList.of());
        Iterator var16 = list.iterator();
        while (var16.hasNext()) {
            class060182 = (class07438)var16.next();
            if (!(class060182 instanceof class01238) || !(class012662 = (class01238)class060182).l()) continue;
            arrayList2.add(class012662);
        }
        var3.N(class05378.c, optional);
        var3.N(class05378.Nt, optional2);
        var3.N(class05378.NG, optional3);
        var3.N(class05378.NQ, optional5);
        var3.N(class05378.Nl, optional6);
        var3.N(class05378.NI, optional7);
        var3.N(class05378.Nd, (Object)arrayList2);
        var3.N(class05378.Nw, (Object)arrayList);
        var3.N(class05378.NO, (Object)arrayList.size());
        var3.N(class05378.Ng, (Object)n);
    }
}

