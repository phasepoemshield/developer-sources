/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.caffeinemc.mods.sodium.client.render.chunk.RenderSection
 */
package net.caffeinemc.mods.sodium.client.render.chunk.compile.estimation;

import net.caffeinemc.mods.sodium.client.render.chunk.RenderSection;

public enum MeshResultSize$SectionCategory {
    LOW,
    UNDERGROUND,
    WATER_LEVEL,
    SURFACE,
    HIGH;


    public static MeshResultSize$SectionCategory forSection(RenderSection renderSection, int n) {
        int n2 = renderSection.getChunkY();
        if (n2 == n) {
            return WATER_LEVEL;
        }
        if (n2 < n - 4) {
            return LOW;
        }
        if (n2 < n) {
            return UNDERGROUND;
        }
        if (n2 < n + 3) {
            return SURFACE;
        }
        return HIGH;
    }
}

