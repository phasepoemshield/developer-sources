/*
 * Decompiled with CFR 0.152.
 */
package baritone.process;

import baritone.process.ExploreProcess;
import baritone.process.ExploreProcess$IChunkFilter;
import baritone.process.ExploreProcess$Status;

class ExploreProcess$EitherChunk
implements ExploreProcess$IChunkFilter {
    private final ExploreProcess$IChunkFilter a;
    private final ExploreProcess$IChunkFilter b;

    ExploreProcess$EitherChunk(ExploreProcess exploreProcess, ExploreProcess$IChunkFilter exploreProcess$IChunkFilter, ExploreProcess$IChunkFilter exploreProcess$IChunkFilter2) {
        this.a = exploreProcess$IChunkFilter;
        this.b = exploreProcess$IChunkFilter2;
    }

    @Override
    public ExploreProcess$Status isAlreadyExplored(int n, int n2) {
        if (this.a.isAlreadyExplored(n, n2) == ExploreProcess$Status.EXPLORED) {
            return ExploreProcess$Status.EXPLORED;
        }
        return this.b.isAlreadyExplored(n, n2);
    }

    @Override
    public int countRemain() {
        return Math.min(this.a.countRemain(), this.b.countRemain());
    }
}

