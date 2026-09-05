/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  minecraft.class01659
 *  minecraft.class01666
 *  minecraft.class01894
 *  minecraft.class02362
 */
package net.fabricmc.fabric.impl.networking.splitter;

import io.netty.buffer.ByteBuf;
import minecraft.class01659;
import minecraft.class01666;
import minecraft.class01894;
import minecraft.class02362;

public record FabricSplitPacketPayload(ByteBuf byteBuf) implements class01659
{
    public static final class01666<FabricSplitPacketPayload> ID = new class01666(class01894.N((String)"fabric", (String)"split"));
    public static final class02362<ByteBuf, FabricSplitPacketPayload> CODEC = class02362.N(FabricSplitPacketPayload::write, FabricSplitPacketPayload::read);

    private static void write(ByteBuf byteBuf, FabricSplitPacketPayload fabricSplitPacketPayload) {
        byteBuf.writeBytes(fabricSplitPacketPayload.byteBuf());
    }

    private static FabricSplitPacketPayload read(ByteBuf byteBuf) {
        return new FabricSplitPacketPayload(byteBuf.readBytes(byteBuf.readableBytes()));
    }

    public class01666<? extends class01659> method_56479() {
        return ID;
    }
}

