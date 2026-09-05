/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType
 *  io.netty.buffer.ByteBuf
 *  net.raphimc.vialegacy.api.splitter.PreNettyPacketType
 */
package net.raphimc.vialegacy.protocol.classic.c0_0_15a_1toc0_0_16a_02.packet;

import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType;
import io.netty.buffer.ByteBuf;
import java.util.function.BiConsumer;
import net.raphimc.vialegacy.api.splitter.PreNettyPacketType;

public enum ServerboundPacketsc0_15a implements ServerboundPacketType,
PreNettyPacketType
{
    LOGIN(0, (userConnection, byteBuf) -> byteBuf.skipBytes(64)),
    USE_ITEM_ON(5, (userConnection, byteBuf) -> byteBuf.skipBytes(8)),
    MOVE_PLAYER_POS_ROT(8, (userConnection, byteBuf) -> byteBuf.skipBytes(9));

    private static final ServerboundPacketsc0_15a[] REGISTRY;
    private final int id;
    private final BiConsumer<UserConnection, ByteBuf> packetReader;

    private ServerboundPacketsc0_15a(int n2, BiConsumer<UserConnection, ByteBuf> biConsumer) {
        this.id = n2;
        this.packetReader = biConsumer;
    }

    public String getName() {
        return this.name();
    }

    public int getId() {
        return this.id;
    }

    public BiConsumer<UserConnection, ByteBuf> getPacketReader() {
        return this.packetReader;
    }

    public static ServerboundPacketsc0_15a getPacket(int n) {
        return REGISTRY[n];
    }

    static {
        REGISTRY = new ServerboundPacketsc0_15a[256];
        ServerboundPacketsc0_15a[] serverboundPacketsc0_15aArray = ServerboundPacketsc0_15a.values();
        int n = serverboundPacketsc0_15aArray.length;
        for (int i = 0; i < n; ++i) {
            ServerboundPacketsc0_15a packet;
            ServerboundPacketsc0_15a.REGISTRY[packet.id] = packet = serverboundPacketsc0_15aArray[i];
        }
    }
}

