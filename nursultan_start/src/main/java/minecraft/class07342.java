/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

public interface class07342<T> {
    public static <T> class07342<T> N() {
        return (n, object) -> {
            throw new IllegalArgumentException("Unexpected palette resize, bits = " + n + ", added value = " + String.valueOf(object));
        };
    }

    public int onResize(int var1, T var2);
}

