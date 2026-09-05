/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class02362
 *  minecraft.class04247
 *  minecraft.class07103
 */
package net.fabricmc.fabric.api.particle.v1;

import com.mojang.serialization.MapCodec;
import java.util.function.Function;
import minecraft.class02362;
import minecraft.class04247;
import minecraft.class07103;

class FabricParticleTypes$3
extends class07103<T> {
    final /* synthetic */ Function val$codecGetter;
    final /* synthetic */ Function val$packetCodecGetter;

    FabricParticleTypes$3(boolean bl, Function function, Function function2) {
        this.val$codecGetter = function;
        this.val$packetCodecGetter = function2;
        super(bl);
    }

    public MapCodec<T> method_29138() {
        return (MapCodec)this.val$codecGetter.apply(this);
    }

    public class02362<? super class04247, T> method_56179() {
        return (class02362)this.val$packetCodecGetter.apply(this);
    }
}

