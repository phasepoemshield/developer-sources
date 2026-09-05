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
package net.raphimc.vialegacy.protocol.beta.b1_5_0_2tob1_6_0_6.packet;

import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType;
import io.netty.buffer.ByteBuf;
import java.util.function.BiConsumer;
import net.raphimc.vialegacy.api.splitter.PreNettyPacketType;
import net.raphimc.vialegacy.api.splitter.PreNettyTypes;

public enum ServerboundPacketsb1_5 implements ServerboundPacketType,
PreNettyPacketType
{
    KEEP_ALIVE(0, (userConnection, byteBuf) -> {}),
    LOGIN(1, (userConnection, byteBuf) -> {
        byteBuf.skipBytes(4);
        PreNettyTypes.readString((ByteBuf)byteBuf);
        byteBuf.skipBytes(9);
    }),
    HANDSHAKE(2, (userConnection, byteBuf) -> PreNettyTypes.readString((ByteBuf)byteBuf)),
    CHAT(3, (userConnection, byteBuf) -> PreNettyTypes.readString((ByteBuf)byteBuf)),
    INTERACT(7, (userConnection, byteBuf) -> byteBuf.skipBytes(9)),
    RESPAWN(9, (userConnection, byteBuf) -> {}),
    MOVE_PLAYER_STATUS_ONLY(10, (userConnection, byteBuf) -> byteBuf.skipBytes(1)),
    MOVE_PLAYER_POS(11, (userConnection, byteBuf) -> byteBuf.skipBytes(33)),
    MOVE_PLAYER_ROT(12, (userConnection, byteBuf) -> byteBuf.skipBytes(9)),
    MOVE_PLAYER_POS_ROT(13, (userConnection, byteBuf) -> byteBuf.skipBytes(41)),
    PLAYER_ACTION(14, (userConnection, byteBuf) -> byteBuf.skipBytes(11)),
    USE_ITEM_ON(15, (userConnection, byteBuf) -> {
        byteBuf.skipBytes(10);
        PreNettyTypes.readItemStackb1_2((ByteBuf)byteBuf);
    }),
    SET_CARRIED_ITEM(16, (userConnection, byteBuf) -> byteBuf.skipBytes(2)),
    SWING(18, (userConnection, byteBuf) -> byteBuf.skipBytes(5)),
    PLAYER_COMMAND(19, (userConnection, byteBuf) -> byteBuf.skipBytes(5)),
    POSITION(27, (userConnection, byteBuf) -> byteBuf.skipBytes(18)),
    CONTAINER_CLOSE(101, (userConnection, byteBuf) -> byteBuf.skipBytes(1)),
    CONTAINER_CLICK(102, (userConnection, byteBuf) -> {
        byteBuf.skipBytes(7);
        PreNettyTypes.readItemStackb1_2((ByteBuf)byteBuf);
    }),
    CONTAINER_ACK(106, (userConnection, byteBuf) -> byteBuf.skipBytes(4)),
    SIGN_UPDATE(130, (userConnection, byteBuf) -> {
        byteBuf.skipBytes(10);
        PreNettyTypes.readString((ByteBuf)byteBuf);
        PreNettyTypes.readString((ByteBuf)byteBuf);
        PreNettyTypes.readString((ByteBuf)byteBuf);
        PreNettyTypes.readString((ByteBuf)byteBuf);
    }),
    DISCONNECT(255, (userConnection, byteBuf) -> PreNettyTypes.readString((ByteBuf)byteBuf));

    private static final ServerboundPacketsb1_5[] REGISTRY;
    private final int id;
    private final BiConsumer<UserConnection, ByteBuf> packetReader;

    private ServerboundPacketsb1_5(int n2, BiConsumer<UserConnection, ByteBuf> biConsumer) {
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

    public static ServerboundPacketsb1_5 getPacket(int n) {
        return REGISTRY[n];
    }

    static {
        REGISTRY = new ServerboundPacketsb1_5[256];
        ServerboundPacketsb1_5[] serverboundPacketsb1_5Array = ServerboundPacketsb1_5.values();
        int n = serverboundPacketsb1_5Array.length;
        for (int i = 0; i < n; ++i) {
            ServerboundPacketsb1_5 packet;
            ServerboundPacketsb1_5.REGISTRY[packet.id] = packet = serverboundPacketsb1_5Array[i];
        }
    }
}

