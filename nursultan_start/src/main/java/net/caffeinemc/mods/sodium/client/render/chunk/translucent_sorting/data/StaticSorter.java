/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.CombinedCameraPos
 */
package net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data;

import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.CombinedCameraPos;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.PresentSorter;

class StaticSorter
extends PresentSorter {
    StaticSorter(int n) {
        this.initBufferWithQuadLength(n);
    }

    @Override
    public void writeIndexBuffer(CombinedCameraPos combinedCameraPos, boolean bl) {
    }
}

