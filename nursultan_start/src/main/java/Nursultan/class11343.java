/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public class class11343
extends Record {
    public boolean passed;
    private static byte[] i;
    public static Object[] y;
    public String failedCheck;

    private static void L() {
        i = new byte[1];
        class11343.i[0] = 2;
    }

    private class11343(boolean bl, String string) {
        this.passed = bl;
        this.failedCheck = string;
    }

    static {
        class11343.L();
        class11343.i();
        class11343.y[0] = new class11343(true, null);
        class11343.y[1] = new class11343(false, null);
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class11343.class, "passed;failedCheck", "passed", "failedCheck"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class11343.class, "passed;failedCheck", "passed", "failedCheck"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class11343.class, "passed;failedCheck", "passed", "failedCheck"}, this);
    }

    private static void i() {
        y = new Object[i[0]];
    }

    public boolean y() {
        return this.passed;
    }

    public static class11343 N(String string) {
        return new class11343(false, string);
    }

    public String N() {
        return this.failedCheck;
    }
}

