/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Object2ReferenceMap
 *  net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.DynamicTopoData
 *  net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.TopoGraphSorting
 *  net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.TranslucentData
 *  net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.quad.TQuad
 *  org.joml.Vector3fc
 */
package net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data;

import it.unimi.dsi.fastutil.objects.Object2ReferenceMap;
import java.nio.IntBuffer;
import java.util.function.IntConsumer;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.CombinedCameraPos;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.DynamicSorter;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.DynamicTopoData;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.TopoGraphSorting;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.TranslucentData;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.quad.TQuad;
import org.joml.Vector3fc;

public class DynamicTopoData$DynamicTopoSorter
extends DynamicSorter
implements IntConsumer {
    final DynamicTopoData parent;
    private final boolean isDirectTrigger;
    private final int consecutiveTopoSortFailures;
    boolean directTrigger;
    boolean GFNITrigger;
    int consecutiveTopoSortFailuresNew;
    private IntBuffer intBuffer;
    final /* synthetic */ DynamicTopoData this$0;

    DynamicTopoData$DynamicTopoSorter(DynamicTopoData dynamicTopoData, int n, DynamicTopoData dynamicTopoData2, boolean bl, int n2, boolean bl2, boolean bl3) {
        this.this$0 = dynamicTopoData;
        super(n);
        this.parent = dynamicTopoData2;
        this.isDirectTrigger = bl;
        this.consecutiveTopoSortFailures = n2;
        this.consecutiveTopoSortFailuresNew = n2;
        this.GFNITrigger = bl2;
        this.directTrigger = bl3;
    }

    @Override
    public void accept(int n) {
        TranslucentData.writeQuadVertexIndexes((IntBuffer)this.intBuffer, (int)n);
    }

    private static int getAttemptsForTime(long l) {
        return l <= 250000L ? 5 : 2;
    }

    @Override
    void writeSort(CombinedCameraPos combinedCameraPos, boolean bl) {
        IntBuffer intBuffer = this.getIntBuffer();
        if (this.GFNITrigger && !this.isDirectTrigger) {
            long l;
            this.intBuffer = intBuffer;
            long l2 = bl ? 0L : System.nanoTime();
            boolean bl2 = TopoGraphSorting.topoGraphSort((IntConsumer)this, (TQuad[])this.this$0.quads, (Object2ReferenceMap)this.this$0.distancesByNormal, (Vector3fc)combinedCameraPos.getRelativeCameraPos(), (boolean)false);
            this.intBuffer = null;
            long l3 = l = bl ? 0L : System.nanoTime() - l2;
            if (!bl && l > (long)(this.consecutiveTopoSortFailuresNew > 0 ? 750000 : 1000000)) {
                this.directTrigger = true;
                this.GFNITrigger = false;
            } else if (bl2) {
                this.directTrigger = false;
                this.consecutiveTopoSortFailuresNew = 0;
            } else {
                ++this.consecutiveTopoSortFailuresNew;
                this.directTrigger = true;
                if (this.consecutiveTopoSortFailuresNew >= DynamicTopoData$DynamicTopoSorter.getAttemptsForTime(l)) {
                    this.GFNITrigger = false;
                }
            }
        }
        if (this.directTrigger) {
            intBuffer.rewind();
            DynamicTopoData.distanceSortDirect((IntBuffer)intBuffer, (Vector3fc[])this.this$0.centroids, (TQuad[])this.this$0.quads, (Vector3fc)combinedCameraPos.getRelativeCameraPos());
        }
        if (bl) {
            this.this$0.copyStateFrom(this);
        }
    }

    boolean hasSortFailureIncrement() {
        return this.consecutiveTopoSortFailuresNew > this.consecutiveTopoSortFailures;
    }

    boolean hasSortFailureReset() {
        return this.consecutiveTopoSortFailuresNew < this.consecutiveTopoSortFailures;
    }
}

