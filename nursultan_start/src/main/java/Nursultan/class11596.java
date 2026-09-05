/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import Nursultan.class11612;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public class class11596
extends Record {
    public boolean available;
    public int height;
    public float v0;
    public int width;
    public float v1;
    public int textureId;
    public float iconAspect;
    public float u0;
    public float pxRange;
    public class11612 kind;
    public float u1;
    public static Object E_0;

    public float L() {
        return this.u1;
    }

    public float M() {
        return this.pxRange;
    }

    private static void P() {
        E_0 = null;
    }

    public class11596(int n, float f, float f2, float f3, float f4, int n2, int n3, boolean bl, class11612 class116122, float f5, float f6) {
        this.textureId = n;
        this.u0 = f;
        this.v0 = f2;
        this.u1 = f3;
        this.v1 = f4;
        this.width = n2;
        this.height = n3;
        this.available = bl;
        this.kind = class116122;
        this.pxRange = f5;
        this.iconAspect = f6;
    }

    static {
        class11596.P();
        E_0 = new class11596(0, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, false, class11612.REGULAR, 0.0f, 1.0f);
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class11596.class, "textureId;u0;v0;u1;v1;width;height;available;kind;pxRange;iconAspect", "textureId", "u0", "v0", "u1", "v1", "width", "height", "available", "kind", "pxRange", "iconAspect"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class11596.class, "textureId;u0;v0;u1;v1;width;height;available;kind;pxRange;iconAspect", "textureId", "u0", "v0", "u1", "v1", "width", "height", "available", "kind", "pxRange", "iconAspect"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class11596.class, "textureId;u0;v0;u1;v1;width;height;available;kind;pxRange;iconAspect", "textureId", "u0", "v0", "u1", "v1", "width", "height", "available", "kind", "pxRange", "iconAspect"}, this);
    }

    public int B() {
        return this.height;
    }

    public boolean Z() {
        return this.available;
    }

    public float i() {
        return this.v0;
    }

    public class11612 U() {
        return this.kind;
    }

    public float z() {
        return this.u0;
    }

    public int u() {
        return this.textureId;
    }

    public static class11596 y(int n, int n2, int n3) {
        if (n <= 0) {
            return (class11596)((Object)E_0);
        }
        return new class11596(n, 0.0f, 1.0f, 1.0f, 0.0f, n2, n3, true, class11612.REGULAR, 0.0f, 1.0f);
    }

    public int y() {
        return this.width;
    }

    public static class11596 N(int n, int n2, int n3, float f, float f2, float f3, float f4, float f5, float f6) {
        if (n <= 0) {
            return (class11596)((Object)E_0);
        }
        return new class11596(n, f, f2, f3, f4, n2, n3, true, class11612.MTSDF, f5, f6);
    }

    public float N() {
        return this.iconAspect;
    }

    public static class11596 N(int n, int n2, int n3, float f, float f2, float f3, float f4) {
        if (n <= 0) {
            return (class11596)((Object)E_0);
        }
        return new class11596(n, f, f2, f3, f4, n2, n3, true, class11612.REGULAR, 0.0f, 1.0f);
    }

    public static class11596 N(int n, int n2, int n3) {
        if (n <= 0) {
            return (class11596)((Object)E_0);
        }
        return new class11596(n, 0.0f, 0.0f, 1.0f, 1.0f, n2, n3, true, class11612.REGULAR, 0.0f, 1.0f);
    }

    public float R() {
        return this.v1;
    }
}

