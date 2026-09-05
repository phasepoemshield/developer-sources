/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01296
 *  net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.PresentTranslucentData
 *  net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.trigger.GeometryPlanes
 *  org.joml.Vector3dc
 */
package net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data;

import minecraft.class01296;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.SortType;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.DynamicSorter;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.PresentTranslucentData;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.trigger.GeometryPlanes;
import org.joml.Vector3dc;

public abstract class DynamicData
extends PresentTranslucentData {
    private GeometryPlanes geometryPlanes;
    private final Vector3dc initialCameraPos;

    DynamicData(class01296 class012962, int n, GeometryPlanes geometryPlanes, Vector3dc vector3dc) {
        super(class012962, n);
        this.geometryPlanes = geometryPlanes;
        this.initialCameraPos = vector3dc;
    }

    public GeometryPlanes getGeometryPlanes() {
        return this.geometryPlanes;
    }

    public SortType getSortType() {
        return SortType.DYNAMIC;
    }

    public abstract DynamicSorter getSorter();

    public Vector3dc getInitialCameraPos() {
        return this.initialCameraPos;
    }

    public void discardGeometryPlanes() {
        this.geometryPlanes = null;
    }
}

