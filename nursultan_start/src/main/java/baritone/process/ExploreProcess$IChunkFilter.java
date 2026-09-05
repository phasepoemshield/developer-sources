/*
 * Decompiled with CFR 0.152.
 */
package baritone.process;

import baritone.process.ExploreProcess$Status;

interface ExploreProcess$IChunkFilter {
    public ExploreProcess$Status isAlreadyExplored(int var1, int var2);

    public int countRemain();
}

