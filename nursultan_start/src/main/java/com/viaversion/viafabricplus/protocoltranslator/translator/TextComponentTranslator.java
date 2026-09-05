/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viafabricplus.ViaFabricPlusImpl
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.protocol.packet.Direction
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.packet.State
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.libs.gson.JsonElement
 *  com.viaversion.viaversion.protocols.v1_13_2to1_14.packet.ClientboundPackets1_14
 */
package com.viaversion.viafabricplus.protocoltranslator.translator;

import com.viaversion.nbt.tag.Tag;
import com.viaversion.viafabricplus.ViaFabricPlusImpl;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.protocol.packet.Direction;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.packet.State;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.libs.gson.JsonElement;
import com.viaversion.viaversion.protocols.v1_13_2to1_14.packet.ClientboundPackets1_14;

public final class TextComponentTranslator {
    private static final UserConnection DUMMY_USER_CONNECTION = ProtocolTranslator.createDummyUserConnection(ProtocolTranslator.NATIVE_VERSION, ProtocolVersion.v1_14);

    public static Tag via1_14toViaLatest(JsonElement jsonElement) {
        try {
            PacketWrapper packetWrapper = PacketWrapper.create((PacketType)ClientboundPackets1_14.OPEN_SCREEN, (UserConnection)DUMMY_USER_CONNECTION);
            packetWrapper.write((Type)Types.VAR_INT, (Object)1);
            packetWrapper.write((Type)Types.VAR_INT, (Object)0);
            packetWrapper.write(Types.COMPONENT, (Object)jsonElement);
            packetWrapper.resetReader();
            packetWrapper.user().getProtocolInfo().getPipeline().transform(Direction.CLIENTBOUND, State.PLAY, packetWrapper);
            packetWrapper.read((Type)Types.VAR_INT);
            packetWrapper.read((Type)Types.VAR_INT);
            return (Tag)packetWrapper.read(Types.TAG);
        }
        catch (Throwable throwable) {
            ViaFabricPlusImpl.INSTANCE.getLogger().error("Error converting ViaVersion 1.14 text component to native text component", throwable);
            return null;
        }
    }
}

