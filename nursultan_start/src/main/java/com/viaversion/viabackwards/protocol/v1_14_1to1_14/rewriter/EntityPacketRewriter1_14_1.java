/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viabackwards.api.BackwardsProtocol
 *  com.viaversion.viabackwards.api.rewriters.LegacyEntityRewriter
 *  com.viaversion.viaversion.api.minecraft.entities.EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_14
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.version.Types1_14
 *  com.viaversion.viaversion.protocols.v1_13_2to1_14.packet.ClientboundPackets1_14
 */
package com.viaversion.viabackwards.protocol.v1_14_1to1_14.rewriter;

import com.viaversion.viabackwards.api.BackwardsProtocol;
import com.viaversion.viabackwards.api.rewriters.LegacyEntityRewriter;
import com.viaversion.viabackwards.protocol.v1_14_1to1_14.Protocol1_14_1To1_14;
import com.viaversion.viaversion.api.minecraft.entities.EntityType;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_14;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.version.Types1_14;
import com.viaversion.viaversion.protocols.v1_13_2to1_14.packet.ClientboundPackets1_14;
import java.util.List;

public class EntityPacketRewriter1_14_1
extends LegacyEntityRewriter<ClientboundPackets1_14, Protocol1_14_1To1_14> {
    public EntityPacketRewriter1_14_1(Protocol1_14_1To1_14 protocol) {
        super((BackwardsProtocol)protocol);
    }

    protected void registerRewrites() {
        this.filter().type((EntityType)EntityTypes1_14.VILLAGER).cancel(15);
        this.filter().type((EntityType)EntityTypes1_14.VILLAGER).index(16).toIndex(15);
        this.filter().type((EntityType)EntityTypes1_14.WANDERING_TRADER).cancel(15);
    }

    protected void registerPackets() {
        this.registerTracker((ClientboundPacketType)ClientboundPackets1_14.ADD_EXPERIENCE_ORB, (EntityType)EntityTypes1_14.EXPERIENCE_ORB);
        this.registerTracker((ClientboundPacketType)ClientboundPackets1_14.ADD_GLOBAL_ENTITY, (EntityType)EntityTypes1_14.LIGHTNING_BOLT);
        this.registerTracker((ClientboundPacketType)ClientboundPackets1_14.ADD_PAINTING, (EntityType)EntityTypes1_14.PAINTING);
        this.registerTracker((ClientboundPacketType)ClientboundPackets1_14.ADD_PLAYER, (EntityType)EntityTypes1_14.PLAYER);
        this.registerJoinGame((ClientboundPacketType)ClientboundPackets1_14.LOGIN, (EntityType)EntityTypes1_14.PLAYER);
        this.registerRespawn((ClientboundPacketType)ClientboundPackets1_14.RESPAWN);
        ((Protocol1_14_1To1_14)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_14.ADD_ENTITY, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.map(Types.UUID);
                this.map((Type)Types.VAR_INT);
                this.handler(EntityPacketRewriter1_14_1.this.getTrackerHandler());
            }
        });
        ((Protocol1_14_1To1_14)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_14.ADD_MOB, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.map(Types.UUID);
                this.map((Type)Types.VAR_INT);
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.SHORT);
                this.map((Type)Types.SHORT);
                this.map((Type)Types.SHORT);
                this.map(Types1_14.ENTITY_DATA_LIST);
                this.handler(wrapper -> {
                    int entityId = (Integer)wrapper.get((Type)Types.VAR_INT, 0);
                    int type = (Integer)wrapper.get((Type)Types.VAR_INT, 1);
                    EntityPacketRewriter1_14_1.this.tracker(wrapper.user()).addEntity(entityId, EntityTypes1_14.getTypeFromId((int)type));
                    List entityDataList = (List)wrapper.get(Types1_14.ENTITY_DATA_LIST, 0);
                    EntityPacketRewriter1_14_1.this.handleEntityData(entityId, entityDataList, wrapper.user());
                });
            }
        });
        this.registerSetEntityData((ClientboundPacketType)ClientboundPackets1_14.SET_ENTITY_DATA, Types1_14.ENTITY_DATA_LIST);
    }

    public EntityType typeFromId(int typeId) {
        return EntityTypes1_14.getTypeFromId((int)typeId);
    }
}

