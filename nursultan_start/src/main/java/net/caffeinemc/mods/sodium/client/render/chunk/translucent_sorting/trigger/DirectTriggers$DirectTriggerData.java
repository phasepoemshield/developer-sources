/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01296
 *  org.joml.Vector3d
 *  org.joml.Vector3dc
 */
package net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.trigger;

import minecraft.class01296;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.DynamicTopoData;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.trigger.DirectTriggers;
import org.joml.Vector3d;
import org.joml.Vector3dc;

class DirectTriggers$DirectTriggerData {
    final class01296 sectionPos;
    private Vector3dc sectionCenter;
    final DynamicTopoData dynamicData;
    DirectTriggers$DirectTriggerData next;
    Vector3dc triggerCameraPos;

    DirectTriggers$DirectTriggerData(DynamicTopoData dynamicTopoData, class01296 class012962, Vector3dc vector3dc) {
        this.dynamicData = dynamicTopoData;
        this.sectionPos = class012962;
        this.triggerCameraPos = vector3dc;
    }

    double getSectionCenterTriggerCameraDist() {
        return Math.sqrt(this.getSectionCenterDistSquared(this.triggerCameraPos));
    }

    double getSectionCenterDistSquared(Vector3dc vector3dc) {
        Vector3dc vector3dc2 = this.getSectionCenter();
        return vector3dc2.distanceSquared(vector3dc);
    }

    Vector3dc getSectionCenter() {
        if (this.sectionCenter == null) {
            this.sectionCenter = new Vector3d((double)(this.sectionPos.u() + 8), (double)(this.sectionPos.i() + 8), (double)(this.sectionPos.R() + 8));
        }
        return this.sectionCenter;
    }

    boolean isAngleTriggering(Vector3dc vector3dc) {
        return this.getSectionCenterDistSquared(vector3dc) > DirectTriggers.SECTION_CENTER_DIST_SQUARED;
    }

    double centerRelativeAngleCos(Vector3dc vector3dc, Vector3dc vector3dc2) {
        Vector3dc vector3dc3 = this.getSectionCenter();
        return DirectTriggers.angleCos(vector3dc3.x() - vector3dc.x(), vector3dc3.y() - vector3dc.y(), vector3dc3.z() - vector3dc.z(), vector3dc3.x() - vector3dc2.x(), vector3dc3.y() - vector3dc2.y(), vector3dc3.z() - vector3dc2.z());
    }
}

