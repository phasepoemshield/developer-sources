/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  org.joml.Vector4f
 *  org.joml.Vector4fc
 */
package Nursultan;

import Nursultan.class11625;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import org.joml.Vector4f;
import org.joml.Vector4fc;

public class class11599
extends Record {
    public Vector4fc round;
    public Vector4fc rect;

    public float L() {
        return this.rect.x();
    }

    public class11625 M() {
        return new class11625(this.L(), this.u(), this.L() + this.N(), this.u() + this.y());
    }

    public class11599(float f, float f2, float f3, float f4, Vector4fc vector4fc) {
        this((Vector4fc)new Vector4f(f, f2, f3, f4), vector4fc);
    }

    public class11599(Vector4fc vector4fc, Vector4fc vector4fc2) {
        vector4fc = new Vector4f(vector4fc);
        vector4fc2 = new Vector4f(vector4fc2);
        this.rect = vector4fc;
        this.round = vector4fc2;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class11599.class, "rect;round", "rect", "round"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class11599.class, "rect;round", "rect", "round"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class11599.class, "rect;round", "rect", "round"}, this);
    }

    public Vector4fc i() {
        return this.rect;
    }

    public float u() {
        return this.rect.y();
    }

    public float y() {
        return this.rect.w();
    }

    public class11599 N(class11599 class115992) {
        class11625 class116252 = this.M().N(class115992.M());
        if (class116252 == null) {
            return null;
        }
        Vector4f vector4f = new Vector4f();
        class11599.N(this, class116252, vector4f);
        class11599.N(class115992, class116252, vector4f);
        return new class11599(class116252.L(), class116252.u(), class116252.i(), class116252.R(), (Vector4fc)vector4f);
    }

    private static boolean N(float f, float f2) {
        return Math.abs(f - f2) <= 1.0E-4f;
    }

    private static void N(class11599 class115992, class11625 class116252, Vector4f vector4f) {
        float f = class115992.L();
        float f2 = class115992.u();
        float f3 = f + class115992.N();
        float f4 = f2 + class115992.y();
        if (class11599.N(class116252.L(), f) && class11599.N(class116252.u(), f2)) {
            vector4f.w = Math.max(vector4f.w, class115992.R().w());
        }
        if (class11599.N(class116252.y(), f3) && class11599.N(class116252.u(), f2)) {
            vector4f.z = Math.max(vector4f.z, class115992.R().z());
        }
        if (class11599.N(class116252.L(), f) && class11599.N(class116252.N(), f4)) {
            vector4f.y = Math.max(vector4f.y, class115992.R().y());
        }
        if (class11599.N(class116252.y(), f3) && class11599.N(class116252.N(), f4)) {
            vector4f.x = Math.max(vector4f.x, class115992.R().x());
        }
    }

    public float N() {
        return this.rect.z();
    }

    public Vector4fc R() {
        return this.round;
    }
}

