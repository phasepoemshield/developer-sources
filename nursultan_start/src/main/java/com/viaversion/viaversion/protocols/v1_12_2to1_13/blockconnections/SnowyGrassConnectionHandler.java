/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.BlockFace
 *  com.viaversion.viaversion.api.minecraft.BlockPosition
 *  com.viaversion.viaversion.libs.fastutil.ints.IntOpenHashSet
 *  com.viaversion.viaversion.libs.fastutil.ints.IntSet
 *  com.viaversion.viaversion.libs.fastutil.objects.Object2IntMap
 *  com.viaversion.viaversion.libs.fastutil.objects.Object2IntOpenHashMap
 */
package com.viaversion.viaversion.protocols.v1_12_2to1_13.blockconnections;

import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.BlockFace;
import com.viaversion.viaversion.api.minecraft.BlockPosition;
import com.viaversion.viaversion.libs.fastutil.ints.IntOpenHashSet;
import com.viaversion.viaversion.libs.fastutil.ints.IntSet;
import com.viaversion.viaversion.libs.fastutil.objects.Object2IntMap;
import com.viaversion.viaversion.libs.fastutil.objects.Object2IntOpenHashMap;
import com.viaversion.viaversion.protocols.v1_12_2to1_13.blockconnections.ConnectionData;
import com.viaversion.viaversion.protocols.v1_12_2to1_13.blockconnections.ConnectionHandler;
import java.util.HashSet;

public class SnowyGrassConnectionHandler
implements ConnectionHandler {
    private static final Object2IntMap<GrassBlock> GRASS_BLOCKS = new Object2IntOpenHashMap();
    private static final IntSet SNOWY_GRASS_BLOCKS = new IntOpenHashSet();

    static ConnectionData.ConnectorInitAction init() {
        HashSet<String> snowyGrassBlocks = new HashSet<String>();
        snowyGrassBlocks.add("minecraft:grass_block");
        snowyGrassBlocks.add("minecraft:podzol");
        snowyGrassBlocks.add("minecraft:mycelium");
        GRASS_BLOCKS.defaultReturnValue(-1);
        SnowyGrassConnectionHandler handler = new SnowyGrassConnectionHandler();
        return blockData -> {
            if (snowyGrassBlocks.contains(blockData.getMinecraftKey())) {
                ConnectionData.connectionHandlerMap.put(blockData.getSavedBlockStateId(), (Object)handler);
                blockData.set("snowy", "true");
                GRASS_BLOCKS.put((Object)new GrassBlock(blockData.getSavedBlockStateId(), true), blockData.getBlockStateId());
                blockData.set("snowy", "false");
                GRASS_BLOCKS.put((Object)new GrassBlock(blockData.getSavedBlockStateId(), false), blockData.getBlockStateId());
            }
            if (blockData.getMinecraftKey().equals("minecraft:snow") || blockData.getMinecraftKey().equals("minecraft:snow_block")) {
                ConnectionData.connectionHandlerMap.put(blockData.getSavedBlockStateId(), (Object)handler);
                SNOWY_GRASS_BLOCKS.add(blockData.getSavedBlockStateId());
            }
        };
    }

    @Override
    public int connect(UserConnection user, BlockPosition position, int blockState) {
        int blockUpId = this.getBlockData(user, position.getRelative(BlockFace.TOP));
        int newId = GRASS_BLOCKS.getInt((Object)new GrassBlock(blockState, SNOWY_GRASS_BLOCKS.contains(blockUpId)));
        return newId != -1 ? newId : blockState;
    }

    private record GrassBlock(int blockStateId, boolean snowy) {
    }
}

