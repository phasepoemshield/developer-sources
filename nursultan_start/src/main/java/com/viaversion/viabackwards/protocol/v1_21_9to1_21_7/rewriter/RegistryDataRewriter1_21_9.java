/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.viabackwards.api.BackwardsProtocol
 *  com.viaversion.viabackwards.api.rewriters.BackwardsRegistryRewriter
 *  com.viaversion.viabackwards.protocol.v1_21_9to1_21_7.storage.DimensionScaleStorage
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.RegistryEntry
 */
package com.viaversion.viabackwards.protocol.v1_21_9to1_21_7.rewriter;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.viabackwards.api.BackwardsProtocol;
import com.viaversion.viabackwards.api.rewriters.BackwardsRegistryRewriter;
import com.viaversion.viabackwards.protocol.v1_21_9to1_21_7.storage.DimensionScaleStorage;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.RegistryEntry;

public final class RegistryDataRewriter1_21_9
extends BackwardsRegistryRewriter {
    public RegistryDataRewriter1_21_9(BackwardsProtocol<?, ?, ?, ?> protocol) {
        super(protocol);
    }

    public void trackDimensionAndBiomes(UserConnection connection, String registryKey, RegistryEntry[] entries) {
        super.trackDimensionAndBiomes(connection, registryKey, entries);
        if (!registryKey.equals("dimension_type")) {
            return;
        }
        DimensionScaleStorage dimensionScaleStorage = (DimensionScaleStorage)connection.get(DimensionScaleStorage.class);
        for (int i = 0; i < entries.length; ++i) {
            RegistryEntry entry = entries[i];
            CompoundTag dimension = (CompoundTag)entry.tag();
            if (dimension == null) continue;
            double coordinateScale = dimension.getDouble("coordinate_scale", 1.0);
            dimensionScaleStorage.setScale(i, coordinateScale);
        }
    }
}

