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

final class class03676
extends Record {
    final int maxInfoRows;
    final boolean alwaysMaxHeight;

    class03676(int n, boolean bl) {
        this.maxInfoRows = n;
        this.alwaysMaxHeight = bl;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03676.class, "maxInfoRows;alwaysMaxHeight", "maxInfoRows", "alwaysMaxHeight"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03676.class, "maxInfoRows;alwaysMaxHeight", "maxInfoRows", "alwaysMaxHeight"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03676.class, "maxInfoRows;alwaysMaxHeight", "maxInfoRows", "alwaysMaxHeight"}, this);
    }

    public boolean y() {
        return this.alwaysMaxHeight;
    }

    public int N() {
        return this.maxInfoRows;
    }
}

