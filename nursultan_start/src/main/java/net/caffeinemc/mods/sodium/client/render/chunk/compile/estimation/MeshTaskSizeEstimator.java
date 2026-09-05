/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03448
 *  net.caffeinemc.mods.sodium.client.render.chunk.RenderSection
 */
package net.caffeinemc.mods.sodium.client.render.chunk.compile.estimation;

import java.util.EnumMap;
import java.util.Map;
import minecraft.class03448;
import net.caffeinemc.mods.sodium.client.render.chunk.RenderSection;
import net.caffeinemc.mods.sodium.client.render.chunk.compile.estimation.Average1DEstimator;
import net.caffeinemc.mods.sodium.client.render.chunk.compile.estimation.MeshResultSize;
import net.caffeinemc.mods.sodium.client.render.chunk.compile.estimation.MeshResultSize$SectionCategory;
import net.caffeinemc.mods.sodium.client.render.chunk.region.RenderRegion;

public class MeshTaskSizeEstimator
extends Average1DEstimator<MeshResultSize$SectionCategory> {
    public static final float NEW_DATA_RATIO = 0.02f;
    private final int seaLevelChunk;

    public long estimateSize(RenderSection renderSection) {
        long l = renderSection.getLastMeshResultSize();
        if (l != MeshResultSize.NO_DATA) {
            return l;
        }
        return this.predict(MeshResultSize$SectionCategory.forSection(renderSection, this.seaLevelChunk));
    }

    public MeshTaskSizeEstimator(class03448 class034482) {
        super(0.02f, RenderRegion.SECTION_BUFFER_ESTIMATE);
        this.seaLevelChunk = class034482.method_8615() >> 4;
    }

    @Override
    protected <T> Map<MeshResultSize$SectionCategory, T> createMap() {
        return new EnumMap(MeshResultSize$SectionCategory.class);
    }

    public MeshResultSize resultForSection(RenderSection renderSection, long l) {
        return new MeshResultSize(MeshResultSize$SectionCategory.forSection(renderSection, this.seaLevelChunk), l);
    }
}

