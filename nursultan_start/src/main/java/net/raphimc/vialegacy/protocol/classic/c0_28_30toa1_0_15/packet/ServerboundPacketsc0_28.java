/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType
 *  io.netty.buffer.ByteBuf
 *  net.raphimc.vialegacy.api.splitter.PreNettyPacketType
 */
package net.raphimc.vialegacy.protocol.classic.c0_28_30toa1_0_15.packet;

import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType;
import io.netty.buffer.ByteBuf;
import java.util.function.BiConsumer;
import net.raphimc.vialegacy.api.splitter.PreNettyPacketType;

public enum ServerboundPacketsc0_28 implements ServerboundPacketType,
PreNettyPacketType
{
    LOGIN(0, (userConnection, byteBuf) -> byteBuf.skipBytes(130)),
    USE_ITEM_ON(5, (userConnection, byteBuf) -> byteBuf.skipBytes(8)),
    MOVE_PLAYER_POS_ROT(8, (userConnection, byteBuf) -> byteBuf.skipBytes(9)),
    CHAT(13, (userConnection, byteBuf) -> byteBuf.skipBytes(65));

    private static final ServerboundPacketsc0_28[] REGISTRY;
    private final int id;
    private final BiConsumer<UserConnection, ByteBuf> packetReader;

    private ServerboundPacketsc0_28(int n2, BiConsumer<UserConnection, ByteBuf> biConsumer) {
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

    public static ServerboundPacketsc0_28 getPacket(int n) {
        return REGISTRY[n];
    }

    static {
        REGISTRY = new ServerboundPacketsc0_28[256];
        ServerboundPacketsc0_28[] serverboundPacketsc0_28Array = ServerboundPacketsc0_28.values();
        int n = serverboundPacketsc0_28Array.length;
        for (int i = 0; i < n; ++i) {
            ServerboundPacketsc0_28 packet;
            ServerboundPacketsc0_28.REGISTRY[packet.id] = packet = serverboundPacketsc0_28Array[i];
        }
    }
}

