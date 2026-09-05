/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00734
 *  minecraft.class03810
 *  minecraft.class03839
 *  minecraft.class06889
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00734;
import minecraft.class03810;
import minecraft.class03839;
import minecraft.class06889;

public final class class01325
extends Record {
    private final float width;
    private final float height;
    private final float eyeHeight;
    private final class03810 attachments;
    private final boolean fixed;

    public float L() {
        return this.eyeHeight;
    }

    private static float L(float f) {
        return f * 0.85f;
    }

    public static class01325 L(float f, float f2) {
        return new class01325(f, f2, true);
    }

    private class01325(float f, float f2, boolean bl) {
        this(f, f2, class01325.L(f2), class03810.N((float)f, (float)f2), bl);
    }

    public class01325(float f, float f2, float f3, class03810 class038102, boolean bl) {
        this.width = f;
        this.height = f2;
        this.eyeHeight = f3;
        this.attachments = class038102;
        this.fixed = bl;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class01325.class, "width;height;eyeHeight;attachments;fixed", "width", "height", "eyeHeight", "attachments", "fixed"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class01325.class, "width;height;eyeHeight;attachments;fixed", "width", "height", "eyeHeight", "attachments", "fixed"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class01325.class, "width;height;eyeHeight;attachments;fixed", "width", "height", "eyeHeight", "attachments", "fixed"}, this);
    }

    public boolean i() {
        return this.fixed;
    }

    public class03810 u() {
        return this.attachments;
    }

    public float y() {
        return this.height;
    }

    public class01325 y(float f) {
        return new class01325(this.width, this.height, f, this.attachments, this.fixed);
    }

    public static class01325 y(float f, float f2) {
        return new class01325(f, f2, false);
    }

    public class01325 N(class03839 class038392) {
        return new class01325(this.width, this.height, this.eyeHeight, class038392.N(this.width, this.height), this.fixed);
    }

    public class00734 N(class06889 class068892) {
        return this.N(class068892.M, class068892.B, class068892.Z);
    }

    public float N() {
        return this.width;
    }

    public class01325 N(float f, float f2) {
        if (this.fixed || f == 1.0f && f2 == 1.0f) {
            return this;
        }
        return new class01325(this.width * f, this.height * f2, this.eyeHeight * f2, this.attachments.N(f, f2, f), false);
    }

    public class00734 N(double d, double d2, double d3) {
        float f = this.width / 2.0f;
        float f2 = this.height;
        return new class00734(d - (double)f, d2, d3 - (double)f, d + (double)f, d2 + (double)f2, d3 + (double)f);
    }

    public class01325 N(float f) {
        return this.N(f, f);
    }
}

