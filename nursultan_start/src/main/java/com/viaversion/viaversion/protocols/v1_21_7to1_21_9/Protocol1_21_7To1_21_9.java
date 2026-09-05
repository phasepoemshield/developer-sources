/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viafabricplus.base.sync_tasks.SyncTasks
 *  com.viaversion.viafabricplus.injection.access.networking.packet_handling.IGameTestBlockHighlightRenderer
 *  com.viaversion.viaversion.api.connection.StorableObject
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.data.MappingData
 *  com.viaversion.viaversion.api.data.MappingDataBase
 *  com.viaversion.viaversion.api.data.entity.EntityTracker
 *  com.viaversion.viaversion.api.minecraft.data.StructuredDataKey
 *  com.viaversion.viaversion.api.minecraft.data.version.StructuredDataKeys1_21_5
 *  com.viaversion.viaversion.api.minecraft.entities.EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_21_9
 *  com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes1_21_5
 *  com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes1_21_9
 *  com.viaversion.viaversion.api.protocol.AbstractProtocol
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.packet.provider.PacketTypesProvider
 *  com.viaversion.viaversion.api.protocol.packet.provider.SimplePacketTypesProvider
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.chunk.ChunkType1_21_5
 *  com.viaversion.viaversion.api.type.types.misc.ParticleType$Fillers
 *  com.viaversion.viaversion.api.type.types.version.Types1_20_5
 *  com.viaversion.viaversion.api.type.types.version.VersionedTypes
 *  com.viaversion.viaversion.data.entity.EntityTrackerBase
 *  com.viaversion.viaversion.protocols.v1_21_7to1_21_9.storage.DimensionScaleStorage
 *  com.viaversion.viaversion.protocols.v1_21to1_21_2.storage.LastExplosionPowerStorage
 *  com.viaversion.viaversion.rewriter.BlockRewriter
 *  com.viaversion.viaversion.rewriter.ParticleRewriter
 *  com.viaversion.viaversion.rewriter.RecipeDisplayRewriter
 *  com.viaversion.viaversion.rewriter.RegistryDataRewriter
 *  com.viaversion.viaversion.rewriter.SoundRewriter
 *  com.viaversion.viaversion.rewriter.TagRewriter
 *  com.viaversion.viaversion.rewriter.block.BlockRewriter1_21_5
 *  com.viaversion.viaversion.rewriter.text.NBTComponentRewriter
 *  com.viaversion.viaversion.util.ProtocolUtil
 *  minecraft.class03063
 *  minecraft.class06202
 *  minecraft.class07209
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package com.viaversion.viaversion.protocols.v1_21_7to1_21_9;

import com.viaversion.viafabricplus.base.sync_tasks.SyncTasks;
import com.viaversion.viafabricplus.injection.access.networking.packet_handling.IGameTestBlockHighlightRenderer;
import com.viaversion.viaversion.api.connection.StorableObject;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.data.MappingData;
import com.viaversion.viaversion.api.data.MappingDataBase;
import com.viaversion.viaversion.api.data.entity.EntityTracker;
import com.viaversion.viaversion.api.minecraft.data.StructuredDataKey;
import com.viaversion.viaversion.api.minecraft.data.version.StructuredDataKeys1_21_5;
import com.viaversion.viaversion.api.minecraft.entities.EntityType;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_21_9;
import com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes1_21_5;
import com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes1_21_9;
import com.viaversion.viaversion.api.protocol.AbstractProtocol;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.packet.provider.PacketTypesProvider;
import com.viaversion.viaversion.api.protocol.packet.provider.SimplePacketTypesProvider;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.chunk.ChunkType1_21_5;
import com.viaversion.viaversion.api.type.types.misc.ParticleType;
import com.viaversion.viaversion.api.type.types.version.Types1_20_5;
import com.viaversion.viaversion.api.type.types.version.VersionedTypes;
import com.viaversion.viaversion.data.entity.EntityTrackerBase;
import com.viaversion.viaversion.protocols.v1_21_4to1_21_5.rewriter.RecipeDisplayRewriter1_21_5;
import com.viaversion.viaversion.protocols.v1_21_5to1_21_6.packet.ClientboundConfigurationPackets1_21_6;
import com.viaversion.viaversion.protocols.v1_21_5to1_21_6.packet.ClientboundPacket1_21_6;
import com.viaversion.viaversion.protocols.v1_21_5to1_21_6.packet.ClientboundPackets1_21_6;
import com.viaversion.viaversion.protocols.v1_21_5to1_21_6.packet.ServerboundConfigurationPackets1_21_6;
import com.viaversion.viaversion.protocols.v1_21_5to1_21_6.packet.ServerboundPacket1_21_6;
import com.viaversion.viaversion.protocols.v1_21_5to1_21_6.packet.ServerboundPackets1_21_6;
import com.viaversion.viaversion.protocols.v1_21_7to1_21_9.packet.ClientboundConfigurationPackets1_21_9;
import com.viaversion.viaversion.protocols.v1_21_7to1_21_9.packet.ClientboundPacket1_21_9;
import com.viaversion.viaversion.protocols.v1_21_7to1_21_9.packet.ClientboundPackets1_21_9;
import com.viaversion.viaversion.protocols.v1_21_7to1_21_9.packet.ServerboundConfigurationPackets1_21_9;
import com.viaversion.viaversion.protocols.v1_21_7to1_21_9.packet.ServerboundPacket1_21_9;
import com.viaversion.viaversion.protocols.v1_21_7to1_21_9.rewriter.BlockItemPacketRewriter1_21_9;
import com.viaversion.viaversion.protocols.v1_21_7to1_21_9.rewriter.ComponentRewriter1_21_9;
import com.viaversion.viaversion.protocols.v1_21_7to1_21_9.rewriter.EntityPacketRewriter1_21_9;
import com.viaversion.viaversion.protocols.v1_21_7to1_21_9.rewriter.ParticleRewriter1_21_9;
import com.viaversion.viaversion.protocols.v1_21_7to1_21_9.rewriter.RegistryDataRewriter1_21_9;
import com.viaversion.viaversion.protocols.v1_21_7to1_21_9.storage.DimensionScaleStorage;
import com.viaversion.viaversion.protocols.v1_21to1_21_2.storage.LastExplosionPowerStorage;
import com.viaversion.viaversion.rewriter.BlockRewriter;
import com.viaversion.viaversion.rewriter.ParticleRewriter;
import com.viaversion.viaversion.rewriter.RecipeDisplayRewriter;
import com.viaversion.viaversion.rewriter.RegistryDataRewriter;
import com.viaversion.viaversion.rewriter.SoundRewriter;
import com.viaversion.viaversion.rewriter.TagRewriter;
import com.viaversion.viaversion.rewriter.block.BlockRewriter1_21_5;
import com.viaversion.viaversion.rewriter.text.NBTComponentRewriter;
import com.viaversion.viaversion.util.ProtocolUtil;
import minecraft.class03063;
import minecraft.class06202;
import minecraft.class07209;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public final class Protocol1_21_7To1_21_9
extends AbstractProtocol<ClientboundPacket1_21_6, ClientboundPacket1_21_9, ServerboundPacket1_21_6, ServerboundPacket1_21_9> {
    public static final MappingData MAPPINGS = new MappingDataBase("1.21.7", "1.21.9");
    private final EntityPacketRewriter1_21_9 entityRewriter = new EntityPacketRewriter1_21_9(this);
    private final BlockItemPacketRewriter1_21_9 itemRewriter = new BlockItemPacketRewriter1_21_9(this);
    private final ParticleRewriter<ClientboundPacket1_21_6> particleRewriter = new ParticleRewriter1_21_9((Protocol<ClientboundPacket1_21_6, ?, ?, ?>)this);
    private final TagRewriter<ClientboundPacket1_21_6> tagRewriter = new TagRewriter((Protocol)this);
    private final NBTComponentRewriter<ClientboundPacket1_21_6> componentRewriter = new ComponentRewriter1_21_9(this);
    private final RegistryDataRewriter registryDataRewriter = new RegistryDataRewriter1_21_9((Protocol<?, ?, ?, ?>)this);
    private final BlockRewriter<ClientboundPacket1_21_6> blockRewriter = new BlockRewriter1_21_5((Protocol)this, ChunkType1_21_5::new);
    private final RecipeDisplayRewriter<ClientboundPacket1_21_6> recipeRewriter = new RecipeDisplayRewriter1_21_5<ClientboundPacket1_21_6>((Protocol<ClientboundPacket1_21_6, ?, ?, ?>)this);

    public Types1_20_5<StructuredDataKeys1_21_5, EntityDataTypes1_21_5> types() {
        return VersionedTypes.V1_21_6;
    }

    public Protocol1_21_7To1_21_9() {
        super(ClientboundPacket1_21_6.class, ClientboundPacket1_21_9.class, ServerboundPacket1_21_6.class, ServerboundPacket1_21_9.class);
    }

    public void init(UserConnection userConnection) {
        this.addEntityTracker(userConnection, (EntityTracker)new EntityTrackerBase(userConnection, (EntityType)EntityTypes1_21_9.PLAYER));
        this.addItemHasher(userConnection);
        userConnection.put((StorableObject)new DimensionScaleStorage());
    }

    public RegistryDataRewriter getRegistryDataRewriter() {
        return this.registryDataRewriter;
    }

    public NBTComponentRewriter<ClientboundPacket1_21_6> getComponentRewriter() {
        return this.componentRewriter;
    }

    protected void onMappingDataLoaded() {
        EntityTypes1_21_9.initialize((Protocol)this);
        ParticleType.Fillers.fill1_21_9((Protocol)this);
        this.mappedTypes().structuredData.filler((Protocol)this).add(new StructuredDataKey[]{StructuredDataKey.CUSTOM_DATA, StructuredDataKey.MAX_STACK_SIZE, StructuredDataKey.MAX_DAMAGE, StructuredDataKey.UNBREAKABLE1_21_5, StructuredDataKey.RARITY, StructuredDataKey.TOOLTIP_DISPLAY, StructuredDataKey.DAMAGE_RESISTANT1_21_2, StructuredDataKey.CUSTOM_NAME, StructuredDataKey.LORE, StructuredDataKey.ENCHANTMENTS1_21_5, StructuredDataKey.CUSTOM_MODEL_DATA1_21_4, StructuredDataKey.BLOCKS_ATTACKS1_21_5, StructuredDataKey.PROVIDES_BANNER_PATTERNS1_21_5, StructuredDataKey.REPAIR_COST, StructuredDataKey.CREATIVE_SLOT_LOCK, StructuredDataKey.ENCHANTMENT_GLINT_OVERRIDE, StructuredDataKey.INTANGIBLE_PROJECTILE, StructuredDataKey.STORED_ENCHANTMENTS1_21_5, StructuredDataKey.DYED_COLOR1_21_5, StructuredDataKey.MAP_COLOR, StructuredDataKey.MAP_ID, StructuredDataKey.MAP_DECORATIONS, StructuredDataKey.MAP_POST_PROCESSING, StructuredDataKey.POTION_CONTENTS1_21_2, StructuredDataKey.SUSPICIOUS_STEW_EFFECTS, StructuredDataKey.WRITABLE_BOOK_CONTENT, StructuredDataKey.WRITTEN_BOOK_CONTENT, StructuredDataKey.TRIM1_21_5, StructuredDataKey.DEBUG_STICK_STATE, StructuredDataKey.ENTITY_DATA1_21_9, StructuredDataKey.BUCKET_ENTITY_DATA, StructuredDataKey.BLOCK_ENTITY_DATA1_21_9, StructuredDataKey.INSTRUMENT1_21_5, StructuredDataKey.RECIPES, StructuredDataKey.LODESTONE_TRACKER, StructuredDataKey.FIREWORK_EXPLOSION, StructuredDataKey.FIREWORKS, StructuredDataKey.PROFILE1_21_9, StructuredDataKey.NOTE_BLOCK_SOUND, StructuredDataKey.BANNER_PATTERNS, StructuredDataKey.BASE_COLOR, StructuredDataKey.POT_DECORATIONS, StructuredDataKey.BLOCK_STATE, StructuredDataKey.BEES1_21_9, StructuredDataKey.LOCK1_21_2, StructuredDataKey.CONTAINER_LOOT, StructuredDataKey.TOOL1_21_5, StructuredDataKey.ITEM_NAME, StructuredDataKey.OMINOUS_BOTTLE_AMPLIFIER, StructuredDataKey.FOOD1_21_2, StructuredDataKey.JUKEBOX_PLAYABLE1_21_5, StructuredDataKey.ATTRIBUTE_MODIFIERS1_21_6, StructuredDataKey.REPAIRABLE, StructuredDataKey.ENCHANTABLE, StructuredDataKey.CONSUMABLE1_21_2, StructuredDataKey.USE_COOLDOWN, StructuredDataKey.DAMAGE, StructuredDataKey.EQUIPPABLE1_21_6, StructuredDataKey.ITEM_MODEL, StructuredDataKey.GLIDER, StructuredDataKey.TOOLTIP_STYLE, StructuredDataKey.DEATH_PROTECTION, StructuredDataKey.WEAPON, StructuredDataKey.POTION_DURATION_SCALE, StructuredDataKey.VILLAGER_VARIANT, StructuredDataKey.WOLF_VARIANT, StructuredDataKey.WOLF_COLLAR, StructuredDataKey.FOX_VARIANT, StructuredDataKey.SALMON_SIZE, StructuredDataKey.PARROT_VARIANT, StructuredDataKey.TROPICAL_FISH_PATTERN, StructuredDataKey.TROPICAL_FISH_BASE_COLOR, StructuredDataKey.TROPICAL_FISH_PATTERN_COLOR, StructuredDataKey.MOOSHROOM_VARIANT, StructuredDataKey.RABBIT_VARIANT, StructuredDataKey.PIG_VARIANT, StructuredDataKey.FROG_VARIANT, StructuredDataKey.HORSE_VARIANT, StructuredDataKey.PAINTING_VARIANT, StructuredDataKey.LLAMA_VARIANT, StructuredDataKey.AXOLOTL_VARIANT, StructuredDataKey.CAT_VARIANT, StructuredDataKey.CAT_COLLAR, StructuredDataKey.SHEEP_COLOR, StructuredDataKey.SHULKER_COLOR, StructuredDataKey.PROVIDES_TRIM_MATERIAL1_21_5, StructuredDataKey.BREAK_SOUND, StructuredDataKey.COW_VARIANT, StructuredDataKey.CHICKEN_VARIANT1_21_5, StructuredDataKey.WOLF_SOUND_VARIANT});
        super.onMappingDataLoaded();
    }

    public ParticleRewriter<ClientboundPacket1_21_6> getParticleRewriter() {
        return this.particleRewriter;
    }

    protected PacketTypesProvider<ClientboundPacket1_21_6, ClientboundPacket1_21_9, ServerboundPacket1_21_6, ServerboundPacket1_21_9> createPacketTypesProvider() {
        return new SimplePacketTypesProvider(ProtocolUtil.packetTypeMap((Class)this.unmappedClientboundPacketType, (Class[])new Class[]{ClientboundPackets1_21_6.class, ClientboundConfigurationPackets1_21_6.class}), ProtocolUtil.packetTypeMap((Class)this.mappedClientboundPacketType, (Class[])new Class[]{ClientboundPackets1_21_9.class, ClientboundConfigurationPackets1_21_9.class}), ProtocolUtil.packetTypeMap((Class)this.mappedServerboundPacketType, (Class[])new Class[]{ServerboundPackets1_21_6.class, ServerboundConfigurationPackets1_21_6.class}), ProtocolUtil.packetTypeMap((Class)this.unmappedServerboundPacketType, (Class[])new Class[]{ServerboundPackets1_21_6.class, ServerboundConfigurationPackets1_21_9.class}));
    }

    public Types1_20_5<StructuredDataKeys1_21_5, EntityDataTypes1_21_9> mappedTypes() {
        return VersionedTypes.V1_21_9;
    }

    protected void registerPackets() {
        super.registerPackets();
        SoundRewriter soundRewriter = new SoundRewriter((Protocol)this);
        this.replaceClientbound(ClientboundPackets1_21_6.EXPLODE, packetWrapper -> {
            packetWrapper.passthrough((Type)Types.DOUBLE);
            packetWrapper.passthrough((Type)Types.DOUBLE);
            packetWrapper.passthrough((Type)Types.DOUBLE);
            LastExplosionPowerStorage lastExplosionPowerStorage = (LastExplosionPowerStorage)packetWrapper.user().get(LastExplosionPowerStorage.class);
            float f = 0.0f;
            int n = 0;
            if (lastExplosionPowerStorage != null) {
                f = lastExplosionPowerStorage.power();
                n = lastExplosionPowerStorage.affectedBlocks();
            }
            packetWrapper.write((Type)Types.FLOAT, (Object)Float.valueOf(f));
            packetWrapper.write((Type)Types.INT, (Object)n);
            if (((Boolean)packetWrapper.passthrough((Type)Types.BOOLEAN)).booleanValue()) {
                packetWrapper.passthrough((Type)Types.DOUBLE);
                packetWrapper.passthrough((Type)Types.DOUBLE);
                packetWrapper.passthrough((Type)Types.DOUBLE);
            }
            this.particleRewriter.passthroughParticle(packetWrapper);
            soundRewriter.soundHolderHandler().handle(packetWrapper);
            packetWrapper.write((Type)Types.VAR_INT, (Object)0);
        });
        this.registerServerbound(ServerboundPackets1_21_6.DEBUG_SAMPLE_SUBSCRIPTION, packetWrapper -> {
            int n = (Integer)packetWrapper.read((Type)Types.VAR_INT);
            for (int i = 0; i < n; ++i) {
                int n2 = (Integer)packetWrapper.read((Type)Types.VAR_INT);
                if (n2 != 0) continue;
                packetWrapper.clearPacket();
                packetWrapper.write((Type)Types.VAR_INT, (Object)0);
                return;
            }
            packetWrapper.cancel();
        });
        this.cancelServerbound(ServerboundConfigurationPackets1_21_9.ACCEPT_CODE_OF_CONDUCT);
        this.handler$dpn000$viafabricplus$handleGameTestPayloads(null);
    }

    public TagRewriter<ClientboundPacket1_21_6> getTagRewriter() {
        return this.tagRewriter;
    }

    public BlockRewriter<ClientboundPacket1_21_6> getBlockRewriter() {
        return this.blockRewriter;
    }

    public MappingData getMappingData() {
        return MAPPINGS;
    }

    public BlockItemPacketRewriter1_21_9 getItemRewriter() {
        return this.itemRewriter;
    }

    public RecipeDisplayRewriter<ClientboundPacket1_21_6> getRecipeRewriter() {
        return this.recipeRewriter;
    }

    public EntityPacketRewriter1_21_9 getEntityRewriter() {
        return this.entityRewriter;
    }

    private void handler$dpn000$viafabricplus$handleGameTestPayloads(CallbackInfo callbackInfo) {
        this.registerClientbound(ClientboundPackets1_21_6.CUSTOM_PAYLOAD, packetWrapper -> {
            String string = (String)packetWrapper.passthrough(Types.STRING);
            if (string.equals("minecraft:debug/game_test_add_marker")) {
                packetWrapper.set(Types.STRING, 0, (Object)SyncTasks.PACKET_SYNC_IDENTIFIER);
                packetWrapper.write(Types.STRING, (Object)SyncTasks.executeSyncTask(class042472 -> {
                    class07209 class072092 = class042472.i();
                    int n = class042472.readInt();
                    String string = class042472.s();
                    int n2 = class042472.readInt();
                    IGameTestBlockHighlightRenderer iGameTestBlockHighlightRenderer = (IGameTestBlockHighlightRenderer)((class03063)class06202.Nq().B_2).R;
                    iGameTestBlockHighlightRenderer.viaFabricPlus$addMarker(class072092, n, string, n2);
                }));
            } else if (string.equals("minecraft:debug/game_test_clear")) {
                packetWrapper.set(Types.STRING, 0, (Object)SyncTasks.PACKET_SYNC_IDENTIFIER);
                packetWrapper.write(Types.STRING, (Object)SyncTasks.executeSyncTask(class042472 -> ((class03063)class06202.Nq().B_2).R.N()));
            }
        });
    }
}

