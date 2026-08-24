/*
 * Decompiled with CFR 0.152.
 */
package oxxxde;

public final class \u0627\u0630 {
    private static final ThreadLocal<Integer> LINE_OFFSET = ThreadLocal.withInitial(() -> 0);

    public static int offsetX(int x) {
        return x + \u0627\u0630.getLineOffset();
    }

    public static int getLineOffset() {
        return LINE_OFFSET.get();
    }

    private \u0627\u0630() {
    }

    public static void setLineOffset(int offset) {
        LINE_OFFSET.set(offset);
    }
}

