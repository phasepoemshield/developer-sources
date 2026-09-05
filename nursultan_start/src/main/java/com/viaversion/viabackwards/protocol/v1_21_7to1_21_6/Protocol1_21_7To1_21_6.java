/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viabackwards.api.BackwardsProtocol
 *  com.viaversion.viabackwards.api.data.BackwardsMappingData
 *  com.viaversion.viabackwards.api.rewriters.BackwardsRegistryRewriter
 *  com.viaversion.viabackwards.api.rewriters.text.NBTComponentRewriter
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.data.entity.EntityTracker
 *  com.viaversion.viaversion.api.data.item.ItemHasher
 *  com.viaversion.viaversion.api.minecraft.data.version.StructuredDataKeys1_21_5
 *  com.viaversion.viaversion.api.minecraft.entities.EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_21_6
 *  com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes1_21_5
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.packet.provider.PacketTypesProvider
 *  com.viaversion.viaversion.api.protocol.packet.provider.SimplePacketTypesProvider
 *  com.viaversion.viaversion.api.type.types.chunk.ChunkType1_21_5
 *  com.viaversion.viaversion.api.type.types.version.Types1_20_5
 *  com.viaversion.viaversion.api.type.types.version.VersionedTypes
 *  com.viaversion.viaversion.data.entity.EntityTrackerBase
 *  com.viaversion.viaversion.data.item.ItemHasherBase
 *  com.viaversion.viaversion.protocols.v1_21_4to1_21_5.rewriter.RecipeDisplayRewriter1_21_5
 *  com.viaversion.viaversion.protocols.v1_21_5to1_21_6.packet.ClientboundConfigurationPackets1_21_6
 *  com.viaversion.viaversion.protocols.v1_21_5to1_21_6.packet.ClientboundPacket1_21_6
 *  com.viaversion.viaversion.protocols.v1_21_5to1_21_6.packet.ClientboundPackets1_21_6
 *  com.viaversion.viaversion.protocols.v1_21_5to1_21_6.packet.ServerboundConfigurationPackets1_21_6
 *  com.viaversion.viaversion.protocols.v1_21_5to1_21_6.packet.ServerboundPacket1_21_6
 *  com.viaversion.viaversion.protocols.v1_21_5to1_21_6.packet.ServerboundPackets1_21_6
 *  com.viaversion.viaversion.protocols.v1_21_6to1_21_7.Protocol1_21_6To1_21_7
 *  com.viaversion.viaversion.rewriter.BlockRewriter
 *  com.viaversion.viaversion.rewriter.ParticleRewriter
 *  com.viaversion.viaversion.rewriter.RecipeDisplayRewriter
 *  com.viaversion.viaversion.rewriter.TagRewriter
 *  com.viaversion.viaversion.util.ProtocolUtil
 */
package com.viaversion.viabackwards.protocol.v1_21_7to1_21_6;

import com.viaversion.viabackwards.api.BackwardsProtocol;
import com.viaversion.viabackwards.api.data.BackwardsMappingData;
import com.viaversion.viabackwards.api.rewriters.BackwardsRegistryRewriter;
import com.viaversion.viabackwards.api.rewriters.text.NBTComponentRewriter;
import com.viaversion.viabackwards.protocol.v1_21_7to1_21_6.rewriter.BlockItemPacketRewriter1_21_7;
import com.viaversion.viabackwards.protocol.v1_21_7to1_21_6.rewriter.EntityPacketRewriter1_21_7;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.data.entity.EntityTracker;
import com.viaversion.viaversion.api.data.item.ItemHasher;
import com.viaversion.viaversion.api.minecraft.data.version.StructuredDataKeys1_21_5;
import com.viaversion.viaversion.api.minecraft.entities.EntityType;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_21_6;
import com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes1_21_5;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.packet.provider.PacketTypesProvider;
import com.viaversion.viaversion.api.protocol.packet.provider.SimplePacketTypesProvider;
import com.viaversion.viaversion.api.type.types.chunk.ChunkType1_21_5;
import com.viaversion.viaversion.api.type.types.version.Types1_20_5;
import com.viaversion.viaversion.api.type.types.version.VersionedTypes;
import com.viaversion.viaversion.data.entity.EntityTrackerBase;
import com.viaversion.viaversion.data.item.ItemHasherBase;
import com.viaversion.viaversion.protocols.v1_21_4to1_21_5.rewriter.RecipeDisplayRewriter1_21_5;
import com.viaversion.viaversion.protocols.v1_21_5to1_21_6.packet.ClientboundConfigurationPackets1_21_6;
import com.viaversion.viaversion.protocols.v1_21_5to1_21_6.packet.ClientboundPacket1_21_6;
import com.viaversion.viaversion.protocols.v1_21_5to1_21_6.packet.ClientboundPackets1_21_6;
import com.viaversion.viaversion.protocols.v1_21_5to1_21_6.packet.ServerboundConfigurationPackets1_21_6;
import com.viaversion.viaversion.protocols.v1_21_5to1_21_6.packet.ServerboundPacket1_21_6;
import com.viaversion.viaversion.protocols.v1_21_5to1_21_6.packet.ServerboundPackets1_21_6;
import com.viaversion.viaversion.protocols.v1_21_6to1_21_7.Protocol1_21_6To1_21_7;
import com.viaversion.viaversion.rewriter.BlockRewriter;
import com.viaversion.viaversion.rewriter.ParticleRewriter;
import com.viaversion.viaversion.rewriter.RecipeDisplayRewriter;
import com.viaversion.viaversion.rewriter.TagRewriter;
import com.viaversion.viaversion.util.ProtocolUtil;

public final class Protocol1_21_7To1_21_6
extends BackwardsProtocol<ClientboundPacket1_21_6, ClientboundPacket1_21_6, ServerboundPacket1_21_6, ServerboundPacket1_21_6> {
    public static final BackwardsMappingData MAPPINGS = new BackwardsMappingData("1.21.7", "1.21.6", Protocol1_21_6To1_21_7.class);
    private final EntityPacketRewriter1_21_7 entityRewriter = new EntityPacketRewriter1_21_7(this);
    private final BlockItemPacketRewriter1_21_7 itemRewriter = new BlockItemPacketRewriter1_21_7(this);
    private final ParticleRewriter<ClientboundPacket1_21_6> particleRewriter = new ParticleRewriter((Protocol)this);
    private final NBTComponentRewriter<ClientboundPacket1_21_6> translatableRewriter = new NBTComponentRewriter((BackwardsProtocol)this);
    private final TagRewriter<ClientboundPacket1_21_6> tagRewriter = new TagRewriter((Protocol)this);
    private final BackwardsRegistryRewriter registryDataRewriter = new BackwardsRegistryRewriter((BackwardsProtocol)this);
    private final RecipeDisplayRewriter<ClientboundPacket1_21_6> recipeRewriter = new RecipeDisplayRewriter1_21_5((Protocol)this);
    private final BlockRewriter<ClientboundPacket1_21_6> blockRewriter = BlockRewriter.for1_20_2((Protocol)this, ChunkType1_21_5::new);

    public Types1_20_5<StructuredDataKeys1_21_5, EntityDataTypes1_21_5> types() {
        return VersionedTypes.V1_21_6;
    }

    public Protocol1_21_7To1_21_6() {
        super(ClientboundPacket1_21_6.class, ClientboundPacket1_21_6.class, ServerboundPacket1_21_6.class, ServerboundPacket1_21_6.class);
    }

    public void init(UserConnection connection) {
        this.addEntityTracker(connection, (EntityTracker)new EntityTrackerBase(connection, (EntityType)EntityTypes1_21_6.PLAYER));
        this.addItemHasher(connection, (ItemHasher)new ItemHasherBase((Protocol)this, connection));
    }

    public BackwardsRegistryRewriter getRegistryDataRewriter() {
        return this.registryDataRewriter;
    }

    public NBTComponentRewriter<ClientboundPacket1_21_6> getComponentRewriter() {
        return this.translatableRewriter;
    }

    public ParticleRewriter<ClientboundPacket1_21_6> getParticleRewriter() {
        return this.particleRewriter;
    }

    protected PacketTypesProvider<ClientboundPacket1_21_6, ClientboundPacket1_21_6, ServerboundPacket1_21_6, ServerboundPacket1_21_6> createPacketTypesProvider() {
        return new SimplePacketTypesProvider(ProtocolUtil.packetTypeMap((Class)this.unmappedClientboundPacketType, (Class[])new Class[]{ClientboundPackets1_21_6.class, ClientboundConfigurationPackets1_21_6.class}), ProtocolUtil.packetTypeMap((Class)this.mappedClientboundPacketType, (Class[])new Class[]{ClientboundPackets1_21_6.class, ClientboundConfigurationPackets1_21_6.class}), ProtocolUtil.packetTypeMap((Class)this.mappedServerboundPacketType, (Class[])new Class[]{ServerboundPackets1_21_6.class, ServerboundConfigurationPackets1_21_6.class}), ProtocolUtil.packetTypeMap((Class)this.unmappedServerboundPacketType, (Class[])new Class[]{ServerboundPackets1_21_6.class, ServerboundConfigurationPackets1_21_6.class}));
    }

    public Types1_20_5<StructuredDataKeys1_21_5, EntityDataTypes1_21_5> mappedTypes() {
        return VersionedTypes.V1_21_6;
    }

    public TagRewriter<ClientboundPacket1_21_6> getTagRewriter() {
        return this.tagRewriter;
    }

    public BlockRewriter<ClientboundPacket1_21_6> getBlockRewriter() {
        return this.blockRewriter;
    }

    public BackwardsMappingData getMappingData() {
        return MAPPINGS;
    }

    public BlockItemPacketRewriter1_21_7 getItemRewriter() {
        return this.itemRewriter;
    }

    public RecipeDisplayRewriter<ClientboundPacket1_21_6> getRecipeRewriter() {
        return this.recipeRewriter;
    }

    public EntityPacketRewriter1_21_7 getEntityRewriter() {
        return this.entityRewriter;
    }
}

