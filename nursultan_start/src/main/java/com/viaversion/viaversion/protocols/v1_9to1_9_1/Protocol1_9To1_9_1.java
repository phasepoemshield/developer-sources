/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.protocol.AbstractProtocol
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 */
package com.viaversion.viaversion.protocols.v1_9to1_9_1;

import com.viaversion.viaversion.api.protocol.AbstractProtocol;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.protocols.v1_8to1_9.packet.ClientboundPackets1_9;
import com.viaversion.viaversion.protocols.v1_8to1_9.packet.ServerboundPackets1_9;

public class Protocol1_9To1_9_1
extends AbstractProtocol<ClientboundPackets1_9, ClientboundPackets1_9, ServerboundPackets1_9, ServerboundPackets1_9> {
    public Protocol1_9To1_9_1() {
        super(ClientboundPackets1_9.class, ClientboundPackets1_9.class, ServerboundPackets1_9.class, ServerboundPackets1_9.class);
    }

    protected void registerPackets() {
        this.registerClientbound(ClientboundPackets1_9.LOGIN, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT);
                this.map((Type)Types.UNSIGNED_BYTE);
                this.map((Type)Types.BYTE, (Type)Types.INT);
                this.map((Type)Types.UNSIGNED_BYTE);
                this.map((Type)Types.UNSIGNED_BYTE);
                this.map(Types.STRING);
                this.map((Type)Types.BOOLEAN);
            }
        });
        this.registerClientbound(ClientboundPackets1_9.SOUND, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.handler(wrapper -> {
                    int sound = (Integer)wrapper.get((Type)Types.VAR_INT, 0);
                    if (sound >= 415) {
                        wrapper.set((Type)Types.VAR_INT, 0, (Object)(sound + 1));
                    }
                });
            }
        });
    }
}

