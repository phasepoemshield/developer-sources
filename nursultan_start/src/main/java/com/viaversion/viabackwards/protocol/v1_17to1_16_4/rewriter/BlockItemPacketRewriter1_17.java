/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.LongArrayTag
 *  com.viaversion.nbt.tag.NumberTag
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viabackwards.ViaBackwards
 *  com.viaversion.viabackwards.api.BackwardsProtocol
 *  com.viaversion.viabackwards.api.rewriters.BackwardsItemRewriter
 *  com.viaversion.viabackwards.api.rewriters.MapColorRewriter
 *  com.viaversion.viabackwards.protocol.v1_17_1to1_17.storage.InventoryStateIds
 *  com.viaversion.viabackwards.protocol.v1_17to1_16_4.data.MapColorMappings1_16_4
 *  com.viaversion.viabackwards.protocol.v1_17to1_16_4.storage.PlayerLastCursorItem
 *  com.viaversion.viaversion.api.data.entity.EntityTracker
 *  com.viaversion.viaversion.api.minecraft.BlockChangeRecord
 *  com.viaversion.viaversion.api.minecraft.BlockPosition
 *  com.viaversion.viaversion.api.minecraft.chunks.Chunk
 *  com.viaversion.viaversion.api.minecraft.chunks.ChunkSection
 *  com.viaversion.viaversion.api.minecraft.chunks.DataPalette
 *  com.viaversion.viaversion.api.minecraft.chunks.PaletteType
 *  com.viaversion.viaversion.api.minecraft.item.Item
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.chunk.ChunkType1_16_2
 *  com.viaversion.viaversion.api.type.types.chunk.ChunkType1_17
 *  com.viaversion.viaversion.protocols.v1_16_1to1_16_2.packet.ClientboundPackets1_16_2
 *  com.viaversion.viaversion.protocols.v1_16_1to1_16_2.packet.ServerboundPackets1_16_2
 *  com.viaversion.viaversion.protocols.v1_16_4to1_17.packet.ClientboundPackets1_17
 *  com.viaversion.viaversion.protocols.v1_16_4to1_17.packet.ServerboundPackets1_17
 *  com.viaversion.viaversion.rewriter.RecipeRewriter
 *  com.viaversion.viaversion.util.CompactArrayUtil
 *  com.viaversion.viaversion.util.MathUtil
 */
package com.viaversion.viabackwards.protocol.v1_17to1_16_4.rewriter;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.LongArrayTag;
import com.viaversion.nbt.tag.NumberTag;
import com.viaversion.nbt.tag.Tag;
import com.viaversion.viabackwards.ViaBackwards;
import com.viaversion.viabackwards.api.BackwardsProtocol;
import com.viaversion.viabackwards.api.rewriters.BackwardsItemRewriter;
import com.viaversion.viabackwards.api.rewriters.MapColorRewriter;
import com.viaversion.viabackwards.protocol.v1_17_1to1_17.storage.InventoryStateIds;
import com.viaversion.viabackwards.protocol.v1_17to1_16_4.Protocol1_17To1_16_4;
import com.viaversion.viabackwards.protocol.v1_17to1_16_4.data.MapColorMappings1_16_4;
import com.viaversion.viabackwards.protocol.v1_17to1_16_4.storage.PlayerLastCursorItem;
import com.viaversion.viaversion.api.data.entity.EntityTracker;
import com.viaversion.viaversion.api.minecraft.BlockChangeRecord;
import com.viaversion.viaversion.api.minecraft.BlockPosition;
import com.viaversion.viaversion.api.minecraft.chunks.Chunk;
import com.viaversion.viaversion.api.minecraft.chunks.ChunkSection;
import com.viaversion.viaversion.api.minecraft.chunks.DataPalette;
import com.viaversion.viaversion.api.minecraft.chunks.PaletteType;
import com.viaversion.viaversion.api.minecraft.item.Item;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.chunk.ChunkType1_16_2;
import com.viaversion.viaversion.api.type.types.chunk.ChunkType1_17;
import com.viaversion.viaversion.protocols.v1_16_1to1_16_2.packet.ClientboundPackets1_16_2;
import com.viaversion.viaversion.protocols.v1_16_1to1_16_2.packet.ServerboundPackets1_16_2;
import com.viaversion.viaversion.protocols.v1_16_4to1_17.packet.ClientboundPackets1_17;
import com.viaversion.viaversion.protocols.v1_16_4to1_17.packet.ServerboundPackets1_17;
import com.viaversion.viaversion.rewriter.RecipeRewriter;
import com.viaversion.viaversion.util.CompactArrayUtil;
import com.viaversion.viaversion.util.MathUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;

public final class BlockItemPacketRewriter1_17
extends BackwardsItemRewriter<ClientboundPackets1_17, ServerboundPackets1_16_2, Protocol1_17To1_16_4> {
    private static final int BEDROCK_BLOCK_STATE = 33;

    public BlockItemPacketRewriter1_17(Protocol1_17To1_16_4 protocol) {
        super((BackwardsProtocol)protocol, Types.ITEM1_13_2, Types.ITEM1_13_2_SHORT_ARRAY);
    }

    private int cutMask(BitSet mask, int startFromSection, boolean lightMask) {
        int cutMask = 0;
        int to = startFromSection + (lightMask ? 18 : 16);
        int i = startFromSection;
        int j = 0;
        while (i < to) {
            if (mask.get(i)) {
                cutMask |= 1 << j;
            }
            ++i;
            ++j;
        }
        return cutMask;
    }

    protected void registerPackets() {
        new RecipeRewriter(this.protocol).register((ClientboundPacketType)ClientboundPackets1_17.UPDATE_RECIPES);
        ((Protocol1_17To1_16_4)this.protocol).registerServerbound((ServerboundPacketType)ServerboundPackets1_16_2.EDIT_BOOK, wrapper -> this.handleItemToServer(wrapper.user(), (Item)wrapper.passthrough(Types.ITEM1_13_2)));
        ((Protocol1_17To1_16_4)this.protocol).replaceServerbound((ServerboundPacketType)ServerboundPackets1_16_2.CONTAINER_CLICK, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.BYTE);
                this.handler(wrapper -> {
                    InventoryStateIds stateIds;
                    short slot = (Short)wrapper.passthrough((Type)Types.SHORT);
                    byte button = (Byte)wrapper.passthrough((Type)Types.BYTE);
                    wrapper.read((Type)Types.SHORT);
                    int mode = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
                    Item clicked = BlockItemPacketRewriter1_17.this.handleItemToServer(wrapper.user(), (Item)wrapper.read(Types.ITEM1_13_2));
                    if (slot >= 0 && clicked != null) {
                        wrapper.write((Type)Types.VAR_INT, (Object)1);
                        wrapper.write((Type)Types.SHORT, (Object)slot);
                        wrapper.write(Types.ITEM1_13_2, (Object)null);
                    } else {
                        wrapper.write((Type)Types.VAR_INT, (Object)0);
                    }
                    if (mode != 0 && (stateIds = (InventoryStateIds)wrapper.user().get(InventoryStateIds.class)) != null) {
                        stateIds.setStateId((int)((Byte)wrapper.get((Type)Types.BYTE, 0)).byteValue(), -1);
                    }
                    PlayerLastCursorItem state = (PlayerLastCursorItem)wrapper.user().get(PlayerLastCursorItem.class);
                    if (mode == 0 && button == 0 && clicked != null) {
                        state.setLastCursorItem(clicked);
                    } else if (mode == 0 && button == 1 && clicked != null) {
                        if (state.isSet()) {
                            state.setLastCursorItem(clicked);
                        } else {
                            state.setLastCursorItem(clicked, (clicked.amount() + 1) / 2);
                        }
                    } else if (mode != 5 || slot != -999 || button != 0 && button != 4) {
                        state.setLastCursorItem(null);
                    }
                    Item carried = state.getLastCursorItem();
                    if (carried == null) {
                        wrapper.write(Types.ITEM1_13_2, (Object)clicked);
                    } else {
                        wrapper.write(Types.ITEM1_13_2, (Object)carried);
                    }
                });
            }
        });
        ((Protocol1_17To1_16_4)this.protocol).replaceClientbound((ClientboundPacketType)ClientboundPackets1_17.CONTAINER_SET_SLOT, wrapper -> {
            byte windowId = (Byte)wrapper.passthrough((Type)Types.BYTE);
            short slot = (Short)wrapper.passthrough((Type)Types.SHORT);
            Item carried = (Item)wrapper.read(Types.ITEM1_13_2);
            if (carried != null && windowId == -1 && slot == -1) {
                ((PlayerLastCursorItem)wrapper.user().get(PlayerLastCursorItem.class)).setLastCursorItem(carried);
            }
            wrapper.write(Types.ITEM1_13_2, (Object)this.handleItemToClient(wrapper.user(), carried));
        });
        ((Protocol1_17To1_16_4)this.protocol).registerServerbound((ServerboundPacketType)ServerboundPackets1_16_2.CONTAINER_ACK, null, wrapper -> {
            wrapper.cancel();
            if (!ViaBackwards.getConfig().handlePingsAsInvAcknowledgements()) {
                return;
            }
            byte inventoryId = (Byte)wrapper.read((Type)Types.BYTE);
            short confirmationId = (Short)wrapper.read((Type)Types.SHORT);
            boolean accepted = (Boolean)wrapper.read((Type)Types.BOOLEAN);
            if (inventoryId == 0 && accepted) {
                PacketWrapper pongPacket = wrapper.create((PacketType)ServerboundPackets1_17.PONG);
                pongPacket.write((Type)Types.INT, (Object)confirmationId);
                pongPacket.sendToServer(Protocol1_17To1_16_4.class);
            }
        });
        ((Protocol1_17To1_16_4)this.protocol).replaceClientbound((ClientboundPacketType)ClientboundPackets1_17.LEVEL_PARTICLES, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT);
                this.map((Type)Types.BOOLEAN);
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.FLOAT);
                this.map((Type)Types.FLOAT);
                this.map((Type)Types.FLOAT);
                this.map((Type)Types.FLOAT);
                this.map((Type)Types.INT);
                this.handler(wrapper -> {
                    int id = (Integer)wrapper.get((Type)Types.INT, 0);
                    if (id == 16) {
                        wrapper.passthrough((Type)Types.FLOAT);
                        wrapper.passthrough((Type)Types.FLOAT);
                        wrapper.passthrough((Type)Types.FLOAT);
                        wrapper.passthrough((Type)Types.FLOAT);
                        wrapper.read((Type)Types.FLOAT);
                        wrapper.read((Type)Types.FLOAT);
                        wrapper.read((Type)Types.FLOAT);
                    } else if (id == 37) {
                        wrapper.set((Type)Types.INT, 0, (Object)-1);
                        wrapper.cancel();
                    }
                });
                this.handler(((Protocol1_17To1_16_4)BlockItemPacketRewriter1_17.this.protocol).getParticleRewriter().levelParticlesHandler1_13((Type)Types.INT));
            }
        });
        ((Protocol1_17To1_16_4)this.protocol).mergePacket(ClientboundPackets1_17.SET_BORDER_SIZE, ClientboundPackets1_16_2.SET_BORDER, 0);
        ((Protocol1_17To1_16_4)this.protocol).mergePacket(ClientboundPackets1_17.SET_BORDER_LERP_SIZE, ClientboundPackets1_16_2.SET_BORDER, 1);
        ((Protocol1_17To1_16_4)this.protocol).mergePacket(ClientboundPackets1_17.SET_BORDER_CENTER, ClientboundPackets1_16_2.SET_BORDER, 2);
        ((Protocol1_17To1_16_4)this.protocol).mergePacket(ClientboundPackets1_17.INITIALIZE_BORDER, ClientboundPackets1_16_2.SET_BORDER, 3);
        ((Protocol1_17To1_16_4)this.protocol).mergePacket(ClientboundPackets1_17.SET_BORDER_WARNING_DELAY, ClientboundPackets1_16_2.SET_BORDER, 4);
        ((Protocol1_17To1_16_4)this.protocol).mergePacket(ClientboundPackets1_17.SET_BORDER_WARNING_DISTANCE, ClientboundPackets1_16_2.SET_BORDER, 5);
        ((Protocol1_17To1_16_4)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_17.LIGHT_UPDATE, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.map((Type)Types.VAR_INT);
                this.map((Type)Types.BOOLEAN);
                this.handler(wrapper -> {
                    EntityTracker tracker = wrapper.user().getEntityTracker(Protocol1_17To1_16_4.class);
                    int startFromSection = Math.max(0, -(tracker.currentMinY() >> 4));
                    long[] skyLightMask = (long[])wrapper.read(Types.LONG_ARRAY_PRIMITIVE);
                    long[] blockLightMask = (long[])wrapper.read(Types.LONG_ARRAY_PRIMITIVE);
                    int cutSkyLightMask = BlockItemPacketRewriter1_17.this.cutLightMask(skyLightMask, startFromSection);
                    int cutBlockLightMask = BlockItemPacketRewriter1_17.this.cutLightMask(blockLightMask, startFromSection);
                    wrapper.write((Type)Types.VAR_INT, (Object)cutSkyLightMask);
                    wrapper.write((Type)Types.VAR_INT, (Object)cutBlockLightMask);
                    long[] emptySkyLightMask = (long[])wrapper.read(Types.LONG_ARRAY_PRIMITIVE);
                    long[] emptyBlockLightMask = (long[])wrapper.read(Types.LONG_ARRAY_PRIMITIVE);
                    wrapper.write((Type)Types.VAR_INT, (Object)BlockItemPacketRewriter1_17.this.cutLightMask(emptySkyLightMask, startFromSection));
                    wrapper.write((Type)Types.VAR_INT, (Object)BlockItemPacketRewriter1_17.this.cutLightMask(emptyBlockLightMask, startFromSection));
                    this.writeLightArrays(wrapper, BitSet.valueOf(skyLightMask), cutSkyLightMask, startFromSection, tracker.currentWorldSectionHeight());
                    this.writeLightArrays(wrapper, BitSet.valueOf(blockLightMask), cutBlockLightMask, startFromSection, tracker.currentWorldSectionHeight());
                });
            }

            private boolean isSet(int mask, int i) {
                return (mask & 1 << i) != 0;
            }

            private void writeLightArrays(PacketWrapper wrapper, BitSet bitMask, int cutBitMask, int startFromSection, int sectionHeight) {
                int i;
                int packetContentsLength = (Integer)wrapper.read((Type)Types.VAR_INT);
                int read = 0;
                ArrayList<byte[]> light = new ArrayList<byte[]>();
                for (i = 0; i < startFromSection; ++i) {
                    if (!bitMask.get(i)) continue;
                    ++read;
                    wrapper.read(Types.BYTE_ARRAY_PRIMITIVE);
                }
                for (i = 0; i < 18; ++i) {
                    if (!this.isSet(cutBitMask, i)) continue;
                    ++read;
                    light.add((byte[])wrapper.read(Types.BYTE_ARRAY_PRIMITIVE));
                }
                for (i = startFromSection + 18; i < sectionHeight + 2; ++i) {
                    if (!bitMask.get(i)) continue;
                    ++read;
                    wrapper.read(Types.BYTE_ARRAY_PRIMITIVE);
                }
                if (read != packetContentsLength) {
                    for (i = read; i < packetContentsLength; ++i) {
                        wrapper.read(Types.BYTE_ARRAY_PRIMITIVE);
                    }
                }
                for (byte[] bytes : light) {
                    wrapper.write(Types.BYTE_ARRAY_PRIMITIVE, (Object)bytes);
                }
            }
        });
        ((Protocol1_17To1_16_4)this.protocol).replaceClientbound((ClientboundPacketType)ClientboundPackets1_17.SECTION_BLOCKS_UPDATE, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.LONG);
                this.map((Type)Types.BOOLEAN);
                this.handler(wrapper -> {
                    BlockChangeRecord[] records;
                    long chunkPos = (Long)wrapper.get((Type)Types.LONG, 0);
                    int chunkY = (int)(chunkPos << 44 >> 44);
                    if (chunkY < 0 || chunkY > 15) {
                        wrapper.cancel();
                        return;
                    }
                    for (BlockChangeRecord record : records = (BlockChangeRecord[])wrapper.passthrough(Types.VAR_LONG_BLOCK_CHANGE_ARRAY)) {
                        if (ViaBackwards.getConfig().bedrockAtY0() && chunkY == 0 && record.getSectionY() == 0) {
                            record.setBlockId(33);
                            continue;
                        }
                        record.setBlockId(((Protocol1_17To1_16_4)BlockItemPacketRewriter1_17.this.protocol).getMappingData().getNewBlockStateId(record.getBlockId()));
                    }
                });
            }
        });
        ((Protocol1_17To1_16_4)this.protocol).replaceClientbound((ClientboundPacketType)ClientboundPackets1_17.BLOCK_UPDATE, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types.BLOCK_POSITION1_14);
                this.map((Type)Types.VAR_INT);
                this.handler(wrapper -> {
                    int y = ((BlockPosition)wrapper.get(Types.BLOCK_POSITION1_14, 0)).y();
                    if (y < 0 || y > 255) {
                        wrapper.cancel();
                        return;
                    }
                    if (ViaBackwards.getConfig().bedrockAtY0() && y == 0) {
                        wrapper.set((Type)Types.VAR_INT, 0, (Object)33);
                    } else {
                        wrapper.set((Type)Types.VAR_INT, 0, (Object)((Protocol1_17To1_16_4)BlockItemPacketRewriter1_17.this.protocol).getMappingData().getNewBlockStateId(((Integer)wrapper.get((Type)Types.VAR_INT, 0)).intValue()));
                    }
                });
            }
        });
        ((Protocol1_17To1_16_4)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_17.LEVEL_CHUNK, wrapper -> {
            ChunkSection lowestSection;
            EntityTracker tracker = wrapper.user().getEntityTracker(Protocol1_17To1_16_4.class);
            int currentWorldSectionHeight = tracker.currentWorldSectionHeight();
            Chunk chunk = (Chunk)wrapper.read((Type)new ChunkType1_17(currentWorldSectionHeight));
            wrapper.write(ChunkType1_16_2.TYPE, (Object)chunk);
            int startFromSection = Math.max(0, -(tracker.currentMinY() >> 4));
            chunk.setBiomeData(Arrays.copyOfRange(chunk.getBiomeData(), startFromSection * 64, startFromSection * 64 + 1024));
            chunk.setBitmask(this.cutMask(chunk.getChunkMask(), startFromSection, false));
            chunk.setChunkMask(null);
            ChunkSection[] sections = Arrays.copyOfRange(chunk.getSections(), startFromSection, startFromSection + 16);
            chunk.setSections(sections);
            CompoundTag heightMaps = chunk.getHeightMap();
            for (Tag heightMapTag : heightMaps.values()) {
                if (!(heightMapTag instanceof LongArrayTag)) continue;
                LongArrayTag heightMap = (LongArrayTag)heightMapTag;
                int[] heightMapData = new int[256];
                int bitsPerEntry = MathUtil.ceilLog2((int)((currentWorldSectionHeight << 4) + 1));
                CompactArrayUtil.iterateCompactArrayWithPadding((int)bitsPerEntry, (int)heightMapData.length, (long[])heightMap.getValue(), (i, v) -> {
                    heightMapData[i] = MathUtil.clamp((int)(v + tracker.currentMinY()), (int)0, (int)255);
                });
                heightMap.setValue(CompactArrayUtil.createCompactArrayWithPadding((int)9, (int)heightMapData.length, i -> heightMapData[i]));
            }
            ((Protocol1_17To1_16_4)this.protocol).getBlockRewriter().handleChunk(chunk);
            if (ViaBackwards.getConfig().bedrockAtY0() && (lowestSection = chunk.getSections()[0]) != null) {
                DataPalette blocks = lowestSection.palette(PaletteType.BLOCKS);
                for (int x = 0; x < 16; ++x) {
                    for (int z = 0; z < 16; ++z) {
                        blocks.setIdAt(x, 0, z, 33);
                    }
                }
            }
            chunk.getBlockEntities().removeIf(compound -> {
                NumberTag tag = compound.getNumberTag("y");
                if (tag == null) {
                    return false;
                }
                int y = tag.asInt();
                return y < 0 || y > 255 || ViaBackwards.getConfig().bedrockAtY0() && y == 0;
            });
        });
        ((Protocol1_17To1_16_4)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_17.BLOCK_ENTITY_DATA, wrapper -> {
            int y = ((BlockPosition)wrapper.passthrough(Types.BLOCK_POSITION1_14)).y();
            if (y < 0 || y > 255 || ViaBackwards.getConfig().bedrockAtY0() && y == 0) {
                wrapper.cancel();
            }
        });
        ((Protocol1_17To1_16_4)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_17.BLOCK_DESTRUCTION, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.handler(wrapper -> {
                    int y = ((BlockPosition)wrapper.passthrough(Types.BLOCK_POSITION1_14)).y();
                    if (y < 0 || y > 255 || ViaBackwards.getConfig().bedrockAtY0() && y == 0) {
                        wrapper.cancel();
                    }
                });
            }
        });
        ((Protocol1_17To1_16_4)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_17.MAP_ITEM_DATA, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.map((Type)Types.BYTE);
                this.handler(wrapper -> wrapper.write((Type)Types.BOOLEAN, (Object)true));
                this.map((Type)Types.BOOLEAN);
                this.handler(wrapper -> {
                    int iconCount;
                    boolean hasMarkers = (Boolean)wrapper.read((Type)Types.BOOLEAN);
                    if (hasMarkers) {
                        iconCount = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
                    } else {
                        wrapper.write((Type)Types.VAR_INT, (Object)0);
                        iconCount = 0;
                    }
                    MapColorRewriter.rewriteMapColors((PacketWrapper)wrapper, MapColorMappings1_16_4::getMappedColor, (int)iconCount);
                });
            }
        });
    }

    private int cutLightMask(long[] mask, int startFromSection) {
        if (mask.length == 0) {
            return 0;
        }
        return this.cutMask(BitSet.valueOf(mask), startFromSection, true);
    }
}

