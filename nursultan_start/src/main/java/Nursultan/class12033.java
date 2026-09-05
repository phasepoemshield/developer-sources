/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

import Nursultan.class12018;

public class class12033 {
    private class12033() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    private static String u(String string) {
        return string.toLowerCase();
    }

    public static class12018 y(String string) {
        return new class12018("entry." + string);
    }

    public static String N(String string) {
        return "module.%s.description".formatted(new Object[]{class12033.u(string)});
    }
}

