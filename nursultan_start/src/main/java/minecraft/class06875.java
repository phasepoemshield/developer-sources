/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01929
 *  minecraft.class02013
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.function.Function;
import minecraft.class01929;
import minecraft.class02013;
import minecraft.class06929;

public final class class06875
extends Record {
    private final Function<class01929, class02013> provider;
    final class06929 paramSet;

    public class06875(Function<class01929, class02013> function, class06929 class069292) {
        this.provider = function;
        this.paramSet = class069292;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class06875.class, "provider;paramSet", "provider", "paramSet"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class06875.class, "provider;paramSet", "provider", "paramSet"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class06875.class, "provider;paramSet", "provider", "paramSet"}, this);
    }

    public class06929 y() {
        return this.paramSet;
    }

    public Function<class01929, class02013> N() {
        return this.provider;
    }
}

