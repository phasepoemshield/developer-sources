/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableMap$Builder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00751
 *  minecraft.class01042
 *  minecraft.class01894
 *  minecraft.class02064
 *  minecraft.class02082
 *  minecraft.class04114
 *  minecraft.class04116
 *  minecraft.class05946
 */
package minecraft;

import com.google.common.collect.ImmutableMap;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;
import minecraft.class00751;
import minecraft.class01042;
import minecraft.class01894;
import minecraft.class02038;
import minecraft.class02042;
import minecraft.class02055;
import minecraft.class02061;
import minecraft.class02064;
import minecraft.class02082;
import minecraft.class04114;
import minecraft.class04116;
import minecraft.class05946;

final class class02036
extends Record {
    final class02038 owner;
    final class04114 lookup;
    final Map<class01894, class02055<?>> registries;
    final Map<class05946<?>, class02082<?>> registeredValues;
    final List<RuntimeException> errors;

    public void L() {
        for (class05946 var2 : this.lookup.N.keySet()) {
            this.errors.add(new IllegalStateException("Unreferenced key: " + String.valueOf(var2)));
        }
    }

    public Map<class01894, class02055<?>> M() {
        return this.registries;
    }

    private class02036(class02038 class020382, class04114 class041142, Map<class01894, class02055<?>> map, Map<class05946<?>, class02082<?>> map2, List<RuntimeException> list) {
        this.owner = class020382;
        this.lookup = class041142;
        this.registries = map;
        this.registeredValues = map2;
        this.errors = list;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02036.class, "owner;lookup;registries;registeredValues;errors", "owner", "lookup", "registries", "registeredValues", "errors"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02036.class, "owner;lookup;registries;registeredValues;errors", "owner", "lookup", "registries", "registeredValues", "errors"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02036.class, "owner;lookup;registries;registeredValues;errors", "owner", "lookup", "registries", "registeredValues", "errors"}, this);
    }

    public Map<class05946<?>, class02082<?>> B() {
        return this.registeredValues;
    }

    public List<RuntimeException> Z() {
        return this.errors;
    }

    public class02038 i() {
        return this.owner;
    }

    public void u() {
        if (!this.errors.isEmpty()) {
            IllegalStateException illegalStateException = new IllegalStateException("Errors during registry creation");
            for (RuntimeException runtimeException : this.errors) {
                illegalStateException.addSuppressed(runtimeException);
            }
            throw illegalStateException;
        }
    }

    public void y() {
        this.registeredValues.forEach((class059462, class020822) -> this.errors.add(new IllegalStateException("Orpaned value " + String.valueOf(class020822.N()) + " for key " + String.valueOf(class059462))));
    }

    public <T> class04116<T> N() {
        return new class02064(this);
    }

    public static class02036 N(class01042 class010422, Stream<class05946<? extends class00751<?>>> stream) {
        class02038 class020382 = new class02038();
        ArrayList<RuntimeException> arrayList = new ArrayList<RuntimeException>();
        class04114 class041142 = new class04114((class02042)class020382);
        ImmutableMap.Builder builder = ImmutableMap.builder();
        class010422.method_40311().forEach(class010122 -> builder.put((Object)class010122.N().N(), class02061.N(class010122.y())));
        stream.forEach(class059462 -> builder.put((Object)class059462.N(), (Object)class041142));
        return new class02036(class020382, class041142, (Map<class01894, class02055<?>>)builder.build(), new HashMap(), (List<RuntimeException>)arrayList);
    }

    public class04114 R() {
        return this.lookup;
    }
}

