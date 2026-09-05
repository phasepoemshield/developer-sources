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

public class class09122
extends Record {
    public float closeFactor;
    public boolean closeRange;
    public boolean detachedAim;
    public float yawSpeed;
    public boolean fastCorrection;
    public boolean holdPitch;
    public boolean overflight;
    public boolean constrainedSpace;
    public boolean overlapRange;
    public class11499 rotation;
    public float pitchSpeed;

    public boolean L() {
        return this.overflight;
    }

    public boolean M() {
        return this.holdPitch;
    }

    public class09122(class11499 class114992, float f, float f2, boolean bl, boolean bl2, boolean bl3, boolean bl4, boolean bl5, float f3, boolean bl6, boolean bl7) {
        this.rotation = class114992;
        this.yawSpeed = f;
        this.pitchSpeed = f2;
        this.holdPitch = bl;
        this.detachedAim = bl2;
        this.fastCorrection = bl3;
        this.overflight = bl4;
        this.closeRange = bl5;
        this.closeFactor = f3;
        this.overlapRange = bl6;
        this.constrainedSpace = bl7;
    }

    public class09122(class11499 class114992, float f, float f2, boolean bl, boolean bl2, boolean bl3) {
        this(class114992, f, f2, bl, bl2, bl3, false, false, 0.0f, false, false);
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09122.class, "rotation;yawSpeed;pitchSpeed;holdPitch;detachedAim;fastCorrection;overflight;closeRange;closeFactor;overlapRange;constrainedSpace", "rotation", "yawSpeed", "pitchSpeed", "holdPitch", "detachedAim", "fastCorrection", "overflight", "closeRange", "closeFactor", "overlapRange", "constrainedSpace"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09122.class, "rotation;yawSpeed;pitchSpeed;holdPitch;detachedAim;fastCorrection;overflight;closeRange;closeFactor;overlapRange;constrainedSpace", "rotation", "yawSpeed", "pitchSpeed", "holdPitch", "detachedAim", "fastCorrection", "overflight", "closeRange", "closeFactor", "overlapRange", "constrainedSpace"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09122.class, "rotation;yawSpeed;pitchSpeed;holdPitch;detachedAim;fastCorrection;overflight;closeRange;closeFactor;overlapRange;constrainedSpace", "rotation", "yawSpeed", "pitchSpeed", "holdPitch", "detachedAim", "fastCorrection", "overflight", "closeRange", "closeFactor", "overlapRange", "constrainedSpace"}, this);
    }

    public class11499 B() {
        return this.rotation;
    }

    public float Z() {
        return this.closeFactor;
    }

    public boolean i() {
        return this.constrainedSpace;
    }

    public boolean U() {
        return this.overlapRange;
    }

    public boolean z() {
        return this.fastCorrection;
    }

    public float u() {
        return this.yawSpeed;
    }

    public float y() {
        return this.pitchSpeed;
    }

    public boolean N() {
        return this.closeRange;
    }

    public boolean R() {
        return this.detachedAim;
    }
}

