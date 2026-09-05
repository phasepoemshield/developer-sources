/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01296
 *  net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.SortType
 */
package net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data;

import minecraft.class01296;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.SortType;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.PresentTranslucentData;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.Sorter;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.StaticSorter;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.StaticTopoData$QuadIndexConsumerIntoBuffer;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.TopoGraphSorting;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.quad.TQuad;

public class StaticTopoData
extends PresentTranslucentData {
    private Sorter sorterOnce;

    StaticTopoData(class01296 class012962, int n) {
        super(class012962, n);
    }

    @Override
    public SortType getSortType() {
        return SortType.STATIC_TOPO;
    }

    public static StaticTopoData fromMesh(TQuad[] tQuadArray, class01296 class012962, boolean bl) {
        StaticSorter staticSorter = new StaticSorter(tQuadArray.length);
        StaticTopoData$QuadIndexConsumerIntoBuffer staticTopoData$QuadIndexConsumerIntoBuffer = new StaticTopoData$QuadIndexConsumerIntoBuffer(staticSorter.getIntBuffer());
        if (!TopoGraphSorting.topoGraphSort(staticTopoData$QuadIndexConsumerIntoBuffer, tQuadArray, null, null, bl)) {
            staticSorter.getIndexBuffer().free();
            return null;
        }
        StaticTopoData staticTopoData = new StaticTopoData(class012962, tQuadArray.length);
        staticTopoData.sorterOnce = staticSorter;
        return staticTopoData;
    }

    @Override
    public Sorter getSorter() {
        Sorter sorter = this.sorterOnce;
        if (sorter == null) {
            throw new IllegalStateException("Sorter already used!");
        }
        this.sorterOnce = null;
        return sorter;
    }
}

