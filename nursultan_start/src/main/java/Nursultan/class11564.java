/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class06937
 */
package Nursultan;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class06937;

public class class11564
extends Record {
    public long cost;
    public class06937 slot;

    public class11564(class06937 class069372, long l) {
        this.slot = class069372;
        this.cost = l;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof class11564)) {
            return false;
        }
        class11564 class115642 = (class11564)((Object)object);
        return this.slot.u == class115642.slot.u;
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class11564.class, "slot;cost", "slot", "cost"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class11564.class, "slot;cost", "slot", "cost"}, this);
    }

    public class06937 y() {
        return this.slot;
    }

    public long N() {
        return this.cost;
    }
}

