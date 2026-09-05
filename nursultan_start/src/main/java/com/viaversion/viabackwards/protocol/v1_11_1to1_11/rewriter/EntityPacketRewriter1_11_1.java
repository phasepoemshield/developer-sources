/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viabackwards.api.BackwardsProtocol
 *  com.viaversion.viabackwards.api.rewriters.LegacyEntityRewriter
 *  com.viaversion.viaversion.api.minecraft.entities.EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_11$EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_11$ObjectType
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.protocols.v1_9_1to1_9_3.packet.ClientboundPackets1_9_3
 */
package com.viaversion.viabackwards.protocol.v1_11_1to1_11.rewriter;

import com.viaversion.viabackwards.api.BackwardsProtocol;
import com.viaversion.viabackwards.api.rewriters.LegacyEntityRewriter;
import com.viaversion.viabackwards.protocol.v1_11_1to1_11.Protocol1_11_1To1_11;
import com.viaversion.viaversion.api.minecraft.entities.EntityType;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_11;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.protocols.v1_9_1to1_9_3.packet.ClientboundPackets1_9_3;

public class EntityPacketRewriter1_11_1
extends LegacyEntityRewriter<ClientboundPackets1_9_3, Protocol1_11_1To1_11> {
    public EntityPacketRewriter1_11_1(Protocol1_11_1To1_11 protocol) {
        super((BackwardsProtocol)protocol);
    }

    public EntityType objectTypeFromId(int typeId, int data) {
        return EntityTypes1_11.ObjectType.getEntityType((int)typeId, (int)data);
    }

    protected void registerRewrites() {
        this.filter().type((EntityType)EntityTypes1_11.EntityType.FIREWORK_ROCKET).cancel(7);
        this.filter().type((EntityType)EntityTypes1_11.EntityType.PIG).cancel(14);
    }

    protected void registerPackets() {
        ((Protocol1_11_1To1_11)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_9_3.ADD_ENTITY, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.map(Types.UUID);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.INT);
                this.handler(EntityPacketRewriter1_11_1.this.getObjectTrackerHandler());
                this.handler(EntityPacketRewriter1_11_1.this.getObjectRewriter(EntityTypes1_11.ObjectType::findById));
            }
        });
        this.registerTracker((ClientboundPacketType)ClientboundPackets1_9_3.ADD_EXPERIENCE_ORB, (EntityType)EntityTypes1_11.EntityType.EXPERIENCE_ORB);
        this.registerTracker((ClientboundPacketType)ClientboundPackets1_9_3.ADD_GLOBAL_ENTITY, (EntityType)EntityTypes1_11.EntityType.LIGHTNING_BOLT);
        ((Protocol1_11_1To1_11)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_9_3.ADD_MOB, (PacketHandler)new PacketHandlers(){

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
                this.map(Types.ENTITY_DATA_LIST1_9);
                this.handler(EntityPacketRewriter1_11_1.this.getTrackerHandler());
                this.handler(EntityPacketRewriter1_11_1.this.getMobSpawnRewriter1_11(Types.ENTITY_DATA_LIST1_9));
            }
        });
        this.registerTracker((ClientboundPacketType)ClientboundPackets1_9_3.ADD_PAINTING, (EntityType)EntityTypes1_11.EntityType.PAINTING);
        this.registerJoinGame((ClientboundPacketType)ClientboundPackets1_9_3.LOGIN, (EntityType)EntityTypes1_11.EntityType.PLAYER);
        this.registerRespawn((ClientboundPacketType)ClientboundPackets1_9_3.RESPAWN);
        ((Protocol1_11_1To1_11)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_9_3.ADD_PLAYER, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.map(Types.UUID);
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.BYTE);
                this.map(Types.ENTITY_DATA_LIST1_9);
                this.handler(EntityPacketRewriter1_11_1.this.getTrackerAndDataHandler(Types.ENTITY_DATA_LIST1_9, (EntityType)EntityTypes1_11.EntityType.PLAYER));
            }
        });
        this.registerRemoveEntities((ClientboundPacketType)ClientboundPackets1_9_3.REMOVE_ENTITIES);
        this.registerSetEntityData((ClientboundPacketType)ClientboundPackets1_9_3.SET_ENTITY_DATA, Types.ENTITY_DATA_LIST1_9);
    }

    public EntityType typeFromId(int typeId) {
        return EntityTypes1_11.EntityType.findById((int)typeId);
    }
}

