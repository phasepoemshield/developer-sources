/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viabackwards.api.BackwardsProtocol
 *  com.viaversion.viabackwards.protocol.v1_16_4to1_16_3.storage.PlayerHandStorage
 *  com.viaversion.viaversion.api.connection.StorableObject
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.protocols.v1_16_1to1_16_2.packet.ClientboundPackets1_16_2
 *  com.viaversion.viaversion.protocols.v1_16_1to1_16_2.packet.ServerboundPackets1_16_2
 */
package com.viaversion.viabackwards.protocol.v1_16_4to1_16_3;

import com.viaversion.viabackwards.api.BackwardsProtocol;
import com.viaversion.viabackwards.protocol.v1_16_4to1_16_3.storage.PlayerHandStorage;
import com.viaversion.viaversion.api.connection.StorableObject;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.protocols.v1_16_1to1_16_2.packet.ClientboundPackets1_16_2;
import com.viaversion.viaversion.protocols.v1_16_1to1_16_2.packet.ServerboundPackets1_16_2;

public class Protocol1_16_4To1_16_3
extends BackwardsProtocol<ClientboundPackets1_16_2, ClientboundPackets1_16_2, ServerboundPackets1_16_2, ServerboundPackets1_16_2> {
    public Protocol1_16_4To1_16_3() {
        super(ClientboundPackets1_16_2.class, ClientboundPackets1_16_2.class, ServerboundPackets1_16_2.class, ServerboundPackets1_16_2.class);
    }

    public void init(UserConnection user) {
        user.put((StorableObject)new PlayerHandStorage());
    }

    protected void registerPackets() {
        this.registerServerbound((ServerboundPacketType)ServerboundPackets1_16_2.EDIT_BOOK, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types.ITEM1_13_2);
                this.map((Type)Types.BOOLEAN);
                this.handler(wrapper -> {
                    int slot = (Integer)wrapper.read((Type)Types.VAR_INT);
                    if (slot == 1) {
                        wrapper.write((Type)Types.VAR_INT, (Object)40);
                    } else {
                        wrapper.write((Type)Types.VAR_INT, (Object)((PlayerHandStorage)wrapper.user().get(PlayerHandStorage.class)).getCurrentHand());
                    }
                });
            }
        });
        this.registerServerbound((ServerboundPacketType)ServerboundPackets1_16_2.SET_CARRIED_ITEM, wrapper -> {
            short slot = (Short)wrapper.passthrough((Type)Types.SHORT);
            ((PlayerHandStorage)wrapper.user().get(PlayerHandStorage.class)).setCurrentHand((int)slot);
        });
    }
}

