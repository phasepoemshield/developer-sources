/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

public final class class09688
extends Enum<class09688> {
    public static final /* enum */ class09688 PROPORTIONAL = new class09688(0);
    public static final /* enum */ class09688 ALWAYS_ONE = new class09688(1);
    private final int id;
    private static final /* synthetic */ class09688[] $VALUES;

    private class09688(int n2) {
        this.id = n2;
    }

    static {
        $VALUES = class09688.y();
    }

    public static class09688[] values() {
        return (class09688[])$VALUES.clone();
    }

    public static class09688 valueOf(String string) {
        return Enum.valueOf(class09688.class, string);
    }

    private static /* synthetic */ class09688[] y() {
        return new class09688[]{PROPORTIONAL, ALWAYS_ONE};
    }

    public static class09688 N(int n) {
        if (n == class09688.PROPORTIONAL.id) {
            return PROPORTIONAL;
        }
        return ALWAYS_ONE;
    }

    public double N(double d) {
        switch (this.ordinal()) {
            case 0: {
                return d;
            }
            case 1: {
                return Math.signum(d);
            }
        }
        throw new AssertionError();
    }

    public int N() {
        return this.id;
    }
}

