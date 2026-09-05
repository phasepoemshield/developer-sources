/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.datafixers.util.Pair
 *  it.unimi.dsi.fastutil.longs.Long2LongMap
 *  it.unimi.dsi.fastutil.longs.Long2LongOpenHashMap
 *  minecraft.class00143
 *  minecraft.class00753
 *  minecraft.class03556
 *  minecraft.class03927
 *  minecraft.class04128
 *  minecraft.class04137
 *  minecraft.class04142
 *  minecraft.class05352
 *  minecraft.class05368
 *  minecraft.class05369
 *  minecraft.class05372
 *  minecraft.class05378
 *  minecraft.class07079
 *  minecraft.class07209
 *  minecraft.class07475
 *  org.apache.commons.lang3.mutable.MutableInt
 *  org.apache.commons.lang3.mutable.MutableLong
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.longs.Long2LongMap;
import it.unimi.dsi.fastutil.longs.Long2LongOpenHashMap;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import minecraft.class00143;
import minecraft.class00753;
import minecraft.class03556;
import minecraft.class03927;
import minecraft.class04128;
import minecraft.class04137;
import minecraft.class04142;
import minecraft.class05352;
import minecraft.class05368;
import minecraft.class05369;
import minecraft.class05372;
import minecraft.class05378;
import minecraft.class05743;
import minecraft.class07079;
import minecraft.class07209;
import minecraft.class07475;
import org.apache.commons.lang3.mutable.MutableInt;
import org.apache.commons.lang3.mutable.MutableLong;

public class class05704 {
    private static final int N = 40;
    private static final int y = 5;
    private static final int L = 20;
    private static final int u = 4;

    public static class04142<class07475> N(float f) {
        Long2LongOpenHashMap long2LongOpenHashMap = new Long2LongOpenHashMap();
        return class04137.N_42(arg_0 -> class05704.N(new MutableLong(0L), (Long2LongMap)long2LongOpenHashMap, f, arg_0));
    }

    private static /* synthetic */ App N(MutableLong mutableLong, Long2LongMap long2LongMap, float f, class04128 class041282) {
        return class041282.group((App)class041282.L(class05378.m), (App)class041282.L(class05378.y)).apply((Applicative)class041282, (class041392, class041393) -> (class047822, class074752, l) -> {
            if (class047822.N() - mutableLong.longValue() < 20L) {
                return false;
            }
            class05368 class053682 = class047822.method_19494();
            Optional optional = class053682.L(class035562 -> class035562.N(class03927.m), class074752.method_24515(), 48, class05372.field_18489);
            if (optional.isEmpty() || ((class07209)optional.get()).method_10262((class00753)class074752.method_24515()) <= 4.0) {
                return false;
            }
            MutableInt mutableInt = new MutableInt(0);
            mutableLong.setValue(class047822.N() + (long)class047822.method_8409().y(20));
            Predicate<class07209> predicate = class072092 -> {
                long l = class072092.method_10063();
                if (long2LongMap.containsKey(l)) {
                    return false;
                }
                if (mutableInt.incrementAndGet() >= 5) {
                    return false;
                }
                long2LongMap.put(l, mutableLong.longValue() + 40L);
                return true;
            };
            Set<Pair<class03556<class05369>, class07209>> set = class053682.y(class035562 -> class035562.N(class03927.m), predicate, class074752.method_24515(), 48, class05372.field_18489).collect(Collectors.toSet());
            class00143 class001432 = class05743.N((class07079)class074752, set);
            if (class001432 != null && class001432.z()) {
                class07209 class072093 = class001432.E();
                if (class053682.L(class072093).isPresent()) {
                    class041392.N((Object)new class05352(class072093, f, 1));
                    class047822.method_74535().y(class072093);
                }
            } else if (mutableInt.intValue() < 5) {
                long2LongMap.long2LongEntrySet().removeIf(entry -> entry.getLongValue() < mutableLong.longValue());
            }
            return true;
        });
    }
}

