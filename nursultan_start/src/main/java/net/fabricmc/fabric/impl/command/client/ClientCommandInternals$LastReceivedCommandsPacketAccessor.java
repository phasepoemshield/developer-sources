/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07233
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.impl.command.client;

import minecraft.class07233;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import org.jspecify.annotations.Nullable;

@Environment(value=EnvType.CLIENT)
public interface ClientCommandInternals$LastReceivedCommandsPacketAccessor {
    public @Nullable class07233 fabric_api$getLastReceivedCommandsPacket();
}

