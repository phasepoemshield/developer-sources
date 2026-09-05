/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class08734
 *  minecraft.class08752
 *  minecraft.class09037
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import java.util.Optional;
import minecraft.class08734;
import minecraft.class08752;
import minecraft.class09037;

public interface class09019
extends class09037 {
    public Optional<class08734> L();

    default public Optional<class08752> u() {
        return this.L().flatMap(class08734::y);
    }

    public int y();

    public MapCodec<? extends class09019> N();
}

