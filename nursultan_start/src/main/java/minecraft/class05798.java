/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class06889
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class06889;

final class class05798
extends Record {
    final class06889 location;
    final long time;

    class05798(class06889 class068892, long l) {
        this.location = class068892;
        this.time = l;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class05798.class, "location;time", "location", "time"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class05798.class, "location;time", "location", "time"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class05798.class, "location;time", "location", "time"}, this);
    }

    public long y() {
        return this.time;
    }

    public class06889 N() {
        return this.location;
    }
}

