/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.viabackwards.api.data.BackwardsMappingData
 *  com.viaversion.viaversion.libs.fastutil.ints.Int2ObjectMap
 *  com.viaversion.viaversion.libs.fastutil.ints.Int2ObjectOpenHashMap
 *  com.viaversion.viaversion.protocols.v1_12_2to1_13.Protocol1_12_2To1_13
 *  com.viaversion.viaversion.protocols.v1_12_2to1_13.data.StatisticMappings1_13
 */
package com.viaversion.viabackwards.protocol.v1_13to1_12_2.data;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.viabackwards.api.data.BackwardsMappingData;
import com.viaversion.viaversion.libs.fastutil.ints.Int2ObjectMap;
import com.viaversion.viaversion.libs.fastutil.ints.Int2ObjectOpenHashMap;
import com.viaversion.viaversion.protocols.v1_12_2to1_13.Protocol1_12_2To1_13;
import com.viaversion.viaversion.protocols.v1_12_2to1_13.data.StatisticMappings1_13;
import java.util.HashMap;
import java.util.Map;

public class BackwardsMappingData1_13
extends BackwardsMappingData {
    private final Int2ObjectMap<String> statisticMappings = new Int2ObjectOpenHashMap();
    private final Map<String, String> translateMappings = new HashMap<String, String>();

    public void loadExtras(CompoundTag data) {
        super.loadExtras(data);
        for (Map.Entry entry : StatisticMappings1_13.CUSTOM_STATS.entrySet()) {
            this.statisticMappings.put(((Integer)entry.getValue()).intValue(), (Object)((String)entry.getKey()));
        }
        for (Map.Entry entry : Protocol1_12_2To1_13.MAPPINGS.getTranslateMapping().entrySet()) {
            this.translateMappings.put((String)entry.getValue(), (String)entry.getKey());
        }
    }

    public BackwardsMappingData1_13() {
        super("1.13", "1.12", Protocol1_12_2To1_13.class);
    }

    public int getNewBlockStateId(int id) {
        if (id >= 5635 && id <= 5650) {
            id = id < 5639 ? (id += 4) : (id < 5643 ? (id -= 4) : (id < 5647 ? (id += 4) : (id -= 4)));
        }
        int mappedId = super.getNewBlockStateId(id);
        return switch (mappedId) {
            case 1595, 1596, 1597 -> 1584;
            case 1611, 1612, 1613 -> 1600;
            default -> mappedId;
        };
    }

    protected int checkValidity(int id, int mappedId, String type) {
        return mappedId;
    }

    public Map<String, String> getTranslateMappings() {
        return this.translateMappings;
    }

    public Int2ObjectMap<String> getStatisticMappings() {
        return this.statisticMappings;
    }
}

