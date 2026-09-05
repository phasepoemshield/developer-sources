/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viaversion.api.connection.StorableObject
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.data.entity.EntityTracker
 *  com.viaversion.viaversion.api.minecraft.Holder
 *  com.viaversion.viaversion.api.minecraft.RegistryType
 *  com.viaversion.viaversion.api.minecraft.data.StructuredDataKey
 *  com.viaversion.viaversion.api.minecraft.entities.EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_20_5
 *  com.viaversion.viaversion.api.minecraft.item.data.ChatType
 *  com.viaversion.viaversion.api.protocol.AbstractProtocol
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.packet.provider.PacketTypesProvider
 *  com.viaversion.viaversion.api.protocol.packet.provider.SimplePacketTypesProvider
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.chunk.ChunkType1_20_2
 *  com.viaversion.viaversion.api.type.types.misc.ParticleType
 *  com.viaversion.viaversion.api.type.types.misc.ParticleType$Fillers
 *  com.viaversion.viaversion.api.type.types.version.VersionedTypes
 *  com.viaversion.viaversion.api.type.types.version.VersionedTypesHolder
 *  com.viaversion.viaversion.data.entity.EntityTrackerBase
 *  com.viaversion.viaversion.protocols.v1_20_5to1_21.data.AttributeModifierMappings1_21
 *  com.viaversion.viaversion.protocols.v1_20_5to1_21.storage.EfficiencyAttributeStorage
 *  com.viaversion.viaversion.protocols.v1_20_5to1_21.storage.PlayerPositionStorage
 *  com.viaversion.viaversion.rewriter.BlockRewriter
 *  com.viaversion.viaversion.rewriter.ParticleRewriter
 *  com.viaversion.viaversion.rewriter.TagRewriter
 *  com.viaversion.viaversion.rewriter.text.JsonNBTComponentRewriter
 *  com.viaversion.viaversion.util.Key
 *  com.viaversion.viaversion.util.ProtocolUtil
 *  com.viaversion.viaversion.util.UUIDUtil
 */
package com.viaversion.viaversion.protocols.v1_20_5to1_21;

import com.viaversion.nbt.tag.Tag;
import com.viaversion.viaversion.api.connection.StorableObject;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.data.entity.EntityTracker;
import com.viaversion.viaversion.api.minecraft.Holder;
import com.viaversion.viaversion.api.minecraft.RegistryType;
import com.viaversion.viaversion.api.minecraft.data.StructuredDataKey;
import com.viaversion.viaversion.api.minecraft.entities.EntityType;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_20_5;
import com.viaversion.viaversion.api.minecraft.item.data.ChatType;
import com.viaversion.viaversion.api.protocol.AbstractProtocol;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.packet.provider.PacketTypesProvider;
import com.viaversion.viaversion.api.protocol.packet.provider.SimplePacketTypesProvider;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.chunk.ChunkType1_20_2;
import com.viaversion.viaversion.api.type.types.misc.ParticleType;
import com.viaversion.viaversion.api.type.types.version.VersionedTypes;
import com.viaversion.viaversion.api.type.types.version.VersionedTypesHolder;
import com.viaversion.viaversion.data.entity.EntityTrackerBase;
import com.viaversion.viaversion.protocols.v1_20_3to1_20_5.packet.ClientboundConfigurationPackets1_20_5;
import com.viaversion.viaversion.protocols.v1_20_3to1_20_5.packet.ClientboundPacket1_20_5;
import com.viaversion.viaversion.protocols.v1_20_3to1_20_5.packet.ClientboundPackets1_20_5;
import com.viaversion.viaversion.protocols.v1_20_3to1_20_5.packet.ServerboundConfigurationPackets1_20_5;
import com.viaversion.viaversion.protocols.v1_20_3to1_20_5.packet.ServerboundPacket1_20_5;
import com.viaversion.viaversion.protocols.v1_20_3to1_20_5.packet.ServerboundPackets1_20_5;
import com.viaversion.viaversion.protocols.v1_20_5to1_21.data.AttributeModifierMappings1_21;
import com.viaversion.viaversion.protocols.v1_20_5to1_21.data.MappingData1_21;
import com.viaversion.viaversion.protocols.v1_20_5to1_21.packet.ClientboundConfigurationPackets1_21;
import com.viaversion.viaversion.protocols.v1_20_5to1_21.packet.ClientboundPacket1_21;
import com.viaversion.viaversion.protocols.v1_20_5to1_21.packet.ClientboundPackets1_21;
import com.viaversion.viaversion.protocols.v1_20_5to1_21.rewriter.BlockItemPacketRewriter1_21;
import com.viaversion.viaversion.protocols.v1_20_5to1_21.rewriter.ComponentRewriter1_21;
import com.viaversion.viaversion.protocols.v1_20_5to1_21.rewriter.EntityPacketRewriter1_21;
import com.viaversion.viaversion.protocols.v1_20_5to1_21.storage.EfficiencyAttributeStorage;
import com.viaversion.viaversion.protocols.v1_20_5to1_21.storage.PlayerPositionStorage;
import com.viaversion.viaversion.rewriter.BlockRewriter;
import com.viaversion.viaversion.rewriter.ParticleRewriter;
import com.viaversion.viaversion.rewriter.TagRewriter;
import com.viaversion.viaversion.rewriter.text.JsonNBTComponentRewriter;
import com.viaversion.viaversion.util.Key;
import com.viaversion.viaversion.util.ProtocolUtil;
import com.viaversion.viaversion.util.UUIDUtil;
import java.util.Locale;
import java.util.UUID;

public final class Protocol1_20_5To1_21
extends AbstractProtocol<ClientboundPacket1_20_5, ClientboundPacket1_21, ServerboundPacket1_20_5, ServerboundPacket1_20_5> {
    public static final MappingData1_21 MAPPINGS = new MappingData1_21();
    private final EntityPacketRewriter1_21 entityRewriter = new EntityPacketRewriter1_21(this);
    private final BlockItemPacketRewriter1_21 itemRewriter = new BlockItemPacketRewriter1_21(this);
    private final ParticleRewriter<ClientboundPacket1_20_5> particleRewriter = new ParticleRewriter((Protocol)this);
    private final TagRewriter<ClientboundPacket1_20_5> tagRewriter = new TagRewriter((Protocol)this);
    private final JsonNBTComponentRewriter<ClientboundPacket1_20_5> componentRewriter = new ComponentRewriter1_21(this);
    private final BlockRewriter<ClientboundPacket1_20_5> blockRewriter = BlockRewriter.for1_20_2((Protocol)this, ChunkType1_20_2::new);

    public VersionedTypesHolder types() {
        return VersionedTypes.V1_20_5;
    }

    public Protocol1_20_5To1_21() {
        super(ClientboundPacket1_20_5.class, ClientboundPacket1_21.class, ServerboundPacket1_20_5.class, ServerboundPacket1_20_5.class);
    }

    public void init(UserConnection connection) {
        this.addEntityTracker(connection, (EntityTracker)new EntityTrackerBase(connection, (EntityType)EntityTypes1_20_5.PLAYER));
        connection.put((StorableObject)new EfficiencyAttributeStorage());
        connection.put((StorableObject)new PlayerPositionStorage());
    }

    public JsonNBTComponentRewriter<ClientboundPacket1_20_5> getComponentRewriter() {
        return this.componentRewriter;
    }

    protected void onMappingDataLoaded() {
        ParticleType.Fillers.fill1_20_5((Protocol)this, (ParticleType)this.mappedTypes().particle());
        VersionedTypes.V1_21.structuredData.filler((Protocol)this).add(StructuredDataKey.CUSTOM_DATA).add(StructuredDataKey.MAX_STACK_SIZE).add(StructuredDataKey.MAX_DAMAGE).add(StructuredDataKey.DAMAGE).add(StructuredDataKey.UNBREAKABLE1_20_5).add(StructuredDataKey.RARITY).add(StructuredDataKey.HIDE_TOOLTIP).add(StructuredDataKey.FIRE_RESISTANT).add(StructuredDataKey.CUSTOM_NAME).add(StructuredDataKey.LORE).add(StructuredDataKey.ENCHANTMENTS1_20_5).add(StructuredDataKey.CAN_PLACE_ON1_20_5).add(StructuredDataKey.CAN_BREAK1_20_5).add(StructuredDataKey.CUSTOM_MODEL_DATA1_20_5).add(StructuredDataKey.HIDE_ADDITIONAL_TOOLTIP).add(StructuredDataKey.REPAIR_COST).add(StructuredDataKey.CREATIVE_SLOT_LOCK).add(StructuredDataKey.ENCHANTMENT_GLINT_OVERRIDE).add(StructuredDataKey.INTANGIBLE_PROJECTILE).add(StructuredDataKey.STORED_ENCHANTMENTS1_20_5).add(StructuredDataKey.DYED_COLOR1_20_5).add(StructuredDataKey.MAP_COLOR).add(StructuredDataKey.MAP_ID).add(StructuredDataKey.MAP_DECORATIONS).add(StructuredDataKey.MAP_POST_PROCESSING).add(StructuredDataKey.POTION_CONTENTS1_20_5).add(StructuredDataKey.SUSPICIOUS_STEW_EFFECTS).add(StructuredDataKey.WRITABLE_BOOK_CONTENT).add(StructuredDataKey.WRITTEN_BOOK_CONTENT).add(StructuredDataKey.TRIM1_20_5).add(StructuredDataKey.DEBUG_STICK_STATE).add(StructuredDataKey.ENTITY_DATA1_20_5).add(StructuredDataKey.BUCKET_ENTITY_DATA).add(StructuredDataKey.BLOCK_ENTITY_DATA1_20_5).add(StructuredDataKey.INSTRUMENT1_20_5).add(StructuredDataKey.RECIPES).add(StructuredDataKey.LODESTONE_TRACKER).add(StructuredDataKey.FIREWORK_EXPLOSION).add(StructuredDataKey.FIREWORKS).add(StructuredDataKey.PROFILE1_20_5).add(StructuredDataKey.NOTE_BLOCK_SOUND).add(StructuredDataKey.BANNER_PATTERNS).add(StructuredDataKey.BASE_COLOR).add(StructuredDataKey.POT_DECORATIONS).add(StructuredDataKey.BLOCK_STATE).add(StructuredDataKey.BEES1_20_5).add(StructuredDataKey.LOCK1_20_5).add(StructuredDataKey.CONTAINER_LOOT).add(StructuredDataKey.TOOL1_20_5).add(StructuredDataKey.ITEM_NAME).add(StructuredDataKey.OMINOUS_BOTTLE_AMPLIFIER).add(StructuredDataKey.FOOD1_21).add(StructuredDataKey.JUKEBOX_PLAYABLE1_21).add(StructuredDataKey.ATTRIBUTE_MODIFIERS1_21);
        super.onMappingDataLoaded();
        this.tagRewriter.addEmptyTags(RegistryType.BLOCK, new String[]{"minecraft:blocks_wind_charge_explosions"});
        this.tagRewriter.addEmptyTags(RegistryType.ENTITY, new String[]{"minecraft:can_turn_in_boats", "minecraft:deflects_projectiles", "minecraft:immune_to_infested", "minecraft:immune_to_oozing", "minecraft:no_anger_from_wind_charge"});
        this.tagRewriter.addTag(RegistryType.ENCHANTMENT, "minecraft:curse", new int[]{10, 41});
        this.tagRewriter.addEmptyTags(RegistryType.ENCHANTMENT, new String[]{"double_trade_price", "in_enchanting_table", "non_treasure", "on_mob_spawn_equipment", "on_random_loot", "on_traded_equipment", "prevents_bee_spawns_when_mining", "prevents_decorated_pot_shattering", "prevents_ice_melting", "prevents_infested_spawns", "smelts_loot", "tooltip_order", "tradeable", "treasure", "exclusive_set/armor", "exclusive_set/boots", "exclusive_set/bow", "exclusive_set/crossbow", "exclusive_set/damage", "exclusive_set/mining", "exclusive_set/riptide"});
    }

    public ParticleRewriter<ClientboundPacket1_20_5> getParticleRewriter() {
        return this.particleRewriter;
    }

    protected PacketTypesProvider<ClientboundPacket1_20_5, ClientboundPacket1_21, ServerboundPacket1_20_5, ServerboundPacket1_20_5> createPacketTypesProvider() {
        return new SimplePacketTypesProvider(ProtocolUtil.packetTypeMap((Class)this.unmappedClientboundPacketType, (Class[])new Class[]{ClientboundPackets1_20_5.class, ClientboundConfigurationPackets1_20_5.class}), ProtocolUtil.packetTypeMap((Class)this.mappedClientboundPacketType, (Class[])new Class[]{ClientboundPackets1_21.class, ClientboundConfigurationPackets1_21.class}), ProtocolUtil.packetTypeMap((Class)this.mappedServerboundPacketType, (Class[])new Class[]{ServerboundPackets1_20_5.class, ServerboundConfigurationPackets1_20_5.class}), ProtocolUtil.packetTypeMap((Class)this.unmappedServerboundPacketType, (Class[])new Class[]{ServerboundPackets1_20_5.class, ServerboundConfigurationPackets1_20_5.class}));
    }

    public VersionedTypesHolder mappedTypes() {
        return VersionedTypes.V1_21;
    }

    protected void registerPackets() {
        super.registerPackets();
        this.replaceClientbound(ClientboundPackets1_20_5.DISGUISED_CHAT, wrapper -> {
            this.componentRewriter.processTag(wrapper.user(), (Tag)wrapper.passthrough(Types.TRUSTED_TAG));
            int chatType = (Integer)wrapper.read((Type)Types.VAR_INT);
            wrapper.write((Type)ChatType.TYPE, (Object)Holder.of((int)chatType));
        });
        this.replaceClientbound(ClientboundPackets1_20_5.PLAYER_CHAT, wrapper -> {
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
            this.componentRewriter.processTag(wrapper.user(), (Tag)wrapper.passthrough(Types.TRUSTED_OPTIONAL_TAG));
            int filterMaskType = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            if (filterMaskType == 2) {
                wrapper.passthrough(Types.LONG_ARRAY_PRIMITIVE);
            }
            int chatType = (Integer)wrapper.read((Type)Types.VAR_INT);
            wrapper.write((Type)ChatType.TYPE, (Object)Holder.of((int)chatType));
            this.componentRewriter.processTag(wrapper.user(), (Tag)wrapper.passthrough(Types.TRUSTED_TAG));
            this.componentRewriter.processTag(wrapper.user(), (Tag)wrapper.passthrough(Types.TRUSTED_OPTIONAL_TAG));
        });
        this.registerClientbound(ClientboundPackets1_20_5.UPDATE_ATTRIBUTES, wrapper -> {
            wrapper.passthrough((Type)Types.VAR_INT);
            int size = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            for (int i = 0; i < size; ++i) {
                int attributeId = (Integer)wrapper.read((Type)Types.VAR_INT);
                wrapper.write((Type)Types.VAR_INT, (Object)MAPPINGS.getNewAttributeId(attributeId));
                wrapper.passthrough((Type)Types.DOUBLE);
                int modifierSize = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
                for (int j = 0; j < modifierSize; ++j) {
                    UUID uuid = (UUID)wrapper.read(Types.UUID);
                    wrapper.write(Types.STRING, (Object)Protocol1_20_5To1_21.mapAttributeUUID(uuid, null));
                    wrapper.passthrough((Type)Types.DOUBLE);
                    wrapper.passthrough((Type)Types.BYTE);
                }
            }
        });
        this.registerClientbound(ClientboundPackets1_20_5.PROJECTILE_POWER, wrapper -> {
            wrapper.passthrough((Type)Types.VAR_INT);
            double xPower = (Double)wrapper.read((Type)Types.DOUBLE);
            double yPower = (Double)wrapper.read((Type)Types.DOUBLE);
            double zPower = (Double)wrapper.read((Type)Types.DOUBLE);
            double accelerationPower = Math.sqrt(xPower * xPower + yPower * yPower + zPower * zPower);
            wrapper.write((Type)Types.DOUBLE, (Object)accelerationPower);
        });
    }

    public TagRewriter<ClientboundPacket1_20_5> getTagRewriter() {
        return this.tagRewriter;
    }

    public BlockRewriter<ClientboundPacket1_20_5> getBlockRewriter() {
        return this.blockRewriter;
    }

    public MappingData1_21 getMappingData() {
        return MAPPINGS;
    }

    public BlockItemPacketRewriter1_21 getItemRewriter() {
        return this.itemRewriter;
    }

    public EntityPacketRewriter1_21 getEntityRewriter() {
        return this.entityRewriter;
    }

    public static String mapAttributeUUID(UUID uuid, String name) {
        String id = AttributeModifierMappings1_21.uuidToId((UUID)uuid);
        if (id != null) {
            return id;
        }
        if (name != null) {
            id = AttributeModifierMappings1_21.nameToId((String)name);
        }
        return id != null ? id : uuid.toString().toLowerCase(Locale.ROOT);
    }

    public static UUID mapAttributeId(String id) {
        UUID uuid = AttributeModifierMappings1_21.idToUuid((String)id);
        if (uuid != null) {
            return uuid;
        }
        uuid = UUIDUtil.parseUUID((String)Key.stripNamespace((String)id).toUpperCase(Locale.ROOT));
        return uuid != null ? uuid : UUID.randomUUID();
    }
}

