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
import minecraft.class02362;
import minecraft.class04247;
import minecraft.class07103;

class FabricParticleTypes$2
extends class07103<T> {
    final /* synthetic */ MapCodec val$codec;
    final /* synthetic */ class02362 val$packetCodec;

    FabricParticleTypes$2(boolean bl, MapCodec mapCodec, class02362 class023622) {
        this.val$codec = mapCodec;
        this.val$packetCodec = class023622;
        super(bl);
    }

    public MapCodec<T> method_29138() {
        return this.val$codec;
    }

    public class02362<? super class04247, T> method_56179() {
        return this.val$packetCodec;
    }
}

