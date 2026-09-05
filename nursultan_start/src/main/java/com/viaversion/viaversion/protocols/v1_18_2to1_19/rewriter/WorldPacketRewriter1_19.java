/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viafabricplus.base.sync_tasks.SyncTasks
 *  com.viaversion.viafabricplus.injection.access.interaction.r1_18_2_block_ack_emulation.IMultiPlayerGameMode
 *  com.viaversion.viafabricplus.protocoltranslator.translator.BlockStateTranslator
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  minecraft.class00500
 *  minecraft.class03443
 *  minecraft.class06202
 *  minecraft.class07209
 *  minecraft.class07356
 */
package com.viaversion.viaversion.protocols.v1_18_2to1_19.rewriter;

import com.viaversion.viafabricplus.base.sync_tasks.SyncTasks;
import com.viaversion.viafabricplus.injection.access.interaction.r1_18_2_block_ack_emulation.IMultiPlayerGameMode;
import com.viaversion.viafabricplus.protocoltranslator.translator.BlockStateTranslator;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.protocols.v1_17_1to1_18.packet.ClientboundPackets1_18;
import com.viaversion.viaversion.protocols.v1_18_2to1_19.Protocol1_18_2To1_19;
import com.viaversion.viaversion.protocols.v1_18_2to1_19.packet.ClientboundPackets1_19;
import com.viaversion.viaversion.protocols.v1_18_2to1_19.packet.ServerboundPackets1_19;
import minecraft.class00500;
import minecraft.class03443;
import minecraft.class06202;
import minecraft.class07209;
import minecraft.class07356;

public final class WorldPacketRewriter1_19 {
    public static void register(Protocol1_18_2To1_19 protocol1_18_2To1_19) {
        ClientboundPackets1_18 clientboundPackets1_18 = ClientboundPackets1_18.BLOCK_BREAK_ACK;
        Protocol1_18_2To1_19 protocol1_18_2To1_192 = protocol1_18_2To1_19;
        WorldPacketRewriter1_19.redirect$djh000$viafabricplus$handleLegacyAcknowledgePlayerDigging(protocol1_18_2To1_192, clientboundPackets1_18);
        protocol1_18_2To1_19.registerServerbound(ServerboundPackets1_19.SET_BEACON, packetWrapper -> {
            if (((Boolean)packetWrapper.read((Type)Types.BOOLEAN)).booleanValue()) {
                packetWrapper.passthrough((Type)Types.VAR_INT);
            } else {
                packetWrapper.write((Type)Types.VAR_INT, (Object)-1);
            }
            if (((Boolean)packetWrapper.read((Type)Types.BOOLEAN)).booleanValue()) {
                packetWrapper.passthrough((Type)Types.VAR_INT);
            } else {
                packetWrapper.write((Type)Types.VAR_INT, (Object)-1);
            }
        });
    }

    private static void redirect$djh000$viafabricplus$handleLegacyAcknowledgePlayerDigging(Protocol1_18_2To1_19 protocol1_18_2To1_19, ClientboundPacketType clientboundPacketType) {
        protocol1_18_2To1_19.registerClientbound(ClientboundPackets1_18.BLOCK_BREAK_ACK, ClientboundPackets1_19.CUSTOM_PAYLOAD, packetWrapper -> {
            packetWrapper.resetReader();
            String string = SyncTasks.executeSyncTask(class042472 -> {
                try {
                    class07209 class072092 = class042472.i();
                    class00500 class005002 = BlockStateTranslator.via1_18_2toMc((int)class042472.E());
                    class07356 class073562 = (class07356)class042472.y(class07356.class);
                    boolean bl = class042472.readBoolean();
                    IMultiPlayerGameMode iMultiPlayerGameMode = (IMultiPlayerGameMode)((class03443)class06202.Nq().T_2);
                    iMultiPlayerGameMode.viaFabricPlus$get1_18_2InteractionManager().handleBlockBreakAck(class072092, class005002, class073562, bl);
                }
                catch (Throwable throwable) {
                    throw new RuntimeException("Failed to handle BlockBreakAck packet data", throwable);
                }
            });
            packetWrapper.write(Types.STRING, (Object)SyncTasks.PACKET_SYNC_IDENTIFIER);
            packetWrapper.write(Types.STRING, (Object)string);
        });
    }
}

