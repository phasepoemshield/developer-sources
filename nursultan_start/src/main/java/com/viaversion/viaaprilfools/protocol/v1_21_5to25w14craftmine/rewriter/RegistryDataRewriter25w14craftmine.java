/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viaversion.api.minecraft.RegistryEntry
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.rewriter.RegistryDataRewriter
 */
package com.viaversion.viaaprilfools.protocol.v1_21_5to25w14craftmine.rewriter;

import com.viaversion.nbt.tag.Tag;
import com.viaversion.viaaprilfools.protocol.v1_21_5to25w14craftmine.data.DimensionTypes25w14craftmine;
import com.viaversion.viaversion.api.minecraft.RegistryEntry;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.rewriter.RegistryDataRewriter;

public final class RegistryDataRewriter25w14craftmine
extends RegistryDataRewriter {
    public RegistryDataRewriter25w14craftmine(Protocol<?, ?, ?, ?> protocol) {
        super(protocol);
        this.addHandler("dimension_type", (key, compoundTag) -> compoundTag.put("effects", (Tag)DimensionTypes25w14craftmine.getOverworldCavesDimensionEffectsTag()));
        this.addEntries("dimension_type", new RegistryEntry[]{new RegistryEntry("minecraft:generated", (Tag)DimensionTypes25w14craftmine.getGeneratedDimensionTag())});
    }
}

