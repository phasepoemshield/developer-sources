/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class04247
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class04247;

public final class class00454
extends Record {
    private final int listenerRadius;
    public static final class02362<class04247, class00454> N = class02362.N((class02362)class02389.B, class00454::N, class00454::new);

    public class00454(int n) {
        this.listenerRadius = n;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00454.class, "listenerRadius", "listenerRadius"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00454.class, "listenerRadius", "listenerRadius"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00454.class, "listenerRadius", "listenerRadius"}, this);
    }

    public int N() {
        return this.listenerRadius;
    }
}

