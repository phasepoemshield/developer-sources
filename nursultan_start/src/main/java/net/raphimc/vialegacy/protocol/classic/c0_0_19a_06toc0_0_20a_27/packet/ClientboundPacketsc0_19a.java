/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  io.netty.buffer.ByteBuf
 *  net.raphimc.vialegacy.api.splitter.PreNettyPacketType
 */
package net.raphimc.vialegacy.protocol.classic.c0_0_19a_06toc0_0_20a_27.packet;

import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import io.netty.buffer.ByteBuf;
import java.util.function.BiConsumer;
import net.raphimc.vialegacy.api.splitter.PreNettyPacketType;

public enum ClientboundPacketsc0_19a implements ClientboundPacketType,
PreNettyPacketType
{
    LOGIN(0, (userConnection, byteBuf) -> byteBuf.skipBytes(129)),
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
    DISCONNECT(14, (userConnection, byteBuf) -> byteBuf.skipBytes(64));

    private static final ClientboundPacketsc0_19a[] REGISTRY;
    private final int id;
    private final BiConsumer<UserConnection, ByteBuf> packetReader;

    private ClientboundPacketsc0_19a(int n2, BiConsumer<UserConnection, ByteBuf> biConsumer) {
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

    public static ClientboundPacketsc0_19a getPacket(int n) {
        return REGISTRY[n];
    }

    static {
        REGISTRY = new ClientboundPacketsc0_19a[256];
        ClientboundPacketsc0_19a[] clientboundPacketsc0_19aArray = ClientboundPacketsc0_19a.values();
        int n = clientboundPacketsc0_19aArray.length;
        for (int i = 0; i < n; ++i) {
            ClientboundPacketsc0_19a packet;
            ClientboundPacketsc0_19a.REGISTRY[packet.id] = packet = clientboundPacketsc0_19aArray[i];
        }
    }
}

