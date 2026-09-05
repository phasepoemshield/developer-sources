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

public class LeafDoubleBSPNode
extends BSPNode {
    private final int quadA;
    private final int quadB;

    LeafDoubleBSPNode(int n, int n2) {
        this.quadA = n;
        this.quadB = n2;
    }

    @Override
    void collectSortedQuads(BSPSortState bSPSortState, Vector3fc vector3fc) {
        bSPSortState.writeIndex(this.quadA);
        bSPSortState.writeIndex(this.quadB);
    }
}

