/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01424
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import minecraft.class01424;

public final class class03152
extends Record {
    private final List<String> path;
    private final class01424<?> type;
    private final String name;

    public String L() {
        return this.name;
    }

    public class03152(class01424<?> class014242, String string) {
        this(List.of(), class014242, string);
    }

    public class03152(List<String> list, class01424<?> class014242, String string) {
        this.path = list;
        this.type = class014242;
        this.name = string;
    }

    public class03152(String string, String string2, class01424<?> class014242, String string3) {
        this(List.of(string, string2), class014242, string3);
    }

    public class03152(String string, class01424<?> class014242, String string2) {
        this(List.of(string), class014242, string2);
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03152.class, "path;type;name", "path", "type", "name"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03152.class, "path;type;name", "path", "type", "name"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03152.class, "path;type;name", "path", "type", "name"}, this);
    }

    public class01424<?> y() {
        return this.type;
    }

    public List<String> N() {
        return this.path;
    }
}

