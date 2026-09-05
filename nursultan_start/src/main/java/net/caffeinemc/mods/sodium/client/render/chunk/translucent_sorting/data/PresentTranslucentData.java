/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01296
 *  net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.SortType
 *  net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.TranslucentGeometryCollector
 */
package net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data;

import minecraft.class01296;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.SortType;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.TranslucentGeometryCollector;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.Sorter;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.TranslucentData;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.quad.TQuad;

public abstract class PresentTranslucentData
extends TranslucentData {
    private final int inputQuadCount;
    private int quadHash;

    PresentTranslucentData(class01296 class012962, int n) {
        super(class012962);
        this.inputQuadCount = n;
    }

    public void setQuadHash(int n) {
        this.quadHash = n;
    }

    @Override
    public boolean oldDataMatches(TranslucentGeometryCollector translucentGeometryCollector, SortType sortType, TQuad[] tQuadArray) {
        return this.getInputQuadCount() == tQuadArray.length && this.hashMatches(translucentGeometryCollector);
    }

    protected boolean hashMatches(TranslucentGeometryCollector translucentGeometryCollector) {
        return this.quadHash == translucentGeometryCollector.getQuadHash();
    }

    public int getIndexQuadCount() {
        return this.inputQuadCount;
    }

    public int getInputQuadCount() {
        return this.inputQuadCount;
    }

    public abstract Sorter getSorter();
}

