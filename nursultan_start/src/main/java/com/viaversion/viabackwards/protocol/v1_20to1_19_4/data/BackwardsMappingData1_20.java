/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.viabackwards.api.data.BackwardsMappingData
 *  com.viaversion.viabackwards.api.data.BackwardsMappingDataLoader
 *  com.viaversion.viaversion.protocols.v1_19_4to1_20.Protocol1_19_4To1_20
 */
package com.viaversion.viabackwards.protocol.v1_20to1_19_4.data;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.viabackwards.api.data.BackwardsMappingData;
import com.viaversion.viabackwards.api.data.BackwardsMappingDataLoader;
import com.viaversion.viaversion.protocols.v1_19_4to1_20.Protocol1_19_4To1_20;

public class BackwardsMappingData1_20
extends BackwardsMappingData {
    private CompoundTag trimPatternRegistry;

    protected void loadExtras(CompoundTag data) {
        super.loadExtras(data);
        this.trimPatternRegistry = BackwardsMappingDataLoader.INSTANCE.loadNBT("trim_pattern-1.19.4.nbt");
    }

    public BackwardsMappingData1_20() {
        super("1.20", "1.19.4", Protocol1_19_4To1_20.class);
    }

    public CompoundTag getTrimPatternRegistry() {
        return this.trimPatternRegistry.copy();
    }
}

