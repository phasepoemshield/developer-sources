/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType
 *  io.netty.buffer.ByteBuf
 *  net.raphimc.vialegacy.api.splitter.PreNettyPacketType
 *  net.raphimc.vialegacy.api.splitter.PreNettyTypes
 */
package net.raphimc.vialegacy.protocol.release.r1_0_0_1tor1_1.packet;

import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType;
import io.netty.buffer.ByteBuf;
import java.util.function.BiConsumer;
import net.raphimc.vialegacy.api.splitter.PreNettyPacketType;
import net.raphimc.vialegacy.api.splitter.PreNettyTypes;

public enum ServerboundPackets1_0_0 implements ServerboundPacketType,
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
    INTERACT(7, (userConnection, byteBuf) -> byteBuf.skipBytes(9)),
    RESPAWN(9, (userConnection, byteBuf) -> byteBuf.skipBytes(13)),
    MOVE_PLAYER_STATUS_ONLY(10, (userConnection, byteBuf) -> byteBuf.skipBytes(1)),
    MOVE_PLAYER_POS(11, (userConnection, byteBuf) -> byteBuf.skipBytes(33)),
    MOVE_PLAYER_ROT(12, (userConnection, byteBuf) -> byteBuf.skipBytes(9)),
    MOVE_PLAYER_POS_ROT(13, (userConnection, byteBuf) -> byteBuf.skipBytes(41)),
    PLAYER_ACTION(14, (userConnection, byteBuf) -> byteBuf.skipBytes(11)),
    USE_ITEM_ON(15, (userConnection, byteBuf) -> {
        byteBuf.skipBytes(10);
        PreNettyTypes.readItemStack1_0((ByteBuf)byteBuf);
    }),
    SET_CARRIED_ITEM(16, (userConnection, byteBuf) -> byteBuf.skipBytes(2)),
    SWING(18, (userConnection, byteBuf) -> byteBuf.skipBytes(5)),
    PLAYER_COMMAND(19, (userConnection, byteBuf) -> byteBuf.skipBytes(5)),
    POSITION(27, (userConnection, byteBuf) -> byteBuf.skipBytes(18)),
    CONTAINER_CLOSE(101, (userConnection, byteBuf) -> byteBuf.skipBytes(1)),
    CONTAINER_CLICK(102, (userConnection, byteBuf) -> {
        byteBuf.skipBytes(7);
        PreNettyTypes.readItemStack1_0((ByteBuf)byteBuf);
    }),
    CONTAINER_ACK(106, (userConnection, byteBuf) -> byteBuf.skipBytes(4)),
    SET_CREATIVE_MODE_SLOT(107, (userConnection, byteBuf) -> {
        byteBuf.skipBytes(2);
        PreNettyTypes.readItemStack1_0((ByteBuf)byteBuf);
    }),
    CONTAINER_BUTTON_CLICK(108, (userConnection, byteBuf) -> byteBuf.skipBytes(2)),
    SIGN_UPDATE(130, (userConnection, byteBuf) -> {
        byteBuf.skipBytes(10);
        PreNettyTypes.readString((ByteBuf)byteBuf);
        PreNettyTypes.readString((ByteBuf)byteBuf);
        PreNettyTypes.readString((ByteBuf)byteBuf);
        PreNettyTypes.readString((ByteBuf)byteBuf);
    }),
    SERVER_PING(254, (userConnection, byteBuf) -> {}),
    DISCONNECT(255, (userConnection, byteBuf) -> PreNettyTypes.readString((ByteBuf)byteBuf));

    private static final ServerboundPackets1_0_0[] REGISTRY;
    private final int id;
    private final BiConsumer<UserConnection, ByteBuf> packetReader;

    private ServerboundPackets1_0_0(int n2, BiConsumer<UserConnection, ByteBuf> biConsumer) {
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

    public static ServerboundPackets1_0_0 getPacket(int n) {
        return REGISTRY[n];
    }

    static {
        REGISTRY = new ServerboundPackets1_0_0[256];
        ServerboundPackets1_0_0[] serverboundPackets1_0_0Array = ServerboundPackets1_0_0.values();
        int n = serverboundPackets1_0_0Array.length;
        for (int i = 0; i < n; ++i) {
            ServerboundPackets1_0_0 packet;
            ServerboundPackets1_0_0.REGISTRY[packet.id] = packet = serverboundPackets1_0_0Array[i];
        }
    }
}

