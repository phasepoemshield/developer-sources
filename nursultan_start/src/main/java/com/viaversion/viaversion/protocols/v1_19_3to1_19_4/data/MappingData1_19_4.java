/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.viaversion.api.data.MappingDataBase
 *  com.viaversion.viaversion.api.data.MappingDataLoader
 */
package com.viaversion.viaversion.protocols.v1_19_3to1_19_4.data;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.viaversion.api.data.MappingDataBase;
import com.viaversion.viaversion.api.data.MappingDataLoader;

public final class MappingData1_19_4
extends MappingDataBase {
    private CompoundTag damageTypesRegistry;

    protected void loadExtras(CompoundTag data) {
        this.damageTypesRegistry = MappingDataLoader.INSTANCE.loadNBTFromFile("damage-types-1.19.4.nbt");
    }

    public MappingData1_19_4() {
        super("1.19.3", "1.19.4");
    }

    public CompoundTag damageTypesRegistry() {
        return this.damageTypesRegistry.copy();
    }
}

