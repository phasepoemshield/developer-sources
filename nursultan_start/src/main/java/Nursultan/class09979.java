/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

public final class class09979
extends Enum<class09979> {
    public static final /* enum */ class09979 HOVER = new class09979();
    public static final /* enum */ class09979 FOCUS = new class09979();
    public static final /* enum */ class09979 ACTIVE = new class09979();
    private static final /* synthetic */ class09979[] $VALUES;

    static {
        $VALUES = class09979.N();
    }

    public static class09979[] values() {
        return (class09979[])$VALUES.clone();
    }

    public static class09979 valueOf(String string) {
        return Enum.valueOf(class09979.class, string);
    }

    private static /* synthetic */ class09979[] N() {
        return new class09979[]{HOVER, FOCUS, ACTIVE};
    }
}

