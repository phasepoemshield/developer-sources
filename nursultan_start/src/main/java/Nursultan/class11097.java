/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11499
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import Nursultan.class11499;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public class class11097
extends Record {
    public boolean overshootAim;
    public float pitchError;
    public float yawError;
    public boolean detachedAim;
    public boolean holdPitch;
    public boolean pullbackFlick;
    public double distance;
    public boolean urgentCatchup;
    public boolean serverHardRaycast;
    public class11499 rotation;
    public boolean currentHardRaycast;

    public float L() {
        return this.pitchError;
    }

    public boolean M() {
        return this.detachedAim;
    }

    public class11097(class11499 class114992, boolean bl, boolean bl2, boolean bl3, boolean bl4, boolean bl5, boolean bl6, boolean bl7, float f, float f2, double d) {
        this.rotation = class114992;
        this.currentHardRaycast = bl;
        this.serverHardRaycast = bl2;
        this.urgentCatchup = bl3;
        this.holdPitch = bl4;
        this.detachedAim = bl5;
        this.overshootAim = bl6;
        this.pullbackFlick = bl7;
        this.yawError = f;
        this.pitchError = f2;
        this.distance = d;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class11097.class, "rotation;currentHardRaycast;serverHardRaycast;urgentCatchup;holdPitch;detachedAim;overshootAim;pullbackFlick;yawError;pitchError;distance", "rotation", "currentHardRaycast", "serverHardRaycast", "urgentCatchup", "holdPitch", "detachedAim", "overshootAim", "pullbackFlick", "yawError", "pitchError", "distance"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class11097.class, "rotation;currentHardRaycast;serverHardRaycast;urgentCatchup;holdPitch;detachedAim;overshootAim;pullbackFlick;yawError;pitchError;distance", "rotation", "currentHardRaycast", "serverHardRaycast", "urgentCatchup", "holdPitch", "detachedAim", "overshootAim", "pullbackFlick", "yawError", "pitchError", "distance"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class11097.class, "rotation;currentHardRaycast;serverHardRaycast;urgentCatchup;holdPitch;detachedAim;overshootAim;pullbackFlick;yawError;pitchError;distance", "rotation", "currentHardRaycast", "serverHardRaycast", "urgentCatchup", "holdPitch", "detachedAim", "overshootAim", "pullbackFlick", "yawError", "pitchError", "distance"}, this);
    }

    public boolean B() {
        return this.pullbackFlick;
    }

    public boolean Z() {
        return this.urgentCatchup;
    }

    public boolean i() {
        return this.serverHardRaycast;
    }

    public float U() {
        return this.yawError;
    }

    public boolean z() {
        return this.currentHardRaycast;
    }

    public double u() {
        return this.distance;
    }

    public class11499 y() {
        return this.rotation;
    }

    public boolean N() {
        return this.holdPitch;
    }

    public boolean R() {
        return this.overshootAim;
    }
}

