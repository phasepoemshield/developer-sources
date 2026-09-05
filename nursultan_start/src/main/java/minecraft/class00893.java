/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01296
 *  minecraft.class07321
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class01296;
import minecraft.class07321;

public final class class00893
extends Record {
    private final int x;
    private final int z;
    private static final long L = 32L;
    private static final long u = 0xFFFFFFFFL;

    public int L() {
        return this.x;
    }

    public class00893(int n, int n2) {
        this.x = n;
        this.z = n2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00893.class, "x;z", "x", "z"}, this, object);
    }

    public String toString() {
        return "[" + this.x + ", " + this.z + "]";
    }

    public int hashCode() {
        return class07321.i((int)this.x, (int)this.z);
    }

    public int u() {
        return this.z;
    }

    public static int y(long l) {
        return (int)(l >>> 32 & 0xFFFFFFFFL);
    }

    public long y() {
        return class00893.N(this.x, this.z);
    }

    public static int N(long l) {
        return (int)(l & 0xFFFFFFFFL);
    }

    public class07321 N() {
        return new class07321(class01296.N((int)this.x), class01296.N((int)this.z));
    }

    public static long N(int n, int n2) {
        return (long)n & 0xFFFFFFFFL | ((long)n2 & 0xFFFFFFFFL) << 32;
    }
}

