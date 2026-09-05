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

public class class09138
extends Record {
    public boolean breakSmoothing;
    public float yawDelta;
    public float pitchJerkScale;
    public float maxPitchShare;
    public float pitchDelta;
    public float maxYawShare;
    public boolean outputBurst;
    public float yawJerkScale;
    public float minYawShare;
    public float minPitchShare;

    public float L() {
        return this.yawJerkScale;
    }

    public float M() {
        return this.pitchDelta;
    }

    public class09138(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, boolean bl, boolean bl2) {
        this.yawDelta = f;
        this.pitchDelta = f2;
        this.minYawShare = f3;
        this.minPitchShare = f4;
        this.maxYawShare = f5;
        this.maxPitchShare = f6;
        this.yawJerkScale = f7;
        this.pitchJerkScale = f8;
        this.breakSmoothing = bl;
        this.outputBurst = bl2;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09138.class, "yawDelta;pitchDelta;minYawShare;minPitchShare;maxYawShare;maxPitchShare;yawJerkScale;pitchJerkScale;breakSmoothing;outputBurst", "yawDelta", "pitchDelta", "minYawShare", "minPitchShare", "maxYawShare", "maxPitchShare", "yawJerkScale", "pitchJerkScale", "breakSmoothing", "outputBurst"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09138.class, "yawDelta;pitchDelta;minYawShare;minPitchShare;maxYawShare;maxPitchShare;yawJerkScale;pitchJerkScale;breakSmoothing;outputBurst", "yawDelta", "pitchDelta", "minYawShare", "minPitchShare", "maxYawShare", "maxPitchShare", "yawJerkScale", "pitchJerkScale", "breakSmoothing", "outputBurst"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09138.class, "yawDelta;pitchDelta;minYawShare;minPitchShare;maxYawShare;maxPitchShare;yawJerkScale;pitchJerkScale;breakSmoothing;outputBurst", "yawDelta", "pitchDelta", "minYawShare", "minPitchShare", "maxYawShare", "maxPitchShare", "yawJerkScale", "pitchJerkScale", "breakSmoothing", "outputBurst"}, this);
    }

    public float B() {
        return this.maxYawShare;
    }

    public float Z() {
        return this.maxPitchShare;
    }

    public float i() {
        return this.minPitchShare;
    }

    public float z() {
        return this.yawDelta;
    }

    public boolean u() {
        return this.breakSmoothing;
    }

    public float y() {
        return this.pitchJerkScale;
    }

    public boolean N() {
        return this.outputBurst;
    }

    public float R() {
        return this.minYawShare;
    }
}

