/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

public class class11602 {
    private static String[] N;

    private class11602() {
    }

    static {
        class11602.y();
    }

    private static void y() {
        N = new String[3];
        class11602.N[0] = "-";
        class11602.N[1] = ".";
        class11602.N[2] = "-.";
    }

    public static String N(float f) {
        if (Math.floor(f) == (double)f) {
            return String.valueOf((int)f);
        }
        return String.valueOf(f);
    }

    public static String N(float f, String string) {
        return class11602.N(f) + string;
    }

    public static boolean N(String string) {
        return string.isEmpty() || string.equals(N[0]) || string.equals(N[1]) || string.equals(N[2]);
    }

    public static String N(String string, String string2) {
        String string3 = string.trim();
        if (!string2.isBlank() && string3.endsWith(string2)) {
            return string3.substring(0, string3.length() - string2.length()).trim();
        }
        return string3;
    }
}

