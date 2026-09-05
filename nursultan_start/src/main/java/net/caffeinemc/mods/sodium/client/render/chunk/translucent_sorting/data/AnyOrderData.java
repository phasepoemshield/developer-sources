/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01296
 *  net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.PresentTranslucentData
 *  net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.SharedIndexSorter
 *  net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.Sorter
 *  net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.quad.TQuad
 */
package net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data;

import minecraft.class01296;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.SortType;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.TranslucentGeometryCollector;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.PresentTranslucentData;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.SharedIndexSorter;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.Sorter;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.quad.TQuad;

public class AnyOrderData
extends PresentTranslucentData {
    private Sorter sorterOnce;

    AnyOrderData(class01296 class012962, int n) {
        super(class012962, n);
    }

    public boolean oldDataMatches(TranslucentGeometryCollector translucentGeometryCollector, SortType sortType, TQuad[] tQuadArray) {
        return sortType == SortType.NONE && this.getInputQuadCount() == tQuadArray.length;
    }

    public SortType getSortType() {
        return SortType.NONE;
    }

    public static AnyOrderData fromMesh(TQuad[] tQuadArray, class01296 class012962) {
        AnyOrderData anyOrderData = new AnyOrderData(class012962, tQuadArray.length);
        anyOrderData.sorterOnce = new SharedIndexSorter(tQuadArray.length);
        return anyOrderData;
    }

    public Sorter getSorter() {
        Sorter sorter = this.sorterOnce;
        if (sorter == null) {
            throw new IllegalStateException("Sorter already used!");
        }
        this.sorterOnce = null;
        return sorter;
    }
}

