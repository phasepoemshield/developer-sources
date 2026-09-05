/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class class09965
extends Record {
    private final float topLeft;
    private final float topRight;
    private final float bottomRight;
    private final float bottomLeft;
    public static final class09965 N = class09965.N(0.0f);

    public boolean L() {
        return Float.compare(this.topLeft, this.topRight) == 0 && Float.compare(this.topRight, this.bottomRight) == 0 && Float.compare(this.bottomRight, this.bottomLeft) == 0;
    }

    public float M() {
        return this.bottomLeft;
    }

    public class09965(float f, float f2, float f3, float f4) {
        f = class09965.y(f);
        f2 = class09965.y(f2);
        f3 = class09965.y(f3);
        f4 = class09965.y(f4);
        this.topLeft = f;
        this.topRight = f2;
        this.bottomRight = f3;
        this.bottomLeft = f4;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09965.class, "topLeft;topRight;bottomRight;bottomLeft", "topLeft", "topRight", "bottomRight", "bottomLeft"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09965.class, "topLeft;topRight;bottomRight;bottomLeft", "topLeft", "topRight", "bottomRight", "bottomLeft"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09965.class, "topLeft;topRight;bottomRight;bottomLeft", "topLeft", "topRight", "bottomRight", "bottomLeft"}, this);
    }

    public float i() {
        return this.topRight;
    }

    public float u() {
        return this.topLeft;
    }

    public boolean y() {
        return this.N() > 0.0f;
    }

    private static float y(float f) {
        if (!Float.isFinite(f)) {
            return 0.0f;
        }
        return Math.max(0.0f, f);
    }

    public static class09965 N(float f) {
        float f2 = class09965.y(f);
        return new class09965(f2, f2, f2, f2);
    }

    public float N() {
        return Math.max(Math.max(this.topLeft, this.topRight), Math.max(this.bottomRight, this.bottomLeft));
    }

    public float R() {
        return this.bottomRight;
    }
}

