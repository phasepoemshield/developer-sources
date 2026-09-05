/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viabackwards.api.BackwardsProtocol
 *  com.viaversion.viabackwards.api.rewriters.EntityRewriter
 *  com.viaversion.viabackwards.protocol.v1_15to1_14_4.storage.ImmediateRespawnStorage
 *  com.viaversion.viaversion.api.minecraft.entities.EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_15
 *  com.viaversion.viaversion.api.minecraft.entitydata.EntityData
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.version.Types1_14
 *  com.viaversion.viaversion.protocols.v1_13_2to1_14.packet.ServerboundPackets1_14
 *  com.viaversion.viaversion.protocols.v1_14_4to1_15.packet.ClientboundPackets1_15
 */
package com.viaversion.viabackwards.protocol.v1_15to1_14_4.rewriter;

import com.viaversion.viabackwards.api.BackwardsProtocol;
import com.viaversion.viabackwards.api.rewriters.EntityRewriter;
import com.viaversion.viabackwards.protocol.v1_15to1_14_4.Protocol1_15To1_14_4;
import com.viaversion.viabackwards.protocol.v1_15to1_14_4.storage.ImmediateRespawnStorage;
import com.viaversion.viaversion.api.minecraft.entities.EntityType;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_15;
import com.viaversion.viaversion.api.minecraft.entitydata.EntityData;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.version.Types1_14;
import com.viaversion.viaversion.protocols.v1_13_2to1_14.packet.ServerboundPackets1_14;
import com.viaversion.viaversion.protocols.v1_14_4to1_15.packet.ClientboundPackets1_15;
import java.util.ArrayList;

public class EntityPacketRewriter1_15
extends EntityRewriter<ClientboundPackets1_15, Protocol1_15To1_14_4> {
    public EntityPacketRewriter1_15(Protocol1_15To1_14_4 protocol) {
        super((BackwardsProtocol)protocol);
    }

    public void onMappingDataLoaded() {
        super.onMappingDataLoaded();
        this.mapEntityTypeWithData((EntityType)EntityTypes1_15.BEE, (EntityType)EntityTypes1_15.PUFFERFISH).jsonName().spawnEntityData(storage -> {
            storage.add(new EntityData(14, Types1_14.ENTITY_DATA_TYPES.booleanType, (Object)false));
            storage.add(new EntityData(15, Types1_14.ENTITY_DATA_TYPES.varIntType, (Object)2));
        });
    }

    protected void registerRewrites() {
        this.registerEntityDataTypeHandler(Types1_14.ENTITY_DATA_TYPES.itemType, null, Types1_14.ENTITY_DATA_TYPES.optionalBlockStateType, Types1_14.ENTITY_DATA_TYPES.particleType, Types1_14.ENTITY_DATA_TYPES.componentType, Types1_14.ENTITY_DATA_TYPES.optionalComponentType);
        this.filter().type((EntityType)EntityTypes1_15.LIVING_ENTITY).removeIndex(12);
        this.filter().type((EntityType)EntityTypes1_15.BEE).cancel(15);
        this.filter().type((EntityType)EntityTypes1_15.BEE).cancel(16);
        this.filter().type((EntityType)EntityTypes1_15.ENDERMAN).cancel(16);
        this.filter().type((EntityType)EntityTypes1_15.TRIDENT).cancel(10);
        this.filter().type((EntityType)EntityTypes1_15.WOLF).addIndex(17);
        this.filter().type((EntityType)EntityTypes1_15.WOLF).index(8).handler((event, data) -> event.createExtraData(new EntityData(17, Types1_14.ENTITY_DATA_TYPES.floatType, event.data().value())));
    }

    protected void registerPackets() {
        ((Protocol1_15To1_14_4)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_15.SET_HEALTH, wrapper -> {
            float health = ((Float)wrapper.passthrough((Type)Types.FLOAT)).floatValue();
            if (health > 0.0f) {
                return;
            }
            if (!((ImmediateRespawnStorage)wrapper.user().get(ImmediateRespawnStorage.class)).isImmediateRespawn()) {
                return;
            }
            PacketWrapper statusPacket = wrapper.create((PacketType)ServerboundPackets1_14.CLIENT_COMMAND);
            statusPacket.write((Type)Types.VAR_INT, (Object)0);
            statusPacket.sendToServer(Protocol1_15To1_14_4.class);
        });
        ((Protocol1_15To1_14_4)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_15.GAME_EVENT, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.UNSIGNED_BYTE);
                this.map((Type)Types.FLOAT);
                this.handler(wrapper -> {
                    if ((Short)wrapper.get((Type)Types.UNSIGNED_BYTE, 0) == 11) {
                        ((ImmediateRespawnStorage)wrapper.user().get(ImmediateRespawnStorage.class)).setImmediateRespawn(((Float)wrapper.get((Type)Types.FLOAT, 0)).floatValue() == 1.0f);
                    }
                });
            }
        });
        ((Protocol1_15To1_14_4)this.protocol).replaceClientbound((ClientboundPacketType)ClientboundPackets1_15.ADD_MOB, (PacketHandler)new PacketHandlers(){

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
                this.handler(wrapper -> wrapper.write(Types1_14.ENTITY_DATA_LIST, new ArrayList()));
                this.handler(wrapper -> {
                    int type = (Integer)wrapper.get((Type)Types.VAR_INT, 1);
                    EntityType entityType = EntityTypes1_15.getTypeFromId((int)type);
                    EntityPacketRewriter1_15.this.tracker(wrapper.user()).addEntity(((Integer)wrapper.get((Type)Types.VAR_INT, 0)).intValue(), entityType);
                    wrapper.set((Type)Types.VAR_INT, 1, (Object)EntityPacketRewriter1_15.this.newEntityId(type));
                });
            }
        });
        ((Protocol1_15To1_14_4)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_15.RESPAWN, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT);
                this.read((Type)Types.LONG);
                this.handler(EntityPacketRewriter1_15.this.getDimensionHandler(0));
            }
        });
        ((Protocol1_15To1_14_4)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_15.LOGIN, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT);
                this.map((Type)Types.UNSIGNED_BYTE);
                this.map((Type)Types.INT);
                this.handler(EntityPacketRewriter1_15.this.getDimensionHandler(1));
                this.read((Type)Types.LONG);
                this.map((Type)Types.UNSIGNED_BYTE);
                this.map(Types.STRING);
                this.map((Type)Types.VAR_INT);
                this.map((Type)Types.BOOLEAN);
                this.handler(EntityPacketRewriter1_15.this.getPlayerTrackerHandler());
                this.handler(wrapper -> {
                    boolean immediateRespawn = (Boolean)wrapper.read((Type)Types.BOOLEAN) == false;
                    ((ImmediateRespawnStorage)wrapper.user().get(ImmediateRespawnStorage.class)).setImmediateRespawn(immediateRespawn);
                });
            }
        });
        this.registerTracker((ClientboundPacketType)ClientboundPackets1_15.ADD_EXPERIENCE_ORB, (EntityType)EntityTypes1_15.EXPERIENCE_ORB);
        this.registerTracker((ClientboundPacketType)ClientboundPackets1_15.ADD_GLOBAL_ENTITY, (EntityType)EntityTypes1_15.LIGHTNING_BOLT);
        this.registerTracker((ClientboundPacketType)ClientboundPackets1_15.ADD_PAINTING, (EntityType)EntityTypes1_15.PAINTING);
        ((Protocol1_15To1_14_4)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_15.ADD_PLAYER, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.map(Types.UUID);
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.BYTE);
                this.handler(wrapper -> wrapper.write(Types1_14.ENTITY_DATA_LIST, new ArrayList()));
                this.handler(EntityPacketRewriter1_15.this.getTrackerHandler((EntityType)EntityTypes1_15.PLAYER));
            }
        });
        this.registerSetEntityData((ClientboundPacketType)ClientboundPackets1_15.SET_ENTITY_DATA, Types1_14.ENTITY_DATA_LIST);
        ((Protocol1_15To1_14_4)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_15.UPDATE_ATTRIBUTES, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.map((Type)Types.INT);
                this.handler(wrapper -> {
                    int size;
                    int entityId = (Integer)wrapper.get((Type)Types.VAR_INT, 0);
                    EntityType entityType = EntityPacketRewriter1_15.this.tracker(wrapper.user()).entityType(entityId);
                    if (entityType != EntityTypes1_15.BEE) {
                        return;
                    }
                    int newSize = size = ((Integer)wrapper.get((Type)Types.INT, 0)).intValue();
                    for (int i = 0; i < size; ++i) {
                        int j;
                        int modSize;
                        String key = (String)wrapper.read(Types.STRING);
                        if (key.equals("generic.flyingSpeed")) {
                            --newSize;
                            wrapper.read((Type)Types.DOUBLE);
                            modSize = (Integer)wrapper.read((Type)Types.VAR_INT);
                            for (j = 0; j < modSize; ++j) {
                                wrapper.read(Types.UUID);
                                wrapper.read((Type)Types.DOUBLE);
                                wrapper.read((Type)Types.BYTE);
                            }
                            continue;
                        }
                        wrapper.write(Types.STRING, (Object)key);
                        wrapper.passthrough((Type)Types.DOUBLE);
                        modSize = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
                        for (j = 0; j < modSize; ++j) {
                            wrapper.passthrough(Types.UUID);
                            wrapper.passthrough((Type)Types.DOUBLE);
                            wrapper.passthrough((Type)Types.BYTE);
                        }
                    }
                    if (newSize != size) {
                        wrapper.set((Type)Types.INT, 0, (Object)newSize);
                    }
                });
            }
        });
    }

    public EntityType typeFromId(int typeId) {
        return EntityTypes1_15.getTypeFromId((int)typeId);
    }
}

