/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.Holder
 *  com.viaversion.viaversion.api.minecraft.RegistryEntry
 *  com.viaversion.viaversion.api.minecraft.entities.EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_21_5
 *  com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes1_21_2
 *  com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes1_21_5
 *  com.viaversion.viaversion.api.minecraft.item.StructuredItem
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.version.VersionedTypes
 *  com.viaversion.viaversion.protocols.v1_21_4to1_21_5.storage.MessageIndexStorage
 *  com.viaversion.viaversion.protocols.v1_21to1_21_2.packet.ClientboundPackets1_21_2
 *  com.viaversion.viaversion.rewriter.EntityRewriter
 *  com.viaversion.viaversion.rewriter.entitydata.EntityDataHandlerEvent
 */
package com.viaversion.viaversion.protocols.v1_21_4to1_21_5.rewriter;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.Tag;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.Holder;
import com.viaversion.viaversion.api.minecraft.RegistryEntry;
import com.viaversion.viaversion.api.minecraft.entities.EntityType;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_21_5;
import com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes1_21_2;
import com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes1_21_5;
import com.viaversion.viaversion.api.minecraft.item.StructuredItem;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.version.VersionedTypes;
import com.viaversion.viaversion.protocols.v1_20_5to1_21.packet.ClientboundConfigurationPackets1_21;
import com.viaversion.viaversion.protocols.v1_21_4to1_21_5.Protocol1_21_4To1_21_5;
import com.viaversion.viaversion.protocols.v1_21_4to1_21_5.packet.ClientboundPackets1_21_5;
import com.viaversion.viaversion.protocols.v1_21_4to1_21_5.storage.MessageIndexStorage;
import com.viaversion.viaversion.protocols.v1_21to1_21_2.packet.ClientboundPacket1_21_2;
import com.viaversion.viaversion.protocols.v1_21to1_21_2.packet.ClientboundPackets1_21_2;
import com.viaversion.viaversion.rewriter.EntityRewriter;
import com.viaversion.viaversion.rewriter.entitydata.EntityDataHandlerEvent;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

public final class EntityPacketRewriter1_21_5
extends EntityRewriter<ClientboundPacket1_21_2, Protocol1_21_4To1_21_5> {
    private static final int ATTACK_BLOCKED_ENTITY_EVENT = 29;
    private static final int SHIELD_DISABLED_ENTITY_EVENT = 30;
    private static final int SADDLE_ITEM_ID = 800;
    private static final byte SADDLE_EQUIPMENT_SLOT = 7;

    public EntityPacketRewriter1_21_5(Protocol1_21_4To1_21_5 protocol) {
        super((Protocol)protocol);
    }

    protected void registerRewrites() {
        this.dataTypeMapper().added(((EntityDataTypes1_21_5)VersionedTypes.V1_21_5.entityDataTypes).cowVariantType).added(((EntityDataTypes1_21_5)VersionedTypes.V1_21_5.entityDataTypes).wolfSoundVariantType).added(((EntityDataTypes1_21_5)VersionedTypes.V1_21_5.entityDataTypes).pigVariantType).added(((EntityDataTypes1_21_5)VersionedTypes.V1_21_5.entityDataTypes).chickenVariantType).skip(((EntityDataTypes1_21_2)VersionedTypes.V1_21_4.entityDataTypes).wolfVariantType).register();
        this.filter().dataType(((EntityDataTypes1_21_2)VersionedTypes.V1_21_4.entityDataTypes).wolfVariantType).handler((event, data) -> {
            Holder wolfVariant = (Holder)data.value();
            data.setTypeAndValue(((EntityDataTypes1_21_5)VersionedTypes.V1_21_5.entityDataTypes).wolfVariantType, (Object)(wolfVariant.hasId() ? wolfVariant.id() : 0));
        });
        this.registerEntityDataTypeHandler(((EntityDataTypes1_21_5)VersionedTypes.V1_21_5.entityDataTypes).itemType, ((EntityDataTypes1_21_5)VersionedTypes.V1_21_5.entityDataTypes).blockStateType, ((EntityDataTypes1_21_5)VersionedTypes.V1_21_5.entityDataTypes).optionalBlockStateType, ((EntityDataTypes1_21_5)VersionedTypes.V1_21_5.entityDataTypes).particleType, ((EntityDataTypes1_21_5)VersionedTypes.V1_21_5.entityDataTypes).particlesType, ((EntityDataTypes1_21_5)VersionedTypes.V1_21_5.entityDataTypes).componentType, ((EntityDataTypes1_21_5)VersionedTypes.V1_21_5.entityDataTypes).optionalComponentType);
        this.filter().type((EntityType)EntityTypes1_21_5.ABSTRACT_MINECART).index(11).handler((event, data) -> {
            int state = (Integer)data.getValue();
            int mappedBlockState = ((Protocol1_21_4To1_21_5)this.protocol).getMappingData().getNewBlockStateId(state);
            if (mappedBlockState == 0) {
                event.cancel();
                return;
            }
            data.setTypeAndValue(((EntityDataTypes1_21_5)VersionedTypes.V1_21_5.entityDataTypes).optionalBlockStateType, (Object)mappedBlockState);
        });
        this.filter().type((EntityType)EntityTypes1_21_5.ABSTRACT_MINECART).removeIndex(13);
        this.filter().type((EntityType)EntityTypes1_21_5.MOOSHROOM).index(17).handler((event, data) -> {
            String typeName = (String)data.value();
            int typeId = typeName.equals("red") ? 0 : 1;
            data.setTypeAndValue(((EntityDataTypes1_21_5)VersionedTypes.V1_21_5.entityDataTypes).varIntType, (Object)typeId);
        });
        this.filter().type((EntityType)EntityTypes1_21_5.PIG).index(17).handler((event, data) -> {
            boolean saddled = (Boolean)data.value();
            this.sendSaddleEquipment(event, saddled);
        });
        this.filter().type((EntityType)EntityTypes1_21_5.PIG).removeIndex(17);
        this.filter().type((EntityType)EntityTypes1_21_5.STRIDER).index(19).handler((event, data) -> {
            event.cancel();
            boolean saddled = (Boolean)data.value();
            this.sendSaddleEquipment(event, saddled);
        });
        this.filter().type((EntityType)EntityTypes1_21_5.ABSTRACT_HORSE).index(17).handler((event, data) -> {
            byte flags = (Byte)data.value();
            this.sendSaddleEquipment(event, (flags & 4) != 0);
        });
        this.filter().type((EntityType)EntityTypes1_21_5.DOLPHIN).removeIndex(17);
        this.filter().type((EntityType)EntityTypes1_21_5.TURTLE).cancel(22);
        this.filter().type((EntityType)EntityTypes1_21_5.TURTLE).cancel(21);
        this.filter().type((EntityType)EntityTypes1_21_5.TURTLE).cancel(20);
        this.filter().type((EntityType)EntityTypes1_21_5.TURTLE).removeIndex(17);
    }

    public void registerPackets() {
        ((Protocol1_21_4To1_21_5)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_21_2.ADD_EXPERIENCE_ORB, ClientboundPackets1_21_5.ADD_ENTITY, wrapper -> {
            wrapper.passthrough((Type)Types.VAR_INT);
            wrapper.write(Types.UUID, (Object)UUID.randomUUID());
            wrapper.write((Type)Types.VAR_INT, (Object)EntityTypes1_21_5.EXPERIENCE_ORB.getId());
            wrapper.passthrough((Type)Types.DOUBLE);
            wrapper.passthrough((Type)Types.DOUBLE);
            wrapper.passthrough((Type)Types.DOUBLE);
            wrapper.write((Type)Types.BYTE, (Object)0);
            wrapper.write((Type)Types.BYTE, (Object)0);
            wrapper.write((Type)Types.BYTE, (Object)0);
            wrapper.passthroughAndMap((Type)Types.SHORT, (Type)Types.VAR_INT);
            wrapper.write((Type)Types.SHORT, (Object)0);
            wrapper.write((Type)Types.SHORT, (Object)0);
            wrapper.write((Type)Types.SHORT, (Object)0);
        });
        ((Protocol1_21_4To1_21_5)this.protocol).appendClientbound(ClientboundConfigurationPackets1_21.FINISH_CONFIGURATION, wrapper -> {
            this.sendEntityVariants(wrapper.user(), "minecraft:frog_variant", "frog", true, "temperate", "warm", "cold");
            this.sendEntityVariants(wrapper.user(), "minecraft:cat_variant", "cat", false, "tabby", "black", "red", "siamese", "british_shorthair", "calico", "persian", "ragdoll", "white", "jellie", "all_black");
            this.sendEntityVariants(wrapper.user(), "minecraft:pig_variant", "pig", true, "temperate");
            this.sendEntityVariants(wrapper.user(), "minecraft:cow_variant", "cow", true, "temperate");
            this.sendEntityVariants(wrapper.user(), "minecraft:chicken_variant", "chicken", true, "temperate");
            PacketWrapper wolfSoundVariantsPacket = PacketWrapper.create((PacketType)ClientboundConfigurationPackets1_21.REGISTRY_DATA, (UserConnection)wrapper.user());
            wolfSoundVariantsPacket.write(Types.STRING, (Object)"minecraft:wolf_sound_variant");
            wolfSoundVariantsPacket.write(Types.REGISTRY_ENTRY_ARRAY, (Object)new RegistryEntry[]{this.wolfSoundVariant()});
            wolfSoundVariantsPacket.send(Protocol1_21_4To1_21_5.class);
        });
        ((Protocol1_21_4To1_21_5)this.protocol).appendClientbound((ClientboundPacketType)ClientboundPackets1_21_2.LOGIN, wrapper -> ((MessageIndexStorage)wrapper.user().get(MessageIndexStorage.class)).setIndex(0));
        ((Protocol1_21_4To1_21_5)this.protocol).replaceClientbound((ClientboundPacketType)ClientboundPackets1_21_2.SET_PLAYER_TEAM, wrapper -> {
            wrapper.passthrough(Types.STRING);
            byte action = (Byte)wrapper.passthrough((Type)Types.BYTE);
            if (action == 0 || action == 2) {
                ((Protocol1_21_4To1_21_5)this.protocol).getComponentRewriter().passthroughAndProcess(wrapper);
                wrapper.passthrough((Type)Types.BYTE);
                String nametagVisibility = (String)wrapper.read(Types.STRING);
                String collisionRule = (String)wrapper.read(Types.STRING);
                wrapper.write((Type)Types.VAR_INT, (Object)this.visibilityId(nametagVisibility));
                wrapper.write((Type)Types.VAR_INT, (Object)this.collisionId(collisionRule));
                wrapper.passthrough((Type)Types.VAR_INT);
                ((Protocol1_21_4To1_21_5)this.protocol).getComponentRewriter().passthroughAndProcess(wrapper);
                ((Protocol1_21_4To1_21_5)this.protocol).getComponentRewriter().passthroughAndProcess(wrapper);
            }
        });
        ((Protocol1_21_4To1_21_5)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_21_2.ENTITY_EVENT, wrapper -> {
            int entityId = (Integer)wrapper.read((Type)Types.INT);
            byte event = (Byte)wrapper.read((Type)Types.BYTE);
            if (event == 29) {
                this.playShieldSound(wrapper, entityId, 1273, 1.0f);
                return;
            }
            if (event == 30) {
                this.playShieldSound(wrapper, entityId, 1274, 0.8f);
                return;
            }
            wrapper.write((Type)Types.INT, (Object)entityId);
            wrapper.write((Type)Types.BYTE, (Object)event);
        });
    }

    public EntityType typeFromId(int type) {
        return EntityTypes1_21_5.getTypeFromId((int)type);
    }

    private void sendEntityVariants(UserConnection connection, String key, String entityName, boolean suffixedWithOwnName, String ... entryKeys) {
        PacketWrapper variantsPacket = PacketWrapper.create((PacketType)ClientboundConfigurationPackets1_21.REGISTRY_DATA, (UserConnection)connection);
        variantsPacket.write(Types.STRING, (Object)key);
        RegistryEntry[] entries = new RegistryEntry[entryKeys.length];
        for (int i = 0; i < entryKeys.length; ++i) {
            CompoundTag tag = new CompoundTag();
            String assetId = "entity/" + entityName + "/" + entryKeys[i];
            if (suffixedWithOwnName) {
                assetId = assetId + "_" + entityName;
            }
            tag.putString("asset_id", assetId);
            entries[i] = new RegistryEntry(entryKeys[i], (Tag)tag);
        }
        variantsPacket.write(Types.REGISTRY_ENTRY_ARRAY, (Object)entries);
        variantsPacket.send(Protocol1_21_4To1_21_5.class);
    }

    private RegistryEntry wolfSoundVariant() {
        CompoundTag classicWolfSoundVariant = new CompoundTag();
        classicWolfSoundVariant.putString("ambient_sound", "entity.wolf.ambient");
        classicWolfSoundVariant.putString("death_sound", "entity.wolf.death");
        classicWolfSoundVariant.putString("growl_sound", "entity.wolf.growl");
        classicWolfSoundVariant.putString("hurt_sound", "entity.wolf.hurt");
        classicWolfSoundVariant.putString("pant_sound", "entity.wolf.pant");
        classicWolfSoundVariant.putString("whine_sound", "entity.wolf.whine");
        return new RegistryEntry("classic", (Tag)classicWolfSoundVariant);
    }

    private int collisionId(String collisionRule) {
        return switch (collisionRule) {
            case "always" -> 0;
            case "never" -> 1;
            case "pushOtherTeams" -> 2;
            case "pushOwnTeam" -> 3;
            default -> 0;
        };
    }

    private void playShieldSound(PacketWrapper wrapper, int entityId, int soundId, float volume) {
        ThreadLocalRandom random = ThreadLocalRandom.current();
        wrapper.setPacketType((PacketType)ClientboundPackets1_21_5.SOUND_ENTITY);
        wrapper.write((Type)Types.SOUND_EVENT, (Object)Holder.of((int)soundId));
        wrapper.write((Type)Types.VAR_INT, (Object)7);
        wrapper.write((Type)Types.VAR_INT, (Object)entityId);
        wrapper.write((Type)Types.FLOAT, (Object)Float.valueOf(volume));
        wrapper.write((Type)Types.FLOAT, (Object)Float.valueOf(0.8f + random.nextFloat() * 0.4f));
        wrapper.write((Type)Types.LONG, (Object)random.nextLong());
    }

    private int visibilityId(String visibilityRule) {
        return switch (visibilityRule) {
            case "always" -> 0;
            case "never" -> 1;
            case "hideForOtherTeams" -> 2;
            case "hideForOwnTeam" -> 3;
            default -> 0;
        };
    }

    private void sendSaddleEquipment(EntityDataHandlerEvent event, boolean saddled) {
        PacketWrapper equipmentPacket = PacketWrapper.create((PacketType)ClientboundPackets1_21_5.SET_EQUIPMENT, (UserConnection)event.user());
        equipmentPacket.write((Type)Types.VAR_INT, (Object)event.entityId());
        equipmentPacket.write((Type)Types.BYTE, (Object)7);
        equipmentPacket.write(VersionedTypes.V1_21_5.item, (Object)(saddled ? new StructuredItem(800, 1) : StructuredItem.empty()));
        equipmentPacket.send(Protocol1_21_4To1_21_5.class);
    }
}

