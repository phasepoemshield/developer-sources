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

public class class09147
extends Record {
    public float pitchOffset;
    public float yawSpeed;
    public float pitchSpeed;
    public boolean active;
    public float yawOffset;
    public class11499 rotation;

    public float L() {
        return this.pitchOffset;
    }

    public class09147(class11499 class114992, float f, float f2, float f3, float f4, boolean bl) {
        this.rotation = class114992;
        this.yawOffset = f;
        this.pitchOffset = f2;
        this.yawSpeed = f3;
        this.pitchSpeed = f4;
        this.active = bl;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09147.class, "rotation;yawOffset;pitchOffset;yawSpeed;pitchSpeed;active", "rotation", "yawOffset", "pitchOffset", "yawSpeed", "pitchSpeed", "active"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09147.class, "rotation;yawOffset;pitchOffset;yawSpeed;pitchSpeed;active", "rotation", "yawOffset", "pitchOffset", "yawSpeed", "pitchSpeed", "active"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09147.class, "rotation;yawOffset;pitchOffset;yawSpeed;pitchSpeed;active", "rotation", "yawOffset", "pitchOffset", "yawSpeed", "pitchSpeed", "active"}, this);
    }

    public class11499 i() {
        return this.rotation;
    }

    public float u() {
        return this.yawSpeed;
    }

    public boolean y() {
        return this.active;
    }

    public static class09147 N(class11499 class114992, float f, float f2) {
        return new class09147(class114992, 0.0f, 0.0f, f, f2, false);
    }

    public float N() {
        return this.yawOffset;
    }

    public float R() {
        return this.pitchSpeed;
    }
}

