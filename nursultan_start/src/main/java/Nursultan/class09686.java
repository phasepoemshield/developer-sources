/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

public final class class09686
extends Enum<class09686> {
    public static final /* enum */ class09686 SIMPLE = new class09686(0);
    public static final /* enum */ class09686 EVENT_BASED = new class09686(1);
    private final int id;
    private static final /* synthetic */ class09686[] $VALUES;

    private class09686(int n2) {
        this.id = n2;
    }

    static {
        $VALUES = class09686.y();
    }

    public static class09686[] values() {
        return (class09686[])$VALUES.clone();
    }

    public static class09686 valueOf(String string) {
        return Enum.valueOf(class09686.class, string);
    }

    private static /* synthetic */ class09686[] y() {
        return new class09686[]{SIMPLE, EVENT_BASED};
    }

    public static class09686 N(int n) {
        if (n == class09686.EVENT_BASED.id) {
            return EVENT_BASED;
        }
        return SIMPLE;
    }

    public int N() {
        return this.id;
    }
}

