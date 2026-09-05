/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01659
 */
package net.fabricmc.fabric.api.networking.v1;

import minecraft.class01659;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking$Context;

@FunctionalInterface
public interface ServerPlayNetworking$PlayPayloadHandler<T extends class01659> {
    public void receive(T var1, ServerPlayNetworking$Context var2);
}

