/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType
 *  io.netty.buffer.ByteBuf
 *  net.raphimc.vialegacy.api.splitter.PreNettyTypes
 */
package net.raphimc.vialegacy.protocol.alpha.a1_2_2toa1_2_3_1_2_3_4.packet;

import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType;
import io.netty.buffer.ByteBuf;
import java.util.function.BiConsumer;
import net.raphimc.vialegacy.api.splitter.PreNettyPacketType;
import net.raphimc.vialegacy.api.splitter.PreNettyTypes;

public enum ServerboundPacketsa1_2_2 implements ServerboundPacketType,
PreNettyPacketType
{
    KEEP_ALIVE(0, (userConnection, byteBuf) -> {}),
    LOGIN(1, (userConnection, byteBuf) -> {
        byteBuf.skipBytes(4);
        PreNettyTypes.readUTF((ByteBuf)byteBuf);
        PreNettyTypes.readUTF((ByteBuf)byteBuf);
        byteBuf.skipBytes(9);
    }),
    HANDSHAKE(2, (userConnection, byteBuf) -> PreNettyTypes.readUTF((ByteBuf)byteBuf)),
    CHAT(3, (userConnection, byteBuf) -> PreNettyTypes.readUTF((ByteBuf)byteBuf)),
    PLAYER_INVENTORY(5, (userConnection, byteBuf) -> {
        byteBuf.skipBytes(4);
        int n = byteBuf.readShort();
        for (int i = 0; i < n; ++i) {
            PreNettyTypes.readItemStackb1_2((ByteBuf)byteBuf);
        }
    }),
    INTERACT(7, (userConnection, byteBuf) -> byteBuf.skipBytes(8)),
    MOVE_PLAYER_STATUS_ONLY(10, (userConnection, byteBuf) -> byteBuf.skipBytes(1)),
    MOVE_PLAYER_POS(11, (userConnection, byteBuf) -> byteBuf.skipBytes(33)),
    MOVE_PLAYER_ROT(12, (userConnection, byteBuf) -> byteBuf.skipBytes(9)),
    MOVE_PLAYER_POS_ROT(13, (userConnection, byteBuf) -> byteBuf.skipBytes(41)),
    PLAYER_ACTION(14, (userConnection, byteBuf) -> byteBuf.skipBytes(11)),
    USE_ITEM_ON(15, (userConnection, byteBuf) -> byteBuf.skipBytes(12)),
    SET_CARRIED_ITEM(16, (userConnection, byteBuf) -> byteBuf.skipBytes(6)),
    SWING(18, (userConnection, byteBuf) -> byteBuf.skipBytes(5)),
    SPAWN_ITEM(21, (userConnection, byteBuf) -> byteBuf.skipBytes(22)),
    BLOCK_ENTITY_DATA(59, (userConnection, byteBuf) -> {
        byteBuf.skipBytes(10);
        int n = byteBuf.readUnsignedShort();
        for (int i = 0; i < n; ++i) {
            byteBuf.readByte();
        }
    }),
    DISCONNECT(255, (userConnection, byteBuf) -> PreNettyTypes.readUTF((ByteBuf)byteBuf));

    private static final ServerboundPacketsa1_2_2[] REGISTRY;
    private final int id;
    private final BiConsumer<UserConnection, ByteBuf> packetReader;

    private ServerboundPacketsa1_2_2(int n2, BiConsumer<UserConnection, ByteBuf> biConsumer) {
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

    public static ServerboundPacketsa1_2_2 getPacket(int n) {
        return REGISTRY[n];
    }

    static {
        REGISTRY = new ServerboundPacketsa1_2_2[256];
        ServerboundPacketsa1_2_2[] serverboundPacketsa1_2_2Array = ServerboundPacketsa1_2_2.values();
        int n = serverboundPacketsa1_2_2Array.length;
        for (int i = 0; i < n; ++i) {
            ServerboundPacketsa1_2_2 packet;
            ServerboundPacketsa1_2_2.REGISTRY[packet.id] = packet = serverboundPacketsa1_2_2Array[i];
        }
    }
}

