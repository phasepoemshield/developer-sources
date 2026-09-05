/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

import java.util.regex.Pattern;

public class class11089 {
    public static Object N_0;

    private class11089() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    static {
        class11089.N();
        N_0 = Pattern.compile("(?<=[A-Z])(?=[A-Z][a-z])|(?<=[a-z])(?=[A-Z])");
    }

    private static void N() {
        N_0 = null;
    }

    public static String N(String string) {
        return ((Pattern)N_0).matcher(string).replaceAll(" ");
    }
}

