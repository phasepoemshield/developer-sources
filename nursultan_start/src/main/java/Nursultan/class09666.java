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

public final class class09666
extends Record {
    private final float pixels;
    private final float percent;
    public static final class09666 N = class09666.N(0.0f);

    public float L(float f) {
        return this.pixels + this.percent * 0.01f * Math.max(0.0f, f);
    }

    public float L() {
        return this.percent;
    }

    public class09666(float f, float f2) {
        f = class09666.u(f);
        f2 = class09666.u(f2);
        this.pixels = f;
        this.percent = f2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09666.class, "pixels;percent", "pixels", "percent"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09666.class, "pixels;percent", "pixels", "percent"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09666.class, "pixels;percent", "pixels", "percent"}, this);
    }

    private static float u(float f) {
        return Float.isFinite(f) ? f : 0.0f;
    }

    public float y() {
        return this.pixels;
    }

    public static class09666 y(float f) {
        return new class09666(0.0f, f);
    }

    public static class09666 N(float f, float f2) {
        return new class09666(f, f2);
    }

    public static class09666 N(float f) {
        return new class09666(f, 0.0f);
    }

    public boolean N() {
        return this.pixels == 0.0f && this.percent == 0.0f;
    }
}

