/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Vector3fc
 */
package net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.bsp_tree;

import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.bsp_tree.BSPNode;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.bsp_tree.BSPSortState;
import org.joml.Vector3fc;

class LeafMultiBSPNode
extends BSPNode {
    private final int[] quads;

    LeafMultiBSPNode(int[] nArray) {
        this.quads = nArray;
    }

    @Override
    void collectSortedQuads(BSPSortState bSPSortState, Vector3fc vector3fc) {
        bSPSortState.writeIndexes(this.quads);
    }
}

