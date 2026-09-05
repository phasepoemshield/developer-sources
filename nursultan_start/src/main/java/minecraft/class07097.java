/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.hash.HashCode
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package minecraft;

import com.google.common.collect.ImmutableMap;
import com.google.common.hash.HashCode;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.nio.file.Path;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import minecraft.class07096;

final class class07097
extends Record {
    private final String version;
    private final ConcurrentMap<Path, HashCode> data;

    public ConcurrentMap<Path, HashCode> L() {
        return this.data;
    }

    class07097(String string) {
        this(string, new ConcurrentHashMap<Path, HashCode>());
    }

    private class07097(String string, ConcurrentMap<Path, HashCode> concurrentMap) {
        this.version = string;
        this.data = concurrentMap;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class07097.class, "version;data", "version", "data"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class07097.class, "version;data", "version", "data"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class07097.class, "version;data", "version", "data"}, this);
    }

    public String y() {
        return this.version;
    }

    public class07096 N() {
        return new class07096(this.version, (ImmutableMap<Path, HashCode>)ImmutableMap.copyOf(this.data));
    }

    public void N(Path path, HashCode hashCode) {
        this.data.put(path, hashCode);
    }
}

