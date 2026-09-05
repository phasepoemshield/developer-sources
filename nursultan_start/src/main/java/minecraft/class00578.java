/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00405
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00405;
import minecraft.class00620;

public final class class00578
extends Record
implements class00620 {
    private final float L;
    private final float u;
    private final float i;
    private final float R;
    private final float M;
    private final class00405 B;
    public static final float N = 9.0f;
    public static final float y = 7.0f;

    public float L() {
        return this.i;
    }

    @Override
    public float P() {
        return this.L;
    }

    @Override
    public float T() {
        return this.L + this.i;
    }

    public class00578(float f, float f2, float f3, float f4, float f5, class00405 class004052) {
        this.L = f;
        this.u = f2;
        this.i = f3;
        this.R = f4;
        this.M = f5;
        this.B = class004052;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00578.class, "x;y;advance;ascent;height;style", "L", "u", "i", "R", "M", "B"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00578.class, "x;y;advance;ascent;height;style", "L", "u", "i", "R", "M", "B"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00578.class, "x;y;advance;ascent;height;style", "L", "u", "i", "R", "M", "B"}, this);
    }

    public float i() {
        return this.M;
    }

    @Override
    public float b() {
        return this.s() + this.M;
    }

    @Override
    public float s() {
        return this.u + 7.0f - this.R;
    }

    @Override
    public class00405 z() {
        return this.B;
    }

    public float u() {
        return this.R;
    }

    public float y() {
        return this.u;
    }

    public float N() {
        return this.L;
    }
}

