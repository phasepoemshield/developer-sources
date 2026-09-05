/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class02315;
import minecraft.class02325;
import minecraft.class02328;
import minecraft.class02332;

public final class class02342<S>
extends Record
implements class02315<S> {
    private final class02315<S>[] elements;

    public class02342(class02315<S>[] class02315Array) {
        this.elements = class02315Array;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02342.class, "elements", "elements"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02342.class, "elements", "elements"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02342.class, "elements", "elements"}, this);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean N(class02325<S> class023252, class02332 class023322, class02328 class023282) {
        class02328 class023283 = class023252.L();
        try {
            int n = class023252.M();
            class023322.L();
            class02315<S>[] class02315Array = this.elements;
            int n2 = class02315Array.length;
            for (int i = 0; i < n2; ++i) {
                if (class02315Array[i].N(class023252, class023322, class023283)) {
                    class023322.i();
                    boolean bl = true;
                    return bl;
                }
                class023322.u();
                class023252.N(n);
                if (class023283.y()) break;
            }
            class023322.y();
            boolean bl = false;
            return bl;
        }
        finally {
            class023252.u();
        }
    }

    public class02315<S>[] N() {
        return this.elements;
    }
}

