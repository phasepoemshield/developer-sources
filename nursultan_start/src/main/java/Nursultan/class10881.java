/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableMap$Builder
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.ImmutableSet$Builder
 *  minecraft.class08227
 */
package Nursultan;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.Map;
import java.util.Set;
import minecraft.class08227;

public class class10881 {
    private final ImmutableMap.Builder<String, String> N = ImmutableMap.builder();
    private final ImmutableSet.Builder<String> y = ImmutableSet.builder();

    private static String y(String string) {
        return string.replaceAll("\n", "\\\\\n");
    }

    public class08227 N() {
        return new class08227((Map)this.N.build(), (Set)this.y.build());
    }

    public class10881 N(String string) {
        this.y.add((Object)string);
        return this;
    }

    public class10881 N(String string, int n) {
        this.N.put((Object)string, (Object)String.valueOf(n));
        return this;
    }

    public class10881 N(String string, float f) {
        this.N.put((Object)string, (Object)String.valueOf(f));
        return this;
    }

    public class10881 N(String string, String string2) {
        if (string2.isBlank()) {
            throw new IllegalArgumentException("Cannot define empty string");
        }
        this.N.put((Object)string, (Object)class10881.y(string2));
        return this;
    }
}

