/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType
 *  io.netty.buffer.ByteBuf
 *  net.raphimc.vialegacy.api.splitter.PreNettyPacketType
 */
package net.raphimc.vialegacy.protocol.classic.c0_30cpetoc0_28_30.packet;

import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType;
import io.netty.buffer.ByteBuf;
import java.util.function.BiConsumer;
import net.raphimc.vialegacy.api.splitter.PreNettyPacketType;

public enum ServerboundPacketsc0_30cpe implements ServerboundPacketType,
PreNettyPacketType
{
    LOGIN(0, (userConnection, byteBuf) -> byteBuf.skipBytes(130)),
    USE_ITEM_ON(5, (userConnection, byteBuf) -> byteBuf.skipBytes(8)),
    MOVE_PLAYER_POS_ROT(8, (userConnection, byteBuf) -> byteBuf.skipBytes(9)),
    CHAT(13, (userConnection, byteBuf) -> byteBuf.skipBytes(65)),
    EXTENSION_PROTOCOL_INFO(16, (userConnection, byteBuf) -> byteBuf.skipBytes(66)),
    EXTENSION_PROTOCOL_ENTRY(17, (userConnection, byteBuf) -> byteBuf.skipBytes(68)),
    EXT_CUSTOM_BLOCKS_SUPPORT_LEVEL(19, (userConnection, byteBuf) -> byteBuf.skipBytes(1)),
    EXT_TWO_WAY_PING(43, (userConnection, byteBuf) -> byteBuf.skipBytes(3));

    private static final ServerboundPacketsc0_30cpe[] REGISTRY;
    private final int id;
    private final BiConsumer<UserConnection, ByteBuf> packetReader;

    private ServerboundPacketsc0_30cpe(int n2, BiConsumer<UserConnection, ByteBuf> biConsumer) {
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

    public static ServerboundPacketsc0_30cpe getPacket(int n) {
        return REGISTRY[n];
    }

    static {
        REGISTRY = new ServerboundPacketsc0_30cpe[256];
        ServerboundPacketsc0_30cpe[] serverboundPacketsc0_30cpeArray = ServerboundPacketsc0_30cpe.values();
        int n = serverboundPacketsc0_30cpeArray.length;
        for (int i = 0; i < n; ++i) {
            ServerboundPacketsc0_30cpe packet;
            ServerboundPacketsc0_30cpe.REGISTRY[packet.id] = packet = serverboundPacketsc0_30cpeArray[i];
        }
    }
}

