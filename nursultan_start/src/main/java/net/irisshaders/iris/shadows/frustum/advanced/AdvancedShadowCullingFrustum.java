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
 *  org.joml.Matrix4fc
 *  org.joml.Vector3d
 *  org.joml.Vector3f
 *  org.joml.Vector3fc
 *  org.joml.Vector4f
 */
package net.irisshaders.iris.shadows.frustum.advanced;

import com.sun.management.HotSpotDiagnosticMXBean;
import com.sun.management.VMOption;
import java.lang.management.ManagementFactory;
import minecraft.class00734;
import minecraft.class01383;
import net.caffeinemc.mods.sodium.client.render.viewport.Viewport;
import net.caffeinemc.mods.sodium.client.render.viewport.ViewportProvider;
import net.caffeinemc.mods.sodium.client.render.viewport.frustum.Frustum;
import net.irisshaders.iris.shadows.frustum.BoxCuller;
import net.irisshaders.iris.shadows.frustum.advanced.BaseClippingPlanes;
import net.irisshaders.iris.shadows.frustum.advanced.NeighboringPlaneSet;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.joml.Vector3d;
import org.joml.Vector3f;
import org.joml.Vector3fc;
import org.joml.Vector4f;

public class AdvancedShadowCullingFrustum
extends class01383
implements ViewportProvider,
Frustum {
    private static final int MAX_CLIPPING_PLANES = 13;
    protected final BoxCuller boxCuller;
    private final float[][] planes = new float[13][4];
    private final Vector3f shadowLightVectorFromOrigin;
    private final Vector3d position = new Vector3d();
    public double x;
    public double y;
    public double z;
    private int planeCount = 0;
    private static final boolean FMA_SUPPORT;
    public static final float CHUNK_SECTION_RADIUS = 8.0f;
    public static final float CHUNK_SECTION_MARGIN = 1.125f;
    public static final float SECTION_HALF_SIZE = 9.125f;

    public AdvancedShadowCullingFrustum(Matrix4fc matrix4fc, Matrix4fc matrix4fc2, Vector3f vector3f, BoxCuller boxCuller) {
        super(new Matrix4f(), new Matrix4f());
        this.shadowLightVectorFromOrigin = vector3f;
        BaseClippingPlanes baseClippingPlanes = new BaseClippingPlanes(matrix4fc);
        boolean[] blArray = this.addBackPlanes(baseClippingPlanes);
        this.addEdgePlanes(baseClippingPlanes, blArray);
        this.boxCuller = boxCuller;
    }

    static {
        HotSpotDiagnosticMXBean hotSpotDiagnosticMXBean = ManagementFactory.getPlatformMXBean(HotSpotDiagnosticMXBean.class);
        if (hotSpotDiagnosticMXBean == null) {
            FMA_SUPPORT = false;
        } else {
            VMOption vMOption = hotSpotDiagnosticMXBean.getVMOption("UseFMA");
            FMA_SUPPORT = Boolean.parseBoolean(vMOption.getValue());
        }
    }

    public boolean testAab(float f, float f2, float f3, float f4, float f5, float f6) {
        return (this.boxCuller == null || !this.boxCuller.isCulledSodium(f, f2, f3, f4, f5, f6)) && this.checkCornerVisibility(f, f2, f3, f4, f5, f6) != -3;
    }

    public void method_23088(double d, double d2, double d3) {
        if (this.boxCuller != null) {
            this.boxCuller.setPosition(d, d2, d3);
        }
        this.x = d;
        this.y = d2;
        this.z = d3;
    }

    public int intersectAab(float f, float f2, float f3, float f4, float f5, float f6) {
        if (this.boxCuller == null) {
            return this.checkCornerVisibility(f, f2, f3, f4, f5, f6);
        }
        int n = this.boxCuller.intersectAab(f, f2, f3, f4, f5, f6);
        if (n == -3) {
            return -3;
        }
        int n2 = this.checkCornerVisibility(f, f2, f3, f4, f5, f6);
        if (n2 == -3) {
            return -3;
        }
        if (n2 == -2 && n == -2) {
            return -2;
        }
        return -1;
    }

    public Viewport sodium$createViewport() {
        return new Viewport((Frustum)this, this.position.set(this.x, this.y, this.z));
    }

    protected int isVisible(double d, double d2, double d3, double d4, double d5, double d6) {
        float f = (float)(d - this.x);
        float f2 = (float)(d2 - this.y);
        float f3 = (float)(d3 - this.z);
        float f4 = (float)(d4 - this.x);
        float f5 = (float)(d5 - this.y);
        float f6 = (float)(d6 - this.z);
        return this.checkCornerVisibility(f, f2, f3, f4, f5, f6);
    }

    private Vector3f truncate(Vector4f vector4f) {
        return new Vector3f(vector4f.x(), vector4f.y(), vector4f.z());
    }

    private float lengthSquared(Vector3f vector3f) {
        float f = vector3f.x();
        float f2 = vector3f.y();
        float f3 = vector3f.z();
        return f * f + f2 * f2 + f3 * f3;
    }

    private Vector3f cross(Vector3f vector3f, Vector3f vector3f2) {
        Vector3f vector3f3 = new Vector3f(vector3f.x(), vector3f.y(), vector3f.z());
        vector3f3.cross((Vector3fc)vector3f2);
        return vector3f3;
    }

    public boolean method_23093(class00734 class007342) {
        if (this.boxCuller != null && this.boxCuller.isCulled(class007342)) {
            return false;
        }
        return this.isVisible(class007342.N, class007342.y, class007342.L, class007342.u, class007342.i, class007342.R) != -3;
    }

    public boolean testSection(float f, float f2, float f3) {
        float f4 = f - 9.125f;
        float f5 = f + 9.125f;
        float f6 = f2 - 9.125f;
        float f7 = f2 + 9.125f;
        float f8 = f3 - 9.125f;
        float f9 = f3 + 9.125f;
        for (int i = 0; i < this.planeCount; ++i) {
            float f10;
            float[] fArray = this.planes[i];
            float f11 = fArray[0] < 0.0f ? f4 : f5;
            float f12 = fArray[1] < 0.0f ? f6 : f7;
            float f13 = f10 = fArray[2] < 0.0f ? f8 : f9;
            if (!(Math.fma(fArray[0], f11, Math.fma(fArray[1], f12, fArray[2] * f10)) < -fArray[3])) continue;
            return false;
        }
        return true;
    }

    public boolean canDetermineInvisible(double d, double d2, double d3, double d4, double d5, double d6) {
        return false;
    }

    protected int checkCornerVisibility(float f, float f2, float f3, float f4, float f5, float f6) {
        boolean bl = true;
        for (int i = 0; i < this.planeCount; ++i) {
            float f7;
            float[] fArray = this.planes[i];
            float f8 = fArray[0] < 0.0f ? f : f4;
            float f9 = fArray[1] < 0.0f ? f2 : f5;
            float f10 = f7 = fArray[2] < 0.0f ? f3 : f6;
            if (FMA_SUPPORT) {
                if (Math.fma(fArray[0], f8, Math.fma(fArray[1], f9, fArray[2] * f7)) >= -fArray[3]) {
                    bl &= Math.fma(fArray[0], fArray[0] < 0.0f ? f4 : f, Math.fma(fArray[1], fArray[1] < 0.0f ? f5 : f2, Math.fma(fArray[2], fArray[2] < 0.0f ? f6 : f3, fArray[3]))) >= 0.0f;
                    continue;
                }
                return -3;
            }
            if (AdvancedShadowCullingFrustum.safeFMA(fArray[0], f8, AdvancedShadowCullingFrustum.safeFMA(fArray[1], f9, fArray[2] * f7)) >= -fArray[3]) {
                bl &= AdvancedShadowCullingFrustum.safeFMA(fArray[0], fArray[0] < 0.0f ? f4 : f, AdvancedShadowCullingFrustum.safeFMA(fArray[1], fArray[1] < 0.0f ? f5 : f2, AdvancedShadowCullingFrustum.safeFMA(fArray[2], fArray[2] < 0.0f ? f6 : f3, fArray[3]))) >= 0.0f;
                continue;
            }
            return -3;
        }
        return bl ? -2 : -1;
    }

    public boolean checkCornerVisibilityBool(float f, float f2, float f3, float f4, float f5, float f6) {
        for (int i = 0; i < this.planeCount; ++i) {
            float f7;
            float[] fArray = this.planes[i];
            float f8 = fArray[0] < 0.0f ? f : f4;
            float f9 = fArray[1] < 0.0f ? f2 : f5;
            float f10 = f7 = fArray[2] < 0.0f ? f3 : f6;
            if (!(Math.fma(fArray[0], f8, Math.fma(fArray[1], f9, fArray[2] * f7)) < -fArray[3])) continue;
            return false;
        }
        return true;
    }

    private boolean[] addBackPlanes(BaseClippingPlanes baseClippingPlanes) {
        Vector4f[] vector4fArray = baseClippingPlanes.getPlanes();
        boolean[] blArray = new boolean[vector4fArray.length];
        for (int i = 0; i < vector4fArray.length; ++i) {
            Vector4f vector4f = vector4fArray[i];
            Vector3f vector3f = this.truncate(vector4f);
            float f = vector3f.dot((Vector3fc)this.shadowLightVectorFromOrigin);
            boolean bl = (double)f > 0.0;
            boolean bl2 = (double)f == 0.0;
            blArray[i] = bl;
            if (!bl && !bl2) continue;
            this.addPlane(new float[]{vector4f.x, vector4f.y, vector4f.z, vector4f.w});
        }
        return blArray;
    }

    private void addEdgePlane(Vector4f vector4f, Vector4f vector4f2) {
        Vector3f vector3f = this.truncate(vector4f);
        Vector3f vector3f2 = this.truncate(vector4f2);
        Vector3f vector3f3 = this.cross(vector3f, vector3f2);
        Vector3f vector3f4 = this.cross(vector3f3, this.shadowLightVectorFromOrigin);
        Vector3f vector3f5 = this.cross(vector3f3, vector3f);
        Vector3f vector3f6 = this.cross(vector3f2, vector3f3);
        vector3f5.mul(-vector4f2.w());
        vector3f6.mul(-vector4f.w());
        vector3f5.add((Vector3fc)vector3f6);
        Vector3f vector3f7 = vector3f5;
        vector3f7.mul(1.0f / this.lengthSquared(vector3f3));
        float f = vector3f4.dot((Vector3fc)vector3f7);
        float f2 = -f;
        vector3f5 = this.extend(vector3f4, f2);
        this.addPlane(new float[]{vector3f5.x, vector3f5.y, vector3f5.z, vector3f5.w});
    }

    private void addEdgePlanes(BaseClippingPlanes baseClippingPlanes, boolean[] blArray) {
        Vector4f[] vector4fArray = baseClippingPlanes.getPlanes();
        for (int i = 0; i < vector4fArray.length; ++i) {
            if (!blArray[i]) continue;
            Vector4f vector4f = vector4fArray[i];
            NeighboringPlaneSet neighboringPlaneSet = NeighboringPlaneSet.forPlane(i);
            if (!blArray[neighboringPlaneSet.plane0()]) {
                this.addEdgePlane(vector4f, vector4fArray[neighboringPlaneSet.plane0()]);
            }
            if (!blArray[neighboringPlaneSet.plane1()]) {
                this.addEdgePlane(vector4f, vector4fArray[neighboringPlaneSet.plane1()]);
            }
            if (!blArray[neighboringPlaneSet.plane2()]) {
                this.addEdgePlane(vector4f, vector4fArray[neighboringPlaneSet.plane2()]);
            }
            if (blArray[neighboringPlaneSet.plane3()]) continue;
            this.addEdgePlane(vector4f, vector4fArray[neighboringPlaneSet.plane3()]);
        }
    }

    public int fastAabbTest(float f, float f2, float f3, float f4, float f5, float f6) {
        if (this.boxCuller != null && this.boxCuller.isCulled(f, f2, f3, f4, f5, f6)) {
            return 0;
        }
        return this.isVisible(f, f2, f3, f4, f5, f6);
    }

    public boolean testSectionExpanded(float f, float f2, float f3, float f4) {
        float f5 = f - f4;
        float f6 = f + f4;
        float f7 = f2 - f4;
        float f8 = f2 + f4;
        float f9 = f3 - f4;
        float f10 = f3 + f4;
        for (int i = 0; i < this.planeCount; ++i) {
            float f11;
            float[] fArray = this.planes[i];
            float f12 = fArray[0] < 0.0f ? f5 : f6;
            float f13 = fArray[1] < 0.0f ? f7 : f8;
            float f14 = f11 = fArray[2] < 0.0f ? f9 : f10;
            if (!(Math.fma(fArray[0], f12, Math.fma(fArray[1], f13, fArray[2] * f11)) < -fArray[3])) continue;
            return false;
        }
        return true;
    }

    private void addPlane(float[] fArray) {
        this.planes[this.planeCount] = fArray;
        ++this.planeCount;
    }

    private Vector4f extend(Vector3f vector3f, float f) {
        return new Vector4f(vector3f.x(), vector3f.y(), vector3f.z(), f);
    }

    private static float safeFMA(float f, float f2, float f3) {
        return f * f2 + f3;
    }
}

