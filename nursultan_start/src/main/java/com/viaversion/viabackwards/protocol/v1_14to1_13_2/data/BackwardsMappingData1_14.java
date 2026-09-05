/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.viabackwards.ViaBackwards
 *  com.viaversion.viabackwards.api.data.BackwardsMappingData
 *  com.viaversion.viaversion.protocols.v1_13_2to1_14.Protocol1_13_2To1_14
 */
package com.viaversion.viabackwards.protocol.v1_14to1_13_2.data;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.viabackwards.ViaBackwards;
import com.viaversion.viabackwards.api.data.BackwardsMappingData;
import com.viaversion.viaversion.protocols.v1_13_2to1_14.Protocol1_13_2To1_14;

public final class BackwardsMappingData1_14
extends BackwardsMappingData {
    protected void loadExtras(CompoundTag data) {
        super.loadExtras(data);
        if (ViaBackwards.getConfig().scaffoldingToWater()) {
            for (int i = 11099; i <= 11130; ++i) {
                this.blockStateMappings.setNewId(i, 49);
            }
        }
    }

    public BackwardsMappingData1_14() {
        super("1.14", "1.13.2", Protocol1_13_2To1_14.class);
    }
}

