/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02903
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class02903;

public final class class02919
extends Record {
    private final class02903 input;
    private final int left;
    private final int top;
    public static final class02919 N = new class02919(class02903.N, 0, 0);

    public int L() {
        return this.top;
    }

    public class02919(class02903 class029032, int n, int n2) {
        this.input = class029032;
        this.left = n;
        this.top = n2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02919.class, "input;left;top", "input", "left", "top"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02919.class, "input;left;top", "input", "left", "top"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02919.class, "input;left;top", "input", "left", "top"}, this);
    }

    public int y() {
        return this.left;
    }

    public class02903 N() {
        return this.input;
    }
}

