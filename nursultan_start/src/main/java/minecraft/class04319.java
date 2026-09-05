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
import java.util.Comparator;

public final class class04319
extends Record {
    final long totalCount;
    final long totalSize;
    static final Comparator<class04319> L = Comparator.comparing(class04319::L).thenComparing(class04319::y).reversed();

    public long L() {
        return this.totalSize;
    }

    public class04319(long l, long l2) {
        this.totalCount = l;
        this.totalSize = l2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04319.class, "totalCount;totalSize", "totalCount", "totalSize"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04319.class, "totalCount;totalSize", "totalCount", "totalSize"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04319.class, "totalCount;totalSize", "totalCount", "totalSize"}, this);
    }

    public long y() {
        return this.totalCount;
    }

    class04319 N(class04319 class043192) {
        return new class04319(this.totalCount + class043192.totalCount, this.totalSize + class043192.totalSize);
    }

    public float N() {
        return (float)this.totalSize / (float)this.totalCount;
    }
}

