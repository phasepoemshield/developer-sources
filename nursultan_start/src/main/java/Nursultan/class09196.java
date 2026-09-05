/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11300
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import Nursultan.class11300;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public class class09196
extends Record {
    public float deltaH;
    public int alpha;
    public float ratioS;
    public float ratioL;
    public static Object i_0;

    public float L() {
        return this.deltaH;
    }

    public class09196(float f, float f2, float f3, int n) {
        this.deltaH = f;
        this.ratioS = f2;
        this.ratioL = f3;
        this.alpha = n;
    }

    static {
        class09196.Z();
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09196.class, "deltaH;ratioS;ratioL;alpha", "deltaH", "ratioS", "ratioL", "alpha"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09196.class, "deltaH;ratioS;ratioL;alpha", "deltaH", "ratioS", "ratioL", "alpha"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09196.class, "deltaH;ratioS;ratioL;alpha", "deltaH", "ratioS", "ratioL", "alpha"}, this);
    }

    private static void Z() {
        i_0 = Float.valueOf(0.001f);
    }

    public float u() {
        return this.ratioL;
    }

    public int y() {
        return this.alpha;
    }

    public int N(int n) {
        float[] fArray = class11300.L((int)n);
        float f = fArray[0] + this.deltaH;
        float f2 = Math.clamp((float)(fArray[1] * this.ratioS), (float)0.0f, (float)1.0f);
        float f3 = Math.clamp((float)(fArray[2] * this.ratioL), (float)0.0f, (float)1.0f);
        int n2 = class11300.y((float)f, (float)f2, (float)f3);
        return this.alpha << 24 | n2 & 0xFFFFFF;
    }

    public static class09196 N(int n, int n2) {
        float[] fArray = class11300.L((int)n);
        float[] fArray2 = class11300.L((int)n2);
        float f = fArray2[0] - fArray[0];
        float f2 = fArray[1] > 0.001f ? fArray2[1] / fArray[1] : fArray2[1];
        float f3 = fArray[2] > 0.001f ? fArray2[2] / fArray[2] : fArray2[2];
        int n3 = n2 >>> 24 & 0xFF;
        return new class09196(f, f2, f3, n3);
    }

    public float N() {
        return this.ratioS;
    }
}

