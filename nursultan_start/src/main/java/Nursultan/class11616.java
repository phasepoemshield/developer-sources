/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

public class class11616
extends Enum<class11616> {
    public static final /* enum */ class11616 FULL;
    public static final /* enum */ class11616 HORIZONTAL;
    public static final /* enum */ class11616 VERTICAL;
    public static final /* enum */ class11616 NONE;
    private static final /* synthetic */ class11616[] $VALUES;

    private static void L() {
    }

    static {
        class11616.L();
        FULL = new class11616();
        HORIZONTAL = new class11616();
        VERTICAL = new class11616();
        NONE = new class11616();
        $VALUES = class11616.i();
    }

    public static class11616[] values() {
        return (class11616[])$VALUES.clone();
    }

    public static class11616 valueOf(String string) {
        return Enum.valueOf(class11616.class, string);
    }

    private static /* synthetic */ class11616[] i() {
        return new class11616[]{FULL, HORIZONTAL, VERTICAL, NONE};
    }

    public boolean y() {
        return this == FULL || this == HORIZONTAL;
    }

    public boolean N() {
        return this == FULL || this == VERTICAL;
    }
}

