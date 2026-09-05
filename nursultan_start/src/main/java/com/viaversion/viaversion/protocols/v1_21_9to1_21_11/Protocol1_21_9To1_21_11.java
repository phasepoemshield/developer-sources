/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.ByteTag
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.FloatTag
 *  com.viaversion.nbt.tag.IntTag
 *  com.viaversion.nbt.tag.ListTag
 *  com.viaversion.nbt.tag.NumberTag
 *  com.viaversion.nbt.tag.StringTag
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viaversion.api.connection.StorableObject
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.data.MappingData
 *  com.viaversion.viaversion.api.data.entity.EntityTracker
 *  com.viaversion.viaversion.api.minecraft.RegistryEntry
 *  com.viaversion.viaversion.api.minecraft.data.StructuredDataKey
 *  com.viaversion.viaversion.api.minecraft.data.version.StructuredDataKeys1_21_11
 *  com.viaversion.viaversion.api.minecraft.data.version.StructuredDataKeys1_21_5
 *  com.viaversion.viaversion.api.minecraft.entities.EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_21_11
 *  com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes1_21_11
 *  com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes1_21_9
 *  com.viaversion.viaversion.api.protocol.AbstractProtocol
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.packet.provider.PacketTypesProvider
 *  com.viaversion.viaversion.api.protocol.packet.provider.SimplePacketTypesProvider
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.chunk.ChunkType1_21_5
 *  com.viaversion.viaversion.api.type.types.misc.ParticleType$Fillers
 *  com.viaversion.viaversion.api.type.types.version.Types1_20_5
 *  com.viaversion.viaversion.api.type.types.version.VersionedTypes
 *  com.viaversion.viaversion.data.entity.EntityTrackerBase
 *  com.viaversion.viaversion.protocols.v1_21_9to1_21_11.storage.GameTimeStorage
 *  com.viaversion.viaversion.rewriter.BlockRewriter
 *  com.viaversion.viaversion.rewriter.ParticleRewriter
 *  com.viaversion.viaversion.rewriter.RecipeDisplayRewriter
 *  com.viaversion.viaversion.rewriter.RegistryDataRewriter
 *  com.viaversion.viaversion.rewriter.TagRewriter
 *  com.viaversion.viaversion.rewriter.block.BlockRewriter1_21_5
 *  com.viaversion.viaversion.rewriter.text.NBTComponentRewriter
 *  com.viaversion.viaversion.util.Key
 *  com.viaversion.viaversion.util.ProtocolUtil
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package com.viaversion.viaversion.protocols.v1_21_9to1_21_11;

import com.viaversion.nbt.tag.ByteTag;
import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.FloatTag;
import com.viaversion.nbt.tag.IntTag;
import com.viaversion.nbt.tag.ListTag;
import com.viaversion.nbt.tag.NumberTag;
import com.viaversion.nbt.tag.StringTag;
import com.viaversion.nbt.tag.Tag;
import com.viaversion.viaversion.api.connection.StorableObject;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.data.MappingData;
import com.viaversion.viaversion.api.data.entity.EntityTracker;
import com.viaversion.viaversion.api.minecraft.RegistryEntry;
import com.viaversion.viaversion.api.minecraft.data.StructuredDataKey;
import com.viaversion.viaversion.api.minecraft.data.version.StructuredDataKeys1_21_11;
import com.viaversion.viaversion.api.minecraft.data.version.StructuredDataKeys1_21_5;
import com.viaversion.viaversion.api.minecraft.entities.EntityType;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_21_11;
import com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes1_21_11;
import com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes1_21_9;
import com.viaversion.viaversion.api.protocol.AbstractProtocol;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.packet.provider.PacketTypesProvider;
import com.viaversion.viaversion.api.protocol.packet.provider.SimplePacketTypesProvider;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.chunk.ChunkType1_21_5;
import com.viaversion.viaversion.api.type.types.misc.ParticleType;
import com.viaversion.viaversion.api.type.types.version.Types1_20_5;
import com.viaversion.viaversion.api.type.types.version.VersionedTypes;
import com.viaversion.viaversion.data.entity.EntityTrackerBase;
import com.viaversion.viaversion.protocols.v1_21_4to1_21_5.rewriter.RecipeDisplayRewriter1_21_5;
import com.viaversion.viaversion.protocols.v1_21_5to1_21_6.packet.ServerboundPackets1_21_6;
import com.viaversion.viaversion.protocols.v1_21_7to1_21_9.packet.ClientboundConfigurationPackets1_21_9;
import com.viaversion.viaversion.protocols.v1_21_7to1_21_9.packet.ClientboundPacket1_21_9;
import com.viaversion.viaversion.protocols.v1_21_7to1_21_9.packet.ClientboundPackets1_21_9;
import com.viaversion.viaversion.protocols.v1_21_7to1_21_9.packet.ServerboundConfigurationPackets1_21_9;
import com.viaversion.viaversion.protocols.v1_21_7to1_21_9.packet.ServerboundPacket1_21_9;
import com.viaversion.viaversion.protocols.v1_21_9to1_21_11.data.MappingData1_21_11;
import com.viaversion.viaversion.protocols.v1_21_9to1_21_11.packet.ClientboundPacket1_21_11;
import com.viaversion.viaversion.protocols.v1_21_9to1_21_11.packet.ClientboundPackets1_21_11;
import com.viaversion.viaversion.protocols.v1_21_9to1_21_11.rewriter.BlockItemPacketRewriter1_21_11;
import com.viaversion.viaversion.protocols.v1_21_9to1_21_11.rewriter.ComponentRewriter1_21_11;
import com.viaversion.viaversion.protocols.v1_21_9to1_21_11.rewriter.EntityPacketRewriter1_21_11;
import com.viaversion.viaversion.protocols.v1_21_9to1_21_11.storage.GameTimeStorage;
import com.viaversion.viaversion.rewriter.BlockRewriter;
import com.viaversion.viaversion.rewriter.ParticleRewriter;
import com.viaversion.viaversion.rewriter.RecipeDisplayRewriter;
import com.viaversion.viaversion.rewriter.RegistryDataRewriter;
import com.viaversion.viaversion.rewriter.TagRewriter;
import com.viaversion.viaversion.rewriter.block.BlockRewriter1_21_5;
import com.viaversion.viaversion.rewriter.text.NBTComponentRewriter;
import com.viaversion.viaversion.util.Key;
import com.viaversion.viaversion.util.ProtocolUtil;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import org.checkerframework.checker.nullness.qual.Nullable;

public final class Protocol1_21_9To1_21_11
extends AbstractProtocol<ClientboundPacket1_21_9, ClientboundPacket1_21_11, ServerboundPacket1_21_9, ServerboundPacket1_21_9> {
    public static final MappingData1_21_11 MAPPINGS = new MappingData1_21_11();
    private static final Set<String> REMOVE_SKY_COLOR_FROM_BIOMES = Set.of("warped_forest", "basalt_deltas", "nether_wastes", "soul_sand_valley", "crimson_forest");
    private final EntityPacketRewriter1_21_11 entityRewriter = new EntityPacketRewriter1_21_11(this);
    private final BlockItemPacketRewriter1_21_11 itemRewriter = new BlockItemPacketRewriter1_21_11(this);
    private final BlockRewriter<ClientboundPacket1_21_9> blockRewriter = new BlockRewriter1_21_5((Protocol)this, ChunkType1_21_5::new);
    private final ParticleRewriter<ClientboundPacket1_21_9> particleRewriter = new ParticleRewriter((Protocol)this);
    private final TagRewriter<ClientboundPacket1_21_9> tagRewriter = new TagRewriter((Protocol)this);
    private final NBTComponentRewriter<ClientboundPacket1_21_9> componentRewriter = new ComponentRewriter1_21_11(this);
    private final RegistryDataRewriter registryDataRewriter = new RegistryDataRewriter((Protocol)this);
    private final RecipeDisplayRewriter<ClientboundPacket1_21_9> recipeRewriter = new RecipeDisplayRewriter1_21_5<ClientboundPacket1_21_9>((Protocol<ClientboundPacket1_21_9, ?, ?, ?>)this);

    public Types1_20_5<StructuredDataKeys1_21_5, EntityDataTypes1_21_9> types() {
        return VersionedTypes.V1_21_9;
    }

    public Protocol1_21_9To1_21_11() {
        super(ClientboundPacket1_21_9.class, ClientboundPacket1_21_11.class, ServerboundPacket1_21_9.class, ServerboundPacket1_21_9.class);
    }

    public void init(UserConnection connection) {
        this.addEntityTracker(connection, (EntityTracker)new EntityTrackerBase(connection, (EntityType)EntityTypes1_21_11.PLAYER));
        this.addItemHasher(connection);
        connection.put((StorableObject)new GameTimeStorage());
    }

    public RegistryDataRewriter getRegistryDataRewriter() {
        return this.registryDataRewriter;
    }

    public NBTComponentRewriter<ClientboundPacket1_21_9> getComponentRewriter() {
        return this.componentRewriter;
    }

    protected void onMappingDataLoaded() {
        EntityTypes1_21_11.initialize((Protocol)this);
        ParticleType.Fillers.fill1_21_9((Protocol)this);
        this.mappedTypes().structuredData.filler((Protocol)this).add(new StructuredDataKey[]{StructuredDataKey.CUSTOM_DATA, StructuredDataKey.MAX_STACK_SIZE, StructuredDataKey.MAX_DAMAGE, StructuredDataKey.UNBREAKABLE1_21_5, StructuredDataKey.RARITY, StructuredDataKey.TOOLTIP_DISPLAY, StructuredDataKey.DAMAGE_RESISTANT1_21_2, StructuredDataKey.CUSTOM_NAME, StructuredDataKey.LORE, StructuredDataKey.ENCHANTMENTS1_21_5, StructuredDataKey.CUSTOM_MODEL_DATA1_21_4, StructuredDataKey.BLOCKS_ATTACKS1_21_5, StructuredDataKey.PROVIDES_BANNER_PATTERNS1_21_5, StructuredDataKey.REPAIR_COST, StructuredDataKey.CREATIVE_SLOT_LOCK, StructuredDataKey.ENCHANTMENT_GLINT_OVERRIDE, StructuredDataKey.INTANGIBLE_PROJECTILE, StructuredDataKey.STORED_ENCHANTMENTS1_21_5, StructuredDataKey.DYED_COLOR1_21_5, StructuredDataKey.MAP_COLOR, StructuredDataKey.MAP_ID, StructuredDataKey.MAP_DECORATIONS, StructuredDataKey.MAP_POST_PROCESSING, StructuredDataKey.POTION_CONTENTS1_21_2, StructuredDataKey.SUSPICIOUS_STEW_EFFECTS, StructuredDataKey.WRITABLE_BOOK_CONTENT, StructuredDataKey.WRITTEN_BOOK_CONTENT, StructuredDataKey.TRIM1_21_5, StructuredDataKey.DEBUG_STICK_STATE, StructuredDataKey.ENTITY_DATA1_21_9, StructuredDataKey.BUCKET_ENTITY_DATA, StructuredDataKey.BLOCK_ENTITY_DATA1_21_9, StructuredDataKey.INSTRUMENT1_21_5, StructuredDataKey.RECIPES, StructuredDataKey.LODESTONE_TRACKER, StructuredDataKey.FIREWORK_EXPLOSION, StructuredDataKey.FIREWORKS, StructuredDataKey.PROFILE1_21_9, StructuredDataKey.NOTE_BLOCK_SOUND, StructuredDataKey.BANNER_PATTERNS, StructuredDataKey.BASE_COLOR, StructuredDataKey.POT_DECORATIONS, StructuredDataKey.BLOCK_STATE, StructuredDataKey.BEES1_21_9, StructuredDataKey.LOCK1_21_2, StructuredDataKey.CONTAINER_LOOT, StructuredDataKey.TOOL1_21_5, StructuredDataKey.ITEM_NAME, StructuredDataKey.OMINOUS_BOTTLE_AMPLIFIER, StructuredDataKey.FOOD1_21_2, StructuredDataKey.JUKEBOX_PLAYABLE1_21_5, StructuredDataKey.ATTRIBUTE_MODIFIERS1_21_6, StructuredDataKey.REPAIRABLE, StructuredDataKey.ENCHANTABLE, StructuredDataKey.CONSUMABLE1_21_2, StructuredDataKey.ATTACK_RANGE, StructuredDataKey.USE_COOLDOWN, StructuredDataKey.DAMAGE, StructuredDataKey.EQUIPPABLE1_21_6, StructuredDataKey.ITEM_MODEL, StructuredDataKey.GLIDER, StructuredDataKey.TOOLTIP_STYLE, StructuredDataKey.DEATH_PROTECTION, StructuredDataKey.WEAPON, StructuredDataKey.POTION_DURATION_SCALE, StructuredDataKey.VILLAGER_VARIANT, StructuredDataKey.WOLF_VARIANT, StructuredDataKey.WOLF_COLLAR, StructuredDataKey.FOX_VARIANT, StructuredDataKey.SALMON_SIZE, StructuredDataKey.PARROT_VARIANT, StructuredDataKey.TROPICAL_FISH_PATTERN, StructuredDataKey.TROPICAL_FISH_BASE_COLOR, StructuredDataKey.TROPICAL_FISH_PATTERN_COLOR, StructuredDataKey.MOOSHROOM_VARIANT, StructuredDataKey.RABBIT_VARIANT, StructuredDataKey.PIG_VARIANT, StructuredDataKey.FROG_VARIANT, StructuredDataKey.HORSE_VARIANT, StructuredDataKey.PAINTING_VARIANT, StructuredDataKey.LLAMA_VARIANT, StructuredDataKey.AXOLOTL_VARIANT, StructuredDataKey.CAT_VARIANT, StructuredDataKey.CAT_COLLAR, StructuredDataKey.SHEEP_COLOR, StructuredDataKey.SHULKER_COLOR, StructuredDataKey.PROVIDES_TRIM_MATERIAL1_21_5, StructuredDataKey.BREAK_SOUND, StructuredDataKey.COW_VARIANT, StructuredDataKey.CHICKEN_VARIANT1_21_5, StructuredDataKey.WOLF_SOUND_VARIANT, StructuredDataKey.USE_EFFECTS, StructuredDataKey.MINIMUM_ATTACK_CHARGE, StructuredDataKey.DAMAGE_TYPE1_21_11, StructuredDataKey.PIERCING_WEAPON, StructuredDataKey.KINETIC_WEAPON, StructuredDataKey.SWING_ANIMATION, StructuredDataKey.ZOMBIE_NAUTILUS_VARIANT1_21_11});
        super.onMappingDataLoaded();
    }

    public ParticleRewriter<ClientboundPacket1_21_9> getParticleRewriter() {
        return this.particleRewriter;
    }

    protected PacketTypesProvider<ClientboundPacket1_21_9, ClientboundPacket1_21_11, ServerboundPacket1_21_9, ServerboundPacket1_21_9> createPacketTypesProvider() {
        return new SimplePacketTypesProvider(ProtocolUtil.packetTypeMap((Class)this.unmappedClientboundPacketType, (Class[])new Class[]{ClientboundPackets1_21_9.class, ClientboundConfigurationPackets1_21_9.class}), ProtocolUtil.packetTypeMap((Class)this.mappedClientboundPacketType, (Class[])new Class[]{ClientboundPackets1_21_11.class, ClientboundConfigurationPackets1_21_9.class}), ProtocolUtil.packetTypeMap((Class)this.mappedServerboundPacketType, (Class[])new Class[]{ServerboundPackets1_21_6.class, ServerboundConfigurationPackets1_21_9.class}), ProtocolUtil.packetTypeMap((Class)this.unmappedServerboundPacketType, (Class[])new Class[]{ServerboundPackets1_21_6.class, ServerboundConfigurationPackets1_21_9.class}));
    }

    public Types1_20_5<StructuredDataKeys1_21_11, EntityDataTypes1_21_11> mappedTypes() {
        return VersionedTypes.V1_21_11;
    }

    protected void registerPackets() {
        super.registerPackets();
        this.appendClientbound(ClientboundConfigurationPackets1_21_9.FINISH_CONFIGURATION, wrapper -> {
            PacketWrapper zombieNautilusVariantsPacket = wrapper.create((PacketType)ClientboundConfigurationPackets1_21_9.REGISTRY_DATA);
            zombieNautilusVariantsPacket.write(Types.STRING, (Object)"zombie_nautilus_variant");
            CompoundTag temperateZombieNautilus = new CompoundTag();
            temperateZombieNautilus.putString("asset_id", "entity/zombie_nautilus/temperate");
            temperateZombieNautilus.put("spawn_conditions", (Tag)new ListTag(CompoundTag.class));
            zombieNautilusVariantsPacket.write(Types.REGISTRY_ENTRY_ARRAY, (Object)new RegistryEntry[]{new RegistryEntry("minecraft:pale", (Tag)temperateZombieNautilus)});
            zombieNautilusVariantsPacket.send(Protocol1_21_9To1_21_11.class);
            PacketWrapper timelinePacket = wrapper.create((PacketType)ClientboundConfigurationPackets1_21_9.REGISTRY_DATA);
            timelinePacket.write(Types.STRING, (Object)"timeline");
            RegistryEntry[] timelineEntries = new RegistryEntry[MAPPINGS.timelineRegistry().size()];
            int index = 0;
            for (Map.Entry entry : MAPPINGS.timelineRegistry().entrySet()) {
                timelineEntries[index++] = new RegistryEntry((String)entry.getKey(), (Tag)entry.getValue());
            }
            timelinePacket.write(Types.REGISTRY_ENTRY_ARRAY, (Object)timelineEntries);
            timelinePacket.send(Protocol1_21_9To1_21_11.class);
        });
        this.registryDataRewriter.addHandler("dimension_type", (key, tag) -> {
            ByteTag trueTag = new ByteTag(1);
            CompoundTag attributes = new CompoundTag();
            tag.put("attributes", (Tag)attributes);
            if (Key.equals((String)key, (String)"the_nether")) {
                tag.put("timelines", (Tag)new ListTag(List.of(new StringTag("villager_schedule"))));
                tag.putString("skybox", "none");
                tag.putString("cardinal_light", "nether");
                attributes.putString("visual/sky_light_color", "#7a7aff");
                attributes.putFloat("visual/fog_start_distance", 10.0f);
                attributes.putFloat("visual/fog_end_distance", 96.0f);
                attributes.putFloat("gameplay/sky_light_level", 4.0f);
            } else if (Key.equals((String)key, (String)"the_end")) {
                tag.put("timelines", (Tag)new ListTag(List.of(new StringTag("villager_schedule"))));
                tag.putString("skybox", "end");
                attributes.putString("visual/fog_color", "#181318");
                attributes.putString("visual/sky_color", "#000000");
                attributes.putString("visual/sky_light_color", "#ac60cd");
                this.addAmbientCaveSound(attributes);
                CompoundTag backgroundMusic = new CompoundTag();
                backgroundMusic.put("default", (Tag)this.backgroundMusicEntry("music.end", true, 6000));
                attributes.put("audio/background_music", (Tag)backgroundMusic);
            } else {
                ListTag timelines = new ListTag(List.of(new StringTag("day"), new StringTag("moon"), new StringTag("early_game")));
                tag.put("timelines", (Tag)timelines);
                attributes.putString("visual/fog_color", "#c0d8ff");
                attributes.putString("visual/sky_color", "#78a7ff");
                this.addAmbientCaveSound(attributes);
                CompoundTag backgroundMusic = new CompoundTag();
                backgroundMusic.put("default", (Tag)this.backgroundMusicEntry("music.game", false, 12000));
                backgroundMusic.put("creative", (Tag)this.backgroundMusicEntry("music.creative", false, 12000));
                attributes.put("audio/background_music", (Tag)backgroundMusic);
            }
            Tag fixedTime = tag.remove("fixed_time");
            if (fixedTime != null) {
                tag.putBoolean("has_fixed_time", true);
            }
            if (!tag.getBoolean("natural")) {
                attributes.putFloat("visual/sky_light_factor", 0.0f);
            }
            if (tag.getBoolean("ultrawarm")) {
                CompoundTag defaultDripstoneParticle = new CompoundTag();
                defaultDripstoneParticle.putString("type", "dripping_dripstone_lava");
                attributes.put("visual/default_dripstone_particle", (Tag)defaultDripstoneParticle);
            }
            this.moveAttribute((CompoundTag)tag, attributes, "cloud_height", "visual/cloud_height", cloudHeight -> {
                if (cloudHeight instanceof NumberTag) {
                    NumberTag numberTag = (NumberTag)cloudHeight;
                    attributes.putString("visual/cloud_color", "#ccffffff");
                    return new FloatTag(numberTag.asFloat());
                }
                return null;
            }, null);
            this.moveAttribute((CompoundTag)tag, attributes, "has_raids", "gameplay/can_start_raid", Function.identity(), (Tag)trueTag);
            this.moveAttribute((CompoundTag)tag, attributes, "piglin_safe", "gameplay/piglins_zombify", attributeTag -> ((NumberTag)attributeTag).asBoolean() ? ByteTag.ZERO : trueTag, (Tag)ByteTag.ZERO);
            this.moveAttribute((CompoundTag)tag, attributes, "respawn_anchor_works", "gameplay/respawn_anchor_works", Function.identity(), (Tag)trueTag);
            this.moveAttribute((CompoundTag)tag, attributes, "ultrawarm", "gameplay/fast_lava", Function.identity(), (Tag)ByteTag.ZERO);
            this.moveAttribute((CompoundTag)tag, attributes, "ultrawarm", "gameplay/water_evaporates", Function.identity(), (Tag)ByteTag.ZERO);
        });
        this.registryDataRewriter.addHandler("worldgen/biome", (key, tag) -> {
            CompoundTag particleTag;
            Tag loopSound;
            Tag additionsSound;
            CompoundTag data;
            ListTag musicTag;
            CompoundTag effects = tag.getCompoundTag("effects");
            CompoundTag attributes = new CompoundTag();
            tag.put("attributes", (Tag)attributes);
            if (!REMOVE_SKY_COLOR_FROM_BIOMES.contains(Key.stripMinecraftNamespace((String)key))) {
                this.moveAttribute(effects, attributes, "sky_color", "visual/sky_color", Function.identity(), (Tag)new IntTag(0));
            }
            if (!Key.equals((String)key, (String)"the_end")) {
                this.moveAttribute(effects, attributes, "water_fog_color", "visual/water_fog_color", Function.identity(), (Tag)new IntTag(-16448205));
                this.moveAttribute(effects, attributes, "fog_color", "visual/fog_color", Function.identity(), (Tag)new IntTag(0));
            }
            if ((musicTag = effects.getListTag("music", CompoundTag.class)) != null && !musicTag.isEmpty() && (data = ((CompoundTag)musicTag.get(0)).getCompoundTag("data")) != null) {
                CompoundTag defaultMusic = new CompoundTag();
                Tag maxDelay = data.get("max_delay");
                Tag minDelay = data.get("min_delay");
                Tag sound = data.get("sound");
                if (maxDelay != null) {
                    defaultMusic.put("max_delay", maxDelay);
                }
                if (minDelay != null) {
                    defaultMusic.put("min_delay", minDelay);
                }
                if (sound != null) {
                    defaultMusic.put("sound", sound);
                }
                CompoundTag backgroundMusic = new CompoundTag();
                backgroundMusic.put("default", (Tag)defaultMusic);
                attributes.put("audio/background_music", (Tag)backgroundMusic);
            }
            CompoundTag ambientSounds = new CompoundTag();
            Tag moodSound = effects.get("mood_sound");
            if (moodSound != null) {
                ambientSounds.put("mood", moodSound);
            }
            if ((additionsSound = effects.get("additions_sound")) != null) {
                ambientSounds.put("additions", additionsSound);
            }
            if ((loopSound = effects.get("ambient_sound")) != null) {
                ambientSounds.put("loop", loopSound);
            }
            if (!ambientSounds.isEmpty()) {
                attributes.put("audio/ambient_sounds", (Tag)ambientSounds);
            }
            if ((particleTag = effects.getCompoundTag("particle")) != null) {
                CompoundTag entry = new CompoundTag();
                entry.put("probability", particleTag.get("probability"));
                entry.put("particle", particleTag.get("options"));
                ListTag ambientParticles = new ListTag(CompoundTag.class);
                ambientParticles.add((Tag)entry);
                attributes.put("visual/ambient_particles", (Tag)ambientParticles);
            }
        });
    }

    public TagRewriter<ClientboundPacket1_21_9> getTagRewriter() {
        return this.tagRewriter;
    }

    public BlockRewriter<ClientboundPacket1_21_9> getBlockRewriter() {
        return this.blockRewriter;
    }

    public MappingData getMappingData() {
        return MAPPINGS;
    }

    public BlockItemPacketRewriter1_21_11 getItemRewriter() {
        return this.itemRewriter;
    }

    public RecipeDisplayRewriter<ClientboundPacket1_21_9> getRecipeRewriter() {
        return this.recipeRewriter;
    }

    public EntityPacketRewriter1_21_11 getEntityRewriter() {
        return this.entityRewriter;
    }

    private void addAmbientCaveSound(CompoundTag attributes) {
        CompoundTag ambientSounds = new CompoundTag();
        CompoundTag moodSound = new CompoundTag();
        moodSound.putInt("tick_delay", 6000);
        moodSound.putFloat("offset", 2.0f);
        moodSound.putString("sound", "ambient.cave");
        moodSound.putInt("block_search_extent", 8);
        ambientSounds.put("mood", (Tag)moodSound);
        attributes.put("audio/ambient_sounds", (Tag)ambientSounds);
    }

    private CompoundTag backgroundMusicEntry(String soundKey, boolean replaceCurrentMusic, int minDelay) {
        CompoundTag sound = new CompoundTag();
        if (replaceCurrentMusic) {
            sound.putBoolean("replace_current_music", true);
        }
        sound.putInt("max_delay", 24000);
        sound.putString("sound", soundKey);
        sound.putInt("min_delay", minDelay);
        return sound;
    }

    private void moveAttribute(CompoundTag baseTag, CompoundTag attributes, String key, String mappedKey, Function<Tag, Tag> tagMapper, @Nullable Tag defaultTag) {
        Tag attributeTag = baseTag.get(key);
        if (attributeTag != null) {
            attributes.put(mappedKey, tagMapper.apply(attributeTag));
        } else if (defaultTag != null) {
            attributes.put(mappedKey, defaultTag);
        }
    }
}

