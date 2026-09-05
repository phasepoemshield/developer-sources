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

public class class09141
extends Record {
    public float yawShare;
    public float acceleration;
    public boolean active;
    public float pitchMultiplier;
    public boolean angularOffset;
    public float pitchShare;
    public float yawMultiplier;
    public float pitchOffset;
    public float yawOffset;

    public float L() {
        return this.acceleration;
    }

    public float M() {
        return this.pitchMultiplier;
    }

    public class09141(boolean bl, float f, float f2, float f3, float f4, float f5, float f6, float f7, boolean bl2) {
        this.active = bl;
        this.yawMultiplier = f;
        this.pitchMultiplier = f2;
        this.acceleration = f3;
        this.yawShare = f4;
        this.pitchShare = f5;
        this.yawOffset = f6;
        this.pitchOffset = f7;
        this.angularOffset = bl2;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09141.class, "active;yawMultiplier;pitchMultiplier;acceleration;yawShare;pitchShare;yawOffset;pitchOffset;angularOffset", "active", "yawMultiplier", "pitchMultiplier", "acceleration", "yawShare", "pitchShare", "yawOffset", "pitchOffset", "angularOffset"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09141.class, "active;yawMultiplier;pitchMultiplier;acceleration;yawShare;pitchShare;yawOffset;pitchOffset;angularOffset", "active", "yawMultiplier", "pitchMultiplier", "acceleration", "yawShare", "pitchShare", "yawOffset", "pitchOffset", "angularOffset"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09141.class, "active;yawMultiplier;pitchMultiplier;acceleration;yawShare;pitchShare;yawOffset;pitchOffset;angularOffset", "active", "yawMultiplier", "pitchMultiplier", "acceleration", "yawShare", "pitchShare", "yawOffset", "pitchOffset", "angularOffset"}, this);
    }

    public float B() {
        return this.pitchShare;
    }

    public static class09141 Z() {
        return new class09141(false, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false);
    }

    public float i() {
        return this.yawMultiplier;
    }

    public float z() {
        return this.pitchOffset;
    }

    public float u() {
        return this.yawShare;
    }

    public boolean y() {
        return this.active;
    }

    public boolean N() {
        return this.angularOffset;
    }

    public float R() {
        return this.yawOffset;
    }
}

