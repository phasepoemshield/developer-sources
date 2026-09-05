/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  net.caffeinemc.mods.sodium.client.gui.options.TextProvider
 */
package net.caffeinemc.mods.sodium.client.render.chunk;

import minecraft.class00392;
import net.caffeinemc.mods.sodium.client.gui.options.TextProvider;
import net.caffeinemc.mods.sodium.client.render.chunk.TaskQueueType;

public enum DeferMode implements TextProvider
{
    ALWAYS("sodium.options.defer_chunk_updates.always", TaskQueueType.ALWAYS_DEFER),
    ONE_FRAME("sodium.options.defer_chunk_updates.one_frame", TaskQueueType.ONE_FRAME_DEFER),
    ZERO_FRAMES("sodium.options.defer_chunk_updates.zero_frames", TaskQueueType.ZERO_FRAME_DEFER);

    private final class00392 name;
    private final TaskQueueType importantRebuildQueueType;

    private DeferMode(String string2, TaskQueueType taskQueueType) {
        this.name = class00392.L((String)string2);
        this.importantRebuildQueueType = taskQueueType;
    }

    public class00392 getLocalizedName() {
        return this.name;
    }

    public TaskQueueType getImportantRebuildQueueType() {
        return this.importantRebuildQueueType;
    }
}

