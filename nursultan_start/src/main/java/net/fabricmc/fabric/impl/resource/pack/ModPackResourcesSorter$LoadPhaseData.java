/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.fabric.api.resource.v1.pack.ModPackResources
 *  net.fabricmc.fabric.impl.base.toposort.SortableNode
 */
package net.fabricmc.fabric.impl.resource.pack;

import java.util.Arrays;
import net.fabricmc.fabric.api.resource.v1.pack.ModPackResources;
import net.fabricmc.fabric.impl.base.toposort.SortableNode;

public class ModPackResourcesSorter$LoadPhaseData
extends SortableNode<ModPackResourcesSorter$LoadPhaseData> {
    final String modId;
    ModPackResources[] packs;

    ModPackResourcesSorter$LoadPhaseData(String string) {
        this.modId = string;
        this.packs = new ModPackResources[0];
    }

    public String getDescription() {
        return this.modId;
    }

    void addPack(ModPackResources modPackResources) {
        int n = this.packs.length;
        this.packs = Arrays.copyOf(this.packs, n + 1);
        this.packs[n] = modPackResources;
    }
}

