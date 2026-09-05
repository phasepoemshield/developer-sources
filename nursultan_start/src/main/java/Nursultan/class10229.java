/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02566
 *  minecraft.class03692
 */
package Nursultan;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class02566;
import minecraft.class03692;

public final class class10229
extends Record
implements class03692 {
    private final int previous;
    private final int current;

    public class10229(int n, int n2) {
        this.previous = n;
        this.current = n2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class10229.class, "previous;current", "previous", "current"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class10229.class, "previous;current", "previous", "current"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class10229.class, "previous;current", "previous", "current"}, this);
    }

    public int y() {
        return this.current;
    }

    public int N() {
        return this.previous;
    }

    public int method_48889(float f) {
        return class02566.N((float)f, (int)this.previous, (int)this.current);
    }
}

