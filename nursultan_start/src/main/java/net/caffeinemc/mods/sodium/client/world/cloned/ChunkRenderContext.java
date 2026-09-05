/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01296
 *  minecraft.class05163
 */
package net.caffeinemc.mods.sodium.client.world.cloned;

import java.util.List;
import minecraft.class01296;
import minecraft.class05163;
import net.caffeinemc.mods.sodium.client.world.cloned.ClonedChunkSection;

public class ChunkRenderContext {
    private final class01296 origin;
    private final ClonedChunkSection[] sections;
    private final class05163 volume;
    private final List<?> renderers;

    public class01296 getOrigin() {
        return this.origin;
    }

    public ChunkRenderContext(class01296 class012962, ClonedChunkSection[] clonedChunkSectionArray, class05163 class051632, List<?> list) {
        this.origin = class012962;
        this.sections = clonedChunkSectionArray;
        this.volume = class051632;
        this.renderers = list;
    }

    public ClonedChunkSection[] getSections() {
        return this.sections;
    }

    public List<?> getRenderers() {
        return this.renderers;
    }

    public class05163 getVolume() {
        return this.volume;
    }
}

