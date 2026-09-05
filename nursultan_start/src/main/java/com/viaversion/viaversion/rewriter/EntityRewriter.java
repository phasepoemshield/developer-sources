/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Preconditions
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.ListTag
 *  com.viaversion.nbt.tag.NumberTag
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.data.FullMappings
 *  com.viaversion.viaversion.api.data.Int2IntMapMappings
 *  com.viaversion.viaversion.api.data.Mappings
 *  com.viaversion.viaversion.api.data.entity.DimensionData
 *  com.viaversion.viaversion.api.data.entity.EntityTracker
 *  com.viaversion.viaversion.api.data.entity.TrackedEntity
 *  com.viaversion.viaversion.api.minecraft.GameMode
 *  com.viaversion.viaversion.api.minecraft.Particle
 *  com.viaversion.viaversion.api.minecraft.entities.EntityType
 *  com.viaversion.viaversion.api.minecraft.entitydata.EntityData
 *  com.viaversion.viaversion.api.minecraft.entitydata.EntityDataType
 *  com.viaversion.viaversion.api.minecraft.item.Item
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.rewriter.EntityRewriter
 *  com.viaversion.viaversion.api.rewriter.RewriterBase
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.data.entity.DimensionDataImpl
 *  com.viaversion.viaversion.rewriter.entitydata.EntityDataFilter
 *  com.viaversion.viaversion.rewriter.entitydata.EntityDataFilter$Builder
 *  com.viaversion.viaversion.rewriter.entitydata.EntityDataFilter$DataTypeMapper
 *  com.viaversion.viaversion.rewriter.entitydata.EntityDataHandlerEventImpl
 *  com.viaversion.viaversion.util.Key
 *  com.viaversion.viaversion.util.TagUtil
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package com.viaversion.viaversion.rewriter;

import com.google.common.base.Preconditions;
import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.ListTag;
import com.viaversion.nbt.tag.NumberTag;
import com.viaversion.nbt.tag.Tag;
import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.data.FullMappings;
import com.viaversion.viaversion.api.data.Int2IntMapMappings;
import com.viaversion.viaversion.api.data.Mappings;
import com.viaversion.viaversion.api.data.entity.DimensionData;
import com.viaversion.viaversion.api.data.entity.EntityTracker;
import com.viaversion.viaversion.api.data.entity.TrackedEntity;
import com.viaversion.viaversion.api.minecraft.GameMode;
import com.viaversion.viaversion.api.minecraft.Particle;
import com.viaversion.viaversion.api.minecraft.entities.EntityType;
import com.viaversion.viaversion.api.minecraft.entitydata.EntityData;
import com.viaversion.viaversion.api.minecraft.entitydata.EntityDataType;
import com.viaversion.viaversion.api.minecraft.item.Item;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.rewriter.RewriterBase;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.data.entity.DimensionDataImpl;
import com.viaversion.viaversion.rewriter.entitydata.EntityDataFilter;
import com.viaversion.viaversion.rewriter.entitydata.EntityDataHandlerEventImpl;
import com.viaversion.viaversion.util.Key;
import com.viaversion.viaversion.util.TagUtil;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.stream.Collectors;
import org.checkerframework.checker.nullness.qual.Nullable;

public abstract class EntityRewriter<C extends ClientboundPacketType, T extends Protocol<C, ?, ?, ?>>
extends RewriterBase<T>
implements com.viaversion.viaversion.api.rewriter.EntityRewriter<T> {
    protected final List<EntityDataFilter> entityDataFilters = new ArrayList<EntityDataFilter>();
    protected final boolean trackMappedType;
    protected Mappings typeMappings;

    private void logException(Exception e, @Nullable EntityType type, List<EntityData> entityDataList, EntityData entityData) {
        if (Via.getConfig().logEntityDataErrors()) {
            this.protocol.getLogger().severe("An error occurred in entity data handler " + ((Object)((Object)this)).getClass().getSimpleName() + " for " + (type != null ? type.name() : "untracked") + " entity type: " + String.valueOf(entityData));
            this.protocol.getLogger().severe(entityDataList.stream().sorted(Comparator.comparingInt(EntityData::id)).map(EntityData::toString).collect(Collectors.joining("\n", "Full entity data: ", "")));
            this.protocol.getLogger().log(Level.SEVERE, "Error: ", (Throwable)e);
        }
    }

    protected EntityRewriter(T protocol) {
        this(protocol, true);
    }

    protected EntityRewriter(T protocol, boolean trackMappedType) {
        super(protocol);
        this.trackMappedType = trackMappedType;
        protocol.put((Object)this);
    }

    public EntityDataFilter.Builder filter() {
        return new EntityDataFilter.Builder(this);
    }

    public void registerFilter(EntityDataFilter filter) {
        Preconditions.checkArgument((!this.entityDataFilters.contains(filter) ? 1 : 0) != 0);
        this.entityDataFilters.add(filter);
    }

    public void trackWorldDataByKey1_20_5(UserConnection connection, int dimensionId, String world) {
        EntityTracker tracker = this.tracker(connection);
        DimensionData dimensionData = tracker.dimensionData(dimensionId);
        if (dimensionData == null) {
            this.protocol.getLogger().severe("Dimension data missing for dimension: " + dimensionId + ", falling back to overworld");
            dimensionData = tracker.dimensionData("overworld");
            Preconditions.checkNotNull((Object)dimensionData, (Object)"Overworld data missing");
        }
        tracker.setCurrentDimensionId(dimensionId);
        tracker.setCurrentWorldSectionHeight(dimensionData.height() >> 4);
        tracker.setCurrentMinY(dimensionData.minY());
        this.trackWorld(connection, world);
    }

    public void registerBlockStateHandler(EntityType entityType, int index) {
        this.filter().type(entityType).index(index).handler((event, data) -> {
            int state = (Integer)data.getValue();
            data.setValue((Object)this.protocol.getMappingData().getNewBlockStateId(state));
        });
    }

    public void registerTrackerWithData(C packetType) {
        this.protocol.registerClientbound(packetType, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.map(Types.UUID);
                this.map((Type)Types.VAR_INT);
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.INT);
                this.handler(EntityRewriter.this.trackerHandler());
                this.handler(wrapper -> {
                    int entityId = (Integer)wrapper.get((Type)Types.VAR_INT, 0);
                    EntityType entityType = EntityRewriter.this.tracker(wrapper.user()).entityType(entityId);
                    if (entityType == EntityRewriter.this.typeFromId("falling_block")) {
                        wrapper.set((Type)Types.INT, 0, (Object)EntityRewriter.this.protocol.getMappingData().getNewBlockStateId(((Integer)wrapper.get((Type)Types.INT, 0)).intValue()));
                    }
                });
            }
        });
    }

    public void registerLogin1_20_5(C packetType) {
        this.protocol.registerClientbound(packetType, wrapper -> {
            int entityId = (Integer)wrapper.passthrough((Type)Types.INT);
            wrapper.passthrough((Type)Types.BOOLEAN);
            wrapper.passthrough(Types.STRING_ARRAY);
            wrapper.passthrough((Type)Types.VAR_INT);
            wrapper.passthrough((Type)Types.VAR_INT);
            wrapper.passthrough((Type)Types.VAR_INT);
            wrapper.passthrough((Type)Types.BOOLEAN);
            wrapper.passthrough((Type)Types.BOOLEAN);
            wrapper.passthrough((Type)Types.BOOLEAN);
            int dimensionId = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            String world = (String)wrapper.passthrough(Types.STRING);
            this.trackWorldDataByKey1_20_5(wrapper.user(), dimensionId, world);
            wrapper.passthrough((Type)Types.LONG);
            byte gamemode = (Byte)wrapper.passthrough((Type)Types.BYTE);
            this.tracker(wrapper.user()).setInstaBuild(gamemode == GameMode.CREATIVE.id());
            this.trackPlayer(wrapper.user(), entityId);
        });
    }

    public void registerRemoveEntities(C packetType) {
        this.protocol.registerClientbound(packetType, wrapper -> {
            int[] entityIds = (int[])wrapper.passthrough(Types.VAR_INT_ARRAY_PRIMITIVE);
            EntityTracker entityTracker = this.tracker(wrapper.user());
            for (int entity : entityIds) {
                entityTracker.removeEntity(entity);
            }
        });
    }

    public void registerRespawn1_20_5(C packetType) {
        this.protocol.registerClientbound(packetType, wrapper -> {
            int dimensionId = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            String world = (String)wrapper.passthrough(Types.STRING);
            this.trackWorldDataByKey1_20_5(wrapper.user(), dimensionId, world);
            wrapper.passthrough((Type)Types.LONG);
            byte gamemode = (Byte)wrapper.passthrough((Type)Types.BYTE);
            this.tracker(wrapper.user()).setInstaBuild(gamemode == GameMode.CREATIVE.id());
        });
    }

    public String mappedEntityIdentifier(String identifier) {
        FullMappings fullMappings;
        String mappedIdentifier;
        Mappings mappings = this.typeMappings;
        if (mappings instanceof FullMappings && (mappedIdentifier = (fullMappings = (FullMappings)mappings).mappedIdentifier(identifier)) != null) {
            return mappedIdentifier;
        }
        return identifier;
    }

    public void registerSetEntityData(C packetType, Type<List<EntityData>> dataType) {
        this.registerSetEntityData(packetType, null, dataType);
    }

    public void registerSetEntityData(C packetType, @Nullable Type<List<EntityData>> dataType, Type<List<EntityData>> mappedDataType) {
        this.protocol.registerClientbound(packetType, wrapper -> {
            List entityData;
            int entityId = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            if (dataType != null) {
                entityData = (List)wrapper.read(dataType);
                wrapper.write(mappedDataType, (Object)entityData);
            } else {
                entityData = (List)wrapper.passthrough(mappedDataType);
            }
            this.handleEntityData(entityId, entityData, wrapper.user());
        });
    }

    public void registerSetEntityData(C packetType) {
        this.registerSetEntityData(packetType, (Type<List<EntityData>>)this.protocol.types().entityDataList(), (Type<List<EntityData>>)this.protocol.mappedTypes().entityDataList());
    }

    public void registerPlayerAbilities(C packetType) {
        this.protocol.registerClientbound(packetType, wrapper -> {
            byte flags = (Byte)wrapper.passthrough((Type)Types.BYTE);
            this.tracker(wrapper.user()).setInstaBuild((flags & 8) != 0);
        });
    }

    public PacketHandler trackerAndRewriterHandler(@Nullable Type<List<EntityData>> dataType, EntityType entityType) {
        return wrapper -> {
            int entityId = (Integer)wrapper.get((Type)Types.VAR_INT, 0);
            this.tracker(wrapper.user()).addEntity(entityId, entityType);
            if (dataType != null) {
                this.handleEntityData(entityId, (List)wrapper.get(dataType, 0), wrapper.user());
            }
        };
    }

    public PacketHandler trackerAndRewriterHandler(@Nullable Type<List<EntityData>> dataType) {
        return wrapper -> {
            int entityId = (Integer)wrapper.get((Type)Types.VAR_INT, 0);
            int type = (Integer)wrapper.get((Type)Types.VAR_INT, 1);
            this.trackAndRewrite(wrapper, type, entityId);
            if (dataType != null) {
                this.handleEntityData(entityId, (List)wrapper.get(dataType, 0), wrapper.user());
            }
        };
    }

    public PacketHandler objectTrackerHandler() {
        return wrapper -> {
            int data;
            int entityId = (Integer)wrapper.get((Type)Types.VAR_INT, 0);
            byte type = (Byte)wrapper.get((Type)Types.BYTE, 0);
            EntityType entType = this.objectTypeFromId(type, data = ((Integer)wrapper.get((Type)Types.INT, 0)).intValue());
            if (entType == null) {
                return;
            }
            this.tracker(wrapper.user()).addEntity(entityId, entType);
        };
    }

    public PacketHandler dimensionDataHandler() {
        return wrapper -> this.cacheDimensionData(wrapper.user(), (CompoundTag)wrapper.get(Types.NAMED_COMPOUND_TAG, 0));
    }

    public PacketHandler worldDataTrackerHandler(int nbtIndex) {
        return wrapper -> {
            EntityTracker tracker = this.tracker(wrapper.user());
            CompoundTag registryData = (CompoundTag)wrapper.get(Types.NAMED_COMPOUND_TAG, nbtIndex);
            NumberTag height = registryData.getNumberTag("height");
            if (height != null) {
                int blockHeight = height.asInt();
                tracker.setCurrentWorldSectionHeight(blockHeight >> 4);
            } else {
                this.protocol.getLogger().warning("Height missing in dimension data: " + String.valueOf(registryData));
            }
            NumberTag minY = registryData.getNumberTag("min_y");
            if (minY != null) {
                tracker.setCurrentMinY(minY.asInt());
            } else {
                this.protocol.getLogger().warning("Min Y missing in dimension data: " + String.valueOf(registryData));
            }
            String world = (String)wrapper.get(Types.STRING, 0);
            this.trackWorld(wrapper.user(), world);
        };
    }

    public PacketHandler playerTrackerHandler() {
        return wrapper -> this.trackPlayer(wrapper.user(), (Integer)wrapper.get((Type)Types.INT, 0));
    }

    public void onMappingDataLoaded() {
        if (this.protocol.getMappingData() != null && !Mappings.isFullIdentity((Mappings)this.protocol.getMappingData().getEntityMappings())) {
            this.mapTypes();
        }
    }

    public void trackPlayer(UserConnection connection, int entityId) {
        EntityTracker tracker = this.tracker(connection);
        tracker.setClientEntityId(entityId);
        tracker.addEntity(entityId, tracker.playerType());
    }

    public EntityDataFilter.DataTypeMapper dataTypeMapper() {
        Preconditions.checkNotNull((Object)this.protocol.mappedTypes(), (Object)"Protocol does not override mappedTypes, use filter().mapDataType instead");
        return new EntityDataFilter.DataTypeMapper(this);
    }

    public void mapEntityType(EntityType type, EntityType mappedType) {
        Preconditions.checkArgument((type.getClass() != mappedType.getClass() ? 1 : 0) != 0, (Object)"EntityTypes should not be of the same class/enum");
        this.mapEntityType(type.getId(), mappedType.getId());
    }

    protected void mapEntityType(int id, int mappedId) {
        if (this.typeMappings == null) {
            this.typeMappings = Int2IntMapMappings.of();
        }
        this.typeMappings.setNewId(id, mappedId);
    }

    public PacketHandler trackerHandler() {
        return this.trackerAndRewriterHandler(null);
    }

    public @Nullable Mappings typeMappings() {
        return this.typeMappings;
    }

    public void registerGameEvent(C packetType) {
        this.protocol.registerClientbound(packetType, wrapper -> {
            short event = (Short)wrapper.passthrough((Type)Types.UNSIGNED_BYTE);
            if (event == 3) {
                int value = (int)Math.floor(((Float)wrapper.passthrough((Type)Types.FLOAT)).floatValue() + 0.5f);
                this.tracker(wrapper.user()).setInstaBuild(value == GameMode.CREATIVE.id());
            }
        });
    }

    public void handleEntityData(int entityId, List<EntityData> dataList, UserConnection connection) {
        TrackedEntity entity = this.tracker(connection).entity(entityId);
        EntityType type = entity != null ? entity.entityType() : null;
        int size = dataList.size();
        for (int i = 0; i < size; ++i) {
            EntityData entityData = dataList.get(i);
            EntityDataHandlerEventImpl event = null;
            for (EntityDataFilter filter : this.entityDataFilters) {
                if (!filter.isFiltered(type, entityData)) continue;
                if (event == null) {
                    event = new EntityDataHandlerEventImpl(connection, entity, entityId, entityData, dataList);
                }
                try {
                    filter.handler().handle(event, entityData);
                }
                catch (Exception e) {
                    this.logException(e, type, dataList, entityData);
                    dataList.remove(i--);
                    --size;
                    break;
                }
                if (!event.cancelled()) continue;
                dataList.remove(i--);
                --size;
                break;
            }
            if (event == null || !event.hasExtraData()) continue;
            dataList.addAll(event.extraData());
        }
        if (entity != null) {
            entity.sentEntityData(true);
        }
    }

    public void registerTracker(C packetType, EntityType entityType) {
        this.registerTracker(packetType, entityType, (Type<Integer>)Types.VAR_INT);
    }

    public void registerTracker(C packetType) {
        this.protocol.registerClientbound(packetType, wrapper -> {
            wrapper.passthrough((Type)Types.VAR_INT);
            wrapper.passthrough(Types.UUID);
            wrapper.passthrough((Type)Types.VAR_INT);
            this.trackerHandler().handle(wrapper);
        });
    }

    public void registerTracker(C packetType, EntityType entityType, Type<Integer> intType) {
        this.protocol.registerClientbound(packetType, wrapper -> {
            int entityId = (Integer)wrapper.passthrough(intType);
            this.tracker(wrapper.user()).addEntity(entityId, entityType);
        });
    }

    public int newEntityId(int id) {
        return this.typeMappings != null ? this.typeMappings.getNewIdOrDefault(id, id) : id;
    }

    public EntityType trackAndRewrite(PacketWrapper wrapper, int typeId, int entityId) {
        EntityType entityType;
        int mappedTypeId = this.newEntityId(typeId);
        if (mappedTypeId != typeId) {
            wrapper.set((Type)Types.VAR_INT, 1, (Object)mappedTypeId);
        }
        if ((entityType = this.typeFromId(this.trackMappedType ? mappedTypeId : typeId)) == null) {
            return null;
        }
        this.tracker(wrapper.user()).addEntity(entityId, entityType);
        return entityType;
    }

    public void trackBiomeSize(UserConnection connection, CompoundTag registry) {
        ListTag biomes = TagUtil.getRegistryEntries((CompoundTag)registry, (String)"worldgen/biome");
        this.tracker(connection).setBiomesSent(biomes.size());
    }

    public void cacheDimensionData(UserConnection connection, CompoundTag registry) {
        ListTag dimensions = TagUtil.getRegistryEntries((CompoundTag)registry, (String)"dimension_type");
        HashMap<String, DimensionDataImpl> dimensionDataMap = new HashMap<String, DimensionDataImpl>(dimensions.size());
        for (CompoundTag dimension : dimensions) {
            NumberTag idTag = dimension.getNumberTag("id");
            CompoundTag element = dimension.getCompoundTag("element");
            String name = dimension.getStringTag("name").getValue();
            dimensionDataMap.put(Key.stripMinecraftNamespace((String)name), new DimensionDataImpl(idTag.asInt(), element));
        }
        this.tracker(connection).setDimensions(dimensionDataMap);
    }

    public PacketHandler biomeSizeTracker() {
        return wrapper -> this.trackBiomeSize(wrapper.user(), (CompoundTag)wrapper.get(Types.NAMED_COMPOUND_TAG, 0));
    }

    public @Nullable EntityType typeFromId(String type) {
        FullMappings mappings = this.protocol().getMappingData().getEntityMappings();
        int id = this.trackMappedType ? mappings.mappedId(type) : mappings.id(type);
        return id == -1 ? null : this.typeFromId(id);
    }

    public void mapTypes() {
        Preconditions.checkArgument((this.typeMappings == null ? 1 : 0) != 0, (Object)"Type mappings have already been set - manual type mappings should be set *after* this");
        Preconditions.checkNotNull((Object)this.protocol.getMappingData().getEntityMappings(), (Object)"Protocol does not have entity mappings");
        this.typeMappings = this.protocol.getMappingData().getEntityMappings();
    }

    public void trackWorld(UserConnection connection, String world) {
        EntityTracker tracker = this.tracker(connection);
        if (tracker.currentWorld() != null && !tracker.currentWorld().equals(world)) {
            tracker.clearEntities();
        }
        tracker.setCurrentWorld(world);
    }

    public void registerEntityDataTypeHandler(@Nullable EntityDataType itemType, @Nullable EntityDataType blockStateType, @Nullable EntityDataType optionalBlockStateType, @Nullable EntityDataType particleType, @Nullable EntityDataType particlesType, @Nullable EntityDataType componentType, @Nullable EntityDataType optionalComponentType) {
        this.filter().handler((event, data) -> {
            EntityDataType type = data.dataType();
            if (type == itemType) {
                data.setValue((Object)this.protocol.getItemRewriter().handleItemToClient(event.user(), (Item)data.value()));
            } else if (type == blockStateType) {
                int value = (Integer)data.value();
                data.setValue((Object)this.protocol.getMappingData().getNewBlockStateId(value));
            } else if (type == optionalBlockStateType) {
                int value = (Integer)data.value();
                if (value != 0) {
                    data.setValue((Object)this.protocol.getMappingData().getNewBlockStateId(value));
                }
            } else if (type == particleType) {
                this.protocol.getParticleRewriter().rewriteParticle(event.user(), (Particle)data.value());
            } else if (type == particlesType) {
                Particle[] particles;
                for (Particle particle : particles = (Particle[])data.value()) {
                    this.protocol.getParticleRewriter().rewriteParticle(event.user(), particle);
                }
            } else if ((type == componentType || type == optionalComponentType) && this.protocol.getComponentRewriter() != null) {
                Tag component = (Tag)data.value();
                this.protocol.getComponentRewriter().processTag(event.user(), component);
            }
        });
    }

    public void registerEntityDataTypeHandler(@Nullable EntityDataType itemType, @Nullable EntityDataType blockStateType, @Nullable EntityDataType optionalBlockStateType, @Nullable EntityDataType particleType, @Nullable EntityDataType particlesType) {
        this.registerEntityDataTypeHandler(itemType, blockStateType, optionalBlockStateType, particleType, particlesType, null, null);
    }

    public void registerEntityDataTypeHandler(@Nullable EntityDataType itemType, @Nullable EntityDataType blockStateType, @Nullable EntityDataType particleType) {
        this.registerEntityDataTypeHandler(itemType, null, blockStateType, particleType, null);
    }

    public void registerTrackerWithData1_19(C packetType) {
        this.protocol.registerClientbound(packetType, wrapper -> {
            int entityId = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            wrapper.passthrough(Types.UUID);
            int entityTypeId = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            wrapper.passthrough((Type)Types.DOUBLE);
            wrapper.passthrough((Type)Types.DOUBLE);
            wrapper.passthrough((Type)Types.DOUBLE);
            wrapper.passthrough((Type)Types.BYTE);
            wrapper.passthrough((Type)Types.BYTE);
            wrapper.passthrough((Type)Types.BYTE);
            int data = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            EntityType entityType = this.trackAndRewrite(wrapper, entityTypeId, entityId);
            if (this.protocol.getMappingData() != null && entityType == this.typeFromId("falling_block")) {
                int mappedBlockStateId = this.protocol.getMappingData().getNewBlockStateId(data);
                wrapper.set((Type)Types.VAR_INT, 2, (Object)mappedBlockStateId);
            }
        });
    }

    public PacketHandler worldDataTrackerHandlerByKey1_20_5(int dimensionIdIndex) {
        return wrapper -> {
            int dimensionId = (Integer)wrapper.get((Type)Types.VAR_INT, dimensionIdIndex);
            String world = (String)wrapper.get(Types.STRING, 0);
            this.trackWorldDataByKey1_20_5(wrapper.user(), dimensionId, world);
        };
    }

    public PacketHandler configurationDimensionDataHandler() {
        return wrapper -> this.cacheDimensionData(wrapper.user(), (CompoundTag)wrapper.get(Types.COMPOUND_TAG, 0));
    }

    public void registerTrackerWithData1_21_9(C packetType) {
        this.protocol.registerClientbound(packetType, wrapper -> {
            int entityId = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            wrapper.passthrough(Types.UUID);
            int entityTypeId = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            wrapper.passthrough((Type)Types.DOUBLE);
            wrapper.passthrough((Type)Types.DOUBLE);
            wrapper.passthrough((Type)Types.DOUBLE);
            wrapper.passthrough(Types.LOW_PRECISION_VECTOR);
            wrapper.passthrough((Type)Types.BYTE);
            wrapper.passthrough((Type)Types.BYTE);
            wrapper.passthrough((Type)Types.BYTE);
            int data = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            EntityType entityType = this.trackAndRewrite(wrapper, entityTypeId, entityId);
            if (this.protocol.getMappingData() != null && entityType == this.typeFromId("falling_block")) {
                int mappedBlockStateId = this.protocol.getMappingData().getNewBlockStateId(data);
                wrapper.set((Type)Types.VAR_INT, 2, (Object)mappedBlockStateId);
            }
        });
    }

    public PacketHandler configurationBiomeSizeTracker() {
        return wrapper -> this.trackBiomeSize(wrapper.user(), (CompoundTag)wrapper.get(Types.COMPOUND_TAG, 0));
    }

    public PacketHandler worldDataTrackerHandlerByKey() {
        return wrapper -> {
            String dimensionKey;
            EntityTracker tracker = this.tracker(wrapper.user());
            DimensionData dimensionData = tracker.dimensionData(dimensionKey = (String)wrapper.get(Types.STRING, 0));
            if (dimensionData == null) {
                this.protocol.getLogger().severe("Dimension data missing for dimension: " + dimensionKey + ", falling back to overworld");
                dimensionData = tracker.dimensionData("minecraft:overworld");
                Preconditions.checkNotNull((Object)dimensionData, (Object)"Overworld data missing");
            }
            tracker.setCurrentWorldSectionHeight(dimensionData.height() >> 4);
            tracker.setCurrentMinY(dimensionData.minY());
            String world = (String)wrapper.get(Types.STRING, 1);
            this.trackWorld(wrapper.user(), world);
        };
    }
}

