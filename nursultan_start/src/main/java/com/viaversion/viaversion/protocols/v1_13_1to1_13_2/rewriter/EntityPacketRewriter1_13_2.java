/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.minecraft.Particle
 *  com.viaversion.viaversion.api.minecraft.entitydata.EntityData
 *  com.viaversion.viaversion.api.minecraft.entitydata.EntityDataType
 *  com.viaversion.viaversion.api.minecraft.item.Item
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.version.Types1_13_2
 *  com.viaversion.viaversion.protocols.v1_12_2to1_13.packet.ClientboundPackets1_13
 *  com.viaversion.viaversion.protocols.v1_13_1to1_13_2.Protocol1_13_1To1_13_2
 */
package com.viaversion.viaversion.protocols.v1_13_1to1_13_2.rewriter;

import com.viaversion.viaversion.api.minecraft.Particle;
import com.viaversion.viaversion.api.minecraft.entitydata.EntityData;
import com.viaversion.viaversion.api.minecraft.entitydata.EntityDataType;
import com.viaversion.viaversion.api.minecraft.item.Item;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.version.Types1_13_2;
import com.viaversion.viaversion.protocols.v1_12_2to1_13.packet.ClientboundPackets1_13;
import com.viaversion.viaversion.protocols.v1_13_1to1_13_2.Protocol1_13_1To1_13_2;
import java.util.List;

public class EntityPacketRewriter1_13_2 {
    public static void register(Protocol1_13_1To1_13_2 protocol) {
        PacketHandler dataTypeHandler = wrapper -> {
            for (EntityData data : (List)wrapper.get(Types1_13_2.ENTITY_DATA_LIST, 0)) {
                Particle particle;
                EntityDataType dataType = Types1_13_2.ENTITY_DATA_TYPES.byId(data.dataType().typeId());
                if (dataType == Types1_13_2.ENTITY_DATA_TYPES.particleType && (particle = (Particle)data.value()).id() == 27) {
                    Item item = (Item)particle.getArgument(0).getValue();
                    particle.set(0, Types.ITEM1_13_2, (Object)item);
                }
                data.setDataType(dataType);
            }
        };
        protocol.registerClientbound((ClientboundPacketType)ClientboundPackets1_13.ADD_MOB, (PacketHandler)new /* Unavailable Anonymous Inner Class!! */);
        protocol.registerClientbound((ClientboundPacketType)ClientboundPackets1_13.ADD_PLAYER, (PacketHandler)new /* Unavailable Anonymous Inner Class!! */);
        protocol.registerClientbound((ClientboundPacketType)ClientboundPackets1_13.SET_ENTITY_DATA, (PacketHandler)new /* Unavailable Anonymous Inner Class!! */);
    }
}

