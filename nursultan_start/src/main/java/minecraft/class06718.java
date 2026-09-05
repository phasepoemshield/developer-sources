/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class04995
 *  minecraft.class08169
 *  minecraft.class08173
 *  minecraft.class08174
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class04995;
import minecraft.class06733;
import minecraft.class08169;
import minecraft.class08173;
import minecraft.class08174;

final class class06718
extends Record {
    private final float raiseProgress;
    private final float raiseProgressStart;
    private final float raiseProgressMiddle;
    private final float raiseProgressEnd;
    private final float swayProgress;
    private final float lowerProgress;
    private final float raiseBackProgress;
    private final float swayIntensity;
    private final float swayScaleSlow;
    private final float swayScaleFast;

    public float L() {
        return this.raiseProgressMiddle;
    }

    public float M() {
        return this.raiseBackProgress;
    }

    class06718(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10) {
        this.raiseProgress = f;
        this.raiseProgressStart = f2;
        this.raiseProgressMiddle = f3;
        this.raiseProgressEnd = f4;
        this.swayProgress = f5;
        this.lowerProgress = f6;
        this.raiseBackProgress = f7;
        this.swayIntensity = f8;
        this.swayScaleSlow = f9;
        this.swayScaleFast = f10;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class06718.class, "raiseProgress;raiseProgressStart;raiseProgressMiddle;raiseProgressEnd;swayProgress;lowerProgress;raiseBackProgress;swayIntensity;swayScaleSlow;swayScaleFast", "raiseProgress", "raiseProgressStart", "raiseProgressMiddle", "raiseProgressEnd", "swayProgress", "lowerProgress", "raiseBackProgress", "swayIntensity", "swayScaleSlow", "swayScaleFast"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class06718.class, "raiseProgress;raiseProgressStart;raiseProgressMiddle;raiseProgressEnd;swayProgress;lowerProgress;raiseBackProgress;swayIntensity;swayScaleSlow;swayScaleFast", "raiseProgress", "raiseProgressStart", "raiseProgressMiddle", "raiseProgressEnd", "swayProgress", "lowerProgress", "raiseBackProgress", "swayIntensity", "swayScaleSlow", "swayScaleFast"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class06718.class, "raiseProgress;raiseProgressStart;raiseProgressMiddle;raiseProgressEnd;swayProgress;lowerProgress;raiseBackProgress;swayIntensity;swayScaleSlow;swayScaleFast", "raiseProgress", "raiseProgressStart", "raiseProgressMiddle", "raiseProgressEnd", "swayProgress", "lowerProgress", "raiseBackProgress", "swayIntensity", "swayScaleSlow", "swayScaleFast"}, this);
    }

    public float B() {
        return this.swayIntensity;
    }

    public float Z() {
        return this.swayScaleSlow;
    }

    public float i() {
        return this.swayProgress;
    }

    public float z() {
        return this.swayScaleFast;
    }

    public float u() {
        return this.raiseProgressEnd;
    }

    public float y() {
        return this.raiseProgressStart;
    }

    public static class06718 N(class08174 class081742, float f) {
        int n = class081742.L();
        int n2 = class081742.u().map(class08169::N).orElse(0) + n - 20;
        int n3 = class081742.i().map(class08169::N).orElse(0) + n;
        int n4 = n3 - 40;
        int n5 = class081742.R().map(class08169::N).orElse(0) + n;
        float f2 = class06733.N(f, 0.0f, n);
        float f3 = class06733.N(f2, 0.0f, 0.5f);
        float f4 = class06733.N(f2, 0.5f, 0.8f);
        float f5 = class06733.N(f2, 0.8f, 1.0f);
        float f6 = class06733.N(f, n2, n4);
        float f7 = class08173.l((float)class08173.Y((float)class06733.N(f - 20.0f, n4, n3)));
        float f8 = class06733.N(f, n5 - 5, n5);
        float f9 = 2.0f * class08173.k((float)f6) - 2.0f * class08173.Q((float)f8);
        float f10 = class04995.m((double)(f * 19.0f * ((float)Math.PI / 180))) * f9;
        float f11 = class04995.m((double)(f * 30.0f * ((float)Math.PI / 180))) * f9;
        return new class06718(f2, f3, f4, f5, f6, f7, f8, f9, f10, f11);
    }

    public float N() {
        return this.raiseProgress;
    }

    public float R() {
        return this.lowerProgress;
    }
}

