/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.BlockPosition
 *  com.viaversion.viaversion.api.minecraft.ClientWorld
 *  com.viaversion.viaversion.api.minecraft.VillagerData
 *  com.viaversion.viaversion.api.minecraft.entities.EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_13$EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_13$ObjectType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_14
 *  com.viaversion.viaversion.api.minecraft.entitydata.EntityData
 *  com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes1_14
 *  com.viaversion.viaversion.api.minecraft.item.DataItem
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.version.Types1_13_2
 *  com.viaversion.viaversion.api.type.types.version.Types1_14
 *  com.viaversion.viaversion.protocols.v1_12_2to1_13.packet.ClientboundPackets1_13
 *  com.viaversion.viaversion.protocols.v1_13_2to1_14.storage.EntityTracker1_14
 *  com.viaversion.viaversion.rewriter.EntityRewriter
 */
package com.viaversion.viaversion.protocols.v1_13_2to1_14.rewriter;

import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.BlockPosition;
import com.viaversion.viaversion.api.minecraft.ClientWorld;
import com.viaversion.viaversion.api.minecraft.VillagerData;
import com.viaversion.viaversion.api.minecraft.entities.EntityType;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_13;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_14;
import com.viaversion.viaversion.api.minecraft.entitydata.EntityData;
import com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes1_14;
import com.viaversion.viaversion.api.minecraft.item.DataItem;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.version.Types1_13_2;
import com.viaversion.viaversion.api.type.types.version.Types1_14;
import com.viaversion.viaversion.protocols.v1_12_2to1_13.packet.ClientboundPackets1_13;
import com.viaversion.viaversion.protocols.v1_13_2to1_14.Protocol1_13_2To1_14;
import com.viaversion.viaversion.protocols.v1_13_2to1_14.packet.ClientboundPackets1_14;
import com.viaversion.viaversion.protocols.v1_13_2to1_14.rewriter.WorldPacketRewriter1_14;
import com.viaversion.viaversion.protocols.v1_13_2to1_14.storage.EntityTracker1_14;
import com.viaversion.viaversion.rewriter.EntityRewriter;
import java.util.ArrayList;

public class EntityPacketRewriter1_14
extends EntityRewriter<ClientboundPackets1_13, Protocol1_13_2To1_14> {
    public EntityPacketRewriter1_14(Protocol1_13_2To1_14 protocol) {
        super((Protocol)protocol);
    }

    public static int recalculatePlayerPose(int entityId, EntityTracker1_14 tracker) {
        byte flags = tracker.getEntityFlags(entityId);
        int pose = 0;
        if (EntityPacketRewriter1_14.isFallFlying(flags)) {
            pose = 1;
        } else if (tracker.isSleeping(entityId)) {
            pose = 2;
        } else if (EntityPacketRewriter1_14.isSwimming(flags)) {
            pose = 3;
        } else if (tracker.isRiptide(entityId)) {
            pose = 4;
        } else if (EntityPacketRewriter1_14.isSneaking(flags)) {
            pose = 5;
        }
        return pose;
    }

    public void onMappingDataLoaded() {
        super.onMappingDataLoaded();
        if (Via.getConfig().translateOcelotToCat()) {
            this.mapEntityType((EntityType)EntityTypes1_13.EntityType.OCELOT, (EntityType)EntityTypes1_14.CAT);
        }
    }

    protected void registerRewrites() {
        this.filter().mapDataType(arg_0 -> ((EntityDataTypes1_14)Types1_14.ENTITY_DATA_TYPES).byId(arg_0));
        this.registerEntityDataTypeHandler(Types1_14.ENTITY_DATA_TYPES.itemType, Types1_14.ENTITY_DATA_TYPES.optionalBlockStateType, Types1_14.ENTITY_DATA_TYPES.particleType);
        this.filter().type((EntityType)EntityTypes1_14.ENTITY).addIndex(6);
        this.registerBlockStateHandler((EntityType)EntityTypes1_14.ABSTRACT_MINECART, 10);
        this.filter().type((EntityType)EntityTypes1_14.LIVING_ENTITY).addIndex(12);
        this.filter().type((EntityType)EntityTypes1_14.LIVING_ENTITY).index(8).handler((event, data) -> {
            float value = ((Number)data.getValue()).floatValue();
            if (Float.isNaN(value) && Via.getConfig().is1_14HealthNaNFix()) {
                data.setValue((Object)Float.valueOf(1.0f));
            }
        });
        this.filter().type((EntityType)EntityTypes1_14.MOB).index(13).handler((event, data) -> {
            EntityTracker1_14 tracker = (EntityTracker1_14)this.tracker(event.user());
            int entityId = event.entityId();
            tracker.setInsentientData(entityId, (byte)(((Number)data.getValue()).byteValue() & 0xFFFFFFFB | tracker.getInsentientData(entityId) & 4));
            data.setValue((Object)tracker.getInsentientData(entityId));
        });
        this.filter().type((EntityType)EntityTypes1_14.PLAYER).handler((event, data) -> {
            EntityTracker1_14 tracker = (EntityTracker1_14)this.tracker(event.user());
            int entityId = event.entityId();
            if (entityId != tracker.clientEntityId()) {
                if (data.id() == 0) {
                    byte flags = ((Number)data.getValue()).byteValue();
                    tracker.setEntityFlags(entityId, flags);
                } else if (data.id() == 7) {
                    tracker.setRiptide(entityId, (((Number)data.getValue()).byteValue() & 4) != 0);
                }
                if (data.id() == 0 || data.id() == 7) {
                    event.createExtraData(new EntityData(6, Types1_14.ENTITY_DATA_TYPES.poseType, (Object)EntityPacketRewriter1_14.recalculatePlayerPose(entityId, tracker)));
                }
            }
        });
        this.filter().type((EntityType)EntityTypes1_14.ZOMBIE).handler((event, data) -> {
            if (data.id() == 16) {
                EntityTracker1_14 tracker = (EntityTracker1_14)this.tracker(event.user());
                int entityId = event.entityId();
                tracker.setInsentientData(entityId, (byte)(tracker.getInsentientData(entityId) & 0xFFFFFFFB | ((Boolean)data.getValue() != false ? 4 : 0)));
                event.createExtraData(new EntityData(13, Types1_14.ENTITY_DATA_TYPES.byteType, (Object)tracker.getInsentientData(entityId)));
                event.cancel();
            } else if (data.id() > 16) {
                data.setId(data.id() - 1);
            }
        });
        this.filter().type((EntityType)EntityTypes1_14.HORSE).index(18).handler((event, data) -> {
            event.cancel();
            int armorType = (Integer)data.value();
            DataItem armorItem = null;
            if (armorType == 1) {
                armorItem = new DataItem(((Protocol1_13_2To1_14)this.protocol).getMappingData().getNewItemId(727), 1, null);
            } else if (armorType == 2) {
                armorItem = new DataItem(((Protocol1_13_2To1_14)this.protocol).getMappingData().getNewItemId(728), 1, null);
            } else if (armorType == 3) {
                armorItem = new DataItem(((Protocol1_13_2To1_14)this.protocol).getMappingData().getNewItemId(729), 1, null);
            }
            PacketWrapper equipmentPacket = PacketWrapper.create((PacketType)ClientboundPackets1_14.SET_EQUIPPED_ITEM, null, (UserConnection)event.user());
            equipmentPacket.write((Type)Types.VAR_INT, (Object)event.entityId());
            equipmentPacket.write((Type)Types.VAR_INT, (Object)4);
            equipmentPacket.write(Types.ITEM1_13_2, (Object)armorItem);
            try {
                equipmentPacket.scheduleSend(Protocol1_13_2To1_14.class);
            }
            catch (Exception e) {
                throw new RuntimeException(e);
            }
        });
        this.filter().type((EntityType)EntityTypes1_14.VILLAGER).index(15).handler((event, data) -> data.setTypeAndValue(Types1_14.ENTITY_DATA_TYPES.villagerDataType, (Object)new VillagerData(2, EntityPacketRewriter1_14.getNewProfessionId((Integer)data.value()), 0)));
        this.filter().type((EntityType)EntityTypes1_14.ZOMBIE_VILLAGER).index(18).handler((event, data) -> data.setTypeAndValue(Types1_14.ENTITY_DATA_TYPES.villagerDataType, (Object)new VillagerData(2, EntityPacketRewriter1_14.getNewProfessionId((Integer)data.value()), 0)));
        this.filter().type((EntityType)EntityTypes1_14.ABSTRACT_ARROW).addIndex(9);
        this.filter().type((EntityType)EntityTypes1_14.FIREWORK_ROCKET).index(8).handler((event, data) -> {
            data.setDataType(Types1_14.ENTITY_DATA_TYPES.optionalVarIntType);
            if (data.getValue().equals(0)) {
                data.setValue(null);
            }
        });
        this.filter().type((EntityType)EntityTypes1_14.ABSTRACT_SKELETON).index(14).handler((event, data) -> {
            EntityTracker1_14 tracker = (EntityTracker1_14)this.tracker(event.user());
            int entityId = event.entityId();
            tracker.setInsentientData(entityId, (byte)(tracker.getInsentientData(entityId) & 0xFFFFFFFB | ((Boolean)data.getValue() != false ? 4 : 0)));
            event.createExtraData(new EntityData(13, Types1_14.ENTITY_DATA_TYPES.byteType, (Object)tracker.getInsentientData(entityId)));
            event.cancel();
        });
        this.filter().type((EntityType)EntityTypes1_14.ABSTRACT_ILLAGER).handler((event, data) -> {
            if (event.index() == 14) {
                EntityTracker1_14 tracker = (EntityTracker1_14)this.tracker(event.user());
                int entityId = event.entityId();
                tracker.setInsentientData(entityId, (byte)(tracker.getInsentientData(entityId) & 0xFFFFFFFB | (((Number)data.getValue()).byteValue() != 0 ? 4 : 0)));
                event.createExtraData(new EntityData(13, Types1_14.ENTITY_DATA_TYPES.byteType, (Object)tracker.getInsentientData(entityId)));
                event.cancel();
            } else if (event.index() > 14) {
                data.setId(data.id() - 1);
            }
        });
        this.filter().type((EntityType)EntityTypes1_14.OCELOT).removeIndex(17);
        this.filter().type((EntityType)EntityTypes1_14.OCELOT).removeIndex(16);
        this.filter().type((EntityType)EntityTypes1_14.OCELOT).removeIndex(15);
        this.filter().type((EntityType)EntityTypes1_14.ABSTRACT_RAIDER).addIndex(14);
    }

    protected void registerPackets() {
        ((Protocol1_13_2To1_14)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_13.ADD_EXPERIENCE_ORB, wrapper -> {
            int entityId = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            this.tracker(wrapper.user()).addEntity(entityId, (EntityType)EntityTypes1_14.EXPERIENCE_ORB);
        });
        ((Protocol1_13_2To1_14)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_13.ADD_GLOBAL_ENTITY, wrapper -> {
            int entityId = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            if ((Byte)wrapper.passthrough((Type)Types.BYTE) == 1) {
                this.tracker(wrapper.user()).addEntity(entityId, (EntityType)EntityTypes1_14.LIGHTNING_BOLT);
            }
        });
        ((Protocol1_13_2To1_14)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_13.ADD_ENTITY, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.map(Types.UUID);
                this.map((Type)Types.BYTE, (Type)Types.VAR_INT);
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.INT);
                this.map((Type)Types.SHORT);
                this.map((Type)Types.SHORT);
                this.map((Type)Types.SHORT);
                this.handler(wrapper -> {
                    int data;
                    int entityId = (Integer)wrapper.get((Type)Types.VAR_INT, 0);
                    int typeId = (Integer)wrapper.get((Type)Types.VAR_INT, 1);
                    EntityTypes1_13.EntityType type1_13 = EntityTypes1_13.ObjectType.getEntityType((int)typeId, (int)(data = ((Integer)wrapper.get((Type)Types.INT, 0)).intValue()));
                    if (type1_13 == null) {
                        return;
                    }
                    typeId = EntityPacketRewriter1_14.this.newEntityId(type1_13.getId());
                    EntityType type1_14 = EntityTypes1_14.getTypeFromId((int)typeId);
                    if (type1_14.is((EntityType)EntityTypes1_14.FALLING_BLOCK)) {
                        wrapper.set((Type)Types.INT, 0, (Object)((Protocol1_13_2To1_14)EntityPacketRewriter1_14.this.protocol).getMappingData().getNewBlockStateId(data));
                    } else if (type1_14.is((EntityType)EntityTypes1_14.ITEM) && data > 0 || type1_14.isOrHasParent((EntityType)EntityTypes1_14.ABSTRACT_ARROW)) {
                        if (type1_14.isOrHasParent((EntityType)EntityTypes1_14.ABSTRACT_ARROW)) {
                            wrapper.set((Type)Types.INT, 0, (Object)(data - 1));
                        }
                        PacketWrapper velocity = wrapper.create((PacketType)ClientboundPackets1_14.SET_ENTITY_MOTION);
                        velocity.write((Type)Types.VAR_INT, (Object)entityId);
                        velocity.write((Type)Types.SHORT, (Object)((Short)wrapper.get((Type)Types.SHORT, 0)));
                        velocity.write((Type)Types.SHORT, (Object)((Short)wrapper.get((Type)Types.SHORT, 1)));
                        velocity.write((Type)Types.SHORT, (Object)((Short)wrapper.get((Type)Types.SHORT, 2)));
                        velocity.scheduleSend(Protocol1_13_2To1_14.class);
                    }
                    wrapper.user().getEntityTracker(Protocol1_13_2To1_14.class).addEntity(entityId, type1_14);
                    wrapper.set((Type)Types.VAR_INT, 1, (Object)typeId);
                });
            }
        });
        ((Protocol1_13_2To1_14)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_13.ADD_MOB, (PacketHandler)new PacketHandlers(){

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
                this.map(Types1_13_2.ENTITY_DATA_LIST, Types1_14.ENTITY_DATA_LIST);
                this.handler(wrapper -> {
                    int entityType = (Integer)wrapper.get((Type)Types.VAR_INT, 1);
                    if (EntityTypes1_13.EntityType.findById((int)entityType) == null) {
                        wrapper.cancel();
                        return;
                    }
                    EntityPacketRewriter1_14.this.trackerAndRewriterHandler(Types1_14.ENTITY_DATA_LIST).handle(wrapper);
                });
            }
        });
        ((Protocol1_13_2To1_14)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_13.ADD_PAINTING, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.map(Types.UUID);
                this.map((Type)Types.VAR_INT);
                this.map(Types.BLOCK_POSITION1_8, Types.BLOCK_POSITION1_14);
                this.map((Type)Types.BYTE);
                this.handler(wrapper -> EntityPacketRewriter1_14.this.tracker(wrapper.user()).addEntity(((Integer)wrapper.get((Type)Types.VAR_INT, 0)).intValue(), (EntityType)EntityTypes1_14.PAINTING));
            }
        });
        ((Protocol1_13_2To1_14)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_13.ADD_PLAYER, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.map(Types.UUID);
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.BYTE);
                this.map(Types1_13_2.ENTITY_DATA_LIST, Types1_14.ENTITY_DATA_LIST);
                this.handler(EntityPacketRewriter1_14.this.trackerAndRewriterHandler(Types1_14.ENTITY_DATA_LIST, (EntityType)EntityTypes1_14.PLAYER));
            }
        });
        ((Protocol1_13_2To1_14)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_13.ANIMATE, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.handler(wrapper -> {
                    short animation = (Short)wrapper.passthrough((Type)Types.UNSIGNED_BYTE);
                    if (animation == 2) {
                        EntityTracker1_14 tracker = (EntityTracker1_14)wrapper.user().getEntityTracker(Protocol1_13_2To1_14.class);
                        int entityId = (Integer)wrapper.get((Type)Types.VAR_INT, 0);
                        tracker.setSleeping(entityId, false);
                        PacketWrapper entityDataPacket = wrapper.create((PacketType)ClientboundPackets1_14.SET_ENTITY_DATA);
                        entityDataPacket.write((Type)Types.VAR_INT, (Object)entityId);
                        ArrayList<EntityData> entityDataList = new ArrayList<EntityData>();
                        if (tracker.clientEntityId() != entityId) {
                            entityDataList.add(new EntityData(6, Types1_14.ENTITY_DATA_TYPES.poseType, (Object)EntityPacketRewriter1_14.recalculatePlayerPose(entityId, tracker)));
                        }
                        entityDataList.add(new EntityData(12, Types1_14.ENTITY_DATA_TYPES.optionalBlockPositionType, null));
                        entityDataPacket.write(Types1_14.ENTITY_DATA_LIST, entityDataList);
                        entityDataPacket.scheduleSend(Protocol1_13_2To1_14.class);
                    }
                });
            }
        });
        ((Protocol1_13_2To1_14)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_13.LOGIN, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT);
                this.map((Type)Types.UNSIGNED_BYTE);
                this.map((Type)Types.INT);
                this.handler(wrapper -> {
                    ClientWorld clientChunks = wrapper.user().getClientWorld(Protocol1_13_2To1_14.class);
                    int dimensionId = (Integer)wrapper.get((Type)Types.INT, 1);
                    clientChunks.setEnvironment(dimensionId);
                });
                this.handler(EntityPacketRewriter1_14.this.playerTrackerHandler());
                this.handler(wrapper -> {
                    short difficulty = (Short)wrapper.read((Type)Types.UNSIGNED_BYTE);
                    PacketWrapper difficultyPacket = wrapper.create((PacketType)ClientboundPackets1_14.CHANGE_DIFFICULTY);
                    difficultyPacket.write((Type)Types.UNSIGNED_BYTE, (Object)difficulty);
                    difficultyPacket.write((Type)Types.BOOLEAN, (Object)false);
                    difficultyPacket.scheduleSend(((Object)((Object)((Protocol1_13_2To1_14)EntityPacketRewriter1_14.this.protocol))).getClass());
                    wrapper.passthrough((Type)Types.UNSIGNED_BYTE);
                    wrapper.passthrough(Types.STRING);
                    wrapper.write((Type)Types.VAR_INT, (Object)64);
                });
                this.handler(wrapper -> {
                    wrapper.send(Protocol1_13_2To1_14.class);
                    wrapper.cancel();
                    WorldPacketRewriter1_14.sendViewDistancePacket(wrapper.user());
                });
            }
        });
        ((Protocol1_13_2To1_14)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_13.PLAYER_SLEEP, ClientboundPackets1_14.SET_ENTITY_DATA, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.handler(wrapper -> {
                    EntityTracker1_14 tracker = (EntityTracker1_14)wrapper.user().getEntityTracker(Protocol1_13_2To1_14.class);
                    int entityId = (Integer)wrapper.get((Type)Types.VAR_INT, 0);
                    tracker.setSleeping(entityId, true);
                    BlockPosition position = (BlockPosition)wrapper.read(Types.BLOCK_POSITION1_8);
                    ArrayList<EntityData> entityDataList = new ArrayList<EntityData>();
                    entityDataList.add(new EntityData(12, Types1_14.ENTITY_DATA_TYPES.optionalBlockPositionType, (Object)position));
                    if (tracker.clientEntityId() != entityId) {
                        entityDataList.add(new EntityData(6, Types1_14.ENTITY_DATA_TYPES.poseType, (Object)EntityPacketRewriter1_14.recalculatePlayerPose(entityId, tracker)));
                    }
                    wrapper.write(Types1_14.ENTITY_DATA_LIST, entityDataList);
                });
            }
        });
        this.registerSetEntityData((ClientboundPacketType)ClientboundPackets1_13.SET_ENTITY_DATA, Types1_13_2.ENTITY_DATA_LIST, Types1_14.ENTITY_DATA_LIST);
    }

    public EntityType typeFromId(int type) {
        return EntityTypes1_14.getTypeFromId((int)type);
    }

    private static boolean isSneaking(byte flags) {
        return (flags & 2) != 0;
    }

    private static boolean isSwimming(byte flags) {
        return (flags & 0x10) != 0;
    }

    private static boolean isFallFlying(int entityFlags) {
        return (entityFlags & 0x80) != 0;
    }

    private static int getNewProfessionId(int old) {
        return switch (old) {
            case 0 -> 5;
            case 1 -> 9;
            case 2 -> 4;
            case 3 -> 1;
            case 4 -> 2;
            case 5 -> 11;
            default -> 0;
        };
    }
}

