/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02566
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class02566;

public final class class06747
extends Record {
    private final int stroke;
    private final float strokeWidth;
    private final int fill;
    private static final float u = 2.5f;

    public int L() {
        return this.stroke;
    }

    public class06747(int n, float f, int n2) {
        this.stroke = n;
        this.strokeWidth = f;
        this.fill = n2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class06747.class, "stroke;strokeWidth;fill", "stroke", "strokeWidth", "fill"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class06747.class, "stroke;strokeWidth;fill", "stroke", "strokeWidth", "fill"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class06747.class, "stroke;strokeWidth;fill", "stroke", "strokeWidth", "fill"}, this);
    }

    public int i() {
        return this.fill;
    }

    public float u() {
        return this.strokeWidth;
    }

    public static class06747 y(int n) {
        return new class06747(0, 0.0f, n);
    }

    public int y(float f) {
        return class02566.N((int)this.fill, (float)f);
    }

    public boolean y() {
        return this.stroke != 0 && this.strokeWidth > 0.0f;
    }

    public int N(float f) {
        return class02566.N((int)this.stroke, (float)f);
    }

    public static class06747 N(int n) {
        return new class06747(n, 2.5f, 0);
    }

    public static class06747 N(int n, float f) {
        return new class06747(n, f, 0);
    }

    public boolean N() {
        return this.fill != 0;
    }

    public static class06747 N(int n, float f, int n2) {
        return new class06747(n, f, n2);
    }
}

