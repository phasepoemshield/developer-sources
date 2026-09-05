/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.viabackwards.api.BackwardsProtocol
 *  com.viaversion.viabackwards.api.data.BackwardsMappingData
 *  com.viaversion.viabackwards.protocol.v1_20_2to1_20.storage.ConfigurationPacketStorage
 *  com.viaversion.viaversion.api.connection.StorableObject
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.data.entity.EntityTracker
 *  com.viaversion.viaversion.api.minecraft.entities.EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_19_4
 *  com.viaversion.viaversion.api.platform.providers.Provider
 *  com.viaversion.viaversion.api.platform.providers.ViaProviders
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.Direction
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.State
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.data.entity.EntityTrackerBase
 *  com.viaversion.viaversion.exception.CancelException
 *  com.viaversion.viaversion.exception.InformativeException
 *  com.viaversion.viaversion.protocols.base.ClientboundLoginPackets
 *  com.viaversion.viaversion.protocols.base.ServerboundLoginPackets
 *  com.viaversion.viaversion.protocols.v1_19_3to1_19_4.packet.ClientboundPackets1_19_4
 *  com.viaversion.viaversion.protocols.v1_19_3to1_19_4.packet.ServerboundPackets1_19_4
 *  com.viaversion.viaversion.protocols.v1_20to1_20_2.Protocol1_20To1_20_2
 *  com.viaversion.viaversion.protocols.v1_20to1_20_2.packet.ClientboundConfigurationPackets1_20_2
 *  com.viaversion.viaversion.protocols.v1_20to1_20_2.packet.ClientboundPackets1_20_2
 *  com.viaversion.viaversion.protocols.v1_20to1_20_2.packet.ServerboundConfigurationPackets1_20_2
 *  com.viaversion.viaversion.protocols.v1_20to1_20_2.packet.ServerboundPackets1_20_2
 *  com.viaversion.viaversion.rewriter.BlockRewriter
 *  com.viaversion.viaversion.rewriter.ParticleRewriter
 *  com.viaversion.viaversion.rewriter.TagRewriter
 */
package com.viaversion.viabackwards.protocol.v1_20_2to1_20;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.viabackwards.api.BackwardsProtocol;
import com.viaversion.viabackwards.api.data.BackwardsMappingData;
import com.viaversion.viabackwards.protocol.v1_20_2to1_20.provider.AdvancementCriteriaProvider;
import com.viaversion.viabackwards.protocol.v1_20_2to1_20.rewriter.BlockItemPacketRewriter1_20_2;
import com.viaversion.viabackwards.protocol.v1_20_2to1_20.rewriter.BlockRewriter1_20_2;
import com.viaversion.viabackwards.protocol.v1_20_2to1_20.rewriter.EntityPacketRewriter1_20_2;
import com.viaversion.viabackwards.protocol.v1_20_2to1_20.storage.ConfigurationPacketStorage;
import com.viaversion.viaversion.api.connection.StorableObject;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.data.entity.EntityTracker;
import com.viaversion.viaversion.api.minecraft.entities.EntityType;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_19_4;
import com.viaversion.viaversion.api.platform.providers.Provider;
import com.viaversion.viaversion.api.platform.providers.ViaProviders;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.Direction;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.State;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.data.entity.EntityTrackerBase;
import com.viaversion.viaversion.exception.CancelException;
import com.viaversion.viaversion.exception.InformativeException;
import com.viaversion.viaversion.protocols.base.ClientboundLoginPackets;
import com.viaversion.viaversion.protocols.base.ServerboundLoginPackets;
import com.viaversion.viaversion.protocols.v1_19_3to1_19_4.packet.ClientboundPackets1_19_4;
import com.viaversion.viaversion.protocols.v1_19_3to1_19_4.packet.ServerboundPackets1_19_4;
import com.viaversion.viaversion.protocols.v1_20to1_20_2.Protocol1_20To1_20_2;
import com.viaversion.viaversion.protocols.v1_20to1_20_2.packet.ClientboundConfigurationPackets1_20_2;
import com.viaversion.viaversion.protocols.v1_20to1_20_2.packet.ClientboundPackets1_20_2;
import com.viaversion.viaversion.protocols.v1_20to1_20_2.packet.ServerboundConfigurationPackets1_20_2;
import com.viaversion.viaversion.protocols.v1_20to1_20_2.packet.ServerboundPackets1_20_2;
import com.viaversion.viaversion.rewriter.BlockRewriter;
import com.viaversion.viaversion.rewriter.ParticleRewriter;
import com.viaversion.viaversion.rewriter.TagRewriter;
import java.util.UUID;

public final class Protocol1_20_2To1_20
extends BackwardsProtocol<ClientboundPackets1_20_2, ClientboundPackets1_19_4, ServerboundPackets1_20_2, ServerboundPackets1_19_4> {
    public static final BackwardsMappingData MAPPINGS = new BackwardsMappingData("1.20.2", "1.20", Protocol1_20To1_20_2.class);
    private final EntityPacketRewriter1_20_2 entityPacketRewriter = new EntityPacketRewriter1_20_2(this);
    private final BlockItemPacketRewriter1_20_2 itemPacketRewriter = new BlockItemPacketRewriter1_20_2(this);
    private final ParticleRewriter<ClientboundPackets1_20_2> particleRewriter = new ParticleRewriter((Protocol)this);
    private final TagRewriter<ClientboundPackets1_20_2> tagRewriter = new TagRewriter((Protocol)this);
    private final BlockRewriter<ClientboundPackets1_20_2> blockRewriter = new BlockRewriter1_20_2((Protocol<ClientboundPackets1_20_2, ?, ?, ?>)this);

    public Protocol1_20_2To1_20() {
        super(ClientboundPackets1_20_2.class, ClientboundPackets1_19_4.class, ServerboundPackets1_20_2.class, ServerboundPackets1_19_4.class);
    }

    protected void registerPackets() {
        super.registerPackets();
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_20_2.SET_DISPLAY_OBJECTIVE, wrapper -> {
            int slot = (Integer)wrapper.read((Type)Types.VAR_INT);
            wrapper.write((Type)Types.BYTE, (Object)((byte)slot));
        });
        this.registerClientbound(State.LOGIN, (ClientboundPacketType)ClientboundLoginPackets.LOGIN_FINISHED, wrapper -> {
            wrapper.user().put((StorableObject)new ConfigurationPacketStorage());
            wrapper.user().getProtocolInfo().setClientState(State.LOGIN);
            wrapper.create((PacketType)ServerboundLoginPackets.LOGIN_ACKNOWLEDGED).scheduleSendToServer(Protocol1_20_2To1_20.class);
        });
        this.registerClientbound(State.CONFIGURATION, (ClientboundPacketType)ClientboundConfigurationPackets1_20_2.FINISH_CONFIGURATION, wrapper -> {
            wrapper.cancel();
            wrapper.user().getProtocolInfo().setServerState(State.PLAY);
            ((ConfigurationPacketStorage)wrapper.user().get(ConfigurationPacketStorage.class)).setFinished(true);
            wrapper.create((PacketType)ServerboundConfigurationPackets1_20_2.FINISH_CONFIGURATION).sendToServer(Protocol1_20_2To1_20.class);
            wrapper.user().getProtocolInfo().setClientState(State.PLAY);
        });
        this.registerServerbound(State.LOGIN, (ServerboundPacketType)ServerboundLoginPackets.HELLO, wrapper -> {
            wrapper.passthrough(Types.STRING);
            UUID uuid = (UUID)wrapper.read(Types.OPTIONAL_UUID);
            wrapper.write(Types.UUID, (Object)(uuid != null ? uuid : new UUID(0L, 0L)));
        });
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_20_2.START_CONFIGURATION, null, wrapper -> {
            wrapper.cancel();
            wrapper.user().getProtocolInfo().setServerState(State.CONFIGURATION);
            PacketWrapper configAcknowledgedPacket = wrapper.create((PacketType)ServerboundPackets1_20_2.CONFIGURATION_ACKNOWLEDGED);
            configAcknowledgedPacket.sendToServer(Protocol1_20_2To1_20.class);
            wrapper.user().getProtocolInfo().setClientState(State.CONFIGURATION);
            wrapper.user().put((StorableObject)new ConfigurationPacketStorage());
        });
        this.cancelClientbound((ClientboundPacketType)ClientboundPackets1_20_2.PONG_RESPONSE);
        this.registerClientbound(State.CONFIGURATION, ClientboundConfigurationPackets1_20_2.DISCONNECT.getId(), -1, wrapper -> wrapper.setPacketType((PacketType)ClientboundPackets1_19_4.DISCONNECT));
        this.registerClientbound(State.CONFIGURATION, ClientboundConfigurationPackets1_20_2.KEEP_ALIVE.getId(), -1, wrapper -> wrapper.setPacketType((PacketType)ClientboundPackets1_19_4.KEEP_ALIVE));
        this.registerClientbound(State.CONFIGURATION, ClientboundConfigurationPackets1_20_2.PING.getId(), -1, wrapper -> wrapper.setPacketType((PacketType)ClientboundPackets1_19_4.PING));
        this.registerClientbound(State.CONFIGURATION, ClientboundConfigurationPackets1_20_2.RESOURCE_PACK.getId(), -1, wrapper -> {
            ((ConfigurationPacketStorage)wrapper.user().get(ConfigurationPacketStorage.class)).setResourcePack(wrapper);
            wrapper.cancel();
            PacketWrapper acceptedResponse = wrapper.create((PacketType)ServerboundConfigurationPackets1_20_2.RESOURCE_PACK);
            acceptedResponse.write((Type)Types.VAR_INT, (Object)3);
            acceptedResponse.sendToServer(Protocol1_20_2To1_20.class);
            PacketWrapper downloadedResponse = wrapper.create((PacketType)ServerboundConfigurationPackets1_20_2.RESOURCE_PACK);
            downloadedResponse.write((Type)Types.VAR_INT, (Object)0);
            downloadedResponse.sendToServer(Protocol1_20_2To1_20.class);
        });
        this.registerClientbound(State.CONFIGURATION, ClientboundConfigurationPackets1_20_2.REGISTRY_DATA.getId(), -1, wrapper -> {
            wrapper.cancel();
            CompoundTag registry = (CompoundTag)wrapper.read(Types.COMPOUND_TAG);
            this.entityPacketRewriter.trackBiomeSize(wrapper.user(), registry);
            this.entityPacketRewriter.cacheDimensionData(wrapper.user(), registry);
            ((ConfigurationPacketStorage)wrapper.user().get(ConfigurationPacketStorage.class)).setRegistry(registry);
        });
        this.registerClientbound(State.CONFIGURATION, ClientboundConfigurationPackets1_20_2.UPDATE_ENABLED_FEATURES.getId(), -1, wrapper -> {
            String[] enabledFeatures = (String[])wrapper.read(Types.STRING_ARRAY);
            ((ConfigurationPacketStorage)wrapper.user().get(ConfigurationPacketStorage.class)).setEnabledFeatures(enabledFeatures);
            wrapper.cancel();
        });
        this.registerClientbound(State.CONFIGURATION, ClientboundConfigurationPackets1_20_2.UPDATE_TAGS.getId(), -1, wrapper -> {
            this.tagRewriter.handleGeneric(wrapper);
            ((ConfigurationPacketStorage)wrapper.user().get(ConfigurationPacketStorage.class)).addRawPacket(wrapper, (PacketType)ClientboundPackets1_19_4.UPDATE_TAGS);
            wrapper.cancel();
        });
        this.registerClientbound(State.CONFIGURATION, ClientboundConfigurationPackets1_20_2.CUSTOM_PAYLOAD.getId(), -1, wrapper -> {
            ((ConfigurationPacketStorage)wrapper.user().get(ConfigurationPacketStorage.class)).addRawPacket(wrapper, (PacketType)ClientboundPackets1_19_4.CUSTOM_PAYLOAD);
            wrapper.cancel();
        });
    }

    public void register(ViaProviders providers) {
        providers.register(AdvancementCriteriaProvider.class, (Provider)new AdvancementCriteriaProvider());
    }

    public void transform(Direction direction, State state, PacketWrapper wrapper) throws InformativeException, CancelException {
        ConfigurationPacketStorage configurationPacketStorage = (ConfigurationPacketStorage)wrapper.user().get(ConfigurationPacketStorage.class);
        if (configurationPacketStorage == null || configurationPacketStorage.isFinished()) {
            super.transform(direction, state, wrapper);
            return;
        }
        if (direction == Direction.CLIENTBOUND) {
            super.transform(direction, State.CONFIGURATION, wrapper);
            return;
        }
        int id = wrapper.getId();
        if (id == ServerboundPackets1_19_4.CLIENT_INFORMATION.getId()) {
            wrapper.setPacketType((PacketType)ServerboundConfigurationPackets1_20_2.CLIENT_INFORMATION);
        } else if (id == ServerboundPackets1_19_4.CUSTOM_PAYLOAD.getId()) {
            wrapper.setPacketType((PacketType)ServerboundConfigurationPackets1_20_2.CUSTOM_PAYLOAD);
        } else if (id == ServerboundPackets1_19_4.KEEP_ALIVE.getId()) {
            wrapper.setPacketType((PacketType)ServerboundConfigurationPackets1_20_2.KEEP_ALIVE);
        } else if (id == ServerboundPackets1_19_4.PONG.getId()) {
            wrapper.setPacketType((PacketType)ServerboundConfigurationPackets1_20_2.PONG);
        } else if (id == ServerboundPackets1_19_4.RESOURCE_PACK.getId()) {
            wrapper.setPacketType((PacketType)ServerboundConfigurationPackets1_20_2.RESOURCE_PACK);
        } else {
            throw CancelException.generate();
        }
    }

    public void init(UserConnection connection) {
        this.addEntityTracker(connection, (EntityTracker)new EntityTrackerBase(connection, (EntityType)EntityTypes1_19_4.PLAYER));
    }

    public BackwardsMappingData getMappingData() {
        return MAPPINGS;
    }

    public EntityPacketRewriter1_20_2 getEntityRewriter() {
        return this.entityPacketRewriter;
    }

    public BlockItemPacketRewriter1_20_2 getItemRewriter() {
        return this.itemPacketRewriter;
    }

    public BlockRewriter<ClientboundPackets1_20_2> getBlockRewriter() {
        return this.blockRewriter;
    }

    public ParticleRewriter<ClientboundPackets1_20_2> getParticleRewriter() {
        return this.particleRewriter;
    }

    public TagRewriter<ClientboundPackets1_20_2> getTagRewriter() {
        return this.tagRewriter;
    }
}

