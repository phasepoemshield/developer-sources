/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.caffeinemc.mods.sodium.client.render.chunk.TaskQueueType
 */
package net.caffeinemc.mods.sodium.client.render.chunk.lists;

import net.caffeinemc.mods.sodium.client.render.chunk.TaskQueueType;
import net.caffeinemc.mods.sodium.client.render.chunk.lists.SectionCollector;

public class OcclusionSectionCollector
extends SectionCollector {
    public OcclusionSectionCollector(int n, TaskQueueType taskQueueType, TaskQueueType taskQueueType2) {
        super(n, taskQueueType, taskQueueType2);
    }

    @Override
    public boolean orderIsSorted() {
        return false;
    }
}

