/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.minecraft.ClientWorld
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.protocols.v1_11_1to1_12.rewriter.EntityPacketRewriter1_12
 *  com.viaversion.viaversion.protocols.v1_12_2to1_13.Protocol1_12_2To1_13
 *  com.viaversion.viaversion.protocols.v1_12_2to1_13.packet.ClientboundPackets1_13
 */
package com.viaversion.viaversion.protocols.v1_11_1to1_12.rewriter;

import com.viaversion.viaversion.api.minecraft.ClientWorld;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.protocols.v1_11_1to1_12.Protocol1_11_1To1_12;
import com.viaversion.viaversion.protocols.v1_11_1to1_12.rewriter.EntityPacketRewriter1_12;
import com.viaversion.viaversion.protocols.v1_12_2to1_13.Protocol1_12_2To1_13;
import com.viaversion.viaversion.protocols.v1_12_2to1_13.packet.ClientboundPackets1_13;

class EntityPacketRewriter1_12$1
extends PacketHandlers {
    final /* synthetic */ EntityPacketRewriter1_12 this$0;

    EntityPacketRewriter1_12$1(EntityPacketRewriter1_12 entityPacketRewriter1_12) {
        this.this$0 = entityPacketRewriter1_12;
    }

    public void register() {
        this.map((Type)Types.INT);
        this.map((Type)Types.UNSIGNED_BYTE);
        this.map((Type)Types.INT);
        this.handler(packetWrapper2 -> {
            ClientWorld clientWorld = packetWrapper2.user().getClientWorld(Protocol1_11_1To1_12.class);
            int n = (Integer)packetWrapper2.get((Type)Types.INT, 1);
            clientWorld.setEnvironment(n);
            ProtocolVersion protocolVersion = ProtocolVersion.v1_13;
            ProtocolVersion protocolVersion2 = packetWrapper2.user().getProtocolInfo().protocolVersion();
            if (EntityPacketRewriter1_12$1.redirect$eam000$viafabricplus$dontClearRecipes(protocolVersion2, protocolVersion)) {
                packetWrapper2.create((PacketType)ClientboundPackets1_13.UPDATE_RECIPES, packetWrapper -> packetWrapper.write((Type)Types.VAR_INT, (Object)0)).scheduleSend(Protocol1_12_2To1_13.class);
            }
        });
    }

    private static boolean redirect$eam000$viafabricplus$dontClearRecipes(ProtocolVersion protocolVersion, ProtocolVersion protocolVersion2) {
        return false;
    }
}

