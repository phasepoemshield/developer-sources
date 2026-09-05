/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.hash.HashFunction
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class05007
 */
package minecraft;

import com.google.common.hash.HashFunction;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.net.Proxy;
import java.util.Map;
import minecraft.class05007;

public final class class01797
extends Record {
    final HashFunction hashFunction;
    final int maxSize;
    final Map<String, String> headers;
    final Proxy proxy;
    final class05007 listener;

    public Map<String, String> L() {
        return this.headers;
    }

    public class01797(HashFunction hashFunction, int n, Map<String, String> map, Proxy proxy, class05007 class050072) {
        this.hashFunction = hashFunction;
        this.maxSize = n;
        this.headers = map;
        this.proxy = proxy;
        this.listener = class050072;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class01797.class, "hashFunction;maxSize;headers;proxy;listener", "hashFunction", "maxSize", "headers", "proxy", "listener"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class01797.class, "hashFunction;maxSize;headers;proxy;listener", "hashFunction", "maxSize", "headers", "proxy", "listener"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class01797.class, "hashFunction;maxSize;headers;proxy;listener", "hashFunction", "maxSize", "headers", "proxy", "listener"}, this);
    }

    public class05007 i() {
        return this.listener;
    }

    public Proxy u() {
        return this.proxy;
    }

    public int y() {
        return this.maxSize;
    }

    public HashFunction N() {
        return this.hashFunction;
    }
}

