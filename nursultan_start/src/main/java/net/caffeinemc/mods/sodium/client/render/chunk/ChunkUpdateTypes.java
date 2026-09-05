/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.sodium.client.render.chunk;

import net.caffeinemc.mods.sodium.client.render.chunk.TaskQueueType;

public class ChunkUpdateTypes {
    public static final int SORT = 1;
    public static final int REBUILD = 2;
    public static final int IMPORTANT = 4;
    public static final int INITIAL_BUILD = 8;

    public static int join(int n, int n2) {
        return n | n2;
    }

    public static boolean isRebuildWithSort(int n) {
        return (ChunkUpdateTypes.isRebuild(n) || ChunkUpdateTypes.isInitialBuild(n)) && ChunkUpdateTypes.isSort(n);
    }

    public static boolean isInitialBuild(int n) {
        return (n & 8) != 0;
    }

    public static TaskQueueType getQueueType(int n, TaskQueueType taskQueueType, TaskQueueType taskQueueType2) {
        if (ChunkUpdateTypes.isInitialBuild(n)) {
            return TaskQueueType.INITIAL_BUILD;
        }
        if (ChunkUpdateTypes.isImportant(n)) {
            if (ChunkUpdateTypes.isRebuild(n)) {
                return taskQueueType;
            }
            return taskQueueType2;
        }
        return TaskQueueType.ALWAYS_DEFER;
    }

    public static boolean isImportant(int n) {
        return (n & 4) != 0;
    }

    public static boolean isRebuild(int n) {
        return (n & 2) != 0;
    }

    public static boolean isSort(int n) {
        return (n & 1) != 0;
    }
}

