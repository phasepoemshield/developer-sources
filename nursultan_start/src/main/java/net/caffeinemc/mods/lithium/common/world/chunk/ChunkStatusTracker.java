/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00570
 *  minecraft.class04782
 *  minecraft.class07321
 *  net.caffeinemc.mods.lithium.common.tracking.block.ChunkSectionChangeCallback
 */
package net.caffeinemc.mods.lithium.common.world.chunk;

import java.util.ArrayList;
import java.util.function.BiConsumer;
import minecraft.class00570;
import minecraft.class04782;
import minecraft.class07321;
import net.caffeinemc.mods.lithium.common.tracking.block.ChunkSectionChangeCallback;
import net.caffeinemc.mods.lithium.mixin.util.accessors.LevelAccessor;

public class ChunkStatusTracker {
    private static final ArrayList<BiConsumer<class04782, class07321>> UNLOAD_CALLBACKS = new ArrayList();
    private static final ArrayList<BiConsumer<class04782, class00570>> LOAD_CALLBACKS = new ArrayList();

    static {
        ChunkSectionChangeCallback.init();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void registerLoadCallback(BiConsumer<class04782, class00570> biConsumer) {
        ArrayList<BiConsumer<class04782, class00570>> arrayList = LOAD_CALLBACKS;
        synchronized (arrayList) {
            LOAD_CALLBACKS.add(biConsumer);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void registerUnloadCallback(BiConsumer<class04782, class07321> biConsumer) {
        ArrayList<BiConsumer<class04782, class07321>> arrayList = UNLOAD_CALLBACKS;
        synchronized (arrayList) {
            UNLOAD_CALLBACKS.add(biConsumer);
        }
    }

    public static void onChunkAccessible(class04782 class047822, class00570 class005702) {
        if (((LevelAccessor)class047822).getThread() != Thread.currentThread()) {
            throw new IllegalStateException("ChunkStatusTracker.onChunkAccessible called on wrong thread!");
        }
        for (int i = 0; i < LOAD_CALLBACKS.size(); ++i) {
            LOAD_CALLBACKS.get(i).accept(class047822, class005702);
        }
    }

    public static void onChunkInaccessible(class04782 class047822, class07321 class073212) {
        if (((LevelAccessor)class047822).getThread() != Thread.currentThread()) {
            throw new IllegalStateException("ChunkStatusTracker.onChunkInaccessible called on wrong thread!");
        }
        for (int i = 0; i < UNLOAD_CALLBACKS.size(); ++i) {
            UNLOAD_CALLBACKS.get(i).accept(class047822, class073212);
        }
    }
}

