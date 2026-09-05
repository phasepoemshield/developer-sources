/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

public final class class09690
extends Enum<class09690> {
    public static final /* enum */ class09690 LEFT = new class09690(0);
    public static final /* enum */ class09690 RIGHT = new class09690(1);
    private final int id;
    private static final /* synthetic */ class09690[] $VALUES;

    private class09690(int n2) {
        this.id = n2;
    }

    static {
        $VALUES = class09690.y();
    }

    public static class09690[] values() {
        return (class09690[])$VALUES.clone();
    }

    public static class09690 valueOf(String string) {
        return Enum.valueOf(class09690.class, string);
    }

    private static /* synthetic */ class09690[] y() {
        return new class09690[]{LEFT, RIGHT};
    }

    public static class09690 N(int n) {
        return switch (n) {
            case 0 -> LEFT;
            case 1 -> RIGHT;
            default -> null;
        };
    }

    public int N() {
        return this.id;
    }
}

