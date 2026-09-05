/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import Nursultan.class09979;
import Nursultan.class09992;
import Nursultan.class10002;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class class09998
extends Record {
    private final class09979 state;
    private final class09992 slot;
    private final class10002 patch;

    public class10002 L() {
        return this.patch;
    }

    public class09998(class09979 class099792, class09992 class099922, class10002 class100022) {
        this.state = class099792;
        this.slot = class099922;
        this.patch = class100022;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09998.class, "state;slot;patch", "state", "slot", "patch"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09998.class, "state;slot;patch", "state", "slot", "patch"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09998.class, "state;slot;patch", "state", "slot", "patch"}, this);
    }

    public class09992 y() {
        return this.slot;
    }

    public class09979 N() {
        return this.state;
    }
}

