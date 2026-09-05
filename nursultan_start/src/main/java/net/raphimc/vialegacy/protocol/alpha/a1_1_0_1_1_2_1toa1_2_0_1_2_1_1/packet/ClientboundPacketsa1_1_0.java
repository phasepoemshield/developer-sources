/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  io.netty.buffer.ByteBuf
 *  net.raphimc.vialegacy.api.splitter.PreNettyTypes
 */
package net.raphimc.vialegacy.protocol.alpha.a1_1_0_1_1_2_1toa1_2_0_1_2_1_1.packet;

import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import io.netty.buffer.ByteBuf;
import java.util.function.BiConsumer;
import net.raphimc.vialegacy.api.splitter.PreNettyPacketType;
import net.raphimc.vialegacy.api.splitter.PreNettyTypes;

public enum ClientboundPacketsa1_1_0 implements ClientboundPacketType,
PreNettyPacketType
{
    KEEP_ALIVE(0, (userConnection, byteBuf) -> {}),
    LOGIN(1, (userConnection, byteBuf) -> {
        byteBuf.skipBytes(4);
        PreNettyTypes.readUTF((ByteBuf)byteBuf);
        PreNettyTypes.readUTF((ByteBuf)byteBuf);
    }),
    HANDSHAKE(2, (userConnection, byteBuf) -> PreNettyTypes.readUTF((ByteBuf)byteBuf)),
    CHAT(3, (userConnection, byteBuf) -> PreNettyTypes.readUTF((ByteBuf)byteBuf)),
    SET_TIME(4, (userConnection, byteBuf) -> byteBuf.skipBytes(8)),
    PLAYER_INVENTORY(5, (userConnection, byteBuf) -> {
        byteBuf.skipBytes(4);
        int n = byteBuf.readShort();
        for (int i = 0; i < n; ++i) {
            PreNettyTypes.readItemStackb1_2((ByteBuf)byteBuf);
        }
    }),
    SET_DEFAULT_SPAWN_POSITION(6, (userConnection, byteBuf) -> byteBuf.skipBytes(12)),
    MOVE_PLAYER_STATUS_ONLY(10, (userConnection, byteBuf) -> byteBuf.skipBytes(1)),
    MOVE_PLAYER_POS(11, (userConnection, byteBuf) -> byteBuf.skipBytes(33)),
    MOVE_PLAYER_ROT(12, (userConnection, byteBuf) -> byteBuf.skipBytes(9)),
    PLAYER_POSITION(13, (userConnection, byteBuf) -> byteBuf.skipBytes(41)),
    SET_CARRIED_ITEM(16, (userConnection, byteBuf) -> byteBuf.skipBytes(6)),
    ADD_TO_INVENTORY(17, (userConnection, byteBuf) -> byteBuf.skipBytes(5)),
    ANIMATE(18, (userConnection, byteBuf) -> byteBuf.skipBytes(5)),
    ADD_PLAYER(20, (userConnection, byteBuf) -> {
        byteBuf.skipBytes(4);
        PreNettyTypes.readUTF((ByteBuf)byteBuf);
        byteBuf.skipBytes(16);
    }),
    SPAWN_ITEM(21, (userConnection, byteBuf) -> byteBuf.skipBytes(22)),
    TAKE_ITEM_ENTITY(22, (userConnection, byteBuf) -> byteBuf.skipBytes(8)),
    ADD_ENTITY(23, (userConnection, byteBuf) -> byteBuf.skipBytes(17)),
    ADD_MOB(24, (userConnection, byteBuf) -> byteBuf.skipBytes(19)),
    REMOVE_ENTITIES(29, (userConnection, byteBuf) -> byteBuf.skipBytes(4)),
    MOVE_ENTITY(30, (userConnection, byteBuf) -> byteBuf.skipBytes(4)),
    MOVE_ENTITY_POS(31, (userConnection, byteBuf) -> byteBuf.skipBytes(7)),
    MOVE_ENTITY_ROT(32, (userConnection, byteBuf) -> byteBuf.skipBytes(6)),
    MOVE_ENTITY_POS_ROT(33, (userConnection, byteBuf) -> byteBuf.skipBytes(9)),
    TELEPORT_ENTITY(34, (userConnection, byteBuf) -> byteBuf.skipBytes(18)),
    PRE_CHUNK(50, (userConnection, byteBuf) -> byteBuf.skipBytes(9)),
    LEVEL_CHUNK(51, (userConnection, byteBuf) -> {
        byteBuf.skipBytes(13);
        int n = byteBuf.readInt();
        for (int i = 0; i < n; ++i) {
            byteBuf.readByte();
        }
    }),
    CHUNK_BLOCKS_UPDATE(52, (userConnection, byteBuf) -> {
        int n;
        byteBuf.skipBytes(8);
        int n2 = byteBuf.readShort();
        for (n = 0; n < n2; ++n) {
            byteBuf.readShort();
        }
        for (n = 0; n < n2; ++n) {
            byteBuf.readByte();
        }
        for (n = 0; n < n2; ++n) {
            byteBuf.readByte();
        }
    }),
    BLOCK_UPDATE(53, (userConnection, byteBuf) -> byteBuf.skipBytes(11)),
    BLOCK_ENTITY_DATA(59, (userConnection, byteBuf) -> {
        byteBuf.skipBytes(10);
        int n = byteBuf.readUnsignedShort();
        for (int i = 0; i < n; ++i) {
            byteBuf.readByte();
        }
    }),
    DISCONNECT(255, (userConnection, byteBuf) -> PreNettyTypes.readUTF((ByteBuf)byteBuf));

    private static final ClientboundPacketsa1_1_0[] REGISTRY;
    private final int id;
    private final BiConsumer<UserConnection, ByteBuf> packetReader;

    private ClientboundPacketsa1_1_0(int n2, BiConsumer<UserConnection, ByteBuf> biConsumer) {
        this.id = n2;
        this.packetReader = biConsumer;
    }

    public String getName() {
        return this.name();
    }

    public int getId() {
        return this.id;
    }

    @Override
    public BiConsumer<UserConnection, ByteBuf> getPacketReader() {
        return this.packetReader;
    }

    public static ClientboundPacketsa1_1_0 getPacket(int n) {
        return REGISTRY[n];
    }

    static {
        REGISTRY = new ClientboundPacketsa1_1_0[256];
        ClientboundPacketsa1_1_0[] clientboundPacketsa1_1_0Array = ClientboundPacketsa1_1_0.values();
        int n = clientboundPacketsa1_1_0Array.length;
        for (int i = 0; i < n; ++i) {
            ClientboundPacketsa1_1_0 packet;
            ClientboundPacketsa1_1_0.REGISTRY[packet.id] = packet = clientboundPacketsa1_1_0Array[i];
        }
    }
}

