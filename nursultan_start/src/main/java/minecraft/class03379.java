/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class04981
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import minecraft.class04981;

public final class class03379
extends Record {
    private final List<class04981> serverList;
    private final List<class04981> availableSnapshotServers;

    public class03379(List<class04981> list, List<class04981> list2) {
        this.serverList = list;
        this.availableSnapshotServers = list2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03379.class, "serverList;availableSnapshotServers", "serverList", "availableSnapshotServers"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03379.class, "serverList;availableSnapshotServers", "serverList", "availableSnapshotServers"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03379.class, "serverList;availableSnapshotServers", "serverList", "availableSnapshotServers"}, this);
    }

    public List<class04981> y() {
        return this.availableSnapshotServers;
    }

    public List<class04981> N() {
        return this.serverList;
    }
}

