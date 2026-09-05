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

public class class09160
extends Record {
    public float yawOffset;
    public float pitchOffset;
    public float pitchSpeed;
    public boolean fastCorrection;
    public boolean angularFlick;
    public float yawSpeed;

    public boolean L() {
        return this.angularFlick;
    }

    public class09160(float f, float f2, boolean bl, float f3, float f4, boolean bl2) {
        this.yawSpeed = f;
        this.pitchSpeed = f2;
        this.fastCorrection = bl;
        this.yawOffset = f3;
        this.pitchOffset = f4;
        this.angularFlick = bl2;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09160.class, "yawSpeed;pitchSpeed;fastCorrection;yawOffset;pitchOffset;angularFlick", "yawSpeed", "pitchSpeed", "fastCorrection", "yawOffset", "pitchOffset", "angularFlick"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09160.class, "yawSpeed;pitchSpeed;fastCorrection;yawOffset;pitchOffset;angularFlick", "yawSpeed", "pitchSpeed", "fastCorrection", "yawOffset", "pitchOffset", "angularFlick"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09160.class, "yawSpeed;pitchSpeed;fastCorrection;yawOffset;pitchOffset;angularFlick", "yawSpeed", "pitchSpeed", "fastCorrection", "yawOffset", "pitchOffset", "angularFlick"}, this);
    }

    public boolean i() {
        return this.fastCorrection;
    }

    public float u() {
        return this.yawSpeed;
    }

    public float y() {
        return this.yawOffset;
    }

    public float N() {
        return this.pitchSpeed;
    }

    public float R() {
        return this.pitchOffset;
    }
}

