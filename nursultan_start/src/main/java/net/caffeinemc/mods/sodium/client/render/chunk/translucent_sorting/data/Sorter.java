/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.CombinedCameraPos
 */
package net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data;

import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.CombinedCameraPos;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.PresentSortData;

public interface Sorter
extends PresentSortData {
    public void destroy();

    public void writeIndexBuffer(CombinedCameraPos var1, boolean var2);
}

