/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.sodium.client.render.viewport;

public class CameraTransform {
    private static final float PRECISION_MODIFIER = 128.0f;
    public final int intX;
    public final int intY;
    public final int intZ;
    public final float fracX;
    public final float fracY;
    public final float fracZ;
    public final double x;
    public final double y;
    public final double z;

    public CameraTransform(double d, double d2, double d3) {
        this.intX = CameraTransform.integral(d);
        this.intY = CameraTransform.integral(d2);
        this.intZ = CameraTransform.integral(d3);
        this.fracX = CameraTransform.fractional(d);
        this.fracY = CameraTransform.fractional(d2);
        this.fracZ = CameraTransform.fractional(d3);
        this.x = d;
        this.y = d2;
        this.z = d3;
    }

    private static int integral(double d) {
        return (int)d;
    }

    private static float fractional(double d) {
        float f = (float)(d - (double)CameraTransform.integral(d));
        float f2 = Math.copySign(128.0f, f);
        return f + f2 - f2;
    }
}

