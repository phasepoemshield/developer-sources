/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00405
 *  minecraft.class05936
 *  minecraft.class06244
 *  minecraft.class06541
 */
package minecraft;

import java.util.Optional;
import minecraft.class00405;
import minecraft.class05197;
import minecraft.class05936;
import minecraft.class06244;
import minecraft.class06541;

public class class05232 {
    private static final char N = '\ufffd';
    private static final Optional<Object> y = Optional.of(class06244.field_17274);

    public static boolean L(String string, class00405 class004052, class05197 class051972) {
        return class05232.N(string, 0, class004052, class051972);
    }

    public static boolean y(String string, class00405 class004052, class05197 class051972) {
        for (int i = string.length() - 1; i >= 0; --i) {
            char c = string.charAt(i);
            if (Character.isLowSurrogate(c)) {
                if (i - 1 < 0) {
                    if (class051972.accept(0, class004052, 65533)) break;
                    return false;
                }
                char c2 = string.charAt(i - 1);
                if (!(Character.isHighSurrogate(c2) ? !class051972.accept(--i, class004052, Character.toCodePoint(c2, c)) : !class051972.accept(i, class004052, 65533))) continue;
                return false;
            }
            if (class05232.N(class004052, class051972, i, c)) continue;
            return false;
        }
        return true;
    }

    public static String N(class05936 class059362) {
        StringBuilder stringBuilder = new StringBuilder();
        class05232.N(class059362, class00405.N, (int n, class00405 class004052, int n2) -> {
            stringBuilder.appendCodePoint(n2);
            return true;
        });
        return stringBuilder.toString();
    }

    public static boolean N(class05936 class059362, class00405 class004053, class05197 class051972) {
        return class059362.N((class004052, string) -> class05232.N(string, 0, class004052, class051972) ? Optional.empty() : y, class004053).isEmpty();
    }

    public static boolean N(String string, class00405 class004052, class05197 class051972) {
        int n = string.length();
        for (int i = 0; i < n; ++i) {
            char c = string.charAt(i);
            if (Character.isHighSurrogate(c)) {
                if (i + 1 >= n) {
                    if (class051972.accept(i, class004052, 65533)) break;
                    return false;
                }
                char c2 = string.charAt(i + 1);
                if (Character.isLowSurrogate(c2)) {
                    if (!class051972.accept(i, class004052, Character.toCodePoint(c, c2))) {
                        return false;
                    }
                    ++i;
                    continue;
                }
                if (class051972.accept(i, class004052, 65533)) continue;
                return false;
            }
            if (class05232.N(class004052, class051972, i, c)) continue;
            return false;
        }
        return true;
    }

    public static boolean N(String string, int n, class00405 class004052, class05197 class051972) {
        return class05232.N(string, n, class004052, class004052, class051972);
    }

    public static boolean N(String string, int n, class00405 class004052, class00405 class004053, class05197 class051972) {
        int n2 = string.length();
        class00405 class004054 = class004052;
        for (int i = n; i < n2; ++i) {
            char c;
            char c2 = string.charAt(i);
            if (c2 == '\u00a7') {
                if (i + 1 >= n2) break;
                c = string.charAt(i + 1);
                class06541 class065412 = class06541.N((char)c);
                if (class065412 != null) {
                    class004054 = class065412 == class06541.field_1070 ? class004053 : class004054.L(class065412);
                }
                ++i;
                continue;
            }
            if (Character.isHighSurrogate(c2)) {
                if (i + 1 >= n2) {
                    if (class051972.accept(i, class004054, 65533)) break;
                    return false;
                }
                c = string.charAt(i + 1);
                if (Character.isLowSurrogate(c)) {
                    if (!class051972.accept(i, class004054, Character.toCodePoint(c2, c))) {
                        return false;
                    }
                    ++i;
                    continue;
                }
                if (class051972.accept(i, class004054, 65533)) continue;
                return false;
            }
            if (class05232.N(class004054, class051972, i, c2)) continue;
            return false;
        }
        return true;
    }

    private static boolean N(class00405 class004052, class05197 class051972, int n, char c) {
        if (Character.isSurrogate(c)) {
            return class051972.accept(n, class004052, 65533);
        }
        return class051972.accept(n, class004052, c);
    }

    public static String N(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        class05232.N(string, class00405.N, (int n, class00405 class004052, int n2) -> {
            stringBuilder.appendCodePoint(n2);
            return true;
        });
        return stringBuilder.toString();
    }
}

