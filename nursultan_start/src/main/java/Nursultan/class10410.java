/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class03926
 *  minecraft.class04445
 *  org.jspecify.annotations.Nullable
 */
package Nursultan;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Map;
import minecraft.class03926;
import minecraft.class04445;
import org.jspecify.annotations.Nullable;

public final class class10410
extends Record
implements class04445 {
    private final Map<String, class03926> arguments;

    public class10410(Map<String, class03926> map) {
        this.arguments = map;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class10410.class, "arguments", "arguments"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class10410.class, "arguments", "arguments"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class10410.class, "arguments", "arguments"}, this);
    }

    public @Nullable class03926 N(String string) {
        return this.arguments.get(string);
    }

    public Map<String, class03926> N() {
        return this.arguments;
    }
}

