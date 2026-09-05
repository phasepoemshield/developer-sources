/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.ByteTag
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.IntTag
 *  com.viaversion.nbt.tag.ListTag
 *  com.viaversion.nbt.tag.NumberTag
 *  com.viaversion.nbt.tag.StringTag
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viabackwards.api.BackwardsProtocol
 *  com.viaversion.viabackwards.api.data.BackwardsMappingData
 *  com.viaversion.viabackwards.api.rewriters.BackwardsRegistryRewriter
 *  com.viaversion.viabackwards.api.rewriters.text.NBTComponentRewriter
 *  com.viaversion.viabackwards.protocol.v1_21_11to1_21_9.storage.GameTimeStorage
 *  com.viaversion.viaversion.api.connection.StorableObject
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.data.FullMappings
 *  com.viaversion.viaversion.api.data.entity.EntityTracker
 *  com.viaversion.viaversion.api.data.item.ItemHasher
 *  com.viaversion.viaversion.api.minecraft.entities.EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_21_11
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.packet.provider.PacketTypesProvider
 *  com.viaversion.viaversion.api.protocol.packet.provider.SimplePacketTypesProvider
 *  com.viaversion.viaversion.api.type.types.chunk.ChunkType1_21_5
 *  com.viaversion.viaversion.api.type.types.version.VersionedTypes
 *  com.viaversion.viaversion.api.type.types.version.VersionedTypesHolder
 *  com.viaversion.viaversion.data.entity.EntityTrackerBase
 *  com.viaversion.viaversion.data.item.ItemHasherBase
 *  com.viaversion.viaversion.protocols.v1_21_4to1_21_5.rewriter.RecipeDisplayRewriter1_21_5
 *  com.viaversion.viaversion.protocols.v1_21_5to1_21_6.packet.ServerboundPackets1_21_6
 *  com.viaversion.viaversion.protocols.v1_21_7to1_21_9.packet.ClientboundConfigurationPackets1_21_9
 *  com.viaversion.viaversion.protocols.v1_21_7to1_21_9.packet.ClientboundPacket1_21_9
 *  com.viaversion.viaversion.protocols.v1_21_7to1_21_9.packet.ClientboundPackets1_21_9
 *  com.viaversion.viaversion.protocols.v1_21_7to1_21_9.packet.ServerboundConfigurationPackets1_21_9
 *  com.viaversion.viaversion.protocols.v1_21_7to1_21_9.packet.ServerboundPacket1_21_9
 *  com.viaversion.viaversion.protocols.v1_21_9to1_21_11.Protocol1_21_9To1_21_11
 *  com.viaversion.viaversion.protocols.v1_21_9to1_21_11.packet.ClientboundPacket1_21_11
 *  com.viaversion.viaversion.protocols.v1_21_9to1_21_11.packet.ClientboundPackets1_21_11
 *  com.viaversion.viaversion.rewriter.BlockRewriter
 *  com.viaversion.viaversion.rewriter.ParticleRewriter
 *  com.viaversion.viaversion.rewriter.RecipeDisplayRewriter
 *  com.viaversion.viaversion.rewriter.TagRewriter
 *  com.viaversion.viaversion.util.Key
 *  com.viaversion.viaversion.util.ProtocolUtil
 *  com.viaversion.viaversion.util.TagUtil
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package com.viaversion.viabackwards.protocol.v1_21_11to1_21_9;

import com.viaversion.nbt.tag.ByteTag;
import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.IntTag;
import com.viaversion.nbt.tag.ListTag;
import com.viaversion.nbt.tag.NumberTag;
import com.viaversion.nbt.tag.StringTag;
import com.viaversion.nbt.tag.Tag;
import com.viaversion.viabackwards.api.BackwardsProtocol;
import com.viaversion.viabackwards.api.data.BackwardsMappingData;
import com.viaversion.viabackwards.api.rewriters.BackwardsRegistryRewriter;
import com.viaversion.viabackwards.api.rewriters.text.NBTComponentRewriter;
import com.viaversion.viabackwards.protocol.v1_21_11to1_21_9.rewriter.BlockItemPacketRewriter1_21_11;
import com.viaversion.viabackwards.protocol.v1_21_11to1_21_9.rewriter.ComponentRewriter1_21_11;
import com.viaversion.viabackwards.protocol.v1_21_11to1_21_9.rewriter.EntityPacketRewriter1_21_11;
import com.viaversion.viabackwards.protocol.v1_21_11to1_21_9.storage.GameTimeStorage;
import com.viaversion.viaversion.api.connection.StorableObject;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.data.FullMappings;
import com.viaversion.viaversion.api.data.entity.EntityTracker;
import com.viaversion.viaversion.api.data.item.ItemHasher;
import com.viaversion.viaversion.api.minecraft.entities.EntityType;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_21_11;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.packet.provider.PacketTypesProvider;
import com.viaversion.viaversion.api.protocol.packet.provider.SimplePacketTypesProvider;
import com.viaversion.viaversion.api.type.types.chunk.ChunkType1_21_5;
import com.viaversion.viaversion.api.type.types.version.VersionedTypes;
import com.viaversion.viaversion.api.type.types.version.VersionedTypesHolder;
import com.viaversion.viaversion.data.entity.EntityTrackerBase;
import com.viaversion.viaversion.data.item.ItemHasherBase;
import com.viaversion.viaversion.protocols.v1_21_4to1_21_5.rewriter.RecipeDisplayRewriter1_21_5;
import com.viaversion.viaversion.protocols.v1_21_5to1_21_6.packet.ServerboundPackets1_21_6;
import com.viaversion.viaversion.protocols.v1_21_7to1_21_9.packet.ClientboundConfigurationPackets1_21_9;
import com.viaversion.viaversion.protocols.v1_21_7to1_21_9.packet.ClientboundPacket1_21_9;
import com.viaversion.viaversion.protocols.v1_21_7to1_21_9.packet.ClientboundPackets1_21_9;
import com.viaversion.viaversion.protocols.v1_21_7to1_21_9.packet.ServerboundConfigurationPackets1_21_9;
import com.viaversion.viaversion.protocols.v1_21_7to1_21_9.packet.ServerboundPacket1_21_9;
import com.viaversion.viaversion.protocols.v1_21_9to1_21_11.Protocol1_21_9To1_21_11;
import com.viaversion.viaversion.protocols.v1_21_9to1_21_11.packet.ClientboundPacket1_21_11;
import com.viaversion.viaversion.protocols.v1_21_9to1_21_11.packet.ClientboundPackets1_21_11;
import com.viaversion.viaversion.rewriter.BlockRewriter;
import com.viaversion.viaversion.rewriter.ParticleRewriter;
import com.viaversion.viaversion.rewriter.RecipeDisplayRewriter;
import com.viaversion.viaversion.rewriter.TagRewriter;
import com.viaversion.viaversion.util.Key;
import com.viaversion.viaversion.util.ProtocolUtil;
import com.viaversion.viaversion.util.TagUtil;
import java.util.function.Function;
import org.checkerframework.checker.nullness.qual.Nullable;

public final class Protocol1_21_11To1_21_9
extends BackwardsProtocol<ClientboundPacket1_21_11, ClientboundPacket1_21_9, ServerboundPacket1_21_9, ServerboundPacket1_21_9> {
    public static final BackwardsMappingData MAPPINGS = new BackwardsMappingData("1.21.11", "1.21.9", Protocol1_21_9To1_21_11.class);
    private static final int END_FOG_COLOR = 0xA080A0;
    private static final int OVERWORLD_FOG_COLOR = -4138753;
    private final EntityPacketRewriter1_21_11 entityRewriter = new EntityPacketRewriter1_21_11(this);
    private final BlockItemPacketRewriter1_21_11 itemRewriter = new BlockItemPacketRewriter1_21_11(this);
    private final ParticleRewriter<ClientboundPacket1_21_11> particleRewriter = new ParticleRewriter((Protocol)this);
    private final NBTComponentRewriter<ClientboundPacket1_21_11> translatableRewriter = new ComponentRewriter1_21_11(this);
    private final TagRewriter<ClientboundPacket1_21_11> tagRewriter = new TagRewriter((Protocol)this);
    private final RecipeDisplayRewriter<ClientboundPacket1_21_11> recipeRewriter = new RecipeDisplayRewriter1_21_5((Protocol)this);
    private final BlockRewriter<ClientboundPacket1_21_11> blockRewriter = BlockRewriter.for1_20_2((Protocol)this, ChunkType1_21_5::new);
    private final BackwardsRegistryRewriter registryDataRewriter = new BackwardsRegistryRewriter(this){

        protected void updateType(CompoundTag tag, String key, FullMappings mappings) {
            Tag tag2;
            super.updateType(tag, key, mappings);
            if (key.equals("sound") && (tag2 = tag.get(key)) instanceof ListTag) {
                ListTag listTag = (ListTag)tag2;
                Object first = listTag.isEmpty() ? new StringTag(mappings.mappedIdentifier(0)) : listTag.get(0);
                tag.put(key, first);
            }
        }
    };

    public VersionedTypesHolder types() {
        return VersionedTypes.V1_21_11;
    }

    public Protocol1_21_11To1_21_9() {
        super(ClientboundPacket1_21_11.class, ClientboundPacket1_21_9.class, ServerboundPacket1_21_9.class, ServerboundPacket1_21_9.class);
    }

    public void init(UserConnection connection) {
        this.addEntityTracker(connection, (EntityTracker)new EntityTrackerBase(connection, (EntityType)EntityTypes1_21_11.PLAYER));
        this.addItemHasher(connection, (ItemHasher)new ItemHasherBase((Protocol)this, connection));
        connection.put((StorableObject)new GameTimeStorage());
    }

    private Tag mapColor(Tag attributeTag) {
        if (attributeTag instanceof ListTag) {
            ListTag listTag = (ListTag)attributeTag;
            NumberTag r = (NumberTag)listTag.get(0);
            NumberTag g = (NumberTag)listTag.get(1);
            NumberTag b = (NumberTag)listTag.get(2);
            return new IntTag(this.floatsToARGB(r.asFloat(), g.asFloat(), b.asFloat()));
        }
        if (attributeTag instanceof StringTag) {
            StringTag stringTag = (StringTag)attributeTag;
            return new IntTag(Integer.parseInt(stringTag.getValue().substring(1), 16));
        }
        return attributeTag;
    }

    public BackwardsRegistryRewriter getRegistryDataRewriter() {
        return this.registryDataRewriter;
    }

    public NBTComponentRewriter<ClientboundPacket1_21_11> getComponentRewriter() {
        return this.translatableRewriter;
    }

    public ParticleRewriter<ClientboundPacket1_21_11> getParticleRewriter() {
        return this.particleRewriter;
    }

    protected PacketTypesProvider<ClientboundPacket1_21_11, ClientboundPacket1_21_9, ServerboundPacket1_21_9, ServerboundPacket1_21_9> createPacketTypesProvider() {
        return new SimplePacketTypesProvider(ProtocolUtil.packetTypeMap((Class)this.unmappedClientboundPacketType, (Class[])new Class[]{ClientboundPackets1_21_11.class, ClientboundConfigurationPackets1_21_9.class}), ProtocolUtil.packetTypeMap((Class)this.mappedClientboundPacketType, (Class[])new Class[]{ClientboundPackets1_21_9.class, ClientboundConfigurationPackets1_21_9.class}), ProtocolUtil.packetTypeMap((Class)this.mappedServerboundPacketType, (Class[])new Class[]{ServerboundPackets1_21_6.class, ServerboundConfigurationPackets1_21_9.class}), ProtocolUtil.packetTypeMap((Class)this.unmappedServerboundPacketType, (Class[])new Class[]{ServerboundPackets1_21_6.class, ServerboundConfigurationPackets1_21_9.class}));
    }

    public VersionedTypesHolder mappedTypes() {
        return VersionedTypes.V1_21_9;
    }

    protected void registerPackets() {
        super.registerPackets();
        this.registryDataRewriter.addHandler("dimension_type", (key, tag) -> {
            if (Key.equals((String)key, (String)"the_nether")) {
                tag.putString("effects", "minecraft:the_nether");
                tag.putBoolean("natural", false);
            } else if (Key.equals((String)key, (String)"the_end")) {
                tag.putString("effects", "minecraft:the_end");
                tag.putBoolean("natural", false);
            } else {
                tag.putString("effects", "minecraft:overworld");
                tag.putBoolean("natural", true);
            }
            ByteTag trueTag = new ByteTag(1);
            CompoundTag attributes = tag.getCompoundTag("attributes");
            this.moveAttribute((CompoundTag)tag, attributes, "visual/cloud_height", "cloud_height", Function.identity(), null);
            this.moveAttribute((CompoundTag)tag, attributes, "gameplay/can_start_raid", "has_raids", Function.identity(), (Tag)trueTag);
            this.moveAttribute((CompoundTag)tag, attributes, "gameplay/piglins_zombify", "piglin_safe", attributeTag -> ((NumberTag)attributeTag).asBoolean() ? ByteTag.ZERO : trueTag, (Tag)ByteTag.ZERO);
            this.moveAttribute((CompoundTag)tag, attributes, "gameplay/respawn_anchor_works", "respawn_anchor_works", Function.identity(), (Tag)trueTag);
            this.moveAttribute((CompoundTag)tag, attributes, "gameplay/bed_rule", "bed_works", attributeTag -> {
                CompoundTag bedRule = (CompoundTag)attributeTag;
                return bedRule.getBoolean("can_sleep") || bedRule.getBoolean("can_set_spawn") ? trueTag : ByteTag.ZERO;
            }, (Tag)trueTag);
            this.moveAttribute((CompoundTag)tag, attributes, "gameplay/fast_lava", "ultrawarm", Function.identity(), (Tag)ByteTag.ZERO);
        });
        this.registryDataRewriter.addHandler("worldgen/biome", (key, tag) -> {
            ListTag ambientParticles;
            CompoundTag ambientSounds;
            CompoundTag def;
            CompoundTag effects = tag.getCompoundTag("effects");
            this.moveAttribute(effects, effects, "water_color", "water_color", this::mapColor, (Tag)new IntTag(4159204));
            this.moveAttribute(effects, effects, "foliage_color", "foliage_color", this::mapColor, null);
            this.moveAttribute(effects, effects, "dry_foliage_color", "dry_foliage_color", this::mapColor, null);
            this.moveAttribute(effects, effects, "grass_color", "grass_color", this::mapColor, null);
            CompoundTag attributes = (CompoundTag)tag.removeUnchecked("attributes");
            this.moveAttribute(effects, attributes, "visual/sky_color", "sky_color", this::mapColor, (Tag)new IntTag(0));
            this.moveAttribute(effects, attributes, "visual/water_fog_color", "water_fog_color", this::mapColor, (Tag)new IntTag(-16448205));
            this.moveAttribute(effects, attributes, "visual/fog_color", "fog_color", this::mapColor, (Tag)new IntTag(Key.equals((String)key, (String)"the_end") ? 0xA080A0 : -4138753));
            if (attributes == null) {
                return;
            }
            CompoundTag backgroundMusic = TagUtil.getNamespacedCompoundTag((CompoundTag)attributes, (String)"audio/background_music");
            if (backgroundMusic != null && (def = backgroundMusic.getCompoundTag("default")) != null) {
                CompoundTag data = new CompoundTag();
                Tag maxDelay = def.get("max_delay");
                Tag minDelay = def.get("min_delay");
                Tag sound = def.get("sound");
                if (maxDelay != null) {
                    data.put("max_delay", maxDelay);
                }
                if (minDelay != null) {
                    data.put("min_delay", minDelay);
                }
                if (sound != null) {
                    data.put("sound", sound);
                }
                if (!data.contains("replace_current_music")) {
                    data.putBoolean("replace_current_music", false);
                }
                CompoundTag entry = new CompoundTag();
                entry.put("data", (Tag)data);
                entry.putInt("weight", 1);
                ListTag musicList = new ListTag(CompoundTag.class);
                musicList.add((Tag)entry);
                effects.put("music", (Tag)musicList);
            }
            if ((ambientSounds = TagUtil.getNamespacedCompoundTag((CompoundTag)attributes, (String)"audio/ambient_sounds")) != null) {
                Tag additions;
                Tag mood;
                Tag loop = ambientSounds.get("loop");
                if (loop != null) {
                    effects.put("ambient_sound", loop);
                }
                if ((mood = ambientSounds.get("mood")) != null) {
                    effects.put("mood_sound", mood);
                }
                if ((additions = ambientSounds.get("additions")) != null) {
                    effects.put("additions_sound", additions);
                }
            }
            if ((ambientParticles = TagUtil.getNamespacedCompoundTagList((CompoundTag)attributes, (String)"visual/ambient_particles")) != null && !ambientParticles.isEmpty()) {
                CompoundTag first = (CompoundTag)ambientParticles.get(0);
                Tag probability = first.get("probability");
                CompoundTag particle = first.getCompoundTag("particle");
                CompoundTag options = new CompoundTag();
                options.put("probability", probability);
                options.put("options", (Tag)particle);
                effects.put("particle", (Tag)options);
            }
        });
        this.registryDataRewriter.addHandler("enchantment", (key, tag) -> {
            CompoundTag effects = tag.getCompoundTag("effects");
            if (effects != null) {
                TagUtil.removeNamespaced((CompoundTag)effects, (String)"post_piercing_attack");
            }
        });
        this.registryDataRewriter.remove("zombie_nautilus_variant");
        this.registryDataRewriter.remove("timeline");
        this.tagRewriter.removeTags("timeline");
    }

    public TagRewriter<ClientboundPacket1_21_11> getTagRewriter() {
        return this.tagRewriter;
    }

    public BlockRewriter<ClientboundPacket1_21_11> getBlockRewriter() {
        return this.blockRewriter;
    }

    public BackwardsMappingData getMappingData() {
        return MAPPINGS;
    }

    public BlockItemPacketRewriter1_21_11 getItemRewriter() {
        return this.itemRewriter;
    }

    public RecipeDisplayRewriter<ClientboundPacket1_21_11> getRecipeRewriter() {
        return this.recipeRewriter;
    }

    public EntityPacketRewriter1_21_11 getEntityRewriter() {
        return this.entityRewriter;
    }

    private int floatsToARGB(float r, float g, float b) {
        return 0xFF000000 | (int)(r * 255.0f) << 16 | (int)(g * 255.0f) << 8 | (int)(b * 255.0f);
    }

    private void moveAttribute(CompoundTag baseTag, @Nullable CompoundTag attributes, String key, String mappedKey, Function<Tag, Tag> tagMapper, @Nullable Tag defaultTag) {
        Tag attributeTag;
        if (attributes != null && (attributeTag = TagUtil.getNamespacedTag((CompoundTag)attributes, (String)key)) != null) {
            baseTag.put(mappedKey, tagMapper.apply(attributeTag));
        } else if (defaultTag != null) {
            baseTag.put(mappedKey, defaultTag);
        }
    }
}

