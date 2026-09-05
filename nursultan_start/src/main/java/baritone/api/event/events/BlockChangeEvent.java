/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.utils.Pair
 *  minecraft.class00500
 *  minecraft.class07209
 *  minecraft.class07321
 */
package baritone.api.event.events;

import baritone.api.utils.Pair;
import java.util.List;
import minecraft.class00500;
import minecraft.class07209;
import minecraft.class07321;

public final class BlockChangeEvent {
    private final class07321 chunk;
    private final List<Pair<class07209, class00500>> blocks;

    public BlockChangeEvent(class07321 class073212, List<Pair<class07209, class00500>> list) {
        this.chunk = class073212;
        this.blocks = list;
    }

    public List<Pair<class07209, class00500>> getBlocks() {
        return this.blocks;
    }

    public class07321 getChunkPos() {
        return this.chunk;
    }
}

