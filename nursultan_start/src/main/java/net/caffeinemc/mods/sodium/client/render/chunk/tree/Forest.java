/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.caffeinemc.mods.sodium.client.render.chunk.RenderSection
 */
package net.caffeinemc.mods.sodium.client.render.chunk.tree;

import net.caffeinemc.mods.sodium.client.render.chunk.RenderSection;

public interface Forest {
    public void add(int var1, int var2, int var3);

    default public void add(RenderSection renderSection) {
        this.add(renderSection.getChunkX(), renderSection.getChunkY(), renderSection.getChunkZ());
    }

    public int getPresence(int var1, int var2, int var3);

    default public boolean isSectionPresent(int n, int n2, int n3) {
        return this.getPresence(n, n2, n3) == 1;
    }
}

