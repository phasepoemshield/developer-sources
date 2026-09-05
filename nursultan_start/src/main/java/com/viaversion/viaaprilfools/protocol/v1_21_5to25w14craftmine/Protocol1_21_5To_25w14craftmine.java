/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.data.MappingData
 *  com.viaversion.viaversion.api.minecraft.data.StructuredDataKey
 *  com.viaversion.viaversion.api.protocol.AbstractProtocol
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.provider.PacketTypesProvider
 *  com.viaversion.viaversion.api.protocol.packet.provider.SimplePacketTypesProvider
 *  com.viaversion.viaversion.api.type.types.misc.ParticleType$Fillers
 *  com.viaversion.viaversion.api.type.types.version.VersionedTypes
 *  com.viaversion.viaversion.api.type.types.version.VersionedTypesHolder
 *  com.viaversion.viaversion.protocol.shared_registration.RegistrationContext
 *  com.viaversion.viaversion.protocol.shared_registration.def.base.ConfigurationRegistrations
 *  com.viaversion.viaversion.protocols.v1_21_4to1_21_5.packet.ClientboundPacket1_21_5
 *  com.viaversion.viaversion.protocols.v1_21_4to1_21_5.packet.ClientboundPackets1_21_5
 *  com.viaversion.viaversion.protocols.v1_21_4to1_21_5.packet.ServerboundPacket1_21_5
 *  com.viaversion.viaversion.protocols.v1_21_4to1_21_5.packet.ServerboundPackets1_21_5
 *  com.viaversion.viaversion.rewriter.AttributeRewriter
 *  com.viaversion.viaversion.rewriter.ParticleRewriter
 *  com.viaversion.viaversion.rewriter.RegistryDataRewriter
 *  com.viaversion.viaversion.rewriter.SoundRewriter
 *  com.viaversion.viaversion.rewriter.StatisticsRewriter
 *  com.viaversion.viaversion.rewriter.TagRewriter
 *  com.viaversion.viaversion.rewriter.text.NBTComponentRewriter
 *  com.viaversion.viaversion.util.ProtocolUtil
 */
package com.viaversion.viaaprilfools.protocol.v1_21_5to25w14craftmine;

import com.viaversion.viaaprilfools.api.data.VAFMappingData;
import com.viaversion.viaaprilfools.api.minecraft.entities.EntityTypes25w14craftmine;
import com.viaversion.viaaprilfools.api.minecraft.item.StructuredDataKeys25w14craftmine;
import com.viaversion.viaaprilfools.api.types.VAFTypes;
import com.viaversion.viaaprilfools.protocol.v1_21_5to25w14craftmine.packet.ClientboundConfigurationPackets1_21;
import com.viaversion.viaaprilfools.protocol.v1_21_5to25w14craftmine.packet.ClientboundPacket25w14craftmine;
import com.viaversion.viaaprilfools.protocol.v1_21_5to25w14craftmine.packet.ClientboundPackets25w14craftmine;
import com.viaversion.viaaprilfools.protocol.v1_21_5to25w14craftmine.packet.ServerboundConfigurationPackets1_20_5;
import com.viaversion.viaaprilfools.protocol.v1_21_5to25w14craftmine.packet.ServerboundPacket25w14craftmine;
import com.viaversion.viaaprilfools.protocol.v1_21_5to25w14craftmine.packet.ServerboundPackets25w14craftmine;
import com.viaversion.viaaprilfools.protocol.v1_21_5to25w14craftmine.rewriter.BlockItemPacketRewriter25w14craftmine;
import com.viaversion.viaaprilfools.protocol.v1_21_5to25w14craftmine.rewriter.ComponentRewriter25w14craftmine;
import com.viaversion.viaaprilfools.protocol.v1_21_5to25w14craftmine.rewriter.EntityPacketRewriter25w14craftmine;
import com.viaversion.viaaprilfools.protocol.v1_21_5to25w14craftmine.rewriter.RegistryDataRewriter25w14craftmine;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.data.MappingData;
import com.viaversion.viaversion.api.minecraft.data.StructuredDataKey;
import com.viaversion.viaversion.api.protocol.AbstractProtocol;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.provider.PacketTypesProvider;
import com.viaversion.viaversion.api.protocol.packet.provider.SimplePacketTypesProvider;
import com.viaversion.viaversion.api.type.types.misc.ParticleType;
import com.viaversion.viaversion.api.type.types.version.VersionedTypes;
import com.viaversion.viaversion.api.type.types.version.VersionedTypesHolder;
import com.viaversion.viaversion.protocol.shared_registration.RegistrationContext;
import com.viaversion.viaversion.protocol.shared_registration.def.base.ConfigurationRegistrations;
import com.viaversion.viaversion.protocols.v1_21_4to1_21_5.packet.ClientboundPacket1_21_5;
import com.viaversion.viaversion.protocols.v1_21_4to1_21_5.packet.ClientboundPackets1_21_5;
import com.viaversion.viaversion.protocols.v1_21_4to1_21_5.packet.ServerboundPacket1_21_5;
import com.viaversion.viaversion.protocols.v1_21_4to1_21_5.packet.ServerboundPackets1_21_5;
import com.viaversion.viaversion.rewriter.AttributeRewriter;
import com.viaversion.viaversion.rewriter.ParticleRewriter;
import com.viaversion.viaversion.rewriter.RegistryDataRewriter;
import com.viaversion.viaversion.rewriter.SoundRewriter;
import com.viaversion.viaversion.rewriter.StatisticsRewriter;
import com.viaversion.viaversion.rewriter.TagRewriter;
import com.viaversion.viaversion.rewriter.text.NBTComponentRewriter;
import com.viaversion.viaversion.util.ProtocolUtil;

public final class Protocol1_21_5To_25w14craftmine
extends AbstractProtocol<ClientboundPacket1_21_5, ClientboundPacket25w14craftmine, ServerboundPacket1_21_5, ServerboundPacket25w14craftmine> {
    public static final MappingData MAPPINGS = new VAFMappingData("1.21.5", "25w14craftmine");
    private final EntityPacketRewriter25w14craftmine entityRewriter = new EntityPacketRewriter25w14craftmine(this);
    private final BlockItemPacketRewriter25w14craftmine itemRewriter = new BlockItemPacketRewriter25w14craftmine(this);
    private final ParticleRewriter<ClientboundPacket1_21_5> particleRewriter = new ParticleRewriter((Protocol)this);
    private final TagRewriter<ClientboundPacket1_21_5> tagRewriter = new TagRewriter((Protocol)this);
    private final NBTComponentRewriter<ClientboundPacket1_21_5> componentRewriter = new ComponentRewriter25w14craftmine(this);
    private final RegistryDataRewriter registryDataRewriter = new RegistryDataRewriter25w14craftmine((Protocol<?, ?, ?, ?>)this);

    public Protocol1_21_5To_25w14craftmine() {
        super(ClientboundPacket1_21_5.class, ClientboundPacket25w14craftmine.class, ServerboundPacket1_21_5.class, ServerboundPacket25w14craftmine.class);
    }

    protected void registerPackets() {
        super.registerPackets();
        this.tagRewriter.registerGeneric((ClientboundPacketType)ClientboundPackets1_21_5.UPDATE_TAGS);
        this.tagRewriter.registerGeneric((ClientboundPacketType)ClientboundConfigurationPackets1_21.UPDATE_TAGS);
        this.componentRewriter.registerComponentPacket((ClientboundPacketType)ClientboundPackets1_21_5.SET_ACTION_BAR_TEXT);
        this.componentRewriter.registerComponentPacket((ClientboundPacketType)ClientboundPackets1_21_5.SET_TITLE_TEXT);
        this.componentRewriter.registerComponentPacket((ClientboundPacketType)ClientboundPackets1_21_5.SET_SUBTITLE_TEXT);
        this.componentRewriter.registerBossEvent((ClientboundPacketType)ClientboundPackets1_21_5.BOSS_EVENT);
        this.componentRewriter.registerComponentPacket((ClientboundPacketType)ClientboundPackets1_21_5.DISCONNECT);
        this.componentRewriter.registerTabList((ClientboundPacketType)ClientboundPackets1_21_5.TAB_LIST);
        this.componentRewriter.registerPlayerCombatKill1_20((ClientboundPacketType)ClientboundPackets1_21_5.PLAYER_COMBAT_KILL);
        this.componentRewriter.registerPlayerInfoUpdate1_21_4((ClientboundPacketType)ClientboundPackets1_21_5.PLAYER_INFO_UPDATE);
        this.componentRewriter.registerComponentPacket((ClientboundPacketType)ClientboundPackets1_21_5.SYSTEM_CHAT);
        this.componentRewriter.registerDisguisedChat((ClientboundPacketType)ClientboundPackets1_21_5.DISGUISED_CHAT);
        this.componentRewriter.registerPlayerChat1_21_5((ClientboundPacketType)ClientboundPackets1_21_5.PLAYER_CHAT);
        this.componentRewriter.registerLoginDisconnect();
        this.particleRewriter.registerLevelParticles1_21_4((ClientboundPacketType)ClientboundPackets1_21_5.LEVEL_PARTICLES);
        this.particleRewriter.registerExplode1_21_2((ClientboundPacketType)ClientboundPackets1_21_5.EXPLODE);
        SoundRewriter soundRewriter = new SoundRewriter((Protocol)this);
        soundRewriter.registerSound1_19_3((ClientboundPacketType)ClientboundPackets1_21_5.SOUND);
        soundRewriter.registerSound1_19_3((ClientboundPacketType)ClientboundPackets1_21_5.SOUND_ENTITY);
        new StatisticsRewriter((Protocol)this).register((ClientboundPacketType)ClientboundPackets1_21_5.AWARD_STATS);
        new AttributeRewriter((Protocol)this).register1_21((ClientboundPacketType)ClientboundPackets1_21_5.UPDATE_ATTRIBUTES);
        this.registerClientbound(ClientboundConfigurationPackets1_21.REGISTRY_DATA, arg_0 -> ((RegistryDataRewriter)this.registryDataRewriter).handle(arg_0));
        this.cancelServerbound(ServerboundPackets25w14craftmine.PLAYER_BUY_UNLOCK);
        this.cancelServerbound(ServerboundPackets25w14craftmine.PLAYER_DONATE_EXPERIENCE);
        this.cancelServerbound(ServerboundPackets25w14craftmine.PLAYER_REACTIVATE_UNLOCK);
    }

    protected void onMappingDataLoaded() {
        EntityTypes25w14craftmine.initialize(this);
        ParticleType.Fillers.fill1_21_4((Protocol)this);
        VAFTypes.V25W14CRAFTMINE.structuredData.filler((Protocol)this).add(new StructuredDataKey[]{StructuredDataKey.CUSTOM_DATA, StructuredDataKey.MAX_STACK_SIZE, StructuredDataKeys25w14craftmine.ITEM_EXCHANGE_VALUE, StructuredDataKey.MAX_DAMAGE, StructuredDataKey.UNBREAKABLE1_21_5, StructuredDataKeys25w14craftmine.WORLD_EFFECT_UNLOCK, StructuredDataKeys25w14craftmine.WORLD_EFFECT_HINT, StructuredDataKeys25w14craftmine.MINE_ACTIVE, StructuredDataKeys25w14craftmine.SPECIAL_MINE, StructuredDataKeys25w14craftmine.MINE_COMPLETED, StructuredDataKey.RARITY, StructuredDataKey.TOOLTIP_DISPLAY, StructuredDataKey.DAMAGE_RESISTANT1_21_2, StructuredDataKey.CUSTOM_NAME, StructuredDataKey.LORE, StructuredDataKey.ENCHANTMENTS1_21_5, StructuredDataKeys25w14craftmine.MOB_TROPHY_TYPE, StructuredDataKey.CUSTOM_MODEL_DATA1_21_4, StructuredDataKey.BLOCKS_ATTACKS1_21_5, StructuredDataKey.PROVIDES_BANNER_PATTERNS1_21_5, StructuredDataKey.REPAIR_COST, StructuredDataKey.CREATIVE_SLOT_LOCK, StructuredDataKey.ENCHANTMENT_GLINT_OVERRIDE, StructuredDataKey.INTANGIBLE_PROJECTILE, StructuredDataKey.STORED_ENCHANTMENTS1_21_5, StructuredDataKey.DYED_COLOR1_21_5, StructuredDataKey.MAP_COLOR, StructuredDataKey.MAP_ID, StructuredDataKey.MAP_DECORATIONS, StructuredDataKey.MAP_POST_PROCESSING, StructuredDataKey.POTION_CONTENTS1_21_2, StructuredDataKey.SUSPICIOUS_STEW_EFFECTS, StructuredDataKey.WRITABLE_BOOK_CONTENT, StructuredDataKey.WRITTEN_BOOK_CONTENT, StructuredDataKey.TRIM1_21_5, StructuredDataKey.DEBUG_STICK_STATE, StructuredDataKey.ENTITY_DATA1_20_5, StructuredDataKey.BUCKET_ENTITY_DATA, StructuredDataKey.BLOCK_ENTITY_DATA1_20_5, StructuredDataKey.INSTRUMENT1_21_5, StructuredDataKeys25w14craftmine.WORLD_MODIFIERS, StructuredDataKeys25w14craftmine.DIMENSION_ID, StructuredDataKeys25w14craftmine.SKY, StructuredDataKeys25w14craftmine.TROPHY_TYPE, StructuredDataKey.RECIPES, StructuredDataKeys25w14craftmine.LODESTONE_TRACKER, StructuredDataKey.FIREWORK_EXPLOSION, StructuredDataKey.FIREWORKS, StructuredDataKey.PROFILE1_20_5, StructuredDataKey.NOTE_BLOCK_SOUND, StructuredDataKey.BANNER_PATTERNS, StructuredDataKey.BASE_COLOR, StructuredDataKey.POT_DECORATIONS, StructuredDataKey.BLOCK_STATE, StructuredDataKey.BEES1_20_5, StructuredDataKey.LOCK1_20_5, StructuredDataKey.CONTAINER_LOOT, StructuredDataKey.TOOL1_21_5, StructuredDataKey.ITEM_NAME, StructuredDataKey.OMINOUS_BOTTLE_AMPLIFIER, StructuredDataKey.FOOD1_21_2, StructuredDataKey.JUKEBOX_PLAYABLE1_21_5, StructuredDataKey.ATTRIBUTE_MODIFIERS1_21_5, StructuredDataKey.REPAIRABLE, StructuredDataKey.ENCHANTABLE, StructuredDataKey.CONSUMABLE1_21_2, StructuredDataKey.USE_COOLDOWN, StructuredDataKey.DAMAGE, StructuredDataKey.EQUIPPABLE1_21_5, StructuredDataKey.ITEM_MODEL, StructuredDataKey.GLIDER, StructuredDataKey.TOOLTIP_STYLE, StructuredDataKey.DEATH_PROTECTION, StructuredDataKey.WEAPON, StructuredDataKey.POTION_DURATION_SCALE, StructuredDataKey.VILLAGER_VARIANT, StructuredDataKey.WOLF_VARIANT, StructuredDataKey.WOLF_COLLAR, StructuredDataKey.FOX_VARIANT, StructuredDataKey.SALMON_SIZE, StructuredDataKey.PARROT_VARIANT, StructuredDataKey.TROPICAL_FISH_PATTERN, StructuredDataKey.TROPICAL_FISH_BASE_COLOR, StructuredDataKey.TROPICAL_FISH_PATTERN_COLOR, StructuredDataKey.MOOSHROOM_VARIANT, StructuredDataKey.RABBIT_VARIANT, StructuredDataKey.PIG_VARIANT, StructuredDataKey.FROG_VARIANT, StructuredDataKey.HORSE_VARIANT, StructuredDataKey.PAINTING_VARIANT, StructuredDataKey.LLAMA_VARIANT, StructuredDataKey.AXOLOTL_VARIANT, StructuredDataKey.CAT_VARIANT, StructuredDataKey.CAT_COLLAR, StructuredDataKey.SHEEP_COLOR, StructuredDataKey.SHULKER_COLOR, StructuredDataKey.PROVIDES_TRIM_MATERIAL1_21_5, StructuredDataKey.BREAK_SOUND, StructuredDataKeys25w14craftmine.ROOM, StructuredDataKey.COW_VARIANT, StructuredDataKey.CHICKEN_VARIANT1_21_5, StructuredDataKey.WOLF_SOUND_VARIANT});
        super.onMappingDataLoaded();
    }

    public void init(UserConnection connection) {
        this.addEntityTracker(connection);
        this.addItemHasher(connection);
    }

    protected void applySharedRegistrations() {
        super.applySharedRegistrations();
        ConfigurationRegistrations.registerConfigurationStateSwitching((RegistrationContext)new RegistrationContext((AbstractProtocol)this, this.getClientVersion(), null));
    }

    public MappingData getMappingData() {
        return MAPPINGS;
    }

    public EntityPacketRewriter25w14craftmine getEntityRewriter() {
        return this.entityRewriter;
    }

    public BlockItemPacketRewriter25w14craftmine getItemRewriter() {
        return this.itemRewriter;
    }

    public RegistryDataRewriter getRegistryDataRewriter() {
        return this.registryDataRewriter;
    }

    public ParticleRewriter<ClientboundPacket1_21_5> getParticleRewriter() {
        return this.particleRewriter;
    }

    public TagRewriter<ClientboundPacket1_21_5> getTagRewriter() {
        return this.tagRewriter;
    }

    public NBTComponentRewriter<ClientboundPacket1_21_5> getComponentRewriter() {
        return this.componentRewriter;
    }

    public VersionedTypesHolder types() {
        return VersionedTypes.V1_21_5;
    }

    public VersionedTypesHolder mappedTypes() {
        return VAFTypes.V25W14CRAFTMINE;
    }

    protected PacketTypesProvider<ClientboundPacket1_21_5, ClientboundPacket25w14craftmine, ServerboundPacket1_21_5, ServerboundPacket25w14craftmine> createPacketTypesProvider() {
        return new SimplePacketTypesProvider(ProtocolUtil.packetTypeMap((Class)this.unmappedClientboundPacketType, (Class[])new Class[]{ClientboundPackets1_21_5.class, ClientboundConfigurationPackets1_21.class}), ProtocolUtil.packetTypeMap((Class)this.mappedClientboundPacketType, (Class[])new Class[]{ClientboundPackets25w14craftmine.class, ClientboundConfigurationPackets1_21.class}), ProtocolUtil.packetTypeMap((Class)this.mappedServerboundPacketType, (Class[])new Class[]{ServerboundPackets1_21_5.class, ServerboundConfigurationPackets1_20_5.class}), ProtocolUtil.packetTypeMap((Class)this.unmappedServerboundPacketType, (Class[])new Class[]{ServerboundPackets25w14craftmine.class, ServerboundConfigurationPackets1_20_5.class}));
    }
}

