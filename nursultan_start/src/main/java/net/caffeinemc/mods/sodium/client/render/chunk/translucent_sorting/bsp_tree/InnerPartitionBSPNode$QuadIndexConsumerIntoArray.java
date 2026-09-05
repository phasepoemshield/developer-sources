/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.IntConsumer
 */
package net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.bsp_tree;

import it.unimi.dsi.fastutil.ints.IntConsumer;

class InnerPartitionBSPNode$QuadIndexConsumerIntoArray
implements IntConsumer {
    final int[] indexes;
    private int index = 0;

    InnerPartitionBSPNode$QuadIndexConsumerIntoArray(int n) {
        this.indexes = new int[n];
    }

    public void accept(int n) {
        this.indexes[this.index++] = n;
    }
}

