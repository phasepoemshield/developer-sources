/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.ListTag
 *  com.viaversion.viaversion.api.data.MappingDataBase
 *  com.viaversion.viaversion.api.data.MappingDataLoader
 *  com.viaversion.viaversion.util.TagUtil
 */
package com.viaversion.viaversion.protocols.v1_16_1to1_16_2.data;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.ListTag;
import com.viaversion.viaversion.api.data.MappingDataBase;
import com.viaversion.viaversion.api.data.MappingDataLoader;
import com.viaversion.viaversion.util.TagUtil;
import java.util.HashMap;
import java.util.Map;

public class MappingData1_16_2
extends MappingDataBase {
    private final Map<String, CompoundTag> dimensionDataMap = new HashMap<String, CompoundTag>();
    private CompoundTag dimensionRegistry;

    public void loadExtras(CompoundTag data) {
        this.dimensionRegistry = MappingDataLoader.INSTANCE.loadNBTFromFile("dimension-registry-1.16.2.nbt");
        ListTag dimensions = TagUtil.getRegistryEntries((CompoundTag)this.dimensionRegistry, (String)"dimension_type");
        for (CompoundTag dimension : dimensions) {
            CompoundTag dimensionData = dimension.getCompoundTag("element").copy();
            this.dimensionDataMap.put(dimension.getStringTag("name").getValue(), dimensionData);
        }
    }

    public MappingData1_16_2() {
        super("1.16", "1.16.2");
    }

    public CompoundTag getDimensionRegistry() {
        return this.dimensionRegistry.copy();
    }

    public Map<String, CompoundTag> getDimensionDataMap() {
        return this.dimensionDataMap;
    }
}

