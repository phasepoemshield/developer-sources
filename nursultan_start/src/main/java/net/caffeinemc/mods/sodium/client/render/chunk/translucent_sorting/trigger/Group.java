/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.caffeinemc.mods.sodium.client.util.interval_tree.DoubleInterval
 *  org.joml.Vector3fc
 */
package net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.trigger;

import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.trigger.NormalList;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.trigger.NormalPlanes;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.trigger.SortTriggering;
import net.caffeinemc.mods.sodium.client.util.interval_tree.DoubleInterval;
import org.joml.Vector3fc;

class Group {
    long sectionPos;
    float[] facePlaneDistances;
    long relDistanceHash;
    DoubleInterval distances;
    double baseDistance;
    Vector3fc normal;

    Group(NormalPlanes normalPlanes) {
        this.replaceWith(normalPlanes);
    }

    void replaceWith(NormalPlanes normalPlanes) {
        this.sectionPos = normalPlanes.sectionPos.W();
        this.distances = normalPlanes.distanceRange;
        this.relDistanceHash = normalPlanes.relDistanceHash;
        this.facePlaneDistances = normalPlanes.relativeDistances;
        this.baseDistance = normalPlanes.baseDistance;
        this.normal = normalPlanes.normal;
    }

    boolean normalPlanesEquals(NormalPlanes normalPlanes) {
        return this.facePlaneDistances.length == normalPlanes.relativeDistancesSet.size() && this.distances.equals((Object)normalPlanes.distanceRange) && this.relDistanceHash == normalPlanes.relDistanceHash;
    }

    void triggerRange(SortTriggering sortTriggering, double d, double d2) {
        if (this.planeTriggered(d, d2)) {
            sortTriggering.triggerSectionGFNI(this.sectionPos, this.normal);
        }
    }

    private boolean planeTriggered(double d, double d2) {
        return d < (Double)this.distances.getEnd() && d2 > (Double)this.distances.getStart() && NormalList.queryRange(this.facePlaneDistances, (float)(d - this.baseDistance), (float)(d2 - this.baseDistance));
    }
}

