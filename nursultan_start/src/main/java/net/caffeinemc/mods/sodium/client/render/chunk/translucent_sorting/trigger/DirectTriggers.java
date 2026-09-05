/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.doubles.Double2ObjectMap$Entry
 *  it.unimi.dsi.fastutil.doubles.Double2ObjectRBTreeMap
 *  it.unimi.dsi.fastutil.doubles.Double2ObjectSortedMap
 *  minecraft.class01296
 *  org.joml.Vector3dc
 */
package net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.trigger;

import it.unimi.dsi.fastutil.doubles.Double2ObjectMap;
import it.unimi.dsi.fastutil.doubles.Double2ObjectRBTreeMap;
import it.unimi.dsi.fastutil.doubles.Double2ObjectSortedMap;
import minecraft.class01296;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.DynamicTopoData;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.TranslucentData;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.trigger.CameraMovement;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.trigger.DirectTriggers$DirectTriggerData;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.trigger.SortTriggering;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.trigger.SortTriggering$SectionTriggers;
import org.joml.Vector3dc;

class DirectTriggers
implements SortTriggering$SectionTriggers<DynamicTopoData> {
    private Double2ObjectRBTreeMap<DirectTriggers$DirectTriggerData> directTriggerSections = new Double2ObjectRBTreeMap();
    private double accumulatedDistance = 0.0;
    private static final double EARLY_TRIGGER_FACTOR = 0.9;
    private static final double TRIGGER_ANGLE = Math.toRadians(10.0);
    private static final double EARLY_TRIGGER_ANGLE_COS = Math.cos(TRIGGER_ANGLE * 0.9);
    static final double SECTION_CENTER_DIST_SQUARED = 3.0 * Math.pow(8.0, 2.0) + 1.0;
    private static final double SECTION_CENTER_DIST = Math.sqrt(SECTION_CENTER_DIST_SQUARED);
    private static final double TRIGGER_DISTANCE = 1.0;
    private static final double EARLY_TRIGGER_DISTANCE_SQUARED = Math.pow(0.9, 2.0);

    DirectTriggers() {
    }

    static double angleCos(double d, double d2, double d3, double d4, double d5, double d6) {
        double d7 = Math.sqrt(Math.fma(d, d, Math.fma(d2, d2, d3 * d3)));
        double d8 = Math.sqrt(Math.fma(d4, d4, Math.fma(d5, d5, d6 * d6)));
        double d9 = Math.fma(d, d4, Math.fma(d2, d5, d3 * d6));
        return d9 / (d7 * d8);
    }

    private void insertDirectDistanceTrigger(DirectTriggers$DirectTriggerData directTriggers$DirectTriggerData, Vector3dc vector3dc, double d) {
        this.insertTrigger(this.accumulatedDistance + d, directTriggers$DirectTriggerData);
    }

    @Override
    public void integrateSection(SortTriggering sortTriggering, class01296 class012962, DynamicTopoData dynamicTopoData, CameraMovement cameraMovement) {
        Vector3dc vector3dc = cameraMovement.start();
        DirectTriggers$DirectTriggerData directTriggers$DirectTriggerData = new DirectTriggers$DirectTriggerData(dynamicTopoData, class012962, vector3dc);
        if (cameraMovement.hasChanged()) {
            this.processSingleTrigger(directTriggers$DirectTriggerData, sortTriggering, cameraMovement.end());
        } else if (directTriggers$DirectTriggerData.isAngleTriggering(vector3dc)) {
            this.insertDirectAngleTrigger(directTriggers$DirectTriggerData, vector3dc, TRIGGER_ANGLE);
        } else {
            this.insertDirectDistanceTrigger(directTriggers$DirectTriggerData, vector3dc, 1.0);
        }
    }

    @Override
    public void processTriggers(SortTriggering sortTriggering, CameraMovement cameraMovement) {
        Vector3dc vector3dc = cameraMovement.start();
        Vector3dc vector3dc2 = cameraMovement.end();
        this.accumulatedDistance += vector3dc.distance(vector3dc2);
        Double2ObjectSortedMap double2ObjectSortedMap = this.directTriggerSections.headMap(this.accumulatedDistance);
        for (Double2ObjectMap.Entry entry : double2ObjectSortedMap.double2ObjectEntrySet()) {
            this.directTriggerSections.remove(entry.getDoubleKey());
            DirectTriggers$DirectTriggerData directTriggers$DirectTriggerData = (DirectTriggers$DirectTriggerData)entry.getValue();
            while (directTriggers$DirectTriggerData != null) {
                DirectTriggers$DirectTriggerData directTriggers$DirectTriggerData2 = directTriggers$DirectTriggerData.next;
                this.processSingleTrigger(directTriggers$DirectTriggerData, sortTriggering, vector3dc2);
                directTriggers$DirectTriggerData = directTriggers$DirectTriggerData2;
            }
        }
    }

    private void insertTrigger(double d, DirectTriggers$DirectTriggerData directTriggers$DirectTriggerData) {
        directTriggers$DirectTriggerData.dynamicData.setDirectTriggerKey(d);
        directTriggers$DirectTriggerData.next = (DirectTriggers$DirectTriggerData)this.directTriggerSections.put(d, (Object)directTriggers$DirectTriggerData);
    }

    int getDirectTriggerCount() {
        return this.directTriggerSections.size();
    }

    private void insertDirectAngleTrigger(DirectTriggers$DirectTriggerData directTriggers$DirectTriggerData, Vector3dc vector3dc, double d) {
        double d2 = directTriggers$DirectTriggerData.getSectionCenterTriggerCameraDist();
        double d3 = Math.tan(d) * (d2 - SECTION_CENTER_DIST);
        this.insertTrigger(this.accumulatedDistance + d3, directTriggers$DirectTriggerData);
    }

    private void processSingleTrigger(DirectTriggers$DirectTriggerData directTriggers$DirectTriggerData, SortTriggering sortTriggering, Vector3dc vector3dc) {
        if (directTriggers$DirectTriggerData.isAngleTriggering(vector3dc)) {
            double d = TRIGGER_ANGLE;
            double d2 = directTriggers$DirectTriggerData.centerRelativeAngleCos(directTriggers$DirectTriggerData.triggerCameraPos, vector3dc);
            if (d2 <= EARLY_TRIGGER_ANGLE_COS) {
                sortTriggering.triggerSectionDirect(directTriggers$DirectTriggerData.sectionPos);
                directTriggers$DirectTriggerData.triggerCameraPos = vector3dc;
            } else {
                d -= Math.acos(d2);
            }
            this.insertDirectAngleTrigger(directTriggers$DirectTriggerData, vector3dc, d);
        } else {
            double d = 1.0;
            double d3 = directTriggers$DirectTriggerData.triggerCameraPos.distanceSquared(vector3dc);
            if (d3 >= EARLY_TRIGGER_DISTANCE_SQUARED) {
                sortTriggering.triggerSectionDirect(directTriggers$DirectTriggerData.sectionPos);
                directTriggers$DirectTriggerData.triggerCameraPos = vector3dc;
            } else {
                d -= Math.sqrt(d3);
            }
            this.insertDirectDistanceTrigger(directTriggers$DirectTriggerData, vector3dc, d);
        }
    }

    @Override
    public void removeSection(long l, TranslucentData translucentData) {
        DynamicTopoData dynamicTopoData;
        double d;
        if (translucentData instanceof DynamicTopoData && (d = (dynamicTopoData = (DynamicTopoData)((Object)translucentData)).getDirectTriggerKey()) != -1.0) {
            this.directTriggerSections.remove(d);
            dynamicTopoData.setDirectTriggerKey(-1.0);
        }
    }
}

