/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  io.netty.buffer.Unpooled
 *  minecraft.class00667
 *  minecraft.class01659
 *  minecraft.class01666
 *  minecraft.class01894
 *  net.fabricmc.fabric.api.networking.v1.PayloadTypeRegistry
 */
package com.viaversion.viafabricplus.base.sync_tasks;

import com.viaversion.viafabricplus.base.sync_tasks.SyncTasks;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import minecraft.class00667;
import minecraft.class01659;
import minecraft.class01666;
import minecraft.class01894;
import net.fabricmc.fabric.api.networking.v1.PayloadTypeRegistry;

public record DataCustomPayload(class00667 buf) implements class01659
{
    public static final class01666<DataCustomPayload> ID = new class01666(class01894.N((String)SyncTasks.PACKET_SYNC_IDENTIFIER));

    public static void init() {
        PayloadTypeRegistry.playS2C().register(ID, class01659.N((dataCustomPayload, class042472) -> {
            throw new UnsupportedOperationException("DataCustomPayload is a read-only packet");
        }, class042472 -> new DataCustomPayload(new class00667(Unpooled.copiedBuffer((ByteBuf)class042472.readSlice(class042472.readableBytes()))))));
    }

    public class01666<? extends class01659> method_56479() {
        return ID;
    }
}

