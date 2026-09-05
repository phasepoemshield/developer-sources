/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01659
 */
package net.fabricmc.fabric.api.networking.v1;

import minecraft.class01659;
import net.fabricmc.fabric.api.networking.v1.ServerConfigurationNetworking$Context;

@FunctionalInterface
public interface ServerConfigurationNetworking$ConfigurationPacketHandler<T extends class01659> {
    public void receive(T var1, ServerConfigurationNetworking.Context var2);
}

