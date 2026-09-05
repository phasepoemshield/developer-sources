/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.StringTag
 *  com.viaversion.viabackwards.protocol.v1_13to1_12_2.data.EntityNameMappings1_12_2
 */
package com.viaversion.viabackwards.protocol.v1_13to1_12_2.block_entity_handlers;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.StringTag;
import com.viaversion.viabackwards.protocol.v1_13to1_12_2.data.EntityNameMappings1_12_2;
import com.viaversion.viabackwards.protocol.v1_13to1_12_2.provider.BackwardsBlockEntityProvider;

public class SpawnerHandler
implements BackwardsBlockEntityProvider.BackwardsBlockEntityHandler {
    @Override
    public CompoundTag transform(int blockId, CompoundTag tag) {
        StringTag idTag;
        CompoundTag dataTag = tag.getCompoundTag("SpawnData");
        if (dataTag != null && (idTag = dataTag.getStringTag("id")) != null) {
            idTag.setValue(EntityNameMappings1_12_2.rewrite((String)idTag.getValue()));
        }
        return tag;
    }
}

