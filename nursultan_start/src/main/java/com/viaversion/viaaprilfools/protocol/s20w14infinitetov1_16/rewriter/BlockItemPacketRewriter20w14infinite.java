/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.LongArrayTag
 *  com.viaversion.viaaprilfools.protocol.s20w14infinitetov1_16.data.BiomeData20w14infinite
 *  com.viaversion.viaversion.api.minecraft.chunks.Chunk
 *  com.viaversion.viaversion.api.minecraft.chunks.ChunkSection
 *  com.viaversion.viaversion.api.minecraft.chunks.DataPalette
 *  com.viaversion.viaversion.api.minecraft.chunks.PaletteType
 *  com.viaversion.viaversion.api.minecraft.item.Item
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.chunk.ChunkType1_15
 *  com.viaversion.viaversion.api.type.types.chunk.ChunkType1_16
 *  com.viaversion.viaversion.protocols.v1_15_2to1_16.packet.ServerboundPackets1_16
 *  com.viaversion.viaversion.rewriter.BlockRewriter
 *  com.viaversion.viaversion.rewriter.ItemRewriter
 *  com.viaversion.viaversion.util.CompactArrayUtil
 */
package com.viaversion.viaaprilfools.protocol.s20w14infinitetov1_16.rewriter;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.LongArrayTag;
import com.viaversion.viaaprilfools.protocol.s20w14infinitetov1_16.Protocol20w14infiniteTo1_16;
import com.viaversion.viaaprilfools.protocol.s20w14infinitetov1_16.data.BiomeData20w14infinite;
import com.viaversion.viaaprilfools.protocol.s20w14infinitetov1_16.packet.ClientboundPackets20w14infinite;
import com.viaversion.viaversion.api.minecraft.chunks.Chunk;
import com.viaversion.viaversion.api.minecraft.chunks.ChunkSection;
import com.viaversion.viaversion.api.minecraft.chunks.DataPalette;
import com.viaversion.viaversion.api.minecraft.chunks.PaletteType;
import com.viaversion.viaversion.api.minecraft.item.Item;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.chunk.ChunkType1_15;
import com.viaversion.viaversion.api.type.types.chunk.ChunkType1_16;
import com.viaversion.viaversion.protocols.v1_15_2to1_16.packet.ServerboundPackets1_16;
import com.viaversion.viaversion.rewriter.BlockRewriter;
import com.viaversion.viaversion.rewriter.ItemRewriter;
import com.viaversion.viaversion.util.CompactArrayUtil;
import java.util.Map;

public final class BlockItemPacketRewriter20w14infinite
extends ItemRewriter<ClientboundPackets20w14infinite, ServerboundPackets1_16, Protocol20w14infiniteTo1_16> {
    public BlockItemPacketRewriter20w14infinite(Protocol20w14infiniteTo1_16 protocol) {
        super((Protocol)protocol, Types.ITEM1_13_2, Types.ITEM1_13_2_SHORT_ARRAY);
    }

    protected void registerPackets() {
        this.registerCooldown(ClientboundPackets20w14infinite.COOLDOWN);
        this.registerSetContent(ClientboundPackets20w14infinite.CONTAINER_SET_CONTENT);
        this.registerSetSlot(ClientboundPackets20w14infinite.CONTAINER_SET_SLOT);
        this.registerMerchantOffers1_14_4(ClientboundPackets20w14infinite.MERCHANT_OFFERS);
        this.registerAdvancements(ClientboundPackets20w14infinite.UPDATE_ADVANCEMENTS);
        this.registerContainerClick((ServerboundPacketType)ServerboundPackets1_16.CONTAINER_CLICK);
        this.registerSetCreativeModeSlot((ServerboundPacketType)ServerboundPackets1_16.SET_CREATIVE_MODE_SLOT);
        BlockRewriter blockRewriter = BlockRewriter.for1_14((Protocol)this.protocol);
        blockRewriter.registerBlockEvent((ClientboundPacketType)ClientboundPackets20w14infinite.BLOCK_EVENT);
        blockRewriter.registerBlockUpdate((ClientboundPacketType)ClientboundPackets20w14infinite.BLOCK_UPDATE);
        blockRewriter.registerChunkBlocksUpdate((ClientboundPacketType)ClientboundPackets20w14infinite.CHUNK_BLOCKS_UPDATE);
        blockRewriter.registerBlockBreakAck((ClientboundPacketType)ClientboundPackets20w14infinite.BLOCK_BREAK_ACK);
        blockRewriter.registerLevelEvent1_13((ClientboundPacketType)ClientboundPackets20w14infinite.LEVEL_EVENT);
        ((Protocol20w14infiniteTo1_16)this.protocol).registerClientbound(ClientboundPackets20w14infinite.LIGHT_UPDATE, wrapper -> {
            wrapper.passthrough((Type)Types.VAR_INT);
            wrapper.passthrough((Type)Types.VAR_INT);
            wrapper.write((Type)Types.BOOLEAN, (Object)true);
        });
        ((Protocol20w14infiniteTo1_16)this.protocol).registerClientbound(ClientboundPackets20w14infinite.LEVEL_CHUNK, wrapper -> {
            Chunk chunk = (Chunk)wrapper.read(ChunkType1_15.TYPE);
            wrapper.write(ChunkType1_16.TYPE, (Object)chunk);
            chunk.setIgnoreOldLightData(chunk.isFullChunk());
            for (int s = 0; s < chunk.getSections().length; ++s) {
                ChunkSection section = chunk.getSections()[s];
                if (section == null) continue;
                DataPalette blockPalette = section.palette(PaletteType.BLOCKS);
                for (int i2 = 0; i2 < blockPalette.size(); ++i2) {
                    int old = blockPalette.idByIndex(i2);
                    blockPalette.setIdByIndex(i2, ((Protocol20w14infiniteTo1_16)this.protocol).getMappingData().getNewBlockStateId(old));
                }
            }
            if (chunk.getBiomeData() != null) {
                for (int i3 = 0; i3 < chunk.getBiomeData().length; ++i3) {
                    if (BiomeData20w14infinite.isValid((int)chunk.getBiomeData()[i3])) continue;
                    chunk.getBiomeData()[i3] = 1;
                }
            }
            CompoundTag heightMaps = chunk.getHeightMap();
            for (Map.Entry heightMapTag : heightMaps) {
                LongArrayTag heightMap = (LongArrayTag)heightMapTag.getValue();
                int[] heightMapData = new int[256];
                CompactArrayUtil.iterateCompactArray((int)9, (int)heightMapData.length, (long[])heightMap.getValue(), (i, v) -> {
                    heightMapData[i] = v;
                });
                heightMap.setValue(CompactArrayUtil.createCompactArrayWithPadding((int)9, (int)heightMapData.length, i -> heightMapData[i]));
            }
        });
        ((Protocol20w14infiniteTo1_16)this.protocol).registerClientbound(ClientboundPackets20w14infinite.SET_EQUIPMENT, wrapper -> {
            wrapper.passthrough((Type)Types.VAR_INT);
            int slot = (Integer)wrapper.read((Type)Types.VAR_INT);
            wrapper.write((Type)Types.BYTE, (Object)((byte)slot));
            this.passthroughClientboundItem(wrapper);
        });
        ((Protocol20w14infiniteTo1_16)this.protocol).registerServerbound((ServerboundPacketType)ServerboundPackets1_16.EDIT_BOOK, wrapper -> this.handleItemToServer(wrapper.user(), (Item)wrapper.passthrough(Types.ITEM1_13_2)));
    }
}

