/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Vector3f
 */
package minecraft;

import org.joml.Vector3f;

public class class04366 {
    public static Vector3f y(float f, float f2, float f3) {
        return new Vector3f(f * ((float)Math.PI / 180), f2 * ((float)Math.PI / 180), f3 * ((float)Math.PI / 180));
    }

    public static Vector3f N(float f, float f2, float f3) {
        return new Vector3f(f, -f2, f3);
    }

    public static Vector3f N(double d, double d2, double d3) {
        return new Vector3f((float)(d - 1.0), (float)(d2 - 1.0), (float)(d3 - 1.0));
    }
}

