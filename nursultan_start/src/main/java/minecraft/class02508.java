/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02695
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Set;
import minecraft.class02477;
import minecraft.class02695;

public final class class02508
extends Record {
    private final class02695 added;
    private final Set<class02477<?>> removed;
    public static final class02508 N = new class02508(class02695.N, Set.of());

    public class02508(class02695 class026952, Set<class02477<?>> set) {
        this.added = class026952;
        this.removed = set;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02508.class, "added;removed", "added", "removed"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02508.class, "added;removed", "added", "removed"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02508.class, "added;removed", "added", "removed"}, this);
    }

    public Set<class02477<?>> y() {
        return this.removed;
    }

    public class02695 N() {
        return this.added;
    }
}

