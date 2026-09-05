/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Object2ReferenceMap
 *  it.unimi.dsi.fastutil.objects.Object2ReferenceOpenHashMap
 *  it.unimi.dsi.fastutil.objects.ObjectIterator
 *  minecraft.class01296
 *  net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.DynamicData
 *  org.joml.Vector3fc
 */
package net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.trigger;

import it.unimi.dsi.fastutil.objects.Object2ReferenceMap;
import it.unimi.dsi.fastutil.objects.Object2ReferenceOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.Iterator;
import minecraft.class01296;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.DynamicData;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.TranslucentData;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.trigger.CameraMovement;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.trigger.GeometryPlanes;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.trigger.NormalList;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.trigger.NormalPlanes;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.trigger.SortTriggering;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.trigger.SortTriggering$SectionTriggers;
import org.joml.Vector3fc;

class GFNITriggers
implements SortTriggering$SectionTriggers<DynamicData> {
    private final Object2ReferenceMap<Vector3fc, NormalList> normalLists = new Object2ReferenceOpenHashMap();

    GFNITriggers() {
    }

    @Override
    public void integrateSection(SortTriggering sortTriggering, class01296 class012962, DynamicData dynamicData, CameraMovement cameraMovement) {
        Object object;
        Object object2;
        long l = class012962.W();
        GeometryPlanes geometryPlanes = dynamicData.getGeometryPlanes();
        ObjectIterator objectIterator = this.normalLists.values().iterator();
        while (objectIterator.hasNext()) {
            object2 = (NormalList)objectIterator.next();
            object = geometryPlanes.getPlanesForNormal((NormalList)object2);
            if (((NormalList)object2).hasSection(l)) {
                if (object == null) {
                    if (!this.removeSectionFromList((NormalList)object2, l)) continue;
                    objectIterator.remove();
                    continue;
                }
                ((NormalList)object2).updateSection((NormalPlanes)object, l);
                continue;
            }
            if (object == null) continue;
            ((NormalList)object2).addSection((NormalPlanes)object, l);
        }
        object2 = geometryPlanes.getAligned();
        if (object2 != null) {
            object = object2;
            int n = ((NormalPlanes[])object).length;
            for (int i = 0; i < n; ++i) {
                Object object3 = object[i];
                if (object3 == null) continue;
                this.addSectionInNewNormalLists((NormalPlanes)object3);
            }
        }
        if ((object = geometryPlanes.getUnaligned()) != null) {
            Iterator iterator = object.iterator();
            while (iterator.hasNext()) {
                NormalPlanes normalPlanes = (NormalPlanes)iterator.next();
                this.addSectionInNewNormalLists(normalPlanes);
            }
        }
        dynamicData.discardGeometryPlanes();
        if (cameraMovement.hasChanged()) {
            for (NormalList normalList : this.normalLists.values()) {
                normalList.processCatchup(sortTriggering, cameraMovement, l);
            }
        }
    }

    @Override
    public void processTriggers(SortTriggering sortTriggering, CameraMovement cameraMovement) {
        for (NormalList normalList : this.normalLists.values()) {
            normalList.processMovement(sortTriggering, cameraMovement);
        }
    }

    private boolean removeSectionFromList(NormalList normalList, long l) {
        normalList.removeSection(l);
        return normalList.isEmpty();
    }

    int getUniqueNormalCount() {
        return this.normalLists.size();
    }

    private void addSectionInNewNormalLists(NormalPlanes normalPlanes) {
        Vector3fc vector3fc = normalPlanes.normal;
        NormalList normalList = (NormalList)this.normalLists.get((Object)vector3fc);
        if (normalList == null) {
            normalList = new NormalList(vector3fc, normalPlanes.alignedDirection);
            this.normalLists.put((Object)vector3fc, (Object)normalList);
            normalList.addSection(normalPlanes, normalPlanes.sectionPos.W());
        }
    }

    @Override
    public void removeSection(long l, TranslucentData translucentData) {
        this.normalLists.values().removeIf(normalList -> this.removeSectionFromList((NormalList)normalList, l));
    }
}

