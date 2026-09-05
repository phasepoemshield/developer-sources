/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.viabackwards.api.BackwardsProtocol
 *  com.viaversion.viabackwards.api.rewriters.LegacyEntityRewriter
 *  com.viaversion.viabackwards.protocol.v1_12to1_11_1.storage.ParrotStorage
 *  com.viaversion.viabackwards.protocol.v1_12to1_11_1.storage.ShoulderTracker
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.data.entity.StoredEntityData
 *  com.viaversion.viaversion.api.minecraft.entities.EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_12$EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_12$ObjectType
 *  com.viaversion.viaversion.api.minecraft.entitydata.EntityData
 *  com.viaversion.viaversion.api.minecraft.entitydata.EntityDataType
 *  com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes1_12
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.libs.gson.JsonElement
 *  com.viaversion.viaversion.protocols.v1_11_1to1_12.packet.ClientboundPackets1_12
 *  com.viaversion.viaversion.protocols.v1_9_1to1_9_3.packet.ClientboundPackets1_9_3
 */
package com.viaversion.viabackwards.protocol.v1_12to1_11_1.rewriter;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.viabackwards.api.BackwardsProtocol;
import com.viaversion.viabackwards.api.rewriters.LegacyEntityRewriter;
import com.viaversion.viabackwards.protocol.v1_12to1_11_1.Protocol1_12To1_11_1;
import com.viaversion.viabackwards.protocol.v1_12to1_11_1.storage.ParrotStorage;
import com.viaversion.viabackwards.protocol.v1_12to1_11_1.storage.ShoulderTracker;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.data.entity.StoredEntityData;
import com.viaversion.viaversion.api.minecraft.entities.EntityType;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_12;
import com.viaversion.viaversion.api.minecraft.entitydata.EntityData;
import com.viaversion.viaversion.api.minecraft.entitydata.EntityDataType;
import com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes1_12;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.libs.gson.JsonElement;
import com.viaversion.viaversion.protocols.v1_11_1to1_12.packet.ClientboundPackets1_12;
import com.viaversion.viaversion.protocols.v1_9_1to1_9_3.packet.ClientboundPackets1_9_3;

public class EntityPacketRewriter1_12
extends LegacyEntityRewriter<ClientboundPackets1_12, Protocol1_12To1_11_1> {
    public EntityPacketRewriter1_12(Protocol1_12To1_11_1 protocol) {
        super((BackwardsProtocol)protocol);
    }

    public EntityType objectTypeFromId(int typeId, int data) {
        return EntityTypes1_12.ObjectType.getEntityType((int)typeId, (int)data);
    }

    protected void registerRewrites() {
        this.mapEntityTypeWithData((EntityType)EntityTypes1_12.EntityType.PARROT, (EntityType)EntityTypes1_12.EntityType.BAT).plainName().spawnEntityData(storage -> storage.add(new EntityData(12, (EntityDataType)EntityDataTypes1_12.BYTE, (Object)0)));
        this.mapEntityTypeWithData((EntityType)EntityTypes1_12.EntityType.ILLUSIONER, (EntityType)EntityTypes1_12.EntityType.EVOKER).plainName();
        this.filter().handler((event, data) -> {
            if (data.dataType() == EntityDataTypes1_12.COMPONENT) {
                ((Protocol1_12To1_11_1)this.protocol).getComponentRewriter().processText(event.user(), (JsonElement)data.getValue());
            }
        });
        this.filter().type((EntityType)EntityTypes1_12.EntityType.EVOKER).removeIndex(12);
        this.filter().type((EntityType)EntityTypes1_12.EntityType.ILLUSIONER).index(0).handler((event, data) -> {
            byte mask = (Byte)data.getValue();
            if ((mask & 0x20) == 32) {
                mask = (byte)(mask & 0xFFFFFFDF);
            }
            data.setValue((Object)mask);
        });
        this.filter().type((EntityType)EntityTypes1_12.EntityType.PARROT).handler((event, data) -> {
            StoredEntityData entityData = this.storedEntityData(event);
            if (!entityData.has(ParrotStorage.class)) {
                entityData.put((Object)new ParrotStorage());
            }
        });
        this.filter().type((EntityType)EntityTypes1_12.EntityType.PARROT).cancel(12);
        this.filter().type((EntityType)EntityTypes1_12.EntityType.PARROT).index(13).handler((event, data) -> {
            boolean isTamed;
            StoredEntityData entityData = this.storedEntityData(event);
            ParrotStorage storage = (ParrotStorage)entityData.get(ParrotStorage.class);
            boolean isSitting = ((Byte)data.getValue() & 1) == 1;
            boolean bl = isTamed = ((Byte)data.getValue() & 4) == 4;
            if (storage.isTamed() || isTamed) {
                // empty if block
            }
            storage.setTamed(isTamed);
            if (isSitting) {
                event.setIndex(12);
                data.setValue((Object)1);
                storage.setSitting(true);
            } else if (storage.isSitting()) {
                event.setIndex(12);
                data.setValue((Object)0);
                storage.setSitting(false);
            } else {
                event.cancel();
            }
        });
        this.filter().type((EntityType)EntityTypes1_12.EntityType.PARROT).cancel(14);
        this.filter().type((EntityType)EntityTypes1_12.EntityType.PARROT).cancel(15);
        this.filter().type((EntityType)EntityTypes1_12.EntityType.PLAYER).index(15).handler((event, data) -> {
            CompoundTag tag = (CompoundTag)data.getValue();
            ShoulderTracker tracker = (ShoulderTracker)event.user().get(ShoulderTracker.class);
            if (tag.isEmpty() && tracker.getLeftShoulder() != null) {
                tracker.setLeftShoulder(null);
                tracker.update();
            } else if (tag.getStringTag("id") != null && event.entityId() == tracker.getEntityId()) {
                String id = tag.getStringTag("id").getValue();
                if (tracker.getLeftShoulder() == null || !tracker.getLeftShoulder().equals(id)) {
                    tracker.setLeftShoulder(id);
                    tracker.update();
                }
            }
            event.cancel();
        });
        this.filter().type((EntityType)EntityTypes1_12.EntityType.PLAYER).index(16).handler((event, data) -> {
            CompoundTag tag = (CompoundTag)event.data().getValue();
            ShoulderTracker tracker = (ShoulderTracker)event.user().get(ShoulderTracker.class);
            if (tag.isEmpty() && tracker.getRightShoulder() != null) {
                tracker.setRightShoulder(null);
                tracker.update();
            } else if (tag.getStringTag("id") != null && event.entityId() == tracker.getEntityId()) {
                String id = tag.getStringTag("id").getValue();
                if (tracker.getRightShoulder() == null || !tracker.getRightShoulder().equals(id)) {
                    tracker.setRightShoulder(id);
                    tracker.update();
                }
            }
            event.cancel();
        });
    }

    protected void registerPackets() {
        ((Protocol1_12To1_11_1)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_12.ADD_ENTITY, (PacketHandler)new PacketHandlers(){

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
                this.handler(EntityPacketRewriter1_12.this.getObjectTrackerHandler());
                this.handler(EntityPacketRewriter1_12.this.getObjectRewriter(EntityTypes1_12.ObjectType::findById));
                this.handler(((Protocol1_12To1_11_1)EntityPacketRewriter1_12.this.protocol).getItemRewriter().getFallingBlockHandler());
            }
        });
        this.registerTracker((ClientboundPacketType)ClientboundPackets1_12.ADD_EXPERIENCE_ORB, (EntityType)EntityTypes1_12.EntityType.EXPERIENCE_ORB);
        this.registerTracker((ClientboundPacketType)ClientboundPackets1_12.ADD_GLOBAL_ENTITY, (EntityType)EntityTypes1_12.EntityType.LIGHTNING_BOLT);
        ((Protocol1_12To1_11_1)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_12.ADD_MOB, (PacketHandler)new PacketHandlers(){

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
                this.map(Types.ENTITY_DATA_LIST1_12, Types.ENTITY_DATA_LIST1_9);
                this.handler(EntityPacketRewriter1_12.this.getTrackerHandler());
                this.handler(EntityPacketRewriter1_12.this.getMobSpawnRewriter1_11(Types.ENTITY_DATA_LIST1_9));
            }
        });
        this.registerTracker((ClientboundPacketType)ClientboundPackets1_12.ADD_PAINTING, (EntityType)EntityTypes1_12.EntityType.PAINTING);
        ((Protocol1_12To1_11_1)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_12.ADD_PLAYER, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.map(Types.UUID);
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.BYTE);
                this.map(Types.ENTITY_DATA_LIST1_12, Types.ENTITY_DATA_LIST1_9);
                this.handler(EntityPacketRewriter1_12.this.getTrackerAndDataHandler(Types.ENTITY_DATA_LIST1_9, (EntityType)EntityTypes1_12.EntityType.PLAYER));
            }
        });
        ((Protocol1_12To1_11_1)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_12.LOGIN, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT);
                this.map((Type)Types.UNSIGNED_BYTE);
                this.map((Type)Types.INT);
                this.handler(EntityPacketRewriter1_12.this.getDimensionHandler(1));
                this.handler(EntityPacketRewriter1_12.this.getPlayerTrackerHandler());
                this.handler(wrapper -> {
                    ShoulderTracker tracker = (ShoulderTracker)wrapper.user().get(ShoulderTracker.class);
                    tracker.setEntityId(((Integer)wrapper.get((Type)Types.INT, 0)).intValue());
                });
                this.handler(packetWrapper -> {
                    PacketWrapper wrapper = PacketWrapper.create((PacketType)ClientboundPackets1_9_3.AWARD_STATS, (UserConnection)packetWrapper.user());
                    wrapper.write((Type)Types.VAR_INT, (Object)1);
                    wrapper.write(Types.STRING, (Object)"achievement.openInventory");
                    wrapper.write((Type)Types.VAR_INT, (Object)1);
                    wrapper.scheduleSend(Protocol1_12To1_11_1.class);
                });
            }
        });
        this.registerRespawn((ClientboundPacketType)ClientboundPackets1_12.RESPAWN);
        this.registerRemoveEntities((ClientboundPacketType)ClientboundPackets1_12.REMOVE_ENTITIES);
        this.registerSetEntityData((ClientboundPacketType)ClientboundPackets1_12.SET_ENTITY_DATA, Types.ENTITY_DATA_LIST1_12, Types.ENTITY_DATA_LIST1_9);
        ((Protocol1_12To1_11_1)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_12.UPDATE_ATTRIBUTES, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.map((Type)Types.INT);
                this.handler(wrapper -> {
                    int size;
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
        return EntityTypes1_12.EntityType.findById((int)typeId);
    }
}

