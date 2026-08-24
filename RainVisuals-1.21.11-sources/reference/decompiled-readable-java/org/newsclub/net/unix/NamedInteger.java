/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.eclipse.jdt.annotation.NonNullByDefault
 *  org.eclipse.jdt.annotation.Nullable
 */
package org.newsclub.net.unix;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import org.eclipse.jdt.annotation.NonNullByDefault;
import org.eclipse.jdt.annotation.Nullable;

@NonNullByDefault
public class NamedInteger
implements Serializable {
    private static final long serialVersionUID = 1L;
    private final String name;
    private final int id;

    public final String toString() {
        return this.name() + "(" + this.id + ")";
    }

    protected static final <T extends NamedInteger> T[] init(T[] values2) {
        T[] TArray;
        HashSet<Integer> seenValues = new HashSet<Integer>();
        T[] TArray2 = values2;
        int n = TArray2.length;
        for (int i = 0; i < n; ++i) {
            T val = TArray2[i];
            if (seenValues.add(((NamedInteger)val).value())) continue;
            throw new IllegalStateException("Duplicate value: " + ((NamedInteger)val).value());
        }
        return TArray;
    }

    public final String name() {
        return this.name;
    }

    protected NamedInteger(int id) {
        this("UNDEFINED", id);
    }

    public final int hashCode() {
        Object[] objectArray = new Object[1];
        objectArray[0] = this.id;
        return Objects.hash(objectArray);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        NamedInteger other = (NamedInteger)obj;
        return this.id == other.value();
    }

    public final int value() {
        return this.id;
    }

    /*
     * WARNING - void declaration
     */
    protected static final <T extends NamedInteger> T ofValue(T[] values2, UndefinedValueConstructor<T> constr, int v) {
        T[] TArray = values2;
        int n = TArray.length;
        for (int i = 0; i < n; ++i) {
            void var6_6;
            T e = TArray[i];
            if (((NamedInteger)e).value() != v) continue;
            return var6_6;
        }
        return constr.newInstance(v);
    }

    protected NamedInteger(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @FunctionalInterface
    protected static interface UndefinedValueConstructor<T extends NamedInteger> {
        public T newInstance(int var1);
    }

    public static interface HasOfValue {
    }
}

