/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01807
 *  minecraft.class06617
 *  minecraft.class07340
 */
package Nursultan;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import minecraft.class01807;
import minecraft.class06617;
import minecraft.class07340;

public final class class10638
extends Record
implements class06617 {
    private final int bitsInMemory;
    private final int bitsInStorage;

    public int L() {
        return this.bitsInStorage;
    }

    public class10638(int n, int n2) {
        this.bitsInMemory = n;
        this.bitsInStorage = n2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class10638.class, "bitsInMemory;bitsInStorage", "bitsInMemory", "bitsInStorage"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class10638.class, "bitsInMemory;bitsInStorage", "bitsInMemory", "bitsInStorage"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class10638.class, "bitsInMemory;bitsInStorage", "bitsInMemory", "bitsInStorage"}, this);
    }

    public int y() {
        return this.bitsInMemory;
    }

    public boolean N() {
        return true;
    }

    public <T> class07340<T> N(class01807<T> class018072, List<T> list) {
        return class018072.L();
    }
}

