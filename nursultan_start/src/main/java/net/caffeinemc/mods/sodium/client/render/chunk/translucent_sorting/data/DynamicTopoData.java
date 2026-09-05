/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Object2ReferenceMap
 *  minecraft.class01296
 *  net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.CombinedCameraPos
 *  net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.DynamicData
 *  net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.DynamicSorter
 *  net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.DynamicTopoData$DynamicTopoSorter
 *  net.caffeinemc.mods.sodium.client.util.sorting.RadixSort
 *  org.joml.Vector3dc
 *  org.joml.Vector3fc
 */
package net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data;

import it.unimi.dsi.fastutil.objects.Object2ReferenceMap;
import java.nio.IntBuffer;
import java.util.function.Supplier;
import minecraft.class01296;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.CombinedCameraPos;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.DynamicData;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.DynamicSorter;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.DynamicTopoData;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.TranslucentData;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.quad.TQuad;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.trigger.GeometryPlanes;
import net.caffeinemc.mods.sodium.client.util.sorting.RadixSort;
import org.joml.Vector3dc;
import org.joml.Vector3fc;

public class DynamicTopoData
extends DynamicData {
    private static final int MAX_TOPO_SORT_QUADS = 1000;
    private static final int MAX_TOPO_SORT_TIME_NS = 1000000;
    private static final int MAX_FAILING_TOPO_SORT_TIME_NS = 750000;
    private static final int MAX_TOPO_SORT_PATIENT_TIME_NS = 250000;
    private static final int PATIENT_TOPO_ATTEMPTS = 5;
    private static final int REGULAR_TOPO_ATTEMPTS = 2;
    private boolean GFNITrigger;
    private boolean directTrigger;
    private int consecutiveTopoSortFailures = 0;
    private double directTriggerKey = -1.0;
    private boolean pendingTriggerIsDirect;
    TQuad[] quads;
    Vector3fc[] centroids;
    Object2ReferenceMap<Vector3fc, float[]> distancesByNormal;

    private DynamicTopoData(class01296 class012962, TQuad[] tQuadArray, GeometryPlanes geometryPlanes, Vector3dc vector3dc, Supplier<Object2ReferenceMap<Vector3fc, float[]>> supplier) {
        super(class012962, tQuadArray.length, geometryPlanes, vector3dc);
        if (this.getInputQuadCount() > 1000) {
            this.directTrigger = true;
            this.GFNITrigger = false;
            this.computeCentroids(tQuadArray);
        } else {
            this.directTrigger = false;
            this.GFNITrigger = true;
            this.quads = tQuadArray;
            this.distancesByNormal = supplier.get();
        }
    }

    public boolean checkAndApplyGFNITriggerOff(DynamicTopoSorter dynamicTopoSorter) {
        if (this.GFNITrigger && !dynamicTopoSorter.GFNITrigger) {
            this.GFNITrigger = false;
            this.checkDirectSortingFallback();
            return true;
        }
        return false;
    }

    public boolean checkAndApplyDirectTriggerOff(DynamicTopoSorter dynamicTopoSorter) {
        if (this.directTrigger && !dynamicTopoSorter.directTrigger) {
            this.directTrigger = false;
            return true;
        }
        return false;
    }

    public boolean checkAndApplyDirectTriggerOn(DynamicTopoSorter dynamicTopoSorter) {
        if (!this.directTrigger && dynamicTopoSorter.directTrigger) {
            this.directTrigger = true;
            return true;
        }
        return false;
    }

    public void applyTopoSortFailureCounterChange(DynamicTopoSorter dynamicTopoSorter) {
        if (dynamicTopoSorter.hasSortFailureReset()) {
            this.consecutiveTopoSortFailures = 0;
        } else if (dynamicTopoSorter.hasSortFailureIncrement()) {
            ++this.consecutiveTopoSortFailures;
        }
    }

    public void prepareTrigger(boolean bl) {
        this.pendingTriggerIsDirect = bl;
    }

    static void distanceSortDirect(IntBuffer intBuffer, Vector3fc[] vector3fcArray, TQuad[] tQuadArray, Vector3fc vector3fc) {
        int n = vector3fcArray != null ? vector3fcArray.length : tQuadArray.length;
        if (n <= 1) {
            TranslucentData.writeQuadVertexIndexes(intBuffer, 0);
        } else {
            int n2;
            int[] nArray = new int[n];
            int[] nArray2 = new int[n];
            for (n2 = 0; n2 < n; ++n2) {
                Vector3fc vector3fc2 = vector3fcArray != null ? vector3fcArray[n2] : tQuadArray[n2].getCenter();
                nArray[n2] = ~Float.floatToRawIntBits(vector3fc2.distanceSquared(vector3fc));
                nArray2[n2] = n2;
            }
            RadixSort.sortIndirect((int[])nArray2, (int[])nArray, (boolean)false);
            for (n2 = 0; n2 < n; ++n2) {
                TranslucentData.writeQuadVertexIndexes(intBuffer, nArray2[n2]);
            }
        }
    }

    void copyStateFrom(DynamicTopoSorter dynamicTopoSorter) {
        this.GFNITrigger = dynamicTopoSorter.GFNITrigger;
        this.directTrigger = dynamicTopoSorter.directTrigger;
        this.consecutiveTopoSortFailures = dynamicTopoSorter.consecutiveTopoSortFailuresNew;
        this.checkDirectSortingFallback();
    }

    private void computeCentroids(TQuad[] tQuadArray) {
        this.centroids = new Vector3fc[tQuadArray.length];
        for (int i = 0; i < tQuadArray.length; ++i) {
            this.centroids[i] = tQuadArray[i].getCenter();
        }
    }

    public boolean GFNITriggerEnabled() {
        return this.GFNITrigger;
    }

    public boolean isMatchingSorter(DynamicTopoSorter dynamicTopoSorter) {
        return dynamicTopoSorter.parent == this;
    }

    public static DynamicTopoData fromMesh(CombinedCameraPos combinedCameraPos, TQuad[] tQuadArray, class01296 class012962, GeometryPlanes geometryPlanes) {
        return new DynamicTopoData(class012962, tQuadArray, geometryPlanes, combinedCameraPos.getAbsoluteCameraPos(), geometryPlanes::prepareAndGetDistances);
    }

    public DynamicSorter getSorter() {
        return new DynamicTopoSorter(this, this.getInputQuadCount(), this, this.pendingTriggerIsDirect, this.consecutiveTopoSortFailures, this.GFNITrigger, this.directTrigger);
    }

    public boolean directTriggerEnabled() {
        return this.directTrigger;
    }

    public double getDirectTriggerKey() {
        return this.directTriggerKey;
    }

    public void setDirectTriggerKey(double d) {
        this.directTriggerKey = d;
    }

    private void checkDirectSortingFallback() {
        if (!this.GFNITrigger && this.quads != null) {
            this.computeCentroids(this.quads);
            this.quads = null;
            this.distancesByNormal = null;
        }
    }
}

