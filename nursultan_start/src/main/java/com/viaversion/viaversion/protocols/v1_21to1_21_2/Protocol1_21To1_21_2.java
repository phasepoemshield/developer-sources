/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viaversion.api.connection.StorableObject
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.data.MappingData
 *  com.viaversion.viaversion.api.data.MappingDataBase
 *  com.viaversion.viaversion.api.data.entity.EntityTracker
 *  com.viaversion.viaversion.api.minecraft.RegistryEntry
 *  com.viaversion.viaversion.api.minecraft.data.StructuredDataKey
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_21_2
 *  com.viaversion.viaversion.api.protocol.AbstractProtocol
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.State
 *  com.viaversion.viaversion.api.protocol.packet.provider.PacketTypesProvider
 *  com.viaversion.viaversion.api.protocol.packet.provider.SimplePacketTypesProvider
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.chunk.ChunkType1_20_2
 *  com.viaversion.viaversion.api.type.types.misc.ParticleType$Fillers
 *  com.viaversion.viaversion.api.type.types.version.VersionedTypes
 *  com.viaversion.viaversion.api.type.types.version.VersionedTypesHolder
 *  com.viaversion.viaversion.libs.fastutil.ints.Int2ObjectOpenHashMap
 *  com.viaversion.viaversion.protocols.base.ClientboundLoginPackets
 *  com.viaversion.viaversion.protocols.v1_21to1_21_2.packet.ClientboundPackets1_21_2
 *  com.viaversion.viaversion.protocols.v1_21to1_21_2.packet.ServerboundPacket1_21_2
 *  com.viaversion.viaversion.protocols.v1_21to1_21_2.packet.ServerboundPackets1_21_2
 *  com.viaversion.viaversion.protocols.v1_21to1_21_2.rewriter.BlockItemPacketRewriter1_21_2
 *  com.viaversion.viaversion.protocols.v1_21to1_21_2.rewriter.ComponentRewriter1_21_2
 *  com.viaversion.viaversion.protocols.v1_21to1_21_2.rewriter.EntityPacketRewriter1_21_2
 *  com.viaversion.viaversion.protocols.v1_21to1_21_2.rewriter.ParticleRewriter1_21_2
 *  com.viaversion.viaversion.protocols.v1_21to1_21_2.storage.BundleStateTracker
 *  com.viaversion.viaversion.protocols.v1_21to1_21_2.storage.ChunkLoadTracker
 *  com.viaversion.viaversion.protocols.v1_21to1_21_2.storage.EntityTracker1_21_2
 *  com.viaversion.viaversion.protocols.v1_21to1_21_2.storage.GroundFlagTracker
 *  com.viaversion.viaversion.protocols.v1_21to1_21_2.storage.LastExplosionPowerStorage
 *  com.viaversion.viaversion.protocols.v1_21to1_21_2.storage.PlayerPositionStorage
 *  com.viaversion.viaversion.protocols.v1_21to1_21_2.storage.TeleportAckCancelStorage
 *  com.viaversion.viaversion.rewriter.BlockRewriter
 *  com.viaversion.viaversion.rewriter.RegistryDataRewriter
 *  com.viaversion.viaversion.rewriter.SoundRewriter
 *  com.viaversion.viaversion.rewriter.TagRewriter
 *  com.viaversion.viaversion.util.ProtocolUtil
 */
package com.viaversion.viaversion.protocols.v1_21to1_21_2;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.Tag;
import com.viaversion.viaversion.api.connection.StorableObject;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.data.MappingData;
import com.viaversion.viaversion.api.data.MappingDataBase;
import com.viaversion.viaversion.api.data.entity.EntityTracker;
import com.viaversion.viaversion.api.minecraft.RegistryEntry;
import com.viaversion.viaversion.api.minecraft.data.StructuredDataKey;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_21_2;
import com.viaversion.viaversion.api.protocol.AbstractProtocol;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.State;
import com.viaversion.viaversion.api.protocol.packet.provider.PacketTypesProvider;
import com.viaversion.viaversion.api.protocol.packet.provider.SimplePacketTypesProvider;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.chunk.ChunkType1_20_2;
import com.viaversion.viaversion.api.type.types.misc.ParticleType;
import com.viaversion.viaversion.api.type.types.version.VersionedTypes;
import com.viaversion.viaversion.api.type.types.version.VersionedTypesHolder;
import com.viaversion.viaversion.libs.fastutil.ints.Int2ObjectOpenHashMap;
import com.viaversion.viaversion.protocols.base.ClientboundLoginPackets;
import com.viaversion.viaversion.protocols.v1_20_3to1_20_5.packet.ServerboundConfigurationPackets1_20_5;
import com.viaversion.viaversion.protocols.v1_20_3to1_20_5.packet.ServerboundPacket1_20_5;
import com.viaversion.viaversion.protocols.v1_20_3to1_20_5.packet.ServerboundPackets1_20_5;
import com.viaversion.viaversion.protocols.v1_20_5to1_21.packet.ClientboundConfigurationPackets1_21;
import com.viaversion.viaversion.protocols.v1_20_5to1_21.packet.ClientboundPacket1_21;
import com.viaversion.viaversion.protocols.v1_20_5to1_21.packet.ClientboundPackets1_21;
import com.viaversion.viaversion.protocols.v1_21to1_21_2.packet.ClientboundPacket1_21_2;
import com.viaversion.viaversion.protocols.v1_21to1_21_2.packet.ClientboundPackets1_21_2;
import com.viaversion.viaversion.protocols.v1_21to1_21_2.packet.ServerboundPacket1_21_2;
import com.viaversion.viaversion.protocols.v1_21to1_21_2.packet.ServerboundPackets1_21_2;
import com.viaversion.viaversion.protocols.v1_21to1_21_2.rewriter.BlockItemPacketRewriter1_21_2;
import com.viaversion.viaversion.protocols.v1_21to1_21_2.rewriter.ComponentRewriter1_21_2;
import com.viaversion.viaversion.protocols.v1_21to1_21_2.rewriter.EntityPacketRewriter1_21_2;
import com.viaversion.viaversion.protocols.v1_21to1_21_2.rewriter.ParticleRewriter1_21_2;
import com.viaversion.viaversion.protocols.v1_21to1_21_2.storage.BundleStateTracker;
import com.viaversion.viaversion.protocols.v1_21to1_21_2.storage.ChunkLoadTracker;
import com.viaversion.viaversion.protocols.v1_21to1_21_2.storage.EntityTracker1_21_2;
import com.viaversion.viaversion.protocols.v1_21to1_21_2.storage.GroundFlagTracker;
import com.viaversion.viaversion.protocols.v1_21to1_21_2.storage.LastExplosionPowerStorage;
import com.viaversion.viaversion.protocols.v1_21to1_21_2.storage.PlayerPositionStorage;
import com.viaversion.viaversion.protocols.v1_21to1_21_2.storage.TeleportAckCancelStorage;
import com.viaversion.viaversion.rewriter.BlockRewriter;
import com.viaversion.viaversion.rewriter.RegistryDataRewriter;
import com.viaversion.viaversion.rewriter.SoundRewriter;
import com.viaversion.viaversion.rewriter.TagRewriter;
import com.viaversion.viaversion.util.ProtocolUtil;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class Protocol1_21To1_21_2
extends AbstractProtocol<ClientboundPacket1_21, ClientboundPacket1_21_2, ServerboundPacket1_20_5, ServerboundPacket1_21_2> {
    public static final MappingData MAPPINGS = new MappingDataBase("1.21", "1.21.2");
    private final EntityPacketRewriter1_21_2 entityRewriter = new EntityPacketRewriter1_21_2(this);
    private final BlockItemPacketRewriter1_21_2 itemRewriter = new BlockItemPacketRewriter1_21_2(this);
    private final ParticleRewriter1_21_2 particleRewriter = new ParticleRewriter1_21_2((Protocol)this);
    private final TagRewriter<ClientboundPacket1_21> tagRewriter = new TagRewriter((Protocol)this);
    private final ComponentRewriter1_21_2 componentRewriter = new ComponentRewriter1_21_2(this);
    private final SoundRewriter<ClientboundPacket1_21> soundRewriter = new SoundRewriter((Protocol)this);
    private final BlockRewriter<ClientboundPacket1_21> blockRewriter = BlockRewriter.for1_20_2((Protocol)this, ChunkType1_20_2::new);
    private final RegistryDataRewriter registryDataRewriter = this.registryDataRewriter();

    public VersionedTypesHolder types() {
        return VersionedTypes.V1_21;
    }

    public Protocol1_21To1_21_2() {
        super(ClientboundPacket1_21.class, ClientboundPacket1_21_2.class, ServerboundPacket1_20_5.class, ServerboundPacket1_21_2.class);
    }

    public void init(UserConnection connection) {
        ProtocolVersion protocolVersion;
        this.addEntityTracker(connection, (EntityTracker)new EntityTracker1_21_2(connection));
        connection.put((StorableObject)new BundleStateTracker());
        connection.put((StorableObject)new GroundFlagTracker());
        connection.put((StorableObject)new TeleportAckCancelStorage());
        if (connection.getProtocolInfo().protocolVersion().newerThanOrEqualTo(ProtocolVersion.v1_21_9)) {
            connection.put((StorableObject)new LastExplosionPowerStorage());
        }
        if ((protocolVersion = connection.getProtocolInfo().protocolVersion()).olderThan(ProtocolVersion.v1_21_4)) {
            connection.put((StorableObject)new PlayerPositionStorage());
        }
        if (protocolVersion.equals((Object)ProtocolVersion.v1_21_2)) {
            connection.put((StorableObject)new ChunkLoadTracker());
        }
    }

    private RegistryDataRewriter registryDataRewriter() {
        CompoundTag enderpearlData = new CompoundTag();
        enderpearlData.putString("scaling", "when_caused_by_living_non_player");
        enderpearlData.putString("message_id", "fall");
        enderpearlData.putFloat("exhaustion", 0.0f);
        CompoundTag maceSmashData = new CompoundTag();
        maceSmashData.putString("scaling", "when_caused_by_living_non_player");
        maceSmashData.putString("message_id", "mace_smash");
        maceSmashData.putFloat("exhaustion", 0.1f);
        RegistryDataRewriter registryDataRewriter = new RegistryDataRewriter((Protocol)this);
        registryDataRewriter.addEntries("damage_type", new RegistryEntry[]{new RegistryEntry("minecraft:ender_pearl", (Tag)enderpearlData), new RegistryEntry("minecraft:mace_smash", (Tag)maceSmashData)});
        registryDataRewriter.addEnchantmentEffectRewriter("damage_item", tag -> tag.putString("type", "change_item_damage"));
        return registryDataRewriter;
    }

    public RegistryDataRewriter getRegistryDataRewriter() {
        return this.registryDataRewriter;
    }

    public ComponentRewriter1_21_2 getComponentRewriter() {
        return this.componentRewriter;
    }

    protected void onMappingDataLoaded() {
        EntityTypes1_21_2.initialize((Protocol)this);
        ParticleType.Fillers.fill1_21_2((Protocol)this);
        VersionedTypes.V1_21_2.structuredData.filler((Protocol)this).add(new StructuredDataKey[]{StructuredDataKey.CUSTOM_DATA, StructuredDataKey.MAX_STACK_SIZE, StructuredDataKey.MAX_DAMAGE, StructuredDataKey.UNBREAKABLE1_20_5, StructuredDataKey.RARITY, StructuredDataKey.HIDE_TOOLTIP, StructuredDataKey.DAMAGE_RESISTANT1_21_2, StructuredDataKey.CUSTOM_NAME, StructuredDataKey.LORE, StructuredDataKey.ENCHANTMENTS1_20_5, StructuredDataKey.CAN_PLACE_ON1_20_5, StructuredDataKey.CAN_BREAK1_20_5, StructuredDataKey.CUSTOM_MODEL_DATA1_20_5, StructuredDataKey.HIDE_ADDITIONAL_TOOLTIP, StructuredDataKey.REPAIR_COST, StructuredDataKey.CREATIVE_SLOT_LOCK, StructuredDataKey.ENCHANTMENT_GLINT_OVERRIDE, StructuredDataKey.INTANGIBLE_PROJECTILE, StructuredDataKey.STORED_ENCHANTMENTS1_20_5, StructuredDataKey.DYED_COLOR1_20_5, StructuredDataKey.MAP_COLOR, StructuredDataKey.MAP_ID, StructuredDataKey.MAP_DECORATIONS, StructuredDataKey.MAP_POST_PROCESSING, StructuredDataKey.POTION_CONTENTS1_21_2, StructuredDataKey.SUSPICIOUS_STEW_EFFECTS, StructuredDataKey.WRITABLE_BOOK_CONTENT, StructuredDataKey.WRITTEN_BOOK_CONTENT, StructuredDataKey.TRIM1_21_2, StructuredDataKey.DEBUG_STICK_STATE, StructuredDataKey.ENTITY_DATA1_20_5, StructuredDataKey.BUCKET_ENTITY_DATA, StructuredDataKey.BLOCK_ENTITY_DATA1_20_5, StructuredDataKey.INSTRUMENT1_21_2, StructuredDataKey.RECIPES, StructuredDataKey.LODESTONE_TRACKER, StructuredDataKey.FIREWORK_EXPLOSION, StructuredDataKey.FIREWORKS, StructuredDataKey.PROFILE1_20_5, StructuredDataKey.NOTE_BLOCK_SOUND, StructuredDataKey.BANNER_PATTERNS, StructuredDataKey.BASE_COLOR, StructuredDataKey.POT_DECORATIONS, StructuredDataKey.BLOCK_STATE, StructuredDataKey.BEES1_20_5, StructuredDataKey.LOCK1_21_2, StructuredDataKey.CONTAINER_LOOT, StructuredDataKey.TOOL1_20_5, StructuredDataKey.ITEM_NAME, StructuredDataKey.OMINOUS_BOTTLE_AMPLIFIER, StructuredDataKey.FOOD1_21_2, StructuredDataKey.JUKEBOX_PLAYABLE1_21, StructuredDataKey.ATTRIBUTE_MODIFIERS1_21, StructuredDataKey.REPAIRABLE, StructuredDataKey.ENCHANTABLE, StructuredDataKey.CONSUMABLE1_21_2, StructuredDataKey.USE_COOLDOWN, StructuredDataKey.DAMAGE, StructuredDataKey.EQUIPPABLE1_21_2, StructuredDataKey.ITEM_MODEL, StructuredDataKey.GLIDER, StructuredDataKey.TOOLTIP_STYLE, StructuredDataKey.DEATH_PROTECTION});
        super.onMappingDataLoaded();
    }

    public ParticleRewriter1_21_2 getParticleRewriter() {
        return this.particleRewriter;
    }

    protected PacketTypesProvider<ClientboundPacket1_21, ClientboundPacket1_21_2, ServerboundPacket1_20_5, ServerboundPacket1_21_2> createPacketTypesProvider() {
        return new SimplePacketTypesProvider(ProtocolUtil.packetTypeMap((Class)this.unmappedClientboundPacketType, (Class[])new Class[]{ClientboundPackets1_21.class, ClientboundConfigurationPackets1_21.class}), ProtocolUtil.packetTypeMap((Class)this.mappedClientboundPacketType, (Class[])new Class[]{ClientboundPackets1_21_2.class, ClientboundConfigurationPackets1_21.class}), ProtocolUtil.packetTypeMap((Class)this.mappedServerboundPacketType, (Class[])new Class[]{ServerboundPackets1_20_5.class, ServerboundConfigurationPackets1_20_5.class}), ProtocolUtil.packetTypeMap((Class)this.unmappedServerboundPacketType, (Class[])new Class[]{ServerboundPackets1_21_2.class, ServerboundConfigurationPackets1_20_5.class}));
    }

    public VersionedTypesHolder mappedTypes() {
        return VersionedTypes.V1_21_2;
    }

    protected void registerPackets() {
        super.registerPackets();
        this.registerServerbound((ServerboundPacketType)ServerboundPackets1_21_2.CLIENT_INFORMATION, this::clientInformation);
        this.registerServerbound(ServerboundConfigurationPackets1_20_5.CLIENT_INFORMATION, this::clientInformation);
        this.cancelServerbound((ServerboundPacketType)ServerboundPackets1_21_2.BUNDLE_ITEM_SELECTED);
        this.cancelServerbound((ServerboundPacketType)ServerboundPackets1_21_2.CLIENT_TICK_END);
        this.registerClientbound(State.LOGIN, (ClientboundPacketType)ClientboundLoginPackets.LOGIN_FINISHED, wrapper -> {
            wrapper.passthrough(Types.UUID);
            wrapper.passthrough(Types.STRING);
            wrapper.passthrough(Types.PROFILE_PROPERTY_ARRAY);
            wrapper.read((Type)Types.BOOLEAN);
        });
        this.registerClientbound(ClientboundPackets1_21.SET_TIME, wrapper -> {
            wrapper.passthrough((Type)Types.LONG);
            long dayTime = (Long)wrapper.read((Type)Types.LONG);
            boolean doDaylightCycle = true;
            if (dayTime < 0L) {
                dayTime = -dayTime;
                doDaylightCycle = false;
            }
            wrapper.write((Type)Types.LONG, (Object)dayTime);
            wrapper.write((Type)Types.BOOLEAN, (Object)doDaylightCycle);
        });
        this.replaceClientbound(ClientboundPackets1_21.PLAYER_INFO_UPDATE, wrapper -> {
            BitSet actions = (BitSet)wrapper.passthroughAndMap((Type)Types.PROFILE_ACTIONS_ENUM1_19_3, (Type)Types.PROFILE_ACTIONS_ENUM1_21_2);
            if (!actions.get(5)) {
                return;
            }
            int entries = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            for (int i = 0; i < entries; ++i) {
                wrapper.passthrough(Types.UUID);
                if (actions.get(0)) {
                    wrapper.passthrough(Types.STRING);
                    wrapper.passthrough(Types.PROFILE_PROPERTY_ARRAY);
                }
                if (actions.get(1) && ((Boolean)wrapper.passthrough((Type)Types.BOOLEAN)).booleanValue()) {
                    wrapper.passthrough(Types.UUID);
                    wrapper.passthrough(Types.PROFILE_KEY);
                }
                if (actions.get(2)) {
                    wrapper.passthrough((Type)Types.VAR_INT);
                }
                if (actions.get(3)) {
                    wrapper.passthrough((Type)Types.BOOLEAN);
                }
                if (actions.get(4)) {
                    wrapper.passthrough((Type)Types.VAR_INT);
                }
                this.componentRewriter.processTag(wrapper.user(), (Tag)wrapper.passthrough(Types.TRUSTED_OPTIONAL_TAG));
            }
        });
        this.appendClientbound(ClientboundPackets1_21.UPDATE_ATTRIBUTES, wrapper -> {
            wrapper.resetReader();
            int entityId = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            EntityTracker1_21_2 entityTracker = (EntityTracker1_21_2)wrapper.user().getEntityTracker(Protocol1_21To1_21_2.class);
            if (entityId != entityTracker.clientEntityId()) {
                return;
            }
            int size = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            for (int i = 0; i < size; ++i) {
                int attributeId = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
                if (attributeId == 18) {
                    double base = (Double)wrapper.passthrough((Type)Types.DOUBLE);
                    int modifierSize = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
                    Int2ObjectOpenHashMap attributeModifiers = new Int2ObjectOpenHashMap();
                    for (int j = 0; j < modifierSize; ++j) {
                        String modifierId = (String)wrapper.passthrough(Types.STRING);
                        double amount = (Double)wrapper.passthrough((Type)Types.DOUBLE);
                        byte operation = (Byte)wrapper.passthrough((Type)Types.BYTE);
                        ((Map)attributeModifiers.computeIfAbsent((int)operation, k -> new HashMap())).put(modifierId, amount);
                    }
                    double v1 = base;
                    for (Double value : ((Map)attributeModifiers.getOrDefault(0, Collections.emptyMap())).values()) {
                        v1 += value.doubleValue();
                    }
                    double v2 = v1;
                    for (Double value : ((Map)attributeModifiers.getOrDefault(1, Collections.emptyMap())).values()) {
                        v2 += v1 * value;
                    }
                    for (Double value : ((Map)attributeModifiers.getOrDefault(2, Collections.emptyMap())).values()) {
                        v2 *= 1.0 + value;
                    }
                    entityTracker.setPlayerMaxHealthAttributeValue(Math.max(1.0, Math.min(1024.0, v2)));
                    continue;
                }
                wrapper.passthrough((Type)Types.DOUBLE);
                int modifierSize = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
                for (int j = 0; j < modifierSize; ++j) {
                    wrapper.passthrough(Types.STRING);
                    wrapper.passthrough((Type)Types.DOUBLE);
                    wrapper.passthrough((Type)Types.BYTE);
                }
            }
        });
        this.registerClientbound(ClientboundPackets1_21.BUNDLE_DELIMITER, wrapper -> ((BundleStateTracker)wrapper.user().get(BundleStateTracker.class)).toggleBundling());
        this.registerServerbound((ServerboundPacketType)ServerboundPackets1_21_2.PONG, wrapper -> {
            int id = (Integer)wrapper.passthrough((Type)Types.INT);
            PlayerPositionStorage playerPositionStorage = (PlayerPositionStorage)wrapper.user().get(PlayerPositionStorage.class);
            if (playerPositionStorage != null && playerPositionStorage.checkPong(id)) {
                wrapper.cancel();
            }
        });
    }

    public TagRewriter<ClientboundPacket1_21> getTagRewriter() {
        return this.tagRewriter;
    }

    public BlockRewriter<ClientboundPacket1_21> getBlockRewriter() {
        return this.blockRewriter;
    }

    public MappingData getMappingData() {
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
        wrapper.read((Type)Types.VAR_INT);
    }

    public SoundRewriter<ClientboundPacket1_21> getSoundRewriter() {
        return this.soundRewriter;
    }
}

