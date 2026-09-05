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
 *  com.viaversion.viaversion.api.data.item.ItemHasher
 *  com.viaversion.viaversion.api.minecraft.Holder
 *  com.viaversion.viaversion.api.minecraft.data.StructuredDataKey
 *  com.viaversion.viaversion.api.minecraft.entities.EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_21_4
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_21_5
 *  com.viaversion.viaversion.api.minecraft.item.data.ArmorTrimPattern
 *  com.viaversion.viaversion.api.minecraft.item.data.ChatType
 *  com.viaversion.viaversion.api.protocol.AbstractProtocol
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.packet.provider.PacketTypesProvider
 *  com.viaversion.viaversion.api.protocol.packet.provider.SimplePacketTypesProvider
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.misc.ParticleType$Fillers
 *  com.viaversion.viaversion.api.type.types.version.VersionedTypes
 *  com.viaversion.viaversion.api.type.types.version.VersionedTypesHolder
 *  com.viaversion.viaversion.data.entity.EntityTrackerBase
 *  com.viaversion.viaversion.protocol.packet.PacketWrapperImpl
 *  com.viaversion.viaversion.protocols.v1_21_4to1_21_5.storage.ItemHashStorage1_21_5
 *  com.viaversion.viaversion.protocols.v1_21_4to1_21_5.storage.MessageIndexStorage
 *  com.viaversion.viaversion.protocols.v1_21to1_21_2.packet.ClientboundPackets1_21_2
 *  com.viaversion.viaversion.rewriter.BlockRewriter
 *  com.viaversion.viaversion.rewriter.ParticleRewriter
 *  com.viaversion.viaversion.rewriter.RecipeDisplayRewriter
 *  com.viaversion.viaversion.rewriter.RegistryDataRewriter
 *  com.viaversion.viaversion.rewriter.TagRewriter
 *  com.viaversion.viaversion.util.Limit
 *  com.viaversion.viaversion.util.ProtocolUtil
 */
package com.viaversion.viaversion.protocols.v1_21_4to1_21_5;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.Tag;
import com.viaversion.viaversion.api.connection.StorableObject;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.data.MappingData;
import com.viaversion.viaversion.api.data.MappingDataBase;
import com.viaversion.viaversion.api.data.entity.EntityTracker;
import com.viaversion.viaversion.api.data.item.ItemHasher;
import com.viaversion.viaversion.api.minecraft.Holder;
import com.viaversion.viaversion.api.minecraft.data.StructuredDataKey;
import com.viaversion.viaversion.api.minecraft.entities.EntityType;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_21_4;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_21_5;
import com.viaversion.viaversion.api.minecraft.item.data.ArmorTrimPattern;
import com.viaversion.viaversion.api.minecraft.item.data.ChatType;
import com.viaversion.viaversion.api.protocol.AbstractProtocol;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.packet.provider.PacketTypesProvider;
import com.viaversion.viaversion.api.protocol.packet.provider.SimplePacketTypesProvider;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.misc.ParticleType;
import com.viaversion.viaversion.api.type.types.version.VersionedTypes;
import com.viaversion.viaversion.api.type.types.version.VersionedTypesHolder;
import com.viaversion.viaversion.data.entity.EntityTrackerBase;
import com.viaversion.viaversion.protocol.packet.PacketWrapperImpl;
import com.viaversion.viaversion.protocols.v1_20_3to1_20_5.packet.ServerboundConfigurationPackets1_20_5;
import com.viaversion.viaversion.protocols.v1_20_5to1_21.packet.ClientboundConfigurationPackets1_21;
import com.viaversion.viaversion.protocols.v1_21_2to1_21_4.packet.ServerboundPacket1_21_4;
import com.viaversion.viaversion.protocols.v1_21_2to1_21_4.packet.ServerboundPackets1_21_4;
import com.viaversion.viaversion.protocols.v1_21_4to1_21_5.packet.ClientboundPacket1_21_5;
import com.viaversion.viaversion.protocols.v1_21_4to1_21_5.packet.ClientboundPackets1_21_5;
import com.viaversion.viaversion.protocols.v1_21_4to1_21_5.packet.ServerboundPacket1_21_5;
import com.viaversion.viaversion.protocols.v1_21_4to1_21_5.packet.ServerboundPackets1_21_5;
import com.viaversion.viaversion.protocols.v1_21_4to1_21_5.rewriter.BlockItemPacketRewriter1_21_5;
import com.viaversion.viaversion.protocols.v1_21_4to1_21_5.rewriter.BlockPacketRewriter1_21_5;
import com.viaversion.viaversion.protocols.v1_21_4to1_21_5.rewriter.ComponentRewriter1_21_5;
import com.viaversion.viaversion.protocols.v1_21_4to1_21_5.rewriter.EntityPacketRewriter1_21_5;
import com.viaversion.viaversion.protocols.v1_21_4to1_21_5.storage.ItemHashStorage1_21_5;
import com.viaversion.viaversion.protocols.v1_21_4to1_21_5.storage.MessageIndexStorage;
import com.viaversion.viaversion.protocols.v1_21to1_21_2.packet.ClientboundPacket1_21_2;
import com.viaversion.viaversion.protocols.v1_21to1_21_2.packet.ClientboundPackets1_21_2;
import com.viaversion.viaversion.rewriter.BlockRewriter;
import com.viaversion.viaversion.rewriter.ParticleRewriter;
import com.viaversion.viaversion.rewriter.RecipeDisplayRewriter;
import com.viaversion.viaversion.rewriter.RegistryDataRewriter;
import com.viaversion.viaversion.rewriter.TagRewriter;
import com.viaversion.viaversion.util.Limit;
import com.viaversion.viaversion.util.ProtocolUtil;

public final class Protocol1_21_4To1_21_5
extends AbstractProtocol<ClientboundPacket1_21_2, ClientboundPacket1_21_5, ServerboundPacket1_21_4, ServerboundPacket1_21_5> {
    public static final MappingData MAPPINGS = new MappingDataBase("1.21.4", "1.21.5");
    private final EntityPacketRewriter1_21_5 entityRewriter = new EntityPacketRewriter1_21_5(this);
    private final BlockItemPacketRewriter1_21_5 itemRewriter = new BlockItemPacketRewriter1_21_5(this);
    private final ParticleRewriter<ClientboundPacket1_21_2> particleRewriter = new ParticleRewriter((Protocol)this);
    private final TagRewriter<ClientboundPacket1_21_2> tagRewriter = new TagRewriter((Protocol)this);
    private final ComponentRewriter1_21_5 componentRewriter = new ComponentRewriter1_21_5(this);
    private final RegistryDataRewriter registryDataRewriter = new RegistryDataRewriter((Protocol)this);
    private final BlockRewriter<ClientboundPacket1_21_2> blockRewriter = new BlockPacketRewriter1_21_5(this);
    final RecipeDisplayRewriter<ClientboundPacket1_21_2> recipeRewriter = new RecipeDisplayRewriter<ClientboundPacket1_21_2>((Protocol)this){

        protected void handleSmithingTrimSlotDisplay(PacketWrapper wrapper) {
            this.handleSlotDisplay(wrapper);
            this.handleSlotDisplay(wrapper);
            ((PacketWrapperImpl)wrapper).setAllActionsRead(true);
            this.handleSlotDisplay(wrapper);
            ((PacketWrapperImpl)wrapper).setAllActionsRead(false);
            wrapper.write((Type)ArmorTrimPattern.TYPE1_21_5, (Object)Holder.of((int)0));
        }
    };

    public VersionedTypesHolder types() {
        return VersionedTypes.V1_21_4;
    }

    public Protocol1_21_4To1_21_5() {
        super(ClientboundPacket1_21_2.class, ClientboundPacket1_21_5.class, ServerboundPacket1_21_4.class, ServerboundPacket1_21_5.class);
    }

    public void init(UserConnection connection) {
        this.addEntityTracker(connection, (EntityTracker)new EntityTrackerBase(connection, (EntityType)EntityTypes1_21_4.PLAYER));
        connection.addItemHasher(((Object)((Object)this)).getClass(), (ItemHasher)new ItemHashStorage1_21_5(this));
        connection.put((StorableObject)new MessageIndexStorage());
    }

    public RegistryDataRewriter getRegistryDataRewriter() {
        return this.registryDataRewriter;
    }

    public ComponentRewriter1_21_5 getComponentRewriter() {
        return this.componentRewriter;
    }

    protected void onMappingDataLoaded() {
        EntityTypes1_21_5.initialize((Protocol)this);
        ParticleType.Fillers.fill1_21_5((Protocol)this);
        VersionedTypes.V1_21_5.structuredData.filler((Protocol)this).add(new StructuredDataKey[]{StructuredDataKey.CUSTOM_DATA, StructuredDataKey.MAX_STACK_SIZE, StructuredDataKey.MAX_DAMAGE, StructuredDataKey.UNBREAKABLE1_21_5, StructuredDataKey.RARITY, StructuredDataKey.TOOLTIP_DISPLAY, StructuredDataKey.DAMAGE_RESISTANT1_21_2, StructuredDataKey.CUSTOM_NAME, StructuredDataKey.LORE, StructuredDataKey.ENCHANTMENTS1_21_5, StructuredDataKey.CUSTOM_MODEL_DATA1_21_4, StructuredDataKey.BLOCKS_ATTACKS1_21_5, StructuredDataKey.PROVIDES_BANNER_PATTERNS1_21_5, StructuredDataKey.REPAIR_COST, StructuredDataKey.CREATIVE_SLOT_LOCK, StructuredDataKey.ENCHANTMENT_GLINT_OVERRIDE, StructuredDataKey.INTANGIBLE_PROJECTILE, StructuredDataKey.STORED_ENCHANTMENTS1_21_5, StructuredDataKey.DYED_COLOR1_21_5, StructuredDataKey.MAP_COLOR, StructuredDataKey.MAP_ID, StructuredDataKey.MAP_DECORATIONS, StructuredDataKey.MAP_POST_PROCESSING, StructuredDataKey.POTION_CONTENTS1_21_2, StructuredDataKey.SUSPICIOUS_STEW_EFFECTS, StructuredDataKey.WRITABLE_BOOK_CONTENT, StructuredDataKey.WRITTEN_BOOK_CONTENT, StructuredDataKey.TRIM1_21_5, StructuredDataKey.DEBUG_STICK_STATE, StructuredDataKey.ENTITY_DATA1_20_5, StructuredDataKey.BUCKET_ENTITY_DATA, StructuredDataKey.BLOCK_ENTITY_DATA1_20_5, StructuredDataKey.INSTRUMENT1_21_5, StructuredDataKey.RECIPES, StructuredDataKey.LODESTONE_TRACKER, StructuredDataKey.FIREWORK_EXPLOSION, StructuredDataKey.FIREWORKS, StructuredDataKey.PROFILE1_20_5, StructuredDataKey.NOTE_BLOCK_SOUND, StructuredDataKey.BANNER_PATTERNS, StructuredDataKey.BASE_COLOR, StructuredDataKey.POT_DECORATIONS, StructuredDataKey.BLOCK_STATE, StructuredDataKey.BEES1_20_5, StructuredDataKey.LOCK1_21_2, StructuredDataKey.CONTAINER_LOOT, StructuredDataKey.TOOL1_21_5, StructuredDataKey.ITEM_NAME, StructuredDataKey.OMINOUS_BOTTLE_AMPLIFIER, StructuredDataKey.FOOD1_21_2, StructuredDataKey.JUKEBOX_PLAYABLE1_21_5, StructuredDataKey.ATTRIBUTE_MODIFIERS1_21_5, StructuredDataKey.REPAIRABLE, StructuredDataKey.ENCHANTABLE, StructuredDataKey.CONSUMABLE1_21_2, StructuredDataKey.USE_COOLDOWN, StructuredDataKey.DAMAGE, StructuredDataKey.EQUIPPABLE1_21_5, StructuredDataKey.ITEM_MODEL, StructuredDataKey.GLIDER, StructuredDataKey.TOOLTIP_STYLE, StructuredDataKey.DEATH_PROTECTION, StructuredDataKey.WEAPON, StructuredDataKey.POTION_DURATION_SCALE, StructuredDataKey.VILLAGER_VARIANT, StructuredDataKey.WOLF_VARIANT, StructuredDataKey.WOLF_COLLAR, StructuredDataKey.FOX_VARIANT, StructuredDataKey.SALMON_SIZE, StructuredDataKey.PARROT_VARIANT, StructuredDataKey.TROPICAL_FISH_PATTERN, StructuredDataKey.TROPICAL_FISH_BASE_COLOR, StructuredDataKey.TROPICAL_FISH_PATTERN_COLOR, StructuredDataKey.MOOSHROOM_VARIANT, StructuredDataKey.RABBIT_VARIANT, StructuredDataKey.PIG_VARIANT, StructuredDataKey.FROG_VARIANT, StructuredDataKey.HORSE_VARIANT, StructuredDataKey.PAINTING_VARIANT, StructuredDataKey.LLAMA_VARIANT, StructuredDataKey.AXOLOTL_VARIANT, StructuredDataKey.CAT_VARIANT, StructuredDataKey.CAT_COLLAR, StructuredDataKey.SHEEP_COLOR, StructuredDataKey.SHULKER_COLOR, StructuredDataKey.PROVIDES_TRIM_MATERIAL1_21_5, StructuredDataKey.BREAK_SOUND, StructuredDataKey.COW_VARIANT, StructuredDataKey.CHICKEN_VARIANT1_21_5, StructuredDataKey.WOLF_SOUND_VARIANT});
        super.onMappingDataLoaded();
    }

    public ParticleRewriter<ClientboundPacket1_21_2> getParticleRewriter() {
        return this.particleRewriter;
    }

    protected PacketTypesProvider<ClientboundPacket1_21_2, ClientboundPacket1_21_5, ServerboundPacket1_21_4, ServerboundPacket1_21_5> createPacketTypesProvider() {
        return new SimplePacketTypesProvider(ProtocolUtil.packetTypeMap((Class)this.unmappedClientboundPacketType, (Class[])new Class[]{ClientboundPackets1_21_2.class, ClientboundConfigurationPackets1_21.class}), ProtocolUtil.packetTypeMap((Class)this.mappedClientboundPacketType, (Class[])new Class[]{ClientboundPackets1_21_5.class, ClientboundConfigurationPackets1_21.class}), ProtocolUtil.packetTypeMap((Class)this.mappedServerboundPacketType, (Class[])new Class[]{ServerboundPackets1_21_4.class, ServerboundConfigurationPackets1_20_5.class}), ProtocolUtil.packetTypeMap((Class)this.unmappedServerboundPacketType, (Class[])new Class[]{ServerboundPackets1_21_5.class, ServerboundConfigurationPackets1_20_5.class}));
    }

    public VersionedTypesHolder mappedTypes() {
        return VersionedTypes.V1_21_5;
    }

    protected void registerPackets() {
        super.registerPackets();
        this.registryDataRewriter.addHandler("wolf_variant", (key, variant) -> {
            CompoundTag assets = new CompoundTag();
            variant.put("assets", (Tag)assets);
            assets.put("wild", variant.remove("wild_texture"));
            assets.put("tame", variant.remove("tame_texture"));
            assets.put("angry", variant.remove("angry_texture"));
            variant.remove("biomes");
        });
        this.cancelServerbound(ServerboundPackets1_21_5.TEST_INSTANCE_BLOCK_ACTION);
        this.cancelServerbound(ServerboundPackets1_21_5.SET_TEST_BLOCK);
        this.replaceClientbound((ClientboundPacketType)ClientboundPackets1_21_2.PLAYER_CHAT, wrapper -> {
            MessageIndexStorage messageIndexStorage = (MessageIndexStorage)wrapper.user().get(MessageIndexStorage.class);
            wrapper.write((Type)Types.VAR_INT, (Object)messageIndexStorage.getAndIncrease());
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
            wrapper.passthrough((Type)ChatType.TYPE);
            this.componentRewriter.processTag(wrapper.user(), (Tag)wrapper.passthrough(Types.TRUSTED_TAG));
            this.componentRewriter.processTag(wrapper.user(), (Tag)wrapper.passthrough(Types.TRUSTED_OPTIONAL_TAG));
        });
        this.registerServerbound(ServerboundPackets1_21_5.CHAT_COMMAND_SIGNED, wrapper -> {
            wrapper.passthrough(Types.STRING);
            wrapper.passthrough((Type)Types.LONG);
            wrapper.passthrough((Type)Types.LONG);
            int signatures = Limit.max((int)((Integer)wrapper.passthrough((Type)Types.VAR_INT)), (int)8);
            for (int i = 0; i < signatures; ++i) {
                wrapper.passthrough(Types.STRING);
                wrapper.passthrough((Type)Types.SIGNATURE_BYTES);
            }
            wrapper.passthrough((Type)Types.VAR_INT);
            wrapper.passthrough((Type)Types.ACKNOWLEDGED_BIT_SET);
            wrapper.read((Type)Types.BYTE);
        });
        this.registerServerbound(ServerboundPackets1_21_5.CHAT, wrapper -> {
            wrapper.passthrough(Types.STRING);
            wrapper.passthrough((Type)Types.LONG);
            wrapper.passthrough((Type)Types.LONG);
            wrapper.passthrough((Type)Types.OPTIONAL_SIGNATURE_BYTES);
            wrapper.passthrough((Type)Types.VAR_INT);
            wrapper.passthrough((Type)Types.ACKNOWLEDGED_BIT_SET);
            wrapper.read((Type)Types.BYTE);
        });
    }

    public TagRewriter<ClientboundPacket1_21_2> getTagRewriter() {
        return this.tagRewriter;
    }

    public BlockRewriter<ClientboundPacket1_21_2> getBlockRewriter() {
        return this.blockRewriter;
    }

    public MappingData getMappingData() {
        return MAPPINGS;
    }

    public BlockItemPacketRewriter1_21_5 getItemRewriter() {
        return this.itemRewriter;
    }

    public RecipeDisplayRewriter<ClientboundPacket1_21_2> getRecipeRewriter() {
        return this.recipeRewriter;
    }

    public EntityPacketRewriter1_21_5 getEntityRewriter() {
        return this.entityRewriter;
    }
}

