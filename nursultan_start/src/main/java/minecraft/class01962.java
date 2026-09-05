/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Supplier;
import org.jspecify.annotations.Nullable;

public class class01962 {
    public static boolean N(short @Nullable [] sArray) {
        return sArray == null || sArray.length == 0;
    }

    public static boolean N(char @Nullable [] cArray) {
        return cArray == null || cArray.length == 0;
    }

    public static boolean N(byte @Nullable [] byArray) {
        return byArray == null || byArray.length == 0;
    }

    public static boolean N(boolean @Nullable [] blArray) {
        return blArray == null || blArray.length == 0;
    }

    public static boolean N(double @Nullable [] dArray) {
        return dArray == null || dArray.length == 0;
    }

    public static boolean N(float @Nullable [] fArray) {
        return fArray == null || fArray.length == 0;
    }

    public static boolean N(long @Nullable [] lArray) {
        return lArray == null || lArray.length == 0;
    }

    public static boolean N(int @Nullable [] nArray) {
        return nArray == null || nArray.length == 0;
    }

    public static <T, R> R N(@Nullable T t, Function<T, R> function, Supplier<R> supplier) {
        return t == null ? supplier.get() : function.apply(t);
    }

    public static <T, R> R N(@Nullable T t, Function<T, R> function, R r) {
        return t == null ? r : function.apply(t);
    }

    public static <T, R> @Nullable R N(@Nullable T t, Function<T, R> function) {
        return t == null ? null : (R)function.apply(t);
    }

    @Deprecated
    public static <T> T N(@Nullable T t, T t2) {
        return Objects.requireNonNullElse(t, t2);
    }

    public static <T> boolean N(T @Nullable [] TArray) {
        return TArray == null || TArray.length == 0;
    }

    public static <T> T N(Collection<T> collection, Supplier<T> supplier) {
        Iterator<T> iterator = collection.iterator();
        return iterator.hasNext() ? iterator.next() : supplier.get();
    }

    public static <T> T N(Collection<T> collection, T t) {
        Iterator<T> iterator = collection.iterator();
        return iterator.hasNext() ? iterator.next() : t;
    }

    public static <T> @Nullable T N(Collection<T> collection) {
        Iterator<T> iterator = collection.iterator();
        return iterator.hasNext() ? (T)iterator.next() : null;
    }
}

