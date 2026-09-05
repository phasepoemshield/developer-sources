/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import org.jspecify.annotations.Nullable;

final class class08527<T>
extends Record {
    final @Nullable T value;
    final int markAfterParse;
    public static final class08527<?> L = new class08527<Object>(null, -1);

    public int L() {
        return this.markAfterParse;
    }

    class08527(@Nullable T t, int n) {
        this.value = t;
        this.markAfterParse = n;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08527.class, "value;markAfterParse", "value", "markAfterParse"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08527.class, "value;markAfterParse", "value", "markAfterParse"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08527.class, "value;markAfterParse", "value", "markAfterParse"}, this);
    }

    public @Nullable T y() {
        return this.value;
    }

    public static <T> class08527<T> N() {
        return L;
    }
}

