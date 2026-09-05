/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.ObjectOpenHashSet
 *  minecraft.class01296
 *  net.caffeinemc.mods.sodium.client.SodiumClientMod
 *  net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.QuadSplittingMode
 *  net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.SortBehavior
 *  net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.SortType
 *  net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.DynamicData
 *  net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.DynamicTopoData$DynamicTopoSorter
 *  org.joml.Vector3dc
 *  org.joml.Vector3fc
 */
package net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.trigger;

import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.List;
import java.util.function.BiConsumer;
import minecraft.class01296;
import net.caffeinemc.mods.sodium.client.SodiumClientMod;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.QuadSplittingMode;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.SortBehavior;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.SortType;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.DynamicData;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.DynamicTopoData;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.TranslucentData;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.trigger.CameraMovement;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.trigger.DirectTriggers;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.trigger.GFNITriggers;
import org.joml.Vector3dc;
import org.joml.Vector3fc;

public class SortTriggering {
    private BiConsumer<Long, Boolean> triggerSectionCallback;
    private DynamicData catchupData = null;
    private int gfniTriggerCount = 0;
    private int directTriggerCount = 0;
    private final ObjectOpenHashSet<Vector3fc> triggeredNormals = new ObjectOpenHashSet();
    private int triggeredNormalCount = 0;
    private final int[] sortTypeCounters = new int[SortType.values().length];
    private final GFNITriggers gfni = new GFNITriggers();
    private final DirectTriggers direct = new DirectTriggers();

    public void addDebugStrings(List<String> list, SortBehavior sortBehavior, boolean bl) {
        QuadSplittingMode quadSplittingMode = SodiumClientMod.options().performance.quadSplittingMode;
        if (bl) {
            list.add("TS (%s,%s) NL=%02d TrN=%02d TrS=G%03d/D%03d".formatted(new Object[]{sortBehavior.getShortName(), quadSplittingMode.getShortName(), this.gfni.getUniqueNormalCount(), this.triggeredNormalCount, this.gfniTriggerCount, this.directTriggerCount}));
            list.add("N=%05d SNR=%05d STA=%05d DYN=%05d (DIR=%02d)".formatted(new Object[]{this.sortTypeCounters[SortType.NONE.ordinal()], this.sortTypeCounters[SortType.STATIC_NORMAL_RELATIVE.ordinal()], this.sortTypeCounters[SortType.STATIC_TOPO.ordinal()], this.sortTypeCounters[SortType.DYNAMIC.ordinal()], this.direct.getDirectTriggerCount()}));
        } else {
            list.add("TS (%s,%s) St=%d Dy=%d".formatted(new Object[]{sortBehavior.getShortName(), quadSplittingMode.getShortName(), this.sortTypeCounters[SortType.STATIC_NORMAL_RELATIVE.ordinal()] + this.sortTypeCounters[SortType.STATIC_TOPO.ordinal()], this.sortTypeCounters[SortType.DYNAMIC.ordinal()]}));
        }
    }

    public void triggerSections(BiConsumer<Long, Boolean> biConsumer, CameraMovement cameraMovement) {
        this.triggeredNormals.clear();
        this.triggerSectionCallback = biConsumer;
        int n = this.gfniTriggerCount;
        int n2 = this.directTriggerCount;
        this.gfniTriggerCount = 0;
        this.directTriggerCount = 0;
        this.gfni.processTriggers(this, cameraMovement);
        this.direct.processTriggers(this, cameraMovement);
        if (this.gfniTriggerCount > 0 || this.directTriggerCount > 0) {
            this.triggeredNormalCount = this.triggeredNormals.size();
        } else {
            this.gfniTriggerCount = n;
            this.directTriggerCount = n2;
        }
        this.triggerSectionCallback = null;
    }

    void triggerSectionGFNI(long l, Vector3fc vector3fc) {
        if (this.isCatchingUp()) {
            this.triggerSectionCatchup(l, false);
            return;
        }
        this.triggeredNormals.add((Object)vector3fc);
        this.triggerSectionCallback.accept(l, false);
        ++this.gfniTriggerCount;
    }

    private boolean isCatchingUp() {
        return this.catchupData != null;
    }

    public void applyTriggerChanges(DynamicTopoData dynamicTopoData, DynamicTopoData.DynamicTopoSorter dynamicTopoSorter, class01296 class012962, Vector3dc vector3dc) {
        if (!dynamicTopoData.isMatchingSorter(dynamicTopoSorter)) {
            return;
        }
        if (dynamicTopoData.checkAndApplyGFNITriggerOff(dynamicTopoSorter)) {
            this.gfni.removeSection(class012962.W(), (TranslucentData)((Object)dynamicTopoData));
        }
        if (dynamicTopoData.checkAndApplyDirectTriggerOn(dynamicTopoSorter)) {
            this.direct.integrateSection(this, class012962, dynamicTopoData, new CameraMovement(vector3dc, vector3dc));
        }
        if (dynamicTopoData.checkAndApplyDirectTriggerOff(dynamicTopoSorter)) {
            this.direct.removeSection(class012962.W(), (TranslucentData)((Object)dynamicTopoData));
        }
        dynamicTopoData.applyTopoSortFailureCounterChange(dynamicTopoSorter);
    }

    public void integrateTranslucentData(TranslucentData translucentData, TranslucentData translucentData2, Vector3dc vector3dc, BiConsumer<Long, Boolean> biConsumer) {
        if (translucentData == translucentData2) {
            return;
        }
        class01296 class012962 = translucentData2.sectionPos;
        this.incrementSortTypeCounter(translucentData2);
        if (translucentData2 instanceof DynamicData) {
            DynamicData dynamicData = (DynamicData)translucentData2;
            this.direct.removeSection(class012962.W(), translucentData);
            this.decrementSortTypeCounter(translucentData);
            this.triggerSectionCallback = biConsumer;
            this.catchupData = dynamicData;
            CameraMovement cameraMovement = new CameraMovement(dynamicData.getInitialCameraPos(), vector3dc);
            if (dynamicData instanceof DynamicTopoData) {
                DynamicTopoData dynamicTopoData = (DynamicTopoData)dynamicData;
                if (dynamicTopoData.GFNITriggerEnabled()) {
                    this.gfni.integrateSection(this, class012962, dynamicTopoData, cameraMovement);
                } else {
                    dynamicTopoData.discardGeometryPlanes();
                }
                if (dynamicTopoData.directTriggerEnabled()) {
                    this.direct.integrateSection(this, class012962, dynamicTopoData, cameraMovement);
                }
            } else {
                this.gfni.integrateSection(this, class012962, dynamicData, cameraMovement);
            }
            this.triggerSectionCallback = null;
            this.catchupData = null;
        } else {
            this.removeSection(translucentData, class012962.W());
        }
    }

    void triggerSectionDirect(class01296 class012962) {
        if (this.isCatchingUp()) {
            this.triggerSectionCatchup(class012962.W(), true);
            return;
        }
        this.triggerSectionCallback.accept(class012962.W(), true);
        ++this.directTriggerCount;
    }

    private void triggerSectionCatchup(long l, boolean bl) {
        if (this.triggerSectionCallback != null) {
            this.catchupData.prepareTrigger(bl);
            this.triggerSectionCallback.accept(l, bl);
        }
    }

    private void decrementSortTypeCounter(TranslucentData translucentData) {
        if (translucentData != null) {
            int n = translucentData.getSortType().ordinal();
            this.sortTypeCounters[n] = this.sortTypeCounters[n] - 1;
        }
    }

    private void incrementSortTypeCounter(TranslucentData translucentData) {
        int n = translucentData.getSortType().ordinal();
        this.sortTypeCounters[n] = this.sortTypeCounters[n] + 1;
    }

    public void removeSection(TranslucentData translucentData, long l) {
        if (translucentData == null) {
            return;
        }
        this.gfni.removeSection(l, translucentData);
        this.direct.removeSection(l, translucentData);
        this.decrementSortTypeCounter(translucentData);
    }
}

