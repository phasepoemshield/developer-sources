/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01894
 *  minecraft.class02414
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Map;
import minecraft.class01894;
import minecraft.class02414;
import minecraft.class08205;

public final class class08204
extends Record {
    final Map<class08205, String> shaderSources;
    final Map<class01894, class02414> postChains;
    public static final class08204 L = new class08204(Map.of(), Map.of());

    public class08204(Map<class08205, String> map, Map<class01894, class02414> map2) {
        this.shaderSources = map;
        this.postChains = map2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08204.class, "shaderSources;postChains", "shaderSources", "postChains"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08204.class, "shaderSources;postChains", "shaderSources", "postChains"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08204.class, "shaderSources;postChains", "shaderSources", "postChains"}, this);
    }

    public Map<class01894, class02414> y() {
        return this.postChains;
    }

    public Map<class08205, String> N() {
        return this.shaderSources;
    }
}

