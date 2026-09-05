/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.viabackwards.api.data.BackwardsMappingData
 *  com.viaversion.viaversion.libs.fastutil.ints.Int2ObjectMap
 *  com.viaversion.viaversion.libs.fastutil.ints.Int2ObjectOpenHashMap
 *  com.viaversion.viaversion.libs.fastutil.objects.Object2IntMap$Entry
 *  com.viaversion.viaversion.protocols.v1_17_1to1_18.Protocol1_17_1To1_18
 *  com.viaversion.viaversion.protocols.v1_17_1to1_18.data.BlockEntities1_18
 */
package com.viaversion.viabackwards.protocol.v1_18to1_17_1.data;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.viabackwards.api.data.BackwardsMappingData;
import com.viaversion.viaversion.libs.fastutil.ints.Int2ObjectMap;
import com.viaversion.viaversion.libs.fastutil.ints.Int2ObjectOpenHashMap;
import com.viaversion.viaversion.libs.fastutil.objects.Object2IntMap;
import com.viaversion.viaversion.protocols.v1_17_1to1_18.Protocol1_17_1To1_18;
import com.viaversion.viaversion.protocols.v1_17_1to1_18.data.BlockEntities1_18;

public final class BackwardsMappingData1_18
extends BackwardsMappingData {
    private final Int2ObjectMap<String> blockEntities = new Int2ObjectOpenHashMap();

    protected void loadExtras(CompoundTag data) {
        super.loadExtras(data);
        for (Object2IntMap.Entry entry : BlockEntities1_18.blockEntityIds().object2IntEntrySet()) {
            this.blockEntities.put(entry.getIntValue(), (Object)((String)entry.getKey()));
        }
    }

    public BackwardsMappingData1_18() {
        super("1.18", "1.17", Protocol1_17_1To1_18.class);
    }

    public Int2ObjectMap<String> blockEntities() {
        return this.blockEntities;
    }
}

