/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viabackwards.api.BackwardsProtocol
 *  com.viaversion.viabackwards.api.data.BackwardsMappingData
 *  com.viaversion.viabackwards.api.rewriters.BackwardsRegistryRewriter
 *  com.viaversion.viabackwards.api.rewriters.text.JsonNBTComponentRewriter
 *  com.viaversion.viabackwards.protocol.v1_21to1_20_5.storage.EnchantmentsPaintingsStorage
 *  com.viaversion.viabackwards.protocol.v1_21to1_20_5.storage.OpenScreenStorage
 *  com.viaversion.viabackwards.protocol.v1_21to1_20_5.storage.PlayerRotationStorage
 *  com.viaversion.viaversion.api.connection.StorableObject
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.data.entity.EntityTracker
 *  com.viaversion.viaversion.api.minecraft.Holder
 *  com.viaversion.viaversion.api.minecraft.data.version.StructuredDataKeys1_20_5
 *  com.viaversion.viaversion.api.minecraft.entities.EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_20_5
 *  com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes1_20_5
 *  com.viaversion.viaversion.api.minecraft.item.data.ChatType
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.provider.PacketTypesProvider
 *  com.viaversion.viaversion.api.protocol.packet.provider.SimplePacketTypesProvider
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.chunk.ChunkType1_20_2
 *  com.viaversion.viaversion.api.type.types.version.Types1_20_5
 *  com.viaversion.viaversion.api.type.types.version.Types1_21
 *  com.viaversion.viaversion.api.type.types.version.VersionedTypes
 *  com.viaversion.viaversion.data.entity.EntityTrackerBase
 *  com.viaversion.viaversion.protocols.v1_20_3to1_20_5.packet.ClientboundConfigurationPackets1_20_5
 *  com.viaversion.viaversion.protocols.v1_20_3to1_20_5.packet.ClientboundPacket1_20_5
 *  com.viaversion.viaversion.protocols.v1_20_3to1_20_5.packet.ClientboundPackets1_20_5
 *  com.viaversion.viaversion.protocols.v1_20_3to1_20_5.packet.ServerboundConfigurationPackets1_20_5
 *  com.viaversion.viaversion.protocols.v1_20_3to1_20_5.packet.ServerboundPacket1_20_5
 *  com.viaversion.viaversion.protocols.v1_20_3to1_20_5.packet.ServerboundPackets1_20_5
 *  com.viaversion.viaversion.protocols.v1_20_5to1_21.Protocol1_20_5To1_21
 *  com.viaversion.viaversion.protocols.v1_20_5to1_21.packet.ClientboundConfigurationPackets1_21
 *  com.viaversion.viaversion.protocols.v1_20_5to1_21.packet.ClientboundPacket1_21
 *  com.viaversion.viaversion.protocols.v1_20_5to1_21.packet.ClientboundPackets1_21
 *  com.viaversion.viaversion.rewriter.BlockRewriter
 *  com.viaversion.viaversion.rewriter.ParticleRewriter
 *  com.viaversion.viaversion.rewriter.TagRewriter
 *  com.viaversion.viaversion.util.ArrayUtil
 *  com.viaversion.viaversion.util.ProtocolUtil
 */
package com.viaversion.viabackwards.protocol.v1_21to1_20_5;

import com.viaversion.nbt.tag.Tag;
import com.viaversion.viabackwards.api.BackwardsProtocol;
import com.viaversion.viabackwards.api.data.BackwardsMappingData;
import com.viaversion.viabackwards.api.rewriters.BackwardsRegistryRewriter;
import com.viaversion.viabackwards.api.rewriters.text.JsonNBTComponentRewriter;
import com.viaversion.viabackwards.protocol.v1_21to1_20_5.rewriter.BlockItemPacketRewriter1_21;
import com.viaversion.viabackwards.protocol.v1_21to1_20_5.rewriter.ComponentRewriter1_21;
import com.viaversion.viabackwards.protocol.v1_21to1_20_5.rewriter.EntityPacketRewriter1_21;
import com.viaversion.viabackwards.protocol.v1_21to1_20_5.storage.EnchantmentsPaintingsStorage;
import com.viaversion.viabackwards.protocol.v1_21to1_20_5.storage.OpenScreenStorage;
import com.viaversion.viabackwards.protocol.v1_21to1_20_5.storage.PlayerRotationStorage;
import com.viaversion.viaversion.api.connection.StorableObject;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.data.entity.EntityTracker;
import com.viaversion.viaversion.api.minecraft.Holder;
import com.viaversion.viaversion.api.minecraft.data.version.StructuredDataKeys1_20_5;
import com.viaversion.viaversion.api.minecraft.entities.EntityType;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_20_5;
import com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes1_20_5;
import com.viaversion.viaversion.api.minecraft.item.data.ChatType;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.provider.PacketTypesProvider;
import com.viaversion.viaversion.api.protocol.packet.provider.SimplePacketTypesProvider;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.chunk.ChunkType1_20_2;
import com.viaversion.viaversion.api.type.types.version.Types1_20_5;
import com.viaversion.viaversion.api.type.types.version.Types1_21;
import com.viaversion.viaversion.api.type.types.version.VersionedTypes;
import com.viaversion.viaversion.data.entity.EntityTrackerBase;
import com.viaversion.viaversion.protocols.v1_20_3to1_20_5.packet.ClientboundConfigurationPackets1_20_5;
import com.viaversion.viaversion.protocols.v1_20_3to1_20_5.packet.ClientboundPacket1_20_5;
import com.viaversion.viaversion.protocols.v1_20_3to1_20_5.packet.ClientboundPackets1_20_5;
import com.viaversion.viaversion.protocols.v1_20_3to1_20_5.packet.ServerboundConfigurationPackets1_20_5;
import com.viaversion.viaversion.protocols.v1_20_3to1_20_5.packet.ServerboundPacket1_20_5;
import com.viaversion.viaversion.protocols.v1_20_3to1_20_5.packet.ServerboundPackets1_20_5;
import com.viaversion.viaversion.protocols.v1_20_5to1_21.Protocol1_20_5To1_21;
import com.viaversion.viaversion.protocols.v1_20_5to1_21.packet.ClientboundConfigurationPackets1_21;
import com.viaversion.viaversion.protocols.v1_20_5to1_21.packet.ClientboundPacket1_21;
import com.viaversion.viaversion.protocols.v1_20_5to1_21.packet.ClientboundPackets1_21;
import com.viaversion.viaversion.rewriter.BlockRewriter;
import com.viaversion.viaversion.rewriter.ParticleRewriter;
import com.viaversion.viaversion.rewriter.TagRewriter;
import com.viaversion.viaversion.util.ArrayUtil;
import com.viaversion.viaversion.util.ProtocolUtil;

public final class Protocol1_21To1_20_5
extends BackwardsProtocol<ClientboundPacket1_21, ClientboundPacket1_20_5, ServerboundPacket1_20_5, ServerboundPacket1_20_5> {
    public static final BackwardsMappingData MAPPINGS = new BackwardsMappingData("1.21", "1.20.5", Protocol1_20_5To1_21.class);
    private final EntityPacketRewriter1_21 entityRewriter = new EntityPacketRewriter1_21(this);
    private final BlockItemPacketRewriter1_21 itemRewriter = new BlockItemPacketRewriter1_21(this);
    private final ParticleRewriter<ClientboundPacket1_21> particleRewriter = new ParticleRewriter((Protocol)this);
    private final JsonNBTComponentRewriter<ClientboundPacket1_21> translatableRewriter = new ComponentRewriter1_21(this);
    private final TagRewriter<ClientboundPacket1_21> tagRewriter = new TagRewriter((Protocol)this);
    private final BlockRewriter<ClientboundPacket1_21> blockRewriter = BlockRewriter.for1_20_2((Protocol)this, ChunkType1_20_2::new);
    private final BackwardsRegistryRewriter registryDataRewriter = new BackwardsRegistryRewriter((BackwardsProtocol)this);

    public Protocol1_21To1_20_5() {
        super(ClientboundPacket1_21.class, ClientboundPacket1_20_5.class, ServerboundPacket1_20_5.class, ServerboundPacket1_20_5.class);
    }

    protected void registerPackets() {
        super.registerPackets();
        this.cancelClientbound((ClientboundPacketType)ClientboundPackets1_21.PROJECTILE_POWER);
        this.cancelClientbound((ClientboundPacketType)ClientboundPackets1_21.CUSTOM_REPORT_DETAILS);
        this.cancelClientbound((ClientboundPacketType)ClientboundPackets1_21.SERVER_LINKS);
        this.cancelClientbound((ClientboundPacketType)ClientboundConfigurationPackets1_21.CUSTOM_REPORT_DETAILS);
        this.cancelClientbound((ClientboundPacketType)ClientboundConfigurationPackets1_21.SERVER_LINKS);
        this.replaceClientbound((ClientboundPacketType)ClientboundPackets1_21.DISGUISED_CHAT, wrapper -> {
            this.translatableRewriter.processTag(wrapper.user(), (Tag)wrapper.passthrough(Types.TRUSTED_TAG));
            Holder chatType = (Holder)wrapper.read((Type)ChatType.TYPE);
            if (chatType.isDirect()) {
                wrapper.write((Type)Types.VAR_INT, (Object)0);
                return;
            }
            wrapper.write((Type)Types.VAR_INT, (Object)chatType.id());
        });
        this.replaceClientbound((ClientboundPacketType)ClientboundPackets1_21.PLAYER_CHAT, wrapper -> {
            Holder chatType;
            wrapper.passthrough(Types.UUID);
            wrapper.passthrough((Type)Types.VAR_INT);
            wrapper.passthrough((Type)Types.OPTIONAL_SIGNATURE_BYTES);
            wrapper.passthrough(Types.STRING);
            wrapper.passthrough((Type)Types.LONG);
            wrapper.passthrough((Type)Types.LONG);
            int lastSeen = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            for (int i = 0; i < lastSeen; ++i) {
                int index = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
                if (index != 0) continue;
                wrapper.passthrough((Type)Types.SIGNATURE_BYTES);
            }
            wrapper.passthrough(Types.TRUSTED_OPTIONAL_TAG);
            int filterMaskType = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            if (filterMaskType == 2) {
                wrapper.passthrough(Types.LONG_ARRAY_PRIMITIVE);
            }
            if ((chatType = (Holder)wrapper.read((Type)ChatType.TYPE)).isDirect()) {
                wrapper.write((Type)Types.VAR_INT, (Object)0);
            } else {
                wrapper.write((Type)Types.VAR_INT, (Object)chatType.id());
            }
            this.translatableRewriter.processTag(wrapper.user(), (Tag)wrapper.passthrough(Types.TRUSTED_TAG));
            this.translatableRewriter.processTag(wrapper.user(), (Tag)wrapper.passthrough(Types.TRUSTED_OPTIONAL_TAG));
        });
        this.replaceClientbound((ClientboundPacketType)ClientboundPackets1_21.UPDATE_ATTRIBUTES, wrapper -> {
            int size;
            wrapper.passthrough((Type)Types.VAR_INT);
            int newSize = size = ((Integer)wrapper.passthrough((Type)Types.VAR_INT)).intValue();
            for (int i = 0; i < size; ++i) {
                int j;
                int modifierSize;
                int attributeId = (Integer)wrapper.read((Type)Types.VAR_INT);
                int mappedId = MAPPINGS.getNewAttributeId(attributeId);
                if (mappedId == -1) {
                    --newSize;
                    wrapper.read((Type)Types.DOUBLE);
                    modifierSize = (Integer)wrapper.read((Type)Types.VAR_INT);
                    for (j = 0; j < modifierSize; ++j) {
                        wrapper.read(Types.STRING);
                        wrapper.read((Type)Types.DOUBLE);
                        wrapper.read((Type)Types.BYTE);
                    }
                    continue;
                }
                wrapper.write((Type)Types.VAR_INT, (Object)mappedId);
                wrapper.passthrough((Type)Types.DOUBLE);
                modifierSize = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
                for (j = 0; j < modifierSize; ++j) {
                    String id = (String)wrapper.read(Types.STRING);
                    wrapper.write(Types.UUID, (Object)Protocol1_20_5To1_21.mapAttributeId((String)id));
                    wrapper.passthrough((Type)Types.DOUBLE);
                    wrapper.passthrough((Type)Types.BYTE);
                }
            }
            if (size != newSize) {
                wrapper.set((Type)Types.VAR_INT, 1, (Object)newSize);
            }
        });
        this.registerClientbound((ClientboundPacketType)ClientboundConfigurationPackets1_21.UPDATE_ENABLED_FEATURES, wrapper -> {
            Object[] enabledFeatures = (String[])wrapper.read(Types.STRING_ARRAY);
            wrapper.write(Types.STRING_ARRAY, (Object)((String[])ArrayUtil.add((Object[])enabledFeatures, (Object)"minecraft:update_1_21")));
        });
    }

    public void init(UserConnection user) {
        this.addEntityTracker(user, (EntityTracker)new EntityTrackerBase(user, (EntityType)EntityTypes1_20_5.PLAYER));
        user.put((StorableObject)new EnchantmentsPaintingsStorage());
        user.put((StorableObject)new OpenScreenStorage());
        user.put((StorableObject)new PlayerRotationStorage());
    }

    public BackwardsMappingData getMappingData() {
        return MAPPINGS;
    }

    public EntityPacketRewriter1_21 getEntityRewriter() {
        return this.entityRewriter;
    }

    public BlockItemPacketRewriter1_21 getItemRewriter() {
        return this.itemRewriter;
    }

    public BlockRewriter<ClientboundPacket1_21> getBlockRewriter() {
        return this.blockRewriter;
    }

    public BackwardsRegistryRewriter getRegistryDataRewriter() {
        return this.registryDataRewriter;
    }

    public ParticleRewriter<ClientboundPacket1_21> getParticleRewriter() {
        return this.particleRewriter;
    }

    public JsonNBTComponentRewriter<ClientboundPacket1_21> getComponentRewriter() {
        return this.translatableRewriter;
    }

    public TagRewriter<ClientboundPacket1_21> getTagRewriter() {
        return this.tagRewriter;
    }

    public Types1_21 types() {
        return VersionedTypes.V1_21;
    }

    public Types1_20_5<StructuredDataKeys1_20_5, EntityDataTypes1_20_5> mappedTypes() {
        return VersionedTypes.V1_20_5;
    }

    protected PacketTypesProvider<ClientboundPacket1_21, ClientboundPacket1_20_5, ServerboundPacket1_20_5, ServerboundPacket1_20_5> createPacketTypesProvider() {
        return new SimplePacketTypesProvider(ProtocolUtil.packetTypeMap((Class)this.unmappedClientboundPacketType, (Class[])new Class[]{ClientboundPackets1_21.class, ClientboundConfigurationPackets1_21.class}), ProtocolUtil.packetTypeMap((Class)this.mappedClientboundPacketType, (Class[])new Class[]{ClientboundPackets1_20_5.class, ClientboundConfigurationPackets1_20_5.class}), ProtocolUtil.packetTypeMap((Class)this.mappedServerboundPacketType, (Class[])new Class[]{ServerboundPackets1_20_5.class, ServerboundConfigurationPackets1_20_5.class}), ProtocolUtil.packetTypeMap((Class)this.unmappedServerboundPacketType, (Class[])new Class[]{ServerboundPackets1_20_5.class, ServerboundConfigurationPackets1_20_5.class}));
    }
}

