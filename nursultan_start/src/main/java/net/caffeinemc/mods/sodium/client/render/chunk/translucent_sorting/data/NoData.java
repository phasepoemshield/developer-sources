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
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.TranslucentData;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.quad.TQuad;

public class NoData
extends TranslucentData {
    private final SortType reason;

    private NoData(class01296 class012962, SortType sortType) {
        super(class012962);
        this.reason = sortType;
    }

    public static NoData forEmptySection(class01296 class012962) {
        return new NoData(class012962, SortType.EMPTY_SECTION);
    }

    public static NoData forNoTranslucent(class01296 class012962) {
        return new NoData(class012962, SortType.NO_TRANSLUCENT);
    }

    @Override
    public boolean oldDataMatches(TranslucentGeometryCollector translucentGeometryCollector, SortType sortType, TQuad[] tQuadArray) {
        return false;
    }

    @Override
    public SortType getSortType() {
        return this.reason;
    }
}

