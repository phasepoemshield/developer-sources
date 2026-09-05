/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

public final class class09973
extends Enum<class09973> {
    public static final /* enum */ class09973 START = new class09973();
    public static final /* enum */ class09973 CENTER = new class09973();
    public static final /* enum */ class09973 END = new class09973();
    private static final /* synthetic */ class09973[] $VALUES;

    static {
        $VALUES = class09973.N();
    }

    public static class09973[] values() {
        return (class09973[])$VALUES.clone();
    }

    public static class09973 valueOf(String string) {
        return Enum.valueOf(class09973.class, string);
    }

    private static /* synthetic */ class09973[] N() {
        return new class09973[]{START, CENTER, END};
    }
}

