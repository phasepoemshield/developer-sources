/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class class02052
extends Record {
    private final float minU;
    private final float minV;
    private final float maxU;
    private final float maxV;

    public float L() {
        return this.maxU;
    }

    public class02052(float f, float f2, float f3, float f4) {
        this.minU = f;
        this.minV = f2;
        this.maxU = f3;
        this.maxV = f4;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02052.class, "minU;minV;maxU;maxV", "minU", "minV", "maxU", "maxV"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02052.class, "minU;minV;maxU;maxV", "minU", "minV", "maxU", "maxV"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02052.class, "minU;minV;maxU;maxV", "minU", "minV", "maxU", "maxV"}, this);
    }

    public float u() {
        return this.maxV;
    }

    public float y(int n) {
        return n == 0 || n == 3 ? this.minV : this.maxV;
    }

    public float y() {
        return this.minV;
    }

    public float N() {
        return this.minU;
    }

    public float N(int n) {
        return n == 0 || n == 1 ? this.minU : this.maxU;
    }
}

