/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.StringTag
 *  com.viaversion.viabackwards.api.BackwardsProtocol
 *  com.viaversion.viabackwards.api.data.BackwardsMappingData
 *  com.viaversion.viabackwards.api.rewriters.BackwardsRegistryRewriter
 *  com.viaversion.viabackwards.api.rewriters.text.NBTComponentRewriter
 *  com.viaversion.viabackwards.protocol.v26_1to1_21_11.storage.DayTimeStorage
 *  com.viaversion.viabackwards.protocol.v26_1to1_21_11.storage.GameModeStorage
 *  com.viaversion.viaversion.api.connection.StorableObject
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.data.entity.EntityTracker
 *  com.viaversion.viaversion.api.data.item.ItemHasher
 *  com.viaversion.viaversion.api.minecraft.RegistryType
 *  com.viaversion.viaversion.api.minecraft.data.version.StructuredDataKeys1_21_11
 *  com.viaversion.viaversion.api.minecraft.entities.EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_21_11
 *  com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes1_21_11
 *  com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes26_1
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.provider.PacketTypesProvider
 *  com.viaversion.viaversion.api.protocol.packet.provider.SimplePacketTypesProvider
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.chunk.ChunkType1_21_5
 *  com.viaversion.viaversion.api.type.types.chunk.ChunkType26_1
 *  com.viaversion.viaversion.api.type.types.version.Types1_20_5
 *  com.viaversion.viaversion.api.type.types.version.Types26_1
 *  com.viaversion.viaversion.api.type.types.version.VersionedTypes
 *  com.viaversion.viaversion.data.entity.EntityTrackerBase
 *  com.viaversion.viaversion.data.item.ItemHasherBase
 *  com.viaversion.viaversion.protocols.v1_21_11to26_1.Protocol1_21_11To26_1
 *  com.viaversion.viaversion.protocols.v1_21_11to26_1.packet.ClientboundPacket26_1
 *  com.viaversion.viaversion.protocols.v1_21_11to26_1.packet.ClientboundPackets26_1
 *  com.viaversion.viaversion.protocols.v1_21_11to26_1.packet.ServerboundPacket26_1
 *  com.viaversion.viaversion.protocols.v1_21_11to26_1.packet.ServerboundPackets26_1
 *  com.viaversion.viaversion.protocols.v1_21_4to1_21_5.rewriter.RecipeDisplayRewriter1_21_5
 *  com.viaversion.viaversion.protocols.v1_21_5to1_21_6.packet.ServerboundPackets1_21_6
 *  com.viaversion.viaversion.protocols.v1_21_7to1_21_9.packet.ClientboundConfigurationPackets1_21_9
 *  com.viaversion.viaversion.protocols.v1_21_7to1_21_9.packet.ServerboundConfigurationPackets1_21_9
 *  com.viaversion.viaversion.protocols.v1_21_7to1_21_9.packet.ServerboundPacket1_21_9
 *  com.viaversion.viaversion.protocols.v1_21_9to1_21_11.packet.ClientboundPacket1_21_11
 *  com.viaversion.viaversion.protocols.v1_21_9to1_21_11.packet.ClientboundPackets1_21_11
 *  com.viaversion.viaversion.rewriter.BlockRewriter
 *  com.viaversion.viaversion.rewriter.ParticleRewriter
 *  com.viaversion.viaversion.rewriter.RecipeDisplayRewriter
 *  com.viaversion.viaversion.rewriter.TagRewriter
 *  com.viaversion.viaversion.rewriter.block.BlockRewriter1_21_5
 *  com.viaversion.viaversion.util.Key
 *  com.viaversion.viaversion.util.ProtocolUtil
 *  com.viaversion.viaversion.util.TagUtil
 */
package com.viaversion.viabackwards.protocol.v26_1to1_21_11;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.StringTag;
import com.viaversion.viabackwards.api.BackwardsProtocol;
import com.viaversion.viabackwards.api.data.BackwardsMappingData;
import com.viaversion.viabackwards.api.rewriters.BackwardsRegistryRewriter;
import com.viaversion.viabackwards.api.rewriters.text.NBTComponentRewriter;
import com.viaversion.viabackwards.protocol.v26_1to1_21_11.rewriter.BlockItemPacketRewriter26_1;
import com.viaversion.viabackwards.protocol.v26_1to1_21_11.rewriter.ComponentRewriter26_1;
import com.viaversion.viabackwards.protocol.v26_1to1_21_11.rewriter.EntityPacketRewriter26_1;
import com.viaversion.viabackwards.protocol.v26_1to1_21_11.storage.DayTimeStorage;
import com.viaversion.viabackwards.protocol.v26_1to1_21_11.storage.GameModeStorage;
import com.viaversion.viaversion.api.connection.StorableObject;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.data.entity.EntityTracker;
import com.viaversion.viaversion.api.data.item.ItemHasher;
import com.viaversion.viaversion.api.minecraft.RegistryType;
import com.viaversion.viaversion.api.minecraft.data.version.StructuredDataKeys1_21_11;
import com.viaversion.viaversion.api.minecraft.entities.EntityType;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_21_11;
import com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes1_21_11;
import com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes26_1;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.provider.PacketTypesProvider;
import com.viaversion.viaversion.api.protocol.packet.provider.SimplePacketTypesProvider;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.chunk.ChunkType1_21_5;
import com.viaversion.viaversion.api.type.types.chunk.ChunkType26_1;
import com.viaversion.viaversion.api.type.types.version.Types1_20_5;
import com.viaversion.viaversion.api.type.types.version.Types26_1;
import com.viaversion.viaversion.api.type.types.version.VersionedTypes;
import com.viaversion.viaversion.data.entity.EntityTrackerBase;
import com.viaversion.viaversion.data.item.ItemHasherBase;
import com.viaversion.viaversion.protocols.v1_21_11to26_1.Protocol1_21_11To26_1;
import com.viaversion.viaversion.protocols.v1_21_11to26_1.packet.ClientboundPacket26_1;
import com.viaversion.viaversion.protocols.v1_21_11to26_1.packet.ClientboundPackets26_1;
import com.viaversion.viaversion.protocols.v1_21_11to26_1.packet.ServerboundPacket26_1;
import com.viaversion.viaversion.protocols.v1_21_11to26_1.packet.ServerboundPackets26_1;
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
import com.viaversion.viaversion.rewriter.TagRewriter;
import com.viaversion.viaversion.rewriter.block.BlockRewriter1_21_5;
import com.viaversion.viaversion.util.Key;
import com.viaversion.viaversion.util.ProtocolUtil;
import com.viaversion.viaversion.util.TagUtil;

public final class Protocol26_1To1_21_11
extends BackwardsProtocol<ClientboundPacket26_1, ClientboundPacket1_21_11, ServerboundPacket26_1, ServerboundPacket1_21_9> {
    public static final BackwardsMappingData MAPPINGS = new BackwardsMappingData("26.1", "1.21.11", Protocol1_21_11To26_1.class);
    private final EntityPacketRewriter26_1 entityRewriter = new EntityPacketRewriter26_1(this);
    private final BlockItemPacketRewriter26_1 itemRewriter = new BlockItemPacketRewriter26_1(this);
    private final ParticleRewriter<ClientboundPacket26_1> particleRewriter = new ParticleRewriter((Protocol)this);
    private final NBTComponentRewriter<ClientboundPacket26_1> translatableRewriter = new ComponentRewriter26_1(this);
    private final TagRewriter<ClientboundPacket26_1> tagRewriter = new TagRewriter((Protocol)this);
    private final BackwardsRegistryRewriter registryDataRewriter = new BackwardsRegistryRewriter((BackwardsProtocol)this);
    private final BlockRewriter<ClientboundPacket26_1> blockRewriter = new BlockRewriter1_21_5((Protocol)this, ChunkType26_1::new, ChunkType1_21_5::new);
    private final RecipeDisplayRewriter<ClientboundPacket26_1> recipeRewriter = new RecipeDisplayRewriter1_21_5((Protocol)this);

    public Types26_1<StructuredDataKeys1_21_11, EntityDataTypes26_1> types() {
        return VersionedTypes.V26_1;
    }

    public Protocol26_1To1_21_11() {
        super(ClientboundPacket26_1.class, ClientboundPacket1_21_11.class, ServerboundPacket26_1.class, ServerboundPacket1_21_9.class);
    }

    public void init(UserConnection connection) {
        this.addEntityTracker(connection, (EntityTracker)new EntityTrackerBase(connection, (EntityType)EntityTypes1_21_11.PLAYER));
        this.addItemHasher(connection, (ItemHasher)new ItemHasherBase((Protocol)this, connection));
        connection.put((StorableObject)new DayTimeStorage());
        connection.put((StorableObject)new GameModeStorage());
    }

    private void removeEntityNamePrefix(String key, CompoundTag tag) {
        StringTag assetIdTag = tag.getStringTag("asset_id");
        String assetId = assetIdTag.getValue();
        assetIdTag.setValue(assetId.replace(key + "_", ""));
    }

    public BackwardsRegistryRewriter getRegistryDataRewriter() {
        return this.registryDataRewriter;
    }

    public NBTComponentRewriter<ClientboundPacket26_1> getComponentRewriter() {
        return this.translatableRewriter;
    }

    public ParticleRewriter<ClientboundPacket26_1> getParticleRewriter() {
        return this.particleRewriter;
    }

    private void swapEntityNameAffix(String key, CompoundTag tag) {
        StringTag assetIdTag = tag.getStringTag("asset_id");
        String assetId = assetIdTag.getValue();
        if (assetId.contains(key + "_")) {
            assetIdTag.setValue(assetId.replace(key + "_", "") + "_" + key);
        }
    }

    protected PacketTypesProvider<ClientboundPacket26_1, ClientboundPacket1_21_11, ServerboundPacket26_1, ServerboundPacket1_21_9> createPacketTypesProvider() {
        return new SimplePacketTypesProvider(ProtocolUtil.packetTypeMap((Class)this.unmappedClientboundPacketType, (Class[])new Class[]{ClientboundPackets26_1.class, ClientboundConfigurationPackets1_21_9.class}), ProtocolUtil.packetTypeMap((Class)this.mappedClientboundPacketType, (Class[])new Class[]{ClientboundPackets1_21_11.class, ClientboundConfigurationPackets1_21_9.class}), ProtocolUtil.packetTypeMap((Class)this.mappedServerboundPacketType, (Class[])new Class[]{ServerboundPackets26_1.class, ServerboundConfigurationPackets1_21_9.class}), ProtocolUtil.packetTypeMap((Class)this.unmappedServerboundPacketType, (Class[])new Class[]{ServerboundPackets1_21_6.class, ServerboundConfigurationPackets1_21_9.class}));
    }

    public Types1_20_5<StructuredDataKeys1_21_11, EntityDataTypes1_21_11> mappedTypes() {
        return VersionedTypes.V1_21_11;
    }

    protected void registerPackets() {
        super.registerPackets();
        this.registryDataRewriter.addHandler("dimension_type", (key, tag) -> {
            CompoundTag attributes = tag.getCompoundTag("attributes");
            if (attributes != null) {
                TagUtil.removeNamespaced((CompoundTag)attributes, (String)"visual/block_light_tint");
                TagUtil.removeNamespaced((CompoundTag)attributes, (String)"visual/night_vision_color");
                TagUtil.removeNamespaced((CompoundTag)attributes, (String)"visual/ambient_light_color");
            }
        });
        this.registryDataRewriter.addHandler("wolf_sound_variant", (key, tag) -> {
            CompoundTag sounds = tag.getCompoundTag("adult_sounds");
            tag.remove("baby_sounds");
            tag.putAll(sounds);
        });
        this.registryDataRewriter.addHandler("frog_variant", (key, tag) -> this.swapEntityNameAffix("frog", (CompoundTag)tag));
        this.registryDataRewriter.addHandler("chicken_variant", (key, tag) -> this.swapEntityNameAffix("chicken", (CompoundTag)tag));
        this.registryDataRewriter.addHandler("cow_variant", (key, tag) -> this.swapEntityNameAffix("cow", (CompoundTag)tag));
        this.registryDataRewriter.addHandler("pig_variant", (key, tag) -> this.swapEntityNameAffix("pig", (CompoundTag)tag));
        this.registryDataRewriter.addHandler("cat_variant", (key, tag) -> this.removeEntityNamePrefix("cat", (CompoundTag)tag));
        this.registryDataRewriter.remove("world_clock");
        this.registryDataRewriter.remove("cat_sound_variant");
        this.registryDataRewriter.remove("cow_sound_variant");
        this.registryDataRewriter.remove("pig_sound_variant");
        this.registryDataRewriter.remove("chicken_sound_variant");
        this.tagRewriter.addEmptyTags(RegistryType.BLOCK, new String[]{"big_dripleaf_placeable", "small_dripleaf_placeable", "mushroom_grow_block", "bamboo_plantable_on"});
        this.cancelClientbound((ClientboundPacketType)ClientboundPackets26_1.LOW_DISK_SPACE_WARNING);
        this.cancelClientbound((ClientboundPacketType)ClientboundPackets26_1.GAME_RULE_VALUES);
        this.registerClientbound((ClientboundPacketType)ClientboundPackets26_1.SET_TIME, wrapper -> {
            long gameTime = (Long)wrapper.passthrough((Type)Types.LONG);
            Long dayTime = null;
            boolean advanceTime = true;
            int count = (Integer)wrapper.read((Type)Types.VAR_INT);
            for (int i = 0; i < count; ++i) {
                int clockType = (Integer)wrapper.read((Type)Types.VAR_INT);
                long totalTicks = (Long)wrapper.read((Type)Types.VAR_LONG);
                wrapper.read((Type)Types.FLOAT);
                float tickRate = ((Float)wrapper.read((Type)Types.FLOAT)).floatValue();
                if (!Key.equals((String)this.registryDataRewriter.getMappings("world_clock").idToKey(clockType), (String)"overworld")) continue;
                dayTime = totalTicks;
                advanceTime = tickRate != 0.0f;
            }
            DayTimeStorage dayTimeStorage = (DayTimeStorage)wrapper.user().get(DayTimeStorage.class);
            if (dayTime == null) {
                dayTime = dayTimeStorage.setGameTimeAndUpdateDayTime(gameTime);
                advanceTime = dayTimeStorage.advanceTime();
            } else {
                dayTimeStorage.setGameTime(gameTime);
                dayTimeStorage.setDayTime(dayTime.longValue());
                dayTimeStorage.setAdvanceTime(advanceTime);
            }
            wrapper.write((Type)Types.LONG, (Object)dayTime);
            wrapper.write((Type)Types.BOOLEAN, (Object)advanceTime);
        });
    }

    public TagRewriter<ClientboundPacket26_1> getTagRewriter() {
        return this.tagRewriter;
    }

    public BlockRewriter<ClientboundPacket26_1> getBlockRewriter() {
        return this.blockRewriter;
    }

    public BackwardsMappingData getMappingData() {
        return MAPPINGS;
    }

    public BlockItemPacketRewriter26_1 getItemRewriter() {
        return this.itemRewriter;
    }

    public RecipeDisplayRewriter<ClientboundPacket26_1> getRecipeRewriter() {
        return this.recipeRewriter;
    }

    public EntityPacketRewriter26_1 getEntityRewriter() {
        return this.entityRewriter;
    }
}

