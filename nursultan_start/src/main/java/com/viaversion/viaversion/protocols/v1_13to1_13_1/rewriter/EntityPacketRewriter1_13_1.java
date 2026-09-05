/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.minecraft.ClientWorld
 *  com.viaversion.viaversion.api.minecraft.entities.EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_13$EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_13$ObjectType
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.version.Types1_13
 *  com.viaversion.viaversion.protocols.v1_12_2to1_13.packet.ClientboundPackets1_13
 *  com.viaversion.viaversion.rewriter.EntityRewriter
 */
package com.viaversion.viaversion.protocols.v1_13to1_13_1.rewriter;

import com.viaversion.viaversion.api.minecraft.ClientWorld;
import com.viaversion.viaversion.api.minecraft.entities.EntityType;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_13;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.version.Types1_13;
import com.viaversion.viaversion.protocols.v1_12_2to1_13.packet.ClientboundPackets1_13;
import com.viaversion.viaversion.protocols.v1_13to1_13_1.Protocol1_13To1_13_1;
import com.viaversion.viaversion.rewriter.EntityRewriter;

public class EntityPacketRewriter1_13_1
extends EntityRewriter<ClientboundPackets1_13, Protocol1_13To1_13_1> {
    public EntityPacketRewriter1_13_1(Protocol1_13To1_13_1 protocol) {
        super((Protocol)protocol);
    }

    public EntityType objectTypeFromId(int type, int data) {
        return EntityTypes1_13.ObjectType.getEntityType((int)type, (int)data);
    }

    protected void registerRewrites() {
        this.registerEntityDataTypeHandler(Types1_13.ENTITY_DATA_TYPES.itemType, Types1_13.ENTITY_DATA_TYPES.optionalBlockStateType, Types1_13.ENTITY_DATA_TYPES.particleType);
        this.registerBlockStateHandler((EntityType)EntityTypes1_13.EntityType.ABSTRACT_MINECART, 9);
        this.filter().type((EntityType)EntityTypes1_13.EntityType.ABSTRACT_ARROW).addIndex(7);
    }

    protected void registerPackets() {
        ((Protocol1_13To1_13_1)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_13.LOGIN, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT);
                this.map((Type)Types.UNSIGNED_BYTE);
                this.map((Type)Types.INT);
                this.handler(wrapper -> {
                    ClientWorld clientWorld = wrapper.user().getClientWorld(Protocol1_13To1_13_1.class);
                    int dimensionId = (Integer)wrapper.get((Type)Types.INT, 1);
                    clientWorld.setEnvironment(dimensionId);
                });
            }
        });
        ((Protocol1_13To1_13_1)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_13.RESPAWN, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT);
                this.handler(wrapper -> {
                    int dimensionId;
                    ClientWorld clientWorld = wrapper.user().getClientWorld(Protocol1_13To1_13_1.class);
                    if (clientWorld.setEnvironment(dimensionId = ((Integer)wrapper.get((Type)Types.INT, 0)).intValue())) {
                        EntityPacketRewriter1_13_1.this.tracker(wrapper.user()).clearEntities();
                    }
                });
            }
        });
        ((Protocol1_13To1_13_1)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_13.ADD_ENTITY, (PacketHandler)new PacketHandlers(){

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
                    if (entType != null) {
                        if (entType.is((EntityType)EntityTypes1_13.EntityType.FALLING_BLOCK)) {
                            wrapper.set((Type)Types.INT, 0, (Object)((Protocol1_13To1_13_1)EntityPacketRewriter1_13_1.this.protocol).getMappingData().getNewBlockStateId(data));
                        }
                        wrapper.user().getEntityTracker(Protocol1_13To1_13_1.class).addEntity(entityId, (EntityType)entType);
                    }
                });
            }
        });
        ((Protocol1_13To1_13_1)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_13.ADD_MOB, (PacketHandler)new PacketHandlers(){

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
                this.handler(EntityPacketRewriter1_13_1.this.trackerAndRewriterHandler(Types1_13.ENTITY_DATA_LIST));
            }
        });
        ((Protocol1_13To1_13_1)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_13.ADD_PLAYER, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.map(Types.UUID);
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.BYTE);
                this.map(Types1_13.ENTITY_DATA_LIST);
                this.handler(EntityPacketRewriter1_13_1.this.trackerAndRewriterHandler(Types1_13.ENTITY_DATA_LIST, (EntityType)EntityTypes1_13.EntityType.PLAYER));
            }
        });
        this.registerSetEntityData((ClientboundPacketType)ClientboundPackets1_13.SET_ENTITY_DATA, Types1_13.ENTITY_DATA_LIST);
    }

    public EntityType typeFromId(int type) {
        return EntityTypes1_13.EntityType.findById((int)type);
    }
}

