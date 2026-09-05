/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00329
 *  minecraft.class06584
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import minecraft.class00329;
import minecraft.class06584;

final class class05305
extends Record {
    final class00329 id;
    private final List<class06584> displayItems;

    class05305(class00329 class003292, List<class06584> list) {
        this.id = class003292;
        this.displayItems = list;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class05305.class, "id;displayItems", "id", "displayItems"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class05305.class, "id;displayItems", "id", "displayItems"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class05305.class, "id;displayItems", "id", "displayItems"}, this);
    }

    public List<class06584> y() {
        return this.displayItems;
    }

    public class00329 N() {
        return this.id;
    }

    public class06584 N(int n) {
        if (this.displayItems.isEmpty()) {
            return class06584.E;
        }
        int n2 = n % this.displayItems.size();
        return this.displayItems.get(n2);
    }
}

