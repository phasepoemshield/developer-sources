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

public class class09123
extends Record {
    public class11499 rotation;
    public float yawSpeed;
    public float pitchSpeed;

    public float L() {
        return this.pitchSpeed;
    }

    public class09123(class11499 class114992, float f, float f2) {
        this.rotation = class114992;
        this.yawSpeed = f;
        this.pitchSpeed = f2;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09123.class, "rotation;yawSpeed;pitchSpeed", "rotation", "yawSpeed", "pitchSpeed"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09123.class, "rotation;yawSpeed;pitchSpeed", "rotation", "yawSpeed", "pitchSpeed"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09123.class, "rotation;yawSpeed;pitchSpeed", "rotation", "yawSpeed", "pitchSpeed"}, this);
    }

    public class11499 y() {
        return this.rotation;
    }

    public float N() {
        return this.yawSpeed;
    }
}

