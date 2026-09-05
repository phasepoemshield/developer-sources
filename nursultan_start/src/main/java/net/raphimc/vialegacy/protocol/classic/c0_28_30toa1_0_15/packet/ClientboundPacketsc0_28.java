/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  io.netty.buffer.ByteBuf
 *  net.raphimc.vialegacy.api.splitter.PreNettyPacketType
 */
package net.raphimc.vialegacy.protocol.classic.c0_28_30toa1_0_15.packet;

import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import io.netty.buffer.ByteBuf;
import java.util.function.BiConsumer;
import net.raphimc.vialegacy.api.splitter.PreNettyPacketType;

public enum ClientboundPacketsc0_28 implements ClientboundPacketType,
PreNettyPacketType
{
    LOGIN(0, (userConnection, byteBuf) -> byteBuf.skipBytes(130)),
    KEEP_ALIVE(1, (userConnection, byteBuf) -> {}),
    LEVEL_INIT(2, (userConnection, byteBuf) -> {}),
    LEVEL_DATA(3, (userConnection, byteBuf) -> byteBuf.skipBytes(1027)),
    LEVEL_FINALIZE(4, (userConnection, byteBuf) -> byteBuf.skipBytes(6)),
    BLOCK_UPDATE(6, (userConnection, byteBuf) -> byteBuf.skipBytes(7)),
    ADD_PLAYER(7, (userConnection, byteBuf) -> byteBuf.skipBytes(73)),
    TELEPORT_ENTITY(8, (userConnection, byteBuf) -> byteBuf.skipBytes(9)),
    MOVE_ENTITY_POS_ROT(9, (userConnection, byteBuf) -> byteBuf.skipBytes(6)),
    MOVE_ENTITY_POS(10, (userConnection, byteBuf) -> byteBuf.skipBytes(4)),
    MOVE_ENTITY_ROT(11, (userConnection, byteBuf) -> byteBuf.skipBytes(3)),
    REMOVE_ENTITIES(12, (userConnection, byteBuf) -> byteBuf.skipBytes(1)),
    CHAT(13, (userConnection, byteBuf) -> byteBuf.skipBytes(65)),
    DISCONNECT(14, (userConnection, byteBuf) -> byteBuf.skipBytes(64)),
    OP_LEVEL_UPDATE(15, (userConnection, byteBuf) -> byteBuf.skipBytes(1));

    private static final ClientboundPacketsc0_28[] REGISTRY;
    private final int id;
    private final BiConsumer<UserConnection, ByteBuf> packetReader;

    private ClientboundPacketsc0_28(int n2, BiConsumer<UserConnection, ByteBuf> biConsumer) {
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

    public static ClientboundPacketsc0_28 getPacket(int n) {
        return REGISTRY[n];
    }

    static {
        REGISTRY = new ClientboundPacketsc0_28[256];
        ClientboundPacketsc0_28[] clientboundPacketsc0_28Array = ClientboundPacketsc0_28.values();
        int n = clientboundPacketsc0_28Array.length;
        for (int i = 0; i < n; ++i) {
            ClientboundPacketsc0_28 packet;
            ClientboundPacketsc0_28.REGISTRY[packet.id] = packet = clientboundPacketsc0_28Array[i];
        }
    }
}

