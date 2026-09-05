/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.IntArrayList
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  minecraft.class01296
 *  net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.quad.FullTQuad
 *  net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.quad.TQuad
 *  org.joml.Vector3fc
 */
package net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.bsp_tree;

import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import minecraft.class01296;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.QuadSplittingMode;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.bsp_tree.BSPResult;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.bsp_tree.UpdatedQuadsList;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.quad.FullTQuad;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.quad.TQuad;
import org.joml.Vector3fc;

class BSPWorkspace
extends ObjectArrayList<TQuad> {
    final BSPResult result = new BSPResult();
    private final class01296 sectionPos;
    boolean prepareNodeReuse;
    final boolean allowNodeReuse;
    final boolean quantizeTriggerNormals;
    private int quadCount;
    private final int maxQuadCount;
    private IntArrayList availableQuadIndexes;
    private UpdatedQuadsList updatedQuads;

    BSPWorkspace(TQuad[] tQuadArray, class01296 class012962, boolean bl, boolean bl2, QuadSplittingMode quadSplittingMode) {
        super((Object[])tQuadArray);
        this.sectionPos = class012962;
        this.prepareNodeReuse = bl;
        this.allowNodeReuse = bl2;
        this.quantizeTriggerNormals = quadSplittingMode.quantizeTriggerNormals();
        this.quadCount = tQuadArray.length;
        this.maxQuadCount = quadSplittingMode.allowsSplitting() ? quadSplittingMode.getMaxTotalQuads(this.quadCount) : this.quadCount;
    }

    private void registerQuadUpdate(FullTQuad fullTQuad) {
        if (fullTQuad.triggerAndSetUpdatedVertices()) {
            if (this.updatedQuads == null) {
                this.updatedQuads = new UpdatedQuadsList();
            }
            this.updatedQuads.add(fullTQuad);
        }
        this.prepareNodeReuse = false;
    }

    boolean canSplitQuads() {
        return this.quadCount < this.maxQuadCount;
    }

    int pushQuad(FullTQuad fullTQuad) {
        int n;
        if (fullTQuad == null || fullTQuad.isInvalid()) {
            return -1;
        }
        if (this.availableQuadIndexes == null || this.availableQuadIndexes.isEmpty()) {
            n = this.size();
            this.add(fullTQuad);
        } else {
            n = this.availableQuadIndexes.removeInt(this.availableQuadIndexes.size() - 1);
            this.set(n, fullTQuad);
        }
        fullTQuad.setWriteToIndex(n);
        ++this.quadCount;
        this.registerQuadUpdate(fullTQuad);
        return n;
    }

    int updateQuad(FullTQuad fullTQuad, int n) {
        if (fullTQuad == null) {
            return -1;
        }
        if (fullTQuad.isInvalid()) {
            int n2 = this.size() - 1;
            if (n == n2) {
                this.remove(n2);
            } else {
                this.set(n, null);
                if (this.availableQuadIndexes == null) {
                    this.availableQuadIndexes = new IntArrayList();
                }
                this.availableQuadIndexes.add(n);
            }
            fullTQuad.setNoWrite();
            this.registerQuadUpdate(fullTQuad);
            --this.quadCount;
            return -1;
        }
        fullTQuad.setWriteToIndex(n);
        this.registerQuadUpdate(fullTQuad);
        return n;
    }

    void addAlignedPartitionPlane(int n, float f) {
        this.result.addDoubleSidedAlignedPlane(this.sectionPos, n, f);
    }

    public UpdatedQuadsList getFinalizedUpdatedQuads() {
        if (this.updatedQuads != null) {
            this.updatedQuads.setQuadCounts(this.size(), this.quadCount);
        }
        return this.updatedQuads;
    }

    void addUnalignedPartitionPlane(Vector3fc vector3fc, float f) {
        this.result.addDoubleSidedUnalignedPlane(this.sectionPos, vector3fc, f);
    }
}

