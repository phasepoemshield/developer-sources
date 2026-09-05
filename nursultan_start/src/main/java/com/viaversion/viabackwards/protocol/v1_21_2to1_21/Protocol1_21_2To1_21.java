/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viabackwards.api.BackwardsProtocol
 *  com.viaversion.viabackwards.api.data.BackwardsMappingData
 *  com.viaversion.viabackwards.api.rewriters.BackwardsRegistryRewriter
 *  com.viaversion.viabackwards.api.rewriters.text.JsonNBTComponentRewriter
 *  com.viaversion.viabackwards.protocol.v1_21_2to1_21.storage.InventoryStateIdStorage
 *  com.viaversion.viabackwards.protocol.v1_21_2to1_21.storage.ItemTagStorage
 *  com.viaversion.viabackwards.protocol.v1_21_2to1_21.storage.RecipeStorage
 *  com.viaversion.viabackwards.protocol.v1_21_2to1_21.storage.SignStorage
 *  com.viaversion.viaversion.api.connection.StorableObject
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.data.entity.EntityTracker
 *  com.viaversion.viaversion.api.minecraft.entities.EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_20_5
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.State
 *  com.viaversion.viaversion.api.protocol.packet.provider.PacketTypesProvider
 *  com.viaversion.viaversion.api.protocol.packet.provider.SimplePacketTypesProvider
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.chunk.ChunkType1_20_2
 *  com.viaversion.viaversion.api.type.types.version.VersionedTypes
 *  com.viaversion.viaversion.api.type.types.version.VersionedTypesHolder
 *  com.viaversion.viaversion.data.entity.EntityTrackerBase
 *  com.viaversion.viaversion.protocols.base.ClientboundLoginPackets
 *  com.viaversion.viaversion.protocols.v1_20_3to1_20_5.packet.ServerboundConfigurationPackets1_20_5
 *  com.viaversion.viaversion.protocols.v1_20_3to1_20_5.packet.ServerboundPacket1_20_5
 *  com.viaversion.viaversion.protocols.v1_20_3to1_20_5.packet.ServerboundPackets1_20_5
 *  com.viaversion.viaversion.protocols.v1_20_5to1_21.packet.ClientboundConfigurationPackets1_21
 *  com.viaversion.viaversion.protocols.v1_20_5to1_21.packet.ClientboundPacket1_21
 *  com.viaversion.viaversion.protocols.v1_20_5to1_21.packet.ClientboundPackets1_21
 *  com.viaversion.viaversion.protocols.v1_21to1_21_2.Protocol1_21To1_21_2
 *  com.viaversion.viaversion.protocols.v1_21to1_21_2.packet.ClientboundPacket1_21_2
 *  com.viaversion.viaversion.protocols.v1_21to1_21_2.packet.ClientboundPackets1_21_2
 *  com.viaversion.viaversion.protocols.v1_21to1_21_2.packet.ServerboundPacket1_21_2
 *  com.viaversion.viaversion.protocols.v1_21to1_21_2.packet.ServerboundPackets1_21_2
 *  com.viaversion.viaversion.rewriter.BlockRewriter
 *  com.viaversion.viaversion.rewriter.TagRewriter
 *  com.viaversion.viaversion.util.ArrayUtil
 *  com.viaversion.viaversion.util.ProtocolUtil
 */
package com.viaversion.viabackwards.protocol.v1_21_2to1_21;

import com.viaversion.viabackwards.api.BackwardsProtocol;
import com.viaversion.viabackwards.api.data.BackwardsMappingData;
import com.viaversion.viabackwards.api.rewriters.BackwardsRegistryRewriter;
import com.viaversion.viabackwards.api.rewriters.text.JsonNBTComponentRewriter;
import com.viaversion.viabackwards.protocol.v1_21_2to1_21.rewriter.BlockItemPacketRewriter1_21_2;
import com.viaversion.viabackwards.protocol.v1_21_2to1_21.rewriter.ComponentRewriter1_21_2;
import com.viaversion.viabackwards.protocol.v1_21_2to1_21.rewriter.EntityPacketRewriter1_21_2;
import com.viaversion.viabackwards.protocol.v1_21_2to1_21.rewriter.ParticleRewriter1_21_2;
import com.viaversion.viabackwards.protocol.v1_21_2to1_21.storage.InventoryStateIdStorage;
import com.viaversion.viabackwards.protocol.v1_21_2to1_21.storage.ItemTagStorage;
import com.viaversion.viabackwards.protocol.v1_21_2to1_21.storage.PlayerStorage;
import com.viaversion.viabackwards.protocol.v1_21_2to1_21.storage.RecipeStorage;
import com.viaversion.viabackwards.protocol.v1_21_2to1_21.storage.SignStorage;
import com.viaversion.viaversion.api.connection.StorableObject;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.data.entity.EntityTracker;
import com.viaversion.viaversion.api.minecraft.entities.EntityType;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_20_5;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.State;
import com.viaversion.viaversion.api.protocol.packet.provider.PacketTypesProvider;
import com.viaversion.viaversion.api.protocol.packet.provider.SimplePacketTypesProvider;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.chunk.ChunkType1_20_2;
import com.viaversion.viaversion.api.type.types.version.VersionedTypes;
import com.viaversion.viaversion.api.type.types.version.VersionedTypesHolder;
import com.viaversion.viaversion.data.entity.EntityTrackerBase;
import com.viaversion.viaversion.protocols.base.ClientboundLoginPackets;
import com.viaversion.viaversion.protocols.v1_20_3to1_20_5.packet.ServerboundConfigurationPackets1_20_5;
import com.viaversion.viaversion.protocols.v1_20_3to1_20_5.packet.ServerboundPacket1_20_5;
import com.viaversion.viaversion.protocols.v1_20_3to1_20_5.packet.ServerboundPackets1_20_5;
import com.viaversion.viaversion.protocols.v1_20_5to1_21.packet.ClientboundConfigurationPackets1_21;
import com.viaversion.viaversion.protocols.v1_20_5to1_21.packet.ClientboundPacket1_21;
import com.viaversion.viaversion.protocols.v1_20_5to1_21.packet.ClientboundPackets1_21;
import com.viaversion.viaversion.protocols.v1_21to1_21_2.Protocol1_21To1_21_2;
import com.viaversion.viaversion.protocols.v1_21to1_21_2.packet.ClientboundPacket1_21_2;
import com.viaversion.viaversion.protocols.v1_21to1_21_2.packet.ClientboundPackets1_21_2;
import com.viaversion.viaversion.protocols.v1_21to1_21_2.packet.ServerboundPacket1_21_2;
import com.viaversion.viaversion.protocols.v1_21to1_21_2.packet.ServerboundPackets1_21_2;
import com.viaversion.viaversion.rewriter.BlockRewriter;
import com.viaversion.viaversion.rewriter.TagRewriter;
import com.viaversion.viaversion.util.ArrayUtil;
import com.viaversion.viaversion.util.ProtocolUtil;

public final class Protocol1_21_2To1_21
extends BackwardsProtocol<ClientboundPacket1_21_2, ClientboundPacket1_21, ServerboundPacket1_21_2, ServerboundPacket1_20_5> {
    public static final BackwardsMappingData MAPPINGS = new BackwardsMappingData("1.21.2", "1.21", Protocol1_21To1_21_2.class);
    private final EntityPacketRewriter1_21_2 entityRewriter = new EntityPacketRewriter1_21_2(this);
    private final BlockItemPacketRewriter1_21_2 itemRewriter = new BlockItemPacketRewriter1_21_2(this);
    private final ParticleRewriter1_21_2 particleRewriter = new ParticleRewriter1_21_2((Protocol<ClientboundPacket1_21_2, ?, ?, ?>)this);
    private final JsonNBTComponentRewriter<ClientboundPacket1_21_2> translatableRewriter = new ComponentRewriter1_21_2(this);
    private final TagRewriter<ClientboundPacket1_21_2> tagRewriter = new TagRewriter((Protocol)this);
    private final BackwardsRegistryRewriter registryDataRewriter = new BackwardsRegistryRewriter((BackwardsProtocol)this);
    private final BlockRewriter<ClientboundPacket1_21_2> blockRewriter = BlockRewriter.for1_20_2((Protocol)this, ChunkType1_20_2::new);

    public VersionedTypesHolder types() {
        return VersionedTypes.V1_21_2;
    }

    public Protocol1_21_2To1_21() {
        super(ClientboundPacket1_21_2.class, ClientboundPacket1_21.class, ServerboundPacket1_21_2.class, ServerboundPacket1_20_5.class);
    }

    public void init(UserConnection user) {
        this.addEntityTracker(user, (EntityTracker)new EntityTrackerBase(user, (EntityType)EntityTypes1_20_5.PLAYER));
        user.put((StorableObject)new InventoryStateIdStorage());
        user.put((StorableObject)new ItemTagStorage());
        user.put((StorableObject)new RecipeStorage(this));
        user.put((StorableObject)new PlayerStorage());
        user.put((StorableObject)new SignStorage());
    }

    public BackwardsRegistryRewriter getRegistryDataRewriter() {
        return this.registryDataRewriter;
    }

    public JsonNBTComponentRewriter<ClientboundPacket1_21_2> getComponentRewriter() {
        return this.translatableRewriter;
    }

    public ParticleRewriter1_21_2 getParticleRewriter() {
        return this.particleRewriter;
    }

    protected PacketTypesProvider<ClientboundPacket1_21_2, ClientboundPacket1_21, ServerboundPacket1_21_2, ServerboundPacket1_20_5> createPacketTypesProvider() {
        return new SimplePacketTypesProvider(ProtocolUtil.packetTypeMap((Class)this.unmappedClientboundPacketType, (Class[])new Class[]{ClientboundPackets1_21_2.class, ClientboundConfigurationPackets1_21.class}), ProtocolUtil.packetTypeMap((Class)this.mappedClientboundPacketType, (Class[])new Class[]{ClientboundPackets1_21.class, ClientboundConfigurationPackets1_21.class}), ProtocolUtil.packetTypeMap((Class)this.mappedServerboundPacketType, (Class[])new Class[]{ServerboundPackets1_21_2.class, ServerboundConfigurationPackets1_20_5.class}), ProtocolUtil.packetTypeMap((Class)this.unmappedServerboundPacketType, (Class[])new Class[]{ServerboundPackets1_20_5.class, ServerboundConfigurationPackets1_20_5.class}));
    }

    public VersionedTypesHolder mappedTypes() {
        return VersionedTypes.V1_21;
    }

    protected void registerPackets() {
        super.registerPackets();
        this.replaceClientbound((ClientboundPacketType)ClientboundPackets1_21_2.UPDATE_TAGS, this::storeTags);
        this.replaceClientbound((ClientboundPacketType)ClientboundConfigurationPackets1_21.UPDATE_TAGS, this::storeTags);
        this.registerServerbound((ServerboundPacketType)ServerboundPackets1_20_5.CLIENT_INFORMATION, this::clientInformation);
        this.registerServerbound((ServerboundPacketType)ServerboundConfigurationPackets1_20_5.CLIENT_INFORMATION, this::clientInformation);
        this.registerClientbound((ClientboundPacketType)ClientboundConfigurationPackets1_21.UPDATE_ENABLED_FEATURES, wrapper -> {
            Object[] enabledFeatures = (String[])wrapper.read(Types.STRING_ARRAY);
            wrapper.write(Types.STRING_ARRAY, (Object)((String[])ArrayUtil.add((Object[])enabledFeatures, (Object)"bundle")));
        });
        this.cancelClientbound((ClientboundPacketType)ClientboundPackets1_21_2.MOVE_MINECART_ALONG_TRACK);
        this.registerClientbound(State.LOGIN, (ClientboundPacketType)ClientboundLoginPackets.LOGIN_FINISHED, wrapper -> {
            wrapper.passthrough(Types.UUID);
            wrapper.passthrough(Types.STRING);
            wrapper.passthrough(Types.PROFILE_PROPERTY_ARRAY);
            wrapper.write((Type)Types.BOOLEAN, (Object)true);
        });
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_21_2.SET_TIME, wrapper -> {
            wrapper.passthrough((Type)Types.LONG);
            long dayTime = (Long)wrapper.read((Type)Types.LONG);
            boolean daylightCycle = (Boolean)wrapper.read((Type)Types.BOOLEAN);
            if (!daylightCycle) {
                dayTime = dayTime == 0L ? -1L : -dayTime;
            }
            wrapper.write((Type)Types.LONG, (Object)dayTime);
        });
    }

    public TagRewriter<ClientboundPacket1_21_2> getTagRewriter() {
        return this.tagRewriter;
    }

    public BlockRewriter<ClientboundPacket1_21_2> getBlockRewriter() {
        return this.blockRewriter;
    }

    public BackwardsMappingData getMappingData() {
        return MAPPINGS;
    }

    public BlockItemPacketRewriter1_21_2 getItemRewriter() {
        return this.itemRewriter;
    }

    public EntityPacketRewriter1_21_2 getEntityRewriter() {
        return this.entityRewriter;
    }

    private void clientInformation(PacketWrapper wrapper) {
        wrapper.passthrough(Types.STRING);
        wrapper.passthrough((Type)Types.BYTE);
        wrapper.passthrough((Type)Types.VAR_INT);
        wrapper.passthrough((Type)Types.BOOLEAN);
        wrapper.passthrough((Type)Types.UNSIGNED_BYTE);
        wrapper.passthrough((Type)Types.VAR_INT);
        wrapper.passthrough((Type)Types.BOOLEAN);
        wrapper.passthrough((Type)Types.BOOLEAN);
        wrapper.write((Type)Types.VAR_INT, (Object)0);
    }

    private void storeTags(PacketWrapper wrapper) {
        this.tagRewriter.handleGeneric(wrapper);
        wrapper.resetReader();
        ((ItemTagStorage)wrapper.user().get(ItemTagStorage.class)).readItemTags(wrapper);
    }
}

