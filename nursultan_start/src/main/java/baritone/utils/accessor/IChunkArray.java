/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00570
 */
package baritone.utils.accessor;

import java.util.concurrent.atomic.AtomicReferenceArray;
import minecraft.class00570;

public interface IChunkArray {
    public void copyFrom(IChunkArray var1);

    public int centerZ();

    public int centerX();

    public AtomicReferenceArray<class00570> getChunks();

    public int viewDistance();
}

