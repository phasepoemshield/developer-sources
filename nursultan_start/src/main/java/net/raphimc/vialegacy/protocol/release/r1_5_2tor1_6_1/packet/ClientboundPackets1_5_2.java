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
package net.raphimc.vialegacy.protocol.release.r1_5_2tor1_6_1.packet;

import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import io.netty.buffer.ByteBuf;
import java.util.function.BiConsumer;
import net.raphimc.vialegacy.api.splitter.PreNettyPacketType;
import net.raphimc.vialegacy.api.splitter.PreNettyTypes;

public enum ClientboundPackets1_5_2 implements ClientboundPacketType,
PreNettyPacketType
{
    KEEP_ALIVE(0, (userConnection, byteBuf) -> byteBuf.skipBytes(4)),
    LOGIN(1, (userConnection, byteBuf) -> {
        byteBuf.skipBytes(4);
        PreNettyTypes.readString((ByteBuf)byteBuf);
        byteBuf.skipBytes(5);
    }),
    CHAT(3, (userConnection, byteBuf) -> PreNettyTypes.readString((ByteBuf)byteBuf)),
    SET_TIME(4, (userConnection, byteBuf) -> byteBuf.skipBytes(16)),
    SET_EQUIPPED_ITEM(5, (userConnection, byteBuf) -> {
        byteBuf.skipBytes(6);
        PreNettyTypes.readItemStack1_3_1((ByteBuf)byteBuf);
    }),
    SET_DEFAULT_SPAWN_POSITION(6, (userConnection, byteBuf) -> byteBuf.skipBytes(12)),
    SET_HEALTH(8, (userConnection, byteBuf) -> byteBuf.skipBytes(8)),
    RESPAWN(9, (userConnection, byteBuf) -> {
        byteBuf.skipBytes(8);
        PreNettyTypes.readString((ByteBuf)byteBuf);
    }),
    MOVE_PLAYER_STATUS_ONLY(10, (userConnection, byteBuf) -> byteBuf.skipBytes(1)),
    MOVE_PLAYER_POS(11, (userConnection, byteBuf) -> byteBuf.skipBytes(33)),
    MOVE_PLAYER_ROT(12, (userConnection, byteBuf) -> byteBuf.skipBytes(9)),
    PLAYER_POSITION(13, (userConnection, byteBuf) -> byteBuf.skipBytes(41)),
    SET_CARRIED_ITEM(16, (userConnection, byteBuf) -> byteBuf.skipBytes(2)),
    PLAYER_SLEEP(17, (userConnection, byteBuf) -> byteBuf.skipBytes(14)),
    ANIMATE(18, (userConnection, byteBuf) -> byteBuf.skipBytes(5)),
    ADD_PLAYER(20, (userConnection, byteBuf) -> {
        byteBuf.skipBytes(4);
        PreNettyTypes.readString((ByteBuf)byteBuf);
        byteBuf.skipBytes(16);
        PreNettyTypes.readEntityDataList1_4_4((ByteBuf)byteBuf);
    }),
    TAKE_ITEM_ENTITY(22, (userConnection, byteBuf) -> byteBuf.skipBytes(8)),
    ADD_ENTITY(23, (userConnection, byteBuf) -> {
        byteBuf.skipBytes(19);
        int n = byteBuf.readInt();
        if (n > 0) {
            byteBuf.skipBytes(6);
        }
    }),
    ADD_MOB(24, (userConnection, byteBuf) -> {
        byteBuf.skipBytes(26);
        PreNettyTypes.readEntityDataList1_4_4((ByteBuf)byteBuf);
    }),
    ADD_PAINTING(25, (userConnection, byteBuf) -> {
        byteBuf.skipBytes(4);
        PreNettyTypes.readString((ByteBuf)byteBuf);
        byteBuf.skipBytes(16);
    }),
    ADD_EXPERIENCE_ORB(26, (userConnection, byteBuf) -> byteBuf.skipBytes(18)),
    SET_ENTITY_MOTION(28, (userConnection, byteBuf) -> byteBuf.skipBytes(10)),
    REMOVE_ENTITIES(29, (userConnection, byteBuf) -> {
        int n = byteBuf.readUnsignedByte();
        for (int i = 0; i < n; ++i) {
            byteBuf.readInt();
        }
    }),
    MOVE_ENTITY(30, (userConnection, byteBuf) -> byteBuf.skipBytes(4)),
    MOVE_ENTITY_POS(31, (userConnection, byteBuf) -> byteBuf.skipBytes(7)),
    MOVE_ENTITY_ROT(32, (userConnection, byteBuf) -> byteBuf.skipBytes(6)),
    MOVE_ENTITY_POS_ROT(33, (userConnection, byteBuf) -> byteBuf.skipBytes(9)),
    TELEPORT_ENTITY(34, (userConnection, byteBuf) -> byteBuf.skipBytes(18)),
    ROTATE_HEAD(35, (userConnection, byteBuf) -> byteBuf.skipBytes(5)),
    ENTITY_EVENT(38, (userConnection, byteBuf) -> byteBuf.skipBytes(5)),
    SET_ENTITY_LINK(39, (userConnection, byteBuf) -> byteBuf.skipBytes(8)),
    SET_ENTITY_DATA(40, (userConnection, byteBuf) -> {
        byteBuf.skipBytes(4);
        PreNettyTypes.readEntityDataList1_4_4((ByteBuf)byteBuf);
    }),
    UPDATE_MOB_EFFECT(41, (userConnection, byteBuf) -> byteBuf.skipBytes(8)),
    REMOVE_MOB_EFFECT(42, (userConnection, byteBuf) -> byteBuf.skipBytes(5)),
    SET_EXPERIENCE(43, (userConnection, byteBuf) -> byteBuf.skipBytes(8)),
    LEVEL_CHUNK(51, (userConnection, byteBuf) -> {
        byteBuf.skipBytes(13);
        int n = byteBuf.readInt();
        for (int i = 0; i < n; ++i) {
            byteBuf.readByte();
        }
    }),
    CHUNK_BLOCKS_UPDATE(52, (userConnection, byteBuf) -> {
        byteBuf.skipBytes(10);
        int n = byteBuf.readInt();
        for (int i = 0; i < n; ++i) {
            byteBuf.readByte();
        }
    }),
    BLOCK_UPDATE(53, (userConnection, byteBuf) -> byteBuf.skipBytes(12)),
    BLOCK_EVENT(54, (userConnection, byteBuf) -> byteBuf.skipBytes(14)),
    BLOCK_DESTRUCTION(55, (userConnection, byteBuf) -> byteBuf.skipBytes(17)),
    MAP_BULK_CHUNK(56, (userConnection, byteBuf) -> {
        int n;
        int n2 = byteBuf.readShort();
        int n3 = byteBuf.readInt();
        byteBuf.readBoolean();
        for (n = 0; n < n3; ++n) {
            byteBuf.readByte();
        }
        for (n = 0; n < n2; ++n) {
            byteBuf.skipBytes(12);
        }
    }),
    EXPLODE(60, (userConnection, byteBuf) -> {
        byteBuf.skipBytes(28);
        int n = byteBuf.readInt();
        for (int i = 0; i < n; ++i) {
            byteBuf.skipBytes(3);
        }
        byteBuf.skipBytes(12);
    }),
    LEVEL_EVENT(61, (userConnection, byteBuf) -> byteBuf.skipBytes(18)),
    CUSTOM_SOUND(62, (userConnection, byteBuf) -> {
        PreNettyTypes.readString((ByteBuf)byteBuf);
        byteBuf.skipBytes(17);
    }),
    LEVEL_PARTICLES(63, (userConnection, byteBuf) -> {
        PreNettyTypes.readString((ByteBuf)byteBuf);
        byteBuf.skipBytes(32);
    }),
    GAME_EVENT(70, (userConnection, byteBuf) -> byteBuf.skipBytes(2)),
    ADD_GLOBAL_ENTITY(71, (userConnection, byteBuf) -> byteBuf.skipBytes(17)),
    OPEN_SCREEN(100, (userConnection, byteBuf) -> {
        byteBuf.skipBytes(2);
        PreNettyTypes.readString((ByteBuf)byteBuf);
        byteBuf.skipBytes(2);
    }),
    CONTAINER_CLOSE(101, (userConnection, byteBuf) -> byteBuf.skipBytes(1)),
    CONTAINER_SET_SLOT(103, (userConnection, byteBuf) -> {
        byteBuf.skipBytes(3);
        PreNettyTypes.readItemStack1_3_1((ByteBuf)byteBuf);
    }),
    CONTAINER_SET_CONTENT(104, (userConnection, byteBuf) -> {
        byteBuf.skipBytes(1);
        int n = byteBuf.readShort();
        for (int i = 0; i < n; ++i) {
            PreNettyTypes.readItemStack1_3_1((ByteBuf)byteBuf);
        }
    }),
    CONTAINER_SET_DATA(105, (userConnection, byteBuf) -> byteBuf.skipBytes(5)),
    CONTAINER_ACK(106, (userConnection, byteBuf) -> byteBuf.skipBytes(4)),
    SET_CREATIVE_MODE_SLOT(107, (userConnection, byteBuf) -> {
        byteBuf.skipBytes(2);
        PreNettyTypes.readItemStack1_3_1((ByteBuf)byteBuf);
    }),
    UPDATE_SIGN(130, (userConnection, byteBuf) -> {
        byteBuf.skipBytes(10);
        PreNettyTypes.readString((ByteBuf)byteBuf);
        PreNettyTypes.readString((ByteBuf)byteBuf);
        PreNettyTypes.readString((ByteBuf)byteBuf);
        PreNettyTypes.readString((ByteBuf)byteBuf);
    }),
    MAP_ITEM_DATA(131, (userConnection, byteBuf) -> {
        byteBuf.skipBytes(4);
        int n = byteBuf.readUnsignedShort();
        for (int i = 0; i < n; ++i) {
            byteBuf.readByte();
        }
    }),
    BLOCK_ENTITY_DATA(132, (userConnection, byteBuf) -> {
        byteBuf.skipBytes(11);
        PreNettyTypes.readTag((ByteBuf)byteBuf);
    }),
    AWARD_STATS(200, (userConnection, byteBuf) -> byteBuf.skipBytes(5)),
    PLAYER_INFO(201, (userConnection, byteBuf) -> {
        PreNettyTypes.readString((ByteBuf)byteBuf);
        byteBuf.skipBytes(3);
    }),
    PLAYER_ABILITIES(202, (userConnection, byteBuf) -> byteBuf.skipBytes(3)),
    COMMAND_SUGGESTIONS(203, (userConnection, byteBuf) -> PreNettyTypes.readString((ByteBuf)byteBuf)),
    SET_OBJECTIVE(206, (userConnection, byteBuf) -> {
        PreNettyTypes.readString((ByteBuf)byteBuf);
        PreNettyTypes.readString((ByteBuf)byteBuf);
        byteBuf.skipBytes(1);
    }),
    SET_SCORE(207, (userConnection, byteBuf) -> {
        PreNettyTypes.readString((ByteBuf)byteBuf);
        byte by = byteBuf.readByte();
        if (by != 1) {
            PreNettyTypes.readString((ByteBuf)byteBuf);
            byteBuf.skipBytes(4);
        }
    }),
    SET_DISPLAY_OBJECTIVE(208, (userConnection, byteBuf) -> {
        byteBuf.skipBytes(1);
        PreNettyTypes.readString((ByteBuf)byteBuf);
    }),
    SET_PLAYER_TEAM(209, (userConnection, byteBuf) -> {
        PreNettyTypes.readString((ByteBuf)byteBuf);
        int n = byteBuf.readByte();
        if (n == 0 || n == 2) {
            PreNettyTypes.readString((ByteBuf)byteBuf);
            PreNettyTypes.readString((ByteBuf)byteBuf);
            PreNettyTypes.readString((ByteBuf)byteBuf);
            byteBuf.skipBytes(1);
        }
        if (n == 0 || n == 3 || n == 4) {
            n = byteBuf.readShort();
            for (int i = 0; i < n; ++i) {
                PreNettyTypes.readString((ByteBuf)byteBuf);
            }
        }
    }),
    CUSTOM_PAYLOAD(250, (userConnection, byteBuf) -> {
        PreNettyTypes.readString((ByteBuf)byteBuf);
        int n = byteBuf.readShort();
        for (int i = 0; i < n; ++i) {
            byteBuf.readByte();
        }
    }),
    SHARED_KEY(252, (userConnection, byteBuf) -> {
        PreNettyTypes.readByteArray((ByteBuf)byteBuf);
        PreNettyTypes.readByteArray((ByteBuf)byteBuf);
    }),
    SERVER_AUTH_DATA(253, (userConnection, byteBuf) -> {
        PreNettyTypes.readString((ByteBuf)byteBuf);
        PreNettyTypes.readByteArray((ByteBuf)byteBuf);
        PreNettyTypes.readByteArray((ByteBuf)byteBuf);
    }),
    DISCONNECT(255, (userConnection, byteBuf) -> PreNettyTypes.readString((ByteBuf)byteBuf));

    private static final ClientboundPackets1_5_2[] REGISTRY;
    private final int id;
    private final BiConsumer<UserConnection, ByteBuf> packetReader;

    private ClientboundPackets1_5_2(int n2, BiConsumer<UserConnection, ByteBuf> biConsumer) {
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

    public static ClientboundPackets1_5_2 getPacket(int n) {
        return REGISTRY[n];
    }

    static {
        REGISTRY = new ClientboundPackets1_5_2[256];
        ClientboundPackets1_5_2[] clientboundPackets1_5_2Array = ClientboundPackets1_5_2.values();
        int n = clientboundPackets1_5_2Array.length;
        for (int i = 0; i < n; ++i) {
            ClientboundPackets1_5_2 packet;
            ClientboundPackets1_5_2.REGISTRY[packet.id] = packet = clientboundPackets1_5_2Array[i];
        }
    }
}

