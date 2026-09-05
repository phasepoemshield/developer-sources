/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.ListTag
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viabackwards.api.BackwardsProtocol
 *  com.viaversion.viabackwards.api.data.BackwardsMappingData
 *  com.viaversion.viabackwards.api.rewriters.BackwardsRegistryRewriter
 *  com.viaversion.viabackwards.api.rewriters.text.JsonNBTComponentRewriter
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.data.entity.EntityTracker
 *  com.viaversion.viaversion.api.minecraft.Particle
 *  com.viaversion.viaversion.api.minecraft.RegistryEntry
 *  com.viaversion.viaversion.api.minecraft.RegistryType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_21_4
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.provider.PacketTypesProvider
 *  com.viaversion.viaversion.api.protocol.packet.provider.SimplePacketTypesProvider
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.chunk.ChunkType1_20_2
 *  com.viaversion.viaversion.api.type.types.version.VersionedTypes
 *  com.viaversion.viaversion.api.type.types.version.VersionedTypesHolder
 *  com.viaversion.viaversion.data.entity.EntityTrackerBase
 *  com.viaversion.viaversion.protocols.v1_20_3to1_20_5.packet.ServerboundConfigurationPackets1_20_5
 *  com.viaversion.viaversion.protocols.v1_20_5to1_21.packet.ClientboundConfigurationPackets1_21
 *  com.viaversion.viaversion.protocols.v1_21_2to1_21_4.Protocol1_21_2To1_21_4
 *  com.viaversion.viaversion.protocols.v1_21_2to1_21_4.packet.ServerboundPacket1_21_4
 *  com.viaversion.viaversion.protocols.v1_21_2to1_21_4.packet.ServerboundPackets1_21_4
 *  com.viaversion.viaversion.protocols.v1_21to1_21_2.packet.ClientboundPacket1_21_2
 *  com.viaversion.viaversion.protocols.v1_21to1_21_2.packet.ClientboundPackets1_21_2
 *  com.viaversion.viaversion.protocols.v1_21to1_21_2.packet.ServerboundPacket1_21_2
 *  com.viaversion.viaversion.protocols.v1_21to1_21_2.packet.ServerboundPackets1_21_2
 *  com.viaversion.viaversion.rewriter.BlockRewriter
 *  com.viaversion.viaversion.rewriter.ParticleRewriter
 *  com.viaversion.viaversion.rewriter.RecipeDisplayRewriter
 *  com.viaversion.viaversion.rewriter.TagRewriter
 *  com.viaversion.viaversion.util.ArrayUtil
 *  com.viaversion.viaversion.util.Key
 *  com.viaversion.viaversion.util.ProtocolUtil
 */
package com.viaversion.viabackwards.protocol.v1_21_4to1_21_2;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.ListTag;
import com.viaversion.nbt.tag.Tag;
import com.viaversion.viabackwards.api.BackwardsProtocol;
import com.viaversion.viabackwards.api.data.BackwardsMappingData;
import com.viaversion.viabackwards.api.rewriters.BackwardsRegistryRewriter;
import com.viaversion.viabackwards.api.rewriters.text.JsonNBTComponentRewriter;
import com.viaversion.viabackwards.protocol.v1_21_4to1_21_2.rewriter.BlockItemPacketRewriter1_21_4;
import com.viaversion.viabackwards.protocol.v1_21_4to1_21_2.rewriter.ComponentRewriter1_21_4;
import com.viaversion.viabackwards.protocol.v1_21_4to1_21_2.rewriter.EntityPacketRewriter1_21_4;
import com.viaversion.viabackwards.protocol.v1_21_4to1_21_2.rewriter.ParticleRewriter1_21_4;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.data.entity.EntityTracker;
import com.viaversion.viaversion.api.minecraft.Particle;
import com.viaversion.viaversion.api.minecraft.RegistryEntry;
import com.viaversion.viaversion.api.minecraft.RegistryType;
import com.viaversion.viaversion.api.minecraft.entities.EntityType;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_21_4;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.provider.PacketTypesProvider;
import com.viaversion.viaversion.api.protocol.packet.provider.SimplePacketTypesProvider;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.chunk.ChunkType1_20_2;
import com.viaversion.viaversion.api.type.types.version.VersionedTypes;
import com.viaversion.viaversion.api.type.types.version.VersionedTypesHolder;
import com.viaversion.viaversion.data.entity.EntityTrackerBase;
import com.viaversion.viaversion.protocols.v1_20_3to1_20_5.packet.ServerboundConfigurationPackets1_20_5;
import com.viaversion.viaversion.protocols.v1_20_5to1_21.packet.ClientboundConfigurationPackets1_21;
import com.viaversion.viaversion.protocols.v1_21_2to1_21_4.Protocol1_21_2To1_21_4;
import com.viaversion.viaversion.protocols.v1_21_2to1_21_4.packet.ServerboundPacket1_21_4;
import com.viaversion.viaversion.protocols.v1_21_2to1_21_4.packet.ServerboundPackets1_21_4;
import com.viaversion.viaversion.protocols.v1_21to1_21_2.packet.ClientboundPacket1_21_2;
import com.viaversion.viaversion.protocols.v1_21to1_21_2.packet.ClientboundPackets1_21_2;
import com.viaversion.viaversion.protocols.v1_21to1_21_2.packet.ServerboundPacket1_21_2;
import com.viaversion.viaversion.protocols.v1_21to1_21_2.packet.ServerboundPackets1_21_2;
import com.viaversion.viaversion.rewriter.BlockRewriter;
import com.viaversion.viaversion.rewriter.ParticleRewriter;
import com.viaversion.viaversion.rewriter.RecipeDisplayRewriter;
import com.viaversion.viaversion.rewriter.TagRewriter;
import com.viaversion.viaversion.util.ArrayUtil;
import com.viaversion.viaversion.util.Key;
import com.viaversion.viaversion.util.ProtocolUtil;
import java.util.BitSet;

public final class Protocol1_21_4To1_21_2
extends BackwardsProtocol<ClientboundPacket1_21_2, ClientboundPacket1_21_2, ServerboundPacket1_21_4, ServerboundPacket1_21_2> {
    public static final BackwardsMappingData MAPPINGS = new BackwardsMappingData("1.21.4", "1.21.2", Protocol1_21_2To1_21_4.class);
    private final EntityPacketRewriter1_21_4 entityRewriter = new EntityPacketRewriter1_21_4(this);
    private final BlockItemPacketRewriter1_21_4 itemRewriter = new BlockItemPacketRewriter1_21_4(this);
    private final ParticleRewriter<ClientboundPacket1_21_2> particleRewriter = new ParticleRewriter1_21_4((Protocol<ClientboundPacket1_21_2, ?, ?, ?>)this);
    private final JsonNBTComponentRewriter<ClientboundPacket1_21_2> translatableRewriter = new ComponentRewriter1_21_4(this);
    private final TagRewriter<ClientboundPacket1_21_2> tagRewriter = new TagRewriter((Protocol)this);
    private final RecipeDisplayRewriter<ClientboundPacket1_21_2> recipeRewriter = new RecipeDisplayRewriter((Protocol)this);
    private final BlockRewriter<ClientboundPacket1_21_2> blockRewriter = BlockRewriter.for1_20_2((Protocol)this, ChunkType1_20_2::new);
    private final BackwardsRegistryRewriter registryDataRewriter = new BackwardsRegistryRewriter(this){

        public RegistryEntry[] handle(UserConnection connection, String key, RegistryEntry[] entries) {
            block4: {
                String strippedKey;
                block3: {
                    strippedKey = Key.stripMinecraftNamespace((String)key);
                    if (!strippedKey.equals("worldgen/biome")) break block3;
                    for (RegistryEntry entry : entries) {
                        CompoundTag effectsTag;
                        ListTag weightedMusicTags;
                        if (entry.tag() == null || (weightedMusicTags = (effectsTag = ((CompoundTag)entry.tag()).getCompoundTag("effects")).getListTag("music", CompoundTag.class)) == null) continue;
                        if (weightedMusicTags.isEmpty()) {
                            effectsTag.remove("music");
                            continue;
                        }
                        CompoundTag musicTag = (CompoundTag)weightedMusicTags.get(0);
                        effectsTag.put("music", musicTag.get("data"));
                    }
                    break block4;
                }
                if (!strippedKey.equals("trim_material")) break block4;
                for (RegistryEntry entry : entries) {
                    if (entry.tag() == null) continue;
                    CompoundTag compoundTag = (CompoundTag)entry.tag();
                    compoundTag.putFloat("item_model_index", Protocol1_21_4To1_21_2.this.itemModelIndex(entry.key()));
                }
            }
            return super.handle(connection, key, entries);
        }
    };

    public Protocol1_21_4To1_21_2() {
        super(ClientboundPacket1_21_2.class, ClientboundPacket1_21_2.class, ServerboundPacket1_21_4.class, ServerboundPacket1_21_2.class);
    }

    protected void registerPackets() {
        super.registerPackets();
        this.replaceClientbound((ClientboundPacketType)ClientboundPackets1_21_2.LEVEL_PARTICLES, wrapper -> {
            wrapper.passthrough((Type)Types.BOOLEAN);
            wrapper.read((Type)Types.BOOLEAN);
            wrapper.passthrough((Type)Types.DOUBLE);
            wrapper.passthrough((Type)Types.DOUBLE);
            wrapper.passthrough((Type)Types.DOUBLE);
            wrapper.passthrough((Type)Types.FLOAT);
            wrapper.passthrough((Type)Types.FLOAT);
            wrapper.passthrough((Type)Types.FLOAT);
            wrapper.passthrough((Type)Types.FLOAT);
            wrapper.passthrough((Type)Types.INT);
            Particle particle = (Particle)wrapper.passthroughAndMap((Type)VersionedTypes.V1_21_4.particle(), (Type)VersionedTypes.V1_21_2.particle());
            this.particleRewriter.rewriteParticle(wrapper.user(), particle);
        });
        this.registerClientbound((ClientboundPacketType)ClientboundConfigurationPackets1_21.UPDATE_ENABLED_FEATURES, wrapper -> {
            Object[] enabledFeatures = (String[])wrapper.read(Types.STRING_ARRAY);
            wrapper.write(Types.STRING_ARRAY, (Object)((String[])ArrayUtil.add((Object[])enabledFeatures, (Object)"winter_drop")));
        });
        this.replaceClientbound((ClientboundPacketType)ClientboundPackets1_21_2.PLAYER_INFO_UPDATE, wrapper -> {
            BitSet actions = (BitSet)wrapper.read((Type)Types.PROFILE_ACTIONS_ENUM1_21_4);
            BitSet updatedActions = new BitSet(7);
            for (int i = 0; i < 7; ++i) {
                if (!actions.get(i)) continue;
                updatedActions.set(i);
            }
            wrapper.write((Type)Types.PROFILE_ACTIONS_ENUM1_21_2, (Object)updatedActions);
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
                    this.translatableRewriter.processTag(wrapper.user(), (Tag)wrapper.passthrough(Types.TRUSTED_OPTIONAL_TAG));
                }
                if (actions.get(6)) {
                    wrapper.passthrough((Type)Types.VAR_INT);
                }
                if (!actions.get(7)) continue;
                wrapper.read((Type)Types.BOOLEAN);
            }
        });
    }

    protected void onMappingDataLoaded() {
        super.onMappingDataLoaded();
        this.tagRewriter.addEmptyTags(RegistryType.ITEM, new String[]{"minecraft:tall_flowers", "minecraft:flowers"});
        this.tagRewriter.addEmptyTag(RegistryType.BLOCK, "minecraft:tall_flowers");
    }

    public void init(UserConnection user) {
        this.addEntityTracker(user, (EntityTracker)new EntityTrackerBase(user, (EntityType)EntityTypes1_21_4.PLAYER));
    }

    public BackwardsMappingData getMappingData() {
        return MAPPINGS;
    }

    public EntityPacketRewriter1_21_4 getEntityRewriter() {
        return this.entityRewriter;
    }

    public BlockItemPacketRewriter1_21_4 getItemRewriter() {
        return this.itemRewriter;
    }

    public BlockRewriter<ClientboundPacket1_21_2> getBlockRewriter() {
        return this.blockRewriter;
    }

    public ParticleRewriter<ClientboundPacket1_21_2> getParticleRewriter() {
        return this.particleRewriter;
    }

    public JsonNBTComponentRewriter<ClientboundPacket1_21_2> getComponentRewriter() {
        return this.translatableRewriter;
    }

    public TagRewriter<ClientboundPacket1_21_2> getTagRewriter() {
        return this.tagRewriter;
    }

    public RecipeDisplayRewriter<ClientboundPacket1_21_2> getRecipeRewriter() {
        return this.recipeRewriter;
    }

    public BackwardsRegistryRewriter getRegistryDataRewriter() {
        return this.registryDataRewriter;
    }

    public VersionedTypesHolder types() {
        return VersionedTypes.V1_21_4;
    }

    public VersionedTypesHolder mappedTypes() {
        return VersionedTypes.V1_21_2;
    }

    protected PacketTypesProvider<ClientboundPacket1_21_2, ClientboundPacket1_21_2, ServerboundPacket1_21_4, ServerboundPacket1_21_2> createPacketTypesProvider() {
        return new SimplePacketTypesProvider(ProtocolUtil.packetTypeMap((Class)this.unmappedClientboundPacketType, (Class[])new Class[]{ClientboundPackets1_21_2.class, ClientboundConfigurationPackets1_21.class}), ProtocolUtil.packetTypeMap((Class)this.mappedClientboundPacketType, (Class[])new Class[]{ClientboundPackets1_21_2.class, ClientboundConfigurationPackets1_21.class}), ProtocolUtil.packetTypeMap((Class)this.mappedServerboundPacketType, (Class[])new Class[]{ServerboundPackets1_21_4.class, ServerboundConfigurationPackets1_20_5.class}), ProtocolUtil.packetTypeMap((Class)this.unmappedServerboundPacketType, (Class[])new Class[]{ServerboundPackets1_21_2.class, ServerboundConfigurationPackets1_20_5.class}));
    }

    private float itemModelIndex(String trim) {
        return switch (Key.stripNamespace((String)trim)) {
            case "amethyst" -> 1.0f;
            case "copper" -> 0.5f;
            case "diamond" -> 0.8f;
            case "emerald" -> 0.7f;
            case "gold" -> 0.6f;
            case "iron" -> 0.2f;
            case "lapis" -> 0.9f;
            case "netherite" -> 0.3f;
            case "quartz" -> 0.1f;
            case "redstone" -> 0.4f;
            default -> 1.0f;
        };
    }
}

