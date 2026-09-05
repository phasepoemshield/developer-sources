/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viafabricplus.ViaFabricPlusImpl
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.item.Item
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.packet.Direction
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.packet.State
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.protocols.v1_12to1_12_1.packet.ClientboundPackets1_12_1
 *  io.netty.buffer.ByteBuf
 *  io.netty.buffer.Unpooled
 *  minecraft.class01042
 *  minecraft.class04247
 *  minecraft.class06202
 *  minecraft.class06584
 */
package com.viaversion.viafabricplus.protocoltranslator.translator;

import com.viaversion.viafabricplus.ViaFabricPlusImpl;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viafabricplus.protocoltranslator.protocol.ViaFabricPlusProtocol;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.item.Item;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.packet.Direction;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.packet.State;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.protocols.v1_12to1_12_1.packet.ClientboundPackets1_12_1;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import minecraft.class01042;
import minecraft.class04247;
import minecraft.class06202;
import minecraft.class06584;

public final class ItemTranslator {
    public static class06584 viaToMc(Item item, ProtocolVersion protocolVersion) {
        UserConnection userConnection = ProtocolTranslator.createDummyUserConnection(ProtocolTranslator.NATIVE_VERSION, protocolVersion);
        try {
            Protocol protocol2 = userConnection.getProtocolInfo().getPipeline().reversedPipes().stream().filter(protocol -> !protocol.isBaseProtocol()).findFirst().orElseThrow();
            PacketWrapper packetWrapper = PacketWrapper.create((PacketType)protocol2.getPacketTypesProvider().unmappedClientboundType(State.PLAY, ClientboundPackets1_12_1.CONTAINER_SET_SLOT.getName()), (UserConnection)userConnection);
            if (protocolVersion.newerThanOrEqualTo(ProtocolVersion.v1_8)) {
                packetWrapper.write((Type)Types.UNSIGNED_BYTE, (Object)0);
            } else {
                packetWrapper.write((Type)Types.BYTE, (Object)0);
            }
            packetWrapper.write((Type)Types.SHORT, (Object)0);
            packetWrapper.write(ViaFabricPlusProtocol.INSTANCE.getClientboundItemType(protocolVersion), (Object)(item != null ? item.copy() : null));
            packetWrapper.resetReader();
            packetWrapper.user().getProtocolInfo().getPipeline().transform(Direction.CLIENTBOUND, State.PLAY, packetWrapper);
            class04247 class042472 = new class04247(Unpooled.buffer(), (class01042)class06202.Nq().NE().j());
            packetWrapper.setPacketType(null);
            packetWrapper.writeToBuffer((ByteBuf)class042472);
            class042472.readUnsignedByte();
            class042472.E();
            class042472.readShort();
            return (class06584)class06584.B.decode((Object)class042472);
        }
        catch (Throwable throwable) {
            ViaFabricPlusImpl.INSTANCE.getLogger().error("Error converting ViaVersion {} item to native item stack", (Object)protocolVersion, (Object)throwable);
            return class06584.E;
        }
    }

    public static Item mcToVia(class06584 class065842, ProtocolVersion protocolVersion) {
        UserConnection userConnection = ProtocolTranslator.createDummyUserConnection(ProtocolTranslator.NATIVE_VERSION, protocolVersion);
        try {
            class04247 class042472 = new class04247(Unpooled.buffer(), (class01042)class06202.Nq().NE().j());
            class042472.W(0);
            class06584.Z.encode((Object)class042472, (Object)class065842);
            PacketWrapper packetWrapper = PacketWrapper.create((PacketType)ViaFabricPlusProtocol.INSTANCE.getSetCreativeModeSlot(), (ByteBuf)class042472, (UserConnection)userConnection);
            userConnection.getProtocolInfo().getPipeline().transform(Direction.SERVERBOUND, State.PLAY, packetWrapper);
            packetWrapper.read((Type)Types.SHORT);
            return (Item)packetWrapper.read(ViaFabricPlusProtocol.INSTANCE.getServerboundItemType(protocolVersion));
        }
        catch (Throwable throwable) {
            ViaFabricPlusImpl.INSTANCE.getLogger().error("Error converting native item stack to ViaVersion {} item stack", (Object)protocolVersion, (Object)throwable);
            return null;
        }
    }
}

