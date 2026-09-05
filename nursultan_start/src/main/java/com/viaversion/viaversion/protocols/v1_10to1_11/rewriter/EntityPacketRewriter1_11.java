/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.StringTag
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.ClientWorld
 *  com.viaversion.viaversion.api.minecraft.entities.EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_10$EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_10$ObjectType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_11$EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_11$ObjectType
 *  com.viaversion.viaversion.api.minecraft.entitydata.EntityData
 *  com.viaversion.viaversion.api.minecraft.entitydata.EntityDataType
 *  com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes1_9
 *  com.viaversion.viaversion.api.minecraft.item.DataItem
 *  com.viaversion.viaversion.api.minecraft.item.Item
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.protocols.v1_10to1_11.data.BlockEntityMappings1_11
 *  com.viaversion.viaversion.protocols.v1_10to1_11.data.EntityMappings1_11
 *  com.viaversion.viaversion.protocols.v1_10to1_11.storage.EntityTracker1_11
 *  com.viaversion.viaversion.protocols.v1_9_1to1_9_3.packet.ClientboundPackets1_9_3
 *  com.viaversion.viaversion.rewriter.EntityRewriter
 */
package com.viaversion.viaversion.protocols.v1_10to1_11.rewriter;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.StringTag;
import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.ClientWorld;
import com.viaversion.viaversion.api.minecraft.entities.EntityType;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_10;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_11;
import com.viaversion.viaversion.api.minecraft.entitydata.EntityData;
import com.viaversion.viaversion.api.minecraft.entitydata.EntityDataType;
import com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes1_9;
import com.viaversion.viaversion.api.minecraft.item.DataItem;
import com.viaversion.viaversion.api.minecraft.item.Item;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.protocols.v1_10to1_11.Protocol1_10To1_11;
import com.viaversion.viaversion.protocols.v1_10to1_11.data.BlockEntityMappings1_11;
import com.viaversion.viaversion.protocols.v1_10to1_11.data.EntityMappings1_11;
import com.viaversion.viaversion.protocols.v1_10to1_11.storage.EntityTracker1_11;
import com.viaversion.viaversion.protocols.v1_9_1to1_9_3.packet.ClientboundPackets1_9_3;
import com.viaversion.viaversion.rewriter.EntityRewriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.logging.Level;

public class EntityPacketRewriter1_11
extends EntityRewriter<ClientboundPackets1_9_3, Protocol1_10To1_11> {
    public Optional<EntityData> getById(List<EntityData> entityData, int id) {
        for (EntityData data : entityData) {
            if (data.id() != id) continue;
            return Optional.of(data);
        }
        return Optional.empty();
    }

    public EntityPacketRewriter1_11(Protocol1_10To1_11 protocol) {
        super((Protocol)protocol);
    }

    private void tryFixFishingHookVelocity(PacketWrapper wrapper) {
        short x = (Short)wrapper.read((Type)Types.SHORT);
        short y = (Short)wrapper.read((Type)Types.SHORT);
        short z = (Short)wrapper.read((Type)Types.SHORT);
        wrapper.write((Type)Types.SHORT, (Object)((short)((double)x * 1.33)));
        wrapper.write((Type)Types.SHORT, (Object)((short)((double)y * 1.2)));
        wrapper.write((Type)Types.SHORT, (Object)((short)((double)z * 1.33)));
    }

    public EntityType objectTypeFromId(int type, int data) {
        return EntityTypes1_11.ObjectType.getEntityType((int)type, (int)data);
    }

    protected void registerRewrites() {
        this.filter().handler((event, data) -> {
            if (data.getValue() instanceof DataItem) {
                EntityMappings1_11.toClientItem((Item)((Item)data.value()));
            }
        });
        this.filter().type((EntityType)EntityTypes1_11.EntityType.GUARDIAN).index(12).handler((event, data) -> {
            boolean value = ((Byte)data.getValue() & 2) == 2;
            data.setTypeAndValue((EntityDataType)EntityDataTypes1_9.BOOLEAN, (Object)value);
        });
        this.filter().type((EntityType)EntityTypes1_11.EntityType.ABSTRACT_SKELETON).removeIndex(12);
        this.filter().type((EntityType)EntityTypes1_11.EntityType.ZOMBIE).handler((event, data) -> {
            if ((event.entityType() == EntityTypes1_11.EntityType.ZOMBIE || event.entityType() == EntityTypes1_11.EntityType.HUSK) && data.id() == 14) {
                event.cancel();
            } else if (data.id() == 15) {
                data.setId(14);
            }
        });
        this.filter().type((EntityType)EntityTypes1_11.EntityType.ABSTRACT_HORSE).handler((event, data) -> {
            EntityType type = event.entityType();
            int id = data.id();
            if (id == 14) {
                event.cancel();
                return;
            }
            if (id == 16) {
                data.setId(14);
            } else if (id == 17) {
                data.setId(16);
            }
            if (!type.is((EntityType)EntityTypes1_11.EntityType.HORSE) && data.id() == 15 || data.id() == 16) {
                event.cancel();
                return;
            }
            if ((type == EntityTypes1_11.EntityType.DONKEY || type == EntityTypes1_11.EntityType.MULE) && data.id() == 13) {
                if (((Byte)data.getValue() & 8) == 8) {
                    event.createExtraData(new EntityData(15, (EntityDataType)EntityDataTypes1_9.BOOLEAN, (Object)true));
                } else {
                    event.createExtraData(new EntityData(15, (EntityDataType)EntityDataTypes1_9.BOOLEAN, (Object)false));
                }
            }
        });
        this.filter().type((EntityType)EntityTypes1_11.EntityType.ARMOR_STAND).index(0).handler((event, data) -> {
            int entityId;
            EntityTracker1_11 tracker;
            if (!Via.getConfig().isHologramPatch()) {
                return;
            }
            EntityData flags = event.dataAtIndex(11);
            EntityData customName = event.dataAtIndex(2);
            EntityData customNameVisible = event.dataAtIndex(3);
            if (flags == null || customName == null || customNameVisible == null) {
                return;
            }
            byte value = (Byte)data.value();
            if ((value & 0x20) == 32 && ((Byte)flags.getValue() & 1) == 1 && !((String)customName.getValue()).isEmpty() && ((Boolean)customNameVisible.getValue()).booleanValue() && (tracker = (EntityTracker1_11)this.tracker(event.user())).addHologram(entityId = event.entityId())) {
                PacketWrapper wrapper = PacketWrapper.create((PacketType)ClientboundPackets1_9_3.MOVE_ENTITY_POS, null, (UserConnection)event.user());
                wrapper.write((Type)Types.VAR_INT, (Object)entityId);
                wrapper.write((Type)Types.SHORT, (Object)0);
                wrapper.write((Type)Types.SHORT, (Object)((short)(128.0 * (-Via.getConfig().getHologramYOffset() * 32.0))));
                wrapper.write((Type)Types.SHORT, (Object)0);
                wrapper.write((Type)Types.BOOLEAN, (Object)true);
                wrapper.send(Protocol1_10To1_11.class);
            }
        });
    }

    protected void registerPackets() {
        ((Protocol1_10To1_11)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_9_3.LOGIN, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT);
                this.map((Type)Types.UNSIGNED_BYTE);
                this.map((Type)Types.INT);
                this.handler(wrapper -> {
                    ClientWorld clientWorld = wrapper.user().getClientWorld(Protocol1_10To1_11.class);
                    int dimensionId = (Integer)wrapper.get((Type)Types.INT, 1);
                    clientWorld.setEnvironment(dimensionId);
                });
            }
        });
        ((Protocol1_10To1_11)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_9_3.RESPAWN, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT);
                this.handler(wrapper -> {
                    int dimensionId;
                    ClientWorld clientWorld = wrapper.user().getClientWorld(Protocol1_10To1_11.class);
                    if (clientWorld.setEnvironment(dimensionId = ((Integer)wrapper.get((Type)Types.INT, 0)).intValue())) {
                        EntityPacketRewriter1_11.this.tracker(wrapper.user()).clearEntities();
                    }
                });
            }
        });
        ((Protocol1_10To1_11)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_9_3.ADD_ENTITY, (PacketHandler)new PacketHandlers(){

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
                this.handler(EntityPacketRewriter1_11.this.objectTrackerHandler());
                this.handler(wrapper -> {
                    byte type = (Byte)wrapper.get((Type)Types.BYTE, 0);
                    if (type == EntityTypes1_10.ObjectType.FISHIHNG_HOOK.getId()) {
                        EntityPacketRewriter1_11.this.tryFixFishingHookVelocity(wrapper);
                    } else if (type == EntityTypes1_10.ObjectType.ITEM.getId()) {
                        wrapper.send(Protocol1_10To1_11.class);
                        wrapper.cancel();
                        int entityId = (Integer)wrapper.get((Type)Types.VAR_INT, 0);
                        ArrayList<EntityData> entityDataList = new ArrayList<EntityData>();
                        entityDataList.add(new EntityData(6, (EntityDataType)EntityDataTypes1_9.ITEM, (Object)new DataItem(1, 1, null)));
                        PacketWrapper setItem = PacketWrapper.create((PacketType)ClientboundPackets1_9_3.SET_ENTITY_DATA, (UserConnection)wrapper.user());
                        setItem.write((Type)Types.VAR_INT, (Object)entityId);
                        setItem.write(Types.ENTITY_DATA_LIST1_9, entityDataList);
                        setItem.send(Protocol1_10To1_11.class);
                    }
                });
            }
        });
        ((Protocol1_10To1_11)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_9_3.ADD_MOB, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.map(Types.UUID);
                this.map((Type)Types.UNSIGNED_BYTE, (Type)Types.VAR_INT);
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
                this.handler(wrapper -> {
                    int entityId = (Integer)wrapper.get((Type)Types.VAR_INT, 0);
                    int type = (Integer)wrapper.get((Type)Types.VAR_INT, 1);
                    EntityTypes1_11.EntityType entType = EntityPacketRewriter1_11.this.rewriteEntityType(type, (List)wrapper.get(Types.ENTITY_DATA_LIST1_9, 0));
                    if (entType != null) {
                        wrapper.set((Type)Types.VAR_INT, 1, (Object)entType.getId());
                        wrapper.user().getEntityTracker(Protocol1_10To1_11.class).addEntity(entityId, (EntityType)entType);
                        EntityPacketRewriter1_11.this.handleEntityData(entityId, (List)wrapper.get(Types.ENTITY_DATA_LIST1_9, 0), wrapper.user());
                    }
                });
            }
        });
        ((Protocol1_10To1_11)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_9_3.TAKE_ITEM_ENTITY, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.map((Type)Types.VAR_INT);
                this.handler(wrapper -> wrapper.write((Type)Types.VAR_INT, (Object)1));
            }
        });
        this.registerSetEntityData((ClientboundPacketType)ClientboundPackets1_9_3.SET_ENTITY_DATA, Types.ENTITY_DATA_LIST1_9);
        ((Protocol1_10To1_11)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_9_3.TELEPORT_ENTITY, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.BOOLEAN);
                this.handler(wrapper -> {
                    EntityTracker1_11 tracker;
                    int entityID = (Integer)wrapper.get((Type)Types.VAR_INT, 0);
                    if (Via.getConfig().isHologramPatch() && (tracker = (EntityTracker1_11)wrapper.user().getEntityTracker(Protocol1_10To1_11.class)).isHologram(entityID)) {
                        Double newValue = (Double)wrapper.get((Type)Types.DOUBLE, 1);
                        newValue = newValue - Via.getConfig().getHologramYOffset();
                        wrapper.set((Type)Types.DOUBLE, 1, (Object)newValue);
                    }
                });
            }
        });
        ((Protocol1_10To1_11)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_9_3.SET_ENTITY_MOTION, wrapper -> {
            int entityId = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            if (this.tracker(wrapper.user()).entityType(entityId) == EntityTypes1_10.EntityType.FISHING_HOOK) {
                this.tryFixFishingHookVelocity(wrapper);
            }
        });
        this.registerRemoveEntities((ClientboundPacketType)ClientboundPackets1_9_3.REMOVE_ENTITIES);
        ((Protocol1_10To1_11)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_9_3.BLOCK_ENTITY_DATA, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types.BLOCK_POSITION1_8);
                this.map((Type)Types.UNSIGNED_BYTE);
                this.map(Types.NAMED_COMPOUND_TAG);
                this.handler(wrapper -> {
                    StringTag idTag;
                    CompoundTag tag = (CompoundTag)wrapper.get(Types.NAMED_COMPOUND_TAG, 0);
                    if ((Short)wrapper.get((Type)Types.UNSIGNED_BYTE, 0) == 1) {
                        EntityMappings1_11.toClientSpawner((CompoundTag)tag);
                    }
                    if ((idTag = tag.getStringTag("id")) != null) {
                        idTag.setValue(BlockEntityMappings1_11.toNewIdentifier((String)idTag.getValue()));
                    }
                });
            }
        });
    }

    public EntityType typeFromId(int type) {
        return EntityTypes1_11.EntityType.findById((int)type);
    }

    public EntityTypes1_11.EntityType rewriteEntityType(int numType, List<EntityData> entityData) {
        EntityTypes1_11.EntityType type;
        block16: {
            type = EntityTypes1_11.EntityType.findById((int)numType);
            if (type == null) {
                return null;
            }
            try {
                Optional<EntityData> options;
                if (type.is((EntityType)EntityTypes1_11.EntityType.GUARDIAN) && (options = this.getById(entityData, 12)).isPresent() && ((Byte)options.get().getValue() & 4) == 4) {
                    return EntityTypes1_11.EntityType.ELDER_GUARDIAN;
                }
                if (type.is((EntityType)EntityTypes1_11.EntityType.SKELETON) && (options = this.getById(entityData, 12)).isPresent()) {
                    if ((Integer)options.get().getValue() == 1) {
                        return EntityTypes1_11.EntityType.WITHER_SKELETON;
                    }
                    if ((Integer)options.get().getValue() == 2) {
                        return EntityTypes1_11.EntityType.STRAY;
                    }
                }
                if (type.is((EntityType)EntityTypes1_11.EntityType.ZOMBIE) && (options = this.getById(entityData, 13)).isPresent()) {
                    int value = (Integer)options.get().getValue();
                    if (value > 0 && value < 6) {
                        entityData.add(new EntityData(16, (EntityDataType)EntityDataTypes1_9.VAR_INT, (Object)(value - 1)));
                        return EntityTypes1_11.EntityType.ZOMBIE_VILLAGER;
                    }
                    if (value == 6) {
                        return EntityTypes1_11.EntityType.HUSK;
                    }
                }
                if (type.is((EntityType)EntityTypes1_11.EntityType.HORSE) && (options = this.getById(entityData, 14)).isPresent()) {
                    if ((Integer)options.get().getValue() == 0) {
                        return EntityTypes1_11.EntityType.HORSE;
                    }
                    if ((Integer)options.get().getValue() == 1) {
                        return EntityTypes1_11.EntityType.DONKEY;
                    }
                    if ((Integer)options.get().getValue() == 2) {
                        return EntityTypes1_11.EntityType.MULE;
                    }
                    if ((Integer)options.get().getValue() == 3) {
                        return EntityTypes1_11.EntityType.ZOMBIE_HORSE;
                    }
                    if ((Integer)options.get().getValue() == 4) {
                        return EntityTypes1_11.EntityType.SKELETON_HORSE;
                    }
                }
            }
            catch (Exception e) {
                if (!Via.getConfig().logEntityDataErrors()) break block16;
                ((Protocol1_10To1_11)this.protocol).getLogger().warning("An error occurred with entity type rewriter");
                ((Protocol1_10To1_11)this.protocol).getLogger().warning("Entity data: " + String.valueOf(entityData));
                ((Protocol1_10To1_11)this.protocol).getLogger().log(Level.WARNING, "Error: ", (Throwable)e);
            }
        }
        return type;
    }
}

