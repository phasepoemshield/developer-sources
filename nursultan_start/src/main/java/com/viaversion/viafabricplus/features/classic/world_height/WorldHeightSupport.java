/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.chunks.Chunk
 *  com.viaversion.viaversion.api.minecraft.chunks.ChunkSection
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.chunk.ChunkType1_17
 *  com.viaversion.viaversion.exception.InformativeException
 *  net.raphimc.vialegacy.api.LegacyProtocolVersion
 *  net.raphimc.vialegacy.protocol.classic.c0_28_30toa1_0_15.provider.ClassicWorldHeightProvider
 */
package com.viaversion.viafabricplus.features.classic.world_height;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.viafabricplus.features.classic.world_height.WorldHeightSupport$1;
import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.chunks.Chunk;
import com.viaversion.viaversion.api.minecraft.chunks.ChunkSection;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.chunk.ChunkType1_17;
import com.viaversion.viaversion.exception.InformativeException;
import java.util.BitSet;
import net.raphimc.vialegacy.api.LegacyProtocolVersion;
import net.raphimc.vialegacy.protocol.classic.c0_28_30toa1_0_15.provider.ClassicWorldHeightProvider;

public final class WorldHeightSupport {
    private static void changeDimensionTagHeight(UserConnection userConnection, CompoundTag compoundTag) {
        compoundTag.putInt("height", ((ClassicWorldHeightProvider)Via.getManager().getProviders().get(ClassicWorldHeightProvider.class)).getMaxChunkSectionCount(userConnection) << 4);
    }

    private static /* synthetic */ void lambda$handleUpdateLight$3(PacketHandler packetHandler, PacketHandler packetHandler2, PacketWrapper packetWrapper) throws InformativeException {
        if (packetWrapper.user().getProtocolInfo().serverProtocolVersion().olderThanOrEqualTo(LegacyProtocolVersion.c0_28toc0_30)) {
            packetHandler.handle(packetWrapper);
        } else {
            packetHandler2.handle(packetWrapper);
        }
    }

    public static PacketHandler handleRespawn(PacketHandler packetHandler) {
        return packetWrapper -> {
            packetHandler.handle(packetWrapper);
            if (packetWrapper.isCancelled()) {
                return;
            }
            if (packetWrapper.user().getProtocolInfo().serverProtocolVersion().olderThanOrEqualTo(LegacyProtocolVersion.c0_28toc0_30)) {
                WorldHeightSupport.changeDimensionTagHeight(packetWrapper.user(), (CompoundTag)packetWrapper.get(Types.NAMED_COMPOUND_TAG, 0));
            }
        };
    }

    public static PacketHandler handleJoinGame(PacketHandler packetHandler) {
        return packetWrapper -> {
            packetHandler.handle(packetWrapper);
            if (packetWrapper.isCancelled()) {
                return;
            }
            if (packetWrapper.user().getProtocolInfo().serverProtocolVersion().olderThanOrEqualTo(LegacyProtocolVersion.c0_28toc0_30)) {
                for (CompoundTag compoundTag : ((CompoundTag)packetWrapper.get(Types.NAMED_COMPOUND_TAG, 0)).getCompoundTag("minecraft:dimension_type").getListTag("value", CompoundTag.class)) {
                    WorldHeightSupport.changeDimensionTagHeight(packetWrapper.user(), compoundTag.getCompoundTag("element"));
                }
                WorldHeightSupport.changeDimensionTagHeight(packetWrapper.user(), (CompoundTag)packetWrapper.get(Types.NAMED_COMPOUND_TAG, 1));
            }
        };
    }

    public static PacketHandler handleUpdateLight(PacketHandler packetHandler) {
        WorldHeightSupport$1 worldHeightSupport$1 = new WorldHeightSupport$1();
        return arg_0 -> WorldHeightSupport.lambda$handleUpdateLight$3((PacketHandler)worldHeightSupport$1, packetHandler, arg_0);
    }

    public static PacketHandler handleChunkData(PacketHandler packetHandler) {
        return packetWrapper -> {
            packetHandler.handle(packetWrapper);
            if (packetWrapper.isCancelled()) {
                return;
            }
            if (packetWrapper.user().getProtocolInfo().serverProtocolVersion().olderThanOrEqualTo(LegacyProtocolVersion.c0_28toc0_30)) {
                ChunkSection[] chunkSectionArray;
                packetWrapper.resetReader();
                Chunk chunk = (Chunk)packetWrapper.read((Type)new ChunkType1_17(16));
                packetWrapper.write((Type)new ChunkType1_17(chunk.getSections().length), (Object)chunk);
                ClassicWorldHeightProvider classicWorldHeightProvider = (ClassicWorldHeightProvider)Via.getManager().getProviders().get(ClassicWorldHeightProvider.class);
                if (chunk.getSections().length < classicWorldHeightProvider.getMaxChunkSectionCount(packetWrapper.user())) {
                    chunkSectionArray = new ChunkSection[classicWorldHeightProvider.getMaxChunkSectionCount(packetWrapper.user())];
                    System.arraycopy(chunk.getSections(), 0, chunkSectionArray, 0, chunk.getSections().length);
                    chunk.setSections(chunkSectionArray);
                }
                chunkSectionArray = new BitSet();
                for (int i = 0; i < chunk.getSections().length; ++i) {
                    if (chunk.getSections()[i] == null) continue;
                    chunkSectionArray.set(i);
                }
                chunk.setChunkMask((BitSet)chunkSectionArray);
                int[] nArray = new int[chunk.getSections().length * 4 * 4 * 4];
                System.arraycopy(chunk.getBiomeData(), 0, nArray, 0, chunk.getBiomeData().length);
                for (int i = 64; i < chunk.getSections().length * 4; ++i) {
                    System.arraycopy(chunk.getBiomeData(), chunk.getBiomeData().length - 16, nArray, i * 16, 16);
                }
                chunk.setBiomeData(nArray);
                chunk.setHeightMap(new CompoundTag());
            }
        };
    }
}

