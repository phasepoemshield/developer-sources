/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00667
 */
package net.fabricmc.fabric.impl.networking;

import minecraft.class00667;
import net.fabricmc.fabric.impl.networking.CustomPayloadTypeProvider;

public interface FabricCustomPayloadPacketCodec<B extends class00667> {
    public void fabric_setPacketCodecProvider(CustomPayloadTypeProvider<B> var1);
}

