/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  it.unimi.dsi.fastutil.longs.Long2LongMap
 *  it.unimi.dsi.fastutil.longs.Long2LongOpenHashMap
 *  minecraft.class00143
 *  minecraft.class03927
 *  minecraft.class04782
 *  minecraft.class05355
 *  minecraft.class05368
 *  minecraft.class05372
 *  minecraft.class05378
 *  minecraft.class05743
 *  minecraft.class07079
 *  minecraft.class07209
 */
package minecraft;

import com.google.common.collect.ImmutableSet;
import it.unimi.dsi.fastutil.longs.Long2LongMap;
import it.unimi.dsi.fastutil.longs.Long2LongOpenHashMap;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import minecraft.class00143;
import minecraft.class03927;
import minecraft.class04782;
import minecraft.class05355;
import minecraft.class05368;
import minecraft.class05372;
import minecraft.class05378;
import minecraft.class05743;
import minecraft.class07079;
import minecraft.class07209;

public class class06277
extends class05355<class07079> {
    private static final int N = 40;
    private static final int y = 5;
    private static final int L = 20;
    private final Long2LongMap u = new Long2LongOpenHashMap();
    private int i;
    private long R;

    public class06277() {
        super(20);
    }

    protected void N(class04782 class047822, class07079 class070792) {
        Predicate<class07209> predicate;
        if (!class070792.method_6109()) {
            return;
        }
        this.i = 0;
        this.R = class047822.N() + (long)class047822.method_8409().y(20);
        class05368 class053682 = class047822.method_19494();
        Set set = class053682.y(class035562 -> class035562.N(class03927.m), predicate = class072092 -> {
            long l = class072092.method_10063();
            if (this.u.containsKey(l)) {
                return false;
            }
            if (++this.i >= 5) {
                return false;
            }
            this.u.put(l, this.R + 40L);
            return true;
        }, class070792.method_24515(), 48, class05372.field_18489).collect(Collectors.toSet());
        class00143 class001432 = class05743.N((class07079)class070792, set);
        if (class001432 != null && class001432.z()) {
            class07209 class072093 = class001432.E();
            if (class053682.L(class072093).isPresent()) {
                class070792.method_18868().N(class05378.l, (Object)class072093);
            }
        } else if (this.i < 5) {
            this.u.long2LongEntrySet().removeIf(entry -> entry.getLongValue() < this.R);
        }
    }

    public Set<class05378<?>> N() {
        return ImmutableSet.of((Object)class05378.l);
    }
}

