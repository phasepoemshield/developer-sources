/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.trigger.GeometryPlanes
 */
package net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.bsp_tree;

import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.bsp_tree.BSPNode;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.bsp_tree.UpdatedQuadsList;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.trigger.GeometryPlanes;

public class BSPResult
extends GeometryPlanes {
    private BSPNode rootNode;
    private UpdatedQuadsList updatedQuadsList;

    public BSPNode getRootNode() {
        return this.rootNode;
    }

    public void setRootNode(BSPNode bSPNode) {
        this.rootNode = bSPNode;
    }

    public UpdatedQuadsList getUpdatedQuadsList() {
        return this.updatedQuadsList;
    }

    public void setUpdatedQuadIndexes(UpdatedQuadsList updatedQuadsList) {
        this.updatedQuadsList = updatedQuadsList;
    }
}

