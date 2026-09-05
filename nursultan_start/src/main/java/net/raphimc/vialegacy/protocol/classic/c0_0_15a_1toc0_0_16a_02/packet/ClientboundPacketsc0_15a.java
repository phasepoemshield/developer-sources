/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  io.netty.buffer.ByteBuf
 *  net.raphimc.vialegacy.api.splitter.PreNettyPacketType
 */
package net.raphimc.vialegacy.protocol.classic.c0_0_15a_1toc0_0_16a_02.packet;

import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import io.netty.buffer.ByteBuf;
import java.util.function.BiConsumer;
import net.raphimc.vialegacy.api.splitter.PreNettyPacketType;

public enum ClientboundPacketsc0_15a implements ClientboundPacketType,
PreNettyPacketType
{
    LOGIN(0, (userConnection, byteBuf) -> byteBuf.skipBytes(64)),
    KEEP_ALIVE(1, (userConnection, byteBuf) -> {}),
    LEVEL_INIT(2, (userConnection, byteBuf) -> {}),
    LEVEL_DATA(3, (userConnection, byteBuf) -> byteBuf.skipBytes(1027)),
    LEVEL_FINALIZE(4, (userConnection, byteBuf) -> byteBuf.skipBytes(6)),
    BLOCK_UPDATE(6, (userConnection, byteBuf) -> byteBuf.skipBytes(7)),
    ADD_PLAYER(7, (userConnection, byteBuf) -> byteBuf.skipBytes(73)),
    TELEPORT_ENTITY(8, (userConnection, byteBuf) -> byteBuf.skipBytes(9)),
    REMOVE_ENTITIES(9, (userConnection, byteBuf) -> byteBuf.skipBytes(1));

    private static final ClientboundPacketsc0_15a[] REGISTRY;
    private final int id;
    private final BiConsumer<UserConnection, ByteBuf> packetReader;

    private ClientboundPacketsc0_15a(int n2, BiConsumer<UserConnection, ByteBuf> biConsumer) {
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

    public static ClientboundPacketsc0_15a getPacket(int n) {
        return REGISTRY[n];
    }

    static {
        REGISTRY = new ClientboundPacketsc0_15a[256];
        ClientboundPacketsc0_15a[] clientboundPacketsc0_15aArray = ClientboundPacketsc0_15a.values();
        int n = clientboundPacketsc0_15aArray.length;
        for (int i = 0; i < n; ++i) {
            ClientboundPacketsc0_15a packet;
            ClientboundPacketsc0_15a.REGISTRY[packet.id] = packet = clientboundPacketsc0_15aArray[i];
        }
    }
}

