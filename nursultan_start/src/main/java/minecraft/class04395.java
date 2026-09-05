/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class04995
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class04995;

public final class class04395
extends Record {
    private final float startAlpha;
    private final float endAlpha;
    private final float startAtNormalizedAge;
    private final float endAtNormalizedAge;
    public static final class04395 N = new class04395(1.0f, 1.0f, 0.0f, 1.0f);

    public float L() {
        return this.endAlpha;
    }

    public class04395(float f, float f2, float f3, float f4) {
        this.startAlpha = f;
        this.endAlpha = f2;
        this.startAtNormalizedAge = f3;
        this.endAtNormalizedAge = f4;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04395.class, "startAlpha;endAlpha;startAtNormalizedAge;endAtNormalizedAge", "startAlpha", "endAlpha", "startAtNormalizedAge", "endAtNormalizedAge"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04395.class, "startAlpha;endAlpha;startAtNormalizedAge;endAtNormalizedAge", "startAlpha", "endAlpha", "startAtNormalizedAge", "endAtNormalizedAge"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04395.class, "startAlpha;endAlpha;startAtNormalizedAge;endAtNormalizedAge", "startAlpha", "endAlpha", "startAtNormalizedAge", "endAtNormalizedAge"}, this);
    }

    public float i() {
        return this.endAtNormalizedAge;
    }

    public float u() {
        return this.startAtNormalizedAge;
    }

    public float y() {
        return this.startAlpha;
    }

    public boolean N() {
        return this.startAlpha >= 1.0f && this.endAlpha >= 1.0f;
    }

    public float N(int n, int n2, float f) {
        if (class04995.y((float)this.startAlpha, (float)this.endAlpha)) {
            return this.startAlpha;
        }
        return class04995.y((float)class04995.R((float)(((float)n + f) / (float)n2), (float)this.startAtNormalizedAge, (float)this.endAtNormalizedAge), (float)this.startAlpha, (float)this.endAlpha);
    }
}

