/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.babbaj.pathfinder.NetherPathfinder
 *  dev.babbaj.pathfinder.Octree
 */
package baritone.process.elytra;

import baritone.process.elytra.NetherPathfinderContext;
import dev.babbaj.pathfinder.NetherPathfinder;
import dev.babbaj.pathfinder.Octree;

public final class BlockStateOctreeInterface {
    private final NetherPathfinderContext context;
    private final long contextPtr;
    transient long chunkPtr;
    private int prevChunkX = Integer.MAX_VALUE;
    private int prevChunkZ = Integer.MAX_VALUE;

    public BlockStateOctreeInterface(NetherPathfinderContext netherPathfinderContext) {
        this.context = netherPathfinderContext;
        this.contextPtr = netherPathfinderContext.context;
    }

    public boolean get0(int n, int n2, int n3) {
        int n4;
        int n5;
        if ((n2 | 127 - n2) < 0) {
            return false;
        }
        if (this.chunkPtr == 0L | ((n5 = n >> 4) ^ this.prevChunkX | (n4 = n3 >> 4) ^ this.prevChunkZ) != 0) {
            this.prevChunkX = n5;
            this.prevChunkZ = n4;
            this.chunkPtr = NetherPathfinder.getOrCreateChunk((long)this.contextPtr, (int)n5, (int)n4);
        }
        return Octree.getBlock((long)this.chunkPtr, (int)(n & 0xF), (int)(n2 & 0x7F), (int)(n3 & 0xF));
    }
}

