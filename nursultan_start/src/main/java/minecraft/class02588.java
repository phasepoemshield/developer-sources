/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

@FunctionalInterface
public interface class02588 {
    public static final class02588 N = (string, n) -> false;
    public static final class02588 y = (string, n) -> string.length() == n;

    public static class02588 y(int n) {
        return switch (n) {
            case -1 -> N;
            case 0 -> y;
            default -> class02588.N(n);
        };
    }

    public static class02588 N(int n) {
        return (string, n2) -> n2 >= n;
    }

    public boolean shouldIgnore(String var1, int var2);
}

