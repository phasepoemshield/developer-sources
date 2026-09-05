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

public class class09163
extends Record {
    public float yawDelta;
    public float pitchDelta;

    class09163(float f, float f2) {
        this.yawDelta = f;
        this.pitchDelta = f2;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09163.class, "yawDelta;pitchDelta", "yawDelta", "pitchDelta"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09163.class, "yawDelta;pitchDelta", "yawDelta", "pitchDelta"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09163.class, "yawDelta;pitchDelta", "yawDelta", "pitchDelta"}, this);
    }

    public float y() {
        return this.pitchDelta;
    }

    public float N() {
        return this.yawDelta;
    }
}

