/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viabackwards.ViaBackwards
 *  com.viaversion.viabackwards.api.BackwardsProtocol
 *  com.viaversion.viabackwards.api.data.BackwardsMappingData
 *  com.viaversion.viabackwards.api.rewriters.BackwardsRegistryRewriter
 *  com.viaversion.viabackwards.api.rewriters.SoundRewriter
 *  com.viaversion.viabackwards.api.rewriters.text.NBTComponentRewriter
 *  com.viaversion.viabackwards.protocol.v1_21_9to1_21_7.storage.DimensionScaleStorage
 *  com.viaversion.viabackwards.protocol.v1_21_9to1_21_7.storage.PlayerRotationStorage
 *  com.viaversion.viabackwards.protocol.v1_21_9to1_21_7.tracker.EntityTracker1_21_9
 *  com.viaversion.viaversion.api.connection.StorableObject
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.data.entity.EntityTracker
 *  com.viaversion.viaversion.api.data.item.ItemHasher
 *  com.viaversion.viaversion.api.minecraft.data.version.StructuredDataKeys1_21_5
 *  com.viaversion.viaversion.api.minecraft.entities.EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_21_9
 *  com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes1_21_5
 *  com.viaversion.viaversion.api.protocol.AbstractProtocol
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.provider.PacketTypesProvider
 *  com.viaversion.viaversion.api.protocol.packet.provider.SimplePacketTypesProvider
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.chunk.ChunkType1_21_5
 *  com.viaversion.viaversion.api.type.types.version.Types1_20_5
 *  com.viaversion.viaversion.api.type.types.version.VersionedTypes
 *  com.viaversion.viaversion.api.type.types.version.VersionedTypesHolder
 *  com.viaversion.viaversion.data.item.ItemHasherBase
 *  com.viaversion.viaversion.protocols.v1_21_4to1_21_5.rewriter.RecipeDisplayRewriter1_21_5
 *  com.viaversion.viaversion.protocols.v1_21_5to1_21_6.packet.ClientboundConfigurationPackets1_21_6
 *  com.viaversion.viaversion.protocols.v1_21_5to1_21_6.packet.ClientboundPacket1_21_6
 *  com.viaversion.viaversion.protocols.v1_21_5to1_21_6.packet.ClientboundPackets1_21_6
 *  com.viaversion.viaversion.protocols.v1_21_5to1_21_6.packet.ServerboundConfigurationPackets1_21_6
 *  com.viaversion.viaversion.protocols.v1_21_5to1_21_6.packet.ServerboundPacket1_21_6
 *  com.viaversion.viaversion.protocols.v1_21_5to1_21_6.packet.ServerboundPackets1_21_6
 *  com.viaversion.viaversion.protocols.v1_21_7to1_21_9.Protocol1_21_7To1_21_9
 *  com.viaversion.viaversion.protocols.v1_21_7to1_21_9.packet.ClientboundConfigurationPackets1_21_9
 *  com.viaversion.viaversion.protocols.v1_21_7to1_21_9.packet.ClientboundPacket1_21_9
 *  com.viaversion.viaversion.protocols.v1_21_7to1_21_9.packet.ClientboundPackets1_21_9
 *  com.viaversion.viaversion.protocols.v1_21_7to1_21_9.packet.ServerboundConfigurationPackets1_21_9
 *  com.viaversion.viaversion.protocols.v1_21_7to1_21_9.packet.ServerboundPacket1_21_9
 *  com.viaversion.viaversion.protocols.v1_21to1_21_2.storage.BundleStateTracker
 *  com.viaversion.viaversion.rewriter.BlockRewriter
 *  com.viaversion.viaversion.rewriter.ParticleRewriter
 *  com.viaversion.viaversion.rewriter.RecipeDisplayRewriter
 *  com.viaversion.viaversion.rewriter.TagRewriter
 *  com.viaversion.viaversion.rewriter.block.BlockRewriter1_21_5
 *  com.viaversion.viaversion.util.ProtocolUtil
 */
package com.viaversion.viabackwards.protocol.v1_21_9to1_21_7;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.Tag;
import com.viaversion.viabackwards.ViaBackwards;
import com.viaversion.viabackwards.api.BackwardsProtocol;
import com.viaversion.viabackwards.api.data.BackwardsMappingData;
import com.viaversion.viabackwards.api.rewriters.BackwardsRegistryRewriter;
import com.viaversion.viabackwards.api.rewriters.SoundRewriter;
import com.viaversion.viabackwards.api.rewriters.text.NBTComponentRewriter;
import com.viaversion.viabackwards.protocol.v1_21_9to1_21_7.rewriter.BlockItemPacketRewriter1_21_9;
import com.viaversion.viabackwards.protocol.v1_21_9to1_21_7.rewriter.ComponentRewriter1_21_9;
import com.viaversion.viabackwards.protocol.v1_21_9to1_21_7.rewriter.EntityPacketRewriter1_21_9;
import com.viaversion.viabackwards.protocol.v1_21_9to1_21_7.rewriter.ParticleRewriter1_21_9;
import com.viaversion.viabackwards.protocol.v1_21_9to1_21_7.rewriter.RegistryDataRewriter1_21_9;
import com.viaversion.viabackwards.protocol.v1_21_9to1_21_7.storage.DimensionScaleStorage;
import com.viaversion.viabackwards.protocol.v1_21_9to1_21_7.storage.PlayerRotationStorage;
import com.viaversion.viabackwards.protocol.v1_21_9to1_21_7.tracker.EntityTracker1_21_9;
import com.viaversion.viaversion.api.connection.StorableObject;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.data.entity.EntityTracker;
import com.viaversion.viaversion.api.data.item.ItemHasher;
import com.viaversion.viaversion.api.minecraft.data.version.StructuredDataKeys1_21_5;
import com.viaversion.viaversion.api.minecraft.entities.EntityType;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_21_9;
import com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes1_21_5;
import com.viaversion.viaversion.api.protocol.AbstractProtocol;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.provider.PacketTypesProvider;
import com.viaversion.viaversion.api.protocol.packet.provider.SimplePacketTypesProvider;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.chunk.ChunkType1_21_5;
import com.viaversion.viaversion.api.type.types.version.Types1_20_5;
import com.viaversion.viaversion.api.type.types.version.VersionedTypes;
import com.viaversion.viaversion.api.type.types.version.VersionedTypesHolder;
import com.viaversion.viaversion.data.item.ItemHasherBase;
import com.viaversion.viaversion.protocols.v1_21_4to1_21_5.rewriter.RecipeDisplayRewriter1_21_5;
import com.viaversion.viaversion.protocols.v1_21_5to1_21_6.packet.ClientboundConfigurationPackets1_21_6;
import com.viaversion.viaversion.protocols.v1_21_5to1_21_6.packet.ClientboundPacket1_21_6;
import com.viaversion.viaversion.protocols.v1_21_5to1_21_6.packet.ClientboundPackets1_21_6;
import com.viaversion.viaversion.protocols.v1_21_5to1_21_6.packet.ServerboundConfigurationPackets1_21_6;
import com.viaversion.viaversion.protocols.v1_21_5to1_21_6.packet.ServerboundPacket1_21_6;
import com.viaversion.viaversion.protocols.v1_21_5to1_21_6.packet.ServerboundPackets1_21_6;
import com.viaversion.viaversion.protocols.v1_21_7to1_21_9.Protocol1_21_7To1_21_9;
import com.viaversion.viaversion.protocols.v1_21_7to1_21_9.packet.ClientboundConfigurationPackets1_21_9;
import com.viaversion.viaversion.protocols.v1_21_7to1_21_9.packet.ClientboundPacket1_21_9;
import com.viaversion.viaversion.protocols.v1_21_7to1_21_9.packet.ClientboundPackets1_21_9;
import com.viaversion.viaversion.protocols.v1_21_7to1_21_9.packet.ServerboundConfigurationPackets1_21_9;
import com.viaversion.viaversion.protocols.v1_21_7to1_21_9.packet.ServerboundPacket1_21_9;
import com.viaversion.viaversion.protocols.v1_21to1_21_2.storage.BundleStateTracker;
import com.viaversion.viaversion.rewriter.BlockRewriter;
import com.viaversion.viaversion.rewriter.ParticleRewriter;
import com.viaversion.viaversion.rewriter.RecipeDisplayRewriter;
import com.viaversion.viaversion.rewriter.TagRewriter;
import com.viaversion.viaversion.rewriter.block.BlockRewriter1_21_5;
import com.viaversion.viaversion.util.ProtocolUtil;

public final class Protocol1_21_9To1_21_7
extends BackwardsProtocol<ClientboundPacket1_21_9, ClientboundPacket1_21_6, ServerboundPacket1_21_9, ServerboundPacket1_21_6> {
    public static final BackwardsMappingData MAPPINGS = new BackwardsMappingData("1.21.9", "1.21.7", Protocol1_21_7To1_21_9.class);
    private final EntityPacketRewriter1_21_9 entityRewriter = new EntityPacketRewriter1_21_9(this);
    private final BlockItemPacketRewriter1_21_9 itemRewriter = new BlockItemPacketRewriter1_21_9(this);
    private final ParticleRewriter<ClientboundPacket1_21_9> particleRewriter = new ParticleRewriter1_21_9((Protocol<ClientboundPacket1_21_9, ?, ?, ?>)this);
    private final NBTComponentRewriter<ClientboundPacket1_21_9> translatableRewriter = new ComponentRewriter1_21_9(this);
    private final TagRewriter<ClientboundPacket1_21_9> tagRewriter = new TagRewriter((Protocol)this);
    private final RecipeDisplayRewriter<ClientboundPacket1_21_9> recipeRewriter = new RecipeDisplayRewriter1_21_5((Protocol)this);
    private final BackwardsRegistryRewriter registryDataRewriter = new RegistryDataRewriter1_21_9(this);
    private final BlockRewriter<ClientboundPacket1_21_9> blockRewriter = new BlockRewriter1_21_5((Protocol)this, ChunkType1_21_5::new);

    public VersionedTypesHolder types() {
        return VersionedTypes.V1_21_9;
    }

    public Protocol1_21_9To1_21_7() {
        super(ClientboundPacket1_21_9.class, ClientboundPacket1_21_6.class, ServerboundPacket1_21_9.class, ServerboundPacket1_21_6.class);
    }

    public void init(UserConnection connection) {
        this.addEntityTracker(connection, (EntityTracker)new EntityTracker1_21_9(connection, (EntityType)EntityTypes1_21_9.PLAYER));
        this.addItemHasher(connection, (ItemHasher)new ItemHasherBase((Protocol)this, connection));
        connection.put((StorableObject)new PlayerRotationStorage());
        connection.put((StorableObject)new DimensionScaleStorage());
        connection.put((StorableObject)new BundleStateTracker());
    }

    public BackwardsRegistryRewriter getRegistryDataRewriter() {
        return this.registryDataRewriter;
    }

    public NBTComponentRewriter<ClientboundPacket1_21_9> getComponentRewriter() {
        return this.translatableRewriter;
    }

    public ParticleRewriter<ClientboundPacket1_21_9> getParticleRewriter() {
        return this.particleRewriter;
    }

    protected PacketTypesProvider<ClientboundPacket1_21_9, ClientboundPacket1_21_6, ServerboundPacket1_21_9, ServerboundPacket1_21_6> createPacketTypesProvider() {
        return new SimplePacketTypesProvider(ProtocolUtil.packetTypeMap((Class)this.unmappedClientboundPacketType, (Class[])new Class[]{ClientboundPackets1_21_9.class, ClientboundConfigurationPackets1_21_9.class}), ProtocolUtil.packetTypeMap((Class)this.mappedClientboundPacketType, (Class[])new Class[]{ClientboundPackets1_21_6.class, ClientboundConfigurationPackets1_21_6.class}), ProtocolUtil.packetTypeMap((Class)this.mappedServerboundPacketType, (Class[])new Class[]{ServerboundPackets1_21_6.class, ServerboundConfigurationPackets1_21_9.class}), ProtocolUtil.packetTypeMap((Class)this.unmappedServerboundPacketType, (Class[])new Class[]{ServerboundPackets1_21_6.class, ServerboundConfigurationPackets1_21_6.class}));
    }

    public Types1_20_5<StructuredDataKeys1_21_5, EntityDataTypes1_21_5> mappedTypes() {
        return VersionedTypes.V1_21_6;
    }

    protected void registerPackets() {
        super.registerPackets();
        SoundRewriter soundRewriter = new SoundRewriter((AbstractProtocol)this);
        this.replaceClientbound((ClientboundPacketType)ClientboundPackets1_21_9.EXPLODE, wrapper -> {
            wrapper.passthrough((Type)Types.DOUBLE);
            wrapper.passthrough((Type)Types.DOUBLE);
            wrapper.passthrough((Type)Types.DOUBLE);
            wrapper.read((Type)Types.FLOAT);
            wrapper.read((Type)Types.INT);
            if (((Boolean)wrapper.passthrough((Type)Types.BOOLEAN)).booleanValue()) {
                wrapper.passthrough((Type)Types.DOUBLE);
                wrapper.passthrough((Type)Types.DOUBLE);
                wrapper.passthrough((Type)Types.DOUBLE);
            }
            this.particleRewriter.passthroughParticle(wrapper);
            soundRewriter.soundHolderHandler().handle(wrapper);
            int blockParticles = (Integer)wrapper.read((Type)Types.VAR_INT);
            for (int i = 0; i < blockParticles; ++i) {
                wrapper.read(this.particleRewriter.particleType());
                wrapper.read((Type)Types.FLOAT);
                wrapper.read((Type)Types.FLOAT);
                wrapper.read((Type)Types.VAR_INT);
            }
        });
        this.registerClientbound((ClientboundPacketType)ClientboundConfigurationPackets1_21_9.CODE_OF_CONDUCT, (ClientboundPacketType)ClientboundConfigurationPackets1_21_6.SHOW_DIALOG, wrapper -> {
            boolean supportsDialogs = wrapper.user().getProtocolInfo().protocolVersion().newerThan(ProtocolVersion.v1_21_5);
            if (!ViaBackwards.getConfig().codeOfConductAsDialog() || !supportsDialogs) {
                wrapper.cancel();
                PacketWrapper acceptPacket = wrapper.create((PacketType)ServerboundConfigurationPackets1_21_9.ACCEPT_CODE_OF_CONDUCT);
                acceptPacket.sendToServer(Protocol1_21_9To1_21_7.class);
                return;
            }
            String codeOfConduct = (String)wrapper.read(Types.STRING);
            CompoundTag tag = new CompoundTag();
            tag.putString("type", "minecraft:confirmation");
            tag.putString("title", this.translatableRewriter.mappedTranslationKey("multiplayer.codeOfConduct.title"));
            CompoundTag body = new CompoundTag();
            body.putString("type", "minecraft:plain_message");
            body.putString("contents", codeOfConduct);
            tag.put("body", (Tag)body);
            CompoundTag yes = new CompoundTag();
            CompoundTag yesLabel = new CompoundTag();
            yesLabel.putString("translate", "gui.acknowledge");
            yes.put("label", (Tag)yesLabel);
            CompoundTag acceptAction = new CompoundTag();
            acceptAction.putString("type", "minecraft:custom");
            acceptAction.putString("id", "viabackwards:ack_code_of_conduct");
            yes.put("action", (Tag)acceptAction);
            tag.put("yes", (Tag)yes);
            CompoundTag no = new CompoundTag();
            CompoundTag noLabel = new CompoundTag();
            noLabel.putString("translate", "menu.disconnect");
            no.put("label", (Tag)noLabel);
            CompoundTag disconnectAction = new CompoundTag();
            disconnectAction.putString("type", "minecraft:custom");
            disconnectAction.putString("id", "viabackwards:disconnect");
            no.put("action", (Tag)disconnectAction);
            tag.put("no", (Tag)no);
            wrapper.write(Types.TRUSTED_TAG, (Object)tag);
        });
        this.registerServerbound((ServerboundPacketType)ServerboundConfigurationPackets1_21_6.CUSTOM_CLICK_ACTION, wrapper -> {
            String id = (String)wrapper.passthrough(Types.STRING);
            if ("viabackwards:ack_code_of_conduct".equals(id)) {
                wrapper.cancel();
                PacketWrapper acceptPacket = wrapper.create((PacketType)ServerboundConfigurationPackets1_21_9.ACCEPT_CODE_OF_CONDUCT);
                acceptPacket.sendToServer(Protocol1_21_9To1_21_7.class);
            } else if ("viabackwards:disconnect".equals(id)) {
                wrapper.cancel();
                wrapper.user().disconnect(this.translatableRewriter.mappedTranslationKey("multiplayer.disconnect.code_of_conduct"));
            }
        });
        this.registerServerbound((ServerboundPacketType)ServerboundPackets1_21_6.DEBUG_SAMPLE_SUBSCRIPTION, wrapper -> {
            int sampleType = (Integer)wrapper.read((Type)Types.VAR_INT);
            if (sampleType == 0) {
                wrapper.write((Type)Types.VAR_INT, (Object)1);
                wrapper.write((Type)Types.VAR_INT, (Object)0);
            }
        });
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_21_9.BUNDLE_DELIMITER, wrapper -> ((BundleStateTracker)wrapper.user().get(BundleStateTracker.class)).toggleBundling());
        this.cancelClientbound((ClientboundPacketType)ClientboundPackets1_21_9.DEBUG_BLOCK_VALUE);
        this.cancelClientbound((ClientboundPacketType)ClientboundPackets1_21_9.DEBUG_CHUNK_VALUE);
        this.cancelClientbound((ClientboundPacketType)ClientboundPackets1_21_9.DEBUG_ENTITY_VALUE);
        this.cancelClientbound((ClientboundPacketType)ClientboundPackets1_21_9.DEBUG_EVENT);
        this.cancelClientbound((ClientboundPacketType)ClientboundPackets1_21_9.GAME_EVENT_TEST_HIGHLIGHT_POS);
    }

    public TagRewriter<ClientboundPacket1_21_9> getTagRewriter() {
        return this.tagRewriter;
    }

    public BlockRewriter<ClientboundPacket1_21_9> getBlockRewriter() {
        return this.blockRewriter;
    }

    public BackwardsMappingData getMappingData() {
        return MAPPINGS;
    }

    public BlockItemPacketRewriter1_21_9 getItemRewriter() {
        return this.itemRewriter;
    }

    public RecipeDisplayRewriter<ClientboundPacket1_21_9> getRecipeRewriter() {
        return this.recipeRewriter;
    }

    public EntityPacketRewriter1_21_9 getEntityRewriter() {
        return this.entityRewriter;
    }
}

