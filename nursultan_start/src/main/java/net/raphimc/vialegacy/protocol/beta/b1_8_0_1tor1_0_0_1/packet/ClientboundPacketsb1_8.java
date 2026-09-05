/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  io.netty.buffer.ByteBuf
 *  net.raphimc.vialegacy.api.splitter.PreNettyPacketType
 *  net.raphimc.vialegacy.api.splitter.PreNettyTypes
 */
package net.raphimc.vialegacy.protocol.beta.b1_8_0_1tor1_0_0_1.packet;

import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import io.netty.buffer.ByteBuf;
import java.util.function.BiConsumer;
import net.raphimc.vialegacy.api.splitter.PreNettyPacketType;
import net.raphimc.vialegacy.api.splitter.PreNettyTypes;

public enum ClientboundPacketsb1_8 implements ClientboundPacketType,
PreNettyPacketType
{
    KEEP_ALIVE(0, (userConnection, byteBuf) -> byteBuf.skipBytes(4)),
    LOGIN(1, (userConnection, byteBuf) -> {
        byteBuf.skipBytes(4);
        PreNettyTypes.readString((ByteBuf)byteBuf);
        byteBuf.skipBytes(16);
    }),
    HANDSHAKE(2, (userConnection, byteBuf) -> PreNettyTypes.readString((ByteBuf)byteBuf)),
    CHAT(3, (userConnection, byteBuf) -> PreNettyTypes.readString((ByteBuf)byteBuf)),
    SET_TIME(4, (userConnection, byteBuf) -> byteBuf.skipBytes(8)),
    SET_EQUIPPED_ITEM(5, (userConnection, byteBuf) -> byteBuf.skipBytes(10)),
    SET_DEFAULT_SPAWN_POSITION(6, (userConnection, byteBuf) -> byteBuf.skipBytes(12)),
    SET_HEALTH(8, (userConnection, byteBuf) -> byteBuf.skipBytes(8)),
    RESPAWN(9, (userConnection, byteBuf) -> byteBuf.skipBytes(13)),
    MOVE_PLAYER_STATUS_ONLY(10, (userConnection, byteBuf) -> byteBuf.skipBytes(1)),
    MOVE_PLAYER_POS(11, (userConnection, byteBuf) -> byteBuf.skipBytes(33)),
    MOVE_PLAYER_ROT(12, (userConnection, byteBuf) -> byteBuf.skipBytes(9)),
    PLAYER_POSITION(13, (userConnection, byteBuf) -> byteBuf.skipBytes(41)),
    PLAYER_SLEEP(17, (userConnection, byteBuf) -> byteBuf.skipBytes(14)),
    ANIMATE(18, (userConnection, byteBuf) -> byteBuf.skipBytes(5)),
    ADD_PLAYER(20, (userConnection, byteBuf) -> {
        byteBuf.skipBytes(4);
        PreNettyTypes.readString((ByteBuf)byteBuf);
        byteBuf.skipBytes(16);
    }),
    SPAWN_ITEM(21, (userConnection, byteBuf) -> byteBuf.skipBytes(24)),
    TAKE_ITEM_ENTITY(22, (userConnection, byteBuf) -> byteBuf.skipBytes(8)),
    ADD_ENTITY(23, (userConnection, byteBuf) -> {
        byteBuf.skipBytes(17);
        int n = byteBuf.readInt();
        if (n > 0) {
            byteBuf.skipBytes(6);
        }
    }),
    ADD_MOB(24, (userConnection, byteBuf) -> {
        byteBuf.skipBytes(19);
        PreNettyTypes.readEntityDataListb1_5((ByteBuf)byteBuf);
    }),
    ADD_PAINTING(25, (userConnection, byteBuf) -> {
        byteBuf.skipBytes(4);
        PreNettyTypes.readString((ByteBuf)byteBuf);
        byteBuf.skipBytes(16);
    }),
    ADD_EXPERIENCE_ORB(26, (userConnection, byteBuf) -> byteBuf.skipBytes(18)),
    SET_ENTITY_MOTION(28, (userConnection, byteBuf) -> byteBuf.skipBytes(10)),
    REMOVE_ENTITIES(29, (userConnection, byteBuf) -> byteBuf.skipBytes(4)),
    MOVE_ENTITY(30, (userConnection, byteBuf) -> byteBuf.skipBytes(4)),
    MOVE_ENTITY_POS(31, (userConnection, byteBuf) -> byteBuf.skipBytes(7)),
    MOVE_ENTITY_ROT(32, (userConnection, byteBuf) -> byteBuf.skipBytes(6)),
    MOVE_ENTITY_POS_ROT(33, (userConnection, byteBuf) -> byteBuf.skipBytes(9)),
    TELEPORT_ENTITY(34, (userConnection, byteBuf) -> byteBuf.skipBytes(18)),
    ENTITY_EVENT(38, (userConnection, byteBuf) -> byteBuf.skipBytes(5)),
    SET_ENTITY_LINK(39, (userConnection, byteBuf) -> byteBuf.skipBytes(8)),
    SET_ENTITY_DATA(40, (userConnection, byteBuf) -> {
        byteBuf.skipBytes(4);
        PreNettyTypes.readEntityDataListb1_5((ByteBuf)byteBuf);
    }),
    UPDATE_MOB_EFFECT(41, (userConnection, byteBuf) -> byteBuf.skipBytes(8)),
    REMOVE_MOB_EFFECT(42, (userConnection, byteBuf) -> byteBuf.skipBytes(5)),
    SET_EXPERIENCE(43, (userConnection, byteBuf) -> byteBuf.skipBytes(4)),
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
    BLOCK_EVENT(54, (userConnection, byteBuf) -> byteBuf.skipBytes(12)),
    EXPLODE(60, (userConnection, byteBuf) -> {
        byteBuf.skipBytes(28);
        int n = byteBuf.readInt();
        for (int i = 0; i < n; ++i) {
            byteBuf.skipBytes(3);
        }
    }),
    LEVEL_EVENT(61, (userConnection, byteBuf) -> byteBuf.skipBytes(17)),
    GAME_EVENT(70, (userConnection, byteBuf) -> byteBuf.skipBytes(2)),
    ADD_GLOBAL_ENTITY(71, (userConnection, byteBuf) -> byteBuf.skipBytes(17)),
    OPEN_SCREEN(100, (userConnection, byteBuf) -> {
        byteBuf.skipBytes(2);
        PreNettyTypes.readString((ByteBuf)byteBuf);
        byteBuf.skipBytes(1);
    }),
    CONTAINER_CLOSE(101, (userConnection, byteBuf) -> byteBuf.skipBytes(1)),
    CONTAINER_SET_SLOT(103, (userConnection, byteBuf) -> {
        byteBuf.skipBytes(3);
        PreNettyTypes.readItemStackb1_2((ByteBuf)byteBuf);
    }),
    CONTAINER_SET_CONTENT(104, (userConnection, byteBuf) -> {
        byteBuf.skipBytes(1);
        int n = byteBuf.readShort();
        for (int i = 0; i < n; ++i) {
            PreNettyTypes.readItemStackb1_2((ByteBuf)byteBuf);
        }
    }),
    CONTAINER_SET_DATA(105, (userConnection, byteBuf) -> byteBuf.skipBytes(5)),
    CONTAINER_ACK(106, (userConnection, byteBuf) -> byteBuf.skipBytes(4)),
    SET_CREATIVE_MODE_SLOT(107, (userConnection, byteBuf) -> byteBuf.skipBytes(10)),
    UPDATE_SIGN(130, (userConnection, byteBuf) -> {
        byteBuf.skipBytes(10);
        PreNettyTypes.readString((ByteBuf)byteBuf);
        PreNettyTypes.readString((ByteBuf)byteBuf);
        PreNettyTypes.readString((ByteBuf)byteBuf);
        PreNettyTypes.readString((ByteBuf)byteBuf);
    }),
    MAP_ITEM_DATA(131, (userConnection, byteBuf) -> {
        byteBuf.skipBytes(4);
        int n = byteBuf.readUnsignedByte();
        for (int i = 0; i < n; ++i) {
            byteBuf.readByte();
        }
    }),
    AWARD_STATS(200, (userConnection, byteBuf) -> byteBuf.skipBytes(5)),
    PLAYER_INFO(201, (userConnection, byteBuf) -> {
        PreNettyTypes.readString((ByteBuf)byteBuf);
        byteBuf.skipBytes(3);
    }),
    DISCONNECT(255, (userConnection, byteBuf) -> PreNettyTypes.readString((ByteBuf)byteBuf));

    private static final ClientboundPacketsb1_8[] REGISTRY;
    private final int id;
    private final BiConsumer<UserConnection, ByteBuf> packetReader;

    private ClientboundPacketsb1_8(int n2, BiConsumer<UserConnection, ByteBuf> biConsumer) {
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

    public static ClientboundPacketsb1_8 getPacket(int n) {
        return REGISTRY[n];
    }

    static {
        REGISTRY = new ClientboundPacketsb1_8[256];
        ClientboundPacketsb1_8[] clientboundPacketsb1_8Array = ClientboundPacketsb1_8.values();
        int n = clientboundPacketsb1_8Array.length;
        for (int i = 0; i < n; ++i) {
            ClientboundPacketsb1_8 packet;
            ClientboundPacketsb1_8.REGISTRY[packet.id] = packet = clientboundPacketsb1_8Array[i];
        }
    }
}

