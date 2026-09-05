/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11499
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import Nursultan.class10891;
import Nursultan.class11499;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public class class10927
extends Record {
    public class10891 entry;
    public int slot;
    public int commitTick;
    public class11499 rotation;

    public int L() {
        return this.commitTick;
    }

    class10927(int n, class11499 class114992, class10891 class108912, int n2) {
        this.slot = n;
        this.rotation = class114992;
        this.entry = class108912;
        this.commitTick = n2;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class10927.class, "slot;rotation;entry;commitTick", "slot", "rotation", "entry", "commitTick"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class10927.class, "slot;rotation;entry;commitTick", "slot", "rotation", "entry", "commitTick"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class10927.class, "slot;rotation;entry;commitTick", "slot", "rotation", "entry", "commitTick"}, this);
    }

    public int u() {
        return this.slot;
    }

    public class11499 y() {
        return this.rotation;
    }

    public class10891 N() {
        return this.entry;
    }
}

