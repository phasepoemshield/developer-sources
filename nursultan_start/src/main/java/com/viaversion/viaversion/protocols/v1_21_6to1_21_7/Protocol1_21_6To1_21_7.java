/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.data.MappingData
 *  com.viaversion.viaversion.api.data.MappingDataBase
 *  com.viaversion.viaversion.api.data.entity.EntityTracker
 *  com.viaversion.viaversion.api.minecraft.data.version.StructuredDataKeys1_21_5
 *  com.viaversion.viaversion.api.minecraft.entities.EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_21_6
 *  com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes1_21_5
 *  com.viaversion.viaversion.api.protocol.AbstractProtocol
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.packet.provider.PacketTypesProvider
 *  com.viaversion.viaversion.api.protocol.packet.provider.SimplePacketTypesProvider
 *  com.viaversion.viaversion.api.type.types.chunk.ChunkType1_21_5
 *  com.viaversion.viaversion.api.type.types.version.Types1_20_5
 *  com.viaversion.viaversion.api.type.types.version.VersionedTypes
 *  com.viaversion.viaversion.data.entity.EntityTrackerBase
 *  com.viaversion.viaversion.rewriter.BlockRewriter
 *  com.viaversion.viaversion.rewriter.ParticleRewriter
 *  com.viaversion.viaversion.rewriter.RecipeDisplayRewriter
 *  com.viaversion.viaversion.rewriter.RegistryDataRewriter
 *  com.viaversion.viaversion.rewriter.TagRewriter
 *  com.viaversion.viaversion.util.ProtocolUtil
 */
package com.viaversion.viaversion.protocols.v1_21_6to1_21_7;

import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.data.MappingData;
import com.viaversion.viaversion.api.data.MappingDataBase;
import com.viaversion.viaversion.api.data.entity.EntityTracker;
import com.viaversion.viaversion.api.minecraft.data.version.StructuredDataKeys1_21_5;
import com.viaversion.viaversion.api.minecraft.entities.EntityType;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_21_6;
import com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes1_21_5;
import com.viaversion.viaversion.api.protocol.AbstractProtocol;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.packet.provider.PacketTypesProvider;
import com.viaversion.viaversion.api.protocol.packet.provider.SimplePacketTypesProvider;
import com.viaversion.viaversion.api.type.types.chunk.ChunkType1_21_5;
import com.viaversion.viaversion.api.type.types.version.Types1_20_5;
import com.viaversion.viaversion.api.type.types.version.VersionedTypes;
import com.viaversion.viaversion.data.entity.EntityTrackerBase;
import com.viaversion.viaversion.protocols.v1_21_4to1_21_5.rewriter.RecipeDisplayRewriter1_21_5;
import com.viaversion.viaversion.protocols.v1_21_5to1_21_6.packet.ClientboundConfigurationPackets1_21_6;
import com.viaversion.viaversion.protocols.v1_21_5to1_21_6.packet.ClientboundPacket1_21_6;
import com.viaversion.viaversion.protocols.v1_21_5to1_21_6.packet.ClientboundPackets1_21_6;
import com.viaversion.viaversion.protocols.v1_21_5to1_21_6.packet.ServerboundConfigurationPackets1_21_6;
import com.viaversion.viaversion.protocols.v1_21_5to1_21_6.packet.ServerboundPacket1_21_6;
import com.viaversion.viaversion.protocols.v1_21_5to1_21_6.packet.ServerboundPackets1_21_6;
import com.viaversion.viaversion.protocols.v1_21_6to1_21_7.rewriter.BlockItemPacketRewriter1_21_7;
import com.viaversion.viaversion.protocols.v1_21_6to1_21_7.rewriter.EntityPacketRewriter1_21_7;
import com.viaversion.viaversion.rewriter.BlockRewriter;
import com.viaversion.viaversion.rewriter.ParticleRewriter;
import com.viaversion.viaversion.rewriter.RecipeDisplayRewriter;
import com.viaversion.viaversion.rewriter.RegistryDataRewriter;
import com.viaversion.viaversion.rewriter.TagRewriter;
import com.viaversion.viaversion.util.ProtocolUtil;

public final class Protocol1_21_6To1_21_7
extends AbstractProtocol<ClientboundPacket1_21_6, ClientboundPacket1_21_6, ServerboundPacket1_21_6, ServerboundPacket1_21_6> {
    public static final MappingData MAPPINGS = new MappingDataBase("1.21.6", "1.21.7");
    private final EntityPacketRewriter1_21_7 entityRewriter = new EntityPacketRewriter1_21_7(this);
    private final BlockItemPacketRewriter1_21_7 itemRewriter = new BlockItemPacketRewriter1_21_7(this);
    private final ParticleRewriter<ClientboundPacket1_21_6> particleRewriter = new ParticleRewriter((Protocol)this);
    private final TagRewriter<ClientboundPacket1_21_6> tagRewriter = new TagRewriter((Protocol)this);
    private final RegistryDataRewriter registryDataRewriter = new RegistryDataRewriter((Protocol)this);
    private final BlockRewriter<ClientboundPacket1_21_6> blockRewriter = BlockRewriter.for1_20_2((Protocol)this, ChunkType1_21_5::new);
    private final RecipeDisplayRewriter<ClientboundPacket1_21_6> recipeRewriter = new RecipeDisplayRewriter1_21_5<ClientboundPacket1_21_6>((Protocol<ClientboundPacket1_21_6, ?, ?, ?>)this);

    public Protocol1_21_6To1_21_7() {
        super(ClientboundPacket1_21_6.class, ClientboundPacket1_21_6.class, ServerboundPacket1_21_6.class, ServerboundPacket1_21_6.class);
    }

    protected void registerPackets() {
        super.registerPackets();
    }

    public void init(UserConnection connection) {
        this.addEntityTracker(connection, (EntityTracker)new EntityTrackerBase(connection, (EntityType)EntityTypes1_21_6.PLAYER));
        this.addItemHasher(connection);
    }

    public MappingData getMappingData() {
        return MAPPINGS;
    }

    public Types1_20_5<StructuredDataKeys1_21_5, EntityDataTypes1_21_5> types() {
        return VersionedTypes.V1_21_6;
    }

    public Types1_20_5<StructuredDataKeys1_21_5, EntityDataTypes1_21_5> mappedTypes() {
        return VersionedTypes.V1_21_6;
    }

    public TagRewriter<ClientboundPacket1_21_6> getTagRewriter() {
        return this.tagRewriter;
    }

    public EntityPacketRewriter1_21_7 getEntityRewriter() {
        return this.entityRewriter;
    }

    public BlockItemPacketRewriter1_21_7 getItemRewriter() {
        return this.itemRewriter;
    }

    public BlockRewriter<ClientboundPacket1_21_6> getBlockRewriter() {
        return this.blockRewriter;
    }

    public RecipeDisplayRewriter<ClientboundPacket1_21_6> getRecipeRewriter() {
        return this.recipeRewriter;
    }

    public RegistryDataRewriter getRegistryDataRewriter() {
        return this.registryDataRewriter;
    }

    public ParticleRewriter<ClientboundPacket1_21_6> getParticleRewriter() {
        return this.particleRewriter;
    }

    protected PacketTypesProvider<ClientboundPacket1_21_6, ClientboundPacket1_21_6, ServerboundPacket1_21_6, ServerboundPacket1_21_6> createPacketTypesProvider() {
        return new SimplePacketTypesProvider(ProtocolUtil.packetTypeMap((Class)this.unmappedClientboundPacketType, (Class[])new Class[]{ClientboundPackets1_21_6.class, ClientboundConfigurationPackets1_21_6.class}), ProtocolUtil.packetTypeMap((Class)this.mappedClientboundPacketType, (Class[])new Class[]{ClientboundPackets1_21_6.class, ClientboundConfigurationPackets1_21_6.class}), ProtocolUtil.packetTypeMap((Class)this.mappedServerboundPacketType, (Class[])new Class[]{ServerboundPackets1_21_6.class, ServerboundConfigurationPackets1_21_6.class}), ProtocolUtil.packetTypeMap((Class)this.unmappedServerboundPacketType, (Class[])new Class[]{ServerboundPackets1_21_6.class, ServerboundConfigurationPackets1_21_6.class}));
    }
}

