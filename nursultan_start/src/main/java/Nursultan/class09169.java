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

public class class09169
extends Record {
    public float yawSpeed;
    public float pitchSpeed;
    public float pitchDelta;
    public float yawDelta;
    public boolean holdPitch;

    public float L() {
        return this.yawSpeed;
    }

    public class09169(float f, float f2, float f3, float f4, boolean bl) {
        this.yawDelta = f;
        this.pitchDelta = f2;
        this.yawSpeed = f3;
        this.pitchSpeed = f4;
        this.holdPitch = bl;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09169.class, "yawDelta;pitchDelta;yawSpeed;pitchSpeed;holdPitch", "yawDelta", "pitchDelta", "yawSpeed", "pitchSpeed", "holdPitch"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09169.class, "yawDelta;pitchDelta;yawSpeed;pitchSpeed;holdPitch", "yawDelta", "pitchDelta", "yawSpeed", "pitchSpeed", "holdPitch"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09169.class, "yawDelta;pitchDelta;yawSpeed;pitchSpeed;holdPitch", "yawDelta", "pitchDelta", "yawSpeed", "pitchSpeed", "holdPitch"}, this);
    }

    public boolean i() {
        return this.holdPitch;
    }

    public float u() {
        return this.pitchDelta;
    }

    public float y() {
        return this.yawDelta;
    }

    public float N() {
        return this.pitchSpeed;
    }
}

