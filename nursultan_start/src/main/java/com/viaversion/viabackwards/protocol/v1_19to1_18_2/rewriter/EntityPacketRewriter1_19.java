/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.ListTag
 *  com.viaversion.nbt.tag.NumberTag
 *  com.viaversion.viabackwards.ViaBackwards
 *  com.viaversion.viabackwards.api.BackwardsProtocol
 *  com.viaversion.viabackwards.api.rewriters.EntityRewriter
 *  com.viaversion.viabackwards.protocol.v1_19to1_18_2.storage.DimensionRegistryStorage
 *  com.viaversion.viabackwards.protocol.v1_19to1_18_2.storage.EntityTracker1_19
 *  com.viaversion.viabackwards.protocol.v1_19to1_18_2.storage.LastDeathPosition
 *  com.viaversion.viabackwards.protocol.v1_19to1_18_2.storage.StoredPainting
 *  com.viaversion.viaversion.api.connection.StorableObject
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.data.ParticleMappings
 *  com.viaversion.viaversion.api.data.entity.StoredEntityData
 *  com.viaversion.viaversion.api.minecraft.BlockPosition
 *  com.viaversion.viaversion.api.minecraft.GlobalBlockPosition
 *  com.viaversion.viaversion.api.minecraft.Particle
 *  com.viaversion.viaversion.api.minecraft.entities.EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_19
 *  com.viaversion.viaversion.api.minecraft.entitydata.EntityDataType
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.version.Types1_18
 *  com.viaversion.viaversion.api.type.types.version.Types1_19
 *  com.viaversion.viaversion.libs.fastutil.ints.IntOpenHashSet
 *  com.viaversion.viaversion.libs.fastutil.ints.IntSet
 *  com.viaversion.viaversion.protocols.v1_17_1to1_18.packet.ClientboundPackets1_18
 *  com.viaversion.viaversion.protocols.v1_18_2to1_19.packet.ClientboundPackets1_19
 *  com.viaversion.viaversion.util.Key
 *  com.viaversion.viaversion.util.TagUtil
 */
package com.viaversion.viabackwards.protocol.v1_19to1_18_2.rewriter;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.ListTag;
import com.viaversion.nbt.tag.NumberTag;
import com.viaversion.viabackwards.ViaBackwards;
import com.viaversion.viabackwards.api.BackwardsProtocol;
import com.viaversion.viabackwards.api.rewriters.EntityRewriter;
import com.viaversion.viabackwards.protocol.v1_19to1_18_2.Protocol1_19To1_18_2;
import com.viaversion.viabackwards.protocol.v1_19to1_18_2.storage.DimensionRegistryStorage;
import com.viaversion.viabackwards.protocol.v1_19to1_18_2.storage.EntityTracker1_19;
import com.viaversion.viabackwards.protocol.v1_19to1_18_2.storage.LastDeathPosition;
import com.viaversion.viabackwards.protocol.v1_19to1_18_2.storage.StoredPainting;
import com.viaversion.viaversion.api.connection.StorableObject;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.data.ParticleMappings;
import com.viaversion.viaversion.api.data.entity.StoredEntityData;
import com.viaversion.viaversion.api.minecraft.BlockPosition;
import com.viaversion.viaversion.api.minecraft.GlobalBlockPosition;
import com.viaversion.viaversion.api.minecraft.Particle;
import com.viaversion.viaversion.api.minecraft.entities.EntityType;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_19;
import com.viaversion.viaversion.api.minecraft.entitydata.EntityDataType;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.version.Types1_18;
import com.viaversion.viaversion.api.type.types.version.Types1_19;
import com.viaversion.viaversion.libs.fastutil.ints.IntOpenHashSet;
import com.viaversion.viaversion.libs.fastutil.ints.IntSet;
import com.viaversion.viaversion.protocols.v1_17_1to1_18.packet.ClientboundPackets1_18;
import com.viaversion.viaversion.protocols.v1_18_2to1_19.packet.ClientboundPackets1_19;
import com.viaversion.viaversion.util.Key;
import com.viaversion.viaversion.util.TagUtil;
import java.util.UUID;

public final class EntityPacketRewriter1_19
extends EntityRewriter<ClientboundPackets1_19, Protocol1_19To1_18_2> {
    private static final IntSet WIDE_PAINTINGS = IntOpenHashSet.of((int[])new int[]{7, 8, 9, 10, 11, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25});

    public EntityPacketRewriter1_19(Protocol1_19To1_18_2 protocol) {
        super((BackwardsProtocol)protocol);
    }

    public void onMappingDataLoaded() {
        super.onMappingDataLoaded();
        this.mapEntityTypeWithData((EntityType)EntityTypes1_19.FROG, (EntityType)EntityTypes1_19.RABBIT).jsonName();
        this.mapEntityTypeWithData((EntityType)EntityTypes1_19.TADPOLE, (EntityType)EntityTypes1_19.PUFFERFISH).jsonName();
        this.mapEntityTypeWithData((EntityType)EntityTypes1_19.CHEST_BOAT, (EntityType)EntityTypes1_19.BOAT);
        this.mapEntityTypeWithData((EntityType)EntityTypes1_19.WARDEN, (EntityType)EntityTypes1_19.IRON_GOLEM).jsonName();
        this.mapEntityTypeWithData((EntityType)EntityTypes1_19.ALLAY, (EntityType)EntityTypes1_19.VEX).jsonName();
    }

    protected void registerRewrites() {
        this.filter().handler((event, data) -> {
            int pose;
            EntityDataType type;
            if (data.dataType().typeId() <= Types1_18.ENTITY_DATA_TYPES.poseType.typeId()) {
                data.setDataType(Types1_18.ENTITY_DATA_TYPES.byId(data.dataType().typeId()));
            }
            if ((type = data.dataType()) == Types1_18.ENTITY_DATA_TYPES.particleType) {
                Particle particle = (Particle)data.getValue();
                ParticleMappings particleMappings = ((Protocol1_19To1_18_2)this.protocol).getMappingData().getParticleMappings();
                if (particle.id() == particleMappings.id("sculk_charge")) {
                    event.cancel();
                    return;
                }
                if (particle.id() == particleMappings.id("shriek")) {
                    event.cancel();
                    return;
                }
                if (particle.id() == particleMappings.id("vibration")) {
                    event.cancel();
                    return;
                }
                ((Protocol1_19To1_18_2)this.protocol).getParticleRewriter().rewriteParticle(event.user(), particle);
            } else if (type == Types1_18.ENTITY_DATA_TYPES.poseType && (pose = ((Integer)data.value()).intValue()) >= 8) {
                data.setValue((Object)0);
            }
        });
        this.registerEntityDataTypeHandler(Types1_18.ENTITY_DATA_TYPES.itemType, null, Types1_18.ENTITY_DATA_TYPES.optionalBlockStateType, null, Types1_18.ENTITY_DATA_TYPES.componentType, Types1_18.ENTITY_DATA_TYPES.optionalComponentType);
        this.registerBlockStateHandler((EntityType)EntityTypes1_19.ABSTRACT_MINECART, 11);
        this.filter().type((EntityType)EntityTypes1_19.PAINTING).index(8).handler((event, data) -> {
            StoredPainting storedPainting;
            event.cancel();
            StoredEntityData entityData = this.tracker(event.user()).entityDataIfPresent(event.entityId());
            StoredPainting storedPainting2 = storedPainting = entityData != null ? (StoredPainting)entityData.get(StoredPainting.class) : null;
            if (storedPainting != null) {
                int type = (Integer)data.value();
                storedPainting.setType(type);
                PacketWrapper packet = PacketWrapper.create((PacketType)ClientboundPackets1_18.ADD_PAINTING, (UserConnection)event.user());
                packet.write((Type)Types.VAR_INT, (Object)storedPainting.entityId());
                packet.write(Types.UUID, (Object)storedPainting.uuid());
                packet.write((Type)Types.VAR_INT, (Object)type);
                packet.write(Types.BLOCK_POSITION1_14, (Object)storedPainting.position());
                packet.write((Type)Types.BYTE, (Object)storedPainting.direction());
                try {
                    packet.send(Protocol1_19To1_18_2.class);
                }
                catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        });
        this.filter().type((EntityType)EntityTypes1_19.CAT).index(19).handler((event, data) -> data.setDataType(Types1_18.ENTITY_DATA_TYPES.varIntType));
        this.filter().type((EntityType)EntityTypes1_19.FROG).cancel(16);
        this.filter().type((EntityType)EntityTypes1_19.FROG).cancel(17);
        this.filter().type((EntityType)EntityTypes1_19.FROG).cancel(18);
        this.filter().type((EntityType)EntityTypes1_19.WARDEN).cancel(16);
        this.filter().type((EntityType)EntityTypes1_19.GOAT).cancel(18);
        this.filter().type((EntityType)EntityTypes1_19.GOAT).cancel(19);
    }

    protected void registerPackets() {
        this.registerTracker((ClientboundPacketType)ClientboundPackets1_19.ADD_EXPERIENCE_ORB, (EntityType)EntityTypes1_19.EXPERIENCE_ORB);
        this.registerTracker((ClientboundPacketType)ClientboundPackets1_19.ADD_PLAYER, (EntityType)EntityTypes1_19.PLAYER);
        this.registerSetEntityData((ClientboundPacketType)ClientboundPackets1_19.SET_ENTITY_DATA, Types1_19.ENTITY_DATA_LIST, Types1_18.ENTITY_DATA_LIST);
        ((Protocol1_19To1_18_2)this.protocol).replaceClientbound((ClientboundPacketType)ClientboundPackets1_19.ADD_ENTITY, (PacketHandler)new PacketHandlers(){

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
                    byte headYaw = (Byte)wrapper.read((Type)Types.BYTE);
                    int data = (Integer)wrapper.read((Type)Types.VAR_INT);
                    EntityType entityType = EntityPacketRewriter1_19.this.trackAndMapEntity(wrapper);
                    if (entityType.isOrHasParent((EntityType)EntityTypes1_19.LIVING_ENTITY)) {
                        wrapper.write((Type)Types.BYTE, (Object)headYaw);
                        byte pitch = (Byte)wrapper.get((Type)Types.BYTE, 0);
                        byte yaw = (Byte)wrapper.get((Type)Types.BYTE, 1);
                        wrapper.set((Type)Types.BYTE, 0, (Object)yaw);
                        wrapper.set((Type)Types.BYTE, 1, (Object)pitch);
                        wrapper.setPacketType((PacketType)ClientboundPackets1_18.ADD_MOB);
                        return;
                    }
                    if (entityType == EntityTypes1_19.PAINTING) {
                        wrapper.cancel();
                        int entityId = (Integer)wrapper.get((Type)Types.VAR_INT, 0);
                        StoredEntityData entityData = EntityPacketRewriter1_19.this.tracker(wrapper.user()).entityData(entityId);
                        int x = ((Double)wrapper.get((Type)Types.DOUBLE, 0)).intValue();
                        int y = ((Double)wrapper.get((Type)Types.DOUBLE, 1)).intValue();
                        int z = ((Double)wrapper.get((Type)Types.DOUBLE, 2)).intValue();
                        BlockPosition position = new BlockPosition(x, y, z);
                        entityData.put((Object)new StoredPainting(entityId, (UUID)wrapper.get(Types.UUID, 0), position, data));
                        return;
                    }
                    if (entityType == EntityTypes1_19.FALLING_BLOCK) {
                        data = ((Protocol1_19To1_18_2)EntityPacketRewriter1_19.this.protocol).getMappingData().getNewBlockStateId(data);
                    }
                    wrapper.write((Type)Types.INT, (Object)data);
                });
            }
        });
        ((Protocol1_19To1_18_2)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_19.TELEPORT_ENTITY, wrapper -> {
            StoredPainting storedPainting;
            int entityId = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            if (this.tracker(wrapper.user()).entityType(entityId) != EntityTypes1_19.PAINTING) {
                return;
            }
            double x = (Double)wrapper.read((Type)Types.DOUBLE);
            double y = (Double)wrapper.read((Type)Types.DOUBLE);
            double z = (Double)wrapper.read((Type)Types.DOUBLE);
            StoredEntityData entityData = this.tracker(wrapper.user()).entityDataIfPresent(entityId);
            StoredPainting storedPainting2 = storedPainting = entityData != null ? (StoredPainting)entityData.get(StoredPainting.class) : null;
            if (storedPainting != null && (storedPainting.direction() == 2 || storedPainting.direction() == 3) && WIDE_PAINTINGS.contains(storedPainting.type())) {
                wrapper.write((Type)Types.DOUBLE, (Object)(storedPainting.direction() == 2 ? x : x + 1.0));
                wrapper.write((Type)Types.DOUBLE, (Object)(y + 1.0));
                wrapper.write((Type)Types.DOUBLE, (Object)(storedPainting.direction() == 3 ? z : z + 1.0));
            } else {
                wrapper.write((Type)Types.DOUBLE, (Object)(x + 1.0));
                wrapper.write((Type)Types.DOUBLE, (Object)(y + 1.0));
                wrapper.write((Type)Types.DOUBLE, (Object)(z + 1.0));
            }
        });
        ((Protocol1_19To1_18_2)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_19.UPDATE_MOB_EFFECT, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.map((Type)Types.VAR_INT);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.VAR_INT);
                this.map((Type)Types.BYTE);
                this.handler(wrapper -> {
                    wrapper.read(Types.OPTIONAL_NAMED_COMPOUND_TAG);
                    if (!ViaBackwards.getConfig().mapDarknessEffect()) {
                        return;
                    }
                    EntityTracker1_19 tracker = (EntityTracker1_19)EntityPacketRewriter1_19.this.tracker(wrapper.user());
                    int entityId = (Integer)wrapper.get((Type)Types.VAR_INT, 0);
                    int effectId = (Integer)wrapper.get((Type)Types.VAR_INT, 1);
                    if (effectId == 33) {
                        tracker.getAffectedByDarkness().add(entityId);
                        wrapper.set((Type)Types.VAR_INT, 1, (Object)15);
                    } else if (effectId == 15) {
                        tracker.getAffectedByBlindness().add(entityId);
                    }
                });
            }
        });
        ((Protocol1_19To1_18_2)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_19.REMOVE_MOB_EFFECT, (PacketHandler)new PacketHandlers(){

            protected void register() {
                this.map((Type)Types.VAR_INT);
                this.map((Type)Types.VAR_INT);
                this.handler(wrapper -> {
                    if (!ViaBackwards.getConfig().mapDarknessEffect()) {
                        return;
                    }
                    int entityId = (Integer)wrapper.get((Type)Types.VAR_INT, 0);
                    int effectId = (Integer)wrapper.get((Type)Types.VAR_INT, 1);
                    EntityTracker1_19 tracker = (EntityTracker1_19)EntityPacketRewriter1_19.this.tracker(wrapper.user());
                    if (effectId == 33) {
                        tracker.getAffectedByDarkness().rem(entityId);
                        if (!tracker.getAffectedByBlindness().contains(entityId)) {
                            wrapper.set((Type)Types.VAR_INT, 1, (Object)15);
                        }
                    } else if (effectId == 15) {
                        tracker.getAffectedByBlindness().rem(entityId);
                        if (tracker.getAffectedByDarkness().contains(entityId)) {
                            wrapper.cancel();
                        }
                    }
                });
            }
        });
        ((Protocol1_19To1_18_2)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_19.LOGIN, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT);
                this.map((Type)Types.BOOLEAN);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.BYTE);
                this.map(Types.STRING_ARRAY);
                this.map(Types.NAMED_COMPOUND_TAG);
                this.handler(wrapper -> {
                    DimensionRegistryStorage dimensionRegistryStorage = (DimensionRegistryStorage)wrapper.user().get(DimensionRegistryStorage.class);
                    dimensionRegistryStorage.clear();
                    String dimensionKey = Key.stripMinecraftNamespace((String)((String)wrapper.read(Types.STRING)));
                    CompoundTag registry = (CompoundTag)wrapper.get(Types.NAMED_COMPOUND_TAG, 0);
                    ListTag dimensions = TagUtil.getRegistryEntries((CompoundTag)registry, (String)"dimension_type");
                    boolean found = false;
                    for (Object dimension : dimensions) {
                        String name = Key.stripMinecraftNamespace((String)dimension.getString("name"));
                        CompoundTag dimensionData = dimension.getCompoundTag("element");
                        dimensionRegistryStorage.addDimension(name, dimensionData.copy());
                        if (found || !name.equals(dimensionKey)) continue;
                        wrapper.write(Types.NAMED_COMPOUND_TAG, (Object)dimensionData);
                        found = true;
                    }
                    if (!found) {
                        throw new IllegalArgumentException("Could not find dimension " + dimensionKey + " in dimension registry");
                    }
                    ListTag biomes = TagUtil.getRegistryEntries((CompoundTag)registry, (String)"worldgen/biome");
                    for (CompoundTag biome : biomes) {
                        CompoundTag biomeCompound = biome.getCompoundTag("element");
                        biomeCompound.putString("category", "none");
                    }
                    EntityPacketRewriter1_19.this.tracker(wrapper.user()).setBiomesSent(biomes.size());
                    ListTag chatTypes = TagUtil.removeRegistryEntries((CompoundTag)registry, (String)"chat_type");
                    for (CompoundTag chatType : chatTypes) {
                        NumberTag idTag = chatType.getNumberTag("id");
                        dimensionRegistryStorage.addChatType(idTag.asInt(), chatType);
                    }
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
                this.handler(wrapper -> {
                    GlobalBlockPosition lastDeathPosition = (GlobalBlockPosition)wrapper.read(Types.OPTIONAL_GLOBAL_POSITION);
                    if (lastDeathPosition != null) {
                        wrapper.user().put((StorableObject)new LastDeathPosition(lastDeathPosition));
                    } else {
                        wrapper.user().remove(LastDeathPosition.class);
                    }
                });
                this.handler(EntityPacketRewriter1_19.this.worldDataTrackerHandler(1));
                this.handler(EntityPacketRewriter1_19.this.playerTrackerHandler());
            }
        });
        ((Protocol1_19To1_18_2)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_19.RESPAWN, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.handler(wrapper -> {
                    String dimensionKey = (String)wrapper.read(Types.STRING);
                    CompoundTag dimension = ((DimensionRegistryStorage)wrapper.user().get(DimensionRegistryStorage.class)).dimension(dimensionKey);
                    if (dimension == null) {
                        throw new IllegalArgumentException("Could not find dimension " + dimensionKey + " in dimension registry");
                    }
                    wrapper.write(Types.NAMED_COMPOUND_TAG, (Object)dimension);
                });
                this.map(Types.STRING);
                this.map((Type)Types.LONG);
                this.map((Type)Types.UNSIGNED_BYTE);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.BOOLEAN);
                this.map((Type)Types.BOOLEAN);
                this.map((Type)Types.BOOLEAN);
                this.handler(wrapper -> {
                    GlobalBlockPosition lastDeathPosition = (GlobalBlockPosition)wrapper.read(Types.OPTIONAL_GLOBAL_POSITION);
                    if (lastDeathPosition != null) {
                        wrapper.user().put((StorableObject)new LastDeathPosition(lastDeathPosition));
                    } else {
                        wrapper.user().remove(LastDeathPosition.class);
                    }
                });
                this.handler(EntityPacketRewriter1_19.this.worldDataTrackerHandler(0));
            }
        });
        ((Protocol1_19To1_18_2)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_19.PLAYER_INFO, wrapper -> {
            int action = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            int entries = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            for (int i = 0; i < entries; ++i) {
                wrapper.passthrough(Types.UUID);
                if (action == 0) {
                    wrapper.passthrough(Types.STRING);
                    wrapper.passthrough(Types.PROFILE_PROPERTY_ARRAY);
                    wrapper.passthrough((Type)Types.VAR_INT);
                    wrapper.passthrough((Type)Types.VAR_INT);
                    wrapper.passthrough(Types.OPTIONAL_COMPONENT);
                    wrapper.read(Types.OPTIONAL_PROFILE_KEY);
                    continue;
                }
                if (action == 1 || action == 2) {
                    wrapper.passthrough((Type)Types.VAR_INT);
                    continue;
                }
                if (action != 3) continue;
                wrapper.passthrough(Types.OPTIONAL_COMPONENT);
            }
        });
    }

    public EntityType typeFromId(int typeId) {
        return EntityTypes1_19.getTypeFromId((int)typeId);
    }
}

