/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.connection.StorableObject
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.RegistryEntry
 *  com.viaversion.viaversion.api.minecraft.entities.EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_21_2
 *  com.viaversion.viaversion.api.minecraft.entitydata.EntityData
 *  com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes1_21_2
 *  com.viaversion.viaversion.api.minecraft.item.Item
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
 *  com.viaversion.viaversion.protocols.v1_20_5to1_21.packet.ClientboundPacket1_21
 *  com.viaversion.viaversion.protocols.v1_20_5to1_21.packet.ClientboundPackets1_21
 *  com.viaversion.viaversion.protocols.v1_21to1_21_2.Protocol1_21To1_21_2
 *  com.viaversion.viaversion.protocols.v1_21to1_21_2.storage.BundleStateTracker
 *  com.viaversion.viaversion.protocols.v1_21to1_21_2.storage.ChunkLoadTracker
 *  com.viaversion.viaversion.protocols.v1_21to1_21_2.storage.ClientVehicleStorage
 *  com.viaversion.viaversion.protocols.v1_21to1_21_2.storage.EntityTracker1_21_2
 *  com.viaversion.viaversion.protocols.v1_21to1_21_2.storage.EntityTracker1_21_2$BoatEntity
 *  com.viaversion.viaversion.protocols.v1_21to1_21_2.storage.GroundFlagTracker
 *  com.viaversion.viaversion.protocols.v1_21to1_21_2.storage.PlayerPositionStorage
 *  com.viaversion.viaversion.protocols.v1_21to1_21_2.storage.PlayerPositionStorage$PlayerPosition
 *  com.viaversion.viaversion.protocols.v1_21to1_21_2.storage.TeleportAckCancelStorage
 */
package com.viaversion.viaversion.protocols.v1_21to1_21_2.rewriter;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.Tag;
import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.connection.StorableObject;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.RegistryEntry;
import com.viaversion.viaversion.api.minecraft.entities.EntityType;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_21_2;
import com.viaversion.viaversion.api.minecraft.entitydata.EntityData;
import com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes1_21_2;
import com.viaversion.viaversion.api.minecraft.item.Item;
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
import com.viaversion.viaversion.protocols.v1_20_5to1_21.packet.ClientboundPacket1_21;
import com.viaversion.viaversion.protocols.v1_20_5to1_21.packet.ClientboundPackets1_21;
import com.viaversion.viaversion.protocols.v1_21to1_21_2.Protocol1_21To1_21_2;
import com.viaversion.viaversion.protocols.v1_21to1_21_2.packet.ClientboundPackets1_21_2;
import com.viaversion.viaversion.protocols.v1_21to1_21_2.packet.ServerboundPackets1_21_2;
import com.viaversion.viaversion.protocols.v1_21to1_21_2.storage.BundleStateTracker;
import com.viaversion.viaversion.protocols.v1_21to1_21_2.storage.ChunkLoadTracker;
import com.viaversion.viaversion.protocols.v1_21to1_21_2.storage.ClientVehicleStorage;
import com.viaversion.viaversion.protocols.v1_21to1_21_2.storage.EntityTracker1_21_2;
import com.viaversion.viaversion.protocols.v1_21to1_21_2.storage.GroundFlagTracker;
import com.viaversion.viaversion.protocols.v1_21to1_21_2.storage.PlayerPositionStorage;
import com.viaversion.viaversion.protocols.v1_21to1_21_2.storage.TeleportAckCancelStorage;
import com.viaversion.viaversion.rewriter.EntityRewriter;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

public final class EntityPacketRewriter1_21_2
extends EntityRewriter<ClientboundPacket1_21, Protocol1_21To1_21_2> {
    private static final String[] GOAT_HORN_INSTRUMENTS = new String[]{"ponder_goat_horn", "sing_goat_horn", "seek_goat_horn", "feel_goat_horn", "admire_goat_horn", "call_goat_horn", "yearn_goat_horn", "dream_goat_horn"};
    private static final float IMPULSE = 0.98f;
    private final boolean isVF = Via.getPlatform().getPlatformName().equals("ViaFabric");

    public EntityPacketRewriter1_21_2(Protocol1_21To1_21_2 protocol1_21To1_21_2) {
        super(protocol1_21To1_21_2);
    }

    @Override
    public void handleEntityData(int n, List<EntityData> list, UserConnection userConnection) {
        super.handleEntityData(n, list, userConnection);
        EntityTracker1_21_2 entityTracker1_21_2 = (EntityTracker1_21_2)this.tracker(userConnection);
        EntityType entityType = entityTracker1_21_2.entityType(n);
        if (entityType == null || !entityType.isOrHasParent((EntityType)EntityTypes1_21_2.ABSTRACT_BOAT)) {
            return;
        }
        List list2 = entityTracker1_21_2.trackedBoatEntity(n).entityData();
        list2.removeIf(entityData -> list.stream().anyMatch(entityData2 -> entityData.id() == entityData2.id()));
        for (EntityData entityData2 : list) {
            Object object = entityData2.value();
            if (object instanceof Item) {
                Item item = (Item)object;
                list2.add(new EntityData(entityData2.id(), entityData2.dataType(), (Object)item.copy()));
                continue;
            }
            list2.add(new EntityData(entityData2.id(), entityData2.dataType(), object));
        }
    }

    protected void registerRewrites() {
        this.dataTypeMapper().register();
        this.registerEntityDataTypeHandler(((EntityDataTypes1_21_2)VersionedTypes.V1_21_2.entityDataTypes).itemType, ((EntityDataTypes1_21_2)VersionedTypes.V1_21_2.entityDataTypes).blockStateType, ((EntityDataTypes1_21_2)VersionedTypes.V1_21_2.entityDataTypes).optionalBlockStateType, ((EntityDataTypes1_21_2)VersionedTypes.V1_21_2.entityDataTypes).particleType, ((EntityDataTypes1_21_2)VersionedTypes.V1_21_2.entityDataTypes).particlesType, ((EntityDataTypes1_21_2)VersionedTypes.V1_21_2.entityDataTypes).componentType, ((EntityDataTypes1_21_2)VersionedTypes.V1_21_2.entityDataTypes).optionalComponentType);
        this.registerBlockStateHandler((EntityType)EntityTypes1_21_2.ABSTRACT_MINECART, 11);
        this.filter().type((EntityType)EntityTypes1_21_2.ABSTRACT_BOAT).handler((entityDataHandlerEvent, entityData) -> {
            PacketWrapper packetWrapper;
            PacketWrapper packetWrapper2;
            int n = entityDataHandlerEvent.index();
            if (n > 11) {
                entityDataHandlerEvent.setIndex(n - 1);
                return;
            }
            if (n != 11) {
                return;
            }
            entityDataHandlerEvent.cancel();
            EntityTracker1_21_2 entityTracker1_21_2 = (EntityTracker1_21_2)this.tracker(entityDataHandlerEvent.user());
            EntityTracker1_21_2.BoatEntity boatEntity = entityTracker1_21_2.trackedBoatEntity(entityDataHandlerEvent.entityId());
            if (boatEntity == null) {
                return;
            }
            boolean bl = ((BundleStateTracker)entityDataHandlerEvent.user().get(BundleStateTracker.class)).isBundling();
            if (!bl) {
                packetWrapper2 = PacketWrapper.create((PacketType)ClientboundPackets1_21_2.BUNDLE_DELIMITER, (UserConnection)entityDataHandlerEvent.user());
                packetWrapper2.send(Protocol1_21To1_21_2.class);
            }
            packetWrapper2 = PacketWrapper.create((PacketType)ClientboundPackets1_21_2.REMOVE_ENTITIES, (UserConnection)entityDataHandlerEvent.user());
            packetWrapper2.write(Types.VAR_INT_ARRAY_PRIMITIVE, (Object)new int[]{entityDataHandlerEvent.entityId()});
            packetWrapper2.send(Protocol1_21To1_21_2.class);
            int n2 = (Integer)entityData.getValue();
            EntityType entityType = entityTracker1_21_2.entityType(entityDataHandlerEvent.entityId()).isOrHasParent((EntityType)EntityTypes1_21_2.ABSTRACT_CHEST_BOAT) ? this.entityTypeFromChestBoatType(n2) : this.entityTypeFromBoatType(n2);
            PacketWrapper packetWrapper3 = PacketWrapper.create((PacketType)ClientboundPackets1_21_2.ADD_ENTITY, (UserConnection)entityDataHandlerEvent.user());
            packetWrapper3.write((Type)Types.VAR_INT, (Object)entityDataHandlerEvent.entityId());
            packetWrapper3.write(Types.UUID, (Object)boatEntity.uuid());
            packetWrapper3.write((Type)Types.VAR_INT, (Object)entityType.getId());
            packetWrapper3.write((Type)Types.DOUBLE, (Object)boatEntity.x());
            packetWrapper3.write((Type)Types.DOUBLE, (Object)boatEntity.y());
            packetWrapper3.write((Type)Types.DOUBLE, (Object)boatEntity.z());
            packetWrapper3.write((Type)Types.BYTE, (Object)((byte)Math.floor(boatEntity.pitch() * 256.0f / 360.0f)));
            packetWrapper3.write((Type)Types.BYTE, (Object)((byte)Math.floor(boatEntity.yaw() * 256.0f / 360.0f)));
            packetWrapper3.write((Type)Types.BYTE, (Object)0);
            packetWrapper3.write((Type)Types.VAR_INT, (Object)boatEntity.data());
            packetWrapper3.write((Type)Types.SHORT, (Object)0);
            packetWrapper3.write((Type)Types.SHORT, (Object)0);
            packetWrapper3.write((Type)Types.SHORT, (Object)0);
            packetWrapper3.send(Protocol1_21To1_21_2.class);
            entityTracker1_21_2.updateBoatType(entityDataHandlerEvent.entityId(), entityType);
            PacketWrapper packetWrapper4 = PacketWrapper.create((PacketType)ClientboundPackets1_21_2.SET_ENTITY_DATA, (UserConnection)entityDataHandlerEvent.user());
            packetWrapper4.write((Type)Types.VAR_INT, (Object)entityDataHandlerEvent.entityId());
            packetWrapper4.write(VersionedTypes.V1_21_2.entityDataList, (Object)boatEntity.entityData());
            packetWrapper4.send(Protocol1_21To1_21_2.class);
            if (boatEntity.passengers() != null) {
                packetWrapper = PacketWrapper.create((PacketType)ClientboundPackets1_21_2.SET_PASSENGERS, (UserConnection)entityDataHandlerEvent.user());
                packetWrapper.write((Type)Types.VAR_INT, (Object)entityDataHandlerEvent.entityId());
                packetWrapper.write(Types.VAR_INT_ARRAY_PRIMITIVE, (Object)boatEntity.passengers());
                packetWrapper.send(Protocol1_21To1_21_2.class);
            }
            if (!bl) {
                packetWrapper = PacketWrapper.create((PacketType)ClientboundPackets1_21_2.BUNDLE_DELIMITER, (UserConnection)entityDataHandlerEvent.user());
                packetWrapper.send(Protocol1_21To1_21_2.class);
            }
        });
        this.filter().type((EntityType)EntityTypes1_21_2.SALMON).addIndex(17);
        this.filter().type((EntityType)EntityTypes1_21_2.AGEABLE_WATER_CREATURE).addIndex(16);
        this.filter().type((EntityType)EntityTypes1_21_2.ABSTRACT_ARROW).addIndex(10);
    }

    public void registerPackets() {
        ((Protocol1_21To1_21_2)this.protocol).appendClientbound((ClientboundPacketType)ClientboundPackets1_21.ADD_ENTITY, packetWrapper -> {
            int n = (Integer)packetWrapper.get((Type)Types.VAR_INT, 1);
            EntityType entityType = this.typeFromId(n);
            if (entityType == null || !entityType.isOrHasParent((EntityType)EntityTypes1_21_2.ABSTRACT_BOAT)) {
                return;
            }
            int n2 = (Integer)packetWrapper.get((Type)Types.VAR_INT, 0);
            UUID uUID = (UUID)packetWrapper.get(Types.UUID, 0);
            double d = (Double)packetWrapper.get((Type)Types.DOUBLE, 0);
            double d2 = (Double)packetWrapper.get((Type)Types.DOUBLE, 1);
            double d3 = (Double)packetWrapper.get((Type)Types.DOUBLE, 2);
            float f = (float)((Byte)packetWrapper.get((Type)Types.BYTE, 0)).byteValue() * 256.0f / 360.0f;
            float f2 = (float)((Byte)packetWrapper.get((Type)Types.BYTE, 1)).byteValue() * 256.0f / 360.0f;
            int n3 = (Integer)packetWrapper.get((Type)Types.VAR_INT, 2);
            EntityTracker1_21_2 entityTracker1_21_2 = (EntityTracker1_21_2)this.tracker(packetWrapper.user());
            EntityTracker1_21_2.BoatEntity boatEntity = entityTracker1_21_2.trackBoatEntity(n2, uUID, n3);
            boatEntity.setPosition(d, d2, d3);
            boatEntity.setRotation(f2, f);
        });
        ((Protocol1_21To1_21_2)this.protocol).appendClientbound((ClientboundPacketType)ClientboundConfigurationPackets1_21.FINISH_CONFIGURATION, packetWrapper -> {
            PacketWrapper packetWrapper2 = packetWrapper.create((PacketType)ClientboundConfigurationPackets1_21.REGISTRY_DATA);
            packetWrapper2.write(Types.STRING, (Object)"minecraft:instrument");
            RegistryEntry[] registryEntryArray = new RegistryEntry[GOAT_HORN_INSTRUMENTS.length];
            for (int i = 0; i < GOAT_HORN_INSTRUMENTS.length; ++i) {
                CompoundTag compoundTag = new CompoundTag();
                compoundTag.putString("sound_event", "item.goat_horn.sound." + i);
                compoundTag.putFloat("use_duration", 7.0f);
                compoundTag.putInt("range", 256);
                compoundTag.putString("description", "");
                registryEntryArray[i] = new RegistryEntry(GOAT_HORN_INSTRUMENTS[i], (Tag)compoundTag);
            }
            packetWrapper2.write(Types.REGISTRY_ENTRY_ARRAY, (Object)registryEntryArray);
            packetWrapper2.send(Protocol1_21To1_21_2.class);
        });
        ((Protocol1_21To1_21_2)this.protocol).replaceClientbound((ClientboundPacketType)ClientboundPackets1_21.LOGIN, (PacketHandler)new PacketHandlers(this){
            final /* synthetic */ EntityPacketRewriter1_21_2 this$0;
            {
                this.this$0 = this$0;
            }

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
                this.handler(this.this$0.worldDataTrackerHandlerByKey1_20_5(3));
                this.handler(this.this$0.playerTrackerHandler());
                this.create((Type)Types.VAR_INT, 64);
            }
        });
        ((Protocol1_21To1_21_2)this.protocol).replaceClientbound((ClientboundPacketType)ClientboundPackets1_21.RESPAWN, packetWrapper -> {
            ChunkLoadTracker chunkLoadTracker;
            int n = (Integer)packetWrapper.passthrough((Type)Types.VAR_INT);
            String string = (String)packetWrapper.passthrough(Types.STRING);
            packetWrapper.passthrough((Type)Types.LONG);
            packetWrapper.passthrough((Type)Types.BYTE);
            packetWrapper.passthrough((Type)Types.BYTE);
            packetWrapper.passthrough((Type)Types.BOOLEAN);
            packetWrapper.passthrough((Type)Types.BOOLEAN);
            packetWrapper.passthrough(Types.OPTIONAL_GLOBAL_POSITION);
            packetWrapper.passthrough((Type)Types.VAR_INT);
            packetWrapper.write((Type)Types.VAR_INT, (Object)64);
            byte by = (Byte)packetWrapper.passthrough((Type)Types.BYTE);
            EntityTracker1_21_2 entityTracker1_21_2 = (EntityTracker1_21_2)this.tracker(packetWrapper.user());
            if (entityTracker1_21_2.currentWorld() != null && !entityTracker1_21_2.currentWorld().equals(string) && (chunkLoadTracker = (ChunkLoadTracker)packetWrapper.user().get(ChunkLoadTracker.class)) != null) {
                chunkLoadTracker.clear();
            }
            this.trackWorldDataByKey1_20_5(packetWrapper.user(), n, string);
            packetWrapper.user().put((StorableObject)new GroundFlagTracker());
            packetWrapper.user().remove(ClientVehicleStorage.class);
            if ((by & 1) == 0) {
                entityTracker1_21_2.setPlayerMaxHealthAttributeValue(20.0);
            }
            if ((by & 2) != 0) {
                PacketWrapper packetWrapper2;
                boolean bl = ((BundleStateTracker)packetWrapper.user().get(BundleStateTracker.class)).isBundling();
                if (!bl) {
                    packetWrapper2 = packetWrapper.create((PacketType)ClientboundPackets1_21_2.BUNDLE_DELIMITER);
                    packetWrapper2.send(Protocol1_21To1_21_2.class);
                }
                packetWrapper.send(Protocol1_21To1_21_2.class);
                packetWrapper.cancel();
                packetWrapper2 = packetWrapper.create((PacketType)ClientboundPackets1_21_2.SET_ENTITY_DATA);
                packetWrapper2.write((Type)Types.VAR_INT, (Object)entityTracker1_21_2.clientEntityId());
                ArrayList<EntityData> arrayList = new ArrayList<EntityData>();
                arrayList.add(new EntityData(6, ((EntityDataTypes1_21_2)VersionedTypes.V1_21_2.entityDataTypes).poseType, (Object)0));
                arrayList.add(new EntityData(9, ((EntityDataTypes1_21_2)VersionedTypes.V1_21_2.entityDataTypes).floatType, (Object)Float.valueOf((float)entityTracker1_21_2.playerMaxHealthAttributeValue())));
                packetWrapper2.write(VersionedTypes.V1_21_2.entityDataList, arrayList);
                packetWrapper2.send(Protocol1_21To1_21_2.class);
                int n2 = ThreadLocalRandom.current().nextInt();
                ((TeleportAckCancelStorage)packetWrapper.user().get(TeleportAckCancelStorage.class)).cancelTeleportId(n2);
                PlayerPositionStorage playerPositionStorage = (PlayerPositionStorage)packetWrapper.user().get(PlayerPositionStorage.class);
                if (playerPositionStorage != null) {
                    playerPositionStorage.sendPing(packetWrapper.user(), ThreadLocalRandom.current().nextInt());
                }
                PacketWrapper packetWrapper3 = packetWrapper.create((PacketType)ClientboundPackets1_21_2.PLAYER_POSITION);
                packetWrapper3.write((Type)Types.VAR_INT, (Object)n2);
                packetWrapper3.write((Type)Types.DOUBLE, (Object)0.0);
                packetWrapper3.write((Type)Types.DOUBLE, (Object)0.0);
                packetWrapper3.write((Type)Types.DOUBLE, (Object)0.0);
                packetWrapper3.write((Type)Types.DOUBLE, (Object)0.0);
                packetWrapper3.write((Type)Types.DOUBLE, (Object)0.0);
                packetWrapper3.write((Type)Types.DOUBLE, (Object)0.0);
                packetWrapper3.write((Type)Types.FLOAT, (Object)Float.valueOf(-180.0f));
                packetWrapper3.write((Type)Types.FLOAT, (Object)Float.valueOf(0.0f));
                packetWrapper3.write((Type)Types.INT, (Object)7);
                packetWrapper3.send(Protocol1_21To1_21_2.class);
                if (!bl) {
                    PacketWrapper packetWrapper4 = packetWrapper.create((PacketType)ClientboundPackets1_21_2.BUNDLE_DELIMITER);
                    packetWrapper4.send(Protocol1_21To1_21_2.class);
                }
            }
        });
        ((Protocol1_21To1_21_2)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_21.PLAYER_POSITION, packetWrapper -> {
            PacketWrapper packetWrapper2;
            packetWrapper.write((Type)Types.VAR_INT, (Object)0);
            packetWrapper.passthrough((Type)Types.DOUBLE);
            packetWrapper.passthrough((Type)Types.DOUBLE);
            packetWrapper.passthrough((Type)Types.DOUBLE);
            packetWrapper.write((Type)Types.DOUBLE, (Object)0.0);
            packetWrapper.write((Type)Types.DOUBLE, (Object)0.0);
            packetWrapper.write((Type)Types.DOUBLE, (Object)0.0);
            packetWrapper.passthrough((Type)Types.FLOAT);
            packetWrapper.passthrough((Type)Types.FLOAT);
            int n = (Byte)packetWrapper.read((Type)Types.BYTE) & 0x1F;
            if ((n & 1) != 0) {
                n |= 0x20;
            }
            if ((n & 2) != 0) {
                n |= 0x40;
            }
            if ((n & 4) != 0) {
                n |= 0x80;
            }
            packetWrapper.write((Type)Types.INT, (Object)n);
            int n2 = (Integer)packetWrapper.read((Type)Types.VAR_INT);
            packetWrapper.set((Type)Types.VAR_INT, 0, (Object)n2);
            PlayerPositionStorage playerPositionStorage = (PlayerPositionStorage)packetWrapper.user().get(PlayerPositionStorage.class);
            if (playerPositionStorage == null) {
                return;
            }
            boolean bl = ((BundleStateTracker)packetWrapper.user().get(BundleStateTracker.class)).isBundling();
            if (!bl) {
                packetWrapper2 = packetWrapper.create((PacketType)ClientboundPackets1_21_2.BUNDLE_DELIMITER);
                packetWrapper2.send(Protocol1_21To1_21_2.class);
            }
            playerPositionStorage.sendPing(packetWrapper.user(), ThreadLocalRandom.current().nextInt());
            packetWrapper.send(Protocol1_21To1_21_2.class);
            packetWrapper.cancel();
            if (!bl) {
                packetWrapper2 = packetWrapper.create((PacketType)ClientboundPackets1_21_2.BUNDLE_DELIMITER);
                packetWrapper2.send(Protocol1_21To1_21_2.class);
            }
        });
        ((Protocol1_21To1_21_2)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_21.SET_PASSENGERS, packetWrapper -> {
            EntityTracker1_21_2 entityTracker1_21_2;
            EntityTracker1_21_2.BoatEntity boatEntity;
            int n = (Integer)packetWrapper.passthrough((Type)Types.VAR_INT);
            int[] nArray = (int[])packetWrapper.passthrough(Types.VAR_INT_ARRAY_PRIMITIVE);
            ClientVehicleStorage clientVehicleStorage = (ClientVehicleStorage)packetWrapper.user().get(ClientVehicleStorage.class);
            if (clientVehicleStorage != null && n == clientVehicleStorage.vehicleId()) {
                packetWrapper.user().remove(ClientVehicleStorage.class);
            }
            if ((boatEntity = (entityTracker1_21_2 = (EntityTracker1_21_2)this.tracker(packetWrapper.user())).trackedBoatEntity(n)) != null) {
                boatEntity.setPassengers(nArray);
            }
            int n2 = this.tracker(packetWrapper.user()).clientEntityId();
            for (int n3 : nArray) {
                if (n3 != n2) continue;
                packetWrapper.user().put((StorableObject)new ClientVehicleStorage(n));
                break;
            }
        });
        ((Protocol1_21To1_21_2)this.protocol).appendClientbound((ClientboundPacketType)ClientboundPackets1_21.REMOVE_ENTITIES, packetWrapper -> {
            int[] nArray;
            ClientVehicleStorage clientVehicleStorage = (ClientVehicleStorage)packetWrapper.user().get(ClientVehicleStorage.class);
            if (clientVehicleStorage == null) {
                return;
            }
            for (int n : nArray = (int[])packetWrapper.get(Types.VAR_INT_ARRAY_PRIMITIVE, 0)) {
                if (n != clientVehicleStorage.vehicleId()) continue;
                packetWrapper.user().remove(ClientVehicleStorage.class);
                break;
            }
        });
        ((Protocol1_21To1_21_2)this.protocol).registerServerbound((ServerboundPacketType)ServerboundPackets1_21_2.PLAYER_INPUT, packetWrapper -> {
            boolean bl;
            boolean bl2;
            packetWrapper.cancel();
            ClientVehicleStorage clientVehicleStorage = (ClientVehicleStorage)packetWrapper.user().get(ClientVehicleStorage.class);
            if (clientVehicleStorage == null) {
                return;
            }
            byte by = (Byte)packetWrapper.read((Type)Types.BYTE);
            boolean bl3 = (by & 4) != 0;
            boolean bl4 = bl2 = (by & 8) != 0;
            float f = bl3 ? 0.98f : (bl2 ? -0.98f : 0.0f);
            boolean bl5 = (by & 1) != 0;
            boolean bl6 = bl = (by & 2) != 0;
            float f2 = bl5 ? 0.98f : (bl ? -0.98f : 0.0f);
            byte by2 = 0;
            if ((by & 0x10) != 0) {
                by2 = (byte)(by2 | 1);
            }
            if ((by & 0x20) != 0) {
                by2 = (byte)(by2 | 2);
            }
            if (packetWrapper.user().isServerSide() && this.isVF) {
                packetWrapper.write((Type)Types.FLOAT, (Object)Float.valueOf(f));
                packetWrapper.write((Type)Types.FLOAT, (Object)Float.valueOf(f2));
                packetWrapper.write((Type)Types.BYTE, (Object)by);
            } else {
                clientVehicleStorage.storeMovement(f, f2, by2);
            }
        });
        ((Protocol1_21To1_21_2)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_21.TELEPORT_ENTITY, (ClientboundPacketType)ClientboundPackets1_21_2.ENTITY_POSITION_SYNC, packetWrapper -> {
            int n = (Integer)packetWrapper.passthrough((Type)Types.VAR_INT);
            double d = (Double)packetWrapper.passthrough((Type)Types.DOUBLE);
            double d2 = (Double)packetWrapper.passthrough((Type)Types.DOUBLE);
            double d3 = (Double)packetWrapper.passthrough((Type)Types.DOUBLE);
            packetWrapper.write((Type)Types.DOUBLE, (Object)0.0);
            packetWrapper.write((Type)Types.DOUBLE, (Object)0.0);
            packetWrapper.write((Type)Types.DOUBLE, (Object)0.0);
            float f = (float)((Byte)packetWrapper.read((Type)Types.BYTE)).byteValue() * 360.0f / 256.0f;
            float f2 = (float)((Byte)packetWrapper.read((Type)Types.BYTE)).byteValue() * 360.0f / 256.0f;
            packetWrapper.write((Type)Types.FLOAT, (Object)Float.valueOf(f));
            packetWrapper.write((Type)Types.FLOAT, (Object)Float.valueOf(f2));
            EntityTracker1_21_2 entityTracker1_21_2 = (EntityTracker1_21_2)this.tracker(packetWrapper.user());
            EntityTracker1_21_2.BoatEntity boatEntity = entityTracker1_21_2.trackedBoatEntity(n);
            if (boatEntity == null) {
                return;
            }
            boatEntity.setPosition(d, d2, d3);
            boatEntity.setRotation(f, f2);
        });
        ((Protocol1_21To1_21_2)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_21.MOVE_ENTITY_POS, packetWrapper -> this.storeEntityPositionRotation(packetWrapper, true, false));
        ((Protocol1_21To1_21_2)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_21.MOVE_ENTITY_POS_ROT, packetWrapper -> this.storeEntityPositionRotation(packetWrapper, true, true));
        ((Protocol1_21To1_21_2)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_21.MOVE_ENTITY_ROT, packetWrapper -> this.storeEntityPositionRotation(packetWrapper, false, true));
        ((Protocol1_21To1_21_2)this.protocol).registerServerbound((ServerboundPacketType)ServerboundPackets1_21_2.MOVE_PLAYER_POS, packetWrapper -> {
            packetWrapper.passthrough((Type)Types.DOUBLE);
            packetWrapper.passthrough((Type)Types.DOUBLE);
            packetWrapper.passthrough((Type)Types.DOUBLE);
            this.handleOnGround(packetWrapper);
        });
        ((Protocol1_21To1_21_2)this.protocol).registerServerbound((ServerboundPacketType)ServerboundPackets1_21_2.MOVE_PLAYER_POS_ROT, packetWrapper -> {
            double d = (Double)packetWrapper.passthrough((Type)Types.DOUBLE);
            double d2 = (Double)packetWrapper.passthrough((Type)Types.DOUBLE);
            double d3 = (Double)packetWrapper.passthrough((Type)Types.DOUBLE);
            float f = ((Float)packetWrapper.passthrough((Type)Types.FLOAT)).floatValue();
            float f2 = ((Float)packetWrapper.passthrough((Type)Types.FLOAT)).floatValue();
            this.handleOnGround(packetWrapper);
            PlayerPositionStorage playerPositionStorage = (PlayerPositionStorage)packetWrapper.user().get(PlayerPositionStorage.class);
            if (playerPositionStorage != null && playerPositionStorage.checkCaptureNextPlayerPositionPacket()) {
                boolean bl = (Boolean)packetWrapper.get((Type)Types.BOOLEAN, 0);
                playerPositionStorage.setPlayerPosition(new PlayerPositionStorage.PlayerPosition(d, d2, d3, f, f2, bl));
                packetWrapper.cancel();
            } else if (((TeleportAckCancelStorage)packetWrapper.user().get(TeleportAckCancelStorage.class)).checkShouldCancelPlayerPositionPacket()) {
                packetWrapper.cancel();
            }
        });
        ((Protocol1_21To1_21_2)this.protocol).registerServerbound((ServerboundPacketType)ServerboundPackets1_21_2.MOVE_PLAYER_ROT, packetWrapper -> {
            packetWrapper.passthrough((Type)Types.FLOAT);
            packetWrapper.passthrough((Type)Types.FLOAT);
            this.handleOnGround(packetWrapper);
            ClientVehicleStorage clientVehicleStorage = (ClientVehicleStorage)packetWrapper.user().get(ClientVehicleStorage.class);
            if (clientVehicleStorage == null || packetWrapper.user().isServerSide() && this.isVF) {
                return;
            }
            packetWrapper.sendToServer(Protocol1_21To1_21_2.class);
            packetWrapper.cancel();
            PacketWrapper packetWrapper2 = packetWrapper.create((PacketType)ServerboundPackets1_20_5.PLAYER_INPUT);
            packetWrapper2.write((Type)Types.FLOAT, (Object)Float.valueOf(clientVehicleStorage.sidewaysMovement()));
            packetWrapper2.write((Type)Types.FLOAT, (Object)Float.valueOf(clientVehicleStorage.forwardMovement()));
            packetWrapper2.write((Type)Types.BYTE, (Object)clientVehicleStorage.flags());
            packetWrapper2.sendToServer(Protocol1_21To1_21_2.class);
        });
        ((Protocol1_21To1_21_2)this.protocol).registerServerbound((ServerboundPacketType)ServerboundPackets1_21_2.MOVE_PLAYER_STATUS_ONLY, packetWrapper -> {
            GroundFlagTracker groundFlagTracker = (GroundFlagTracker)packetWrapper.user().get(GroundFlagTracker.class);
            boolean bl = groundFlagTracker.onGround();
            boolean bl2 = groundFlagTracker.horizontalCollision();
            this.handleOnGround(packetWrapper);
            if (bl == groundFlagTracker.onGround() && bl2 != groundFlagTracker.horizontalCollision()) {
                PacketWrapper packetWrapper2 = packetWrapper;
                this.redirect$doa000$viafabricplus$dontCancelIdlePacket(packetWrapper2);
            }
        });
        ((Protocol1_21To1_21_2)this.protocol).registerServerbound((ServerboundPacketType)ServerboundPackets1_21_2.ACCEPT_TELEPORTATION, packetWrapper -> {
            TeleportAckCancelStorage teleportAckCancelStorage = (TeleportAckCancelStorage)packetWrapper.user().get(TeleportAckCancelStorage.class);
            PlayerPositionStorage playerPositionStorage = (PlayerPositionStorage)packetWrapper.user().get(PlayerPositionStorage.class);
            int n = (Integer)packetWrapper.passthrough((Type)Types.VAR_INT);
            if (teleportAckCancelStorage.checkShouldCancelTeleportAck(n)) {
                packetWrapper.cancel();
                if (playerPositionStorage != null && playerPositionStorage.checkHasPlayerPosition()) {
                    playerPositionStorage.reset();
                    teleportAckCancelStorage.checkShouldCancelPlayerPositionPacket();
                }
                return;
            }
            if (playerPositionStorage != null && playerPositionStorage.checkHasPlayerPosition()) {
                packetWrapper.sendToServer(Protocol1_21To1_21_2.class);
                packetWrapper.cancel();
                playerPositionStorage.sendMovePlayerPosRot(packetWrapper.user());
            }
        });
    }

    public EntityType typeFromId(int n) {
        return EntityTypes1_21_2.getTypeFromId((int)n);
    }

    private void redirect$doa000$viafabricplus$dontCancelIdlePacket(PacketWrapper packetWrapper) {
    }

    private void handleOnGround(PacketWrapper packetWrapper) {
        GroundFlagTracker groundFlagTracker = (GroundFlagTracker)packetWrapper.user().get(GroundFlagTracker.class);
        short s = (Short)packetWrapper.read((Type)Types.UNSIGNED_BYTE);
        packetWrapper.write((Type)Types.BOOLEAN, (Object)groundFlagTracker.setOnGround((s & 1) != 0));
        groundFlagTracker.setHorizontalCollision((s & 2) != 0);
    }

    private EntityType entityTypeFromBoatType(int n) {
        if (n == 0) {
            return EntityTypes1_21_2.OAK_BOAT;
        }
        if (n == 1) {
            return EntityTypes1_21_2.SPRUCE_BOAT;
        }
        if (n == 2) {
            return EntityTypes1_21_2.BIRCH_BOAT;
        }
        if (n == 3) {
            return EntityTypes1_21_2.JUNGLE_BOAT;
        }
        if (n == 4) {
            return EntityTypes1_21_2.ACACIA_BOAT;
        }
        if (n == 5) {
            return EntityTypes1_21_2.CHERRY_BOAT;
        }
        if (n == 6) {
            return EntityTypes1_21_2.DARK_OAK_BOAT;
        }
        if (n == 7) {
            return EntityTypes1_21_2.MANGROVE_BOAT;
        }
        if (n == 8) {
            return EntityTypes1_21_2.BAMBOO_RAFT;
        }
        return EntityTypes1_21_2.OAK_BOAT;
    }

    private void storeEntityPositionRotation(PacketWrapper packetWrapper, boolean bl, boolean bl2) {
        int n = (Integer)packetWrapper.passthrough((Type)Types.VAR_INT);
        EntityTracker1_21_2 entityTracker1_21_2 = (EntityTracker1_21_2)this.tracker(packetWrapper.user());
        EntityTracker1_21_2.BoatEntity boatEntity = entityTracker1_21_2.trackedBoatEntity(n);
        if (boatEntity == null) {
            return;
        }
        if (bl) {
            double d = (double)((Short)packetWrapper.passthrough((Type)Types.SHORT)).shortValue() / 4096.0;
            double d2 = (double)((Short)packetWrapper.passthrough((Type)Types.SHORT)).shortValue() / 4096.0;
            double d3 = (double)((Short)packetWrapper.passthrough((Type)Types.SHORT)).shortValue() / 4096.0;
            boatEntity.setPosition(boatEntity.x() + d, boatEntity.y() + d2, boatEntity.z() + d3);
        }
        if (bl2) {
            float f = (float)((Byte)packetWrapper.passthrough((Type)Types.BYTE)).byteValue() * 360.0f / 256.0f;
            float f2 = (float)((Byte)packetWrapper.passthrough((Type)Types.BYTE)).byteValue() * 360.0f / 256.0f;
            boatEntity.setRotation(f, f2);
        }
    }

    private EntityType entityTypeFromChestBoatType(int n) {
        if (n == 0) {
            return EntityTypes1_21_2.OAK_CHEST_BOAT;
        }
        if (n == 1) {
            return EntityTypes1_21_2.SPRUCE_CHEST_BOAT;
        }
        if (n == 2) {
            return EntityTypes1_21_2.BIRCH_CHEST_BOAT;
        }
        if (n == 3) {
            return EntityTypes1_21_2.JUNGLE_CHEST_BOAT;
        }
        if (n == 4) {
            return EntityTypes1_21_2.ACACIA_CHEST_BOAT;
        }
        if (n == 5) {
            return EntityTypes1_21_2.CHERRY_CHEST_BOAT;
        }
        if (n == 6) {
            return EntityTypes1_21_2.DARK_OAK_CHEST_BOAT;
        }
        if (n == 7) {
            return EntityTypes1_21_2.MANGROVE_CHEST_BOAT;
        }
        if (n == 8) {
            return EntityTypes1_21_2.BAMBOO_CHEST_RAFT;
        }
        return EntityTypes1_21_2.OAK_CHEST_BOAT;
    }
}

