/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.DynamicOps
 *  minecraft.class01289
 *  minecraft.class07438
 */
package net.caffeinemc.mods.lithium.common.client;

import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import minecraft.class01289;
import minecraft.class07438;

class SharedFields$1
implements Codec<class01289<class07438>> {
    SharedFields$1() {
    }

    public <T> DataResult<Pair<class01289<class07438>, T>> decode(DynamicOps<T> dynamicOps, T t) {
        throw new IllegalStateException("Trying to decode client side brain! If you really want this, disable lithium's client side brain optimization!");
    }

    public <T> DataResult<T> encode(class01289<class07438> class012892, DynamicOps<T> dynamicOps, T t) {
        return DataResult.success(t);
    }
}

