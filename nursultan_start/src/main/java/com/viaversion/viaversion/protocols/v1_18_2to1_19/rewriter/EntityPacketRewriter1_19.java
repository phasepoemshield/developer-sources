/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.IntTag
 *  com.viaversion.nbt.tag.ListTag
 *  com.viaversion.nbt.tag.NumberTag
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.data.ParticleMappings
 *  com.viaversion.viaversion.api.minecraft.BlockPosition
 *  com.viaversion.viaversion.api.minecraft.Particle
 *  com.viaversion.viaversion.api.minecraft.Particle$ParticleData
 *  com.viaversion.viaversion.api.minecraft.entities.EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_19
 *  com.viaversion.viaversion.api.minecraft.entitydata.EntityData
 *  com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes1_19
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.version.Types1_18
 *  com.viaversion.viaversion.api.type.types.version.Types1_19
 *  com.viaversion.viaversion.data.entity.DimensionDataImpl
 *  com.viaversion.viaversion.protocols.v1_18_2to1_19.storage.DimensionRegistryStorage
 *  com.viaversion.viaversion.rewriter.EntityRewriter
 *  com.viaversion.viaversion.util.Key
 *  com.viaversion.viaversion.util.Pair
 *  com.viaversion.viaversion.util.TagUtil
 */
package com.viaversion.viaversion.protocols.v1_18_2to1_19.rewriter;

import com.google.common.collect.Maps;
import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.IntTag;
import com.viaversion.nbt.tag.ListTag;
import com.viaversion.nbt.tag.NumberTag;
import com.viaversion.nbt.tag.Tag;
import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.data.ParticleMappings;
import com.viaversion.viaversion.api.minecraft.BlockPosition;
import com.viaversion.viaversion.api.minecraft.Particle;
import com.viaversion.viaversion.api.minecraft.entities.EntityType;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_19;
import com.viaversion.viaversion.api.minecraft.entitydata.EntityData;
import com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes1_19;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.version.Types1_18;
import com.viaversion.viaversion.api.type.types.version.Types1_19;
import com.viaversion.viaversion.data.entity.DimensionDataImpl;
import com.viaversion.viaversion.protocols.v1_17_1to1_18.packet.ClientboundPackets1_18;
import com.viaversion.viaversion.protocols.v1_18_2to1_19.Protocol1_18_2To1_19;
import com.viaversion.viaversion.protocols.v1_18_2to1_19.packet.ClientboundPackets1_19;
import com.viaversion.viaversion.protocols.v1_18_2to1_19.storage.DimensionRegistryStorage;
import com.viaversion.viaversion.rewriter.EntityRewriter;
import com.viaversion.viaversion.util.Key;
import com.viaversion.viaversion.util.Pair;
import com.viaversion.viaversion.util.TagUtil;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public final class EntityPacketRewriter1_19
extends EntityRewriter<ClientboundPackets1_18, Protocol1_18_2To1_19> {
    public EntityPacketRewriter1_19(Protocol1_18_2To1_19 protocol) {
        super((Protocol)protocol);
    }

    protected void registerRewrites() {
        this.filter().mapDataType(arg_0 -> ((EntityDataTypes1_19)Types1_19.ENTITY_DATA_TYPES).byId(arg_0));
        this.filter().dataType(Types1_19.ENTITY_DATA_TYPES.particleType).handler((event, data) -> {
            Particle particle = (Particle)data.getValue();
            ParticleMappings particleMappings = ((Protocol1_18_2To1_19)this.protocol).getMappingData().getParticleMappings();
            if (particle.id() == particleMappings.id("vibration")) {
                particle.getArguments().remove(0);
                String resourceLocation = Key.stripMinecraftNamespace((String)((String)particle.getArgument(0).getValue()));
                if (resourceLocation.equals("entity")) {
                    particle.getArguments().add(2, new Particle.ParticleData((Type)Types.FLOAT, (Object)Float.valueOf(0.0f)));
                }
            }
            ((Protocol1_18_2To1_19)this.protocol).getParticleRewriter().rewriteParticle(event.user(), particle);
        });
        this.registerEntityDataTypeHandler(Types1_19.ENTITY_DATA_TYPES.itemType, Types1_19.ENTITY_DATA_TYPES.optionalBlockStateType, null);
        this.registerBlockStateHandler((EntityType)EntityTypes1_19.ABSTRACT_MINECART, 11);
        this.filter().type((EntityType)EntityTypes1_19.CAT).index(19).mapDataType(typeId -> Types1_19.ENTITY_DATA_TYPES.catVariantType);
    }

    public void registerPackets() {
        this.registerTracker(ClientboundPackets1_18.ADD_PLAYER, (EntityType)EntityTypes1_19.PLAYER);
        this.registerSetEntityData(ClientboundPackets1_18.SET_ENTITY_DATA, Types1_18.ENTITY_DATA_LIST, Types1_19.ENTITY_DATA_LIST);
        ((Protocol1_18_2To1_19)this.protocol).replaceClientbound(ClientboundPackets1_18.ADD_ENTITY, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.map(Types.UUID);
                this.map((Type)Types.VAR_INT);
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.BYTE);
                this.handler(wrapper -> {
                    byte yaw = (Byte)wrapper.get((Type)Types.BYTE, 1);
                    wrapper.write((Type)Types.BYTE, (Object)yaw);
                });
                this.map((Type)Types.INT, (Type)Types.VAR_INT);
                this.handler(EntityPacketRewriter1_19.this.trackerHandler());
                this.handler(wrapper -> {
                    int entityId = (Integer)wrapper.get((Type)Types.VAR_INT, 0);
                    EntityType entityType = EntityPacketRewriter1_19.this.tracker(wrapper.user()).entityType(entityId);
                    if (entityType == EntityTypes1_19.FALLING_BLOCK) {
                        wrapper.set((Type)Types.VAR_INT, 2, (Object)((Protocol1_18_2To1_19)EntityPacketRewriter1_19.this.protocol).getMappingData().getNewBlockStateId((Integer)wrapper.get((Type)Types.VAR_INT, 2)));
                    }
                });
            }
        });
        ((Protocol1_18_2To1_19)this.protocol).registerClientbound(ClientboundPackets1_18.ADD_PAINTING, ClientboundPackets1_19.ADD_ENTITY, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.map(Types.UUID);
                this.handler(wrapper -> {
                    wrapper.write((Type)Types.VAR_INT, (Object)EntityTypes1_19.PAINTING.getId());
                    int motive = (Integer)wrapper.read((Type)Types.VAR_INT);
                    BlockPosition blockPosition = (BlockPosition)wrapper.read(Types.BLOCK_POSITION1_14);
                    byte direction = (Byte)wrapper.read((Type)Types.BYTE);
                    wrapper.write((Type)Types.DOUBLE, (Object)((double)blockPosition.x() + 0.5));
                    wrapper.write((Type)Types.DOUBLE, (Object)((double)blockPosition.y() + 0.5));
                    wrapper.write((Type)Types.DOUBLE, (Object)((double)blockPosition.z() + 0.5));
                    wrapper.write((Type)Types.BYTE, (Object)0);
                    wrapper.write((Type)Types.BYTE, (Object)0);
                    wrapper.write((Type)Types.BYTE, (Object)0);
                    wrapper.write((Type)Types.VAR_INT, (Object)EntityPacketRewriter1_19.this.to3dId(direction));
                    wrapper.write((Type)Types.SHORT, (Object)0);
                    wrapper.write((Type)Types.SHORT, (Object)0);
                    wrapper.write((Type)Types.SHORT, (Object)0);
                    wrapper.send(Protocol1_18_2To1_19.class);
                    wrapper.cancel();
                    PacketWrapper entityDataPacket = wrapper.create((PacketType)ClientboundPackets1_19.SET_ENTITY_DATA);
                    entityDataPacket.write((Type)Types.VAR_INT, (Object)((Integer)wrapper.get((Type)Types.VAR_INT, 0)));
                    ArrayList<EntityData> entityData = new ArrayList<EntityData>();
                    entityData.add(new EntityData(8, Types1_19.ENTITY_DATA_TYPES.paintingVariantType, (Object)((Protocol1_18_2To1_19)EntityPacketRewriter1_19.this.protocol).getMappingData().getPaintingMappings().getNewIdOrDefault(motive, 0)));
                    entityDataPacket.write(Types1_19.ENTITY_DATA_LIST, entityData);
                    entityDataPacket.send(Protocol1_18_2To1_19.class);
                });
            }
        });
        ((Protocol1_18_2To1_19)this.protocol).registerClientbound(ClientboundPackets1_18.ADD_MOB, ClientboundPackets1_19.ADD_ENTITY, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.map(Types.UUID);
                this.map((Type)Types.VAR_INT);
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.DOUBLE);
                this.handler(wrapper -> {
                    byte yaw = (Byte)wrapper.read((Type)Types.BYTE);
                    byte pitch = (Byte)wrapper.read((Type)Types.BYTE);
                    wrapper.write((Type)Types.BYTE, (Object)pitch);
                    wrapper.write((Type)Types.BYTE, (Object)yaw);
                });
                this.map((Type)Types.BYTE);
                this.create((Type)Types.VAR_INT, 0);
                this.map((Type)Types.SHORT);
                this.map((Type)Types.SHORT);
                this.map((Type)Types.SHORT);
                this.handler(EntityPacketRewriter1_19.this.trackerHandler());
            }
        });
        ((Protocol1_18_2To1_19)this.protocol).registerClientbound(ClientboundPackets1_18.UPDATE_MOB_EFFECT, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.map((Type)Types.VAR_INT);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.VAR_INT);
                this.map((Type)Types.BYTE);
                this.create(Types.OPTIONAL_NAMED_COMPOUND_TAG, null);
            }
        });
        ((Protocol1_18_2To1_19)this.protocol).registerClientbound(ClientboundPackets1_18.LOGIN, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT);
                this.map((Type)Types.BOOLEAN);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.BYTE);
                this.map(Types.STRING_ARRAY);
                this.map(Types.NAMED_COMPOUND_TAG);
                this.handler(wrapper -> {
                    CompoundTag tag = (CompoundTag)wrapper.get(Types.NAMED_COMPOUND_TAG, 0);
                    tag.put("minecraft:chat_type", (Tag)((Protocol1_18_2To1_19)EntityPacketRewriter1_19.this.protocol).getMappingData().chatRegistry());
                    ListTag dimensions = TagUtil.getRegistryEntries((CompoundTag)tag, (String)"dimension_type");
                    HashMap<String, DimensionDataImpl> dimensionDataMap = new HashMap<String, DimensionDataImpl>(dimensions.size());
                    HashMap<CompoundTag, String> dimensionsMap = new HashMap<CompoundTag, String>(dimensions.size());
                    for (CompoundTag dimension : dimensions) {
                        NumberTag idTag = dimension.getNumberTag("id");
                        CompoundTag element = dimension.getCompoundTag("element");
                        String name = dimension.getStringTag("name").getValue();
                        EntityPacketRewriter1_19.this.addMonsterSpawnData(element);
                        dimensionDataMap.put(Key.stripMinecraftNamespace((String)name), new DimensionDataImpl(idTag.asInt(), element));
                        dimensionsMap.put(element.copy(), name);
                    }
                    EntityPacketRewriter1_19.this.tracker(wrapper.user()).setDimensions(dimensionDataMap);
                    DimensionRegistryStorage registryStorage = (DimensionRegistryStorage)wrapper.user().get(DimensionRegistryStorage.class);
                    registryStorage.setDimensions(dimensionsMap);
                    EntityPacketRewriter1_19.this.writeDimensionKey(wrapper, registryStorage);
                });
                this.map(Types.STRING);
                this.map((Type)Types.LONG);
                this.map((Type)Types.VAR_INT);
                this.map((Type)Types.VAR_INT);
                this.map((Type)Types.VAR_INT);
                this.map((Type)Types.BOOLEAN);
                this.map((Type)Types.BOOLEAN);
                this.map((Type)Types.BOOLEAN);
                this.map((Type)Types.BOOLEAN);
                this.create(Types.OPTIONAL_GLOBAL_POSITION, null);
                this.handler(EntityPacketRewriter1_19.this.playerTrackerHandler());
                this.handler(EntityPacketRewriter1_19.this.worldDataTrackerHandlerByKey());
                this.handler(EntityPacketRewriter1_19.this.biomeSizeTracker());
                this.handler(wrapper -> {
                    PacketWrapper displayPreviewPacket = wrapper.create((PacketType)ClientboundPackets1_19.SET_DISPLAY_CHAT_PREVIEW);
                    displayPreviewPacket.write((Type)Types.BOOLEAN, (Object)false);
                    displayPreviewPacket.scheduleSend(Protocol1_18_2To1_19.class);
                });
            }
        });
        ((Protocol1_18_2To1_19)this.protocol).registerClientbound(ClientboundPackets1_18.RESPAWN, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.handler(wrapper -> EntityPacketRewriter1_19.this.writeDimensionKey(wrapper, (DimensionRegistryStorage)wrapper.user().get(DimensionRegistryStorage.class)));
                this.map(Types.STRING);
                this.map((Type)Types.LONG);
                this.map((Type)Types.UNSIGNED_BYTE);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.BOOLEAN);
                this.map((Type)Types.BOOLEAN);
                this.map((Type)Types.BOOLEAN);
                this.create(Types.OPTIONAL_GLOBAL_POSITION, null);
                this.handler(EntityPacketRewriter1_19.this.worldDataTrackerHandlerByKey());
            }
        });
    }

    public EntityType typeFromId(int type) {
        return EntityTypes1_19.getTypeFromId((int)type);
    }

    private int to3dId(int id) {
        return switch (id) {
            case -1 -> 1;
            case 2 -> 2;
            case 0 -> 3;
            case 1 -> 4;
            case 3 -> 5;
            default -> throw new IllegalArgumentException("Unknown 2d id: " + id);
        };
    }

    private void addMonsterSpawnData(CompoundTag dimension) {
        dimension.put("monster_spawn_block_light_limit", (Tag)new IntTag(0));
        dimension.put("monster_spawn_light_level", (Tag)new IntTag(11));
    }

    private void writeDimensionKey(PacketWrapper wrapper, DimensionRegistryStorage registryStorage) {
        CompoundTag currentDimension = (CompoundTag)wrapper.read(Types.NAMED_COMPOUND_TAG);
        this.addMonsterSpawnData(currentDimension);
        String dimensionKey = registryStorage.dimensionKey(currentDimension);
        if (dimensionKey == null) {
            if (Via.getConfig().logOtherConversionWarnings()) {
                ((Protocol1_18_2To1_19)this.protocol).getLogger().warning("The server tried to send dimension data from a dimension the client wasn't told about on join. Plugins and mods have to make sure they are not creating new dimension types while players are online, and proxies need to make sure they don't scramble dimension data. Received dimension: " + String.valueOf(currentDimension) + ". Known dimensions: " + String.valueOf(registryStorage.dimensions()));
            }
            dimensionKey = (String)((Map.Entry)registryStorage.dimensions().entrySet().stream().map(it -> new Pair(it, (Object)Maps.difference((Map)currentDimension.getValue(), (Map)((CompoundTag)it.getKey()).getValue()).entriesInCommon())).filter(it -> ((Map)it.value()).containsKey("min_y") && ((Map)it.value()).containsKey("height")).max(Comparator.comparingInt(it -> ((Map)it.value()).size())).orElseThrow(() -> new IllegalArgumentException("Dimension not found in registry data from join packet: " + String.valueOf(currentDimension))).key()).getValue();
        }
        wrapper.write(Types.STRING, (Object)dimensionKey);
    }
}

