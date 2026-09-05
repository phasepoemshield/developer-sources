/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.viabackwards.api.BackwardsProtocol
 *  com.viaversion.viabackwards.api.data.BackwardsMappingData
 *  com.viaversion.viabackwards.api.rewriters.text.JsonNBTComponentRewriter
 *  com.viaversion.viabackwards.protocol.v1_20_5to1_20_3.storage.CookieStorage
 *  com.viaversion.viabackwards.protocol.v1_20_5to1_20_3.storage.RegistryDataStorage
 *  com.viaversion.viabackwards.protocol.v1_20_5to1_20_3.storage.SecureChatStorage
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.connection.StorableObject
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.data.entity.EntityTracker
 *  com.viaversion.viaversion.api.minecraft.RegistryType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_20_5
 *  com.viaversion.viaversion.api.platform.providers.Provider
 *  com.viaversion.viaversion.api.platform.providers.ViaProviders
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.State
 *  com.viaversion.viaversion.api.protocol.packet.provider.PacketTypesProvider
 *  com.viaversion.viaversion.api.protocol.packet.provider.SimplePacketTypesProvider
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.version.VersionedTypes
 *  com.viaversion.viaversion.api.type.types.version.VersionedTypesHolder
 *  com.viaversion.viaversion.data.entity.EntityTrackerBase
 *  com.viaversion.viaversion.protocols.base.ClientboundLoginPackets
 *  com.viaversion.viaversion.protocols.base.ServerboundLoginPackets
 *  com.viaversion.viaversion.protocols.v1_19_3to1_19_4.rewriter.CommandRewriter1_19_4
 *  com.viaversion.viaversion.protocols.v1_20_2to1_20_3.packet.ClientboundConfigurationPackets1_20_3
 *  com.viaversion.viaversion.protocols.v1_20_2to1_20_3.packet.ClientboundPacket1_20_3
 *  com.viaversion.viaversion.protocols.v1_20_2to1_20_3.packet.ClientboundPackets1_20_3
 *  com.viaversion.viaversion.protocols.v1_20_2to1_20_3.packet.ServerboundPacket1_20_3
 *  com.viaversion.viaversion.protocols.v1_20_2to1_20_3.packet.ServerboundPackets1_20_3
 *  com.viaversion.viaversion.protocols.v1_20_3to1_20_5.Protocol1_20_3To1_20_5
 *  com.viaversion.viaversion.protocols.v1_20_3to1_20_5.packet.ClientboundConfigurationPackets1_20_5
 *  com.viaversion.viaversion.protocols.v1_20_3to1_20_5.packet.ClientboundPacket1_20_5
 *  com.viaversion.viaversion.protocols.v1_20_3to1_20_5.packet.ClientboundPackets1_20_5
 *  com.viaversion.viaversion.protocols.v1_20_3to1_20_5.packet.ServerboundConfigurationPackets1_20_5
 *  com.viaversion.viaversion.protocols.v1_20_3to1_20_5.packet.ServerboundPacket1_20_5
 *  com.viaversion.viaversion.protocols.v1_20_3to1_20_5.packet.ServerboundPackets1_20_5
 *  com.viaversion.viaversion.protocols.v1_20_3to1_20_5.storage.ArmorTrimStorage
 *  com.viaversion.viaversion.protocols.v1_20_3to1_20_5.storage.BannerPatternStorage
 *  com.viaversion.viaversion.protocols.v1_20to1_20_2.packet.ServerboundConfigurationPackets1_20_2
 *  com.viaversion.viaversion.rewriter.ParticleRewriter
 *  com.viaversion.viaversion.rewriter.TagRewriter
 *  com.viaversion.viaversion.util.ProtocolUtil
 */
package com.viaversion.viabackwards.protocol.v1_20_5to1_20_3;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.viabackwards.api.BackwardsProtocol;
import com.viaversion.viabackwards.api.data.BackwardsMappingData;
import com.viaversion.viabackwards.api.rewriters.text.JsonNBTComponentRewriter;
import com.viaversion.viabackwards.protocol.v1_20_5to1_20_3.Types1_20_3;
import com.viaversion.viabackwards.protocol.v1_20_5to1_20_3.provider.TransferProvider;
import com.viaversion.viabackwards.protocol.v1_20_5to1_20_3.rewriter.BlockItemPacketRewriter1_20_5;
import com.viaversion.viabackwards.protocol.v1_20_5to1_20_3.rewriter.BlockPacketRewriter1_20_5;
import com.viaversion.viabackwards.protocol.v1_20_5to1_20_3.rewriter.ComponentRewriter1_20_5;
import com.viaversion.viabackwards.protocol.v1_20_5to1_20_3.rewriter.EntityPacketRewriter1_20_5;
import com.viaversion.viabackwards.protocol.v1_20_5to1_20_3.storage.CookieStorage;
import com.viaversion.viabackwards.protocol.v1_20_5to1_20_3.storage.RegistryDataStorage;
import com.viaversion.viabackwards.protocol.v1_20_5to1_20_3.storage.SecureChatStorage;
import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.connection.StorableObject;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.data.entity.EntityTracker;
import com.viaversion.viaversion.api.minecraft.RegistryType;
import com.viaversion.viaversion.api.minecraft.entities.EntityType;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_20_5;
import com.viaversion.viaversion.api.platform.providers.Provider;
import com.viaversion.viaversion.api.platform.providers.ViaProviders;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.State;
import com.viaversion.viaversion.api.protocol.packet.provider.PacketTypesProvider;
import com.viaversion.viaversion.api.protocol.packet.provider.SimplePacketTypesProvider;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.version.VersionedTypes;
import com.viaversion.viaversion.api.type.types.version.VersionedTypesHolder;
import com.viaversion.viaversion.data.entity.EntityTrackerBase;
import com.viaversion.viaversion.protocols.base.ClientboundLoginPackets;
import com.viaversion.viaversion.protocols.base.ServerboundLoginPackets;
import com.viaversion.viaversion.protocols.v1_19_3to1_19_4.rewriter.CommandRewriter1_19_4;
import com.viaversion.viaversion.protocols.v1_20_2to1_20_3.packet.ClientboundConfigurationPackets1_20_3;
import com.viaversion.viaversion.protocols.v1_20_2to1_20_3.packet.ClientboundPacket1_20_3;
import com.viaversion.viaversion.protocols.v1_20_2to1_20_3.packet.ClientboundPackets1_20_3;
import com.viaversion.viaversion.protocols.v1_20_2to1_20_3.packet.ServerboundPacket1_20_3;
import com.viaversion.viaversion.protocols.v1_20_2to1_20_3.packet.ServerboundPackets1_20_3;
import com.viaversion.viaversion.protocols.v1_20_3to1_20_5.Protocol1_20_3To1_20_5;
import com.viaversion.viaversion.protocols.v1_20_3to1_20_5.packet.ClientboundConfigurationPackets1_20_5;
import com.viaversion.viaversion.protocols.v1_20_3to1_20_5.packet.ClientboundPacket1_20_5;
import com.viaversion.viaversion.protocols.v1_20_3to1_20_5.packet.ClientboundPackets1_20_5;
import com.viaversion.viaversion.protocols.v1_20_3to1_20_5.packet.ServerboundConfigurationPackets1_20_5;
import com.viaversion.viaversion.protocols.v1_20_3to1_20_5.packet.ServerboundPacket1_20_5;
import com.viaversion.viaversion.protocols.v1_20_3to1_20_5.packet.ServerboundPackets1_20_5;
import com.viaversion.viaversion.protocols.v1_20_3to1_20_5.storage.ArmorTrimStorage;
import com.viaversion.viaversion.protocols.v1_20_3to1_20_5.storage.BannerPatternStorage;
import com.viaversion.viaversion.protocols.v1_20to1_20_2.packet.ServerboundConfigurationPackets1_20_2;
import com.viaversion.viaversion.rewriter.ParticleRewriter;
import com.viaversion.viaversion.rewriter.TagRewriter;
import com.viaversion.viaversion.util.ProtocolUtil;

public final class Protocol1_20_5To1_20_3
extends BackwardsProtocol<ClientboundPacket1_20_5, ClientboundPacket1_20_3, ServerboundPacket1_20_5, ServerboundPacket1_20_3> {
    public static final BackwardsMappingData MAPPINGS = new BackwardsMappingData("1.20.5", "1.20.3", Protocol1_20_3To1_20_5.class);
    private final EntityPacketRewriter1_20_5 entityRewriter = new EntityPacketRewriter1_20_5(this);
    private final BlockItemPacketRewriter1_20_5 itemRewriter = new BlockItemPacketRewriter1_20_5(this);
    private final ParticleRewriter<ClientboundPacket1_20_5> particleRewriter = new ParticleRewriter((Protocol)this);
    private final JsonNBTComponentRewriter<ClientboundPacket1_20_5> translatableRewriter = new ComponentRewriter1_20_5(this);
    private final TagRewriter<ClientboundPacket1_20_5> tagRewriter = new TagRewriter((Protocol)this);
    private final BlockPacketRewriter1_20_5 blockRewriter = new BlockPacketRewriter1_20_5(this);

    public Protocol1_20_5To1_20_3() {
        super(ClientboundPacket1_20_5.class, ClientboundPacket1_20_3.class, ServerboundPacket1_20_5.class, ServerboundPacket1_20_3.class);
    }

    protected void registerPackets() {
        super.registerPackets();
        this.tagRewriter.addEmptyTag(RegistryType.ITEM, "minecraft:axolotl_tempt_items");
        this.replaceClientbound((ClientboundPacketType)ClientboundConfigurationPackets1_20_5.UPDATE_TAGS, wrapper -> {
            this.sendRegistryData(wrapper.user());
            this.tagRewriter.handleGeneric(wrapper);
        });
        this.appendClientbound((ClientboundPacketType)ClientboundConfigurationPackets1_20_5.FINISH_CONFIGURATION, wrapper -> this.sendRegistryData(wrapper.user()));
        this.appendClientbound((ClientboundPacketType)ClientboundPackets1_20_5.START_CONFIGURATION, wrapper -> ((RegistryDataStorage)wrapper.user().get(RegistryDataStorage.class)).clear());
        this.registerClientbound(State.LOGIN, (ClientboundPacketType)ClientboundLoginPackets.HELLO, wrapper -> {
            wrapper.passthrough(Types.STRING);
            wrapper.passthrough(Types.BYTE_ARRAY_PRIMITIVE);
            wrapper.passthrough(Types.BYTE_ARRAY_PRIMITIVE);
            wrapper.read((Type)Types.BOOLEAN);
        });
        this.replaceClientbound((ClientboundPacketType)ClientboundPackets1_20_5.SERVER_DATA, wrapper -> {
            this.translatableRewriter.passthroughAndProcess(wrapper);
            wrapper.passthrough(Types.OPTIONAL_BYTE_ARRAY_PRIMITIVE);
            wrapper.write((Type)Types.BOOLEAN, (Object)((SecureChatStorage)wrapper.user().get(SecureChatStorage.class)).enforcesSecureChat());
        });
        this.registerServerbound((ServerboundPacketType)ServerboundPackets1_20_3.CHAT_COMMAND, (ServerboundPacketType)ServerboundPackets1_20_5.CHAT_COMMAND_SIGNED);
        this.registerClientbound(State.LOGIN, ClientboundLoginPackets.COOKIE_REQUEST.getId(), -1, wrapper -> this.handleCookieRequest(wrapper, (ServerboundPacketType)ServerboundLoginPackets.COOKIE_RESPONSE));
        this.cancelClientbound((ClientboundPacketType)ClientboundConfigurationPackets1_20_5.RESET_CHAT);
        this.registerClientbound((ClientboundPacketType)ClientboundConfigurationPackets1_20_5.COOKIE_REQUEST, null, wrapper -> this.handleCookieRequest(wrapper, (ServerboundPacketType)ServerboundConfigurationPackets1_20_5.COOKIE_RESPONSE));
        this.registerClientbound((ClientboundPacketType)ClientboundConfigurationPackets1_20_5.STORE_COOKIE, null, this::handleStoreCookie);
        this.registerClientbound((ClientboundPacketType)ClientboundConfigurationPackets1_20_5.TRANSFER, null, this::handleTransfer);
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_20_5.COOKIE_REQUEST, null, wrapper -> this.handleCookieRequest(wrapper, (ServerboundPacketType)ServerboundPackets1_20_5.COOKIE_RESPONSE));
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_20_5.STORE_COOKIE, null, this::handleStoreCookie);
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_20_5.TRANSFER, null, this::handleTransfer);
        this.registerClientbound((ClientboundPacketType)ClientboundConfigurationPackets1_20_5.SELECT_KNOWN_PACKS, null, wrapper -> {
            wrapper.cancel();
            PacketWrapper response = wrapper.create((PacketType)ServerboundConfigurationPackets1_20_5.SELECT_KNOWN_PACKS);
            response.write((Type)Types.VAR_INT, (Object)0);
            response.sendToServer(Protocol1_20_5To1_20_3.class);
        });
        CommandRewriter1_19_4<ClientboundPacket1_20_5> commandRewriter = new CommandRewriter1_19_4<ClientboundPacket1_20_5>((Protocol)this){

            public void handleArgument(PacketWrapper wrapper, String argumentType) {
                if (argumentType.equals("minecraft:loot_table") || argumentType.equals("minecraft:loot_predicate") || argumentType.equals("minecraft:loot_modifier")) {
                    wrapper.write((Type)Types.VAR_INT, (Object)0);
                } else {
                    super.handleArgument(wrapper, argumentType);
                }
            }
        };
        this.replaceClientbound((ClientboundPacketType)ClientboundPackets1_20_5.COMMANDS, arg_0 -> ((CommandRewriter1_19_4)commandRewriter).handle1_19(arg_0));
        this.registerClientbound(State.LOGIN, (ClientboundPacketType)ClientboundLoginPackets.LOGIN_FINISHED, wrapper -> {
            wrapper.passthrough(Types.UUID);
            wrapper.passthrough(Types.STRING);
            wrapper.passthrough(Types.PROFILE_PROPERTY_ARRAY);
            wrapper.read((Type)Types.BOOLEAN);
        });
        this.cancelClientbound((ClientboundPacketType)ClientboundPackets1_20_5.PROJECTILE_POWER);
        this.cancelClientbound((ClientboundPacketType)ClientboundPackets1_20_5.DEBUG_SAMPLE);
    }

    private void sendRegistryData(UserConnection connection) {
        RegistryDataStorage registryDataStorage = (RegistryDataStorage)connection.get(RegistryDataStorage.class);
        CompoundTag registryData = registryDataStorage.registryData();
        if (!registryDataStorage.sentRegistryData() && !registryData.isEmpty()) {
            PacketWrapper registryDataPacket = PacketWrapper.create((PacketType)ClientboundConfigurationPackets1_20_3.REGISTRY_DATA, (UserConnection)connection);
            registryDataPacket.write(Types.COMPOUND_TAG, (Object)registryData.copy());
            registryDataPacket.send(Protocol1_20_5To1_20_3.class);
            registryDataStorage.setSentRegistryData();
        }
    }

    private void handleStoreCookie(PacketWrapper wrapper) {
        wrapper.cancel();
        String resourceLocation = (String)wrapper.read(Types.STRING);
        byte[] data = (byte[])wrapper.read(Types.BYTE_ARRAY_PRIMITIVE);
        if (data.length > 5120) {
            throw new IllegalArgumentException("Cookie data too large");
        }
        ((CookieStorage)wrapper.user().get(CookieStorage.class)).cookies().put(resourceLocation, data);
    }

    private void handleCookieRequest(PacketWrapper wrapper, ServerboundPacketType responseType) {
        wrapper.cancel();
        String resourceLocation = (String)wrapper.read(Types.STRING);
        byte[] data = (byte[])((CookieStorage)wrapper.user().get(CookieStorage.class)).cookies().get(resourceLocation);
        PacketWrapper responsePacket = wrapper.create((PacketType)responseType);
        responsePacket.write(Types.STRING, (Object)resourceLocation);
        responsePacket.write(Types.OPTIONAL_BYTE_ARRAY_PRIMITIVE, (Object)data);
        responsePacket.sendToServer(Protocol1_20_5To1_20_3.class);
    }

    private void handleTransfer(PacketWrapper wrapper) {
        wrapper.cancel();
        String host = (String)wrapper.read(Types.STRING);
        int port = (Integer)wrapper.read((Type)Types.VAR_INT);
        ((TransferProvider)Via.getManager().getProviders().get(TransferProvider.class)).connectToServer(wrapper.user(), host, port);
    }

    public void init(UserConnection user) {
        this.addEntityTracker(user, (EntityTracker)new EntityTrackerBase(user, (EntityType)EntityTypes1_20_5.PLAYER));
        user.put((StorableObject)new SecureChatStorage());
        user.put((StorableObject)new CookieStorage());
        user.put((StorableObject)new RegistryDataStorage());
        user.put((StorableObject)new BannerPatternStorage());
        user.put((StorableObject)new ArmorTrimStorage());
    }

    public void register(ViaProviders providers) {
        providers.register(TransferProvider.class, (Provider)TransferProvider.NOOP);
    }

    public BackwardsMappingData getMappingData() {
        return MAPPINGS;
    }

    public EntityPacketRewriter1_20_5 getEntityRewriter() {
        return this.entityRewriter;
    }

    public BlockItemPacketRewriter1_20_5 getItemRewriter() {
        return this.itemRewriter;
    }

    public BlockPacketRewriter1_20_5 getBlockRewriter() {
        return this.blockRewriter;
    }

    public ParticleRewriter<ClientboundPacket1_20_5> getParticleRewriter() {
        return this.particleRewriter;
    }

    public JsonNBTComponentRewriter<ClientboundPacket1_20_5> getComponentRewriter() {
        return this.translatableRewriter;
    }

    public TagRewriter<ClientboundPacket1_20_5> getTagRewriter() {
        return this.tagRewriter;
    }

    public VersionedTypesHolder types() {
        return VersionedTypes.V1_20_5;
    }

    public VersionedTypesHolder mappedTypes() {
        return new Types1_20_3();
    }

    protected PacketTypesProvider<ClientboundPacket1_20_5, ClientboundPacket1_20_3, ServerboundPacket1_20_5, ServerboundPacket1_20_3> createPacketTypesProvider() {
        return new SimplePacketTypesProvider(ProtocolUtil.packetTypeMap((Class)this.unmappedClientboundPacketType, (Class[])new Class[]{ClientboundPackets1_20_5.class, ClientboundConfigurationPackets1_20_5.class}), ProtocolUtil.packetTypeMap((Class)this.mappedClientboundPacketType, (Class[])new Class[]{ClientboundPackets1_20_3.class, ClientboundConfigurationPackets1_20_3.class}), ProtocolUtil.packetTypeMap((Class)this.mappedServerboundPacketType, (Class[])new Class[]{ServerboundPackets1_20_5.class, ServerboundConfigurationPackets1_20_5.class}), ProtocolUtil.packetTypeMap((Class)this.unmappedServerboundPacketType, (Class[])new Class[]{ServerboundPackets1_20_3.class, ServerboundConfigurationPackets1_20_2.class}));
    }
}

