/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01036
 */
package eu.pb4.placeholders.api.arguments;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import minecraft.class01036;

public class SimpleArguments {
    public static String unwrap(String string, class01036 class010362) {
        char c;
        if (string.length() < 2) {
            return string;
        }
        char c2 = string.charAt(0);
        if (c2 == (c = string.charAt(string.length() - 1)) && class010362.test(c2)) {
            StringBuilder stringBuilder = new StringBuilder(string.length() - 2);
            for (int i = 1; i < string.length() - 1; ++i) {
                char c3 = string.charAt(i);
                if (c3 == c2 && string.charAt(i + 1) == c2) {
                    ++i;
                }
                stringBuilder.append(c3);
            }
            return stringBuilder.toString();
        }
        return string;
    }

    public static String unwrap(String string) {
        return SimpleArguments.unwrap(string, SimpleArguments::isWrapCharacter);
    }

    public static List<String> split(String string, char c, boolean bl, boolean bl2) {
        ArrayList<String> arrayList = new ArrayList<String>();
        StringBuilder stringBuilder = new StringBuilder();
        char c2 = '\u0000';
        for (int i = 0; i < string.length(); ++i) {
            char c3 = string.charAt(i);
            if (c3 == '\\') {
                if (!bl2) {
                    stringBuilder.append(c3);
                }
                if (i + 1 >= string.length()) continue;
                stringBuilder.append(string.charAt(i + 1));
                ++i;
                continue;
            }
            if (c3 == c && c2 == '\u0000') {
                arrayList.add(stringBuilder.toString());
                stringBuilder = new StringBuilder();
                continue;
            }
            if (c2 == c3 && c2 != '\u0000') {
                if (i + 1 >= string.length() || string.charAt(i + 1) != c2) {
                    c2 = '\u0000';
                    if (bl) {
                        continue;
                    }
                } else if (bl) {
                    ++i;
                }
            } else if (c2 == '\u0000' && SimpleArguments.isWrapCharacter(c3)) {
                c2 = c3;
                if (bl) continue;
            }
            stringBuilder.append(c3);
        }
        if (!stringBuilder.isEmpty()) {
            arrayList.add(stringBuilder.toString());
        }
        return arrayList;
    }

    public static List<String> split(String string, char c) {
        return SimpleArguments.split(string, c, true, true);
    }

    public static boolean bool(String string) {
        return SimpleArguments.bool(string, false);
    }

    public static boolean bool(String string, boolean bl) {
        if (string == null || string.isBlank()) {
            return bl;
        }
        return switch (string.toLowerCase(Locale.ROOT)) {
            case "true", "tru", "yes", "y", "1", "enabled", "enable", "on" -> true;
            default -> false;
        };
    }

    public static float floatNumber(String string, float f) {
        if (string == null || string.isBlank()) {
            return f;
        }
        try {
            return Float.parseFloat(string);
        }
        catch (Exception exception) {
            return f;
        }
    }

    public static float floatNumber(String string) {
        return SimpleArguments.floatNumber(string, 0.0f);
    }

    public static boolean isWrapCharacter(char c) {
        return c == '\"' || c == '\'' || c == '`';
    }

    public static int intNumber(String string) {
        return SimpleArguments.intNumber(string, 0);
    }

    public static int intNumber(String string, int n) {
        if (string == null || string.isBlank()) {
            return n;
        }
        try {
            return Integer.parseInt(string);
        }
        catch (Exception exception) {
            return n;
        }
    }
}

