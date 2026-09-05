/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10021
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import Nursultan.class09799;
import Nursultan.class10021;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;

final class class09779
extends Record {
    private final List<class09799> desiredChildren;
    private final List<class10021> immediateDetachChildren;
    private final List<class10021> exitingChildren;
    private static final class09779 u = new class09779(null, null, null);

    public List<class10021> L() {
        return this.immediateDetachChildren;
    }

    class09779(List<class09799> list, List<class10021> list2, List<class10021> list3) {
        this.desiredChildren = list == null ? List.of() : List.copyOf(list);
        this.immediateDetachChildren = list2 == null ? List.of() : List.copyOf(list2);
        this.exitingChildren = list3 == null ? List.of() : List.copyOf(list3);
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09779.class, "desiredChildren;immediateDetachChildren;exitingChildren", "desiredChildren", "immediateDetachChildren", "exitingChildren"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09779.class, "desiredChildren;immediateDetachChildren;exitingChildren", "desiredChildren", "immediateDetachChildren", "exitingChildren"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09779.class, "desiredChildren;immediateDetachChildren;exitingChildren", "desiredChildren", "immediateDetachChildren", "exitingChildren"}, this);
    }

    public List<class10021> u() {
        return this.exitingChildren;
    }

    public List<class09799> y() {
        return this.desiredChildren;
    }

    static class09779 N() {
        return u;
    }
}

