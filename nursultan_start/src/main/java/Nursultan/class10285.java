/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class03875
 */
package Nursultan;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class03875;

public final class class10285
extends Record
implements class03875 {
    private final int blockX;
    private final int blockY;
    private final int blockZ;

    public int L() {
        return this.blockY;
    }

    public class10285(int n, int n2, int n3) {
        this.blockX = n;
        this.blockY = n2;
        this.blockZ = n3;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class10285.class, "blockX;blockY;blockZ", "blockX", "blockY", "blockZ"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class10285.class, "blockX;blockY;blockZ", "blockX", "blockY", "blockZ"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class10285.class, "blockX;blockY;blockZ", "blockX", "blockY", "blockZ"}, this);
    }

    public int u() {
        return this.blockZ;
    }

    public int y() {
        return this.blockX;
    }
}

