/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.FrustumIntersection
 *  org.joml.Vector4f
 */
package net.caffeinemc.mods.sodium.client.render.viewport.frustum;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Field;
import net.caffeinemc.mods.sodium.client.render.viewport.frustum.Frustum;
import org.joml.FrustumIntersection;
import org.joml.Vector4f;

public final class SimpleFrustum
implements Frustum {
    private float nxX;
    private float nxY;
    private float nxZ;
    private float negNxW;
    private float pxX;
    private float pxY;
    private float pxZ;
    private float negPxW;
    private float nyX;
    private float nyY;
    private float nyZ;
    private float negNyW;
    private float pyX;
    private float pyY;
    private float pyZ;
    private float negPyW;
    private float nzX;
    private float nzY;
    private float nzZ;
    private float negNzW;
    private float pzX;
    private float pzY;
    private float pzZ;
    private float negPzW;
    private final FrustumIntersection frustum;
    private static final MethodHandle PLANES_GETTER;

    public SimpleFrustum(FrustumIntersection frustumIntersection) {
        Vector4f[] vector4fArray;
        this.frustum = frustumIntersection;
        try {
            vector4fArray = PLANES_GETTER.invokeExact(frustumIntersection);
        }
        catch (Throwable throwable) {
            throw new RuntimeException("Failed to access planes field in FrustumIntersection", throwable);
        }
        this.nxX = vector4fArray[0].x;
        this.nxY = vector4fArray[0].y;
        this.nxZ = vector4fArray[0].z;
        this.pxX = vector4fArray[1].x;
        this.pxY = vector4fArray[1].y;
        this.pxZ = vector4fArray[1].z;
        this.nyX = vector4fArray[2].x;
        this.nyY = vector4fArray[2].y;
        this.nyZ = vector4fArray[2].z;
        this.pyX = vector4fArray[3].x;
        this.pyY = vector4fArray[3].y;
        this.pyZ = vector4fArray[3].z;
        this.nzX = vector4fArray[4].x;
        this.nzY = vector4fArray[4].y;
        this.nzZ = vector4fArray[4].z;
        this.pzX = vector4fArray[5].x;
        this.pzY = vector4fArray[5].y;
        this.pzZ = vector4fArray[5].z;
        float f = 9.125f;
        this.negNxW = -(vector4fArray[0].w + this.nxX * (this.nxX < 0.0f ? -9.125f : 9.125f) + this.nxY * (this.nxY < 0.0f ? -9.125f : 9.125f) + this.nxZ * (this.nxZ < 0.0f ? -9.125f : 9.125f));
        this.negPxW = -(vector4fArray[1].w + this.pxX * (this.pxX < 0.0f ? -9.125f : 9.125f) + this.pxY * (this.pxY < 0.0f ? -9.125f : 9.125f) + this.pxZ * (this.pxZ < 0.0f ? -9.125f : 9.125f));
        this.negNyW = -(vector4fArray[2].w + this.nyX * (this.nyX < 0.0f ? -9.125f : 9.125f) + this.nyY * (this.nyY < 0.0f ? -9.125f : 9.125f) + this.nyZ * (this.nyZ < 0.0f ? -9.125f : 9.125f));
        this.negPyW = -(vector4fArray[3].w + this.pyX * (this.pyX < 0.0f ? -9.125f : 9.125f) + this.pyY * (this.pyY < 0.0f ? -9.125f : 9.125f) + this.pyZ * (this.pyZ < 0.0f ? -9.125f : 9.125f));
        this.negNzW = -(vector4fArray[4].w + this.nzX * (this.nzX < 0.0f ? -9.125f : 9.125f) + this.nzY * (this.nzY < 0.0f ? -9.125f : 9.125f) + this.nzZ * (this.nzZ < 0.0f ? -9.125f : 9.125f));
        this.negPzW = -(vector4fArray[5].w + this.pzX * (this.pzX < 0.0f ? -9.125f : 9.125f) + this.pzY * (this.pzY < 0.0f ? -9.125f : 9.125f) + this.pzZ * (this.pzZ < 0.0f ? -9.125f : 9.125f));
    }

    static {
        try {
            Field field = FrustumIntersection.class.getDeclaredField("planes");
            field.setAccessible(true);
            PLANES_GETTER = MethodHandles.lookup().unreflectGetter(field);
        }
        catch (IllegalAccessException | NoSuchFieldException reflectiveOperationException) {
            throw new RuntimeException("Failed to find planes field in JOML", reflectiveOperationException);
        }
    }

    @Override
    public boolean testAab(float f, float f2, float f3, float f4, float f5, float f6) {
        return this.frustum.testAab(f, f2, f3, f4, f5, f6);
    }

    @Override
    public int intersectAab(float f, float f2, float f3, float f4, float f5, float f6) {
        return this.frustum.intersectAab(f, f2, f3, f4, f5, f6);
    }

    @Override
    public boolean testSection(float f, float f2, float f3) {
        return this.nxX * f + this.nxY * f2 + this.nxZ * f3 >= this.negNxW && this.pxX * f + this.pxY * f2 + this.pxZ * f3 >= this.negPxW && this.nyX * f + this.nyY * f2 + this.nyZ * f3 >= this.negNyW && this.pyX * f + this.pyY * f2 + this.pyZ * f3 >= this.negPyW && this.nzX * f + this.nzY * f2 + this.nzZ * f3 >= this.negNzW;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean testSectionExpanded(float f, float f2, float f3, float f4) {
        float f5 = f - f4;
        float f6 = f + f4;
        float f7 = f2 - f4;
        float f8 = f2 + f4;
        float f9 = f3 - f4;
        float f10 = f3 + f4;
        float f11 = this.nxX * (this.nxX < 0.0f ? f5 : f6) + this.nxY * (this.nxY < 0.0f ? f7 : f8);
        float f12 = this.nxZ < 0.0f ? f9 : f10;
        if (!(f11 + this.nxZ * f12 >= this.negNxW)) return false;
        float f13 = this.pxX * (this.pxX < 0.0f ? f5 : f6) + this.pxY * (this.pxY < 0.0f ? f7 : f8);
        float f14 = this.pxZ < 0.0f ? f9 : f10;
        if (!(f13 + this.pxZ * f14 >= this.negPxW)) return false;
        float f15 = this.nyX * (this.nyX < 0.0f ? f5 : f6) + this.nyY * (this.nyY < 0.0f ? f7 : f8);
        float f16 = this.nyZ < 0.0f ? f9 : f10;
        if (!(f15 + this.nyZ * f16 >= this.negNyW)) return false;
        float f17 = this.pyX * (this.pyX < 0.0f ? f5 : f6) + this.pyY * (this.pyY < 0.0f ? f7 : f8);
        float f18 = this.pyZ < 0.0f ? f9 : f10;
        if (!(f17 + this.pyZ * f18 >= this.negPyW)) return false;
        float f19 = this.nzX * (this.nzX < 0.0f ? f5 : f6) + this.nzY * (this.nzY < 0.0f ? f7 : f8);
        float f20 = this.nzZ < 0.0f ? f9 : f10;
        if (!(f19 + this.nzZ * f20 >= this.negNzW)) return false;
        float f21 = this.pzX * (this.pzX < 0.0f ? f5 : f6) + this.pzY * (this.pzY < 0.0f ? f7 : f8);
        float f22 = this.pzZ < 0.0f ? f9 : f10;
        if (!(f21 + this.pzZ * f22 >= this.negPzW)) return false;
        return true;
    }
}

