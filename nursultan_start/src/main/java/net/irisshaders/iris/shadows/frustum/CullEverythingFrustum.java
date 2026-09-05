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
package net.irisshaders.iris.shadows.frustum;

import minecraft.class00734;
import minecraft.class01383;
import net.caffeinemc.mods.sodium.client.render.viewport.Viewport;
import net.caffeinemc.mods.sodium.client.render.viewport.ViewportProvider;
import net.caffeinemc.mods.sodium.client.render.viewport.frustum.Frustum;
import org.joml.Matrix4f;
import org.joml.Vector3d;

public class CullEverythingFrustum
extends class01383
implements ViewportProvider,
Frustum {
    private final Vector3d position = new Vector3d();

    public CullEverythingFrustum() {
        super(new Matrix4f(), new Matrix4f());
    }

    public boolean testAab(float f, float f2, float f3, float f4, float f5, float f6) {
        return false;
    }

    public void method_23088(double d, double d2, double d3) {
        this.position.set(d, d2, d3);
    }

    public int intersectAab(float f, float f2, float f3, float f4, float f5, float f6) {
        return -3;
    }

    public Viewport sodium$createViewport() {
        return new Viewport((Frustum)this, this.position);
    }

    public boolean method_23093(class00734 class007342) {
        return false;
    }

    public boolean testSection(float f, float f2, float f3) {
        return false;
    }

    public boolean canDetermineInvisible(double d, double d2, double d3, double d4, double d5, double d6) {
        return false;
    }

    public boolean testSectionExpanded(float f, float f2, float f3, float f4) {
        return false;
    }
}

