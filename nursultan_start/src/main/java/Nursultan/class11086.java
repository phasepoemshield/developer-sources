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

public class class11086
extends Record {
    public float yawOffset;
    public boolean releaseAim;
    public float pitchOffset;
    public boolean active;

    public boolean L() {
        return this.releaseAim;
    }

    public class11086(boolean bl, float f, float f2, boolean bl2) {
        this.active = bl;
        this.yawOffset = f;
        this.pitchOffset = f2;
        this.releaseAim = bl2;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class11086.class, "active;yawOffset;pitchOffset;releaseAim", "active", "yawOffset", "pitchOffset", "releaseAim"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class11086.class, "active;yawOffset;pitchOffset;releaseAim", "active", "yawOffset", "pitchOffset", "releaseAim"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class11086.class, "active;yawOffset;pitchOffset;releaseAim", "active", "yawOffset", "pitchOffset", "releaseAim"}, this);
    }

    public float i() {
        return this.pitchOffset;
    }

    public static class11086 u() {
        return new class11086(false, 0.0f, 0.0f, false);
    }

    public float y() {
        return this.yawOffset;
    }

    public boolean N() {
        return this.active;
    }
}

