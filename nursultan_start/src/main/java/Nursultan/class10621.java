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

public final class class10621
extends Record {
    public final int startTime;
    public final int endTime;

    public class10621(int n, int n2) {
        this.startTime = n;
        this.endTime = n2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class10621.class, "startTime;endTime", "startTime", "endTime"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class10621.class, "startTime;endTime", "startTime", "endTime"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class10621.class, "startTime;endTime", "startTime", "endTime"}, this);
    }

    public int y() {
        return this.endTime;
    }

    public int N() {
        return this.startTime;
    }
}

