/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01807
 *  minecraft.class07340
 *  minecraft.class07373
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import minecraft.class01807;
import minecraft.class06617;
import minecraft.class07340;
import minecraft.class07373;

public final class class06621
extends Record
implements class06617 {
    private final class07373 factory;
    private final int bits;

    @Override
    public int L() {
        return this.bits;
    }

    public class06621(class07373 class073732, int n) {
        this.factory = class073732;
        this.bits = n;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class06621.class, "factory;bits", "factory", "bits"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class06621.class, "factory;bits", "factory", "bits"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class06621.class, "factory;bits", "factory", "bits"}, this);
    }

    public int i() {
        return this.bits;
    }

    public class07373 u() {
        return this.factory;
    }

    @Override
    public int y() {
        return this.bits;
    }

    @Override
    public <T> class07340<T> N(class01807<T> class018072, List<T> list) {
        return this.factory.create(this.bits, list);
    }

    @Override
    public boolean N() {
        return false;
    }
}

