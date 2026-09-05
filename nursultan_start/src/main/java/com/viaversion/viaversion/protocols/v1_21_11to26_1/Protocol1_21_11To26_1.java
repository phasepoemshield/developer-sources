/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.StringTag
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viaversion.api.connection.StorableObject
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.data.MappingData
 *  com.viaversion.viaversion.api.data.entity.EntityTracker
 *  com.viaversion.viaversion.api.minecraft.RegistryEntry
 *  com.viaversion.viaversion.api.minecraft.RegistryType
 *  com.viaversion.viaversion.api.minecraft.data.StructuredDataKey
 *  com.viaversion.viaversion.api.minecraft.data.version.StructuredDataKeys1_21_11
 *  com.viaversion.viaversion.api.minecraft.entities.EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_21_11
 *  com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes1_21_11
 *  com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes26_1
 *  com.viaversion.viaversion.api.protocol.AbstractProtocol
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.packet.provider.PacketTypesProvider
 *  com.viaversion.viaversion.api.protocol.packet.provider.SimplePacketTypesProvider
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.chunk.ChunkType1_21_5
 *  com.viaversion.viaversion.api.type.types.chunk.ChunkType26_1
 *  com.viaversion.viaversion.api.type.types.misc.ParticleType$Fillers
 *  com.viaversion.viaversion.api.type.types.version.Types1_20_5
 *  com.viaversion.viaversion.api.type.types.version.VersionedTypes
 *  com.viaversion.viaversion.data.entity.EntityTrackerBase
 *  com.viaversion.viaversion.protocols.v1_21_11to26_1.storage.PlayerSneaking
 *  com.viaversion.viaversion.protocols.v1_21_11to26_1.storage.TagsSent
 *  com.viaversion.viaversion.rewriter.BlockRewriter
 *  com.viaversion.viaversion.rewriter.ParticleRewriter
 *  com.viaversion.viaversion.rewriter.RecipeDisplayRewriter
 *  com.viaversion.viaversion.rewriter.RegistryDataRewriter
 *  com.viaversion.viaversion.rewriter.TagRewriter
 *  com.viaversion.viaversion.rewriter.block.BlockRewriter1_21_5
 *  com.viaversion.viaversion.rewriter.text.NBTComponentRewriter
 *  com.viaversion.viaversion.util.Key
 *  com.viaversion.viaversion.util.ProtocolUtil
 */
package com.viaversion.viaversion.protocols.v1_21_11to26_1;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.StringTag;
import com.viaversion.nbt.tag.Tag;
import com.viaversion.viaversion.api.connection.StorableObject;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.data.MappingData;
import com.viaversion.viaversion.api.data.entity.EntityTracker;
import com.viaversion.viaversion.api.minecraft.RegistryEntry;
import com.viaversion.viaversion.api.minecraft.RegistryType;
import com.viaversion.viaversion.api.minecraft.data.StructuredDataKey;
import com.viaversion.viaversion.api.minecraft.data.version.StructuredDataKeys1_21_11;
import com.viaversion.viaversion.api.minecraft.entities.EntityType;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_21_11;
import com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes1_21_11;
import com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes26_1;
import com.viaversion.viaversion.api.protocol.AbstractProtocol;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.packet.provider.PacketTypesProvider;
import com.viaversion.viaversion.api.protocol.packet.provider.SimplePacketTypesProvider;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.chunk.ChunkType1_21_5;
import com.viaversion.viaversion.api.type.types.chunk.ChunkType26_1;
import com.viaversion.viaversion.api.type.types.misc.ParticleType;
import com.viaversion.viaversion.api.type.types.version.Types1_20_5;
import com.viaversion.viaversion.api.type.types.version.VersionedTypes;
import com.viaversion.viaversion.data.entity.EntityTrackerBase;
import com.viaversion.viaversion.protocols.v1_21_11to26_1.data.MappingData26_1;
import com.viaversion.viaversion.protocols.v1_21_11to26_1.packet.ClientboundPacket26_1;
import com.viaversion.viaversion.protocols.v1_21_11to26_1.packet.ClientboundPackets26_1;
import com.viaversion.viaversion.protocols.v1_21_11to26_1.packet.ServerboundPacket26_1;
import com.viaversion.viaversion.protocols.v1_21_11to26_1.packet.ServerboundPackets26_1;
import com.viaversion.viaversion.protocols.v1_21_11to26_1.rewriter.BlockItemPacketRewriter26_1;
import com.viaversion.viaversion.protocols.v1_21_11to26_1.rewriter.ComponentRewriter26_1;
import com.viaversion.viaversion.protocols.v1_21_11to26_1.rewriter.EntityPacketRewriter26_1;
import com.viaversion.viaversion.protocols.v1_21_11to26_1.rewriter.RegistryDataRewriter26_1;
import com.viaversion.viaversion.protocols.v1_21_11to26_1.storage.PlayerSneaking;
import com.viaversion.viaversion.protocols.v1_21_11to26_1.storage.TagsSent;
import com.viaversion.viaversion.protocols.v1_21_4to1_21_5.rewriter.RecipeDisplayRewriter1_21_5;
import com.viaversion.viaversion.protocols.v1_21_5to1_21_6.packet.ServerboundPackets1_21_6;
import com.viaversion.viaversion.protocols.v1_21_7to1_21_9.packet.ClientboundConfigurationPackets1_21_9;
import com.viaversion.viaversion.protocols.v1_21_7to1_21_9.packet.ServerboundConfigurationPackets1_21_9;
import com.viaversion.viaversion.protocols.v1_21_7to1_21_9.packet.ServerboundPacket1_21_9;
import com.viaversion.viaversion.protocols.v1_21_9to1_21_11.packet.ClientboundPacket1_21_11;
import com.viaversion.viaversion.protocols.v1_21_9to1_21_11.packet.ClientboundPackets1_21_11;
import com.viaversion.viaversion.rewriter.BlockRewriter;
import com.viaversion.viaversion.rewriter.ParticleRewriter;
import com.viaversion.viaversion.rewriter.RecipeDisplayRewriter;
import com.viaversion.viaversion.rewriter.RegistryDataRewriter;
import com.viaversion.viaversion.rewriter.TagRewriter;
import com.viaversion.viaversion.rewriter.block.BlockRewriter1_21_5;
import com.viaversion.viaversion.rewriter.text.NBTComponentRewriter;
import com.viaversion.viaversion.util.Key;
import com.viaversion.viaversion.util.ProtocolUtil;
import java.util.Map;

public final class Protocol1_21_11To26_1
extends AbstractProtocol<ClientboundPacket1_21_11, ClientboundPacket26_1, ServerboundPacket1_21_9, ServerboundPacket26_1> {
    public static final MappingData26_1 MAPPINGS = new MappingData26_1();
    private final EntityPacketRewriter26_1 entityRewriter = new EntityPacketRewriter26_1(this);
    private final BlockItemPacketRewriter26_1 itemRewriter = new BlockItemPacketRewriter26_1(this);
    private final ParticleRewriter<ClientboundPacket1_21_11> particleRewriter = new ParticleRewriter((Protocol)this);
    private final TagRewriter<ClientboundPacket1_21_11> tagRewriter = new TagRewriter((Protocol)this);
    private final NBTComponentRewriter<ClientboundPacket1_21_11> componentRewriter = new ComponentRewriter26_1(this);
    private final RegistryDataRewriter registryDataRewriter = new RegistryDataRewriter26_1((Protocol<?, ?, ?, ?>)this);
    private final RecipeDisplayRewriter<ClientboundPacket1_21_11> recipeRewriter = new RecipeDisplayRewriter1_21_5<ClientboundPacket1_21_11>((Protocol<ClientboundPacket1_21_11, ?, ?, ?>)this);
    private final BlockRewriter<ClientboundPacket1_21_11> blockRewriter = new BlockRewriter1_21_5((Protocol)this, ChunkType1_21_5::new, ChunkType26_1::new);

    public Types1_20_5<StructuredDataKeys1_21_11, EntityDataTypes1_21_11> types() {
        return VersionedTypes.V1_21_11;
    }

    public Protocol1_21_11To26_1() {
        super(ClientboundPacket1_21_11.class, ClientboundPacket26_1.class, ServerboundPacket1_21_9.class, ServerboundPacket26_1.class);
    }

    public void init(UserConnection connection) {
        this.addEntityTracker(connection, (EntityTracker)new EntityTrackerBase(connection, (EntityType)EntityTypes1_21_11.PLAYER));
        this.addItemHasher(connection);
        connection.put((StorableObject)new PlayerSneaking());
    }

    private void addJukeboxPlayables(String ... songs) {
        for (String song : songs) {
            CompoundTag songTag = new CompoundTag();
            CompoundTag songDescription = new CompoundTag();
            songDescription.putString("translate", "jukebox_song.minecraft." + song);
            songTag.put("description", (Tag)songDescription);
            songTag.putString("sound_event", "music_disc." + song);
            songTag.putFloat("length_in_seconds", 175.0f);
            songTag.putInt("comparator_output", 10);
            this.registryDataRewriter.addEntries("jukebox_song", new RegistryEntry[]{new RegistryEntry(song, (Tag)songTag)});
        }
    }

    private void swapAffixAndAddAssetId(String registryKey, String affix) {
        this.registryDataRewriter.addHandler(registryKey, (key, tag) -> {
            this.swapEntityNameAffix(affix, (CompoundTag)tag);
            this.addBabyAssetId((CompoundTag)tag);
        });
    }

    private void addRequiredRegistryEntries() {
        CompoundTag spearDamageType = new CompoundTag();
        spearDamageType.putFloat("exhaustion", 0.1f);
        spearDamageType.putString("message_id", "spear");
        spearDamageType.putString("scaling", "when_caused_by_living_non_player");
        this.registryDataRewriter.addEntries("damage_type", new RegistryEntry[]{new RegistryEntry("spear", (Tag)spearDamageType)});
        CompoundTag coldChicken = new CompoundTag();
        coldChicken.putString("asset_id", "entity/chicken/chicken_cold");
        coldChicken.putString("baby_asset_id", "entity/chicken/chicken_cold_baby");
        coldChicken.putString("model", "cold");
        CompoundTag warmChicken = new CompoundTag();
        warmChicken.putString("asset_id", "entity/chicken/chicken_warm");
        warmChicken.putString("baby_asset_id", "entity/chicken/chicken_warm_baby");
        this.registryDataRewriter.addEntries("chicken_variant", new RegistryEntry[]{new RegistryEntry("cold", (Tag)coldChicken), new RegistryEntry("warm", (Tag)warmChicken)});
        CompoundTag ponderGoatHornInstrument = new CompoundTag();
        CompoundTag ponderGoatHornDescription = new CompoundTag();
        ponderGoatHornDescription.putString("translate", "instrument.minecraft.ponder_goat_horn");
        ponderGoatHornInstrument.put("description", (Tag)ponderGoatHornDescription);
        ponderGoatHornInstrument.putString("sound_event", "item.goat_horn.sound.0");
        ponderGoatHornInstrument.putFloat("use_duration", 7.0f);
        ponderGoatHornInstrument.putFloat("range", 256.0f);
        this.registryDataRewriter.addEntries("instrument", new RegistryEntry[]{new RegistryEntry("spear", (Tag)ponderGoatHornInstrument)});
        this.addJukeboxPlayables("11", "13", "5", "blocks", "cat", "chirp", "far", "mall", "mellohi", "otherside", "pigstep", "relic", "stal", "strad", "wait", "ward", "creator", "creator_music_box", "lava_chicken", "tears", "precipice");
        this.addTrimMaterials("quartz", "iron", "netherite", "redstone", "copper", "gold", "emerald", "diamond", "lapis", "amethyst", "resin");
    }

    public RegistryDataRewriter getRegistryDataRewriter() {
        return this.registryDataRewriter;
    }

    public NBTComponentRewriter<ClientboundPacket1_21_11> getComponentRewriter() {
        return this.componentRewriter;
    }

    private void addEntityNamePrefix(String key, CompoundTag tag) {
        StringTag assetIdTag = tag.getStringTag("asset_id");
        String assetId = assetIdTag.getValue();
        assetIdTag.setValue(assetId.replace(key + "/", key + "/" + key + "_"));
    }

    protected void onMappingDataLoaded() {
        ParticleType.Fillers.fill1_21_9((Protocol)this);
        this.mappedTypes().structuredData.filler((Protocol)this).add(new StructuredDataKey[]{StructuredDataKey.CUSTOM_DATA, StructuredDataKey.MAX_STACK_SIZE, StructuredDataKey.MAX_DAMAGE, StructuredDataKey.UNBREAKABLE1_21_5, StructuredDataKey.RARITY, StructuredDataKey.TOOLTIP_DISPLAY, StructuredDataKey.DAMAGE_RESISTANT26_1, StructuredDataKey.CUSTOM_NAME, StructuredDataKey.LORE, StructuredDataKey.ENCHANTMENTS1_21_5, StructuredDataKey.CUSTOM_MODEL_DATA1_21_4, StructuredDataKey.BLOCKS_ATTACKS26_1, StructuredDataKey.PROVIDES_BANNER_PATTERNS26_1, StructuredDataKey.REPAIR_COST, StructuredDataKey.CREATIVE_SLOT_LOCK, StructuredDataKey.ENCHANTMENT_GLINT_OVERRIDE, StructuredDataKey.INTANGIBLE_PROJECTILE, StructuredDataKey.STORED_ENCHANTMENTS1_21_5, StructuredDataKey.DYED_COLOR1_21_5, StructuredDataKey.MAP_COLOR, StructuredDataKey.MAP_ID, StructuredDataKey.MAP_DECORATIONS, StructuredDataKey.MAP_POST_PROCESSING, StructuredDataKey.POTION_CONTENTS1_21_2, StructuredDataKey.SUSPICIOUS_STEW_EFFECTS, StructuredDataKey.WRITABLE_BOOK_CONTENT, StructuredDataKey.WRITTEN_BOOK_CONTENT, StructuredDataKey.TRIM1_21_5, StructuredDataKey.DEBUG_STICK_STATE, StructuredDataKey.ENTITY_DATA1_21_9, StructuredDataKey.BUCKET_ENTITY_DATA, StructuredDataKey.BLOCK_ENTITY_DATA1_21_9, StructuredDataKey.INSTRUMENT26_1, StructuredDataKey.RECIPES, StructuredDataKey.LODESTONE_TRACKER, StructuredDataKey.FIREWORK_EXPLOSION, StructuredDataKey.FIREWORKS, StructuredDataKey.PROFILE1_21_9, StructuredDataKey.NOTE_BLOCK_SOUND, StructuredDataKey.BANNER_PATTERNS, StructuredDataKey.BASE_COLOR, StructuredDataKey.POT_DECORATIONS, StructuredDataKey.BLOCK_STATE, StructuredDataKey.BEES1_21_9, StructuredDataKey.LOCK1_21_2, StructuredDataKey.CONTAINER_LOOT, StructuredDataKey.TOOL1_21_5, StructuredDataKey.ITEM_NAME, StructuredDataKey.OMINOUS_BOTTLE_AMPLIFIER, StructuredDataKey.FOOD1_21_2, StructuredDataKey.JUKEBOX_PLAYABLE26_1, StructuredDataKey.ATTRIBUTE_MODIFIERS1_21_6, StructuredDataKey.REPAIRABLE, StructuredDataKey.ENCHANTABLE, StructuredDataKey.CONSUMABLE1_21_2, StructuredDataKey.ATTACK_RANGE, StructuredDataKey.USE_COOLDOWN, StructuredDataKey.DAMAGE, StructuredDataKey.EQUIPPABLE1_21_6, StructuredDataKey.ITEM_MODEL, StructuredDataKey.GLIDER, StructuredDataKey.TOOLTIP_STYLE, StructuredDataKey.DEATH_PROTECTION, StructuredDataKey.WEAPON, StructuredDataKey.POTION_DURATION_SCALE, StructuredDataKey.VILLAGER_VARIANT, StructuredDataKey.WOLF_VARIANT, StructuredDataKey.WOLF_COLLAR, StructuredDataKey.FOX_VARIANT, StructuredDataKey.SALMON_SIZE, StructuredDataKey.PARROT_VARIANT, StructuredDataKey.TROPICAL_FISH_PATTERN, StructuredDataKey.TROPICAL_FISH_BASE_COLOR, StructuredDataKey.TROPICAL_FISH_PATTERN_COLOR, StructuredDataKey.MOOSHROOM_VARIANT, StructuredDataKey.RABBIT_VARIANT, StructuredDataKey.PIG_VARIANT, StructuredDataKey.FROG_VARIANT, StructuredDataKey.HORSE_VARIANT, StructuredDataKey.PAINTING_VARIANT, StructuredDataKey.LLAMA_VARIANT, StructuredDataKey.AXOLOTL_VARIANT, StructuredDataKey.CAT_VARIANT, StructuredDataKey.CAT_COLLAR, StructuredDataKey.SHEEP_COLOR, StructuredDataKey.SHULKER_COLOR, StructuredDataKey.PROVIDES_TRIM_MATERIAL26_1, StructuredDataKey.BREAK_SOUND, StructuredDataKey.COW_VARIANT, StructuredDataKey.CHICKEN_VARIANT26_1, StructuredDataKey.WOLF_SOUND_VARIANT, StructuredDataKey.USE_EFFECTS, StructuredDataKey.MINIMUM_ATTACK_CHARGE, StructuredDataKey.DAMAGE_TYPE26_1, StructuredDataKey.PIERCING_WEAPON, StructuredDataKey.KINETIC_WEAPON, StructuredDataKey.SWING_ANIMATION, StructuredDataKey.ZOMBIE_NAUTILUS_VARIANT26_1, StructuredDataKey.ADDITIONAL_TRADE_COST, StructuredDataKey.DYE, StructuredDataKey.PIG_SOUND_VARIANT, StructuredDataKey.COW_SOUND_VARIANT, StructuredDataKey.CHICKEN_SOUND_VARIANT, StructuredDataKey.CAT_SOUND_VARIANT});
        this.tagRewriter.addEmptyTags(RegistryType.DAMAGE_TYPE, new String[]{"damages_helmet", "bypasses_armor", "bypasses_shield", "bypasses_invulnerability", "bypasses_cooldown", "bypasses_effects", "bypasses_resistance", "bypasses_enchantments", "is_fire", "is_projectile", "witch_resistant_to", "is_explosion", "is_fall", "is_drowning", "is_freezing", "is_lightning", "no_anger", "no_impact", "always_most_significant_fall", "wither_immune_to", "ignites_armor_stands", "burns_armor_stands", "avoids_guardian_thorns", "always_triggers_silverfish", "always_hurts_ender_dragons", "no_knockback", "always_kills_armor_stands", "can_break_armor_stand", "bypasses_wolf_armor", "is_player_attack", "burn_from_stepping", "panic_causes", "panic_environmental_causes", "mace_smash"});
        this.tagRewriter.addEmptyTags(RegistryType.BANNER_PATTERN, new String[]{"no_item_required", "pattern_item/flower", "pattern_item/creeper", "pattern_item/skull", "pattern_item/mojang", "pattern_item/globe", "pattern_item/piglin", "pattern_item/flow", "pattern_item/guster", "pattern_item/field_masoned", "pattern_item/bordure_indented"});
        super.onMappingDataLoaded();
    }

    public ParticleRewriter<ClientboundPacket1_21_11> getParticleRewriter() {
        return this.particleRewriter;
    }

    private void swapEntityNameAffix(String key, CompoundTag tag) {
        StringTag assetIdTag = tag.getStringTag("asset_id");
        String assetId = assetIdTag.getValue();
        if (assetId.endsWith("_" + key)) {
            String mappedAsset = assetId.substring(0, assetId.length() - key.length() - 1).replace(key + "/", key + "/" + key + "_");
            assetIdTag.setValue(mappedAsset);
        }
    }

    protected PacketTypesProvider<ClientboundPacket1_21_11, ClientboundPacket26_1, ServerboundPacket1_21_9, ServerboundPacket26_1> createPacketTypesProvider() {
        return new SimplePacketTypesProvider(ProtocolUtil.packetTypeMap((Class)this.unmappedClientboundPacketType, (Class[])new Class[]{ClientboundPackets1_21_11.class, ClientboundConfigurationPackets1_21_9.class}), ProtocolUtil.packetTypeMap((Class)this.mappedClientboundPacketType, (Class[])new Class[]{ClientboundPackets26_1.class, ClientboundConfigurationPackets1_21_9.class}), ProtocolUtil.packetTypeMap((Class)this.mappedServerboundPacketType, (Class[])new Class[]{ServerboundPackets1_21_6.class, ServerboundConfigurationPackets1_21_9.class}), ProtocolUtil.packetTypeMap((Class)this.unmappedServerboundPacketType, (Class[])new Class[]{ServerboundPackets26_1.class, ServerboundConfigurationPackets1_21_9.class}));
    }

    public Types1_20_5<StructuredDataKeys1_21_11, EntityDataTypes26_1> mappedTypes() {
        return VersionedTypes.V26_1;
    }

    private void addTrimMaterials(String ... trimMaterials) {
        for (String trimMaterial : trimMaterials) {
            CompoundTag materialTag = new CompoundTag();
            CompoundTag materialDescription = new CompoundTag();
            materialDescription.putString("translate", "trim_material.minecraft." + trimMaterial);
            materialTag.put("description", (Tag)materialDescription);
            materialTag.putString("asset_name", trimMaterial);
            this.registryDataRewriter.addEntries("trim_material", new RegistryEntry[]{new RegistryEntry(trimMaterial, (Tag)materialTag)});
        }
    }

    protected void registerPackets() {
        super.registerPackets();
        this.appendClientbound(ClientboundConfigurationPackets1_21_9.FINISH_CONFIGURATION, wrapper -> {
            PacketWrapper clocksPacket = wrapper.create((PacketType)ClientboundConfigurationPackets1_21_9.REGISTRY_DATA);
            clocksPacket.write(Types.STRING, (Object)"world_clock");
            clocksPacket.write(Types.REGISTRY_ENTRY_ARRAY, (Object)new RegistryEntry[]{new RegistryEntry("minecraft:overworld", (Tag)new CompoundTag())});
            clocksPacket.send(Protocol1_21_11To26_1.class);
            this.sendSoundVariants(wrapper, "cat_sound_variant", MAPPINGS.catSoundVariants());
            this.sendSoundVariants(wrapper, "cow_sound_variant", MAPPINGS.cowSoundVariants());
            this.sendSoundVariants(wrapper, "pig_sound_variant", MAPPINGS.pigSoundVariants());
            this.sendSoundVariants(wrapper, "chicken_sound_variant", MAPPINGS.chickenSoundVariants());
            if (!wrapper.user().has(TagsSent.class)) {
                PacketWrapper tagsPacket = wrapper.create((PacketType)ClientboundConfigurationPackets1_21_9.UPDATE_TAGS);
                tagsPacket.write((Type)Types.VAR_INT, (Object)0);
                tagsPacket.send(Protocol1_21_11To26_1.class, false);
            }
        });
        this.addRequiredRegistryEntries();
        this.registryDataRewriter.addHandler("timeline", (key, tag) -> tag.putString("clock", "overworld"));
        this.registryDataRewriter.addHandler("wolf_sound_variant", (key, tag) -> {
            CompoundTag sounds = new CompoundTag();
            for (Map.Entry entry : tag.entrySet()) {
                sounds.put((String)entry.getKey(), (Tag)entry.getValue());
            }
            tag.clear();
            sounds.putString("step_sound", "entity.wolf.step");
            tag.put("adult_sounds", (Tag)sounds);
            tag.put("baby_sounds", (Tag)sounds.copy());
        });
        this.registryDataRewriter.addHandler("wolf_variant", (key, tag) -> {
            CompoundTag assets = tag.getCompoundTag("assets");
            CompoundTag babyAssets = new CompoundTag();
            for (Map.Entry entry : assets.entrySet()) {
                babyAssets.putString((String)entry.getKey(), String.valueOf(((Tag)entry.getValue()).getValue()) + "_baby");
            }
            tag.put("baby_assets", (Tag)babyAssets);
        });
        this.registryDataRewriter.addHandler("frog_variant", (key, tag) -> this.swapEntityNameAffix("frog", (CompoundTag)tag));
        this.swapAffixAndAddAssetId("chicken_variant", "chicken");
        this.swapAffixAndAddAssetId("cow_variant", "cow");
        this.swapAffixAndAddAssetId("pig_variant", "pig");
        this.registryDataRewriter.addHandler("cat_variant", (key, tag) -> {
            this.addEntityNamePrefix("cat", (CompoundTag)tag);
            this.addBabyAssetId((CompoundTag)tag);
        });
        this.registryDataRewriter.addHandler("dimension_type", (key, tag) -> {
            tag.putBoolean("has_ender_dragon_fight", Key.equals((String)key, (String)"the_end"));
            CompoundTag attributes = tag.getCompoundTag("attributes");
            if (attributes != null) {
                int ambientLightColor = switch (Key.stripMinecraftNamespace((String)key)) {
                    case "the_end" -> -12630209;
                    case "the_nether" -> -13621215;
                    case "overworld" -> -16119286;
                    default -> -16777216;
                };
                attributes.putInt("visual/ambient_light_color", ambientLightColor);
            }
        });
        this.registerClientbound(ClientboundPackets1_21_11.SET_TIME, wrapper -> {
            wrapper.passthrough((Type)Types.LONG);
            long dayTime = (Long)wrapper.read((Type)Types.LONG);
            boolean tickDayTime = (Boolean)wrapper.read((Type)Types.BOOLEAN);
            wrapper.write((Type)Types.VAR_INT, (Object)1);
            wrapper.write((Type)Types.VAR_INT, (Object)0);
            wrapper.write((Type)Types.VAR_LONG, (Object)dayTime);
            wrapper.write((Type)Types.FLOAT, (Object)Float.valueOf(0.0f));
            wrapper.write((Type)Types.FLOAT, (Object)Float.valueOf(tickDayTime ? 1.0f : 0.0f));
        });
        this.replaceClientbound(ClientboundPackets1_21_11.UPDATE_TAGS, this::handleTags);
        this.replaceClientbound(ClientboundConfigurationPackets1_21_9.UPDATE_TAGS, this::handleTags);
        this.cancelServerbound(ServerboundPackets26_1.SET_GAME_RULE);
        this.registerServerbound(ServerboundPackets26_1.CLIENT_COMMAND, wrapper -> {
            int action = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            if (action == 2) {
                wrapper.cancel();
            }
        });
    }

    public TagRewriter<ClientboundPacket1_21_11> getTagRewriter() {
        return this.tagRewriter;
    }

    private void sendSoundVariants(PacketWrapper wrapper, String key, CompoundTag tag) {
        PacketWrapper clocksPacket = wrapper.create((PacketType)ClientboundConfigurationPackets1_21_9.REGISTRY_DATA);
        clocksPacket.write(Types.STRING, (Object)key);
        clocksPacket.write(Types.REGISTRY_ENTRY_ARRAY, (Object)this.registryDataRewriter.entriesFromTag(tag));
        clocksPacket.send(Protocol1_21_11To26_1.class);
    }

    private void addBabyAssetId(CompoundTag tag) {
        String assetId = tag.getString("asset_id");
        tag.putString("baby_asset_id", assetId + "_baby");
    }

    public BlockRewriter<ClientboundPacket1_21_11> getBlockRewriter() {
        return this.blockRewriter;
    }

    public MappingData getMappingData() {
        return MAPPINGS;
    }

    public BlockItemPacketRewriter26_1 getItemRewriter() {
        return this.itemRewriter;
    }

    public RecipeDisplayRewriter<ClientboundPacket1_21_11> getRecipeRewriter() {
        return this.recipeRewriter;
    }

    public EntityPacketRewriter26_1 getEntityRewriter() {
        return this.entityRewriter;
    }

    private void handleTags(PacketWrapper wrapper) {
        this.tagRewriter.handleGeneric(wrapper);
        wrapper.user().put((StorableObject)new TagsSent());
    }
}

