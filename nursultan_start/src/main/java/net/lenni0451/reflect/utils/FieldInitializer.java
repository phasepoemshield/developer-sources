/*
 * Decompiled with CFR 0.152.
 */
package net.lenni0451.reflect.utils;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class FieldInitializer {
    public static <T, R> R init(ThrowingSupplier<T> supplier, ThrowingFunction<T, R> processor) {
        return processor.apply(supplier.get());
    }

    public static <T> T init(ThrowingSupplier<T> supplier) {
        return supplier.get();
    }

    public static <T> T init(T value, Consumer<T> initializer) {
        initializer.accept(value);
        return value;
    }

    public static <T> T process(ThrowingSupplier<T> supplier, Function<Throwable, Throwable> exceptionProcessor) {
        try {
            return supplier.get();
        }
        catch (Throwable t) {
            throw exceptionProcessor.apply(t);
        }
    }

    public static <C, T> T condReqInit(ThrowingSupplier<C> condition, ThrowingFunction<C, T> supplier, Supplier<Throwable> exceptionSupplier) {
        C cond;
        try {
            cond = condition.get();
            if (cond == null) {
                return null;
            }
        }
        catch (Throwable t) {
            return null;
        }
        T value = supplier.apply(cond);
        if (value == null) {
            throw exceptionSupplier.get();
        }
        return value;
    }

    public static <T, R> R condInit(boolean init, ThrowingSupplier<T> supplier, ThrowingFunction<T, R> processor) {
        if (!init) {
            return null;
        }
        return processor.apply(supplier.get());
    }

    public static <T> T condInit(boolean init, ThrowingSupplier<T> supplier) {
        if (!init) {
            return null;
        }
        return supplier.get();
    }

    public static <T, R> R optInit(ThrowingSupplier<T> supplier, ThrowingFunction<T, R> processor) {
        try {
            return processor.apply(supplier.get());
        }
        catch (Throwable t) {
            return null;
        }
    }

    public static <T> T optInit(ThrowingSupplier<T> supplier) {
        try {
            return supplier.get();
        }
        catch (Throwable t) {
            return null;
        }
    }

    public static <T> T reqInit(ThrowingSupplier<T> supplier, Supplier<Throwable> exceptionSupplier) {
        T value = supplier.get();
        if (value == null) {
            throw exceptionSupplier.get();
        }
        return value;
    }

    public static <T, R> R reqInit(ThrowingSupplier<T> supplier, ThrowingFunction<T, R> processor, Supplier<Throwable> exceptionSupplier) {
        T value = supplier.get();
        if (value == null) {
            throw exceptionSupplier.get();
        }
        return processor.apply(value);
    }

    public static <T> T reqOptInit(boolean init, ThrowingSupplier<T> supplier, Supplier<Throwable> exceptionSupplier) {
        if (!init) {
            return null;
        }
        T value = supplier.get();
        if (value == null) {
            throw exceptionSupplier.get();
        }
        return value;
    }

    public static <T, R> R reqOptInit(boolean init, ThrowingSupplier<T> supplier, ThrowingFunction<T, R> processor, Supplier<Throwable> exceptionSupplier) {
        if (!init) {
            return null;
        }
        T value = supplier.get();
        if (value == null) {
            throw exceptionSupplier.get();
        }
        return processor.apply(value);
    }

    @FunctionalInterface
    public static interface ThrowingFunction<A, R> {
        public R apply(A var1) throws Throwable;

        @SafeVarargs
        public static <A, R> ThrowingFunction<A, R> getFirst(ThrowingFunction<A, R> ... functions) {
            return a -> {
                Throwable cause = null;
                for (ThrowingFunction function : functions) {
                    try {
                        Object value = function.apply(a);
                        if (value != null) {
                            return value;
                        }
                        throw new NullPointerException("Function returned null");
                    }
                    catch (Throwable t) {
                        if (cause == null) {
                            cause = new IllegalStateException("All functions failed");
                        }
                        cause.addSuppressed(t);
                    }
                }
                if (cause == null) {
                    throw new IllegalStateException("All functions failed");
                }
                throw cause;
            };
        }
    }

    @FunctionalInterface
    public static interface ThrowingSupplier<T> {
        public T get() throws Throwable;

        @SafeVarargs
        public static <T> ThrowingSupplier<T> getFirst(ThrowingSupplier<T> ... suppliers) {
            return () -> {
                Throwable cause = null;
                for (ThrowingSupplier supplier : suppliers) {
                    try {
                        Object value = supplier.get();
                        if (value != null) {
                            return value;
                        }
                        throw new NullPointerException("Supplier returned null");
                    }
                    catch (Throwable t) {
                        if (cause == null) {
                            cause = new IllegalStateException("All suppliers failed");
                        }
                        cause.addSuppressed(t);
                    }
                }
                if (cause == null) {
                    throw new IllegalStateException("All suppliers failed");
                }
                throw cause;
            };
        }
    }
}

