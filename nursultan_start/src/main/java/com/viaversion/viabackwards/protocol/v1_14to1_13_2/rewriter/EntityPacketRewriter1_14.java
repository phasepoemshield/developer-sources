/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viabackwards.api.BackwardsProtocol
 *  com.viaversion.viabackwards.api.entities.storage.EntityPositionHandler
 *  com.viaversion.viabackwards.api.entities.storage.EntityReplacement
 *  com.viaversion.viabackwards.api.rewriters.EntityRewriterBase
 *  com.viaversion.viabackwards.api.rewriters.LegacyEntityRewriter
 *  com.viaversion.viabackwards.protocol.v1_14to1_13_2.Protocol1_14To1_13_2
 *  com.viaversion.viabackwards.protocol.v1_14to1_13_2.rewriter.EntityPacketRewriter1_14$11
 *  com.viaversion.viabackwards.protocol.v1_14to1_13_2.storage.ChunkLightStorage
 *  com.viaversion.viabackwards.protocol.v1_14to1_13_2.storage.DifficultyStorage
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.data.entity.EntityTracker
 *  com.viaversion.viaversion.api.data.entity.StoredEntityData
 *  com.viaversion.viaversion.api.minecraft.BlockPosition
 *  com.viaversion.viaversion.api.minecraft.ClientWorld
 *  com.viaversion.viaversion.api.minecraft.Particle
 *  com.viaversion.viaversion.api.minecraft.VillagerData
 *  com.viaversion.viaversion.api.minecraft.entities.EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_13$EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_13$ObjectType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_14
 *  com.viaversion.viaversion.api.minecraft.entitydata.EntityData
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.version.Types1_13_2
 *  com.viaversion.viaversion.api.type.types.version.Types1_14
 *  com.viaversion.viaversion.protocols.v1_12_2to1_13.packet.ClientboundPackets1_13
 *  com.viaversion.viaversion.protocols.v1_12_2to1_13.packet.ServerboundPackets1_13
 *  com.viaversion.viaversion.protocols.v1_13_2to1_14.packet.ClientboundPackets1_14
 *  com.viaversion.viaversion.rewriter.entitydata.EntityDataHandler
 */
package com.viaversion.viabackwards.protocol.v1_14to1_13_2.rewriter;

import com.viaversion.viabackwards.api.BackwardsProtocol;
import com.viaversion.viabackwards.api.entities.storage.EntityPositionHandler;
import com.viaversion.viabackwards.api.entities.storage.EntityReplacement;
import com.viaversion.viabackwards.api.rewriters.EntityRewriterBase;
import com.viaversion.viabackwards.api.rewriters.LegacyEntityRewriter;
import com.viaversion.viabackwards.protocol.v1_14to1_13_2.Protocol1_14To1_13_2;
import com.viaversion.viabackwards.protocol.v1_14to1_13_2.rewriter.EntityPacketRewriter1_14;
import com.viaversion.viabackwards.protocol.v1_14to1_13_2.storage.ChunkLightStorage;
import com.viaversion.viabackwards.protocol.v1_14to1_13_2.storage.DifficultyStorage;
import com.viaversion.viabackwards.protocol.v1_14to1_13_2.storage.EntityPositionStorage1_14;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.data.entity.EntityTracker;
import com.viaversion.viaversion.api.data.entity.StoredEntityData;
import com.viaversion.viaversion.api.minecraft.BlockPosition;
import com.viaversion.viaversion.api.minecraft.ClientWorld;
import com.viaversion.viaversion.api.minecraft.Particle;
import com.viaversion.viaversion.api.minecraft.VillagerData;
import com.viaversion.viaversion.api.minecraft.entities.EntityType;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_13;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_14;
import com.viaversion.viaversion.api.minecraft.entitydata.EntityData;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.version.Types1_13_2;
import com.viaversion.viaversion.api.type.types.version.Types1_14;
import com.viaversion.viaversion.protocols.v1_12_2to1_13.packet.ClientboundPackets1_13;
import com.viaversion.viaversion.protocols.v1_12_2to1_13.packet.ServerboundPackets1_13;
import com.viaversion.viaversion.protocols.v1_13_2to1_14.packet.ClientboundPackets1_14;
import com.viaversion.viaversion.rewriter.entitydata.EntityDataHandler;

public class EntityPacketRewriter1_14
extends LegacyEntityRewriter<ClientboundPackets1_14, Protocol1_14To1_13_2> {
    private EntityPositionHandler positionHandler;

    public EntityPacketRewriter1_14(Protocol1_14To1_13_2 protocol) {
        super((BackwardsProtocol)protocol, Types1_13_2.ENTITY_DATA_TYPES.optionalComponentType, Types1_13_2.ENTITY_DATA_TYPES.booleanType);
    }

    public void onMappingDataLoaded() {
        super.onMappingDataLoaded();
        this.mapEntityTypeWithData((EntityType)EntityTypes1_14.CAT, (EntityType)EntityTypes1_14.OCELOT).jsonName();
        this.mapEntityTypeWithData((EntityType)EntityTypes1_14.TRADER_LLAMA, (EntityType)EntityTypes1_14.LLAMA).jsonName();
        this.mapEntityTypeWithData((EntityType)EntityTypes1_14.FOX, (EntityType)EntityTypes1_14.WOLF).jsonName();
        this.mapEntityTypeWithData((EntityType)EntityTypes1_14.PANDA, (EntityType)EntityTypes1_14.POLAR_BEAR).jsonName();
        this.mapEntityTypeWithData((EntityType)EntityTypes1_14.PILLAGER, (EntityType)EntityTypes1_14.VILLAGER).jsonName();
        this.mapEntityTypeWithData((EntityType)EntityTypes1_14.WANDERING_TRADER, (EntityType)EntityTypes1_14.VILLAGER).jsonName();
        this.mapEntityTypeWithData((EntityType)EntityTypes1_14.RAVAGER, (EntityType)EntityTypes1_14.COW).jsonName();
    }

    protected void registerRewrites() {
        this.filter().handler((event, data) -> {
            int typeId = data.dataType().typeId();
            if (typeId <= 15) {
                data.setDataType(Types1_13_2.ENTITY_DATA_TYPES.byId(typeId));
            }
        });
        this.registerEntityDataTypeHandler(Types1_13_2.ENTITY_DATA_TYPES.itemType, null, Types1_13_2.ENTITY_DATA_TYPES.optionalBlockStateType, null, Types1_13_2.ENTITY_DATA_TYPES.componentType, Types1_13_2.ENTITY_DATA_TYPES.optionalComponentType);
        this.filter().type((EntityType)EntityTypes1_14.PILLAGER).cancel(15);
        this.filter().type((EntityType)EntityTypes1_14.FOX).cancel(15);
        this.filter().type((EntityType)EntityTypes1_14.FOX).cancel(16);
        this.filter().type((EntityType)EntityTypes1_14.FOX).cancel(17);
        this.filter().type((EntityType)EntityTypes1_14.FOX).cancel(18);
        this.filter().type((EntityType)EntityTypes1_14.PANDA).cancel(15);
        this.filter().type((EntityType)EntityTypes1_14.PANDA).cancel(16);
        this.filter().type((EntityType)EntityTypes1_14.PANDA).cancel(17);
        this.filter().type((EntityType)EntityTypes1_14.PANDA).cancel(18);
        this.filter().type((EntityType)EntityTypes1_14.PANDA).cancel(19);
        this.filter().type((EntityType)EntityTypes1_14.PANDA).cancel(20);
        this.filter().type((EntityType)EntityTypes1_14.CAT).cancel(18);
        this.filter().type((EntityType)EntityTypes1_14.CAT).cancel(19);
        this.filter().type((EntityType)EntityTypes1_14.CAT).cancel(20);
        this.filter().type((EntityType)EntityTypes1_14.ABSTRACT_RAIDER).removeIndex(14);
        this.filter().type((EntityType)EntityTypes1_14.AREA_EFFECT_CLOUD).index(10).handler((event, data) -> ((Protocol1_14To1_13_2)this.protocol).getParticleRewriter().rewriteParticle(event.user(), (Particle)data.getValue()));
        this.filter().type((EntityType)EntityTypes1_14.FIREWORK_ROCKET).index(8).handler((event, data) -> {
            data.setDataType(Types1_13_2.ENTITY_DATA_TYPES.varIntType);
            Integer value = (Integer)data.getValue();
            if (value == null) {
                data.setValue((Object)0);
            }
        });
        this.filter().type((EntityType)EntityTypes1_14.ABSTRACT_ARROW).removeIndex(9);
        this.filter().type((EntityType)EntityTypes1_14.VILLAGER).cancel(15);
        EntityDataHandler villagerDataHandler = (event, data) -> {
            VillagerData villagerData = (VillagerData)data.getValue();
            data.setTypeAndValue(Types1_13_2.ENTITY_DATA_TYPES.varIntType, (Object)this.villagerDataToProfession(villagerData));
            if (data.id() == 16) {
                event.setIndex(15);
            }
        };
        this.filter().type((EntityType)EntityTypes1_14.ZOMBIE_VILLAGER).index(18).handler(villagerDataHandler);
        this.filter().type((EntityType)EntityTypes1_14.VILLAGER).index(16).handler(villagerDataHandler);
        this.filter().type((EntityType)EntityTypes1_14.ABSTRACT_SKELETON).index(13).handler((event, data) -> {
            byte value = (Byte)data.getValue();
            if ((value & 4) != 0) {
                event.createExtraData(new EntityData(14, Types1_13_2.ENTITY_DATA_TYPES.booleanType, (Object)true));
            }
        });
        this.filter().type((EntityType)EntityTypes1_14.ZOMBIE).index(13).handler((event, data) -> {
            byte value = (Byte)data.getValue();
            if ((value & 4) != 0) {
                event.createExtraData(new EntityData(16, Types1_13_2.ENTITY_DATA_TYPES.booleanType, (Object)true));
            }
        });
        this.filter().type((EntityType)EntityTypes1_14.ZOMBIE).addIndex(16);
        this.filter().type((EntityType)EntityTypes1_14.LIVING_ENTITY).handler((event, data) -> {
            int index = event.index();
            if (index == 12) {
                BlockPosition position = (BlockPosition)data.getValue();
                if (position != null && event.entityType() == EntityTypes1_14.PLAYER) {
                    PacketWrapper wrapper = PacketWrapper.create((PacketType)ClientboundPackets1_13.PLAYER_SLEEP, null, (UserConnection)event.user());
                    wrapper.write((Type)Types.VAR_INT, (Object)event.entityId());
                    wrapper.write(Types.BLOCK_POSITION1_8, (Object)position);
                    wrapper.scheduleSend(Protocol1_14To1_13_2.class);
                }
                event.cancel();
            } else if (index > 12) {
                event.setIndex(index - 1);
            }
        });
        this.filter().removeIndex(6);
        this.filter().type((EntityType)EntityTypes1_14.OCELOT).index(13).handler((event, data) -> {
            event.setIndex(15);
            data.setTypeAndValue(Types1_13_2.ENTITY_DATA_TYPES.varIntType, (Object)0);
        });
        this.filter().type((EntityType)EntityTypes1_14.CAT).handler((event, data) -> {
            if (event.index() == 15) {
                data.setValue((Object)1);
            } else if (event.index() == 13) {
                data.setValue((Object)((byte)((Byte)data.getValue() & 4)));
            }
        });
        this.filter().handler((event, data) -> {
            if (data.dataType().typeId() > 15) {
                event.cancel();
            }
        });
    }

    protected void registerPackets() {
        this.positionHandler = new EntityPositionHandler((EntityRewriterBase)this, EntityPositionStorage1_14.class, EntityPositionStorage1_14::new);
        ((Protocol1_14To1_13_2)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_14.ENTITY_EVENT, wrapper -> {
            int entityId = (Integer)wrapper.passthrough((Type)Types.INT);
            byte status = (Byte)wrapper.passthrough((Type)Types.BYTE);
            if (status != 3) {
                return;
            }
            EntityTracker tracker = this.tracker(wrapper.user());
            EntityType entityType = tracker.entityType(entityId);
            if (entityType != EntityTypes1_14.PLAYER) {
                return;
            }
            for (int i = 0; i <= 5; ++i) {
                PacketWrapper equipmentPacket = wrapper.create((PacketType)ClientboundPackets1_13.SET_EQUIPPED_ITEM);
                equipmentPacket.write((Type)Types.VAR_INT, (Object)entityId);
                equipmentPacket.write((Type)Types.VAR_INT, (Object)i);
                equipmentPacket.write(Types.ITEM1_13_2, null);
                equipmentPacket.send(Protocol1_14To1_13_2.class);
            }
        });
        ((Protocol1_14To1_13_2)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_14.TELEPORT_ENTITY, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.DOUBLE);
                this.handler(wrapper -> EntityPacketRewriter1_14.this.positionHandler.cacheEntityPosition(wrapper, false, false));
            }
        });
        PacketHandlers relativeMoveHandler = new PacketHandlers(){

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.map((Type)Types.SHORT);
                this.map((Type)Types.SHORT);
                this.map((Type)Types.SHORT);
                this.handler(wrapper -> {
                    double x = (double)((Short)wrapper.get((Type)Types.SHORT, 0)).shortValue() / 4096.0;
                    double y = (double)((Short)wrapper.get((Type)Types.SHORT, 1)).shortValue() / 4096.0;
                    double z = (double)((Short)wrapper.get((Type)Types.SHORT, 2)).shortValue() / 4096.0;
                    EntityPacketRewriter1_14.this.positionHandler.cacheEntityPosition(wrapper, x, y, z, false, true);
                });
            }
        };
        ((Protocol1_14To1_13_2)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_14.MOVE_ENTITY_POS, (PacketHandler)relativeMoveHandler);
        ((Protocol1_14To1_13_2)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_14.MOVE_ENTITY_POS_ROT, (PacketHandler)relativeMoveHandler);
        ((Protocol1_14To1_13_2)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_14.ADD_ENTITY, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.map(Types.UUID);
                this.map((Type)Types.VAR_INT, (Type)Types.BYTE);
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
                    byte type = (Byte)wrapper.get((Type)Types.BYTE, 0);
                    EntityType entityType = EntityPacketRewriter1_14.this.objectTypeFromId(type, data = ((Integer)wrapper.get((Type)Types.INT, 0)).intValue());
                    if (entityType == null) {
                        return;
                    }
                    EntityPacketRewriter1_14.this.trackAndCacheEntityPosition(wrapper, entityType);
                });
                this.handler(wrapper -> {
                    int data;
                    EntityTypes1_13.ObjectType objectType;
                    EntityTypes1_13.EntityType entityType;
                    block16: {
                        block15: {
                            byte id = (Byte)wrapper.get((Type)Types.BYTE, 0);
                            int mappedId = EntityPacketRewriter1_14.this.newEntityId(id);
                            entityType = EntityTypes1_13.EntityType.findById((int)mappedId);
                            if (entityType == null) {
                                return;
                            }
                            objectType = null;
                            if (!entityType.isOrHasParent((EntityType)EntityTypes1_13.EntityType.ABSTRACT_MINECART)) break block15;
                            objectType = EntityTypes1_13.ObjectType.MINECART;
                            switch (11.$SwitchMap$com$viaversion$viaversion$api$minecraft$entities$EntityTypes1_13$EntityType[entityType.ordinal()]) {
                                case 1: {
                                    int n = 1;
                                    break;
                                }
                                case 2: {
                                    int n = 2;
                                    break;
                                }
                                case 3: {
                                    int n = 3;
                                    break;
                                }
                                case 4: {
                                    int n = 4;
                                    break;
                                }
                                case 5: {
                                    int n = 5;
                                    break;
                                }
                                case 6: {
                                    int n = 6;
                                    break;
                                }
                                default: {
                                    int n = data = 0;
                                }
                            }
                            if (data == 0) break block16;
                            wrapper.set((Type)Types.INT, 0, (Object)data);
                            break block16;
                        }
                        if (entityType.is((EntityType)EntityTypes1_13.EntityType.EXPERIENCE_ORB)) {
                            wrapper.cancel();
                            int entityId = (Integer)wrapper.get((Type)Types.VAR_INT, 0);
                            PacketWrapper addExperienceOrb = PacketWrapper.create((PacketType)ClientboundPackets1_13.ADD_EXPERIENCE_ORB, (UserConnection)wrapper.user());
                            addExperienceOrb.write((Type)Types.VAR_INT, (Object)entityId);
                            addExperienceOrb.write((Type)Types.DOUBLE, (Object)((Double)wrapper.get((Type)Types.DOUBLE, 0)));
                            addExperienceOrb.write((Type)Types.DOUBLE, (Object)((Double)wrapper.get((Type)Types.DOUBLE, 1)));
                            addExperienceOrb.write((Type)Types.DOUBLE, (Object)((Double)wrapper.get((Type)Types.DOUBLE, 2)));
                            addExperienceOrb.write((Type)Types.SHORT, (Object)0);
                            addExperienceOrb.send(Protocol1_14To1_13_2.class);
                            PacketWrapper setEntityMotion = PacketWrapper.create((PacketType)ClientboundPackets1_13.SET_ENTITY_MOTION, (UserConnection)wrapper.user());
                            setEntityMotion.write((Type)Types.VAR_INT, (Object)entityId);
                            setEntityMotion.write((Type)Types.SHORT, (Object)((Short)wrapper.get((Type)Types.SHORT, 0)));
                            setEntityMotion.write((Type)Types.SHORT, (Object)((Short)wrapper.get((Type)Types.SHORT, 1)));
                            setEntityMotion.write((Type)Types.SHORT, (Object)((Short)wrapper.get((Type)Types.SHORT, 2)));
                            setEntityMotion.send(Protocol1_14To1_13_2.class);
                            return;
                        }
                        for (EntityTypes1_13.ObjectType type : EntityTypes1_13.ObjectType.values()) {
                            if (type.getType() != entityType) continue;
                            objectType = type;
                            break;
                        }
                    }
                    if (objectType == null) {
                        return;
                    }
                    wrapper.set((Type)Types.BYTE, 0, (Object)((byte)objectType.getId()));
                    data = (Integer)wrapper.get((Type)Types.INT, 0);
                    if (objectType == EntityTypes1_13.ObjectType.FALLING_BLOCK) {
                        int blockState = (Integer)wrapper.get((Type)Types.INT, 0);
                        int combined = ((Protocol1_14To1_13_2)EntityPacketRewriter1_14.this.protocol).getMappingData().getNewBlockStateId(blockState);
                        wrapper.set((Type)Types.INT, 0, (Object)combined);
                    } else if (entityType.isOrHasParent((EntityType)EntityTypes1_13.EntityType.ABSTRACT_ARROW)) {
                        wrapper.set((Type)Types.INT, 0, (Object)(data + 1));
                    }
                });
            }
        });
        ((Protocol1_14To1_13_2)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_14.ADD_MOB, (PacketHandler)new PacketHandlers(){

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
                this.map(Types1_14.ENTITY_DATA_LIST, Types1_13_2.ENTITY_DATA_LIST);
                this.handler(wrapper -> {
                    int type = (Integer)wrapper.get((Type)Types.VAR_INT, 1);
                    EntityType entityType = EntityTypes1_14.getTypeFromId((int)type);
                    EntityPacketRewriter1_14.this.trackAndCacheEntityPosition(wrapper, entityType);
                    int oldId = EntityPacketRewriter1_14.this.newEntityId(type);
                    if (oldId == -1) {
                        EntityReplacement entityReplacement = EntityPacketRewriter1_14.this.entityDataForType(entityType);
                        if (entityReplacement == null) {
                            ((Protocol1_14To1_13_2)EntityPacketRewriter1_14.this.protocol).getLogger().warning("Could not find entity type mapping " + type + "/" + String.valueOf(entityType));
                            wrapper.cancel();
                        } else {
                            wrapper.set((Type)Types.VAR_INT, 1, (Object)entityReplacement.replacementId());
                        }
                    } else {
                        wrapper.set((Type)Types.VAR_INT, 1, (Object)oldId);
                    }
                });
                this.handler(EntityPacketRewriter1_14.this.getMobSpawnRewriter1_11(Types1_13_2.ENTITY_DATA_LIST));
            }
        });
        ((Protocol1_14To1_13_2)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_14.ADD_EXPERIENCE_ORB, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.DOUBLE);
                this.handler(wrapper -> EntityPacketRewriter1_14.this.trackAndCacheEntityPosition(wrapper, (EntityType)EntityTypes1_14.EXPERIENCE_ORB));
            }
        });
        ((Protocol1_14To1_13_2)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_14.ADD_GLOBAL_ENTITY, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.DOUBLE);
                this.handler(wrapper -> EntityPacketRewriter1_14.this.trackAndCacheEntityPosition(wrapper, (EntityType)EntityTypes1_14.LIGHTNING_BOLT));
            }
        });
        ((Protocol1_14To1_13_2)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_14.ADD_PAINTING, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.map(Types.UUID);
                this.map((Type)Types.VAR_INT);
                this.map(Types.BLOCK_POSITION1_14, Types.BLOCK_POSITION1_8);
                this.map((Type)Types.BYTE);
                this.handler(wrapper -> EntityPacketRewriter1_14.this.trackAndCacheEntityPosition(wrapper, (EntityType)EntityTypes1_14.PAINTING));
            }
        });
        ((Protocol1_14To1_13_2)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_14.ADD_PLAYER, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.map(Types.UUID);
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.BYTE);
                this.map(Types1_14.ENTITY_DATA_LIST, Types1_13_2.ENTITY_DATA_LIST);
                this.handler(EntityPacketRewriter1_14.this.getTrackerAndDataHandler(Types1_13_2.ENTITY_DATA_LIST, (EntityType)EntityTypes1_14.PLAYER));
                this.handler(wrapper -> EntityPacketRewriter1_14.this.positionHandler.cacheEntityPosition(wrapper, true, false));
            }
        });
        this.registerSetEntityData((ClientboundPacketType)ClientboundPackets1_14.SET_ENTITY_DATA, Types1_14.ENTITY_DATA_LIST, Types1_13_2.ENTITY_DATA_LIST);
        ((Protocol1_14To1_13_2)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_14.LOGIN, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT);
                this.map((Type)Types.UNSIGNED_BYTE);
                this.map((Type)Types.INT);
                this.handler(EntityPacketRewriter1_14.this.getDimensionHandler(1));
                this.handler(EntityPacketRewriter1_14.this.getPlayerTrackerHandler());
                this.handler(wrapper -> {
                    short difficulty = ((DifficultyStorage)wrapper.user().get(DifficultyStorage.class)).getDifficulty();
                    wrapper.write((Type)Types.UNSIGNED_BYTE, (Object)difficulty);
                    wrapper.passthrough((Type)Types.UNSIGNED_BYTE);
                    wrapper.passthrough(Types.STRING);
                    wrapper.read((Type)Types.VAR_INT);
                    int entityId = (Integer)wrapper.get((Type)Types.INT, 0);
                    StoredEntityData storedEntity = EntityPacketRewriter1_14.this.tracker(wrapper.user()).entityData(entityId);
                    storedEntity.put((Object)new EntityPositionStorage1_14());
                });
            }
        });
        ((Protocol1_14To1_13_2)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_14.RESPAWN, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT);
                this.handler(wrapper -> {
                    int dimensionId;
                    ClientWorld clientWorld = wrapper.user().getClientWorld(Protocol1_14To1_13_2.class);
                    if (clientWorld.setEnvironment(dimensionId = ((Integer)wrapper.get((Type)Types.INT, 0)).intValue())) {
                        EntityTracker tracker = EntityPacketRewriter1_14.this.tracker(wrapper.user());
                        tracker.clearEntities();
                        ((ChunkLightStorage)wrapper.user().get(ChunkLightStorage.class)).clear();
                        tracker.entityData(tracker.clientEntityId()).put((Object)new EntityPositionStorage1_14());
                    }
                    short difficulty = ((DifficultyStorage)wrapper.user().get(DifficultyStorage.class)).getDifficulty();
                    wrapper.write((Type)Types.UNSIGNED_BYTE, (Object)difficulty);
                });
            }
        });
        PacketHandler absoluteMoveHandler = wrapper -> {
            double x = (Double)wrapper.passthrough((Type)Types.DOUBLE);
            double y = (Double)wrapper.passthrough((Type)Types.DOUBLE);
            double z = (Double)wrapper.passthrough((Type)Types.DOUBLE);
            this.positionHandler.cacheEntityPosition(wrapper, this.tracker(wrapper.user()).clientEntityId(), x, y, z, false, false);
        };
        ((Protocol1_14To1_13_2)this.protocol).registerServerbound((ServerboundPacketType)ServerboundPackets1_13.MOVE_PLAYER_POS, absoluteMoveHandler);
        ((Protocol1_14To1_13_2)this.protocol).registerServerbound((ServerboundPacketType)ServerboundPackets1_13.MOVE_PLAYER_POS_ROT, absoluteMoveHandler);
    }

    public EntityType typeFromId(int typeId) {
        return EntityTypes1_14.getTypeFromId((int)typeId);
    }

    public int villagerDataToProfession(VillagerData data) {
        switch (data.profession()) {
            case 1: 
            case 10: 
            case 13: 
            case 14: {
                return 3;
            }
            case 2: 
            case 8: {
                return 4;
            }
            case 3: 
            case 9: {
                return 1;
            }
            case 4: {
                return 2;
            }
            case 5: 
            case 6: 
            case 7: 
            case 12: {
                return 0;
            }
        }
        return 5;
    }

    private void trackAndCacheEntityPosition(PacketWrapper wrapper, EntityType type) {
        this.tracker(wrapper.user()).addEntity(((Integer)wrapper.get((Type)Types.VAR_INT, 0)).intValue(), type);
        if (type == EntityTypes1_14.PAINTING) {
            BlockPosition position = (BlockPosition)wrapper.get(Types.BLOCK_POSITION1_8, 0);
            this.positionHandler.cacheEntityPosition(wrapper, (double)position.x(), (double)position.y(), (double)position.z(), true, false);
        } else {
            this.positionHandler.cacheEntityPosition(wrapper, true, false);
        }
    }
}

