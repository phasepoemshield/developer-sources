/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Preconditions
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.FloatTag
 *  com.viaversion.nbt.tag.ListTag
 *  com.viaversion.nbt.tag.NumberTag
 *  com.viaversion.nbt.tag.StringTag
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viabackwards.api.BackwardsProtocol
 *  com.viaversion.viabackwards.api.rewriters.EntityRewriter
 *  com.viaversion.viabackwards.protocol.v1_20_5to1_20_3.storage.RegistryDataStorage
 *  com.viaversion.viabackwards.protocol.v1_20_5to1_20_3.storage.SecureChatStorage
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.Particle
 *  com.viaversion.viaversion.api.minecraft.RegistryEntry
 *  com.viaversion.viaversion.api.minecraft.entities.EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_20_5
 *  com.viaversion.viaversion.api.minecraft.entitydata.EntityData
 *  com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes1_20_5
 *  com.viaversion.viaversion.api.minecraft.item.Item
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.version.Types1_20_3
 *  com.viaversion.viaversion.api.type.types.version.VersionedTypes
 *  com.viaversion.viaversion.data.entity.DimensionDataImpl
 *  com.viaversion.viaversion.protocols.v1_20_2to1_20_3.packet.ClientboundPackets1_20_3
 *  com.viaversion.viaversion.protocols.v1_20_3to1_20_5.Protocol1_20_3To1_20_5
 *  com.viaversion.viaversion.protocols.v1_20_3to1_20_5.data.Attributes1_20_5
 *  com.viaversion.viaversion.protocols.v1_20_3to1_20_5.packet.ClientboundConfigurationPackets1_20_5
 *  com.viaversion.viaversion.protocols.v1_20_3to1_20_5.packet.ClientboundPacket1_20_5
 *  com.viaversion.viaversion.protocols.v1_20_3to1_20_5.packet.ClientboundPackets1_20_5
 *  com.viaversion.viaversion.protocols.v1_20_3to1_20_5.storage.ArmorTrimStorage
 *  com.viaversion.viaversion.protocols.v1_20_3to1_20_5.storage.BannerPatternStorage
 *  com.viaversion.viaversion.util.Key
 *  com.viaversion.viaversion.util.KeyMappings
 *  com.viaversion.viaversion.util.MathUtil
 */
package com.viaversion.viabackwards.protocol.v1_20_5to1_20_3.rewriter;

import com.google.common.base.Preconditions;
import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.FloatTag;
import com.viaversion.nbt.tag.ListTag;
import com.viaversion.nbt.tag.NumberTag;
import com.viaversion.nbt.tag.StringTag;
import com.viaversion.nbt.tag.Tag;
import com.viaversion.viabackwards.api.BackwardsProtocol;
import com.viaversion.viabackwards.api.rewriters.EntityRewriter;
import com.viaversion.viabackwards.protocol.v1_20_5to1_20_3.Protocol1_20_5To1_20_3;
import com.viaversion.viabackwards.protocol.v1_20_5to1_20_3.storage.RegistryDataStorage;
import com.viaversion.viabackwards.protocol.v1_20_5to1_20_3.storage.SecureChatStorage;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.Particle;
import com.viaversion.viaversion.api.minecraft.RegistryEntry;
import com.viaversion.viaversion.api.minecraft.entities.EntityType;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_20_5;
import com.viaversion.viaversion.api.minecraft.entitydata.EntityData;
import com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes1_20_5;
import com.viaversion.viaversion.api.minecraft.item.Item;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.version.Types1_20_3;
import com.viaversion.viaversion.api.type.types.version.VersionedTypes;
import com.viaversion.viaversion.data.entity.DimensionDataImpl;
import com.viaversion.viaversion.protocols.v1_20_2to1_20_3.packet.ClientboundPackets1_20_3;
import com.viaversion.viaversion.protocols.v1_20_3to1_20_5.Protocol1_20_3To1_20_5;
import com.viaversion.viaversion.protocols.v1_20_3to1_20_5.data.Attributes1_20_5;
import com.viaversion.viaversion.protocols.v1_20_3to1_20_5.packet.ClientboundConfigurationPackets1_20_5;
import com.viaversion.viaversion.protocols.v1_20_3to1_20_5.packet.ClientboundPacket1_20_5;
import com.viaversion.viaversion.protocols.v1_20_3to1_20_5.packet.ClientboundPackets1_20_5;
import com.viaversion.viaversion.protocols.v1_20_3to1_20_5.storage.ArmorTrimStorage;
import com.viaversion.viaversion.protocols.v1_20_3to1_20_5.storage.BannerPatternStorage;
import com.viaversion.viaversion.util.Key;
import com.viaversion.viaversion.util.KeyMappings;
import com.viaversion.viaversion.util.MathUtil;
import java.util.ArrayList;
import java.util.HashMap;

public final class EntityPacketRewriter1_20_5
extends EntityRewriter<ClientboundPacket1_20_5, Protocol1_20_5To1_20_3> {
    public EntityPacketRewriter1_20_5(Protocol1_20_5To1_20_3 protocol) {
        super((BackwardsProtocol)protocol, Types1_20_3.ENTITY_DATA_TYPES.optionalComponentType, Types1_20_3.ENTITY_DATA_TYPES.booleanType);
    }

    public void onMappingDataLoaded() {
        super.onMappingDataLoaded();
        this.mapEntityTypeWithData((EntityType)EntityTypes1_20_5.ARMADILLO, (EntityType)EntityTypes1_20_5.COW).tagName();
        this.mapEntityTypeWithData((EntityType)EntityTypes1_20_5.BOGGED, (EntityType)EntityTypes1_20_5.STRAY).tagName();
        this.mapEntityTypeWithData((EntityType)EntityTypes1_20_5.BREEZE_WIND_CHARGE, (EntityType)EntityTypes1_20_5.WIND_CHARGE);
        this.mapEntityTypeWithData((EntityType)EntityTypes1_20_5.OMINOUS_ITEM_SPAWNER, (EntityType)EntityTypes1_20_5.TEXT_DISPLAY);
    }

    protected void registerRewrites() {
        this.filter().handler((event, data) -> {
            int typeId = data.dataType().typeId();
            if (typeId == ((EntityDataTypes1_20_5)VersionedTypes.V1_20_5.entityDataTypes).particlesType.typeId()) {
                Particle[] particles = (Particle[])data.value();
                int color = 0;
                for (Particle particle : particles) {
                    if (particle.id() != ((Protocol1_20_5To1_20_3)this.protocol).getMappingData().getParticleMappings().id("entity_effect")) continue;
                    color = (Integer)particle.removeArgument(0).getValue();
                }
                data.setTypeAndValue(Types1_20_3.ENTITY_DATA_TYPES.varIntType, (Object)this.removeAlpha(color));
                return;
            }
            if (typeId == ((EntityDataTypes1_20_5)VersionedTypes.V1_20_5.entityDataTypes).armadilloState.typeId() || typeId == ((EntityDataTypes1_20_5)VersionedTypes.V1_20_5.entityDataTypes).wolfVariantType.typeId()) {
                event.cancel();
                return;
            }
            int id = typeId;
            if (typeId >= ((EntityDataTypes1_20_5)VersionedTypes.V1_20_5.entityDataTypes).armadilloState.typeId()) {
                --id;
            }
            if (typeId >= ((EntityDataTypes1_20_5)VersionedTypes.V1_20_5.entityDataTypes).wolfVariantType.typeId()) {
                --id;
            }
            if (typeId >= ((EntityDataTypes1_20_5)VersionedTypes.V1_20_5.entityDataTypes).particlesType.typeId()) {
                --id;
            }
            data.setDataType(Types1_20_3.ENTITY_DATA_TYPES.byId(id));
        });
        this.registerEntityDataTypeHandler1_20_3(Types1_20_3.ENTITY_DATA_TYPES.itemType, Types1_20_3.ENTITY_DATA_TYPES.blockStateType, Types1_20_3.ENTITY_DATA_TYPES.optionalBlockStateType, Types1_20_3.ENTITY_DATA_TYPES.particleType, null, Types1_20_3.ENTITY_DATA_TYPES.componentType, Types1_20_3.ENTITY_DATA_TYPES.optionalComponentType);
        this.registerBlockStateHandler((EntityType)EntityTypes1_20_5.ABSTRACT_MINECART, 11);
        this.filter().type((EntityType)EntityTypes1_20_5.AREA_EFFECT_CLOUD).addIndex(9);
        this.filter().type((EntityType)EntityTypes1_20_5.AREA_EFFECT_CLOUD).index(11).handler((event, data) -> {
            Particle particle = (Particle)data.value();
            if (particle.id() == ((Protocol1_20_5To1_20_3)this.protocol).getMappingData().getParticleMappings().mappedId("entity_effect")) {
                int color = (Integer)particle.removeArgument(0).getValue();
                event.createExtraData(new EntityData(9, Types1_20_3.ENTITY_DATA_TYPES.varIntType, (Object)this.removeAlpha(color)));
            }
        });
        this.filter().type((EntityType)EntityTypes1_20_5.LLAMA).addIndex(20);
        this.filter().type((EntityType)EntityTypes1_20_5.ARMADILLO).removeIndex(17);
        this.filter().type((EntityType)EntityTypes1_20_5.WOLF).removeIndex(22);
        this.filter().type((EntityType)EntityTypes1_20_5.OMINOUS_ITEM_SPAWNER).removeIndex(8);
    }

    public void registerPackets() {
        ((Protocol1_20_5To1_20_3)this.protocol).replaceClientbound((ClientboundPacketType)ClientboundPackets1_20_5.SET_EQUIPMENT, wrapper -> {
            byte slot;
            int entityId = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            EntityType type = this.tracker(wrapper.user()).entityType(entityId);
            do {
                slot = (Byte)wrapper.read((Type)Types.BYTE);
                Item item = ((Protocol1_20_5To1_20_3)this.protocol).getItemRewriter().handleItemToClient(wrapper.user(), (Item)wrapper.read(VersionedTypes.V1_20_5.item()));
                int rawSlot = slot & 0x7F;
                if (rawSlot == 6) {
                    boolean lastSlot = (slot & 0xFFFFFF80) == 0;
                    slot = (byte)(lastSlot ? 4 : -124);
                    if (type != null && type.isOrHasParent((EntityType)EntityTypes1_20_5.LLAMA)) {
                        wrapper.cancel();
                        this.sendCarpetColorUpdate(wrapper.user(), entityId, item);
                    }
                }
                wrapper.write((Type)Types.BYTE, (Object)slot);
                wrapper.write(Types.ITEM1_20_2, (Object)item);
            } while ((slot & 0xFFFFFF80) != 0);
        });
        ((Protocol1_20_5To1_20_3)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_20_5.HORSE_SCREEN_OPEN, wrapper -> {
            wrapper.passthrough((Type)Types.UNSIGNED_BYTE);
            int size = (Integer)wrapper.read((Type)Types.VAR_INT);
            wrapper.write((Type)Types.VAR_INT, (Object)(size + 1));
        });
        ((Protocol1_20_5To1_20_3)this.protocol).registerClientbound((ClientboundPacketType)ClientboundConfigurationPackets1_20_5.REGISTRY_DATA, wrapper -> {
            int i;
            RegistryEntry entry2;
            wrapper.cancel();
            String registryKey = Key.stripMinecraftNamespace((String)((String)wrapper.read(Types.STRING)));
            if (registryKey.equals("wolf_variant")) {
                return;
            }
            RegistryDataStorage registryDataStorage = (RegistryDataStorage)wrapper.user().get(RegistryDataStorage.class);
            RegistryEntry[] entries = (RegistryEntry[])wrapper.read(Types.REGISTRY_ENTRY_ARRAY);
            if (registryKey.equals("banner_pattern")) {
                ((BannerPatternStorage)wrapper.user().get(BannerPatternStorage.class)).setBannerPatterns(this.toMappings(entries));
                return;
            }
            boolean isTrimPattern = registryKey.equals("trim_pattern");
            if (isTrimPattern) {
                ((ArmorTrimStorage)wrapper.user().get(ArmorTrimStorage.class)).setTrimPatterns(this.toMappings(entries));
            } else if (registryKey.equals("trim_material")) {
                ((ArmorTrimStorage)wrapper.user().get(ArmorTrimStorage.class)).setTrimMaterials(this.toMappings(entries));
            }
            if (registryKey.equals("worldgen/biome")) {
                this.tracker(wrapper.user()).setBiomesSent(entries.length);
                for (RegistryEntry entry2 : entries) {
                    CompoundTag effects;
                    CompoundTag particle;
                    if (entry2.tag() == null || (particle = (effects = ((CompoundTag)entry2.tag()).getCompoundTag("effects")).getCompoundTag("particle")) == null) continue;
                    CompoundTag particleOptions = particle.getCompoundTag("options");
                    String particleType = particleOptions.getString("type");
                    this.updateParticleFormat(particleOptions, Key.stripMinecraftNamespace((String)particleType));
                }
            } else if (registryKey.equals("dimension_type")) {
                HashMap<String, DimensionDataImpl> dimensionDataMap = new HashMap<String, DimensionDataImpl>(entries.length);
                String[] keys = new String[entries.length];
                for (i = 0; i < entries.length; ++i) {
                    entry2 = entries[i];
                    Preconditions.checkNotNull((Object)entry2.tag(), (Object)("Server unexpectedly sent null dimension data for " + entry2.key()));
                    String dimensionKey = Key.stripMinecraftNamespace((String)entry2.key());
                    CompoundTag tag = (CompoundTag)entry2.tag();
                    this.updateDimensionTypeData(tag);
                    dimensionDataMap.put(dimensionKey, new DimensionDataImpl(i, tag));
                    keys[i] = dimensionKey;
                }
                registryDataStorage.setDimensionKeys(keys);
                this.tracker(wrapper.user()).setDimensions(dimensionDataMap);
            }
            CompoundTag registryTag = new CompoundTag();
            ListTag entriesTag = new ListTag(CompoundTag.class);
            registryTag.putString("type", registryKey);
            registryTag.put("value", (Tag)entriesTag);
            for (i = 0; i < entries.length; ++i) {
                entry2 = entries[i];
                Preconditions.checkNotNull((Object)entry2.tag(), (Object)("Server unexpectedly sent null registry data entry for " + entry2.key()));
                if (isTrimPattern) {
                    CompoundTag patternTag = (CompoundTag)entry2.tag();
                    StringTag templateItem = patternTag.getStringTag("template_item");
                    if (Protocol1_20_3To1_20_5.MAPPINGS.getFullItemMappings().id(templateItem.getValue()) == -1) continue;
                }
                CompoundTag entryCompoundTag = new CompoundTag();
                entryCompoundTag.putString("name", entry2.key());
                entryCompoundTag.putInt("id", i);
                entryCompoundTag.put("element", entry2.tag());
                entriesTag.add((Tag)entryCompoundTag);
            }
            registryDataStorage.registryData().put(registryKey, (Tag)registryTag);
        });
        ((Protocol1_20_5To1_20_3)this.protocol).replaceClientbound((ClientboundPacketType)ClientboundPackets1_20_5.LOGIN, (PacketHandler)new PacketHandlers(){

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
                this.handler(wrapper -> {
                    int dimensionId = (Integer)wrapper.read((Type)Types.VAR_INT);
                    RegistryDataStorage storage = (RegistryDataStorage)wrapper.user().get(RegistryDataStorage.class);
                    wrapper.write(Types.STRING, (Object)storage.dimensionKeys()[dimensionId]);
                });
                this.map(Types.STRING);
                this.map((Type)Types.LONG);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.BOOLEAN);
                this.map((Type)Types.BOOLEAN);
                this.map(Types.OPTIONAL_GLOBAL_POSITION);
                this.map((Type)Types.VAR_INT);
                this.handler(wrapper -> {
                    boolean enforcesSecureChat = (Boolean)wrapper.read((Type)Types.BOOLEAN);
                    ((SecureChatStorage)wrapper.user().get(SecureChatStorage.class)).setEnforcesSecureChat(enforcesSecureChat);
                });
                this.handler(EntityPacketRewriter1_20_5.this.worldDataTrackerHandlerByKey());
                this.handler(EntityPacketRewriter1_20_5.this.playerTrackerHandler());
            }
        });
        ((Protocol1_20_5To1_20_3)this.protocol).replaceClientbound((ClientboundPacketType)ClientboundPackets1_20_5.RESPAWN, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.handler(wrapper -> {
                    int dimensionId = (Integer)wrapper.read((Type)Types.VAR_INT);
                    RegistryDataStorage storage = (RegistryDataStorage)wrapper.user().get(RegistryDataStorage.class);
                    wrapper.write(Types.STRING, (Object)storage.dimensionKeys()[dimensionId]);
                });
                this.map(Types.STRING);
                this.handler(EntityPacketRewriter1_20_5.this.worldDataTrackerHandlerByKey());
            }
        });
        ((Protocol1_20_5To1_20_3)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_20_5.UPDATE_MOB_EFFECT, wrapper -> {
            wrapper.passthrough((Type)Types.VAR_INT);
            int effectId = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            int amplifier = (Integer)wrapper.read((Type)Types.VAR_INT);
            wrapper.write((Type)Types.BYTE, (Object)((byte)MathUtil.clamp((int)amplifier, (int)-128, (int)127)));
            wrapper.passthrough((Type)Types.VAR_INT);
            wrapper.passthrough((Type)Types.BYTE);
            if (effectId == 32) {
                CompoundTag factorData = new CompoundTag();
                factorData.putInt("padding_duration", 22);
                factorData.putBoolean("had_effect_last_tick", true);
                factorData.putFloat("factor_previous_frame", 0.0f);
                factorData.putFloat("factor_start", 1.0f);
                factorData.putFloat("factor_target", 1.0f);
                factorData.putFloat("factor_current", 1.0f);
                wrapper.write(Types.OPTIONAL_COMPOUND_TAG, (Object)factorData);
            } else {
                wrapper.write(Types.OPTIONAL_COMPOUND_TAG, null);
            }
        });
        ((Protocol1_20_5To1_20_3)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_20_5.UPDATE_ATTRIBUTES, wrapper -> {
            int size;
            int entityId = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            int newSize = size = ((Integer)wrapper.passthrough((Type)Types.VAR_INT)).intValue();
            for (int i = 0; i < size; ++i) {
                int j;
                int modifierSize;
                EntityType type;
                int attributeId = (Integer)wrapper.read((Type)Types.VAR_INT);
                String attribute = Attributes1_20_5.idToKey((int)attributeId);
                int mappedId = ((Protocol1_20_5To1_20_3)this.protocol).getMappingData().getAttributeMappings().getNewId(attributeId);
                if ("generic.jump_strength".equals(attribute) && ((type = this.tracker(wrapper.user()).entityType(entityId)) == null || !type.isOrHasParent((EntityType)EntityTypes1_20_5.HORSE))) {
                    mappedId = -1;
                }
                if (mappedId == -1) {
                    --newSize;
                    wrapper.read((Type)Types.DOUBLE);
                    modifierSize = (Integer)wrapper.read((Type)Types.VAR_INT);
                    for (j = 0; j < modifierSize; ++j) {
                        wrapper.read(Types.UUID);
                        wrapper.read((Type)Types.DOUBLE);
                        wrapper.read((Type)Types.BYTE);
                    }
                    continue;
                }
                wrapper.write(Types.STRING, (Object)attribute);
                wrapper.passthrough((Type)Types.DOUBLE);
                modifierSize = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
                for (j = 0; j < modifierSize; ++j) {
                    wrapper.passthrough(Types.UUID);
                    wrapper.passthrough((Type)Types.DOUBLE);
                    wrapper.passthrough((Type)Types.BYTE);
                }
            }
            wrapper.set((Type)Types.VAR_INT, 1, (Object)newSize);
        });
    }

    public EntityType typeFromId(int type) {
        return EntityTypes1_20_5.getTypeFromId((int)type);
    }

    private int encodeColorPart(float part) {
        return (int)Math.floor(part * 255.0f);
    }

    private int removeAlpha(int argb) {
        return argb & 0xFFFFFF;
    }

    private KeyMappings toMappings(RegistryEntry[] entries) {
        String[] keys = new String[entries.length];
        for (int i = 0; i < entries.length; ++i) {
            keys[i] = Key.stripMinecraftNamespace((String)entries[i].key());
        }
        return new KeyMappings(keys);
    }

    private void moveTag(CompoundTag compoundTag, String from, String to) {
        Tag tag = compoundTag.remove(from);
        if (tag != null) {
            compoundTag.put(to, tag);
        }
    }

    private void sendCarpetColorUpdate(UserConnection connection, int entityId, Item item) {
        PacketWrapper setEntityData = PacketWrapper.create((PacketType)ClientboundPackets1_20_3.SET_ENTITY_DATA, (UserConnection)connection);
        setEntityData.write((Type)Types.VAR_INT, (Object)entityId);
        int color = -1;
        if (item != null && item.identifier() >= 445 && item.identifier() <= 460) {
            color = item.identifier() - 445;
        }
        ArrayList<EntityData> entityDataList = new ArrayList<EntityData>();
        entityDataList.add(new EntityData(20, Types1_20_3.ENTITY_DATA_TYPES.varIntType, (Object)color));
        setEntityData.write(Types1_20_3.ENTITY_DATA_LIST, entityDataList);
        setEntityData.send(Protocol1_20_5To1_20_3.class);
    }

    private void updateDimensionTypeData(CompoundTag elementTag) {
        CompoundTag monsterSpawnLightLevel = elementTag.getCompoundTag("monster_spawn_light_level");
        if (monsterSpawnLightLevel != null) {
            CompoundTag value = new CompoundTag();
            monsterSpawnLightLevel.put("value", (Tag)value);
            value.putInt("min_inclusive", monsterSpawnLightLevel.getInt("min_inclusive"));
            value.putInt("max_inclusive", monsterSpawnLightLevel.getInt("max_inclusive"));
        }
    }

    private void updateParticleFormat(CompoundTag options, String particleType) {
        if ("block".equals(particleType) || "block_marker".equals(particleType) || "falling_dust".equals(particleType) || "dust_pillar".equals(particleType)) {
            Tag blockState = options.remove("block_state");
            if (blockState instanceof StringTag) {
                CompoundTag compoundTag = new CompoundTag();
                compoundTag.put("Name", blockState);
                blockState = compoundTag;
            }
            options.put("value", blockState);
        } else if ("item".equals(particleType)) {
            Tag item = options.remove("item");
            if (item instanceof StringTag) {
                CompoundTag compoundTag = new CompoundTag();
                compoundTag.put("id", item);
                item = compoundTag;
            }
            options.put("value", item);
        } else if ("dust_color_transition".equals(particleType)) {
            this.moveTag(options, "from_color", "fromColor");
            this.moveTag(options, "to_color", "toColor");
        } else if ("entity_effect".equals(particleType)) {
            Tag color = options.remove("color");
            if (color instanceof ListTag) {
                ListTag colorParts = (ListTag)color;
                color = new FloatTag((float)this.encodeARGB(((NumberTag)colorParts.get(0)).getValue().floatValue(), ((NumberTag)colorParts.get(1)).getValue().floatValue(), ((NumberTag)colorParts.get(2)).getValue().floatValue(), ((NumberTag)colorParts.get(3)).getValue().floatValue()));
            }
            options.put("value", color);
        }
    }

    private int encodeARGB(float a, float r, float g, float b) {
        int encodedAlpha = this.encodeColorPart(a);
        int encodedRed = this.encodeColorPart(r);
        int encodedGreen = this.encodeColorPart(g);
        int encodedBlue = this.encodeColorPart(b);
        return encodedAlpha << 24 | encodedRed << 16 | encodedGreen << 8 | encodedBlue;
    }
}

