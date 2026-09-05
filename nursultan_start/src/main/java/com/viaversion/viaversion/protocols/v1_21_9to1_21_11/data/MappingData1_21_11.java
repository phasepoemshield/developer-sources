/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.viaversion.api.data.MappingDataBase
 *  com.viaversion.viaversion.api.data.MappingDataLoader
 */
package com.viaversion.viaversion.protocols.v1_21_9to1_21_11.data;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.viaversion.api.data.MappingDataBase;
import com.viaversion.viaversion.api.data.MappingDataLoader;

public final class MappingData1_21_11
extends MappingDataBase {
    private CompoundTag timelineRegistry;

    protected void loadExtras(CompoundTag data) {
        this.timelineRegistry = MappingDataLoader.INSTANCE.loadNBTFromFile("timeline-registry-1.21.11.nbt");
    }

    public MappingData1_21_11() {
        super("1.21.9", "1.21.11");
    }

    public CompoundTag timelineRegistry() {
        return this.timelineRegistry;
    }
}

