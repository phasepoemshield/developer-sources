/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

public final class class09684
extends Enum<class09684> {
    public static final /* enum */ class09684 FIRST_TO_LAST = new class09684(0);
    public static final /* enum */ class09684 LAST_TO_FIRST = new class09684(1);
    private final int id;
    private static final /* synthetic */ class09684[] $VALUES;

    private class09684(int n2) {
        this.id = n2;
    }

    static {
        $VALUES = class09684.y();
    }

    public static class09684[] values() {
        return (class09684[])$VALUES.clone();
    }

    public static class09684 valueOf(String string) {
        return Enum.valueOf(class09684.class, string);
    }

    private static /* synthetic */ class09684[] y() {
        return new class09684[]{FIRST_TO_LAST, LAST_TO_FIRST};
    }

    public static class09684 N(int n) {
        return n == class09684.FIRST_TO_LAST.id ? FIRST_TO_LAST : LAST_TO_FIRST;
    }

    public int N() {
        return this.id;
    }
}

