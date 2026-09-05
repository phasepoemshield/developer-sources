/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viafabricplus.ViaFabricPlusImpl
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.BlockPosition
 *  com.viaversion.viaversion.api.protocol.packet.Direction
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.packet.State
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.protocols.v1_17_1to1_18.packet.ClientboundPackets1_18
 *  minecraft.class00500
 *  minecraft.class00869
 *  minecraft.class00891
 */
package com.viaversion.viafabricplus.protocoltranslator.translator;

import com.viaversion.viafabricplus.ViaFabricPlusImpl;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.BlockPosition;
import com.viaversion.viaversion.api.protocol.packet.Direction;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.packet.State;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.protocols.v1_17_1to1_18.packet.ClientboundPackets1_18;
import minecraft.class00500;
import minecraft.class00869;
import minecraft.class00891;

public final class BlockStateTranslator {
    private static final UserConnection DUMMY_USER_CONNECTION = ProtocolTranslator.createDummyUserConnection(ProtocolTranslator.NATIVE_VERSION, ProtocolVersion.v1_18_2);

    public static class00500 via1_18_2toMc(int n) {
        try {
            PacketWrapper packetWrapper = PacketWrapper.create((PacketType)ClientboundPackets1_18.LEVEL_EVENT, (UserConnection)DUMMY_USER_CONNECTION);
            packetWrapper.write((Type)Types.INT, (Object)2001);
            packetWrapper.write(Types.BLOCK_POSITION1_14, (Object)new BlockPosition(0, 0, 0));
            packetWrapper.write((Type)Types.INT, (Object)n);
            packetWrapper.write((Type)Types.BOOLEAN, (Object)false);
            packetWrapper.resetReader();
            packetWrapper.user().getProtocolInfo().getPipeline().transform(Direction.CLIENTBOUND, State.PLAY, packetWrapper);
            packetWrapper.read((Type)Types.INT);
            packetWrapper.read(Types.BLOCK_POSITION1_14);
            return class00891.N((int)((Integer)packetWrapper.read((Type)Types.INT)));
        }
        catch (Throwable throwable) {
            ViaFabricPlusImpl.INSTANCE.getLogger().error("Error converting ViaVersion 1.18.2 block state to native block state", throwable);
            return class00869.N.W();
        }
    }
}

