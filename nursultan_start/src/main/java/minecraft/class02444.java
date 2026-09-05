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
import java.util.List;
import minecraft.class06584;

final class class02444
extends Record {
    private final List<class06584> items;
    final boolean isResultSlot;

    class02444(List<class06584> list, boolean bl) {
        this.items = list;
        this.isResultSlot = bl;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02444.class, "items;isResultSlot", "items", "isResultSlot"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02444.class, "items;isResultSlot", "items", "isResultSlot"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02444.class, "items;isResultSlot", "items", "isResultSlot"}, this);
    }

    public boolean y() {
        return this.isResultSlot;
    }

    public List<class06584> N() {
        return this.items;
    }

    public class06584 N(int n) {
        int n2 = this.items.size();
        if (n2 == 0) {
            return class06584.E;
        }
        return this.items.get(n % n2);
    }
}

