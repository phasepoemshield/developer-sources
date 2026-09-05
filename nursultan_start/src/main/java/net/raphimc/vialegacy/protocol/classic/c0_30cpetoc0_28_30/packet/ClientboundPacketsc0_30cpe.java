/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viafabricplus.features.classic.cpe_extension.CPEAdditions
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  io.netty.buffer.ByteBuf
 *  net.raphimc.vialegacy.api.splitter.PreNettyPacketType
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package net.raphimc.vialegacy.protocol.classic.c0_30cpetoc0_28_30.packet;

import com.viaversion.viafabricplus.features.classic.cpe_extension.CPEAdditions;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import io.netty.buffer.ByteBuf;
import java.util.function.BiConsumer;
import net.raphimc.vialegacy.api.splitter.PreNettyPacketType;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public enum ClientboundPacketsc0_30cpe implements ClientboundPacketType,
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
    OP_LEVEL_UPDATE(15, (userConnection, byteBuf) -> byteBuf.skipBytes(1)),
    EXTENSION_PROTOCOL_INFO(16, (userConnection, byteBuf) -> byteBuf.skipBytes(66)),
    EXTENSION_PROTOCOL_ENTRY(17, (userConnection, byteBuf) -> byteBuf.skipBytes(68)),
    EXT_CUSTOM_BLOCKS_SUPPORT_LEVEL(19, (userConnection, byteBuf) -> byteBuf.skipBytes(1)),
    EXT_SET_BLOCK_PERMISSION(28, (userConnection, byteBuf) -> byteBuf.skipBytes(3)),
    EXT_HACK_CONTROL(32, (userConnection, byteBuf) -> byteBuf.skipBytes(7)),
    EXT_BULK_BLOCK_UPDATE(38, (userConnection, byteBuf) -> byteBuf.skipBytes(1281)),
    EXT_TWO_WAY_PING(43, (userConnection, byteBuf) -> byteBuf.skipBytes(3));

    private static final ClientboundPacketsc0_30cpe[] REGISTRY;
    private final int id;
    private final BiConsumer<UserConnection, ByteBuf> packetReader;

    private ClientboundPacketsc0_30cpe(int n2, BiConsumer<UserConnection, ByteBuf> biConsumer) {
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

    private static void handler$dfj000$viafabricplus$addCustomPackets(int n, CallbackInfoReturnable callbackInfoReturnable) {
        if (CPEAdditions.CUSTOM_PACKETS.containsKey(n)) {
            callbackInfoReturnable.setReturnValue((Object)((ClientboundPacketsc0_30cpe)((Object)CPEAdditions.CUSTOM_PACKETS.get(n))));
        }
    }

    public static ClientboundPacketsc0_30cpe getPacket(int n) {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        ClientboundPacketsc0_30cpe.handler$dfj000$viafabricplus$addCustomPackets(n, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return (ClientboundPacketsc0_30cpe)((Object)callbackInfoReturnable.getReturnValue());
        }
        return REGISTRY[n];
    }

    static {
        REGISTRY = new ClientboundPacketsc0_30cpe[256];
        ClientboundPacketsc0_30cpe[] clientboundPacketsc0_30cpeArray = ClientboundPacketsc0_30cpe.values();
        int n = clientboundPacketsc0_30cpeArray.length;
        for (int i = 0; i < n; ++i) {
            ClientboundPacketsc0_30cpe packet;
            ClientboundPacketsc0_30cpe.REGISTRY[packet.id] = packet = clientboundPacketsc0_30cpeArray[i];
        }
    }
}

