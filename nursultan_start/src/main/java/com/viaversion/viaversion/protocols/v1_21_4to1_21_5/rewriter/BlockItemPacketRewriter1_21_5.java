/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.IntTag
 *  com.viaversion.nbt.tag.LongArrayTag
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viafabricplus.util.NotificationUtil
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.data.FullMappings
 *  com.viaversion.viaversion.api.data.MappingData
 *  com.viaversion.viaversion.api.data.Mappings
 *  com.viaversion.viaversion.api.data.entity.EntityTracker
 *  com.viaversion.viaversion.api.minecraft.EitherHolder
 *  com.viaversion.viaversion.api.minecraft.chunks.Chunk
 *  com.viaversion.viaversion.api.minecraft.chunks.Chunk1_21_5
 *  com.viaversion.viaversion.api.minecraft.chunks.Heightmap
 *  com.viaversion.viaversion.api.minecraft.data.StructuredData
 *  com.viaversion.viaversion.api.minecraft.data.StructuredDataContainer
 *  com.viaversion.viaversion.api.minecraft.data.StructuredDataKey
 *  com.viaversion.viaversion.api.minecraft.data.predicate.DataComponentMatchers
 *  com.viaversion.viaversion.api.minecraft.data.predicate.DataComponentPredicate
 *  com.viaversion.viaversion.api.minecraft.item.HashedItem
 *  com.viaversion.viaversion.api.minecraft.item.Item
 *  com.viaversion.viaversion.api.minecraft.item.StructuredItem
 *  com.viaversion.viaversion.api.minecraft.item.data.AdventureModePredicate
 *  com.viaversion.viaversion.api.minecraft.item.data.ArmorTrim
 *  com.viaversion.viaversion.api.minecraft.item.data.AttributeModifiers1_21
 *  com.viaversion.viaversion.api.minecraft.item.data.BlockPredicate
 *  com.viaversion.viaversion.api.minecraft.item.data.BlocksAttacks
 *  com.viaversion.viaversion.api.minecraft.item.data.BlocksAttacks$DamageReduction
 *  com.viaversion.viaversion.api.minecraft.item.data.BlocksAttacks$ItemDamageFunction
 *  com.viaversion.viaversion.api.minecraft.item.data.DyedColor
 *  com.viaversion.viaversion.api.minecraft.item.data.Enchantments
 *  com.viaversion.viaversion.api.minecraft.item.data.JukeboxPlayable
 *  com.viaversion.viaversion.api.minecraft.item.data.TooltipDisplay
 *  com.viaversion.viaversion.api.minecraft.item.data.TropicalFishPattern
 *  com.viaversion.viaversion.api.minecraft.item.data.Unbreakable
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.chunk.ChunkBiomesType1_19_4
 *  com.viaversion.viaversion.api.type.types.chunk.ChunkBiomesType1_21_5
 *  com.viaversion.viaversion.api.type.types.chunk.ChunkType1_20_2
 *  com.viaversion.viaversion.api.type.types.chunk.ChunkType1_21_5
 *  com.viaversion.viaversion.api.type.types.version.VersionedTypes
 *  com.viaversion.viaversion.libs.fastutil.ints.Int2IntMap$Entry
 *  com.viaversion.viaversion.libs.fastutil.ints.IntLinkedOpenHashSet
 *  com.viaversion.viaversion.libs.fastutil.ints.IntSortedSet
 *  com.viaversion.viaversion.libs.fastutil.objects.ObjectIterator
 *  com.viaversion.viaversion.protocols.v1_21_4to1_21_5.storage.ItemHashStorage1_21_5
 *  com.viaversion.viaversion.protocols.v1_21to1_21_2.packet.ClientboundPackets1_21_2
 *  com.viaversion.viaversion.rewriter.StructuredItemRewriter
 *  com.viaversion.viaversion.util.Key
 *  com.viaversion.viaversion.util.Limit
 *  com.viaversion.viaversion.util.MathUtil
 *  com.viaversion.viaversion.util.Unit
 *  net.raphimc.vialegacy.api.LegacyProtocolVersion
 *  org.checkerframework.checker.nullness.qual.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package com.viaversion.viaversion.protocols.v1_21_4to1_21_5.rewriter;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.IntTag;
import com.viaversion.nbt.tag.LongArrayTag;
import com.viaversion.nbt.tag.Tag;
import com.viaversion.viafabricplus.util.NotificationUtil;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.data.FullMappings;
import com.viaversion.viaversion.api.data.MappingData;
import com.viaversion.viaversion.api.data.Mappings;
import com.viaversion.viaversion.api.data.entity.EntityTracker;
import com.viaversion.viaversion.api.minecraft.EitherHolder;
import com.viaversion.viaversion.api.minecraft.chunks.Chunk;
import com.viaversion.viaversion.api.minecraft.chunks.Chunk1_21_5;
import com.viaversion.viaversion.api.minecraft.chunks.Heightmap;
import com.viaversion.viaversion.api.minecraft.data.StructuredData;
import com.viaversion.viaversion.api.minecraft.data.StructuredDataContainer;
import com.viaversion.viaversion.api.minecraft.data.StructuredDataKey;
import com.viaversion.viaversion.api.minecraft.data.predicate.DataComponentMatchers;
import com.viaversion.viaversion.api.minecraft.data.predicate.DataComponentPredicate;
import com.viaversion.viaversion.api.minecraft.item.HashedItem;
import com.viaversion.viaversion.api.minecraft.item.Item;
import com.viaversion.viaversion.api.minecraft.item.StructuredItem;
import com.viaversion.viaversion.api.minecraft.item.data.AdventureModePredicate;
import com.viaversion.viaversion.api.minecraft.item.data.ArmorTrim;
import com.viaversion.viaversion.api.minecraft.item.data.AttributeModifiers1_21;
import com.viaversion.viaversion.api.minecraft.item.data.BlockPredicate;
import com.viaversion.viaversion.api.minecraft.item.data.BlocksAttacks;
import com.viaversion.viaversion.api.minecraft.item.data.DyedColor;
import com.viaversion.viaversion.api.minecraft.item.data.Enchantments;
import com.viaversion.viaversion.api.minecraft.item.data.JukeboxPlayable;
import com.viaversion.viaversion.api.minecraft.item.data.TooltipDisplay;
import com.viaversion.viaversion.api.minecraft.item.data.TropicalFishPattern;
import com.viaversion.viaversion.api.minecraft.item.data.Unbreakable;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.chunk.ChunkBiomesType1_19_4;
import com.viaversion.viaversion.api.type.types.chunk.ChunkBiomesType1_21_5;
import com.viaversion.viaversion.api.type.types.chunk.ChunkType1_20_2;
import com.viaversion.viaversion.api.type.types.chunk.ChunkType1_21_5;
import com.viaversion.viaversion.api.type.types.version.VersionedTypes;
import com.viaversion.viaversion.libs.fastutil.ints.Int2IntMap;
import com.viaversion.viaversion.libs.fastutil.ints.IntLinkedOpenHashSet;
import com.viaversion.viaversion.libs.fastutil.ints.IntSortedSet;
import com.viaversion.viaversion.libs.fastutil.objects.ObjectIterator;
import com.viaversion.viaversion.protocols.v1_21_2to1_21_4.packet.ServerboundPackets1_21_4;
import com.viaversion.viaversion.protocols.v1_21_4to1_21_5.Protocol1_21_4To1_21_5;
import com.viaversion.viaversion.protocols.v1_21_4to1_21_5.packet.ServerboundPacket1_21_5;
import com.viaversion.viaversion.protocols.v1_21_4to1_21_5.packet.ServerboundPackets1_21_5;
import com.viaversion.viaversion.protocols.v1_21_4to1_21_5.rewriter.ComponentRewriter1_21_5;
import com.viaversion.viaversion.protocols.v1_21_4to1_21_5.storage.ItemHashStorage1_21_5;
import com.viaversion.viaversion.protocols.v1_21to1_21_2.packet.ClientboundPacket1_21_2;
import com.viaversion.viaversion.protocols.v1_21to1_21_2.packet.ClientboundPackets1_21_2;
import com.viaversion.viaversion.rewriter.StructuredItemRewriter;
import com.viaversion.viaversion.util.Key;
import com.viaversion.viaversion.util.Limit;
import com.viaversion.viaversion.util.MathUtil;
import com.viaversion.viaversion.util.Unit;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import net.raphimc.vialegacy.api.LegacyProtocolVersion;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public final class BlockItemPacketRewriter1_21_5
extends StructuredItemRewriter<ClientboundPacket1_21_2, ServerboundPacket1_21_5, Protocol1_21_4To1_21_5> {
    public static final List<StructuredDataKey<?>> HIDE_ADDITIONAL_KEYS = List.of(StructuredDataKey.BANNER_PATTERNS, StructuredDataKey.BEES1_20_5, StructuredDataKey.BLOCK_ENTITY_DATA1_20_5, StructuredDataKey.BLOCK_STATE, StructuredDataKey.V1_21_5.bundleContents, StructuredDataKey.V1_21_5.chargedProjectiles, StructuredDataKey.V1_21_5.container, StructuredDataKey.CONTAINER_LOOT, StructuredDataKey.FIREWORK_EXPLOSION, StructuredDataKey.FIREWORKS, StructuredDataKey.INSTRUMENT1_21_5, StructuredDataKey.MAP_ID, StructuredDataKey.PAINTING_VARIANT, StructuredDataKey.POT_DECORATIONS, StructuredDataKey.POTION_CONTENTS1_21_2, StructuredDataKey.TROPICAL_FISH_PATTERN, StructuredDataKey.WRITTEN_BOOK_CONTENT);
    public static final List<StructuredDataKey<?>> NEW_DATA_TO_REMOVE = List.of(StructuredDataKey.TOOLTIP_DISPLAY, StructuredDataKey.POTION_DURATION_SCALE, StructuredDataKey.WEAPON, StructuredDataKey.VILLAGER_VARIANT, StructuredDataKey.WOLF_VARIANT, StructuredDataKey.WOLF_COLLAR, StructuredDataKey.FOX_VARIANT, StructuredDataKey.SALMON_SIZE, StructuredDataKey.PARROT_VARIANT, StructuredDataKey.TROPICAL_FISH_PATTERN, StructuredDataKey.TROPICAL_FISH_BASE_COLOR, StructuredDataKey.TROPICAL_FISH_PATTERN_COLOR, StructuredDataKey.MOOSHROOM_VARIANT, StructuredDataKey.RABBIT_VARIANT, StructuredDataKey.COW_VARIANT, StructuredDataKey.PIG_VARIANT, StructuredDataKey.CHICKEN_VARIANT1_21_5, StructuredDataKey.FROG_VARIANT, StructuredDataKey.HORSE_VARIANT, StructuredDataKey.PAINTING_VARIANT, StructuredDataKey.LLAMA_VARIANT, StructuredDataKey.AXOLOTL_VARIANT, StructuredDataKey.CAT_VARIANT, StructuredDataKey.CAT_COLLAR, StructuredDataKey.SHEEP_COLOR, StructuredDataKey.SHULKER_COLOR, StructuredDataKey.BLOCKS_ATTACKS1_21_5, StructuredDataKey.PROVIDES_TRIM_MATERIAL1_21_5, StructuredDataKey.BREAK_SOUND, StructuredDataKey.WOLF_SOUND_VARIANT, StructuredDataKey.PROVIDES_BANNER_PATTERNS1_21_5);
    private static final DataComponentMatchers EMPTY_DATA_MATCHERS = new DataComponentMatchers(new StructuredData[0], new DataComponentPredicate[0]);
    private static final Heightmap[] EMPTY_HEIGHTMAPS = new Heightmap[0];

    public BlockItemPacketRewriter1_21_5(Protocol1_21_4To1_21_5 protocol1_21_4To1_21_5) {
        super((Protocol)protocol1_21_4To1_21_5);
    }

    public void handleItemDataComponentsToServer(UserConnection userConnection, Item item, StructuredDataContainer structuredDataContainer) {
        BlockItemPacketRewriter1_21_5.downgradeItemData(item);
        super.handleItemDataComponentsToServer(userConnection, item, structuredDataContainer);
    }

    public Item handleItemToClient(UserConnection userConnection, Item item) {
        if (item.isEmpty()) {
            return item;
        }
        MappingData mappingData = ((Protocol1_21_4To1_21_5)this.protocol).getMappingData();
        if (mappingData != null && mappingData.getItemMappings() != null) {
            item.setIdentifier(mappingData.getNewItemId(item.identifier()));
        }
        StructuredDataContainer structuredDataContainer = item.dataContainer();
        this.updateItemDataComponentTypeIds(structuredDataContainer, true);
        this.handleRewritablesToClient(userConnection, structuredDataContainer, null);
        BlockItemPacketRewriter1_21_5.updateItemData(item);
        this.handleItemDataComponentsToClient(userConnection, item, structuredDataContainer);
        this.appendItemDataFixComponents(userConnection, item);
        ItemHashStorage1_21_5 itemHashStorage1_21_5 = (ItemHashStorage1_21_5)this.itemHasher(userConnection);
        if (itemHashStorage1_21_5.isProcessingClientboundInventoryPacket()) {
            for (StructuredData structuredData : structuredDataContainer.data().values()) {
                itemHashStorage1_21_5.trackStructuredData(structuredData);
            }
        }
        return item;
    }

    public void registerPackets() {
        ((Protocol1_21_4To1_21_5)this.protocol).replaceClientbound((ClientboundPacketType)ClientboundPackets1_21_2.LEVEL_CHUNK_WITH_LIGHT, packetWrapper -> {
            EntityTracker entityTracker = ((Protocol1_21_4To1_21_5)this.protocol).getEntityRewriter().tracker(packetWrapper.user());
            Mappings mappings = ((Protocol1_21_4To1_21_5)this.protocol).getMappingData().getBlockStateMappings();
            ChunkType1_20_2 chunkType1_20_2 = new ChunkType1_20_2(entityTracker.currentWorldSectionHeight(), MathUtil.ceilLog2((int)mappings.size()), MathUtil.ceilLog2((int)entityTracker.biomesSent()));
            Chunk chunk = (Chunk)packetWrapper.read((Type)chunkType1_20_2);
            ((Protocol1_21_4To1_21_5)this.protocol).getBlockRewriter().handleChunk(chunk);
            ChunkType1_21_5 chunkType1_21_5 = new ChunkType1_21_5(entityTracker.currentWorldSectionHeight(), MathUtil.ceilLog2((int)mappings.mappedSize()), MathUtil.ceilLog2((int)entityTracker.biomesSent()));
            ArrayList<Heightmap> arrayList = new ArrayList<Heightmap>();
            for (Map.Entry entry : chunk.getHeightMap().entrySet()) {
                int n = this.heightmapType((String)entry.getKey());
                if (n == -1) {
                    ((Protocol1_21_4To1_21_5)this.protocol).getLogger().warning("Unknown heightmap type: " + (String)entry.getKey());
                    continue;
                }
                Object v = entry.getValue();
                if (!(v instanceof LongArrayTag)) continue;
                LongArrayTag longArrayTag = (LongArrayTag)v;
                arrayList.add(new Heightmap(n, longArrayTag.getValue()));
            }
            Chunk1_21_5 chunk1_21_5 = new Chunk1_21_5(chunk.getX(), chunk.getZ(), chunk.getSections(), arrayList.toArray(EMPTY_HEIGHTMAPS), chunk.blockEntities());
            ((Protocol1_21_4To1_21_5)this.protocol).getBlockRewriter().handleBlockEntities(chunk, packetWrapper.user());
            packetWrapper.write((Type)chunkType1_21_5, (Object)chunk1_21_5);
        });
        ((Protocol1_21_4To1_21_5)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_21_2.CHUNKS_BIOMES, packetWrapper -> {
            EntityTracker entityTracker = ((Protocol1_21_4To1_21_5)this.protocol).getEntityRewriter().tracker(packetWrapper.user());
            int n = MathUtil.ceilLog2((int)entityTracker.biomesSent());
            ChunkBiomesType1_19_4 chunkBiomesType1_19_4 = new ChunkBiomesType1_19_4(entityTracker.currentWorldSectionHeight(), n);
            ChunkBiomesType1_21_5 chunkBiomesType1_21_5 = new ChunkBiomesType1_21_5(entityTracker.currentWorldSectionHeight(), n);
            int n2 = (Integer)packetWrapper.passthrough((Type)Types.VAR_INT);
            for (int i = 0; i < n2; ++i) {
                packetWrapper.passthrough(Types.CHUNK_POSITION);
                packetWrapper.passthroughAndMap((Type)chunkBiomesType1_19_4, (Type)chunkBiomesType1_21_5);
            }
        });
        ((Protocol1_21_4To1_21_5)this.protocol).replaceServerbound(ServerboundPackets1_21_5.SET_CREATIVE_MODE_SLOT, packetWrapper -> {
            EntityTracker entityTracker = ((Protocol1_21_4To1_21_5)this.protocol).getEntityRewriter().tracker(packetWrapper.user());
            if (!this.redirect$djc000$viafabricplus$dontCancelPackets(entityTracker)) {
                packetWrapper.cancel();
                return;
            }
            packetWrapper.passthrough((Type)Types.SHORT);
            Item item = this.handleItemToServer(packetWrapper.user(), (Item)packetWrapper.read(VersionedTypes.V1_21_5.lengthPrefixedItem()));
            packetWrapper.write(this.itemType(), (Object)item);
        });
        ((Protocol1_21_4To1_21_5)this.protocol).replaceServerbound(ServerboundPackets1_21_5.CONTAINER_CLICK, packetWrapper -> {
            packetWrapper.passthrough((Type)Types.VAR_INT);
            packetWrapper.passthrough((Type)Types.VAR_INT);
            packetWrapper.passthrough((Type)Types.SHORT);
            packetWrapper.passthrough((Type)Types.BYTE);
            packetWrapper.passthrough((Type)Types.VAR_INT);
            int n = Limit.max((int)((Integer)packetWrapper.passthrough((Type)Types.VAR_INT)), (int)128);
            for (int i = 0; i < n; ++i) {
                packetWrapper.passthrough((Type)Types.SHORT);
                HashedItem hashedItem = (HashedItem)packetWrapper.read(Types.HASHED_ITEM);
                packetWrapper.write(VersionedTypes.V1_21_5.item, (Object)this.handleItemToServer(packetWrapper.user(), (Item)this.convertHashedItemToStructuredItem(packetWrapper.user(), hashedItem)));
            }
            HashedItem hashedItem = (HashedItem)packetWrapper.read(Types.HASHED_ITEM);
            packetWrapper.write(VersionedTypes.V1_21_5.item, (Object)this.handleItemToServer(packetWrapper.user(), (Item)this.convertHashedItemToStructuredItem(packetWrapper.user(), hashedItem)));
        });
        ((Protocol1_21_4To1_21_5)this.protocol).replaceClientbound((ClientboundPacketType)ClientboundPackets1_21_2.UPDATE_ADVANCEMENTS, packetWrapper -> {
            int n;
            int n2;
            int n3;
            packetWrapper.passthrough((Type)Types.BOOLEAN);
            int n4 = (Integer)packetWrapper.passthrough((Type)Types.VAR_INT);
            for (n3 = 0; n3 < n4; ++n3) {
                packetWrapper.passthrough(Types.STRING);
                packetWrapper.passthrough(Types.OPTIONAL_STRING);
                if (((Boolean)packetWrapper.passthrough((Type)Types.BOOLEAN)).booleanValue()) {
                    Tag tag = (Tag)packetWrapper.passthrough(Types.TRUSTED_TAG);
                    Tag tag2 = (Tag)packetWrapper.passthrough(Types.TRUSTED_TAG);
                    ComponentRewriter1_21_5 componentRewriter1_21_5 = ((Protocol1_21_4To1_21_5)this.protocol).getComponentRewriter();
                    if (componentRewriter1_21_5 != null) {
                        componentRewriter1_21_5.processTag(packetWrapper.user(), tag);
                        componentRewriter1_21_5.processTag(packetWrapper.user(), tag2);
                    }
                    this.passthroughClientboundItem(packetWrapper);
                    packetWrapper.passthrough((Type)Types.VAR_INT);
                    int n5 = (Integer)packetWrapper.passthrough((Type)Types.INT);
                    if ((n5 & 1) != 0) {
                        this.convertClientAsset(packetWrapper);
                    }
                    packetWrapper.passthrough((Type)Types.FLOAT);
                    packetWrapper.passthrough((Type)Types.FLOAT);
                }
                n2 = (Integer)packetWrapper.passthrough((Type)Types.VAR_INT);
                for (n = 0; n < n2; ++n) {
                    packetWrapper.passthrough(Types.STRING_ARRAY);
                }
                packetWrapper.passthrough((Type)Types.BOOLEAN);
            }
            packetWrapper.passthrough(Types.STRING_ARRAY);
            n3 = (Integer)packetWrapper.passthrough((Type)Types.VAR_INT);
            for (n2 = 0; n2 < n3; ++n2) {
                packetWrapper.passthrough(Types.STRING);
                n = (Integer)packetWrapper.passthrough((Type)Types.VAR_INT);
                for (int i = 0; i < n; ++i) {
                    packetWrapper.passthrough(Types.STRING);
                    packetWrapper.passthrough(Types.OPTIONAL_LONG);
                }
            }
            packetWrapper.write((Type)Types.BOOLEAN, (Object)true);
        });
        this.handler$din000$viafabricplus$removeContainerClickHandler(null);
    }

    private boolean redirect$djc000$viafabricplus$dontCancelPackets(EntityTracker entityTracker) {
        return true;
    }

    private static AdventureModePredicate updateAdventureModePredicate(AdventureModePredicate adventureModePredicate) {
        BlockPredicate[] blockPredicateArray = new BlockPredicate[adventureModePredicate.predicates().length];
        for (int i = 0; i < adventureModePredicate.predicates().length; ++i) {
            BlockPredicate blockPredicate = adventureModePredicate.predicates()[i];
            blockPredicateArray[i] = new BlockPredicate(blockPredicate.holderSet(), blockPredicate.propertyMatchers(), blockPredicate.tag(), EMPTY_DATA_MATCHERS);
        }
        return new AdventureModePredicate(blockPredicateArray);
    }

    private StructuredItem convertHashedItemToStructuredItem(UserConnection userConnection, HashedItem hashedItem) {
        StructuredData structuredData;
        StructuredItem structuredItem = new StructuredItem(hashedItem.identifier(), hashedItem.amount());
        ItemHashStorage1_21_5 itemHashStorage1_21_5 = (ItemHashStorage1_21_5)this.itemHasher(userConnection);
        Map map = structuredItem.dataContainer().data();
        for (Int2IntMap.Entry entry : hashedItem.dataHashesById().int2IntEntrySet()) {
            structuredData = itemHashStorage1_21_5.dataFromHash(entry.getIntKey(), entry.getIntValue());
            if (structuredData == null) continue;
            map.put(structuredData.key(), structuredData);
        }
        ObjectIterator objectIterator = hashedItem.removedDataIds().iterator();
        while (objectIterator.hasNext()) {
            int n = (Integer)objectIterator.next();
            structuredData = VersionedTypes.V1_21_5.structuredData.key(n);
            map.put(structuredData, StructuredData.empty((StructuredDataKey)structuredData, (int)n));
        }
        return structuredItem;
    }

    public static void updateItemData(Item item) {
        StructuredData structuredData;
        StructuredData structuredData2;
        StructuredData structuredData3;
        StructuredData structuredData4;
        StructuredData structuredData5;
        StructuredData structuredData6;
        StructuredDataKey structuredDataKey;
        StructuredData structuredData7;
        FullMappings fullMappings;
        StructuredDataContainer structuredDataContainer = item.dataContainer();
        structuredDataContainer.replaceKey(StructuredDataKey.TOOL1_20_5, StructuredDataKey.TOOL1_21_5);
        structuredDataContainer.replaceKey(StructuredDataKey.EQUIPPABLE1_21_2, StructuredDataKey.EQUIPPABLE1_21_5);
        structuredDataContainer.replace(StructuredDataKey.INSTRUMENT1_21_2, StructuredDataKey.INSTRUMENT1_21_5, EitherHolder::of);
        IntLinkedOpenHashSet intLinkedOpenHashSet = new IntLinkedOpenHashSet(4);
        boolean bl = structuredDataContainer.hasValue(StructuredDataKey.HIDE_TOOLTIP);
        if (structuredDataContainer.hasValue(StructuredDataKey.HIDE_ADDITIONAL_TOOLTIP)) {
            fullMappings = Protocol1_21_4To1_21_5.MAPPINGS.getDataComponentSerializerMappings();
            structuredData7 = HIDE_ADDITIONAL_KEYS.iterator();
            while (structuredData7.hasNext()) {
                structuredDataKey = (StructuredDataKey)structuredData7.next();
                intLinkedOpenHashSet.add(fullMappings.mappedId(structuredDataKey.identifier()));
            }
        }
        if ((fullMappings = structuredDataContainer.getNonEmptyData(StructuredDataKey.UNBREAKABLE1_20_5)) != null && !((Unbreakable)fullMappings.value()).showInTooltip()) {
            intLinkedOpenHashSet.add(fullMappings.id());
        }
        if ((structuredData7 = structuredDataContainer.getNonEmptyData(StructuredDataKey.CAN_PLACE_ON1_20_5)) != null && !((AdventureModePredicate)structuredData7.value()).showInTooltip()) {
            intLinkedOpenHashSet.add(structuredData7.id());
        }
        if ((structuredDataKey = structuredDataContainer.getNonEmptyData(StructuredDataKey.CAN_BREAK1_20_5)) != null && !((AdventureModePredicate)structuredDataKey.value()).showInTooltip()) {
            intLinkedOpenHashSet.add(structuredDataKey.id());
        }
        if ((structuredData6 = structuredDataContainer.getNonEmptyData(StructuredDataKey.DYED_COLOR1_20_5)) != null && !((DyedColor)structuredData6.value()).showInTooltip()) {
            intLinkedOpenHashSet.add(structuredData6.id());
        }
        if ((structuredData5 = structuredDataContainer.getNonEmptyData(StructuredDataKey.ATTRIBUTE_MODIFIERS1_21)) != null && !((AttributeModifiers1_21)structuredData5.value()).showInTooltip()) {
            intLinkedOpenHashSet.add(structuredData5.id());
        }
        if ((structuredData4 = structuredDataContainer.getNonEmptyData(StructuredDataKey.TRIM1_21_4)) != null && !((ArmorTrim)structuredData4.value()).showInTooltip()) {
            intLinkedOpenHashSet.add(structuredData4.id());
        }
        if ((structuredData3 = structuredDataContainer.getNonEmptyData(StructuredDataKey.ENCHANTMENTS1_20_5)) != null && !((Enchantments)structuredData3.value()).showInTooltip()) {
            intLinkedOpenHashSet.add(structuredData3.id());
        }
        if ((structuredData2 = structuredDataContainer.getNonEmptyData(StructuredDataKey.STORED_ENCHANTMENTS1_20_5)) != null && !((Enchantments)structuredData2.value()).showInTooltip()) {
            intLinkedOpenHashSet.add(structuredData2.id());
        }
        if ((structuredData = structuredDataContainer.getNonEmptyData(StructuredDataKey.JUKEBOX_PLAYABLE1_21)) != null && !((JukeboxPlayable)structuredData.value()).showInTooltip()) {
            intLinkedOpenHashSet.add(structuredData.id());
        }
        if (!(!bl && intLinkedOpenHashSet.isEmpty() || structuredDataContainer.has(StructuredDataKey.TOOLTIP_DISPLAY))) {
            structuredDataContainer.set(StructuredDataKey.TOOLTIP_DISPLAY, (Object)new TooltipDisplay(bl, (IntSortedSet)intLinkedOpenHashSet));
        }
        BlockItemPacketRewriter1_21_5.updateBucketVariant(structuredDataContainer);
        structuredDataContainer.replace(StructuredDataKey.UNBREAKABLE1_20_5, StructuredDataKey.UNBREAKABLE1_21_5, unbreakable -> Unit.INSTANCE);
        structuredDataContainer.replace(StructuredDataKey.CAN_PLACE_ON1_20_5, StructuredDataKey.V1_21_5.canPlaceOn, BlockItemPacketRewriter1_21_5::updateAdventureModePredicate);
        structuredDataContainer.replace(StructuredDataKey.CAN_BREAK1_20_5, StructuredDataKey.V1_21_5.canBreak, BlockItemPacketRewriter1_21_5::updateAdventureModePredicate);
        structuredDataContainer.replaceKey(StructuredDataKey.JUKEBOX_PLAYABLE1_21, StructuredDataKey.JUKEBOX_PLAYABLE1_21_5);
        structuredDataContainer.replaceKey(StructuredDataKey.DYED_COLOR1_20_5, StructuredDataKey.DYED_COLOR1_21_5);
        structuredDataContainer.replaceKey(StructuredDataKey.ATTRIBUTE_MODIFIERS1_21, StructuredDataKey.ATTRIBUTE_MODIFIERS1_21_5);
        structuredDataContainer.replaceKey(StructuredDataKey.TRIM1_21_4, StructuredDataKey.TRIM1_21_5);
        structuredDataContainer.replaceKey(StructuredDataKey.ENCHANTMENTS1_20_5, StructuredDataKey.ENCHANTMENTS1_21_5);
        structuredDataContainer.replaceKey(StructuredDataKey.STORED_ENCHANTMENTS1_20_5, StructuredDataKey.STORED_ENCHANTMENTS1_21_5);
        structuredDataContainer.remove(StructuredDataKey.HIDE_TOOLTIP);
        structuredDataContainer.remove(StructuredDataKey.HIDE_ADDITIONAL_TOOLTIP);
    }

    public static void downgradeItemData(Item item) {
        StructuredDataContainer structuredDataContainer = item.dataContainer();
        structuredDataContainer.replaceKey(StructuredDataKey.TOOL1_21_5, StructuredDataKey.TOOL1_20_5);
        structuredDataContainer.replaceKey(StructuredDataKey.EQUIPPABLE1_21_5, StructuredDataKey.EQUIPPABLE1_21_2);
        structuredDataContainer.replace(StructuredDataKey.INSTRUMENT1_21_5, StructuredDataKey.INSTRUMENT1_21_2, eitherHolder -> eitherHolder.hasHolder() ? eitherHolder.holder() : null);
        TooltipDisplay tooltipDisplay = (TooltipDisplay)structuredDataContainer.get(StructuredDataKey.TOOLTIP_DISPLAY);
        if (tooltipDisplay != null) {
            if (tooltipDisplay.hideTooltip()) {
                structuredDataContainer.set(StructuredDataKey.HIDE_TOOLTIP);
            }
            FullMappings fullMappings = Protocol1_21_4To1_21_5.MAPPINGS.getDataComponentSerializerMappings();
            if (tooltipDisplay.hiddenComponents().containsAll((Collection)HIDE_ADDITIONAL_KEYS.stream().map(structuredDataKey -> fullMappings.id(structuredDataKey.identifier())).toList())) {
                structuredDataContainer.set(StructuredDataKey.HIDE_ADDITIONAL_TOOLTIP);
            }
        }
        BlockItemPacketRewriter1_21_5.downgradeBucketVariant(structuredDataContainer);
        structuredDataContainer.replace(StructuredDataKey.UNBREAKABLE1_21_5, StructuredDataKey.UNBREAKABLE1_20_5, unit -> new Unbreakable(BlockItemPacketRewriter1_21_5.shouldShowToServer(tooltipDisplay, StructuredDataKey.UNBREAKABLE1_20_5)));
        BlockItemPacketRewriter1_21_5.updateShowInTooltip(structuredDataContainer, tooltipDisplay, StructuredDataKey.DYED_COLOR1_21_5, StructuredDataKey.DYED_COLOR1_20_5, dyedColor -> new DyedColor(dyedColor.rgb(), false));
        BlockItemPacketRewriter1_21_5.updateShowInTooltip(structuredDataContainer, tooltipDisplay, StructuredDataKey.ATTRIBUTE_MODIFIERS1_21_5, StructuredDataKey.ATTRIBUTE_MODIFIERS1_21, attributeModifiers1_21 -> new AttributeModifiers1_21(attributeModifiers1_21.modifiers(), false));
        BlockItemPacketRewriter1_21_5.updateShowInTooltip(structuredDataContainer, tooltipDisplay, StructuredDataKey.TRIM1_21_5, StructuredDataKey.TRIM1_21_4, armorTrim -> new ArmorTrim(armorTrim.material(), armorTrim.pattern(), false));
        BlockItemPacketRewriter1_21_5.updateShowInTooltip(structuredDataContainer, tooltipDisplay, StructuredDataKey.ENCHANTMENTS1_21_5, StructuredDataKey.ENCHANTMENTS1_20_5, enchantments -> new Enchantments(enchantments.enchantments(), false));
        BlockItemPacketRewriter1_21_5.updateShowInTooltip(structuredDataContainer, tooltipDisplay, StructuredDataKey.STORED_ENCHANTMENTS1_21_5, StructuredDataKey.STORED_ENCHANTMENTS1_20_5, enchantments -> new Enchantments(enchantments.enchantments(), false));
        BlockItemPacketRewriter1_21_5.updateShowInTooltip(structuredDataContainer, tooltipDisplay, StructuredDataKey.V1_21_5.canPlaceOn, StructuredDataKey.CAN_PLACE_ON1_20_5, adventureModePredicate -> new AdventureModePredicate(adventureModePredicate.predicates(), false));
        BlockItemPacketRewriter1_21_5.updateShowInTooltip(structuredDataContainer, tooltipDisplay, StructuredDataKey.V1_21_5.canBreak, StructuredDataKey.CAN_BREAK1_20_5, adventureModePredicate -> new AdventureModePredicate(adventureModePredicate.predicates(), false));
        BlockItemPacketRewriter1_21_5.updateShowInTooltip(structuredDataContainer, tooltipDisplay, StructuredDataKey.JUKEBOX_PLAYABLE1_21_5, StructuredDataKey.JUKEBOX_PLAYABLE1_21, jukeboxPlayable -> new JukeboxPlayable(jukeboxPlayable.song(), false));
        structuredDataContainer.remove(NEW_DATA_TO_REMOVE);
    }

    private void convertClientAsset(PacketWrapper packetWrapper) {
        String string = (String)packetWrapper.read(Types.STRING);
        String string2 = Key.namespace((String)string);
        String string3 = Key.stripNamespace((String)string);
        if (string3.startsWith("textures/") && string3.endsWith(".png")) {
            String string4 = string3.substring("textures/".length(), string3.length() - ".png".length());
            packetWrapper.write(Types.STRING, (Object)(string2 + ":" + string4));
        } else {
            packetWrapper.write(Types.STRING, (Object)(string2 + ":" + string3));
        }
    }

    private int heightmapType(String string) {
        return switch (string) {
            case "WORLD_SURFACE_WG" -> 0;
            case "WORLD_SURFACE" -> 1;
            case "OCEAN_FLOOR_WG" -> 2;
            case "OCEAN_FLOOR" -> 3;
            case "MOTION_BLOCKING" -> 4;
            case "MOTION_BLOCKING_NO_LEAVES" -> 5;
            default -> -1;
        };
    }

    private static boolean shouldShowToServer(@Nullable TooltipDisplay tooltipDisplay, StructuredDataKey<?> structuredDataKey) {
        if (tooltipDisplay == null) {
            return true;
        }
        int n = Protocol1_21_4To1_21_5.MAPPINGS.getDataComponentSerializerMappings().id(structuredDataKey.identifier());
        return !tooltipDisplay.hiddenComponents().contains(n);
    }

    private void handler$din000$viafabricplus$removeContainerClickHandler(CallbackInfo callbackInfo) {
        ((Protocol1_21_4To1_21_5)this.protocol).registerServerbound(ServerboundPackets1_21_5.CONTAINER_CLICK, ServerboundPackets1_21_4.CONTAINER_CLICK, packetWrapper -> {
            NotificationUtil.warnIncompatibilityPacket((String)"1.21.5", (String)"CONTAINER_CLICK", (String)"ClientPlayerInteractionManager#clickSlot", (String)"MultiPlayerGameMode#handleInventoryMouseClick");
            packetWrapper.cancel();
        }, true);
    }

    private boolean redirect$dle000$viafabricplus$changeSwordFixVersionRange(ProtocolVersion protocolVersion, ProtocolVersion protocolVersion2) {
        if (protocolVersion2 == ProtocolVersion.v1_8) {
            return protocolVersion.betweenInclusive(LegacyProtocolVersion.b1_8tob1_8_1, ProtocolVersion.v1_8);
        }
        return protocolVersion.olderThanOrEqualTo(protocolVersion2);
    }

    private void appendItemDataFixComponents(UserConnection userConnection, Item item) {
        block2: {
            block3: {
                ProtocolVersion protocolVersion;
                ProtocolVersion protocolVersion2 = userConnection.getProtocolInfo().serverProtocolVersion();
                ProtocolVersion protocolVersion3 = protocolVersion2;
                if (!this.redirect$dle000$viafabricplus$changeSwordFixVersionRange(protocolVersion3, protocolVersion = ProtocolVersion.v1_8)) break block2;
                if (item.identifier() == 858) break block3;
                if (item.identifier() == 863) break block3;
                if (item.identifier() == 873) break block3;
                if (item.identifier() == 868) break block3;
                if (item.identifier() != 878) break block2;
            }
            item.dataContainer().remove(StructuredDataKey.CONSUMABLE1_21_2);
            item.dataContainer().set(StructuredDataKey.BLOCKS_ATTACKS1_21_5, (Object)new BlocksAttacks(0.0f, 0.0f, new BlocksAttacks.DamageReduction[]{new BlocksAttacks.DamageReduction(90.0f, null, -0.5f, 0.5f)}, new BlocksAttacks.ItemDamageFunction(0.0f, 0.0f, 0.0f), null, null, null));
        }
    }

    private static void downgradeBucketVariant(StructuredDataContainer structuredDataContainer) {
        TropicalFishPattern tropicalFishPattern = (TropicalFishPattern)structuredDataContainer.get(StructuredDataKey.TROPICAL_FISH_PATTERN);
        if (tropicalFishPattern == null) {
            return;
        }
        Integer n = (Integer)structuredDataContainer.get(StructuredDataKey.TROPICAL_FISH_BASE_COLOR);
        Integer n2 = (Integer)structuredDataContainer.get(StructuredDataKey.TROPICAL_FISH_PATTERN_COLOR);
        int n3 = n != null ? n : 0xFFFFFF;
        int n4 = n2 != null ? n2 : 0xFFFFFF;
        int n5 = (n4 & 0xFF) << 24 | (n3 & 0xFF) << 16 | tropicalFishPattern.packedId() & 0xFFFF;
        CompoundTag compoundTag = (CompoundTag)structuredDataContainer.get(StructuredDataKey.BUCKET_ENTITY_DATA);
        if (compoundTag == null) {
            compoundTag = new CompoundTag();
            structuredDataContainer.set(StructuredDataKey.BUCKET_ENTITY_DATA, (Object)compoundTag);
        }
        compoundTag.put("BucketVariantTag", (Tag)new IntTag(n5));
    }

    private static <T> void updateShowInTooltip(StructuredDataContainer structuredDataContainer, @Nullable TooltipDisplay tooltipDisplay, StructuredDataKey<T> structuredDataKey, StructuredDataKey<T> structuredDataKey2, Function<T, T> function) {
        if (BlockItemPacketRewriter1_21_5.shouldShowToServer(tooltipDisplay, structuredDataKey)) {
            structuredDataContainer.replaceKey(structuredDataKey, structuredDataKey2);
        } else {
            structuredDataContainer.replace(structuredDataKey, structuredDataKey2, function);
        }
    }

    private static void updateBucketVariant(StructuredDataContainer structuredDataContainer) {
        CompoundTag compoundTag = (CompoundTag)structuredDataContainer.get(StructuredDataKey.BUCKET_ENTITY_DATA);
        if (compoundTag == null) {
            return;
        }
        IntTag intTag = (IntTag)compoundTag.removeUnchecked("BucketVariantTag");
        if (intTag == null) {
            return;
        }
        int n = intTag.asInt();
        structuredDataContainer.set(StructuredDataKey.TROPICAL_FISH_BASE_COLOR, (Object)(n >> 16 & 0xFF));
        structuredDataContainer.set(StructuredDataKey.TROPICAL_FISH_PATTERN_COLOR, (Object)(n >> 24 & 0xFF));
        structuredDataContainer.set(StructuredDataKey.TROPICAL_FISH_PATTERN, (Object)new TropicalFishPattern(n & 0xFFFF));
    }
}

