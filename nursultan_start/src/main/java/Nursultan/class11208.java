/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import Nursultan.class11169;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public class class11208
extends Record {
    public String name;
    public Object value;
    public class11169 expectedType;
    public boolean uniform;

    public Object L() {
        return this.value;
    }

    private class11208(String string, boolean bl, Object object, class11169 class111692) {
        this.name = string;
        this.uniform = bl;
        this.value = object;
        this.expectedType = class111692;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class11208.class, "name;uniform;value;expectedType", "name", "uniform", "value", "expectedType"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class11208.class, "name;uniform;value;expectedType", "name", "uniform", "value", "expectedType"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class11208.class, "name;uniform;value;expectedType", "name", "uniform", "value", "expectedType"}, this);
    }

    public String u() {
        return this.name;
    }

    public boolean y() {
        return this.uniform;
    }

    public static class11208 N(String string, class11169 class111692) {
        return new class11208(class11208.N(string), true, null, class111692);
    }

    public static class11208 N(String string, Object object) {
        return new class11208(class11208.N(string), false, object, null);
    }

    public static class11208 N(class11169 class111692) {
        return new class11208(null, true, null, class111692);
    }

    public static class11208 N(Object object) {
        return new class11208(null, false, object, null);
    }

    private static String N(String string) {
        if (string == null || string.isBlank()) {
            throw new IllegalArgumentException("Shader template arg name is blank");
        }
        return string;
    }

    public class11169 N() {
        return this.expectedType;
    }
}

