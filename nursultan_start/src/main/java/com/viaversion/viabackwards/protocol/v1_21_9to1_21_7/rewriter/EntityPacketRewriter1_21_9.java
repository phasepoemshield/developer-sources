/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.StringTag
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viabackwards.api.BackwardsProtocol
 *  com.viaversion.viabackwards.api.rewriters.EntityRewriter
 *  com.viaversion.viabackwards.protocol.v1_21_9to1_21_7.storage.MannequinData
 *  com.viaversion.viabackwards.protocol.v1_21_9to1_21_7.storage.PlayerRotationStorage
 *  com.viaversion.viabackwards.protocol.v1_21_9to1_21_7.tracker.EntityTracker1_21_9
 *  com.viaversion.viabackwards.utils.VelocityUtil
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.data.entity.TrackedEntity
 *  com.viaversion.viaversion.api.minecraft.BlockPosition
 *  com.viaversion.viaversion.api.minecraft.GameProfile$Property
 *  com.viaversion.viaversion.api.minecraft.GlobalBlockPosition
 *  com.viaversion.viaversion.api.minecraft.ResolvableProfile
 *  com.viaversion.viaversion.api.minecraft.Vector3d
 *  com.viaversion.viaversion.api.minecraft.entities.EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_21_6
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_21_9
 *  com.viaversion.viaversion.api.minecraft.entitydata.EntityData
 *  com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes1_21_5
 *  com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes1_21_9
 *  com.viaversion.viaversion.api.minecraft.item.Item
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.version.VersionedTypes
 *  com.viaversion.viaversion.protocols.v1_21_5to1_21_6.packet.ClientboundPackets1_21_6
 *  com.viaversion.viaversion.protocols.v1_21_5to1_21_6.packet.ServerboundPackets1_21_6
 *  com.viaversion.viaversion.protocols.v1_21_7to1_21_9.packet.ClientboundPacket1_21_9
 *  com.viaversion.viaversion.protocols.v1_21_7to1_21_9.packet.ClientboundPackets1_21_9
 *  com.viaversion.viaversion.protocols.v1_21to1_21_2.storage.BundleStateTracker
 *  com.viaversion.viaversion.rewriter.entitydata.EntityDataHandler
 *  com.viaversion.viaversion.util.Copyable
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package com.viaversion.viabackwards.protocol.v1_21_9to1_21_7.rewriter;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.StringTag;
import com.viaversion.nbt.tag.Tag;
import com.viaversion.viabackwards.api.BackwardsProtocol;
import com.viaversion.viabackwards.api.rewriters.EntityRewriter;
import com.viaversion.viabackwards.protocol.v1_21_9to1_21_7.Protocol1_21_9To1_21_7;
import com.viaversion.viabackwards.protocol.v1_21_9to1_21_7.storage.MannequinData;
import com.viaversion.viabackwards.protocol.v1_21_9to1_21_7.storage.PlayerRotationStorage;
import com.viaversion.viabackwards.protocol.v1_21_9to1_21_7.tracker.EntityTracker1_21_9;
import com.viaversion.viabackwards.utils.VelocityUtil;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.data.entity.TrackedEntity;
import com.viaversion.viaversion.api.minecraft.BlockPosition;
import com.viaversion.viaversion.api.minecraft.GameProfile;
import com.viaversion.viaversion.api.minecraft.GlobalBlockPosition;
import com.viaversion.viaversion.api.minecraft.ResolvableProfile;
import com.viaversion.viaversion.api.minecraft.Vector3d;
import com.viaversion.viaversion.api.minecraft.entities.EntityType;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_21_6;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_21_9;
import com.viaversion.viaversion.api.minecraft.entitydata.EntityData;
import com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes1_21_5;
import com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes1_21_9;
import com.viaversion.viaversion.api.minecraft.item.Item;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.version.VersionedTypes;
import com.viaversion.viaversion.protocols.v1_21_5to1_21_6.packet.ClientboundPackets1_21_6;
import com.viaversion.viaversion.protocols.v1_21_5to1_21_6.packet.ServerboundPackets1_21_6;
import com.viaversion.viaversion.protocols.v1_21_7to1_21_9.packet.ClientboundPacket1_21_9;
import com.viaversion.viaversion.protocols.v1_21_7to1_21_9.packet.ClientboundPackets1_21_9;
import com.viaversion.viaversion.protocols.v1_21to1_21_2.storage.BundleStateTracker;
import com.viaversion.viaversion.rewriter.entitydata.EntityDataHandler;
import com.viaversion.viaversion.util.Copyable;
import java.util.BitSet;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;
import org.checkerframework.checker.nullness.qual.Nullable;

public final class EntityPacketRewriter1_21_9
extends EntityRewriter<ClientboundPacket1_21_9, Protocol1_21_9To1_21_7> {
    public EntityPacketRewriter1_21_9(Protocol1_21_9To1_21_7 protocol) {
        super((BackwardsProtocol)protocol, ((EntityDataTypes1_21_9)VersionedTypes.V1_21_9.entityDataTypes).optionalComponentType, ((EntityDataTypes1_21_9)VersionedTypes.V1_21_9.entityDataTypes).booleanType);
    }

    public void onMappingDataLoaded() {
        super.onMappingDataLoaded();
        this.mapEntityTypeWithData((EntityType)EntityTypes1_21_9.COPPER_GOLEM, (EntityType)EntityTypes1_21_9.FROG).tagName();
        this.mapEntityTypeWithData((EntityType)EntityTypes1_21_9.MANNEQUIN, (EntityType)EntityTypes1_21_9.PLAYER);
    }

    public void handleEntityData(int entityId, List<EntityData> dataList, UserConnection connection) {
        super.handleEntityData(entityId, dataList, connection);
        EntityTracker1_21_9 tracker = (EntityTracker1_21_9)this.tracker(connection);
        EntityType entityType = tracker.entityType(entityId);
        if (entityType == null || !entityType.isOrHasParent((EntityType)EntityTypes1_21_9.MANNEQUIN)) {
            return;
        }
        MannequinData mannequinData = (MannequinData)tracker.entity(entityId).data().get(MannequinData.class);
        if (mannequinData == null) {
            return;
        }
        List entityData = mannequinData.entityData();
        entityData.removeIf(first -> dataList.stream().anyMatch(second -> first.id() == second.id()));
        for (EntityData data : dataList) {
            Object value = data.value();
            entityData.add(new EntityData(data.id(), data.dataType(), Copyable.copy((Object)value)));
        }
    }

    protected void registerRewrites() {
        EntityDataTypes1_21_5 entityDataTypes = (EntityDataTypes1_21_5)((Protocol1_21_9To1_21_7)this.protocol).mappedTypes().entityDataTypes();
        this.dataTypeMapper().added(entityDataTypes.compoundTagType).removed(((EntityDataTypes1_21_9)VersionedTypes.V1_21_9.entityDataTypes).copperGolemState).removed(((EntityDataTypes1_21_9)VersionedTypes.V1_21_9.entityDataTypes).weatheringCopperState).removed(((EntityDataTypes1_21_9)VersionedTypes.V1_21_9.entityDataTypes).mannequinProfileType).register();
        this.registerEntityDataTypeHandler1_20_3(entityDataTypes.itemType, entityDataTypes.blockStateType, entityDataTypes.optionalBlockStateType, entityDataTypes.particleType, entityDataTypes.particlesType, entityDataTypes.componentType, entityDataTypes.optionalComponentType);
        this.filter().type((EntityType)EntityTypes1_21_9.COPPER_GOLEM).cancel(16);
        this.filter().type((EntityType)EntityTypes1_21_9.COPPER_GOLEM).cancel(17);
        EntityDataHandler shoulderDataHandler = (event, data) -> {
            CompoundTag entityTag = new CompoundTag();
            Integer value = (Integer)data.value();
            if (value != null) {
                entityTag.putString("id", "parrot");
                entityTag.putInt("Variant", value.intValue());
            }
            data.setTypeAndValue(((EntityDataTypes1_21_5)((Protocol1_21_9To1_21_7)this.protocol).mappedTypes().entityDataTypes).compoundTagType, (Object)entityTag);
        };
        this.filter().type((EntityType)EntityTypes1_21_9.PLAYER).index(19).handler(shoulderDataHandler);
        this.filter().type((EntityType)EntityTypes1_21_9.PLAYER).index(20).handler(shoulderDataHandler);
        this.filter().type((EntityType)EntityTypes1_21_9.PLAYER).handler((event, data) -> {
            if (event.index() == 15) {
                event.setIndex(18);
            } else if (event.index() == 16) {
                event.setIndex(17);
            } else if (event.index() == 17 || event.index() == 18) {
                event.setIndex(event.index() - 2);
            }
        });
        this.filter().type((EntityType)EntityTypes1_21_9.MANNEQUIN).handler((event, data) -> {
            if (event.index() == 2) {
                Tag displayName = (Tag)data.value();
                MannequinData mannequinData = (MannequinData)event.trackedEntity().data().get(MannequinData.class);
                mannequinData.setDisplayName(displayName);
                this.sendPlayerInfoDisplayNameUpdate(event.user(), mannequinData, displayName);
            } else if (event.index() == 17) {
                boolean isBundling = ((BundleStateTracker)event.user().get(BundleStateTracker.class)).isBundling();
                if (!isBundling) {
                    PacketWrapper bundleStart = PacketWrapper.create((PacketType)ClientboundPackets1_21_6.BUNDLE_DELIMITER, (UserConnection)event.user());
                    bundleStart.send(Protocol1_21_9To1_21_7.class);
                }
                ResolvableProfile profile = (ResolvableProfile)data.value();
                MannequinData mannequinData = (MannequinData)event.trackedEntity().data().get(MannequinData.class);
                UUID uuid = mannequinData.uuid();
                PacketWrapper removeEntityPacket = PacketWrapper.create((PacketType)ClientboundPackets1_21_6.REMOVE_ENTITIES, (UserConnection)event.user());
                removeEntityPacket.write(Types.VAR_INT_ARRAY_PRIMITIVE, (Object)new int[]{event.entityId()});
                removeEntityPacket.send(Protocol1_21_9To1_21_7.class);
                PacketWrapper playerInfoRemove = PacketWrapper.create((PacketType)ClientboundPackets1_21_6.PLAYER_INFO_REMOVE, (UserConnection)event.user());
                playerInfoRemove.write(Types.UUID_ARRAY, (Object)new UUID[]{uuid});
                playerInfoRemove.send(Protocol1_21_9To1_21_7.class);
                this.sendInitialPlayerInfoUpdate(event.user(), mannequinData, profile.profile().properties());
                PacketWrapper spawnEntityPacket = PacketWrapper.create((PacketType)ClientboundPackets1_21_6.ADD_ENTITY, (UserConnection)event.user());
                spawnEntityPacket.write((Type)Types.VAR_INT, (Object)event.entityId());
                spawnEntityPacket.write(Types.UUID, (Object)mannequinData.uuid());
                spawnEntityPacket.write((Type)Types.VAR_INT, (Object)EntityTypes1_21_6.PLAYER.getId());
                spawnEntityPacket.write((Type)Types.DOUBLE, (Object)mannequinData.x());
                spawnEntityPacket.write((Type)Types.DOUBLE, (Object)mannequinData.y());
                spawnEntityPacket.write((Type)Types.DOUBLE, (Object)mannequinData.z());
                spawnEntityPacket.write((Type)Types.BYTE, (Object)mannequinData.pitch());
                spawnEntityPacket.write((Type)Types.BYTE, (Object)mannequinData.yaw());
                spawnEntityPacket.write((Type)Types.BYTE, (Object)mannequinData.headYaw());
                spawnEntityPacket.write((Type)Types.VAR_INT, (Object)0);
                spawnEntityPacket.write((Type)Types.SHORT, (Object)0);
                spawnEntityPacket.write((Type)Types.SHORT, (Object)0);
                spawnEntityPacket.write((Type)Types.SHORT, (Object)0);
                spawnEntityPacket.send(Protocol1_21_9To1_21_7.class);
                PacketWrapper setEntityDataPacket = PacketWrapper.create((PacketType)ClientboundPackets1_21_6.SET_ENTITY_DATA, (UserConnection)event.user());
                setEntityDataPacket.write((Type)Types.VAR_INT, (Object)event.entityId());
                setEntityDataPacket.write(VersionedTypes.V1_21_6.entityDataList, (Object)mannequinData.entityData());
                setEntityDataPacket.send(Protocol1_21_9To1_21_7.class);
                if (mannequinData.passengers() != null) {
                    PacketWrapper setPassengersPacket = PacketWrapper.create((PacketType)ClientboundPackets1_21_6.SET_PASSENGERS, (UserConnection)event.user());
                    setPassengersPacket.write((Type)Types.VAR_INT, (Object)event.entityId());
                    setPassengersPacket.write(Types.VAR_INT_ARRAY_PRIMITIVE, (Object)mannequinData.passengers());
                    setPassengersPacket.send(Protocol1_21_9To1_21_7.class);
                }
                if (!mannequinData.itemMap().isEmpty()) {
                    PacketWrapper equipment = PacketWrapper.create((PacketType)ClientboundPackets1_21_6.SET_EQUIPMENT, (UserConnection)event.user());
                    equipment.write((Type)Types.VAR_INT, (Object)event.entityId());
                    int i = 0;
                    for (Map.Entry itemEntry : mannequinData.itemMap().entrySet()) {
                        boolean more = i < mannequinData.itemMap().size() - 1;
                        equipment.write((Type)Types.BYTE, (Object)(more ? (byte)((Byte)itemEntry.getKey() | 0xFFFFFF80) : (Byte)itemEntry.getKey()));
                        equipment.write(((Protocol1_21_9To1_21_7)this.protocol).getItemRewriter().mappedItemType(), (Object)((Item)itemEntry.getValue()));
                        ++i;
                    }
                    equipment.send(Protocol1_21_9To1_21_7.class);
                }
                PacketWrapper setHeadRotation = PacketWrapper.create((PacketType)ClientboundPackets1_21_6.ROTATE_HEAD, (UserConnection)event.user());
                setHeadRotation.write((Type)Types.VAR_INT, (Object)event.entityId());
                setHeadRotation.write((Type)Types.BYTE, (Object)mannequinData.headYaw());
                setHeadRotation.send(Protocol1_21_9To1_21_7.class);
                if (!isBundling) {
                    PacketWrapper bundleStart = PacketWrapper.create((PacketType)ClientboundPackets1_21_6.BUNDLE_DELIMITER, (UserConnection)event.user());
                    bundleStart.send(Protocol1_21_9To1_21_7.class);
                }
                event.cancel();
            } else if (event.index() == 15) {
                event.setIndex(18);
            } else if (event.index() == 16) {
                event.setIndex(17);
            } else if (event.index() == 18) {
                event.cancel();
            } else if (event.index() == 19) {
                event.cancel();
            }
        });
    }

    public void registerPackets() {
        ((Protocol1_21_9To1_21_7)this.protocol).replaceClientbound((ClientboundPacketType)ClientboundPackets1_21_9.ADD_ENTITY, wrapper -> {
            int entityId = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            UUID uuid = (UUID)wrapper.passthrough(Types.UUID);
            int entityTypeId = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            double x = (Double)wrapper.passthrough((Type)Types.DOUBLE);
            double y = (Double)wrapper.passthrough((Type)Types.DOUBLE);
            double z = (Double)wrapper.passthrough((Type)Types.DOUBLE);
            Vector3d movement = (Vector3d)wrapper.read(Types.LOW_PRECISION_VECTOR);
            byte pitch = (Byte)wrapper.passthrough((Type)Types.BYTE);
            byte yaw = (Byte)wrapper.passthrough((Type)Types.BYTE);
            byte headYaw = (Byte)wrapper.passthrough((Type)Types.BYTE);
            int data = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            EntityType entityType = this.trackAndRewrite(wrapper, entityTypeId, entityId);
            if (((Protocol1_21_9To1_21_7)this.protocol).getMappingData() != null && entityType == EntityTypes1_21_9.FALLING_BLOCK) {
                int mappedBlockStateId = ((Protocol1_21_9To1_21_7)this.protocol).getMappingData().getNewBlockStateId(data);
                wrapper.set((Type)Types.VAR_INT, 2, (Object)mappedBlockStateId);
            }
            this.writeMovementShorts(wrapper, movement);
            if (EntityTypes1_21_9.getTypeFromId((int)entityTypeId) == EntityTypes1_21_9.MANNEQUIN) {
                String name = this.randomHackyEmptyName();
                MannequinData mannequinData = new MannequinData(uuid, name);
                TrackedEntity trackedEntity = this.tracker(wrapper.user()).entity(entityId);
                trackedEntity.data().put((Object)mannequinData);
                this.sendInitialPlayerInfoUpdate(wrapper.user(), mannequinData, new GameProfile.Property[0]);
                mannequinData.setPosition(x, y, z);
                mannequinData.setRotation(yaw, pitch);
                mannequinData.setHeadYaw(headYaw);
            }
        });
        ((Protocol1_21_9To1_21_7)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_21_9.TELEPORT_ENTITY, this::trackMannequinTeleport);
        ((Protocol1_21_9To1_21_7)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_21_9.ENTITY_POSITION_SYNC, this::trackMannequinTeleport);
        ((Protocol1_21_9To1_21_7)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_21_9.MOVE_ENTITY_POS, wrapper -> this.storeMovementMannequinData(wrapper, true, false));
        ((Protocol1_21_9To1_21_7)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_21_9.MOVE_ENTITY_POS_ROT, wrapper -> this.storeMovementMannequinData(wrapper, true, true));
        ((Protocol1_21_9To1_21_7)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_21_9.MOVE_ENTITY_ROT, wrapper -> this.storeMovementMannequinData(wrapper, false, true));
        ((Protocol1_21_9To1_21_7)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_21_9.ROTATE_HEAD, wrapper -> {
            MannequinData data;
            int vehicleId = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            byte headRotation = (Byte)wrapper.passthrough((Type)Types.BYTE);
            EntityTracker1_21_9 tracker = (EntityTracker1_21_9)this.tracker(wrapper.user());
            TrackedEntity trackedEntity = tracker.entity(vehicleId);
            if (trackedEntity != null && trackedEntity.hasData() && (data = (MannequinData)trackedEntity.data().get(MannequinData.class)) != null) {
                data.setHeadYaw(headRotation);
            }
        });
        ((Protocol1_21_9To1_21_7)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_21_9.SET_PASSENGERS, wrapper -> {
            MannequinData data;
            int vehicleId = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            int[] passengerIds = (int[])wrapper.passthrough(Types.VAR_INT_ARRAY_PRIMITIVE);
            EntityTracker1_21_9 tracker = (EntityTracker1_21_9)this.tracker(wrapper.user());
            TrackedEntity trackedEntity = tracker.entity(vehicleId);
            if (trackedEntity != null && trackedEntity.hasData() && (data = (MannequinData)trackedEntity.data().get(MannequinData.class)) != null) {
                data.setPassengers(passengerIds);
            }
        });
        ((Protocol1_21_9To1_21_7)this.protocol).replaceClientbound((ClientboundPacketType)ClientboundPackets1_21_9.SET_EQUIPMENT, wrapper -> {
            byte slot;
            int entityId = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            TrackedEntity trackedEntity = this.tracker(wrapper.user()).entity(entityId);
            MannequinData mannequinData = trackedEntity != null && trackedEntity.hasData() ? (MannequinData)trackedEntity.data().get(MannequinData.class) : null;
            do {
                slot = (Byte)wrapper.passthrough((Type)Types.BYTE);
                Item item = ((Protocol1_21_9To1_21_7)this.protocol).getItemRewriter().handleItemToClient(wrapper.user(), (Item)wrapper.read(((Protocol1_21_9To1_21_7)this.protocol).getItemRewriter().itemType()));
                wrapper.write(((Protocol1_21_9To1_21_7)this.protocol).getItemRewriter().mappedItemType(), (Object)item);
                if (mannequinData == null) continue;
                mannequinData.setEquipment((byte)(slot & 0x7F), item);
            } while (slot < 0);
        });
        ((Protocol1_21_9To1_21_7)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_21_9.SET_ENTITY_MOTION, wrapper -> {
            wrapper.passthrough((Type)Types.VAR_INT);
            this.writeMovementShorts(wrapper, (Vector3d)wrapper.read(Types.LOW_PRECISION_VECTOR));
        });
        ((Protocol1_21_9To1_21_7)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_21_9.PLAYER_ROTATION, wrapper -> {
            PlayerRotationStorage storage = (PlayerRotationStorage)wrapper.user().get(PlayerRotationStorage.class);
            float yRot = ((Float)wrapper.read((Type)Types.FLOAT)).floatValue();
            if (((Boolean)wrapper.read((Type)Types.BOOLEAN)).booleanValue()) {
                yRot = storage.yaw() + yRot;
            }
            float xRot = ((Float)wrapper.read((Type)Types.FLOAT)).floatValue();
            if (((Boolean)wrapper.read((Type)Types.BOOLEAN)).booleanValue()) {
                xRot = storage.pitch() + xRot;
            }
            wrapper.write((Type)Types.FLOAT, (Object)Float.valueOf(yRot));
            wrapper.write((Type)Types.FLOAT, (Object)Float.valueOf(xRot));
            storage.setRotation(yRot, xRot);
        });
        ((Protocol1_21_9To1_21_7)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_21_9.SET_DEFAULT_SPAWN_POSITION, wrapper -> {
            GlobalBlockPosition pos = (GlobalBlockPosition)wrapper.read(Types.GLOBAL_POSITION);
            wrapper.write(Types.BLOCK_POSITION1_14, (Object)new BlockPosition(pos.x(), pos.y(), pos.z()));
            wrapper.passthrough((Type)Types.FLOAT);
            wrapper.read((Type)Types.FLOAT);
        });
        ((Protocol1_21_9To1_21_7)this.protocol).registerServerbound((ServerboundPacketType)ServerboundPackets1_21_6.MOVE_PLAYER_POS_ROT, wrapper -> {
            wrapper.passthrough((Type)Types.DOUBLE);
            wrapper.passthrough((Type)Types.DOUBLE);
            wrapper.passthrough((Type)Types.DOUBLE);
            this.storePlayerRotation(wrapper);
        });
        ((Protocol1_21_9To1_21_7)this.protocol).registerServerbound((ServerboundPacketType)ServerboundPackets1_21_6.MOVE_PLAYER_ROT, this::storePlayerRotation);
    }

    public EntityType typeFromId(int type) {
        return EntityTypes1_21_9.getTypeFromId((int)type);
    }

    private void storePlayerRotation(PacketWrapper wrapper) {
        float yaw = ((Float)wrapper.passthrough((Type)Types.FLOAT)).floatValue();
        float pitch = ((Float)wrapper.passthrough((Type)Types.FLOAT)).floatValue();
        ((PlayerRotationStorage)wrapper.user().get(PlayerRotationStorage.class)).setRotation(yaw, pitch);
    }

    private void trackMannequinTeleport(PacketWrapper wrapper) {
        int entityId = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
        EntityTracker1_21_9 tracker = (EntityTracker1_21_9)this.tracker(wrapper.user());
        TrackedEntity trackedEntity = tracker.entity(entityId);
        if (trackedEntity == null || !trackedEntity.hasData()) {
            return;
        }
        MannequinData mannequinData = (MannequinData)trackedEntity.data().get(MannequinData.class);
        if (mannequinData == null) {
            return;
        }
        double x = (Double)wrapper.passthrough((Type)Types.DOUBLE);
        double y = (Double)wrapper.passthrough((Type)Types.DOUBLE);
        double z = (Double)wrapper.passthrough((Type)Types.DOUBLE);
        wrapper.passthrough((Type)Types.DOUBLE);
        wrapper.passthrough((Type)Types.DOUBLE);
        wrapper.passthrough((Type)Types.DOUBLE);
        byte yaw = (byte)Math.floor(((Float)wrapper.passthrough((Type)Types.FLOAT)).floatValue() * 256.0f / 360.0f);
        byte pitch = (byte)Math.floor(((Float)wrapper.passthrough((Type)Types.FLOAT)).floatValue() * 256.0f / 360.0f);
        mannequinData.setPosition(x, y, z);
        mannequinData.setRotation(yaw, pitch);
    }

    private void sendPlayerTeamDisplayName(UserConnection connection, MannequinData mannequinData, Tag displayName) {
        Tag nonNullDisplayName = displayName != null ? displayName : new StringTag("Mannequin");
        PacketWrapper addTeam = PacketWrapper.create((PacketType)ClientboundPackets1_21_6.SET_PLAYER_TEAM, (UserConnection)connection);
        addTeam.write(Types.STRING, (Object)mannequinData.name());
        addTeam.write((Type)Types.BYTE, (Object)(mannequinData.hasTeam() ? (byte)2 : 0));
        addTeam.write(Types.TRUSTED_TAG, (Object)nonNullDisplayName);
        addTeam.write((Type)Types.BYTE, (Object)0);
        addTeam.write((Type)Types.VAR_INT, (Object)0);
        addTeam.write((Type)Types.VAR_INT, (Object)0);
        addTeam.write((Type)Types.VAR_INT, (Object)15);
        addTeam.write(Types.TRUSTED_TAG, (Object)nonNullDisplayName);
        addTeam.write(Types.TRUSTED_TAG, (Object)new StringTag(""));
        if (!mannequinData.hasTeam()) {
            addTeam.write(Types.STRING_ARRAY, (Object)new String[]{mannequinData.name()});
            mannequinData.setHasTeam(true);
        }
        addTeam.send(Protocol1_21_9To1_21_7.class);
    }

    private void storeMovementMannequinData(PacketWrapper wrapper, boolean position, boolean rotation) {
        int entityId = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
        TrackedEntity trackedEntity = this.tracker(wrapper.user()).entity(entityId);
        if (trackedEntity == null || !trackedEntity.hasData()) {
            return;
        }
        MannequinData mannequinData = (MannequinData)trackedEntity.data().get(MannequinData.class);
        if (mannequinData == null) {
            return;
        }
        if (position) {
            double deltaX = (double)((Short)wrapper.passthrough((Type)Types.SHORT)).shortValue() / 4096.0;
            double deltaY = (double)((Short)wrapper.passthrough((Type)Types.SHORT)).shortValue() / 4096.0;
            double deltaZ = (double)((Short)wrapper.passthrough((Type)Types.SHORT)).shortValue() / 4096.0;
            mannequinData.setPosition(mannequinData.x() + deltaX, mannequinData.y() + deltaY, mannequinData.z() + deltaZ);
        }
        if (rotation) {
            byte yaw = (Byte)wrapper.passthrough((Type)Types.BYTE);
            byte pitch = (Byte)wrapper.passthrough((Type)Types.BYTE);
            mannequinData.setRotation(yaw, pitch);
        }
    }

    private void writeMovementShorts(PacketWrapper wrapper, Vector3d movement) {
        wrapper.write((Type)Types.SHORT, (Object)VelocityUtil.toLegacyVelocity((double)movement.x()));
        wrapper.write((Type)Types.SHORT, (Object)VelocityUtil.toLegacyVelocity((double)movement.y()));
        wrapper.write((Type)Types.SHORT, (Object)VelocityUtil.toLegacyVelocity((double)movement.z()));
    }

    private String randomHackyEmptyName() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 8; ++i) {
            int random = ThreadLocalRandom.current().nextInt("0123456789AaBbCcDdEeFfKkLlMmNnOoRrXx".length());
            builder.append('\u00a7').append("0123456789AaBbCcDdEeFfKkLlMmNnOoRrXx".charAt(random));
        }
        return builder.toString();
    }

    private void sendPlayerInfoDisplayNameUpdate(UserConnection connection, MannequinData mannequinData, @Nullable Tag displayName) {
        PacketWrapper playerInfo = PacketWrapper.create((PacketType)ClientboundPackets1_21_6.PLAYER_INFO_UPDATE, (UserConnection)connection);
        BitSet actions = new BitSet(8);
        actions.set(5);
        playerInfo.write((Type)Types.PROFILE_ACTIONS_ENUM1_21_4, (Object)actions);
        playerInfo.write((Type)Types.VAR_INT, (Object)1);
        playerInfo.write(Types.UUID, (Object)mannequinData.uuid());
        playerInfo.write(Types.TRUSTED_OPTIONAL_TAG, (Object)displayName);
        playerInfo.send(Protocol1_21_9To1_21_7.class);
        this.sendPlayerTeamDisplayName(connection, mannequinData, displayName);
    }

    private void sendInitialPlayerInfoUpdate(UserConnection connection, MannequinData mannequinData, GameProfile.Property[] properties) {
        PacketWrapper playerInfo = PacketWrapper.create((PacketType)ClientboundPackets1_21_6.PLAYER_INFO_UPDATE, (UserConnection)connection);
        BitSet actions = new BitSet(8);
        for (int i = 0; i < 8; ++i) {
            actions.set(i);
        }
        playerInfo.write((Type)Types.PROFILE_ACTIONS_ENUM1_21_4, (Object)actions);
        playerInfo.write((Type)Types.VAR_INT, (Object)1);
        playerInfo.write(Types.UUID, (Object)mannequinData.uuid());
        playerInfo.write(Types.STRING, (Object)mannequinData.name());
        playerInfo.write(Types.PROFILE_PROPERTY_ARRAY, (Object)properties);
        playerInfo.write((Type)Types.BOOLEAN, (Object)false);
        playerInfo.write((Type)Types.VAR_INT, (Object)0);
        playerInfo.write((Type)Types.BOOLEAN, (Object)false);
        playerInfo.write((Type)Types.VAR_INT, (Object)0);
        playerInfo.write(Types.TRUSTED_OPTIONAL_TAG, null);
        playerInfo.write((Type)Types.VAR_INT, (Object)1000);
        playerInfo.write((Type)Types.BOOLEAN, (Object)true);
        playerInfo.send(Protocol1_21_9To1_21_7.class);
        this.sendPlayerTeamDisplayName(connection, mannequinData, mannequinData.displayName());
    }
}

