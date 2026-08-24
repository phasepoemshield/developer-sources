/*
 * Decompiled with CFR 0.152.
 */
package oxxxde;

public final class \u0638\u062f {
    private static int depth;

    public static void push() {
        ++depth;
    }

    private \u0638\u062f() {
    }

    public static boolean isActive() {
        return depth > 0;
    }

    public static void pop() {
        depth = Math.max(0, depth - 1);
    }
}

