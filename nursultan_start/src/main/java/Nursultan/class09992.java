/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

public final class class09992 {
    private final String N;

    private class09992(String string) {
        this.N = class09992.y(string);
    }

    public String toString() {
        if (this.N.isEmpty()) {
            return "StyleSlot@" + Integer.toHexString(System.identityHashCode(this));
        }
        return "StyleSlot[" + this.N + "]";
    }

    private static String y(String string) {
        if (string == null || string.isBlank()) {
            return "";
        }
        return string.trim();
    }

    public String y() {
        return this.N;
    }

    public static class09992 N(String string) {
        return new class09992(string);
    }

    public static class09992 N() {
        return new class09992(null);
    }
}

