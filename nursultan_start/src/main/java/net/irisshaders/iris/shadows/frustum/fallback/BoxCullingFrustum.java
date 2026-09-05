/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00734
 *  minecraft.class01383
 *  net.caffeinemc.mods.sodium.client.render.viewport.Viewport
 *  net.caffeinemc.mods.sodium.client.render.viewport.ViewportProvider
 *  net.caffeinemc.mods.sodium.client.render.viewport.frustum.Frustum
 *  org.joml.Matrix4f
 *  org.joml.Vector3d
 */
package net.irisshaders.iris.shadows.frustum.fallback;

import minecraft.class00734;
import minecraft.class01383;
import net.caffeinemc.mods.sodium.client.render.viewport.Viewport;
import net.caffeinemc.mods.sodium.client.render.viewport.ViewportProvider;
import net.caffeinemc.mods.sodium.client.render.viewport.frustum.Frustum;
import net.irisshaders.iris.shadows.frustum.BoxCuller;
import org.joml.Matrix4f;
import org.joml.Vector3d;

public class BoxCullingFrustum
extends class01383
implements ViewportProvider,
Frustum {
    private final BoxCuller boxCuller;
    private final Vector3d position = new Vector3d();
    public static final float CHUNK_SECTION_RADIUS = 8.0f;
    public static final float CHUNK_SECTION_MARGIN = 1.125f;
    public static final float SECTION_HALF_SIZE = 9.125f;

    public BoxCullingFrustum(BoxCuller boxCuller) {
        super(new Matrix4f(), new Matrix4f());
        this.boxCuller = boxCuller;
    }

    public boolean testAab(float f, float f2, float f3, float f4, float f5, float f6) {
        return !this.boxCuller.isCulledSodium(f, f2, f3, f4, f5, f6);
    }

    public void method_23088(double d, double d2, double d3) {
        this.position.set(d, d2, d3);
        this.boxCuller.setPosition(d, d2, d3);
    }

    public int intersectAab(float f, float f2, float f3, float f4, float f5, float f6) {
        return this.boxCuller.intersectAab(f, f2, f3, f4, f5, f6);
    }

    public Viewport sodium$createViewport() {
        return new Viewport((Frustum)this, this.position);
    }

    public boolean method_23093(class00734 class007342) {
        return !this.boxCuller.isCulled(class007342);
    }

    public boolean testSection(float f, float f2, float f3) {
        float f4 = f - 9.125f;
        float f5 = f2 - 9.125f;
        float f6 = f3 - 9.125f;
        float f7 = f + 9.125f;
        float f8 = f2 + 9.125f;
        float f9 = f3 + 9.125f;
        return !this.boxCuller.isCulledSodium(f4, f5, f6, f7, f8, f9);
    }

    public boolean canDetermineInvisible(double d, double d2, double d3, double d4, double d5, double d6) {
        return false;
    }

    public boolean testSectionExpanded(float f, float f2, float f3, float f4) {
        float f5 = f - f4;
        float f6 = f2 - f4;
        float f7 = f3 - f4;
        float f8 = f + f4;
        float f9 = f2 + f4;
        float f10 = f3 + f4;
        return !this.boxCuller.isCulledSodium(f5, f6, f7, f8, f9, f10);
    }
}

