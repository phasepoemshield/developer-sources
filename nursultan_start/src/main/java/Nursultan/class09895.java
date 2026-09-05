/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import Nursultan.class09935;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;

final class class09895
extends Record {
    private final List<class09935> nodes;
    private final int drawCommandCount;
    static final class09895 N = new class09895(List.of(), 0);

    class09895(List<class09935> list, int n) {
        this.nodes = list;
        this.drawCommandCount = n;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09895.class, "nodes;drawCommandCount", "nodes", "drawCommandCount"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09895.class, "nodes;drawCommandCount", "nodes", "drawCommandCount"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09895.class, "nodes;drawCommandCount", "nodes", "drawCommandCount"}, this);
    }

    public int y() {
        return this.drawCommandCount;
    }

    public List<class09935> N() {
        return this.nodes;
    }
}

