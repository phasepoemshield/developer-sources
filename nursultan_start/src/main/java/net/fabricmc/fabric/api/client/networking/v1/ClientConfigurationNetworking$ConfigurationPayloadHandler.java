/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01659
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package net.fabricmc.fabric.api.client.networking.v1;

import minecraft.class01659;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.networking.v1.ClientConfigurationNetworking$Context;

@FunctionalInterface
@Environment(value=EnvType.CLIENT)
public interface ClientConfigurationNetworking$ConfigurationPayloadHandler<T extends class01659> {
    public void receive(T var1, ClientConfigurationNetworking.Context var2);
}

