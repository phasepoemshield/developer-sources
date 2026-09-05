/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

public interface class02452<T> {
    public static final class02452<?> u = () -> {
        throw new IllegalStateException("Cannot dereference handle with no underlying resource");
    };

    public T get();

    public static <T> class02452<T> N() {
        return u;
    }
}

