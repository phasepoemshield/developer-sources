/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00734
 *  net.caffeinemc.mods.sodium.client.render.viewport.frustum.Frustum
 *  org.joml.Matrix4fc
 *  org.joml.Vector3f
 */
package net.irisshaders.iris.shadows.frustum.advanced;

import minecraft.class00734;
import net.caffeinemc.mods.sodium.client.render.viewport.frustum.Frustum;
import net.irisshaders.iris.shadows.frustum.BoxCuller;
import net.irisshaders.iris.shadows.frustum.advanced.AdvancedShadowCullingFrustum;
import org.joml.Matrix4fc;
import org.joml.Vector3f;

public class SafeZoneCullingFrustum
extends AdvancedShadowCullingFrustum
implements Frustum {
    private final BoxCuller distanceCuller;

    public SafeZoneCullingFrustum(Matrix4fc matrix4fc, Matrix4fc matrix4fc2, Vector3f vector3f, BoxCuller boxCuller, BoxCuller boxCuller2) {
        super(matrix4fc, matrix4fc2, vector3f, boxCuller);
        this.distanceCuller = boxCuller2;
    }

    @Override
    public boolean testAab(float f, float f2, float f3, float f4, float f5, float f6) {
        if (this.distanceCuller != null && this.distanceCuller.isCulledSodium(f, f2, f3, f4, f5, f6)) {
            return false;
        }
        if (this.boxCuller != null && !this.boxCuller.isCulledSodium(f, f2, f3, f4, f5, f6)) {
            return true;
        }
        return this.checkCornerVisibility(f, f2, f3, f4, f5, f6) != -3;
    }

    @Override
    public void method_23088(double d, double d2, double d3) {
        if (this.distanceCuller != null) {
            this.distanceCuller.setPosition(d, d2, d3);
        }
        super.method_23088(d, d2, d3);
    }

    @Override
    public int intersectAab(float f, float f2, float f3, float f4, float f5, float f6) {
        int n = this.distanceCuller.intersectAab(f, f2, f3, f4, f5, f6);
        if (n == -3) {
            return -3;
        }
        int n2 = -3;
        if (this.boxCuller != null && (n2 = this.boxCuller.intersectAab(f, f2, f3, f4, f5, f6)) == -2) {
            return -2;
        }
        if (n == -1 && n2 == -1) {
            return -1;
        }
        int n3 = this.checkCornerVisibility(f, f2, f3, f4, f5, f6);
        if (n2 == -3 && n3 == -3) {
            return -3;
        }
        if (n3 == -2 && n == -2) {
            return -2;
        }
        return -1;
    }

    @Override
    public boolean method_23093(class00734 class007342) {
        if (this.distanceCuller != null && this.distanceCuller.isCulled(class007342)) {
            return false;
        }
        if (this.boxCuller != null && !this.boxCuller.isCulled(class007342)) {
            return true;
        }
        return this.isVisible(class007342.N, class007342.y, class007342.L, class007342.u, class007342.i, class007342.R) != 0;
    }

    @Override
    public int fastAabbTest(float f, float f2, float f3, float f4, float f5, float f6) {
        if (this.distanceCuller != null && this.distanceCuller.isCulled(f, f2, f3, f4, f5, f6)) {
            return 0;
        }
        if (this.boxCuller != null && !this.boxCuller.isCulled(f, f2, f3, f4, f5, f6)) {
            return 2;
        }
        return this.isVisible(f, f2, f3, f4, f5, f6);
    }
}

