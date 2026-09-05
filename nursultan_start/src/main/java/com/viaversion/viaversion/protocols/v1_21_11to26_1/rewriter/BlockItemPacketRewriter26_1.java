/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.EitherHolder
 *  com.viaversion.viaversion.api.minecraft.Holder
 *  com.viaversion.viaversion.api.minecraft.HolderSet
 *  com.viaversion.viaversion.api.minecraft.chunks.Chunk
 *  com.viaversion.viaversion.api.minecraft.chunks.ChunkSection
 *  com.viaversion.viaversion.api.minecraft.chunks.DataPalette
 *  com.viaversion.viaversion.api.minecraft.chunks.PaletteType
 *  com.viaversion.viaversion.api.minecraft.data.StructuredDataContainer
 *  com.viaversion.viaversion.api.minecraft.data.StructuredDataKey
 *  com.viaversion.viaversion.api.minecraft.data.version.StructuredDataKeys1_21_11
 *  com.viaversion.viaversion.api.minecraft.item.Item
 *  com.viaversion.viaversion.api.minecraft.item.StructuredItem
 *  com.viaversion.viaversion.api.minecraft.item.data.BlocksAttacks
 *  com.viaversion.viaversion.api.minecraft.item.data.DamageResistant1_21_2
 *  com.viaversion.viaversion.api.minecraft.item.data.DamageResistant26_1
 *  com.viaversion.viaversion.api.minecraft.item.data.DamageType
 *  com.viaversion.viaversion.api.minecraft.item.data.JukeboxPlayable
 *  com.viaversion.viaversion.api.minecraft.item.data.ProvidesBannerPatterns
 *  com.viaversion.viaversion.api.minecraft.item.data.ProvidesTrimMaterial
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.rewriter.StructuredItemRewriter
 *  com.viaversion.viaversion.util.Either
 *  com.viaversion.viaversion.util.Key
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package com.viaversion.viaversion.protocols.v1_21_11to26_1.rewriter;

import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.EitherHolder;
import com.viaversion.viaversion.api.minecraft.Holder;
import com.viaversion.viaversion.api.minecraft.HolderSet;
import com.viaversion.viaversion.api.minecraft.chunks.Chunk;
import com.viaversion.viaversion.api.minecraft.chunks.ChunkSection;
import com.viaversion.viaversion.api.minecraft.chunks.DataPalette;
import com.viaversion.viaversion.api.minecraft.chunks.PaletteType;
import com.viaversion.viaversion.api.minecraft.data.StructuredDataContainer;
import com.viaversion.viaversion.api.minecraft.data.StructuredDataKey;
import com.viaversion.viaversion.api.minecraft.data.version.StructuredDataKeys1_21_11;
import com.viaversion.viaversion.api.minecraft.item.Item;
import com.viaversion.viaversion.api.minecraft.item.StructuredItem;
import com.viaversion.viaversion.api.minecraft.item.data.BlocksAttacks;
import com.viaversion.viaversion.api.minecraft.item.data.DamageResistant1_21_2;
import com.viaversion.viaversion.api.minecraft.item.data.DamageResistant26_1;
import com.viaversion.viaversion.api.minecraft.item.data.DamageType;
import com.viaversion.viaversion.api.minecraft.item.data.JukeboxPlayable;
import com.viaversion.viaversion.api.minecraft.item.data.ProvidesBannerPatterns;
import com.viaversion.viaversion.api.minecraft.item.data.ProvidesTrimMaterial;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.protocols.v1_21_11to26_1.Protocol1_21_11To26_1;
import com.viaversion.viaversion.protocols.v1_21_11to26_1.packet.ServerboundPacket26_1;
import com.viaversion.viaversion.protocols.v1_21_9to1_21_11.packet.ClientboundPacket1_21_11;
import com.viaversion.viaversion.protocols.v1_21_9to1_21_11.packet.ClientboundPackets1_21_11;
import com.viaversion.viaversion.rewriter.StructuredItemRewriter;
import com.viaversion.viaversion.util.Either;
import com.viaversion.viaversion.util.Key;
import org.checkerframework.checker.nullness.qual.Nullable;

public final class BlockItemPacketRewriter26_1
extends StructuredItemRewriter<ClientboundPacket1_21_11, ServerboundPacket26_1, Protocol1_21_11To26_1> {
    public BlockItemPacketRewriter26_1(Protocol1_21_11To26_1 protocol) {
        super((Protocol)protocol);
    }

    protected void handleItemDataComponentsToServer(UserConnection connection, Item item, StructuredDataContainer container) {
        BlockItemPacketRewriter26_1.downgradeData((StructuredDataKeys1_21_11)((Protocol1_21_11To26_1)this.protocol).mappedTypes().structuredDataKeys(), container);
        super.handleItemDataComponentsToServer(connection, item, container);
    }

    protected void handleItemDataComponentsToClient(UserConnection connection, Item item, StructuredDataContainer container) {
        BlockItemPacketRewriter26_1.upgradeData(this.protocol, (StructuredDataKeys1_21_11)((Protocol1_21_11To26_1)this.protocol).types().structuredDataKeys(), container);
        super.handleItemDataComponentsToClient(connection, item, container);
    }

    public void registerPackets() {
        ((Protocol1_21_11To26_1)this.protocol).replaceClientbound(ClientboundPackets1_21_11.LEVEL_CHUNK_WITH_LIGHT, wrapper -> {
            Chunk chunk = ((Protocol1_21_11To26_1)this.protocol).getBlockRewriter().handleChunk1_18(wrapper);
            for (ChunkSection section : chunk.getSections()) {
                if (section.getNonAirBlocksCount() == 0) continue;
                DataPalette blockPalette = section.palette(PaletteType.BLOCKS);
                for (int idx = 0; idx < 4096; ++idx) {
                    int id = blockPalette.idAt(idx);
                    if (!Protocol1_21_11To26_1.MAPPINGS.fluidBlockStates().contains(id)) continue;
                    section.setFluidCount(section.getFluidCount() + 1);
                }
            }
            ((Protocol1_21_11To26_1)this.protocol).getBlockRewriter().handleBlockEntities(chunk, wrapper.user());
        });
    }

    private static @Nullable Integer upgradeEitherVariant(Protocol<?, ?, ?, ?> protocol, Either<Integer, String> eitherHolder, String registry) {
        return eitherHolder.isLeft() ? (Integer)eitherHolder.left() : BlockItemPacketRewriter26_1.registryIdOrNull(protocol, registry, (String)eitherHolder.right());
    }

    public static void upgradeData(Protocol<?, ?, ?, ?> protocol, StructuredDataKeys1_21_11 dataKeys, StructuredDataContainer container) {
        container.replace(StructuredDataKey.JUKEBOX_PLAYABLE1_21_5, StructuredDataKey.JUKEBOX_PLAYABLE26_1, jukeboxPlayable -> BlockItemPacketRewriter26_1.upgradeHolder(protocol, jukeboxPlayable.song(), "jukebox_song"));
        container.replace(StructuredDataKey.INSTRUMENT1_21_5, StructuredDataKey.INSTRUMENT26_1, instrument -> BlockItemPacketRewriter26_1.upgradeHolder(protocol, instrument, "instrument"));
        container.replace(StructuredDataKey.PROVIDES_TRIM_MATERIAL1_21_5, StructuredDataKey.PROVIDES_TRIM_MATERIAL26_1, providesTrimMaterial -> BlockItemPacketRewriter26_1.upgradeHolder(protocol, providesTrimMaterial.material(), "trim_material"));
        container.replace(StructuredDataKey.CHICKEN_VARIANT1_21_5, StructuredDataKey.CHICKEN_VARIANT26_1, chickenVariant -> BlockItemPacketRewriter26_1.upgradeEitherVariant(protocol, (Either<Integer, String>)chickenVariant, "chicken_variant"));
        container.replace(StructuredDataKey.ZOMBIE_NAUTILUS_VARIANT1_21_11, StructuredDataKey.ZOMBIE_NAUTILUS_VARIANT26_1, nautilusVariant -> BlockItemPacketRewriter26_1.upgradeEitherVariant(protocol, (Either<Integer, String>)nautilusVariant, "zombie_nautilus_variant"));
        container.replace(StructuredDataKey.DAMAGE_TYPE1_21_11, StructuredDataKey.DAMAGE_TYPE26_1, damageType -> BlockItemPacketRewriter26_1.upgradeEitherVariant(protocol, (Either<Integer, String>)damageType.id(), "damage_type"));
        container.replace(StructuredDataKey.PROVIDES_BANNER_PATTERNS1_21_5, StructuredDataKey.PROVIDES_BANNER_PATTERNS26_1, key -> new ProvidesBannerPatterns(HolderSet.of((String)key.original())));
        container.replace(StructuredDataKey.DAMAGE_RESISTANT1_21_2, StructuredDataKey.DAMAGE_RESISTANT26_1, damageResistant -> new DamageResistant26_1(HolderSet.of((String)damageResistant.typesTagKey().original())));
        container.replaceKey(StructuredDataKey.BLOCKS_ATTACKS1_21_5, StructuredDataKey.BLOCKS_ATTACKS26_1);
        Item[] containerData = (Item[])container.get(dataKeys.container);
        if (containerData != null) {
            for (int i = 0; i < containerData.length; ++i) {
                if (!containerData[i].isEmpty()) continue;
                containerData[i] = null;
            }
        }
    }

    public static void downgradeData(StructuredDataKeys1_21_11 dataKeys, StructuredDataContainer container) {
        container.replace(StructuredDataKey.JUKEBOX_PLAYABLE26_1, StructuredDataKey.JUKEBOX_PLAYABLE1_21_5, jukeboxPlayable -> new JukeboxPlayable(jukeboxPlayable, true));
        container.replace(StructuredDataKey.INSTRUMENT26_1, StructuredDataKey.INSTRUMENT1_21_5, EitherHolder::of);
        container.replace(StructuredDataKey.PROVIDES_TRIM_MATERIAL26_1, StructuredDataKey.PROVIDES_TRIM_MATERIAL1_21_5, providesTrimMaterial -> new ProvidesTrimMaterial(EitherHolder.of((Holder)providesTrimMaterial)));
        container.replace(StructuredDataKey.CHICKEN_VARIANT26_1, StructuredDataKey.CHICKEN_VARIANT1_21_5, Either::left);
        container.replace(StructuredDataKey.ZOMBIE_NAUTILUS_VARIANT26_1, StructuredDataKey.ZOMBIE_NAUTILUS_VARIANT1_21_11, Either::left);
        container.replace(StructuredDataKey.DAMAGE_TYPE26_1, StructuredDataKey.DAMAGE_TYPE1_21_11, damageType -> new DamageType(Either.left((Object)damageType)));
        container.replace(StructuredDataKey.PROVIDES_BANNER_PATTERNS26_1, StructuredDataKey.PROVIDES_BANNER_PATTERNS1_21_5, patterns -> BlockItemPacketRewriter26_1.tagOrNull(patterns.patterns()));
        container.replace(StructuredDataKey.DAMAGE_RESISTANT26_1, StructuredDataKey.DAMAGE_RESISTANT1_21_2, damageResistant -> new DamageResistant1_21_2(BlockItemPacketRewriter26_1.tagOrNull(damageResistant.types())));
        container.replace(StructuredDataKey.BLOCKS_ATTACKS26_1, StructuredDataKey.BLOCKS_ATTACKS1_21_5, blocksAttacks -> {
            if (blocksAttacks.bypassedBy() == null) {
                return blocksAttacks;
            }
            return new BlocksAttacks(blocksAttacks.blockDelaySeconds(), blocksAttacks.disableCooldownScale(), blocksAttacks.damageReductions(), blocksAttacks.itemDamage(), null, blocksAttacks.blockSound(), blocksAttacks.disableSound());
        });
        container.remove(StructuredDataKey.ADDITIONAL_TRADE_COST);
        container.remove(StructuredDataKey.DYE);
        container.remove(StructuredDataKey.CAT_SOUND_VARIANT);
        container.remove(StructuredDataKey.CHICKEN_SOUND_VARIANT);
        container.remove(StructuredDataKey.COW_SOUND_VARIANT);
        container.remove(StructuredDataKey.PIG_SOUND_VARIANT);
        Item[] containerData = (Item[])container.get(dataKeys.container);
        if (containerData != null) {
            for (int i = 0; i < containerData.length; ++i) {
                if (containerData[i] != null) continue;
                containerData[i] = StructuredItem.empty();
            }
        }
    }

    private static @Nullable Integer registryIdOrNull(Protocol<?, ?, ?, ?> protocol, String registry, String key) {
        int id = protocol.getRegistryDataRewriter().getMappings(registry).keyToId(key);
        return id != -1 ? Integer.valueOf(id) : null;
    }

    private static <T> @Nullable Holder<T> upgradeHolder(Protocol<?, ?, ?, ?> protocol, EitherHolder<T> eitherHolder, String registry) {
        if (eitherHolder.hasHolder()) {
            return eitherHolder.holder();
        }
        Integer id = BlockItemPacketRewriter26_1.registryIdOrNull(protocol, registry, eitherHolder.key());
        return id != null ? Holder.of((int)id) : null;
    }

    private static @Nullable Key tagOrNull(HolderSet holderSet) {
        return holderSet.hasTagKey() ? Key.of((String)holderSet.tagKey()) : null;
    }
}

