/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.caffeinemc.mods.sodium.client.render.chunk.compile.estimation.MeshResultSize
 */
package net.caffeinemc.mods.sodium.client.render.chunk.compile;

import net.caffeinemc.mods.sodium.client.render.chunk.RenderSection;
import net.caffeinemc.mods.sodium.client.render.chunk.compile.estimation.MeshResultSize;

public abstract class BuilderTaskOutput {
    public final RenderSection render;
    public final int submitTime;
    private long resultSize = MeshResultSize.NO_DATA;

    public BuilderTaskOutput(RenderSection renderSection, int n) {
        this.render = renderSection;
        this.submitTime = n;
    }

    public void destroy() {
    }

    public long getResultSize() {
        if (this.resultSize == MeshResultSize.NO_DATA) {
            this.resultSize = this.calculateResultSize();
        }
        return this.resultSize;
    }

    protected abstract long calculateResultSize();
}

