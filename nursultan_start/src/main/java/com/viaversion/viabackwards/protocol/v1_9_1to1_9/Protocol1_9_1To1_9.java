/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viabackwards.api.BackwardsProtocol
 *  com.viaversion.viabackwards.api.rewriters.text.JsonNBTComponentRewriter
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.protocols.v1_8to1_9.packet.ClientboundPackets1_9
 *  com.viaversion.viaversion.protocols.v1_8to1_9.packet.ServerboundPackets1_9
 *  com.viaversion.viaversion.rewriter.text.ComponentRewriterBase$ReadType
 */
package com.viaversion.viabackwards.protocol.v1_9_1to1_9;

import com.viaversion.viabackwards.api.BackwardsProtocol;
import com.viaversion.viabackwards.api.rewriters.text.JsonNBTComponentRewriter;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.protocols.v1_8to1_9.packet.ClientboundPackets1_9;
import com.viaversion.viaversion.protocols.v1_8to1_9.packet.ServerboundPackets1_9;
import com.viaversion.viaversion.rewriter.text.ComponentRewriterBase;

public class Protocol1_9_1To1_9
extends BackwardsProtocol<ClientboundPackets1_9, ClientboundPackets1_9, ServerboundPackets1_9, ServerboundPackets1_9> {
    public Protocol1_9_1To1_9() {
        super(ClientboundPackets1_9.class, ClientboundPackets1_9.class, ServerboundPackets1_9.class, ServerboundPackets1_9.class);
    }

    protected void registerPackets() {
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_9.LOGIN, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT);
                this.map((Type)Types.UNSIGNED_BYTE);
                this.map((Type)Types.INT, (Type)Types.BYTE);
                this.map((Type)Types.UNSIGNED_BYTE);
                this.map((Type)Types.UNSIGNED_BYTE);
                this.map(Types.STRING);
                this.map((Type)Types.BOOLEAN);
            }
        });
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_9.SOUND, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.handler(wrapper -> {
                    int sound = (Integer)wrapper.get((Type)Types.VAR_INT, 0);
                    if (sound == 415) {
                        wrapper.cancel();
                    } else if (sound >= 416) {
                        wrapper.set((Type)Types.VAR_INT, 0, (Object)(sound - 1));
                    }
                });
            }
        });
        JsonNBTComponentRewriter componentRewriter = new JsonNBTComponentRewriter((BackwardsProtocol)this, ComponentRewriterBase.ReadType.JSON);
        componentRewriter.registerComponentPacket((ClientboundPacketType)ClientboundPackets1_9.CHAT);
    }
}

