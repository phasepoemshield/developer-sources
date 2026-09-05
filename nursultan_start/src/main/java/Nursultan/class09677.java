/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

public final class class09677
extends Enum<class09677> {
    public static final /* enum */ class09677 ALPHA = new class09677(-16777216, 24);
    public static final /* enum */ class09677 RED = new class09677(0xFF0000, 16);
    public static final /* enum */ class09677 GREEN = new class09677(65280, 8);
    public static final /* enum */ class09677 BLUE = new class09677(255, 0);
    private final int mask;
    private final int shift;
    private static final /* synthetic */ class09677[] $VALUES;

    private static /* synthetic */ class09677[] L() {
        return new class09677[]{ALPHA, RED, GREEN, BLUE};
    }

    private class09677(int n2, int n3) {
        this.mask = n2;
        this.shift = n3;
    }

    static {
        $VALUES = class09677.L();
    }

    public static class09677[] values() {
        return (class09677[])$VALUES.clone();
    }

    public static class09677 valueOf(String string) {
        return Enum.valueOf(class09677.class, string);
    }

    public int y() {
        return this.shift;
    }

    public int N() {
        return this.mask;
    }
}

