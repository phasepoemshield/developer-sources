/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01874
 *  minecraft.class06202
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.networking.v1.PacketSender
 */
package net.fabricmc.fabric.api.client.networking.v1;

import minecraft.class01874;
import minecraft.class06202;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.networking.v1.PacketSender;

@Environment(value=EnvType.CLIENT)
public interface ClientConfigurationNetworking$Context {
    public class06202 client();

    public PacketSender responseSender();

    public class01874 networkHandler();
}

