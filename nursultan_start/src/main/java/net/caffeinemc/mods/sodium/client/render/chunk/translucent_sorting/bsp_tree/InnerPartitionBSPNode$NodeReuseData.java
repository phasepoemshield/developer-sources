/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.bsp_tree;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

final class InnerPartitionBSPNode$NodeReuseData
extends Record {
    final int quadHash;
    final int[] indexes;
    final int indexCount;
    final int maxIndex;

    public int maxIndex() {
        return this.maxIndex;
    }

    InnerPartitionBSPNode$NodeReuseData(int n, int[] nArray, int n2, int n3) {
        this.quadHash = n;
        this.indexes = nArray;
        this.indexCount = n2;
        this.maxIndex = n3;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{InnerPartitionBSPNode$NodeReuseData.class, "quadHash;indexes;indexCount;maxIndex", "quadHash", "indexes", "indexCount", "maxIndex"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{InnerPartitionBSPNode$NodeReuseData.class, "quadHash;indexes;indexCount;maxIndex", "quadHash", "indexes", "indexCount", "maxIndex"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{InnerPartitionBSPNode$NodeReuseData.class, "quadHash;indexes;indexCount;maxIndex", "quadHash", "indexes", "indexCount", "maxIndex"}, this);
    }

    public int[] indexes() {
        return this.indexes;
    }

    public int indexCount() {
        return this.indexCount;
    }

    public int quadHash() {
        return this.quadHash;
    }
}

