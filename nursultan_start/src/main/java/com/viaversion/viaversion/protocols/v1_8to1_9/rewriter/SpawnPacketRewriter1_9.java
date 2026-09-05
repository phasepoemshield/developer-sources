/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.data.entity.EntityTracker
 *  com.viaversion.viaversion.api.minecraft.entities.EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_8$ObjectType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_9$EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_9$ObjectType
 *  com.viaversion.viaversion.api.minecraft.entitydata.EntityData
 *  com.viaversion.viaversion.api.minecraft.entitydata.EntityDataType
 *  com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes1_9
 *  com.viaversion.viaversion.api.minecraft.item.DataItem
 *  com.viaversion.viaversion.api.minecraft.item.Item
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.protocol.remapper.ValueTransformer
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 */
package com.viaversion.viaversion.protocols.v1_8to1_9.rewriter;

import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.data.entity.EntityTracker;
import com.viaversion.viaversion.api.minecraft.entities.EntityType;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_8;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_9;
import com.viaversion.viaversion.api.minecraft.entitydata.EntityData;
import com.viaversion.viaversion.api.minecraft.entitydata.EntityDataType;
import com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes1_9;
import com.viaversion.viaversion.api.minecraft.item.DataItem;
import com.viaversion.viaversion.api.minecraft.item.Item;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.protocol.remapper.ValueTransformer;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.protocols.v1_8to1_9.Protocol1_8To1_9;
import com.viaversion.viaversion.protocols.v1_8to1_9.packet.ClientboundPackets1_8;
import com.viaversion.viaversion.protocols.v1_8to1_9.packet.ClientboundPackets1_9;
import com.viaversion.viaversion.protocols.v1_8to1_9.storage.EntityTracker1_9;
import java.util.ArrayList;
import java.util.List;

public class SpawnPacketRewriter1_9 {
    public static final ValueTransformer<Integer, Double> toNewDouble = new ValueTransformer<Integer, Double>((Type)Types.DOUBLE){

        public Double transform(PacketWrapper wrapper, Integer inputValue) {
            return (double)inputValue.intValue() / 32.0;
        }
    };

    public static void register(final Protocol1_8To1_9 protocol) {
        protocol.registerClientbound(ClientboundPackets1_8.ADD_ENTITY, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.handler(wrapper -> {
                    int entityID = (Integer)wrapper.get((Type)Types.VAR_INT, 0);
                    EntityTracker1_9 tracker = (EntityTracker1_9)wrapper.user().getEntityTracker(Protocol1_8To1_9.class);
                    wrapper.write(Types.UUID, (Object)tracker.getEntityUUID(entityID));
                });
                this.map((Type)Types.BYTE);
                this.map((Type)Types.INT, toNewDouble);
                this.map((Type)Types.INT, toNewDouble);
                this.map((Type)Types.INT, toNewDouble);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.INT);
                this.handler(wrapper -> {
                    int entityID = (Integer)wrapper.get((Type)Types.VAR_INT, 0);
                    byte typeID = (Byte)wrapper.get((Type)Types.BYTE, 0);
                    int data = (Integer)wrapper.get((Type)Types.INT, 0);
                    EntityTracker1_9 tracker = (EntityTracker1_9)wrapper.user().getEntityTracker(Protocol1_8To1_9.class);
                    EntityTypes1_9.EntityType entityType = EntityTypes1_9.ObjectType.getEntityType((int)typeID, (int)data);
                    if (entityType != null) {
                        tracker.addEntity(entityID, (EntityType)entityType);
                    }
                });
                this.handler(wrapper -> {
                    int data = (Integer)wrapper.get((Type)Types.INT, 0);
                    short vX = 0;
                    short vY = 0;
                    short vZ = 0;
                    if (data > 0) {
                        vX = (Short)wrapper.read((Type)Types.SHORT);
                        vY = (Short)wrapper.read((Type)Types.SHORT);
                        vZ = (Short)wrapper.read((Type)Types.SHORT);
                    }
                    wrapper.write((Type)Types.SHORT, (Object)vX);
                    wrapper.write((Type)Types.SHORT, (Object)vY);
                    wrapper.write((Type)Types.SHORT, (Object)vZ);
                });
                this.handler(wrapper -> {
                    int entityID = (Integer)wrapper.get((Type)Types.VAR_INT, 0);
                    int data = (Integer)wrapper.get((Type)Types.INT, 0);
                    byte typeID = (Byte)wrapper.get((Type)Types.BYTE, 0);
                    if (EntityTypes1_8.ObjectType.findById((int)typeID, (int)data) == EntityTypes1_8.ObjectType.POTION) {
                        PacketWrapper entityDataPacket = wrapper.create((PacketType)ClientboundPackets1_9.SET_ENTITY_DATA, wrapper1 -> {
                            wrapper1.write((Type)Types.VAR_INT, (Object)entityID);
                            ArrayList<EntityData> entityData = new ArrayList<EntityData>();
                            DataItem item = new DataItem(373, 1, (short)data, null);
                            protocol.getItemRewriter().handleItemToClient(wrapper.user(), (Item)item);
                            EntityData potion = new EntityData(6, (EntityDataType)EntityDataTypes1_9.ITEM, (Object)item);
                            entityData.add(potion);
                            wrapper1.write(Types.ENTITY_DATA_LIST1_9, entityData);
                        });
                        wrapper.send(Protocol1_8To1_9.class);
                        entityDataPacket.send(Protocol1_8To1_9.class);
                        wrapper.cancel();
                    }
                });
            }
        });
        protocol.registerClientbound(ClientboundPackets1_8.ADD_EXPERIENCE_ORB, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.handler(wrapper -> {
                    int entityID = (Integer)wrapper.get((Type)Types.VAR_INT, 0);
                    EntityTracker1_9 tracker = (EntityTracker1_9)wrapper.user().getEntityTracker(Protocol1_8To1_9.class);
                    tracker.addEntity(entityID, (EntityType)EntityTypes1_9.EntityType.EXPERIENCE_ORB);
                });
                this.map((Type)Types.INT, toNewDouble);
                this.map((Type)Types.INT, toNewDouble);
                this.map((Type)Types.INT, toNewDouble);
                this.map((Type)Types.SHORT);
            }
        });
        protocol.registerClientbound(ClientboundPackets1_8.ADD_GLOBAL_ENTITY, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.map((Type)Types.BYTE);
                this.handler(wrapper -> {
                    int entityID = (Integer)wrapper.get((Type)Types.VAR_INT, 0);
                    EntityTracker1_9 tracker = (EntityTracker1_9)wrapper.user().getEntityTracker(Protocol1_8To1_9.class);
                    tracker.addEntity(entityID, (EntityType)EntityTypes1_9.EntityType.LIGHTNING_BOLT);
                });
                this.map((Type)Types.INT, toNewDouble);
                this.map((Type)Types.INT, toNewDouble);
                this.map((Type)Types.INT, toNewDouble);
            }
        });
        protocol.registerClientbound(ClientboundPackets1_8.ADD_MOB, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.handler(wrapper -> {
                    int entityID = (Integer)wrapper.get((Type)Types.VAR_INT, 0);
                    EntityTracker1_9 tracker = (EntityTracker1_9)wrapper.user().getEntityTracker(Protocol1_8To1_9.class);
                    wrapper.write(Types.UUID, (Object)tracker.getEntityUUID(entityID));
                });
                this.map((Type)Types.UNSIGNED_BYTE);
                this.handler(wrapper -> {
                    int entityID = (Integer)wrapper.get((Type)Types.VAR_INT, 0);
                    short typeID = (Short)wrapper.get((Type)Types.UNSIGNED_BYTE, 0);
                    EntityTracker1_9 tracker = (EntityTracker1_9)wrapper.user().getEntityTracker(Protocol1_8To1_9.class);
                    EntityTypes1_9.EntityType entityType = EntityTypes1_9.EntityType.findById((int)typeID);
                    if (entityType != null) {
                        tracker.addEntity(entityID, (EntityType)entityType);
                    }
                });
                this.map((Type)Types.INT, toNewDouble);
                this.map((Type)Types.INT, toNewDouble);
                this.map((Type)Types.INT, toNewDouble);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.SHORT);
                this.map((Type)Types.SHORT);
                this.map((Type)Types.SHORT);
                this.map(Types.ENTITY_DATA_LIST1_8, Types.ENTITY_DATA_LIST1_9);
                this.handler(wrapper -> {
                    List entityDataList = (List)wrapper.get(Types.ENTITY_DATA_LIST1_9, 0);
                    int entityId = (Integer)wrapper.get((Type)Types.VAR_INT, 0);
                    EntityTracker1_9 tracker = (EntityTracker1_9)wrapper.user().getEntityTracker(Protocol1_8To1_9.class);
                    if (tracker.hasEntity(entityId)) {
                        protocol.getEntityRewriter().handleEntityData(entityId, entityDataList, wrapper.user());
                    } else {
                        protocol.getLogger().warning("Unable to find entity for entity data, entity ID: " + entityId);
                        entityDataList.clear();
                    }
                });
                this.handler(wrapper -> {
                    List entityDataList = (List)wrapper.get(Types.ENTITY_DATA_LIST1_9, 0);
                    int entityID = (Integer)wrapper.get((Type)Types.VAR_INT, 0);
                    EntityTracker1_9 tracker = (EntityTracker1_9)wrapper.user().getEntityTracker(Protocol1_8To1_9.class);
                    tracker.handleEntityData(entityID, entityDataList);
                });
            }
        });
        protocol.registerClientbound(ClientboundPackets1_8.ADD_PAINTING, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.handler(wrapper -> {
                    int entityID = (Integer)wrapper.get((Type)Types.VAR_INT, 0);
                    EntityTracker1_9 tracker = (EntityTracker1_9)wrapper.user().getEntityTracker(Protocol1_8To1_9.class);
                    tracker.addEntity(entityID, (EntityType)EntityTypes1_9.EntityType.PAINTING);
                });
                this.handler(wrapper -> {
                    int entityID = (Integer)wrapper.get((Type)Types.VAR_INT, 0);
                    EntityTracker1_9 tracker = (EntityTracker1_9)wrapper.user().getEntityTracker(Protocol1_8To1_9.class);
                    wrapper.write(Types.UUID, (Object)tracker.getEntityUUID(entityID));
                });
                this.map(Types.STRING);
                this.map(Types.BLOCK_POSITION1_8);
                this.map((Type)Types.BYTE);
            }
        });
        protocol.registerClientbound(ClientboundPackets1_8.ADD_PLAYER, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.map(Types.UUID);
                this.handler(wrapper -> {
                    int entityID = (Integer)wrapper.get((Type)Types.VAR_INT, 0);
                    EntityTracker1_9 tracker = (EntityTracker1_9)wrapper.user().getEntityTracker(Protocol1_8To1_9.class);
                    tracker.addEntity(entityID, (EntityType)EntityTypes1_9.EntityType.PLAYER);
                });
                this.map((Type)Types.INT, toNewDouble);
                this.map((Type)Types.INT, toNewDouble);
                this.map((Type)Types.INT, toNewDouble);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.BYTE);
                this.handler(wrapper -> {
                    short item = (Short)wrapper.read((Type)Types.SHORT);
                    if (item != 0) {
                        PacketWrapper packet = PacketWrapper.create((PacketType)ClientboundPackets1_9.SET_EQUIPPED_ITEM, null, (UserConnection)wrapper.user());
                        packet.write((Type)Types.VAR_INT, (Object)((Integer)wrapper.get((Type)Types.VAR_INT, 0)));
                        packet.write((Type)Types.VAR_INT, (Object)0);
                        packet.write(Types.ITEM1_8, (Object)new DataItem((int)item, 1, 0, null));
                        packet.send(Protocol1_8To1_9.class);
                    }
                });
                this.map(Types.ENTITY_DATA_LIST1_8, Types.ENTITY_DATA_LIST1_9);
                this.handler(wrapper -> {
                    List entityDataList = (List)wrapper.get(Types.ENTITY_DATA_LIST1_9, 0);
                    int entityId = (Integer)wrapper.get((Type)Types.VAR_INT, 0);
                    EntityTracker1_9 tracker = (EntityTracker1_9)wrapper.user().getEntityTracker(Protocol1_8To1_9.class);
                    if (tracker.hasEntity(entityId)) {
                        protocol.getEntityRewriter().handleEntityData(entityId, entityDataList, wrapper.user());
                    } else {
                        protocol.getLogger().warning("Unable to find entity for entity data, entity ID: " + entityId);
                        entityDataList.clear();
                    }
                });
                this.handler(wrapper -> {
                    List entityDataList = (List)wrapper.get(Types.ENTITY_DATA_LIST1_9, 0);
                    int entityID = (Integer)wrapper.get((Type)Types.VAR_INT, 0);
                    EntityTracker1_9 tracker = (EntityTracker1_9)wrapper.user().getEntityTracker(Protocol1_8To1_9.class);
                    tracker.handleEntityData(entityID, entityDataList);
                });
            }
        });
        protocol.registerClientbound(ClientboundPackets1_8.REMOVE_ENTITIES, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types.VAR_INT_ARRAY_PRIMITIVE);
                this.handler(wrapper -> {
                    int[] entities = (int[])wrapper.get(Types.VAR_INT_ARRAY_PRIMITIVE, 0);
                    EntityTracker tracker = wrapper.user().getEntityTracker(Protocol1_8To1_9.class);
                    for (int entity : entities) {
                        tracker.removeEntity(entity);
                    }
                });
            }
        });
    }
}

