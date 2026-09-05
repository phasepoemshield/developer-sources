/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.ListTag
 *  com.viaversion.nbt.tag.NumberTag
 *  com.viaversion.viabackwards.ViaBackwards
 *  com.viaversion.viabackwards.api.BackwardsProtocol
 *  com.viaversion.viabackwards.api.entities.storage.EntityReplacement$EntityDataCreator
 *  com.viaversion.viabackwards.api.rewriters.EntityRewriter
 *  com.viaversion.viabackwards.protocol.v1_19_4to1_19_3.storage.EntityTracker1_19_4
 *  com.viaversion.viabackwards.protocol.v1_19_4to1_19_3.storage.LinkedEntityStorage
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.data.entity.StoredEntityData
 *  com.viaversion.viaversion.api.minecraft.entities.EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_19_3
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_19_4
 *  com.viaversion.viaversion.api.minecraft.entitydata.EntityData
 *  com.viaversion.viaversion.api.minecraft.item.Item
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.version.Types1_19_3
 *  com.viaversion.viaversion.api.type.types.version.Types1_19_4
 *  com.viaversion.viaversion.protocols.v1_19_1to1_19_3.packet.ClientboundPackets1_19_3
 *  com.viaversion.viaversion.protocols.v1_19_3to1_19_4.packet.ClientboundPackets1_19_4
 *  com.viaversion.viaversion.util.TagUtil
 */
package com.viaversion.viabackwards.protocol.v1_19_4to1_19_3.rewriter;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.ListTag;
import com.viaversion.nbt.tag.NumberTag;
import com.viaversion.viabackwards.ViaBackwards;
import com.viaversion.viabackwards.api.BackwardsProtocol;
import com.viaversion.viabackwards.api.entities.storage.EntityReplacement;
import com.viaversion.viabackwards.api.rewriters.EntityRewriter;
import com.viaversion.viabackwards.protocol.v1_19_4to1_19_3.Protocol1_19_4To1_19_3;
import com.viaversion.viabackwards.protocol.v1_19_4to1_19_3.storage.EntityTracker1_19_4;
import com.viaversion.viabackwards.protocol.v1_19_4to1_19_3.storage.LinkedEntityStorage;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.data.entity.StoredEntityData;
import com.viaversion.viaversion.api.minecraft.entities.EntityType;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_19_3;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_19_4;
import com.viaversion.viaversion.api.minecraft.entitydata.EntityData;
import com.viaversion.viaversion.api.minecraft.item.Item;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.version.Types1_19_3;
import com.viaversion.viaversion.api.type.types.version.Types1_19_4;
import com.viaversion.viaversion.protocols.v1_19_1to1_19_3.packet.ClientboundPackets1_19_3;
import com.viaversion.viaversion.protocols.v1_19_3to1_19_4.packet.ClientboundPackets1_19_4;
import com.viaversion.viaversion.util.TagUtil;

public final class EntityPacketRewriter1_19_4
extends EntityRewriter<ClientboundPackets1_19_4, Protocol1_19_4To1_19_3> {
    private static final double TEXT_DISPLAY_Y_OFFSET = -0.25;

    public EntityPacketRewriter1_19_4(Protocol1_19_4To1_19_3 protocol) {
        super((BackwardsProtocol)protocol, Types1_19_3.ENTITY_DATA_TYPES.optionalComponentType, Types1_19_3.ENTITY_DATA_TYPES.booleanType);
    }

    public void onMappingDataLoaded() {
        super.onMappingDataLoaded();
        EntityReplacement.EntityDataCreator displayDataCreator = storage -> {
            storage.add(new EntityData(0, Types1_19_3.ENTITY_DATA_TYPES.byteType, (Object)32));
            storage.add(new EntityData(5, Types1_19_3.ENTITY_DATA_TYPES.booleanType, (Object)true));
            storage.add(new EntityData(15, Types1_19_3.ENTITY_DATA_TYPES.byteType, (Object)17));
        };
        this.mapEntityTypeWithData((EntityType)EntityTypes1_19_4.TEXT_DISPLAY, (EntityType)EntityTypes1_19_4.ARMOR_STAND).spawnEntityData(displayDataCreator);
        this.mapEntityTypeWithData((EntityType)EntityTypes1_19_4.ITEM_DISPLAY, (EntityType)EntityTypes1_19_4.ARMOR_STAND).spawnEntityData(displayDataCreator);
        this.mapEntityTypeWithData((EntityType)EntityTypes1_19_4.BLOCK_DISPLAY, (EntityType)EntityTypes1_19_4.ARMOR_STAND).spawnEntityData(displayDataCreator);
        this.mapEntityTypeWithData((EntityType)EntityTypes1_19_4.INTERACTION, (EntityType)EntityTypes1_19_4.ARMOR_STAND).spawnEntityData(displayDataCreator);
        this.mapEntityTypeWithData((EntityType)EntityTypes1_19_4.SNIFFER, (EntityType)EntityTypes1_19_4.RAVAGER).jsonName();
    }

    public void registerRewrites() {
        this.filter().handler((event, data) -> {
            int id = data.dataType().typeId();
            if (id >= 25) {
                event.cancel();
                return;
            }
            if (id >= 15) {
                --id;
            }
            data.setDataType(Types1_19_3.ENTITY_DATA_TYPES.byId(id));
        });
        this.registerEntityDataTypeHandler(Types1_19_3.ENTITY_DATA_TYPES.itemType, null, Types1_19_3.ENTITY_DATA_TYPES.optionalBlockStateType, Types1_19_3.ENTITY_DATA_TYPES.particleType, Types1_19_3.ENTITY_DATA_TYPES.componentType, Types1_19_3.ENTITY_DATA_TYPES.optionalComponentType);
        this.registerBlockStateHandler((EntityType)EntityTypes1_19_4.ABSTRACT_MINECART, 11);
        this.filter().type((EntityType)EntityTypes1_19_4.BOAT).index(11).handler((event, data) -> {
            int boatType = (Integer)data.value();
            if (boatType > 4) {
                data.setValue((Object)(boatType - 1));
            }
        });
        this.filter().type((EntityType)EntityTypes1_19_4.TEXT_DISPLAY).index(22).handler((event, data) -> {
            event.setIndex(2);
            data.setDataType(Types1_19_3.ENTITY_DATA_TYPES.optionalComponentType);
            event.createExtraData(new EntityData(3, Types1_19_3.ENTITY_DATA_TYPES.booleanType, (Object)true));
        });
        this.filter().type((EntityType)EntityTypes1_19_4.BLOCK_DISPLAY).index(22).handler((event, data) -> {
            int value = (Integer)data.value();
            EntityTracker1_19_4 tracker = (EntityTracker1_19_4)this.tracker(event.user());
            tracker.clearLinkedEntities(event.entityId());
            LinkedEntityStorage storage = tracker.linkedEntityStorage(event.entityId());
            if (storage == null) {
                return;
            }
            int linkedEntity = tracker.spawnEntity(EntityTypes1_19_3.FALLING_BLOCK, storage.x(), storage.y(), storage.z(), value);
            storage.setEntities(new int[]{linkedEntity});
            PacketWrapper wrapper = PacketWrapper.create((PacketType)ClientboundPackets1_19_3.SET_PASSENGERS, (UserConnection)event.user());
            wrapper.write((Type)Types.VAR_INT, (Object)event.entityId());
            wrapper.write(Types.VAR_INT_ARRAY_PRIMITIVE, (Object)new int[]{linkedEntity});
            wrapper.send(Protocol1_19_4To1_19_3.class);
        });
        this.filter().type((EntityType)EntityTypes1_19_4.ITEM_DISPLAY).index(22).handler((event, data) -> {
            Item value = (Item)data.value();
            PacketWrapper setEquipment = PacketWrapper.create((PacketType)ClientboundPackets1_19_3.SET_EQUIPMENT, (UserConnection)event.user());
            setEquipment.write((Type)Types.VAR_INT, (Object)event.entityId());
            setEquipment.write((Type)Types.BYTE, (Object)5);
            setEquipment.write(Types.ITEM1_13_2, (Object)value);
            setEquipment.send(Protocol1_19_4To1_19_3.class);
        });
        this.filter().type((EntityType)EntityTypes1_19_4.DISPLAY).handler((event, data) -> {
            if (event.index() > 7) {
                event.cancel();
            }
        });
        this.filter().type((EntityType)EntityTypes1_19_4.INTERACTION).cancel(8);
        this.filter().type((EntityType)EntityTypes1_19_4.INTERACTION).cancel(9);
        this.filter().type((EntityType)EntityTypes1_19_4.INTERACTION).cancel(10);
        this.filter().type((EntityType)EntityTypes1_19_4.SNIFFER).cancel(17);
        this.filter().type((EntityType)EntityTypes1_19_4.SNIFFER).cancel(18);
        this.filter().type((EntityType)EntityTypes1_19_4.ABSTRACT_HORSE).addIndex(18);
    }

    public void registerPackets() {
        this.registerSetEntityData((ClientboundPacketType)ClientboundPackets1_19_4.SET_ENTITY_DATA, Types1_19_4.ENTITY_DATA_LIST, Types1_19_3.ENTITY_DATA_LIST);
        ((Protocol1_19_4To1_19_3)this.protocol).replaceClientbound((ClientboundPacketType)ClientboundPackets1_19_4.ADD_ENTITY, (PacketHandler)new PacketHandlers(){

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
                this.map((Type)Types.VAR_INT);
                this.handler(wrapper -> {
                    int entityId = (Integer)wrapper.get((Type)Types.VAR_INT, 0);
                    int entityType = (Integer)wrapper.get((Type)Types.VAR_INT, 1);
                    if (!(ViaBackwards.getConfig().mapDisplayEntities() || entityType != EntityTypes1_19_4.BLOCK_DISPLAY.getId() && entityType != EntityTypes1_19_4.ITEM_DISPLAY.getId() && entityType != EntityTypes1_19_4.TEXT_DISPLAY.getId())) {
                        wrapper.cancel();
                        return;
                    }
                    double y = (Double)wrapper.get((Type)Types.DOUBLE, 1);
                    if (entityType == EntityTypes1_19_4.TEXT_DISPLAY.getId()) {
                        wrapper.set((Type)Types.DOUBLE, 1, (Object)(y + -0.25));
                    }
                    EntityPacketRewriter1_19_4.this.getSpawnTrackerWithDataHandler1_19().handle(wrapper);
                    if (entityType != EntityTypes1_19_4.BLOCK_DISPLAY.getId()) {
                        return;
                    }
                    StoredEntityData data = EntityPacketRewriter1_19_4.this.tracker(wrapper.user()).entityData(entityId);
                    if (data != null) {
                        LinkedEntityStorage storage = new LinkedEntityStorage();
                        double x = (Double)wrapper.get((Type)Types.DOUBLE, 0);
                        double z = (Double)wrapper.get((Type)Types.DOUBLE, 2);
                        storage.setPosition(x, y, z);
                        data.put((Object)storage);
                    }
                });
            }
        });
        ((Protocol1_19_4To1_19_3)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_19_4.LOGIN, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT);
                this.map((Type)Types.BOOLEAN);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.BYTE);
                this.map(Types.STRING_ARRAY);
                this.map(Types.NAMED_COMPOUND_TAG);
                this.map(Types.STRING);
                this.map(Types.STRING);
                this.handler(EntityPacketRewriter1_19_4.this.dimensionDataHandler());
                this.handler(EntityPacketRewriter1_19_4.this.biomeSizeTracker());
                this.handler(EntityPacketRewriter1_19_4.this.worldDataTrackerHandlerByKey());
                this.handler(wrapper -> {
                    CompoundTag registry = (CompoundTag)wrapper.get(Types.NAMED_COMPOUND_TAG, 0);
                    TagUtil.removeNamespaced((CompoundTag)registry, (String)"trim_pattern");
                    TagUtil.removeNamespaced((CompoundTag)registry, (String)"trim_material");
                    TagUtil.removeNamespaced((CompoundTag)registry, (String)"damage_type");
                    ListTag biomes = TagUtil.getRegistryEntries((CompoundTag)registry, (String)"worldgen/biome");
                    for (CompoundTag biomeTag : biomes) {
                        CompoundTag biomeData;
                        NumberTag hasPrecipitation = (biomeData = biomeTag.getCompoundTag("element")).getNumberTag("has_precipitation");
                        biomeData.putString("precipitation", hasPrecipitation.asByte() == 1 ? "rain" : "none");
                    }
                });
            }
        });
        ((Protocol1_19_4To1_19_3)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_19_4.PLAYER_POSITION, (PacketHandler)new PacketHandlers(){

            protected void register() {
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.FLOAT);
                this.map((Type)Types.FLOAT);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.VAR_INT);
                this.create((Type)Types.BOOLEAN, false);
            }
        });
        ((Protocol1_19_4To1_19_3)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_19_4.DAMAGE_EVENT, (ClientboundPacketType)ClientboundPackets1_19_3.ENTITY_EVENT, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.VAR_INT, (Type)Types.INT);
                this.read((Type)Types.VAR_INT);
                this.read((Type)Types.VAR_INT);
                this.read((Type)Types.VAR_INT);
                this.handler(wrapper -> {
                    if (((Boolean)wrapper.read((Type)Types.BOOLEAN)).booleanValue()) {
                        wrapper.read((Type)Types.DOUBLE);
                        wrapper.read((Type)Types.DOUBLE);
                        wrapper.read((Type)Types.DOUBLE);
                    }
                });
                this.create((Type)Types.BYTE, (byte)2);
            }
        });
        ((Protocol1_19_4To1_19_3)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_19_4.HURT_ANIMATION, (ClientboundPacketType)ClientboundPackets1_19_3.ANIMATE, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.read((Type)Types.FLOAT);
                this.create((Type)Types.UNSIGNED_BYTE, (short)1);
            }
        });
        ((Protocol1_19_4To1_19_3)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_19_4.RESPAWN, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types.STRING);
                this.map(Types.STRING);
                this.handler(EntityPacketRewriter1_19_4.this.worldDataTrackerHandlerByKey());
            }
        });
        ((Protocol1_19_4To1_19_3)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_19_4.UPDATE_MOB_EFFECT, wrapper -> {
            wrapper.passthrough((Type)Types.VAR_INT);
            wrapper.passthrough((Type)Types.VAR_INT);
            wrapper.passthrough((Type)Types.BYTE);
            int duration = (Integer)wrapper.read((Type)Types.VAR_INT);
            wrapper.write((Type)Types.VAR_INT, (Object)(duration == -1 ? 999999 : duration));
        });
        ((Protocol1_19_4To1_19_3)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_19_4.TELEPORT_ENTITY, wrapper -> {
            LinkedEntityStorage storage;
            int entityId = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            double x = (Double)wrapper.passthrough((Type)Types.DOUBLE);
            double y = (Double)wrapper.passthrough((Type)Types.DOUBLE);
            double z = (Double)wrapper.passthrough((Type)Types.DOUBLE);
            EntityTracker1_19_4 tracker = (EntityTracker1_19_4)this.tracker(wrapper.user());
            if (tracker.entityType(entityId) == EntityTypes1_19_4.TEXT_DISPLAY) {
                wrapper.set((Type)Types.DOUBLE, 1, (Object)(y + -0.25));
            }
            if ((storage = tracker.linkedEntityStorage(entityId)) != null) {
                storage.setPosition(x, y, z);
            }
        });
        PacketHandler entityPositionHandler = wrapper -> {
            int entityId = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            double x = (double)((Short)wrapper.passthrough((Type)Types.SHORT)).shortValue() / 4096.0;
            double y = (double)((Short)wrapper.passthrough((Type)Types.SHORT)).shortValue() / 4096.0;
            double z = (double)((Short)wrapper.passthrough((Type)Types.SHORT)).shortValue() / 4096.0;
            EntityTracker1_19_4 tracker = (EntityTracker1_19_4)this.tracker(wrapper.user());
            LinkedEntityStorage storage = tracker.linkedEntityStorage(entityId);
            if (storage != null) {
                storage.addRelativePosition(x, y, z);
            }
        };
        ((Protocol1_19_4To1_19_3)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_19_4.MOVE_ENTITY_POS, entityPositionHandler);
        ((Protocol1_19_4To1_19_3)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_19_4.MOVE_ENTITY_POS_ROT, entityPositionHandler);
    }

    public EntityType typeFromId(int type) {
        return EntityTypes1_19_4.getTypeFromId((int)type);
    }
}

