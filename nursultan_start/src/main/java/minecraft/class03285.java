/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class06584
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.function.Predicate;
import minecraft.class06584;

public final class class03285
extends Record {
    final int slotIndex;
    private final int x;
    private final int y;
    private final Predicate<class06584> mayPlace;
    static final class03285 y_const = new class03285(0, 0, 0, class065842 -> true);

    public int L() {
        return this.y;
    }

    public class03285(int n, int n2, int n3, Predicate<class06584> predicate) {
        this.slotIndex = n;
        this.x = n2;
        this.y = n3;
        this.mayPlace = predicate;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03285.class, "slotIndex;x;y;mayPlace", "slotIndex", "x", "y", "mayPlace"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03285.class, "slotIndex;x;y;mayPlace", "slotIndex", "x", "y", "mayPlace"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03285.class, "slotIndex;x;y;mayPlace", "slotIndex", "x", "y", "mayPlace"}, this);
    }

    public Predicate<class06584> u() {
        return this.mayPlace;
    }

    public int y() {
        return this.x;
    }

    public int N() {
        return this.slotIndex;
    }
}

