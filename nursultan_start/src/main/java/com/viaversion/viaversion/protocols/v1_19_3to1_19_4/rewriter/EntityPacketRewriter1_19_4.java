/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.ByteTag
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.ListTag
 *  com.viaversion.nbt.tag.StringTag
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viaversion.api.connection.StorableObject
 *  com.viaversion.viaversion.api.minecraft.entities.EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_19_4
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.version.Types1_19_3
 *  com.viaversion.viaversion.api.type.types.version.Types1_19_4
 *  com.viaversion.viaversion.protocols.v1_19_3to1_19_4.storage.PlayerVehicleTracker
 *  com.viaversion.viaversion.rewriter.EntityRewriter
 *  com.viaversion.viaversion.util.TagUtil
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package com.viaversion.viaversion.protocols.v1_19_3to1_19_4.rewriter;

import com.viaversion.nbt.tag.ByteTag;
import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.ListTag;
import com.viaversion.nbt.tag.StringTag;
import com.viaversion.nbt.tag.Tag;
import com.viaversion.viaversion.api.connection.StorableObject;
import com.viaversion.viaversion.api.minecraft.entities.EntityType;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_19_4;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.version.Types1_19_3;
import com.viaversion.viaversion.api.type.types.version.Types1_19_4;
import com.viaversion.viaversion.protocols.v1_19_1to1_19_3.packet.ClientboundPackets1_19_3;
import com.viaversion.viaversion.protocols.v1_19_3to1_19_4.Protocol1_19_3To1_19_4;
import com.viaversion.viaversion.protocols.v1_19_3to1_19_4.packet.ClientboundPackets1_19_4;
import com.viaversion.viaversion.protocols.v1_19_3to1_19_4.storage.PlayerVehicleTracker;
import com.viaversion.viaversion.rewriter.EntityRewriter;
import com.viaversion.viaversion.util.TagUtil;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public final class EntityPacketRewriter1_19_4
extends EntityRewriter<ClientboundPackets1_19_3, Protocol1_19_3To1_19_4> {
    static /* synthetic */ Protocol access$000(EntityPacketRewriter1_19_4 entityPacketRewriter1_19_4) {
        return entityPacketRewriter1_19_4.protocol;
    }

    public EntityPacketRewriter1_19_4(Protocol1_19_3To1_19_4 protocol1_19_3To1_19_4) {
        super((Protocol)protocol1_19_3To1_19_4);
    }

    protected void registerRewrites() {
        this.filter().mapDataType(n -> Types1_19_4.ENTITY_DATA_TYPES.byId(n >= 14 ? n + 1 : n));
        this.registerEntityDataTypeHandler(Types1_19_4.ENTITY_DATA_TYPES.itemType, Types1_19_4.ENTITY_DATA_TYPES.blockStateType, Types1_19_4.ENTITY_DATA_TYPES.optionalBlockStateType, Types1_19_4.ENTITY_DATA_TYPES.particleType, null);
        this.registerBlockStateHandler((EntityType)EntityTypes1_19_4.ABSTRACT_MINECART, 11);
        this.filter().type((EntityType)EntityTypes1_19_4.BOAT).index(11).handler((entityDataHandlerEvent, entityData) -> {
            int n = (Integer)entityData.value();
            if (n > 4) {
                entityData.setValue((Object)(n + 1));
            }
        });
        this.filter().type((EntityType)EntityTypes1_19_4.ABSTRACT_HORSE).removeIndex(18);
    }

    public void registerPackets() {
        ((Protocol1_19_3To1_19_4)this.protocol).registerClientbound(ClientboundPackets1_19_3.LOGIN, (PacketHandler)new PacketHandlers(this){
            final /* synthetic */ EntityPacketRewriter1_19_4 this$0;
            {
                this.this$0 = this$0;
            }

            public void register() {
                this.map((Type)Types.INT);
                this.map((Type)Types.BOOLEAN);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.BYTE);
                this.map(Types.STRING_ARRAY);
                this.map(Types.NAMED_COMPOUND_TAG);
                this.map(Types.STRING);
                this.map(Types.STRING);
                this.handler(this.this$0.dimensionDataHandler());
                this.handler(this.this$0.biomeSizeTracker());
                this.handler(this.this$0.worldDataTrackerHandlerByKey());
                this.handler(this.this$0.playerTrackerHandler());
                this.handler(wrapper -> {
                    CompoundTag registry = (CompoundTag)wrapper.get(Types.NAMED_COMPOUND_TAG, 0);
                    CompoundTag damageTypeRegistry = ((Protocol1_19_3To1_19_4)EntityPacketRewriter1_19_4.access$000(this.this$0)).getMappingData().damageTypesRegistry();
                    registry.put("minecraft:damage_type", (Tag)damageTypeRegistry);
                    CompoundTag trimMaterialRegistry = new CompoundTag();
                    trimMaterialRegistry.putString("type", "minecraft:trim_material");
                    trimMaterialRegistry.put("value", (Tag)new ListTag(CompoundTag.class));
                    registry.put("minecraft:trim_material", (Tag)trimMaterialRegistry);
                    ListTag biomes = TagUtil.getRegistryEntries((CompoundTag)registry, (String)"worldgen/biome");
                    for (CompoundTag biomeTag : biomes) {
                        CompoundTag biomeData = biomeTag.getCompoundTag("element");
                        StringTag precipitation = biomeData.getStringTag("precipitation");
                        byte precipitationByte = precipitation.getValue().equals("none") ? (byte)0 : (byte)1;
                        biomeData.put("has_precipitation", (Tag)new ByteTag(precipitationByte));
                    }
                });
            }
        });
        ((Protocol1_19_3To1_19_4)this.protocol).registerClientbound(ClientboundPackets1_19_3.PLAYER_POSITION, (PacketHandler)new PacketHandlers(this){
            final /* synthetic */ EntityPacketRewriter1_19_4 this$0;
            {
                this.this$0 = this$0;
            }

            protected void register() {
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.FLOAT);
                this.map((Type)Types.FLOAT);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.VAR_INT);
                this.handler(wrapper -> {
                    PlayerVehicleTracker playerVehicleTracker;
                    if (((Boolean)wrapper.read((Type)Types.BOOLEAN)).booleanValue() && (playerVehicleTracker = (PlayerVehicleTracker)wrapper.user().get(PlayerVehicleTracker.class)).getVehicleId() != -1) {
                        PacketWrapper bundleStart = wrapper.create((PacketType)ClientboundPackets1_19_4.BUNDLE_DELIMITER);
                        bundleStart.send(Protocol1_19_3To1_19_4.class);
                        PacketWrapper setPassengers = wrapper.create((PacketType)ClientboundPackets1_19_4.SET_PASSENGERS);
                        setPassengers.write((Type)Types.VAR_INT, (Object)playerVehicleTracker.getVehicleId());
                        setPassengers.write(Types.VAR_INT_ARRAY_PRIMITIVE, (Object)new int[0]);
                        setPassengers.send(Protocol1_19_3To1_19_4.class);
                        wrapper.send(Protocol1_19_3To1_19_4.class);
                        wrapper.cancel();
                        PacketWrapper bundleEnd = wrapper.create((PacketType)ClientboundPackets1_19_4.BUNDLE_DELIMITER);
                        bundleEnd.send(Protocol1_19_3To1_19_4.class);
                        playerVehicleTracker.setVehicleId(-1);
                    }
                });
            }
        });
        ((Protocol1_19_3To1_19_4)this.protocol).registerClientbound(ClientboundPackets1_19_3.SET_PASSENGERS, (PacketHandler)new PacketHandlers(this){
            final /* synthetic */ EntityPacketRewriter1_19_4 this$0;
            {
                this.this$0 = this$0;
            }

            protected void register() {
                this.map((Type)Types.VAR_INT);
                this.map(Types.VAR_INT_ARRAY_PRIMITIVE);
                this.handler(wrapper -> {
                    int[] passengerIds;
                    PlayerVehicleTracker playerVehicleTracker = (PlayerVehicleTracker)wrapper.user().get(PlayerVehicleTracker.class);
                    int clientEntityId = wrapper.user().getEntityTracker(Protocol1_19_3To1_19_4.class).clientEntityId();
                    int vehicleId = (Integer)wrapper.get((Type)Types.VAR_INT, 0);
                    if (playerVehicleTracker.getVehicleId() == vehicleId) {
                        playerVehicleTracker.setVehicleId(-1);
                    }
                    for (int passengerId : passengerIds = (int[])wrapper.get(Types.VAR_INT_ARRAY_PRIMITIVE, 0)) {
                        if (passengerId != clientEntityId) continue;
                        playerVehicleTracker.setVehicleId(vehicleId);
                        break;
                    }
                });
            }
        });
        ((Protocol1_19_3To1_19_4)this.protocol).registerClientbound(ClientboundPackets1_19_3.TELEPORT_ENTITY, (PacketHandler)new PacketHandlers(this){
            final /* synthetic */ EntityPacketRewriter1_19_4 this$0;
            {
                this.this$0 = this$0;
            }

            protected void register() {
                this.handler(wrapper -> {
                    int clientEntityId;
                    int entityId = (Integer)wrapper.read((Type)Types.VAR_INT);
                    if (entityId != (clientEntityId = wrapper.user().getEntityTracker(Protocol1_19_3To1_19_4.class).clientEntityId())) {
                        wrapper.write((Type)Types.VAR_INT, (Object)entityId);
                        return;
                    }
                    wrapper.setPacketType((PacketType)ClientboundPackets1_19_4.PLAYER_POSITION);
                    wrapper.passthrough((Type)Types.DOUBLE);
                    wrapper.passthrough((Type)Types.DOUBLE);
                    wrapper.passthrough((Type)Types.DOUBLE);
                    wrapper.write((Type)Types.FLOAT, (Object)Float.valueOf((float)((Byte)wrapper.read((Type)Types.BYTE)).byteValue() * 360.0f / 256.0f));
                    wrapper.write((Type)Types.FLOAT, (Object)Float.valueOf((float)((Byte)wrapper.read((Type)Types.BYTE)).byteValue() * 360.0f / 256.0f));
                    wrapper.read((Type)Types.BOOLEAN);
                    wrapper.write((Type)Types.BYTE, (Object)0);
                    wrapper.write((Type)Types.VAR_INT, (Object)-1);
                });
            }
        });
        ((Protocol1_19_3To1_19_4)this.protocol).registerClientbound(ClientboundPackets1_19_3.ANIMATE, (PacketHandler)new PacketHandlers(this){
            final /* synthetic */ EntityPacketRewriter1_19_4 this$0;
            {
                this.this$0 = this$0;
            }

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.handler(wrapper -> {
                    short action = (Short)wrapper.read((Type)Types.UNSIGNED_BYTE);
                    if (action != 1) {
                        wrapper.write((Type)Types.UNSIGNED_BYTE, (Object)action);
                        return;
                    }
                    wrapper.setPacketType((PacketType)ClientboundPackets1_19_4.HURT_ANIMATION);
                    wrapper.write((Type)Types.FLOAT, (Object)Float.valueOf(0.0f));
                });
            }
        });
        ((Protocol1_19_3To1_19_4)this.protocol).registerClientbound(ClientboundPackets1_19_3.RESPAWN, (PacketHandler)new PacketHandlers(this){
            final /* synthetic */ EntityPacketRewriter1_19_4 this$0;
            {
                this.this$0 = this$0;
            }

            public void register() {
                this.map(Types.STRING);
                this.map(Types.STRING);
                this.handler(this.this$0.worldDataTrackerHandlerByKey());
                this.handler(wrapper -> wrapper.user().put((StorableObject)new PlayerVehicleTracker()));
            }
        });
        ((Protocol1_19_3To1_19_4)this.protocol).registerClientbound(ClientboundPackets1_19_3.ENTITY_EVENT, packetWrapper -> {
            int n = (Integer)packetWrapper.read((Type)Types.INT);
            byte by = (Byte)packetWrapper.read((Type)Types.BYTE);
            int n2 = this.damageTypeFromEntityEvent(by);
            if (n2 != -1) {
                packetWrapper.setPacketType((PacketType)ClientboundPackets1_19_4.DAMAGE_EVENT);
                packetWrapper.write((Type)Types.VAR_INT, (Object)n);
                packetWrapper.write((Type)Types.VAR_INT, (Object)n2);
                packetWrapper.write((Type)Types.VAR_INT, (Object)0);
                packetWrapper.write((Type)Types.VAR_INT, (Object)0);
                packetWrapper.write((Type)Types.BOOLEAN, (Object)false);
                return;
            }
            packetWrapper.write((Type)Types.INT, (Object)n);
            packetWrapper.write((Type)Types.BYTE, (Object)by);
        });
        this.registerSetEntityData(ClientboundPackets1_19_3.SET_ENTITY_DATA, Types1_19_3.ENTITY_DATA_LIST, Types1_19_4.ENTITY_DATA_LIST);
        this.handler$dpm000$viafabricplus$fixTeleportBehaviour(null);
    }

    public EntityType typeFromId(int n) {
        return EntityTypes1_19_4.getTypeFromId((int)n);
    }

    private void handler$dpm000$viafabricplus$fixTeleportBehaviour(CallbackInfo callbackInfo) {
        ((Protocol1_19_3To1_19_4)this.protocol).registerClientbound(ClientboundPackets1_19_3.TELEPORT_ENTITY, ClientboundPackets1_19_4.TELEPORT_ENTITY, packetWrapper -> {}, true);
    }

    private int damageTypeFromEntityEvent(byte by) {
        return switch (by) {
            case 33 -> 36;
            case 36 -> 5;
            case 37 -> 27;
            case 57 -> 15;
            case 2, 44 -> 16;
            default -> -1;
        };
    }
}

