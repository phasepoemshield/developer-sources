/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01424
 *  minecraft.class04480
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class01424;
import minecraft.class04480;

public final class class08324
extends Record
implements class04480 {
    private final String name;
    private final int index;
    private final class01424<?> expected;
    private final class01424<?> actual;

    public int L() {
        return this.index;
    }

    public class08324(String string, int n, class01424<?> class014242, class01424<?> class014243) {
        this.name = string;
        this.index = n;
        this.expected = class014242;
        this.actual = class014243;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08324.class, "name;index;expected;actual", "name", "index", "expected", "actual"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08324.class, "name;index;expected;actual", "name", "index", "expected", "actual"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08324.class, "name;index;expected;actual", "name", "index", "expected", "actual"}, this);
    }

    public class01424<?> i() {
        return this.actual;
    }

    public class01424<?> u() {
        return this.expected;
    }

    public String y() {
        return this.name;
    }

    public String N() {
        return "Expected list '" + this.name + "' to contain at index " + this.index + " value of type " + this.expected.N() + ", but got " + this.actual.N();
    }
}

