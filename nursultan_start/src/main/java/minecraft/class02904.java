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
import minecraft.class02950;
import minecraft.class06584;

public final class class02904
extends Record
implements class02950 {
    private final class06584 item;

    public class06584 L() {
        return this.item;
    }

    public class02904(class06584 class065842) {
        this.item = class065842;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02904.class, "item", "item"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02904.class, "item", "item"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02904.class, "item", "item"}, this);
    }

    @Override
    public class06584 N(int n) {
        if (n != 0) {
            throw new IllegalArgumentException("No item for index " + n);
        }
        return this.item;
    }

    @Override
    public int N() {
        return 1;
    }
}

