/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viabackwards.api.BackwardsProtocol
 *  com.viaversion.viabackwards.api.rewriters.LegacyEntityRewriter
 *  com.viaversion.viaversion.api.minecraft.Particle
 *  com.viaversion.viaversion.api.minecraft.entities.EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_13$EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_13$ObjectType
 *  com.viaversion.viaversion.api.minecraft.item.Item
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.version.Types1_13
 *  com.viaversion.viaversion.libs.gson.JsonElement
 *  com.viaversion.viaversion.protocols.v1_12_2to1_13.packet.ClientboundPackets1_13
 */
package com.viaversion.viabackwards.protocol.v1_13_1to1_13.rewriter;

import com.viaversion.viabackwards.api.BackwardsProtocol;
import com.viaversion.viabackwards.api.rewriters.LegacyEntityRewriter;
import com.viaversion.viabackwards.protocol.v1_13_1to1_13.Protocol1_13_1To1_13;
import com.viaversion.viaversion.api.minecraft.Particle;
import com.viaversion.viaversion.api.minecraft.entities.EntityType;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_13;
import com.viaversion.viaversion.api.minecraft.item.Item;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.version.Types1_13;
import com.viaversion.viaversion.libs.gson.JsonElement;
import com.viaversion.viaversion.protocols.v1_12_2to1_13.packet.ClientboundPackets1_13;
import java.util.List;

public class EntityPacketRewriter1_13_1
extends LegacyEntityRewriter<ClientboundPackets1_13, Protocol1_13_1To1_13> {
    public EntityPacketRewriter1_13_1(Protocol1_13_1To1_13 protocol) {
        super((BackwardsProtocol)protocol);
    }

    public EntityType objectTypeFromId(int typeId, int data) {
        return EntityTypes1_13.ObjectType.getEntityType((int)typeId, (int)data);
    }

    protected void registerRewrites() {
        this.filter().handler((event, data) -> {
            if (data.dataType() == Types1_13.ENTITY_DATA_TYPES.itemType) {
                data.setValue((Object)((Protocol1_13_1To1_13)this.protocol).getItemRewriter().handleItemToClient(event.user(), (Item)data.getValue()));
            } else if (data.dataType() == Types1_13.ENTITY_DATA_TYPES.optionalBlockStateType) {
                int value = (Integer)data.getValue();
                data.setValue((Object)((Protocol1_13_1To1_13)this.protocol).getMappingData().getNewBlockStateId(value));
            } else if (data.dataType() == Types1_13.ENTITY_DATA_TYPES.particleType) {
                ((Protocol1_13_1To1_13)this.protocol).getParticleRewriter().rewriteParticle(event.user(), (Particle)data.getValue());
            } else if (data.dataType() == Types1_13.ENTITY_DATA_TYPES.optionalComponentType || data.dataType() == Types1_13.ENTITY_DATA_TYPES.componentType) {
                JsonElement element = (JsonElement)data.value();
                ((Protocol1_13_1To1_13)this.protocol).translatableRewriter().processText(event.user(), element);
            }
        });
        this.filter().type((EntityType)EntityTypes1_13.EntityType.ABSTRACT_ARROW).cancel(7);
        this.filter().type((EntityType)EntityTypes1_13.EntityType.SPECTRAL_ARROW).index(8).toIndex(7);
        this.filter().type((EntityType)EntityTypes1_13.EntityType.TRIDENT).index(8).toIndex(7);
        this.registerBlockStateHandler((EntityType)EntityTypes1_13.EntityType.ABSTRACT_MINECART, 9);
    }

    protected void registerPackets() {
        ((Protocol1_13_1To1_13)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_13.ADD_ENTITY, (PacketHandler)new PacketHandlers(){

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
                this.handler(wrapper -> {
                    int data;
                    int entityId = (Integer)wrapper.get((Type)Types.VAR_INT, 0);
                    byte type = (Byte)wrapper.get((Type)Types.BYTE, 0);
                    EntityTypes1_13.EntityType entType = EntityTypes1_13.ObjectType.getEntityType((int)type, (int)(data = ((Integer)wrapper.get((Type)Types.INT, 0)).intValue()));
                    if (entType == null) {
                        return;
                    }
                    if (entType.is((EntityType)EntityTypes1_13.EntityType.FALLING_BLOCK)) {
                        wrapper.set((Type)Types.INT, 0, (Object)((Protocol1_13_1To1_13)EntityPacketRewriter1_13_1.this.protocol).getMappingData().getNewBlockStateId(data));
                    }
                    EntityPacketRewriter1_13_1.this.tracker(wrapper.user()).addEntity(entityId, (EntityType)entType);
                });
            }
        });
        this.registerTracker((ClientboundPacketType)ClientboundPackets1_13.ADD_EXPERIENCE_ORB, (EntityType)EntityTypes1_13.EntityType.EXPERIENCE_ORB);
        this.registerTracker((ClientboundPacketType)ClientboundPackets1_13.ADD_GLOBAL_ENTITY, (EntityType)EntityTypes1_13.EntityType.LIGHTNING_BOLT);
        ((Protocol1_13_1To1_13)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_13.ADD_MOB, (PacketHandler)new PacketHandlers(){

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
                this.map(Types1_13.ENTITY_DATA_LIST);
                this.handler(EntityPacketRewriter1_13_1.this.getTrackerHandler());
                this.handler(wrapper -> {
                    List entityDataList = (List)wrapper.get(Types1_13.ENTITY_DATA_LIST, 0);
                    EntityPacketRewriter1_13_1.this.handleEntityData((Integer)wrapper.get((Type)Types.VAR_INT, 0), entityDataList, wrapper.user());
                });
            }
        });
        ((Protocol1_13_1To1_13)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_13.ADD_PLAYER, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.map(Types.UUID);
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.BYTE);
                this.map(Types1_13.ENTITY_DATA_LIST);
                this.handler(EntityPacketRewriter1_13_1.this.getTrackerAndDataHandler(Types1_13.ENTITY_DATA_LIST, (EntityType)EntityTypes1_13.EntityType.PLAYER));
            }
        });
        this.registerTracker((ClientboundPacketType)ClientboundPackets1_13.ADD_PAINTING, (EntityType)EntityTypes1_13.EntityType.PAINTING);
        this.registerJoinGame((ClientboundPacketType)ClientboundPackets1_13.LOGIN, (EntityType)EntityTypes1_13.EntityType.PLAYER);
        this.registerRespawn((ClientboundPacketType)ClientboundPackets1_13.RESPAWN);
        this.registerSetEntityData((ClientboundPacketType)ClientboundPackets1_13.SET_ENTITY_DATA, Types1_13.ENTITY_DATA_LIST);
    }

    public EntityType typeFromId(int typeId) {
        return EntityTypes1_13.EntityType.findById((int)typeId);
    }
}

