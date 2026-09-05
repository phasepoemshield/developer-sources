/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.Optional;
import java.util.stream.LongStream;

public final class class03936<T>
extends Record {
    private final List<T> paletteEntries;
    private final Optional<LongStream> storage;
    private final int bitsPerEntry;
    public static final int N = -1;

    public int L() {
        return this.bitsPerEntry;
    }

    public class03936(List<T> list, Optional<LongStream> optional) {
        this(list, optional, -1);
    }

    public class03936(List<T> list, Optional<LongStream> optional, int n) {
        this.paletteEntries = list;
        this.storage = optional;
        this.bitsPerEntry = n;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03936.class, "paletteEntries;storage;bitsPerEntry", "paletteEntries", "storage", "bitsPerEntry"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03936.class, "paletteEntries;storage;bitsPerEntry", "paletteEntries", "storage", "bitsPerEntry"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03936.class, "paletteEntries;storage;bitsPerEntry", "paletteEntries", "storage", "bitsPerEntry"}, this);
    }

    public Optional<LongStream> y() {
        return this.storage;
    }

    public List<T> N() {
        return this.paletteEntries;
    }
}

