/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableMap$Builder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package minecraft;

import com.google.common.collect.ImmutableMap;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.Map;

final class class04429
extends Record {
    private final Map<String, String> biomeMapping;
    final String fallback;

    private class04429(Map<String, String> map, String string) {
        this.biomeMapping = map;
        this.fallback = string;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04429.class, "biomeMapping;fallback", "biomeMapping", "fallback"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04429.class, "biomeMapping;fallback", "biomeMapping", "fallback"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04429.class, "biomeMapping;fallback", "biomeMapping", "fallback"}, this);
    }

    public String y() {
        return this.fallback;
    }

    public Map<String, String> N() {
        return this.biomeMapping;
    }

    public static class04429 N(String string) {
        return new class04429(Map.of(), string);
    }

    public static class04429 N(Map<List<String>, String> map, String string) {
        return new class04429(class04429.N(map), string);
    }

    private static Map<String, String> N(Map<List<String>, String> map) {
        ImmutableMap.Builder builder = ImmutableMap.builder();
        for (Map.Entry<List<String>, String> entry : map.entrySet()) {
            entry.getKey().forEach(string -> builder.put(string, (Object)((String)entry.getValue())));
        }
        return builder.build();
    }
}

