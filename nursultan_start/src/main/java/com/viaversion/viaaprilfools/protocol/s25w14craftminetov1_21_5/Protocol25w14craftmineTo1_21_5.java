/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaaprilfools.protocol.s25w14craftminetov1_21_5.storage.CurrentContainer
 *  com.viaversion.viaversion.api.connection.StorableObject
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.data.version.StructuredDataKeys1_21_5
 *  com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes1_21_5
 *  com.viaversion.viaversion.api.protocol.AbstractProtocol
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.provider.PacketTypesProvider
 *  com.viaversion.viaversion.api.protocol.packet.provider.SimplePacketTypesProvider
 *  com.viaversion.viaversion.api.type.types.version.Types1_20_5
 *  com.viaversion.viaversion.api.type.types.version.VersionedTypes
 *  com.viaversion.viaversion.protocol.shared_registration.RegistrationContext
 *  com.viaversion.viaversion.protocol.shared_registration.def.base.ConfigurationRegistrations
 *  com.viaversion.viaversion.protocols.v1_21_4to1_21_5.packet.ClientboundPacket1_21_5
 *  com.viaversion.viaversion.protocols.v1_21_4to1_21_5.packet.ClientboundPackets1_21_5
 *  com.viaversion.viaversion.protocols.v1_21_4to1_21_5.packet.ServerboundPacket1_21_5
 *  com.viaversion.viaversion.protocols.v1_21_4to1_21_5.packet.ServerboundPackets1_21_5
 *  com.viaversion.viaversion.rewriter.AttributeRewriter
 *  com.viaversion.viaversion.rewriter.ParticleRewriter
 *  com.viaversion.viaversion.rewriter.StatisticsRewriter
 *  com.viaversion.viaversion.rewriter.TagRewriter
 *  com.viaversion.viaversion.util.ProtocolUtil
 */
package com.viaversion.viaaprilfools.protocol.s25w14craftminetov1_21_5;

import com.viaversion.viaaprilfools.api.minecraft.item.StructuredDataKeys25w14craftmine;
import com.viaversion.viaaprilfools.api.types.VAFTypes;
import com.viaversion.viaaprilfools.protocol.s25w14craftminetov1_21_5.data.MappingData25w14craftmine;
import com.viaversion.viaaprilfools.protocol.s25w14craftminetov1_21_5.rewriter.BlockItemPacketRewriter25w14craftmine;
import com.viaversion.viaaprilfools.protocol.s25w14craftminetov1_21_5.rewriter.ComponentRewriter25w14craftmine;
import com.viaversion.viaaprilfools.protocol.s25w14craftminetov1_21_5.rewriter.EntityPacketRewriter25w14craftmine;
import com.viaversion.viaaprilfools.protocol.s25w14craftminetov1_21_5.rewriter.RegistryDataRewriter25w14craftmine;
import com.viaversion.viaaprilfools.protocol.s25w14craftminetov1_21_5.storage.CurrentContainer;
import com.viaversion.viaaprilfools.protocol.v1_21_5to25w14craftmine.packet.ClientboundConfigurationPackets1_21;
import com.viaversion.viaaprilfools.protocol.v1_21_5to25w14craftmine.packet.ClientboundPacket25w14craftmine;
import com.viaversion.viaaprilfools.protocol.v1_21_5to25w14craftmine.packet.ClientboundPackets25w14craftmine;
import com.viaversion.viaaprilfools.protocol.v1_21_5to25w14craftmine.packet.ServerboundConfigurationPackets1_20_5;
import com.viaversion.viaaprilfools.protocol.v1_21_5to25w14craftmine.packet.ServerboundPacket25w14craftmine;
import com.viaversion.viaaprilfools.protocol.v1_21_5to25w14craftmine.packet.ServerboundPackets25w14craftmine;
import com.viaversion.viabackwards.api.BackwardsProtocol;
import com.viaversion.viabackwards.api.rewriters.BackwardsRegistryRewriter;
import com.viaversion.viabackwards.api.rewriters.SoundRewriter;
import com.viaversion.viaversion.api.connection.StorableObject;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.data.version.StructuredDataKeys1_21_5;
import com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes1_21_5;
import com.viaversion.viaversion.api.protocol.AbstractProtocol;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.provider.PacketTypesProvider;
import com.viaversion.viaversion.api.protocol.packet.provider.SimplePacketTypesProvider;
import com.viaversion.viaversion.api.type.types.version.Types1_20_5;
import com.viaversion.viaversion.api.type.types.version.VersionedTypes;
import com.viaversion.viaversion.protocol.shared_registration.RegistrationContext;
import com.viaversion.viaversion.protocol.shared_registration.def.base.ConfigurationRegistrations;
import com.viaversion.viaversion.protocols.v1_21_4to1_21_5.packet.ClientboundPacket1_21_5;
import com.viaversion.viaversion.protocols.v1_21_4to1_21_5.packet.ClientboundPackets1_21_5;
import com.viaversion.viaversion.protocols.v1_21_4to1_21_5.packet.ServerboundPacket1_21_5;
import com.viaversion.viaversion.protocols.v1_21_4to1_21_5.packet.ServerboundPackets1_21_5;
import com.viaversion.viaversion.rewriter.AttributeRewriter;
import com.viaversion.viaversion.rewriter.ParticleRewriter;
import com.viaversion.viaversion.rewriter.StatisticsRewriter;
import com.viaversion.viaversion.rewriter.TagRewriter;
import com.viaversion.viaversion.util.ProtocolUtil;

public final class Protocol25w14craftmineTo1_21_5
extends BackwardsProtocol<ClientboundPacket25w14craftmine, ClientboundPacket1_21_5, ServerboundPacket25w14craftmine, ServerboundPacket1_21_5> {
    public static final MappingData25w14craftmine MAPPINGS = new MappingData25w14craftmine();
    private final EntityPacketRewriter25w14craftmine entityRewriter = new EntityPacketRewriter25w14craftmine(this);
    private final BlockItemPacketRewriter25w14craftmine itemRewriter = new BlockItemPacketRewriter25w14craftmine(this);
    private final ComponentRewriter25w14craftmine translatableRewriter = new ComponentRewriter25w14craftmine(this);
    private final ParticleRewriter<ClientboundPacket25w14craftmine> particleRewriter = new ParticleRewriter((Protocol)this);
    private final TagRewriter<ClientboundPacket25w14craftmine> tagRewriter = new TagRewriter((Protocol)this);
    private final BackwardsRegistryRewriter registryDataRewriter = new RegistryDataRewriter25w14craftmine(this);

    public Protocol25w14craftmineTo1_21_5() {
        super(ClientboundPacket25w14craftmine.class, ClientboundPacket1_21_5.class, ServerboundPacket25w14craftmine.class, ServerboundPacket1_21_5.class);
    }

    protected void registerPackets() {
        super.registerPackets();
        this.tagRewriter.registerGeneric((ClientboundPacketType)ClientboundPackets25w14craftmine.UPDATE_TAGS);
        this.tagRewriter.registerGeneric((ClientboundPacketType)ClientboundConfigurationPackets1_21.UPDATE_TAGS);
        SoundRewriter<ClientboundPacket25w14craftmine> soundRewriter = new SoundRewriter<ClientboundPacket25w14craftmine>(this);
        soundRewriter.registerSound1_19_3(ClientboundPackets25w14craftmine.SOUND);
        soundRewriter.registerSound1_19_3(ClientboundPackets25w14craftmine.SOUND_ENTITY);
        soundRewriter.registerStopSound(ClientboundPackets25w14craftmine.STOP_SOUND);
        new StatisticsRewriter((Protocol)this).register((ClientboundPacketType)ClientboundPackets25w14craftmine.AWARD_STATS);
        new AttributeRewriter((Protocol)this).register1_21((ClientboundPacketType)ClientboundPackets25w14craftmine.UPDATE_ATTRIBUTES);
        this.translatableRewriter.registerComponentPacket(ClientboundPackets25w14craftmine.SET_ACTION_BAR_TEXT);
        this.translatableRewriter.registerComponentPacket(ClientboundPackets25w14craftmine.SET_TITLE_TEXT);
        this.translatableRewriter.registerComponentPacket(ClientboundPackets25w14craftmine.SET_SUBTITLE_TEXT);
        this.translatableRewriter.registerBossEvent(ClientboundPackets25w14craftmine.BOSS_EVENT);
        this.translatableRewriter.registerComponentPacket(ClientboundPackets25w14craftmine.DISCONNECT);
        this.translatableRewriter.registerTabList(ClientboundPackets25w14craftmine.TAB_LIST);
        this.translatableRewriter.registerPlayerCombatKill1_20(ClientboundPackets25w14craftmine.PLAYER_COMBAT_KILL);
        this.translatableRewriter.registerPlayerInfoUpdate1_21_4(ClientboundPackets25w14craftmine.PLAYER_INFO_UPDATE);
        this.translatableRewriter.registerComponentPacket(ClientboundPackets25w14craftmine.SYSTEM_CHAT);
        this.translatableRewriter.registerDisguisedChat(ClientboundPackets25w14craftmine.DISGUISED_CHAT);
        this.translatableRewriter.registerPlayerChat1_21_5(ClientboundPackets25w14craftmine.PLAYER_CHAT);
        this.translatableRewriter.registerLoginDisconnect();
        this.particleRewriter.registerLevelParticles1_21_4((ClientboundPacketType)ClientboundPackets25w14craftmine.LEVEL_PARTICLES);
        this.particleRewriter.registerExplode1_21_2((ClientboundPacketType)ClientboundPackets25w14craftmine.EXPLODE);
        this.registerClientbound(ClientboundConfigurationPackets1_21.REGISTRY_DATA, arg_0 -> ((BackwardsRegistryRewriter)this.registryDataRewriter).handle(arg_0));
        this.cancelClientbound(ClientboundPackets25w14craftmine.CHANGE_DIMENSION_TYPE);
        this.cancelClientbound(ClientboundPackets25w14craftmine.OPEN_DOOR);
        this.cancelClientbound(ClientboundPackets25w14craftmine.UPDATE_PLAYER_UNLOCKS);
        this.cancelClientbound(ClientboundPackets25w14craftmine.UPDATE_UNLOCKED_EFFECTS);
    }

    public void init(UserConnection connection) {
        this.addEntityTracker(connection);
        this.addItemHasher(connection);
        connection.put((StorableObject)new CurrentContainer());
    }

    @Override
    protected void applySharedRegistrations() {
        super.applySharedRegistrations();
        ConfigurationRegistrations.registerConfigurationStateSwitching((RegistrationContext)new RegistrationContext((AbstractProtocol)this, this.getClientVersion(), null));
    }

    @Override
    public MappingData25w14craftmine getMappingData() {
        return MAPPINGS;
    }

    public EntityPacketRewriter25w14craftmine getEntityRewriter() {
        return this.entityRewriter;
    }

    public BlockItemPacketRewriter25w14craftmine getItemRewriter() {
        return this.itemRewriter;
    }

    public ComponentRewriter25w14craftmine getComponentRewriter() {
        return this.translatableRewriter;
    }

    @Override
    public BackwardsRegistryRewriter getRegistryDataRewriter() {
        return this.registryDataRewriter;
    }

    public ParticleRewriter<ClientboundPacket25w14craftmine> getParticleRewriter() {
        return this.particleRewriter;
    }

    public TagRewriter<ClientboundPacket25w14craftmine> getTagRewriter() {
        return this.tagRewriter;
    }

    public Types1_20_5<StructuredDataKeys25w14craftmine, EntityDataTypes1_21_5> types() {
        return VAFTypes.V25W14CRAFTMINE;
    }

    public Types1_20_5<StructuredDataKeys1_21_5, EntityDataTypes1_21_5> mappedTypes() {
        return VersionedTypes.V1_21_5;
    }

    protected PacketTypesProvider<ClientboundPacket25w14craftmine, ClientboundPacket1_21_5, ServerboundPacket25w14craftmine, ServerboundPacket1_21_5> createPacketTypesProvider() {
        return new SimplePacketTypesProvider(ProtocolUtil.packetTypeMap((Class)this.unmappedClientboundPacketType, (Class[])new Class[]{ClientboundPackets25w14craftmine.class, ClientboundConfigurationPackets1_21.class}), ProtocolUtil.packetTypeMap((Class)this.mappedClientboundPacketType, (Class[])new Class[]{ClientboundPackets1_21_5.class, ClientboundConfigurationPackets1_21.class}), ProtocolUtil.packetTypeMap((Class)this.mappedServerboundPacketType, (Class[])new Class[]{ServerboundPackets25w14craftmine.class, ServerboundConfigurationPackets1_20_5.class}), ProtocolUtil.packetTypeMap((Class)this.unmappedServerboundPacketType, (Class[])new Class[]{ServerboundPackets1_21_5.class, ServerboundConfigurationPackets1_20_5.class}));
    }
}

