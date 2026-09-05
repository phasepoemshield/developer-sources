/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data;

import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.CombinedCameraPos;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.DynamicBSPData;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.DynamicSorter;

class DynamicBSPData$DynamicBSPSorter
extends DynamicSorter {
    final /* synthetic */ DynamicBSPData this$0;

    DynamicBSPData$DynamicBSPSorter(DynamicBSPData dynamicBSPData, int n) {
        this.this$0 = dynamicBSPData;
        super(n);
    }

    @Override
    void writeSort(CombinedCameraPos combinedCameraPos, boolean bl) {
        this.this$0.rootNode.collectSortedQuads(this.getIndexBuffer(), combinedCameraPos.getRelativeCameraPos());
    }
}

