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
import minecraft.class03102;
import minecraft.class03115;

public final class class03099
extends Record {
    private final int depth;
    private final class03102 returnValueConsumer;
    private final class03115 frameControl;

    public int L() {
        return this.depth;
    }

    public class03099(int n, class03102 class031022, class03115 class031152) {
        this.depth = n;
        this.returnValueConsumer = class031022;
        this.frameControl = class031152;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03099.class, "depth;returnValueConsumer;frameControl", "depth", "returnValueConsumer", "frameControl"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03099.class, "depth;returnValueConsumer;frameControl", "depth", "returnValueConsumer", "frameControl"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03099.class, "depth;returnValueConsumer;frameControl", "depth", "returnValueConsumer", "frameControl"}, this);
    }

    public class03115 i() {
        return this.frameControl;
    }

    public class03102 u() {
        return this.returnValueConsumer;
    }

    public void y() {
        this.frameControl.discard();
    }

    public void N() {
        this.returnValueConsumer.N();
    }

    public void N(int n) {
        this.returnValueConsumer.N(n);
    }
}

