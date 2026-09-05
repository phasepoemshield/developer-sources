/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viafabricplus.features.classic.cpe_extension.CPEAdditions
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.protocols.v1_19_3to1_19_4.Protocol1_19_3To1_19_4
 *  com.viaversion.viaversion.protocols.v1_19_3to1_19_4.packet.ClientboundPackets1_19_4
 */
package net.raphimc.vialegacy.protocol.classic.c0_30cpetoc0_28_30;

import com.viaversion.viafabricplus.features.classic.cpe_extension.CPEAdditions;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.protocols.v1_19_3to1_19_4.Protocol1_19_3To1_19_4;
import com.viaversion.viaversion.protocols.v1_19_3to1_19_4.packet.ClientboundPackets1_19_4;
import net.raphimc.vialegacy.protocol.classic.c0_30cpetoc0_28_30.Protocolc0_30cpeToc0_28_30;

class Protocolc0_30cpeToc0_28_30$Anonymous$b2145db916cf3ad19a64e3a546834baf
extends PacketHandlers {
    Protocolc0_30cpeToc0_28_30$Anonymous$b2145db916cf3ad19a64e3a546834baf(Protocolc0_30cpeToc0_28_30 protocolc0_30cpeToc0_28_30) {
    }

    public void register() {
        this.handler(packetWrapper -> {
            packetWrapper.cancel();
            byte by = (Byte)packetWrapper.read((Type)Types.BYTE);
            PacketWrapper packetWrapper2 = PacketWrapper.create((PacketType)ClientboundPackets1_19_4.GAME_EVENT, (UserConnection)packetWrapper.user());
            packetWrapper2.write((Type)Types.UNSIGNED_BYTE, (Object)(by == 0 ? (short)1 : (short)2));
            packetWrapper2.write((Type)Types.FLOAT, (Object)Float.valueOf(0.0f));
            packetWrapper2.send(Protocol1_19_3To1_19_4.class);
            if (by == 1 || by == 2) {
                PacketWrapper packetWrapper3 = PacketWrapper.create((PacketType)ClientboundPackets1_19_4.GAME_EVENT, (UserConnection)packetWrapper.user());
                packetWrapper3.write((Type)Types.UNSIGNED_BYTE, (Object)7);
                packetWrapper3.write((Type)Types.FLOAT, (Object)Float.valueOf(1.0f));
                packetWrapper3.send(Protocol1_19_3To1_19_4.class);
            }
            CPEAdditions.setSnowing((by == 2 ? 1 : 0) != 0);
        });
    }
}

