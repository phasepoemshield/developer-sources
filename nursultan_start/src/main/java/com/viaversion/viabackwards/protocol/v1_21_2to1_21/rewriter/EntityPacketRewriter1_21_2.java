/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.FloatTag
 *  com.viaversion.nbt.tag.IntTag
 *  com.viaversion.nbt.tag.ListTag
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viabackwards.ViaBackwards
 *  com.viaversion.viabackwards.api.BackwardsProtocol
 *  com.viaversion.viabackwards.api.rewriters.EntityRewriter
 *  com.viaversion.viabackwards.protocol.v1_21_2to1_21.storage.SignStorage
 *  com.viaversion.viabackwards.utils.VelocityUtil
 *  com.viaversion.viaversion.api.connection.StorableObject
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.data.entity.EntityTracker
 *  com.viaversion.viaversion.api.minecraft.Holder
 *  com.viaversion.viaversion.api.minecraft.Particle
 *  com.viaversion.viaversion.api.minecraft.RegistryEntry
 *  com.viaversion.viaversion.api.minecraft.SoundEvent
 *  com.viaversion.viaversion.api.minecraft.entities.EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_21_2
 *  com.viaversion.viaversion.api.minecraft.entitydata.EntityData
 *  com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes1_21
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.version.VersionedTypes
 *  com.viaversion.viaversion.protocols.v1_20_3to1_20_5.packet.ServerboundPackets1_20_5
 *  com.viaversion.viaversion.protocols.v1_20_5to1_21.packet.ClientboundConfigurationPackets1_21
 *  com.viaversion.viaversion.protocols.v1_20_5to1_21.packet.ClientboundPackets1_21
 *  com.viaversion.viaversion.protocols.v1_21to1_21_2.packet.ClientboundPacket1_21_2
 *  com.viaversion.viaversion.protocols.v1_21to1_21_2.packet.ClientboundPackets1_21_2
 *  com.viaversion.viaversion.protocols.v1_21to1_21_2.packet.ServerboundPackets1_21_2
 *  com.viaversion.viaversion.protocols.v1_21to1_21_2.storage.ClientVehicleStorage
 *  com.viaversion.viaversion.util.Key
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package com.viaversion.viabackwards.protocol.v1_21_2to1_21.rewriter;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.FloatTag;
import com.viaversion.nbt.tag.IntTag;
import com.viaversion.nbt.tag.ListTag;
import com.viaversion.nbt.tag.Tag;
import com.viaversion.viabackwards.ViaBackwards;
import com.viaversion.viabackwards.api.BackwardsProtocol;
import com.viaversion.viabackwards.api.rewriters.EntityRewriter;
import com.viaversion.viabackwards.protocol.v1_21_2to1_21.Protocol1_21_2To1_21;
import com.viaversion.viabackwards.protocol.v1_21_2to1_21.storage.PlayerStorage;
import com.viaversion.viabackwards.protocol.v1_21_2to1_21.storage.SignStorage;
import com.viaversion.viabackwards.utils.VelocityUtil;
import com.viaversion.viaversion.api.connection.StorableObject;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.data.entity.EntityTracker;
import com.viaversion.viaversion.api.minecraft.Holder;
import com.viaversion.viaversion.api.minecraft.Particle;
import com.viaversion.viaversion.api.minecraft.RegistryEntry;
import com.viaversion.viaversion.api.minecraft.SoundEvent;
import com.viaversion.viaversion.api.minecraft.entities.EntityType;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_21_2;
import com.viaversion.viaversion.api.minecraft.entitydata.EntityData;
import com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes1_21;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.version.VersionedTypes;
import com.viaversion.viaversion.protocols.v1_20_3to1_20_5.packet.ServerboundPackets1_20_5;
import com.viaversion.viaversion.protocols.v1_20_5to1_21.packet.ClientboundConfigurationPackets1_21;
import com.viaversion.viaversion.protocols.v1_20_5to1_21.packet.ClientboundPackets1_21;
import com.viaversion.viaversion.protocols.v1_21to1_21_2.packet.ClientboundPacket1_21_2;
import com.viaversion.viaversion.protocols.v1_21to1_21_2.packet.ClientboundPackets1_21_2;
import com.viaversion.viaversion.protocols.v1_21to1_21_2.packet.ServerboundPackets1_21_2;
import com.viaversion.viaversion.protocols.v1_21to1_21_2.storage.ClientVehicleStorage;
import com.viaversion.viaversion.util.Key;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import org.checkerframework.checker.nullness.qual.Nullable;

public final class EntityPacketRewriter1_21_2
extends EntityRewriter<ClientboundPacket1_21_2, Protocol1_21_2To1_21> {
    private static final int REL_X = 0;
    private static final int REL_Y = 1;
    private static final int REL_Z = 2;
    private static final int REL_Y_ROT = 3;
    private static final int REL_X_ROT = 4;
    private static final int REL_DELTA_X = 5;
    private static final int REL_DELTA_Y = 6;
    private static final int REL_DELTA_Z = 7;
    private static final int REL_ROTATE_DELTA = 8;
    private boolean warned = ViaBackwards.getConfig().suppressEmulationWarnings();

    public EntityPacketRewriter1_21_2(Protocol1_21_2To1_21 protocol) {
        super((BackwardsProtocol)protocol, ((EntityDataTypes1_21)VersionedTypes.V1_21.entityDataTypes).optionalComponentType, ((EntityDataTypes1_21)VersionedTypes.V1_21.entityDataTypes).booleanType);
    }

    public void onMappingDataLoaded() {
        super.onMappingDataLoaded();
        this.mapEntityTypeWithData((EntityType)EntityTypes1_21_2.CREAKING, (EntityType)EntityTypes1_21_2.WARDEN).tagName();
        this.mapEntityTypeWithData((EntityType)EntityTypes1_21_2.CREAKING_TRANSIENT, (EntityType)EntityTypes1_21_2.WARDEN).tagName();
    }

    protected void registerRewrites() {
        this.dataTypeMapper().register();
        this.registerEntityDataTypeHandler1_20_3(((EntityDataTypes1_21)VersionedTypes.V1_21.entityDataTypes).itemType, ((EntityDataTypes1_21)VersionedTypes.V1_21.entityDataTypes).blockStateType, ((EntityDataTypes1_21)VersionedTypes.V1_21.entityDataTypes).optionalBlockStateType, ((EntityDataTypes1_21)VersionedTypes.V1_21.entityDataTypes).particleType, ((EntityDataTypes1_21)VersionedTypes.V1_21.entityDataTypes).particlesType, ((EntityDataTypes1_21)VersionedTypes.V1_21.entityDataTypes).componentType, ((EntityDataTypes1_21)VersionedTypes.V1_21.entityDataTypes).optionalComponentType);
        this.registerBlockStateHandler((EntityType)EntityTypes1_21_2.ABSTRACT_MINECART, 11);
        this.filter().type((EntityType)EntityTypes1_21_2.CREAKING).cancel(17);
        this.filter().type((EntityType)EntityTypes1_21_2.CREAKING).cancel(16);
        this.filter().type((EntityType)EntityTypes1_21_2.ABSTRACT_BOAT).addIndex(11);
        this.filter().type((EntityType)EntityTypes1_21_2.SALMON).removeIndex(17);
        this.filter().type((EntityType)EntityTypes1_21_2.AGEABLE_WATER_CREATURE).removeIndex(16);
        this.filter().type((EntityType)EntityTypes1_21_2.ABSTRACT_ARROW).removeIndex(10);
    }

    public void registerPackets() {
        ((Protocol1_21_2To1_21)this.protocol).replaceClientbound((ClientboundPacketType)ClientboundPackets1_21_2.ADD_ENTITY, wrapper -> {
            int entityId = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            wrapper.passthrough(Types.UUID);
            int entityTypeId = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            wrapper.passthrough((Type)Types.DOUBLE);
            wrapper.passthrough((Type)Types.DOUBLE);
            wrapper.passthrough((Type)Types.DOUBLE);
            wrapper.passthrough((Type)Types.BYTE);
            wrapper.passthrough((Type)Types.BYTE);
            wrapper.passthrough((Type)Types.BYTE);
            wrapper.passthrough((Type)Types.VAR_INT);
            this.getSpawnTrackerWithDataHandler1_19().handle(wrapper);
            EntityType type = EntityTypes1_21_2.getTypeFromId((int)entityTypeId);
            if (type.isOrHasParent((EntityType)EntityTypes1_21_2.ABSTRACT_BOAT)) {
                wrapper.send(Protocol1_21_2To1_21.class);
                wrapper.cancel();
                ArrayList<EntityData> data = new ArrayList<EntityData>();
                int boatType = type.isOrHasParent((EntityType)EntityTypes1_21_2.ABSTRACT_CHEST_BOAT) ? this.chestBoatTypeFromEntityType(type) : this.boatTypeFromEntityType(type);
                data.add(new EntityData(11, ((EntityDataTypes1_21)VersionedTypes.V1_21.entityDataTypes).varIntType, (Object)boatType));
                PacketWrapper entityDataPacket = wrapper.create((PacketType)ClientboundPackets1_21.SET_ENTITY_DATA);
                entityDataPacket.write((Type)Types.VAR_INT, (Object)entityId);
                entityDataPacket.write(VersionedTypes.V1_21.entityDataList, data);
                entityDataPacket.send(Protocol1_21_2To1_21.class);
            }
        });
        ((Protocol1_21_2To1_21)this.protocol).getRegistryDataRewriter().addEnchantmentEffectRewriter("change_item_damage", tag -> tag.putString("type", "damage_item"));
        ((Protocol1_21_2To1_21)this.protocol).replaceClientbound((ClientboundPacketType)ClientboundConfigurationPackets1_21.REGISTRY_DATA, wrapper -> {
            String registryKey = Key.stripMinecraftNamespace((String)((String)wrapper.passthrough(Types.STRING)));
            RegistryEntry[] entries = (RegistryEntry[])wrapper.read(Types.REGISTRY_ENTRY_ARRAY);
            if (registryKey.equals("instrument")) {
                wrapper.cancel();
                return;
            }
            if (registryKey.equals("worldgen/biome")) {
                for (RegistryEntry entry : entries) {
                    CompoundTag effects;
                    CompoundTag particle;
                    if (entry.tag() == null || (particle = (effects = ((CompoundTag)entry.tag()).getCompoundTag("effects")).getCompoundTag("particle")) == null) continue;
                    CompoundTag particleOptions = particle.getCompoundTag("options");
                    String particleType = particleOptions.getString("type");
                    this.updateParticleFormat(particleOptions, Key.stripMinecraftNamespace((String)particleType));
                }
            }
            wrapper.write(Types.REGISTRY_ENTRY_ARRAY, (Object)((Protocol1_21_2To1_21)this.protocol).getRegistryDataRewriter().handle(wrapper.user(), registryKey, entries));
        });
        ((Protocol1_21_2To1_21)this.protocol).replaceClientbound((ClientboundPacketType)ClientboundPackets1_21_2.LOGIN, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT);
                this.map((Type)Types.BOOLEAN);
                this.map(Types.STRING_ARRAY);
                this.map((Type)Types.VAR_INT);
                this.map((Type)Types.VAR_INT);
                this.map((Type)Types.VAR_INT);
                this.map((Type)Types.BOOLEAN);
                this.map((Type)Types.BOOLEAN);
                this.map((Type)Types.BOOLEAN);
                this.map((Type)Types.VAR_INT);
                this.map(Types.STRING);
                this.map((Type)Types.LONG);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.BOOLEAN);
                this.map((Type)Types.BOOLEAN);
                this.map(Types.OPTIONAL_GLOBAL_POSITION);
                this.map((Type)Types.VAR_INT);
                this.handler(EntityPacketRewriter1_21_2.this.worldDataTrackerHandlerByKey1_20_5(3));
                this.handler(EntityPacketRewriter1_21_2.this.playerTrackerHandler());
                this.read((Type)Types.VAR_INT);
            }
        });
        ((Protocol1_21_2To1_21)this.protocol).replaceClientbound((ClientboundPacketType)ClientboundPackets1_21_2.RESPAWN, wrapper -> {
            int dimensionId = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            String world = (String)wrapper.passthrough(Types.STRING);
            wrapper.passthrough((Type)Types.LONG);
            wrapper.passthrough((Type)Types.BYTE);
            wrapper.passthrough((Type)Types.BYTE);
            wrapper.passthrough((Type)Types.BOOLEAN);
            wrapper.passthrough((Type)Types.BOOLEAN);
            wrapper.passthrough(Types.OPTIONAL_GLOBAL_POSITION);
            wrapper.passthrough((Type)Types.VAR_INT);
            wrapper.read((Type)Types.VAR_INT);
            EntityTracker tracker = this.tracker(wrapper.user());
            if (tracker.currentWorld() != null && !tracker.currentWorld().equals(world)) {
                wrapper.user().put((StorableObject)new SignStorage());
            }
            this.trackWorldDataByKey1_20_5(wrapper.user(), dimensionId, world);
        });
        ((Protocol1_21_2To1_21)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_21_2.ENTITY_POSITION_SYNC, (ClientboundPacketType)ClientboundPackets1_21.TELEPORT_ENTITY, wrapper -> {
            wrapper.passthrough((Type)Types.VAR_INT);
            wrapper.passthrough((Type)Types.DOUBLE);
            wrapper.passthrough((Type)Types.DOUBLE);
            wrapper.passthrough((Type)Types.DOUBLE);
            wrapper.read((Type)Types.DOUBLE);
            wrapper.read((Type)Types.DOUBLE);
            wrapper.read((Type)Types.DOUBLE);
            float yaw = ((Float)wrapper.read((Type)Types.FLOAT)).floatValue();
            float pitch = ((Float)wrapper.read((Type)Types.FLOAT)).floatValue();
            this.writePackedRotation(wrapper, yaw, pitch);
        });
        ((Protocol1_21_2To1_21)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_21_2.PLAYER_ROTATION, (ClientboundPacketType)ClientboundPackets1_21.PLAYER_LOOK_AT, wrapper -> {
            float yaw = ((Float)wrapper.read((Type)Types.FLOAT)).floatValue();
            float pitch = ((Float)wrapper.read((Type)Types.FLOAT)).floatValue();
            double yRadians = Math.toRadians(yaw);
            double xRadians = Math.toRadians(pitch);
            double factor = -Math.cos(-xRadians);
            double deltaX = Math.sin(-yRadians - 3.1415927410125732) * factor;
            double deltaY = Math.sin(-xRadians);
            double deltaZ = Math.cos(-yRadians - 3.1415927410125732) * factor;
            PlayerStorage storage = (PlayerStorage)wrapper.user().get(PlayerStorage.class);
            wrapper.write((Type)Types.VAR_INT, (Object)0);
            wrapper.write((Type)Types.DOUBLE, (Object)(storage.x() + deltaX));
            wrapper.write((Type)Types.DOUBLE, (Object)(storage.y() + deltaY));
            wrapper.write((Type)Types.DOUBLE, (Object)(storage.z() + deltaZ));
            wrapper.write((Type)Types.BOOLEAN, (Object)false);
            PacketWrapper entityMotionPacket = PacketWrapper.create((PacketType)ServerboundPackets1_21_2.MOVE_PLAYER_ROT, (UserConnection)wrapper.user());
            entityMotionPacket.write((Type)Types.FLOAT, (Object)Float.valueOf(yaw));
            entityMotionPacket.write((Type)Types.FLOAT, (Object)Float.valueOf(pitch));
            entityMotionPacket.write((Type)Types.UNSIGNED_BYTE, (Object)0);
            entityMotionPacket.sendToServer(Protocol1_21_2To1_21.class);
        });
        ((Protocol1_21_2To1_21)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_21_2.TELEPORT_ENTITY, wrapper -> {
            int entityId = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            double x = (Double)wrapper.passthrough((Type)Types.DOUBLE);
            double y = (Double)wrapper.passthrough((Type)Types.DOUBLE);
            double z = (Double)wrapper.passthrough((Type)Types.DOUBLE);
            double movementX = (Double)wrapper.read((Type)Types.DOUBLE);
            double movementY = (Double)wrapper.read((Type)Types.DOUBLE);
            double movementZ = (Double)wrapper.read((Type)Types.DOUBLE);
            float yaw = ((Float)wrapper.read((Type)Types.FLOAT)).floatValue();
            float pitch = ((Float)wrapper.read((Type)Types.FLOAT)).floatValue();
            this.writePackedRotation(wrapper, yaw, pitch);
            int relativeArguments = (Integer)wrapper.read((Type)Types.INT);
            wrapper.send(Protocol1_21_2To1_21.class);
            wrapper.cancel();
            this.handleRelativeArguments(wrapper, x, y, z, yaw, pitch, relativeArguments, movementX, movementY, movementZ, entityId);
        });
        ((Protocol1_21_2To1_21)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_21_2.PLAYER_POSITION, wrapper -> {
            int teleportId = (Integer)wrapper.read((Type)Types.VAR_INT);
            double x = (Double)wrapper.passthrough((Type)Types.DOUBLE);
            double y = (Double)wrapper.passthrough((Type)Types.DOUBLE);
            double z = (Double)wrapper.passthrough((Type)Types.DOUBLE);
            double movementX = (Double)wrapper.read((Type)Types.DOUBLE);
            double movementY = (Double)wrapper.read((Type)Types.DOUBLE);
            double movementZ = (Double)wrapper.read((Type)Types.DOUBLE);
            float yaw = ((Float)wrapper.passthrough((Type)Types.FLOAT)).floatValue();
            float pitch = ((Float)wrapper.passthrough((Type)Types.FLOAT)).floatValue();
            int relativeArguments = (Integer)wrapper.read((Type)Types.INT);
            wrapper.write((Type)Types.BYTE, (Object)((byte)relativeArguments));
            wrapper.write((Type)Types.VAR_INT, (Object)teleportId);
            wrapper.send(Protocol1_21_2To1_21.class);
            wrapper.cancel();
            this.handleRelativeArguments(wrapper, x, y, z, yaw, pitch, relativeArguments, movementX, movementY, movementZ, null);
        });
        ((Protocol1_21_2To1_21)this.protocol).registerServerbound((ServerboundPacketType)ServerboundPackets1_20_5.PLAYER_COMMAND, wrapper -> {
            wrapper.passthrough((Type)Types.VAR_INT);
            int action = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            PlayerStorage storage = (PlayerStorage)wrapper.user().get(PlayerStorage.class);
            if (action == 0) {
                storage.setPlayerCommandTrackedSneaking(true);
            } else if (action == 1) {
                storage.setPlayerCommandTrackedSneaking(false);
            } else if (action == 3) {
                storage.setPlayerCommandTrackedSprinting(true);
            } else if (action == 4) {
                storage.setPlayerCommandTrackedSprinting(false);
            }
        });
        ((Protocol1_21_2To1_21)this.protocol).registerServerbound((ServerboundPacketType)ServerboundPackets1_20_5.PLAYER_INPUT, wrapper -> {
            boolean sneaking;
            float sideways = ((Float)wrapper.read((Type)Types.FLOAT)).floatValue();
            float forward = ((Float)wrapper.read((Type)Types.FLOAT)).floatValue();
            byte flags = (Byte)wrapper.read((Type)Types.BYTE);
            byte updatedFlags = 0;
            if (forward > 0.0f) {
                updatedFlags = (byte)(updatedFlags | 1);
            } else if (forward < 0.0f) {
                updatedFlags = (byte)(updatedFlags | 2);
            }
            if (sideways > 0.0f) {
                updatedFlags = (byte)(updatedFlags | 4);
            } else if (sideways < 0.0f) {
                updatedFlags = (byte)(updatedFlags | 8);
            }
            if ((flags & 1) != 0) {
                updatedFlags = (byte)(updatedFlags | 0x10);
            }
            boolean bl = sneaking = (flags & 2) != 0;
            if (sneaking) {
                updatedFlags = (byte)(updatedFlags | 0x20);
            }
            wrapper.write((Type)Types.BYTE, (Object)updatedFlags);
            this.sendSneakingPlayerCommand(wrapper, sneaking);
        });
        ((Protocol1_21_2To1_21)this.protocol).registerServerbound((ServerboundPacketType)ServerboundPackets1_20_5.MOVE_PLAYER_POS, wrapper -> {
            double x = (Double)wrapper.passthrough((Type)Types.DOUBLE);
            double y = (Double)wrapper.passthrough((Type)Types.DOUBLE);
            double z = (Double)wrapper.passthrough((Type)Types.DOUBLE);
            this.fixOnGround(wrapper);
            PlayerStorage storage = (PlayerStorage)wrapper.user().get(PlayerStorage.class);
            storage.setPosition(x, y, z);
        });
        ((Protocol1_21_2To1_21)this.protocol).registerServerbound((ServerboundPacketType)ServerboundPackets1_20_5.MOVE_PLAYER_POS_ROT, wrapper -> {
            double x = (Double)wrapper.passthrough((Type)Types.DOUBLE);
            double y = (Double)wrapper.passthrough((Type)Types.DOUBLE);
            double z = (Double)wrapper.passthrough((Type)Types.DOUBLE);
            float yaw = ((Float)wrapper.passthrough((Type)Types.FLOAT)).floatValue();
            float pitch = ((Float)wrapper.passthrough((Type)Types.FLOAT)).floatValue();
            this.fixOnGround(wrapper);
            PlayerStorage storage = (PlayerStorage)wrapper.user().get(PlayerStorage.class);
            storage.setPosition(x, y, z);
            storage.setRotation(yaw, pitch);
        });
        ((Protocol1_21_2To1_21)this.protocol).registerServerbound((ServerboundPacketType)ServerboundPackets1_20_5.MOVE_PLAYER_ROT, wrapper -> {
            float yaw = ((Float)wrapper.passthrough((Type)Types.FLOAT)).floatValue();
            float pitch = ((Float)wrapper.passthrough((Type)Types.FLOAT)).floatValue();
            this.fixOnGround(wrapper);
            PlayerStorage storage = (PlayerStorage)wrapper.user().get(PlayerStorage.class);
            storage.setRotation(yaw, pitch);
        });
        ((Protocol1_21_2To1_21)this.protocol).registerServerbound((ServerboundPacketType)ServerboundPackets1_20_5.MOVE_PLAYER_STATUS_ONLY, this::fixOnGround);
        ((Protocol1_21_2To1_21)this.protocol).registerServerbound((ServerboundPacketType)ServerboundPackets1_20_5.MOVE_VEHICLE, wrapper -> {
            double x = (Double)wrapper.passthrough((Type)Types.DOUBLE);
            double y = (Double)wrapper.passthrough((Type)Types.DOUBLE);
            double z = (Double)wrapper.passthrough((Type)Types.DOUBLE);
            float yaw = ((Float)wrapper.passthrough((Type)Types.FLOAT)).floatValue();
            float pitch = ((Float)wrapper.passthrough((Type)Types.FLOAT)).floatValue();
            PlayerStorage storage = (PlayerStorage)wrapper.user().get(PlayerStorage.class);
            storage.setPosition(x, y, z);
            storage.setRotation(yaw, pitch);
        });
        ((Protocol1_21_2To1_21)this.protocol).replaceClientbound((ClientboundPacketType)ClientboundPackets1_21_2.PLAYER_INFO_UPDATE, wrapper -> {
            BitSet actions = (BitSet)wrapper.read((Type)Types.PROFILE_ACTIONS_ENUM1_21_2);
            BitSet updatedActions = new BitSet(6);
            for (int i = 0; i < 6; ++i) {
                if (!actions.get(i)) continue;
                updatedActions.set(i);
            }
            wrapper.write((Type)Types.PROFILE_ACTIONS_ENUM1_19_3, (Object)updatedActions);
            int entries = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            for (int i = 0; i < entries; ++i) {
                wrapper.passthrough(Types.UUID);
                if (actions.get(0)) {
                    wrapper.passthrough(Types.STRING);
                    wrapper.passthrough(Types.PROFILE_PROPERTY_ARRAY);
                }
                if (actions.get(1) && ((Boolean)wrapper.passthrough((Type)Types.BOOLEAN)).booleanValue()) {
                    wrapper.passthrough(Types.UUID);
                    wrapper.passthrough(Types.PROFILE_KEY);
                }
                if (actions.get(2)) {
                    wrapper.passthrough((Type)Types.VAR_INT);
                }
                if (actions.get(3)) {
                    wrapper.passthrough((Type)Types.BOOLEAN);
                }
                if (actions.get(4)) {
                    wrapper.passthrough((Type)Types.VAR_INT);
                }
                if (actions.get(5)) {
                    Tag displayName = (Tag)wrapper.passthrough(Types.TRUSTED_OPTIONAL_TAG);
                    ((Protocol1_21_2To1_21)this.protocol).getComponentRewriter().processTag(wrapper.user(), displayName);
                }
                if (!actions.get(6)) continue;
                wrapper.read((Type)Types.VAR_INT);
            }
        });
        ((Protocol1_21_2To1_21)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_21_2.SET_PASSENGERS, wrapper -> {
            int vehicleId = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            int[] passengerIds = (int[])wrapper.passthrough(Types.VAR_INT_ARRAY_PRIMITIVE);
            ClientVehicleStorage storage = (ClientVehicleStorage)wrapper.user().get(ClientVehicleStorage.class);
            if (storage != null && vehicleId == storage.vehicleId()) {
                wrapper.user().remove(ClientVehicleStorage.class);
                this.sendSneakingPlayerCommand(wrapper, false);
            }
            int clientEntityId = this.tracker(wrapper.user()).clientEntityId();
            for (int passenger : passengerIds) {
                if (passenger != clientEntityId) continue;
                wrapper.user().put((StorableObject)new ClientVehicleStorage(vehicleId));
                break;
            }
        });
        ((Protocol1_21_2To1_21)this.protocol).appendClientbound((ClientboundPacketType)ClientboundPackets1_21_2.REMOVE_ENTITIES, wrapper -> {
            int[] entityIds;
            ClientVehicleStorage vehicleStorage = (ClientVehicleStorage)wrapper.user().get(ClientVehicleStorage.class);
            if (vehicleStorage == null) {
                return;
            }
            for (int entityId : entityIds = (int[])wrapper.get(Types.VAR_INT_ARRAY_PRIMITIVE, 0)) {
                if (entityId != vehicleStorage.vehicleId()) continue;
                wrapper.user().remove(ClientVehicleStorage.class);
                this.sendSneakingPlayerCommand(wrapper, false);
                break;
            }
        });
    }

    public EntityType typeFromId(int type) {
        return EntityTypes1_21_2.getTypeFromId((int)type);
    }

    private void replaceColor(CompoundTag options, String to_color) {
        IntTag toColorTag = options.getIntTag(to_color);
        if (toColorTag == null) {
            return;
        }
        int rgb = toColorTag.asInt();
        float r = (float)(rgb >> 16 & 0xFF) / 255.0f;
        float g = (float)(rgb >> 8 & 0xFF) / 255.0f;
        float b = (float)(rgb & 0xFF) / 255.0f;
        options.put(to_color, (Tag)new ListTag(List.of(new FloatTag(r), new FloatTag(g), new FloatTag(b))));
    }

    private void fixOnGround(PacketWrapper wrapper) {
        boolean data = (Boolean)wrapper.read((Type)Types.BOOLEAN);
        wrapper.write((Type)Types.UNSIGNED_BYTE, (Object)(data ? (short)1 : 0));
    }

    private void sendSneakingPlayerCommand(PacketWrapper wrapper, boolean sneaking) {
        PlayerStorage sneakingStorage = (PlayerStorage)wrapper.user().get(PlayerStorage.class);
        if (sneakingStorage.setSneaking(sneaking)) {
            PacketWrapper playerCommandPacket = wrapper.create((PacketType)ServerboundPackets1_21_2.PLAYER_COMMAND);
            playerCommandPacket.write((Type)Types.VAR_INT, (Object)this.tracker(wrapper.user()).clientEntityId());
            playerCommandPacket.write((Type)Types.VAR_INT, (Object)(sneaking ? 0 : 1));
            playerCommandPacket.write((Type)Types.VAR_INT, (Object)0);
            playerCommandPacket.sendToServer(Protocol1_21_2To1_21.class);
        }
    }

    private void handleRelativeArguments(PacketWrapper wrapper, double x, double y, double z, float yaw, float pitch, int relativeArguments, double movementX, double movementY, double movementZ, @Nullable Integer entityId) {
        PlayerStorage storage = (PlayerStorage)wrapper.user().get(PlayerStorage.class);
        if ((relativeArguments & 1) != 0) {
            x += storage.x();
        }
        if ((relativeArguments & 2) != 0) {
            y += storage.y();
        }
        if ((relativeArguments & 4) != 0) {
            z += storage.z();
        }
        if ((relativeArguments & 8) != 0) {
            yaw += storage.yaw();
        }
        if ((relativeArguments & 0x10) != 0) {
            pitch += storage.pitch();
        }
        if ((relativeArguments & 0x100) != 0) {
            double deltaYaw = Math.toRadians(storage.yaw() - yaw);
            double deltaYawCos = Math.cos(deltaYaw);
            double deltaYawSin = Math.sin(deltaYaw);
            movementX = movementX * deltaYawCos + movementZ * deltaYawSin;
            movementZ = movementZ * deltaYawCos - movementX * deltaYawSin;
            double deltaPitch = Math.toRadians(storage.pitch() - pitch);
            double deltaPitchCos = Math.cos(deltaPitch);
            double deltaPitchSin = Math.sin(deltaPitch);
            movementY = movementY * deltaPitchCos + movementZ * deltaPitchSin;
            movementZ = movementZ * deltaPitchCos - movementY * deltaPitchSin;
        }
        boolean relativeDeltaX = (relativeArguments & 0x20) != 0;
        boolean relativeDeltaY = (relativeArguments & 0x40) != 0;
        boolean relativeDeltaZ = (relativeArguments & 0x80) != 0;
        storage.setPosition(x, y, z);
        storage.setRotation(yaw, pitch);
        if (relativeDeltaX && relativeDeltaY && relativeDeltaZ) {
            if (entityId != null && entityId.intValue() != this.tracker(wrapper.user()).clientEntityId()) {
                return;
            }
            PacketWrapper explosionPacket = wrapper.create((PacketType)ClientboundPackets1_21.EXPLODE);
            explosionPacket.write((Type)Types.DOUBLE, (Object)0.0);
            explosionPacket.write((Type)Types.DOUBLE, (Object)0.0);
            explosionPacket.write((Type)Types.DOUBLE, (Object)0.0);
            explosionPacket.write((Type)Types.FLOAT, (Object)Float.valueOf(0.0f));
            explosionPacket.write((Type)Types.VAR_INT, (Object)0);
            explosionPacket.write((Type)Types.FLOAT, (Object)Float.valueOf((float)movementX));
            explosionPacket.write((Type)Types.FLOAT, (Object)Float.valueOf((float)movementY));
            explosionPacket.write((Type)Types.FLOAT, (Object)Float.valueOf((float)movementZ));
            explosionPacket.write((Type)Types.VAR_INT, (Object)0);
            explosionPacket.write((Type)VersionedTypes.V1_21.particle(), (Object)new Particle(0));
            explosionPacket.write((Type)VersionedTypes.V1_21.particle(), (Object)new Particle(0));
            explosionPacket.write((Type)Types.SOUND_EVENT, (Object)Holder.of((Object)new SoundEvent("", null)));
            explosionPacket.send(Protocol1_21_2To1_21.class);
        } else if (!(relativeDeltaX || relativeDeltaY || relativeDeltaZ)) {
            PacketWrapper entityMotionPacket = wrapper.create((PacketType)ClientboundPackets1_21.SET_ENTITY_MOTION);
            entityMotionPacket.write((Type)Types.VAR_INT, (Object)(entityId != null ? entityId.intValue() : this.tracker(wrapper.user()).clientEntityId()));
            entityMotionPacket.write((Type)Types.SHORT, (Object)VelocityUtil.toLegacyVelocity((double)movementX));
            entityMotionPacket.write((Type)Types.SHORT, (Object)VelocityUtil.toLegacyVelocity((double)movementY));
            entityMotionPacket.write((Type)Types.SHORT, (Object)VelocityUtil.toLegacyVelocity((double)movementZ));
            entityMotionPacket.send(Protocol1_21_2To1_21.class);
        } else if (!this.warned) {
            ((Protocol1_21_2To1_21)this.protocol).getLogger().warning("Mixed combinations of relative and absolute delta movements are not supported for 1.21.1 players. This will result in incorrect movement for the player. ");
            this.warned = true;
        }
    }

    private void writePackedRotation(PacketWrapper wrapper, float yaw, float pitch) {
        wrapper.write((Type)Types.BYTE, (Object)((byte)Math.floor(yaw * 256.0f / 360.0f)));
        wrapper.write((Type)Types.BYTE, (Object)((byte)Math.floor(pitch * 256.0f / 360.0f)));
    }

    private int boatTypeFromEntityType(EntityType type) {
        if (type == EntityTypes1_21_2.OAK_BOAT) {
            return 0;
        }
        if (type == EntityTypes1_21_2.SPRUCE_BOAT) {
            return 1;
        }
        if (type == EntityTypes1_21_2.BIRCH_BOAT) {
            return 2;
        }
        if (type == EntityTypes1_21_2.JUNGLE_BOAT) {
            return 3;
        }
        if (type == EntityTypes1_21_2.ACACIA_BOAT) {
            return 4;
        }
        if (type == EntityTypes1_21_2.CHERRY_BOAT) {
            return 5;
        }
        if (type == EntityTypes1_21_2.DARK_OAK_BOAT) {
            return 6;
        }
        if (type == EntityTypes1_21_2.MANGROVE_BOAT) {
            return 7;
        }
        if (type == EntityTypes1_21_2.BAMBOO_RAFT) {
            return 8;
        }
        return 0;
    }

    private void updateParticleFormat(CompoundTag options, String particleType) {
        if ("dust_color_transition".equals(particleType)) {
            this.replaceColor(options, "from_color");
            this.replaceColor(options, "to_color");
        } else if ("dust".equals(particleType)) {
            this.replaceColor(options, "color");
        }
    }

    private int chestBoatTypeFromEntityType(EntityType type) {
        if (type == EntityTypes1_21_2.OAK_CHEST_BOAT) {
            return 0;
        }
        if (type == EntityTypes1_21_2.SPRUCE_CHEST_BOAT) {
            return 1;
        }
        if (type == EntityTypes1_21_2.BIRCH_CHEST_BOAT) {
            return 2;
        }
        if (type == EntityTypes1_21_2.JUNGLE_CHEST_BOAT) {
            return 3;
        }
        if (type == EntityTypes1_21_2.ACACIA_CHEST_BOAT) {
            return 4;
        }
        if (type == EntityTypes1_21_2.CHERRY_CHEST_BOAT) {
            return 5;
        }
        if (type == EntityTypes1_21_2.DARK_OAK_CHEST_BOAT) {
            return 6;
        }
        if (type == EntityTypes1_21_2.MANGROVE_CHEST_BOAT) {
            return 7;
        }
        if (type == EntityTypes1_21_2.BAMBOO_CHEST_RAFT) {
            return 8;
        }
        return 0;
    }
}

