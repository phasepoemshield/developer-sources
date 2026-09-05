/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viabackwards.api.BackwardsProtocol
 *  com.viaversion.viabackwards.api.rewriters.EntityRewriter
 *  com.viaversion.viabackwards.protocol.v1_16to1_15_2.storage.PlayerAttributesStorage
 *  com.viaversion.viabackwards.protocol.v1_16to1_15_2.storage.PlayerAttributesStorage$Attribute
 *  com.viaversion.viabackwards.protocol.v1_16to1_15_2.storage.PlayerAttributesStorage$AttributeModifier
 *  com.viaversion.viabackwards.protocol.v1_16to1_15_2.storage.WolfDataMaskStorage
 *  com.viaversion.viabackwards.protocol.v1_16to1_15_2.storage.WorldNameTracker
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.data.entity.StoredEntityData
 *  com.viaversion.viaversion.api.minecraft.ClientWorld
 *  com.viaversion.viaversion.api.minecraft.Particle
 *  com.viaversion.viaversion.api.minecraft.entities.EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_16
 *  com.viaversion.viaversion.api.minecraft.entitydata.EntityData
 *  com.viaversion.viaversion.api.minecraft.entitydata.EntityDataType
 *  com.viaversion.viaversion.api.minecraft.item.Item
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.protocol.remapper.ValueTransformer
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.version.Types1_14
 *  com.viaversion.viaversion.api.type.types.version.Types1_16
 *  com.viaversion.viaversion.libs.gson.JsonElement
 *  com.viaversion.viaversion.protocols.v1_14_4to1_15.packet.ClientboundPackets1_15
 *  com.viaversion.viaversion.protocols.v1_15_2to1_16.packet.ClientboundPackets1_16
 *  com.viaversion.viaversion.util.Key
 */
package com.viaversion.viabackwards.protocol.v1_16to1_15_2.rewriter;

import com.viaversion.viabackwards.api.BackwardsProtocol;
import com.viaversion.viabackwards.api.rewriters.EntityRewriter;
import com.viaversion.viabackwards.protocol.v1_16to1_15_2.Protocol1_16To1_15_2;
import com.viaversion.viabackwards.protocol.v1_16to1_15_2.storage.PlayerAttributesStorage;
import com.viaversion.viabackwards.protocol.v1_16to1_15_2.storage.WolfDataMaskStorage;
import com.viaversion.viabackwards.protocol.v1_16to1_15_2.storage.WorldNameTracker;
import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.data.entity.StoredEntityData;
import com.viaversion.viaversion.api.minecraft.ClientWorld;
import com.viaversion.viaversion.api.minecraft.Particle;
import com.viaversion.viaversion.api.minecraft.entities.EntityType;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_16;
import com.viaversion.viaversion.api.minecraft.entitydata.EntityData;
import com.viaversion.viaversion.api.minecraft.entitydata.EntityDataType;
import com.viaversion.viaversion.api.minecraft.item.Item;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.protocol.remapper.ValueTransformer;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.version.Types1_14;
import com.viaversion.viaversion.api.type.types.version.Types1_16;
import com.viaversion.viaversion.libs.gson.JsonElement;
import com.viaversion.viaversion.protocols.v1_14_4to1_15.packet.ClientboundPackets1_15;
import com.viaversion.viaversion.protocols.v1_15_2to1_16.packet.ClientboundPackets1_16;
import com.viaversion.viaversion.util.Key;
import java.util.UUID;

public class EntityPacketRewriter1_16
extends EntityRewriter<ClientboundPackets1_16, Protocol1_16To1_15_2> {
    private final ValueTransformer<String, Integer> dimensionTransformer = new ValueTransformer<String, Integer>(Types.STRING, (Type)Types.INT){

        public Integer transform(PacketWrapper wrapper, String input) {
            return switch (input = Key.namespaced((String)input)) {
                case "minecraft:the_nether" -> -1;
                case "minecraft:the_end" -> 1;
                default -> 0;
            };
        }
    };

    public EntityPacketRewriter1_16(Protocol1_16To1_15_2 protocol) {
        super((BackwardsProtocol)protocol);
    }

    public void onMappingDataLoaded() {
        super.onMappingDataLoaded();
        this.mapEntityTypeWithData((EntityType)EntityTypes1_16.HOGLIN, (EntityType)EntityTypes1_16.COW).jsonName();
        this.mapEntityTypeWithData((EntityType)EntityTypes1_16.ZOGLIN, (EntityType)EntityTypes1_16.COW).jsonName();
        this.mapEntityTypeWithData((EntityType)EntityTypes1_16.PIGLIN, (EntityType)EntityTypes1_16.ZOMBIFIED_PIGLIN).jsonName();
        this.mapEntityTypeWithData((EntityType)EntityTypes1_16.STRIDER, (EntityType)EntityTypes1_16.MAGMA_CUBE).jsonName();
    }

    protected void registerRewrites() {
        this.filter().handler((event, data) -> {
            JsonElement text;
            data.setDataType(Types1_14.ENTITY_DATA_TYPES.byId(data.dataType().typeId()));
            EntityDataType type = data.dataType();
            if (type == Types1_14.ENTITY_DATA_TYPES.itemType) {
                data.setValue((Object)((Protocol1_16To1_15_2)this.protocol).getItemRewriter().handleItemToClient(event.user(), (Item)data.getValue()));
            } else if (type == Types1_14.ENTITY_DATA_TYPES.optionalBlockStateType) {
                data.setValue((Object)((Protocol1_16To1_15_2)this.protocol).getMappingData().getNewBlockStateId((Integer)data.getValue()));
            } else if (type == Types1_14.ENTITY_DATA_TYPES.particleType) {
                ((Protocol1_16To1_15_2)this.protocol).getParticleRewriter().rewriteParticle(event.user(), (Particle)data.getValue());
            } else if (type == Types1_14.ENTITY_DATA_TYPES.optionalComponentType && (text = (JsonElement)data.value()) != null) {
                ((Protocol1_16To1_15_2)this.protocol).getComponentRewriter().processText(event.user(), text);
            }
        });
        this.filter().type((EntityType)EntityTypes1_16.ZOGLIN).cancel(16);
        this.filter().type((EntityType)EntityTypes1_16.HOGLIN).cancel(15);
        this.filter().type((EntityType)EntityTypes1_16.PIGLIN).cancel(16);
        this.filter().type((EntityType)EntityTypes1_16.PIGLIN).cancel(17);
        this.filter().type((EntityType)EntityTypes1_16.PIGLIN).cancel(18);
        this.filter().type((EntityType)EntityTypes1_16.STRIDER).index(15).handler((event, data) -> {
            boolean baby = (Boolean)data.value();
            data.setTypeAndValue(Types1_14.ENTITY_DATA_TYPES.varIntType, (Object)(baby ? 1 : 3));
        });
        this.filter().type((EntityType)EntityTypes1_16.STRIDER).cancel(16);
        this.filter().type((EntityType)EntityTypes1_16.STRIDER).cancel(17);
        this.filter().type((EntityType)EntityTypes1_16.STRIDER).cancel(18);
        this.filter().type((EntityType)EntityTypes1_16.FISHING_BOBBER).cancel(8);
        this.filter().type((EntityType)EntityTypes1_16.ABSTRACT_ARROW).cancel(8);
        this.filter().type((EntityType)EntityTypes1_16.ABSTRACT_ARROW).handler((event, data) -> {
            if (event.index() >= 8) {
                event.setIndex(event.index() + 1);
            }
        });
        this.filter().type((EntityType)EntityTypes1_16.WOLF).index(16).handler((event, data) -> {
            byte mask = (Byte)data.value();
            StoredEntityData entityData = this.tracker(event.user()).entityData(event.entityId());
            entityData.put((Object)new WolfDataMaskStorage(mask));
        });
        this.filter().type((EntityType)EntityTypes1_16.WOLF).index(20).handler((event, data) -> {
            int angerTime;
            WolfDataMaskStorage wolfData;
            StoredEntityData entityData = this.tracker(event.user()).entityDataIfPresent(event.entityId());
            byte previousMask = 0;
            if (entityData != null && (wolfData = (WolfDataMaskStorage)entityData.get(WolfDataMaskStorage.class)) != null) {
                previousMask = wolfData.tameableMask();
            }
            byte tameableMask = (byte)((angerTime = ((Integer)data.value()).intValue()) > 0 ? previousMask | 2 : previousMask & 0xFFFFFFFD);
            event.createExtraData(new EntityData(16, Types1_14.ENTITY_DATA_TYPES.byteType, (Object)tameableMask));
            event.cancel();
        });
    }

    protected void registerPackets() {
        ((Protocol1_16To1_15_2)this.protocol).replaceClientbound((ClientboundPacketType)ClientboundPackets1_16.ADD_ENTITY, (PacketHandler)new PacketHandlers(){

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
                this.handler(wrapper -> {
                    EntityType entityType = EntityPacketRewriter1_16.this.typeFromId((Integer)wrapper.get((Type)Types.VAR_INT, 1));
                    if (entityType == EntityTypes1_16.LIGHTNING_BOLT) {
                        wrapper.cancel();
                        PacketWrapper spawnLightningPacket = wrapper.create((PacketType)ClientboundPackets1_15.ADD_GLOBAL_ENTITY);
                        spawnLightningPacket.write((Type)Types.VAR_INT, (Object)((Integer)wrapper.get((Type)Types.VAR_INT, 0)));
                        spawnLightningPacket.write((Type)Types.BYTE, (Object)1);
                        spawnLightningPacket.write((Type)Types.DOUBLE, (Object)((Double)wrapper.get((Type)Types.DOUBLE, 0)));
                        spawnLightningPacket.write((Type)Types.DOUBLE, (Object)((Double)wrapper.get((Type)Types.DOUBLE, 1)));
                        spawnLightningPacket.write((Type)Types.DOUBLE, (Object)((Double)wrapper.get((Type)Types.DOUBLE, 2)));
                        spawnLightningPacket.send(Protocol1_16To1_15_2.class);
                    }
                });
                this.handler(EntityPacketRewriter1_16.this.getSpawnTrackerWithDataHandler());
            }
        });
        ((Protocol1_16To1_15_2)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_16.RESPAWN, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(EntityPacketRewriter1_16.this.dimensionTransformer);
                this.handler(wrapper -> {
                    WorldNameTracker worldNameTracker = (WorldNameTracker)wrapper.user().get(WorldNameTracker.class);
                    String nextWorldName = (String)wrapper.read(Types.STRING);
                    wrapper.passthrough((Type)Types.LONG);
                    wrapper.passthrough((Type)Types.UNSIGNED_BYTE);
                    wrapper.read((Type)Types.BYTE);
                    ClientWorld clientWorld = wrapper.user().getClientWorld(Protocol1_16To1_15_2.class);
                    int dimension = (Integer)wrapper.get((Type)Types.INT, 0);
                    if (clientWorld.getEnvironment() != null && dimension == clientWorld.getEnvironment().id() && (wrapper.user().isClientSide() || Via.getPlatform().isProxy() || wrapper.user().getProtocolInfo().protocolVersion().olderThanOrEqualTo(ProtocolVersion.v1_12_2) || !nextWorldName.equals(worldNameTracker.getWorldName()))) {
                        PacketWrapper packet = wrapper.create((PacketType)ClientboundPackets1_15.RESPAWN);
                        packet.write((Type)Types.INT, (Object)(dimension == 0 ? -1 : 0));
                        packet.write((Type)Types.LONG, (Object)0L);
                        packet.write((Type)Types.UNSIGNED_BYTE, (Object)0);
                        packet.write(Types.STRING, (Object)"default");
                        packet.send(Protocol1_16To1_15_2.class);
                    }
                    if (clientWorld.setEnvironment(dimension)) {
                        EntityPacketRewriter1_16.this.tracker(wrapper.user()).clearEntities();
                    }
                    wrapper.write(Types.STRING, (Object)"default");
                    wrapper.read((Type)Types.BOOLEAN);
                    if (((Boolean)wrapper.read((Type)Types.BOOLEAN)).booleanValue()) {
                        wrapper.set(Types.STRING, 0, (Object)"flat");
                    }
                    PlayerAttributesStorage attributes = (PlayerAttributesStorage)wrapper.user().get(PlayerAttributesStorage.class);
                    boolean keepPlayerAttributes = (Boolean)wrapper.read((Type)Types.BOOLEAN);
                    if (keepPlayerAttributes) {
                        wrapper.send(Protocol1_16To1_15_2.class);
                        wrapper.cancel();
                        attributes.sendAttributes(wrapper.user(), EntityPacketRewriter1_16.this.tracker(wrapper.user()).clientEntityId());
                    } else {
                        attributes.clearAttributes();
                    }
                    worldNameTracker.setWorldName(nextWorldName);
                });
            }
        });
        ((Protocol1_16To1_15_2)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_16.LOGIN, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT);
                this.map((Type)Types.UNSIGNED_BYTE);
                this.read((Type)Types.BYTE);
                this.read(Types.STRING_ARRAY);
                this.read(Types.NAMED_COMPOUND_TAG);
                this.map(EntityPacketRewriter1_16.this.dimensionTransformer);
                this.handler(wrapper -> {
                    WorldNameTracker worldNameTracker = (WorldNameTracker)wrapper.user().get(WorldNameTracker.class);
                    worldNameTracker.setWorldName((String)wrapper.read(Types.STRING));
                });
                this.map((Type)Types.LONG);
                this.map((Type)Types.UNSIGNED_BYTE);
                this.handler(wrapper -> {
                    ClientWorld clientWorld = wrapper.user().getClientWorld(Protocol1_16To1_15_2.class);
                    clientWorld.setEnvironment(((Integer)wrapper.get((Type)Types.INT, 1)).intValue());
                    wrapper.write(Types.STRING, (Object)"default");
                    wrapper.passthrough((Type)Types.VAR_INT);
                    wrapper.passthrough((Type)Types.BOOLEAN);
                    wrapper.passthrough((Type)Types.BOOLEAN);
                    wrapper.read((Type)Types.BOOLEAN);
                    if (((Boolean)wrapper.read((Type)Types.BOOLEAN)).booleanValue()) {
                        wrapper.set(Types.STRING, 0, (Object)"flat");
                    }
                });
                this.handler(EntityPacketRewriter1_16.this.playerTrackerHandler());
            }
        });
        this.registerTracker((ClientboundPacketType)ClientboundPackets1_16.ADD_EXPERIENCE_ORB, (EntityType)EntityTypes1_16.EXPERIENCE_ORB);
        this.registerTracker((ClientboundPacketType)ClientboundPackets1_16.ADD_PAINTING, (EntityType)EntityTypes1_16.PAINTING);
        this.registerTracker((ClientboundPacketType)ClientboundPackets1_16.ADD_PLAYER, (EntityType)EntityTypes1_16.PLAYER);
        this.registerSetEntityData((ClientboundPacketType)ClientboundPackets1_16.SET_ENTITY_DATA, Types1_16.ENTITY_DATA_LIST, Types1_14.ENTITY_DATA_LIST);
        ((Protocol1_16To1_15_2)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_16.UPDATE_ATTRIBUTES, wrapper -> {
            PlayerAttributesStorage attributes = (PlayerAttributesStorage)wrapper.user().get(PlayerAttributesStorage.class);
            int entityId = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            int size = (Integer)wrapper.passthrough((Type)Types.INT);
            for (int i = 0; i < size; ++i) {
                String identifier = Key.stripMinecraftNamespace((String)((String)wrapper.read(Types.STRING)));
                String mappedIdentifier = ((Protocol1_16To1_15_2)this.protocol).getMappingData().mappedAttributeIdentifier(identifier);
                wrapper.write(Types.STRING, (Object)mappedIdentifier);
                double value = (Double)wrapper.passthrough((Type)Types.DOUBLE);
                int count = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
                PlayerAttributesStorage.AttributeModifier[] modifiers = new PlayerAttributesStorage.AttributeModifier[count];
                for (int j = 0; j < count; ++j) {
                    UUID uuid = (UUID)wrapper.passthrough(Types.UUID);
                    double amount = (Double)wrapper.passthrough((Type)Types.DOUBLE);
                    byte operation = (Byte)wrapper.passthrough((Type)Types.BYTE);
                    modifiers[j] = new PlayerAttributesStorage.AttributeModifier(uuid, amount, operation);
                }
                if (entityId != this.tracker(wrapper.user()).clientEntityId()) continue;
                attributes.addAttribute(mappedIdentifier, new PlayerAttributesStorage.Attribute(value, modifiers));
            }
        });
        ((Protocol1_16To1_15_2)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_16.PLAYER_INFO, wrapper -> {
            int action = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            int playerCount = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            for (int i = 0; i < playerCount; ++i) {
                wrapper.passthrough(Types.UUID);
                if (action == 0) {
                    wrapper.passthrough(Types.STRING);
                    wrapper.passthrough(Types.PROFILE_PROPERTY_ARRAY);
                    wrapper.passthrough((Type)Types.VAR_INT);
                    wrapper.passthrough((Type)Types.VAR_INT);
                    ((Protocol1_16To1_15_2)this.protocol).getComponentRewriter().processText(wrapper.user(), (JsonElement)wrapper.passthrough(Types.OPTIONAL_COMPONENT));
                    continue;
                }
                if (action == 1) {
                    wrapper.passthrough((Type)Types.VAR_INT);
                    continue;
                }
                if (action == 2) {
                    wrapper.passthrough((Type)Types.VAR_INT);
                    continue;
                }
                if (action != 3) continue;
                ((Protocol1_16To1_15_2)this.protocol).getComponentRewriter().processText(wrapper.user(), (JsonElement)wrapper.passthrough(Types.OPTIONAL_COMPONENT));
            }
        });
    }

    public EntityType typeFromId(int typeId) {
        return EntityTypes1_16.getTypeFromId((int)typeId);
    }
}

