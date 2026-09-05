/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.BlockPosition
 *  com.viaversion.viaversion.api.platform.providers.Provider
 *  com.viaversion.viaversion.protocols.v1_12_2to1_13.blockconnections.providers.UserBlockData
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package com.viaversion.viaversion.protocols.v1_12_2to1_13.blockconnections.providers;

import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.BlockPosition;
import com.viaversion.viaversion.api.platform.providers.Provider;
import com.viaversion.viaversion.protocols.v1_12_2to1_13.Protocol1_12_2To1_13;
import com.viaversion.viaversion.protocols.v1_12_2to1_13.blockconnections.providers.UserBlockData;
import org.checkerframework.checker.nullness.qual.Nullable;

public abstract class BlockConnectionProvider
implements Provider {
    public UserBlockData forUser(UserConnection connection) {
        return (x, y, z) -> this.getBlockData(connection, x, y, z);
    }

    public void storeBlock(UserConnection connection, int x, int y, int z, int blockState) {
    }

    public void unloadChunk(UserConnection connection, int x, int z) {
    }

    public void unloadChunkSection(UserConnection connection, int chunkX, int chunkY, int chunkZ) {
    }

    public void removeBlock(UserConnection connection, int x, int y, int z) {
    }

    public boolean storesBlocks(UserConnection user, @Nullable BlockPosition position) {
        return false;
    }

    public void modifiedBlock(UserConnection connection, BlockPosition position) {
    }

    public int getBlockData(UserConnection connection, int x, int y, int z) {
        int oldId = this.getWorldBlockData(connection, x, y, z);
        return Protocol1_12_2To1_13.MAPPINGS.getBlockMappings().getNewId(oldId);
    }

    public void clearStorage(UserConnection connection) {
    }

    public int getWorldBlockData(UserConnection connection, int x, int y, int z) {
        return -1;
    }
}

