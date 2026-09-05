/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import Nursultan.class09749;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

final class class09757
extends Record {
    private final class09749 axis;
    private final int index;
    private final long[] defaults;

    public long[] L() {
        return this.defaults;
    }

    class09757(class09749 class097492, int n, long[] lArray) {
        this.axis = class097492;
        this.index = n;
        this.defaults = lArray;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09757.class, "axis;index;defaults", "axis", "index", "defaults"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09757.class, "axis;index;defaults", "axis", "index", "defaults"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09757.class, "axis;index;defaults", "axis", "index", "defaults"}, this);
    }

    public int y() {
        return this.index;
    }

    public class09749 N() {
        return this.axis;
    }
}

