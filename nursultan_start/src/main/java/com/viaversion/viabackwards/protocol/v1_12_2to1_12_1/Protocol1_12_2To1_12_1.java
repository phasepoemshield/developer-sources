/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viabackwards.api.BackwardsProtocol
 *  com.viaversion.viabackwards.protocol.v1_12_2to1_12_1.storage.KeepAliveTracker
 *  com.viaversion.viaversion.api.connection.StorableObject
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.protocols.v1_12to1_12_1.packet.ClientboundPackets1_12_1
 *  com.viaversion.viaversion.protocols.v1_12to1_12_1.packet.ServerboundPackets1_12_1
 */
package com.viaversion.viabackwards.protocol.v1_12_2to1_12_1;

import com.viaversion.viabackwards.api.BackwardsProtocol;
import com.viaversion.viabackwards.protocol.v1_12_2to1_12_1.storage.KeepAliveTracker;
import com.viaversion.viaversion.api.connection.StorableObject;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.protocols.v1_12to1_12_1.packet.ClientboundPackets1_12_1;
import com.viaversion.viaversion.protocols.v1_12to1_12_1.packet.ServerboundPackets1_12_1;

public class Protocol1_12_2To1_12_1
extends BackwardsProtocol<ClientboundPackets1_12_1, ClientboundPackets1_12_1, ServerboundPackets1_12_1, ServerboundPackets1_12_1> {
    public Protocol1_12_2To1_12_1() {
        super(ClientboundPackets1_12_1.class, ClientboundPackets1_12_1.class, ServerboundPackets1_12_1.class, ServerboundPackets1_12_1.class);
    }

    public void init(UserConnection userConnection) {
        userConnection.put((StorableObject)new KeepAliveTracker());
    }

    protected void registerPackets() {
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_12_1.KEEP_ALIVE, wrapper -> {
            long keepAlive = (Long)wrapper.read((Type)Types.LONG);
            int id = ((KeepAliveTracker)wrapper.user().get(KeepAliveTracker.class)).track(keepAlive);
            wrapper.write((Type)Types.VAR_INT, (Object)id);
        });
        this.registerServerbound((ServerboundPacketType)ServerboundPackets1_12_1.KEEP_ALIVE, wrapper -> {
            int keepAlive = (Integer)wrapper.read((Type)Types.VAR_INT);
            Long realKeepAlive = ((KeepAliveTracker)wrapper.user().get(KeepAliveTracker.class)).consume(keepAlive);
            if (realKeepAlive == null) {
                wrapper.cancel();
                return;
            }
            wrapper.write((Type)Types.LONG, (Object)realKeepAlive);
        });
    }
}

