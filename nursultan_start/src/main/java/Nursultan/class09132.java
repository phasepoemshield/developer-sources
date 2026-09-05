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

public class class09132
extends Record {
    public class11499 rotation;
    public float pitchSpeed;
    public float yawSpeed;
    public boolean active;

    public float L() {
        return this.pitchSpeed;
    }

    public class09132(class11499 class114992, float f, float f2, boolean bl) {
        this.rotation = class114992;
        this.yawSpeed = f;
        this.pitchSpeed = f2;
        this.active = bl;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09132.class, "rotation;yawSpeed;pitchSpeed;active", "rotation", "yawSpeed", "pitchSpeed", "active"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09132.class, "rotation;yawSpeed;pitchSpeed;active", "rotation", "yawSpeed", "pitchSpeed", "active"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09132.class, "rotation;yawSpeed;pitchSpeed;active", "rotation", "yawSpeed", "pitchSpeed", "active"}, this);
    }

    public boolean u() {
        return this.active;
    }

    public float y() {
        return this.yawSpeed;
    }

    public class11499 N() {
        return this.rotation;
    }

    public static class09132 N(class11499 class114992, float f, float f2) {
        return new class09132(class114992, f, f2, false);
    }
}

