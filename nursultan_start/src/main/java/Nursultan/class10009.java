/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09997
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import Nursultan.class09997;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class class10009
extends Record {
    private final class09997 mode;
    private final float value;
    public static final class10009 N = new class10009(class09997.FIXED, 0.0f);
    public static final class10009 y = new class10009(class09997.AUTO, 0.0f);

    public boolean L() {
        return this.mode == class09997.FIXED;
    }

    public class10009(class09997 class099972, float f) {
        class099972 = class099972 == null ? class09997.FIXED : class099972;
        f = class099972 == class09997.AUTO ? 0.0f : class10009.y(f);
        this.mode = class099972;
        this.value = f;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class10009.class, "mode;value", "mode", "value"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class10009.class, "mode;value", "mode", "value"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class10009.class, "mode;value", "mode", "value"}, this);
    }

    public class09997 i() {
        return this.mode;
    }

    public float u() {
        return this.L() ? this.value : 0.0f;
    }

    private static float y(float f) {
        if (!Float.isFinite(f)) {
            return 0.0f;
        }
        return Math.max(0.0f, f);
    }

    public boolean y() {
        return this.mode == class09997.AUTO;
    }

    public static class10009 N() {
        return y;
    }

    public static class10009 N(float f) {
        float f2 = class10009.y(f);
        return f2 == 0.0f ? N : new class10009(class09997.FIXED, f2);
    }

    public float R() {
        return this.value;
    }
}

