/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viafabricplus.util.NotificationUtil
 *  com.viaversion.viaversion.api.connection.StorableObject
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.data.MappingData
 *  com.viaversion.viaversion.api.data.MappingDataBase
 *  com.viaversion.viaversion.api.data.entity.EntityTracker
 *  com.viaversion.viaversion.api.minecraft.GameMode
 *  com.viaversion.viaversion.api.minecraft.data.StructuredDataKey
 *  com.viaversion.viaversion.api.minecraft.entities.EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_21_6
 *  com.viaversion.viaversion.api.protocol.AbstractProtocol
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.packet.provider.PacketTypesProvider
 *  com.viaversion.viaversion.api.protocol.packet.provider.SimplePacketTypesProvider
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.chunk.ChunkType1_21_5
 *  com.viaversion.viaversion.api.type.types.misc.ParticleType$Fillers
 *  com.viaversion.viaversion.api.type.types.version.VersionedTypes
 *  com.viaversion.viaversion.api.type.types.version.VersionedTypesHolder
 *  com.viaversion.viaversion.data.entity.EntityTrackerBase
 *  com.viaversion.viaversion.protocols.v1_21_5to1_21_6.storage.SneakStorage
 *  com.viaversion.viaversion.rewriter.BlockRewriter
 *  com.viaversion.viaversion.rewriter.ParticleRewriter
 *  com.viaversion.viaversion.rewriter.RecipeDisplayRewriter
 *  com.viaversion.viaversion.rewriter.RegistryDataRewriter
 *  com.viaversion.viaversion.rewriter.TagRewriter
 *  com.viaversion.viaversion.rewriter.text.NBTComponentRewriter
 *  com.viaversion.viaversion.util.Key
 *  com.viaversion.viaversion.util.ProtocolUtil
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package com.viaversion.viaversion.protocols.v1_21_5to1_21_6;

import com.viaversion.viafabricplus.util.NotificationUtil;
import com.viaversion.viaversion.api.connection.StorableObject;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.data.MappingData;
import com.viaversion.viaversion.api.data.MappingDataBase;
import com.viaversion.viaversion.api.data.entity.EntityTracker;
import com.viaversion.viaversion.api.minecraft.GameMode;
import com.viaversion.viaversion.api.minecraft.data.StructuredDataKey;
import com.viaversion.viaversion.api.minecraft.entities.EntityType;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_21_6;
import com.viaversion.viaversion.api.protocol.AbstractProtocol;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.packet.provider.PacketTypesProvider;
import com.viaversion.viaversion.api.protocol.packet.provider.SimplePacketTypesProvider;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.chunk.ChunkType1_21_5;
import com.viaversion.viaversion.api.type.types.misc.ParticleType;
import com.viaversion.viaversion.api.type.types.version.VersionedTypes;
import com.viaversion.viaversion.api.type.types.version.VersionedTypesHolder;
import com.viaversion.viaversion.data.entity.EntityTrackerBase;
import com.viaversion.viaversion.protocols.v1_20_3to1_20_5.packet.ServerboundConfigurationPackets1_20_5;
import com.viaversion.viaversion.protocols.v1_20_5to1_21.packet.ClientboundConfigurationPackets1_21;
import com.viaversion.viaversion.protocols.v1_21_4to1_21_5.packet.ClientboundPacket1_21_5;
import com.viaversion.viaversion.protocols.v1_21_4to1_21_5.packet.ClientboundPackets1_21_5;
import com.viaversion.viaversion.protocols.v1_21_4to1_21_5.packet.ServerboundPacket1_21_5;
import com.viaversion.viaversion.protocols.v1_21_4to1_21_5.packet.ServerboundPackets1_21_5;
import com.viaversion.viaversion.protocols.v1_21_4to1_21_5.rewriter.RecipeDisplayRewriter1_21_5;
import com.viaversion.viaversion.protocols.v1_21_5to1_21_6.packet.ClientboundConfigurationPackets1_21_6;
import com.viaversion.viaversion.protocols.v1_21_5to1_21_6.packet.ClientboundPacket1_21_6;
import com.viaversion.viaversion.protocols.v1_21_5to1_21_6.packet.ClientboundPackets1_21_6;
import com.viaversion.viaversion.protocols.v1_21_5to1_21_6.packet.ServerboundConfigurationPackets1_21_6;
import com.viaversion.viaversion.protocols.v1_21_5to1_21_6.packet.ServerboundPacket1_21_6;
import com.viaversion.viaversion.protocols.v1_21_5to1_21_6.packet.ServerboundPackets1_21_6;
import com.viaversion.viaversion.protocols.v1_21_5to1_21_6.rewriter.BlockItemPacketRewriter1_21_6;
import com.viaversion.viaversion.protocols.v1_21_5to1_21_6.rewriter.EntityPacketRewriter1_21_6;
import com.viaversion.viaversion.protocols.v1_21_5to1_21_6.storage.SneakStorage;
import com.viaversion.viaversion.rewriter.BlockRewriter;
import com.viaversion.viaversion.rewriter.ParticleRewriter;
import com.viaversion.viaversion.rewriter.RecipeDisplayRewriter;
import com.viaversion.viaversion.rewriter.RegistryDataRewriter;
import com.viaversion.viaversion.rewriter.TagRewriter;
import com.viaversion.viaversion.rewriter.text.NBTComponentRewriter;
import com.viaversion.viaversion.util.Key;
import com.viaversion.viaversion.util.ProtocolUtil;
import java.util.Locale;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public final class Protocol1_21_5To1_21_6
extends AbstractProtocol<ClientboundPacket1_21_5, ClientboundPacket1_21_6, ServerboundPacket1_21_5, ServerboundPacket1_21_6> {
    public static final MappingData MAPPINGS = new MappingDataBase("1.21.5", "1.21.6");
    private final EntityPacketRewriter1_21_6 entityRewriter = new EntityPacketRewriter1_21_6(this);
    private final BlockItemPacketRewriter1_21_6 itemRewriter = new BlockItemPacketRewriter1_21_6(this);
    private final ParticleRewriter<ClientboundPacket1_21_5> particleRewriter = new ParticleRewriter((Protocol)this);
    private final TagRewriter<ClientboundPacket1_21_5> tagRewriter = new TagRewriter((Protocol)this);
    private final NBTComponentRewriter<ClientboundPacket1_21_5> componentRewriter = new NBTComponentRewriter((Protocol)this);
    private final RegistryDataRewriter registryDataRewriter = new RegistryDataRewriter((Protocol)this);
    private final BlockRewriter<ClientboundPacket1_21_5> blockRewriter = BlockRewriter.for1_20_2((Protocol)this, ChunkType1_21_5::new);
    private final RecipeDisplayRewriter<ClientboundPacket1_21_5> recipeRewriter = new RecipeDisplayRewriter1_21_5<ClientboundPacket1_21_5>((Protocol<ClientboundPacket1_21_5, ?, ?, ?>)this);

    public VersionedTypesHolder types() {
        return VersionedTypes.V1_21_5;
    }

    public Protocol1_21_5To1_21_6() {
        super(ClientboundPacket1_21_5.class, ClientboundPacket1_21_6.class, ServerboundPacket1_21_5.class, ServerboundPacket1_21_6.class);
    }

    public void init(UserConnection userConnection) {
        this.addEntityTracker(userConnection, (EntityTracker)new EntityTrackerBase(userConnection, (EntityType)EntityTypes1_21_6.PLAYER));
        this.addItemHasher(userConnection);
        userConnection.put((StorableObject)new SneakStorage());
    }

    public RegistryDataRewriter getRegistryDataRewriter() {
        return this.registryDataRewriter;
    }

    public NBTComponentRewriter<ClientboundPacket1_21_5> getComponentRewriter() {
        return this.componentRewriter;
    }

    protected void onMappingDataLoaded() {
        EntityTypes1_21_6.initialize((Protocol)this);
        ParticleType.Fillers.fill1_21_5((Protocol)this);
        VersionedTypes.V1_21_6.structuredData.filler((Protocol)this).add(new StructuredDataKey[]{StructuredDataKey.CUSTOM_DATA, StructuredDataKey.MAX_STACK_SIZE, StructuredDataKey.MAX_DAMAGE, StructuredDataKey.UNBREAKABLE1_21_5, StructuredDataKey.RARITY, StructuredDataKey.TOOLTIP_DISPLAY, StructuredDataKey.DAMAGE_RESISTANT1_21_2, StructuredDataKey.CUSTOM_NAME, StructuredDataKey.LORE, StructuredDataKey.ENCHANTMENTS1_21_5, StructuredDataKey.CUSTOM_MODEL_DATA1_21_4, StructuredDataKey.BLOCKS_ATTACKS1_21_5, StructuredDataKey.PROVIDES_BANNER_PATTERNS1_21_5, StructuredDataKey.REPAIR_COST, StructuredDataKey.CREATIVE_SLOT_LOCK, StructuredDataKey.ENCHANTMENT_GLINT_OVERRIDE, StructuredDataKey.INTANGIBLE_PROJECTILE, StructuredDataKey.STORED_ENCHANTMENTS1_21_5, StructuredDataKey.DYED_COLOR1_21_5, StructuredDataKey.MAP_COLOR, StructuredDataKey.MAP_ID, StructuredDataKey.MAP_DECORATIONS, StructuredDataKey.MAP_POST_PROCESSING, StructuredDataKey.POTION_CONTENTS1_21_2, StructuredDataKey.SUSPICIOUS_STEW_EFFECTS, StructuredDataKey.WRITABLE_BOOK_CONTENT, StructuredDataKey.WRITTEN_BOOK_CONTENT, StructuredDataKey.TRIM1_21_5, StructuredDataKey.DEBUG_STICK_STATE, StructuredDataKey.ENTITY_DATA1_20_5, StructuredDataKey.BUCKET_ENTITY_DATA, StructuredDataKey.BLOCK_ENTITY_DATA1_20_5, StructuredDataKey.INSTRUMENT1_21_5, StructuredDataKey.RECIPES, StructuredDataKey.LODESTONE_TRACKER, StructuredDataKey.FIREWORK_EXPLOSION, StructuredDataKey.FIREWORKS, StructuredDataKey.PROFILE1_20_5, StructuredDataKey.NOTE_BLOCK_SOUND, StructuredDataKey.BANNER_PATTERNS, StructuredDataKey.BASE_COLOR, StructuredDataKey.POT_DECORATIONS, StructuredDataKey.BLOCK_STATE, StructuredDataKey.BEES1_20_5, StructuredDataKey.LOCK1_21_2, StructuredDataKey.CONTAINER_LOOT, StructuredDataKey.TOOL1_21_5, StructuredDataKey.ITEM_NAME, StructuredDataKey.OMINOUS_BOTTLE_AMPLIFIER, StructuredDataKey.FOOD1_21_2, StructuredDataKey.JUKEBOX_PLAYABLE1_21_5, StructuredDataKey.ATTRIBUTE_MODIFIERS1_21_6, StructuredDataKey.REPAIRABLE, StructuredDataKey.ENCHANTABLE, StructuredDataKey.CONSUMABLE1_21_2, StructuredDataKey.USE_COOLDOWN, StructuredDataKey.DAMAGE, StructuredDataKey.EQUIPPABLE1_21_6, StructuredDataKey.ITEM_MODEL, StructuredDataKey.GLIDER, StructuredDataKey.TOOLTIP_STYLE, StructuredDataKey.DEATH_PROTECTION, StructuredDataKey.WEAPON, StructuredDataKey.POTION_DURATION_SCALE, StructuredDataKey.VILLAGER_VARIANT, StructuredDataKey.WOLF_VARIANT, StructuredDataKey.WOLF_COLLAR, StructuredDataKey.FOX_VARIANT, StructuredDataKey.SALMON_SIZE, StructuredDataKey.PARROT_VARIANT, StructuredDataKey.TROPICAL_FISH_PATTERN, StructuredDataKey.TROPICAL_FISH_BASE_COLOR, StructuredDataKey.TROPICAL_FISH_PATTERN_COLOR, StructuredDataKey.MOOSHROOM_VARIANT, StructuredDataKey.RABBIT_VARIANT, StructuredDataKey.PIG_VARIANT, StructuredDataKey.FROG_VARIANT, StructuredDataKey.HORSE_VARIANT, StructuredDataKey.PAINTING_VARIANT, StructuredDataKey.LLAMA_VARIANT, StructuredDataKey.AXOLOTL_VARIANT, StructuredDataKey.CAT_VARIANT, StructuredDataKey.CAT_COLLAR, StructuredDataKey.SHEEP_COLOR, StructuredDataKey.SHULKER_COLOR, StructuredDataKey.PROVIDES_TRIM_MATERIAL1_21_5, StructuredDataKey.BREAK_SOUND, StructuredDataKey.COW_VARIANT, StructuredDataKey.CHICKEN_VARIANT1_21_5, StructuredDataKey.WOLF_SOUND_VARIANT});
        super.onMappingDataLoaded();
    }

    public ParticleRewriter<ClientboundPacket1_21_5> getParticleRewriter() {
        return this.particleRewriter;
    }

    protected PacketTypesProvider<ClientboundPacket1_21_5, ClientboundPacket1_21_6, ServerboundPacket1_21_5, ServerboundPacket1_21_6> createPacketTypesProvider() {
        return new SimplePacketTypesProvider(ProtocolUtil.packetTypeMap((Class)this.unmappedClientboundPacketType, (Class[])new Class[]{ClientboundPackets1_21_5.class, ClientboundConfigurationPackets1_21.class}), ProtocolUtil.packetTypeMap((Class)this.mappedClientboundPacketType, (Class[])new Class[]{ClientboundPackets1_21_6.class, ClientboundConfigurationPackets1_21_6.class}), ProtocolUtil.packetTypeMap((Class)this.mappedServerboundPacketType, (Class[])new Class[]{ServerboundPackets1_21_5.class, ServerboundConfigurationPackets1_20_5.class}), ProtocolUtil.packetTypeMap((Class)this.unmappedServerboundPacketType, (Class[])new Class[]{ServerboundPackets1_21_6.class, ServerboundConfigurationPackets1_21_6.class}));
    }

    public VersionedTypesHolder mappedTypes() {
        return VersionedTypes.V1_21_6;
    }

    protected void registerPackets() {
        super.registerPackets();
        this.registryDataRewriter.addHandler("dimension_type", (string, compoundTag) -> {
            String string2 = compoundTag.getString("effects");
            if (string2 != null && ("the_nether".equals(string2 = Key.stripMinecraftNamespace((String)string2)) || "the_end".equals(string2))) {
                return;
            }
            if (!compoundTag.contains("cloud_height")) {
                compoundTag.putInt("cloud_height", 192);
            }
        });
        this.registerClientbound(ClientboundPackets1_21_5.CHANGE_DIFFICULTY, packetWrapper -> {
            short s = (Short)packetWrapper.read((Type)Types.UNSIGNED_BYTE);
            packetWrapper.write((Type)Types.VAR_INT, (Object)s);
        });
        this.registerServerbound(ServerboundPackets1_21_6.CHANGE_DIFFICULTY, packetWrapper -> {
            int n = (Integer)packetWrapper.read((Type)Types.VAR_INT);
            packetWrapper.write((Type)Types.UNSIGNED_BYTE, (Object)((short)n));
        });
        this.registerServerbound(ServerboundPackets1_21_6.CHANGE_GAME_MODE, ServerboundPackets1_21_5.CHAT_COMMAND, packetWrapper -> {
            int n = (Integer)packetWrapper.read((Type)Types.VAR_INT);
            GameMode gameMode = GameMode.getById((int)n);
            packetWrapper.write(Types.STRING, (Object)("gamemode " + gameMode.name().toLowerCase(Locale.ROOT)));
        });
        this.cancelServerbound(ServerboundPackets1_21_6.CUSTOM_CLICK_ACTION);
        this.cancelServerbound(ServerboundConfigurationPackets1_21_6.CUSTOM_CLICK_ACTION);
        this.handler$eaf000$viafabricplus$cancelInvalidPackets(null);
    }

    public TagRewriter<ClientboundPacket1_21_5> getTagRewriter() {
        return this.tagRewriter;
    }

    public BlockRewriter<ClientboundPacket1_21_5> getBlockRewriter() {
        return this.blockRewriter;
    }

    public MappingData getMappingData() {
        return MAPPINGS;
    }

    public BlockItemPacketRewriter1_21_6 getItemRewriter() {
        return this.itemRewriter;
    }

    public RecipeDisplayRewriter<ClientboundPacket1_21_5> getRecipeRewriter() {
        return this.recipeRewriter;
    }

    public EntityPacketRewriter1_21_6 getEntityRewriter() {
        return this.entityRewriter;
    }

    private void handler$eaf000$viafabricplus$cancelInvalidPackets(CallbackInfo callbackInfo) {
        this.registerServerbound(ServerboundPackets1_21_6.CHANGE_GAME_MODE, ServerboundPackets1_21_5.CHAT_COMMAND, packetWrapper -> {
            if (packetWrapper.user().getProtocolInfo().serverProtocolVersion().olderThanOrEqualTo(ProtocolVersion.v1_20_3)) {
                NotificationUtil.warnIncompatibilityPacket((String)"1.21.6", (String)"CHANGE_GAME_MODE", null, null);
                packetWrapper.cancel();
                return;
            }
            int n = (Integer)packetWrapper.read((Type)Types.VAR_INT);
            GameMode gameMode = GameMode.getById((int)n);
            packetWrapper.write(Types.STRING, (Object)("gamemode " + gameMode.name().toLowerCase(Locale.ROOT)));
        }, true);
    }
}

