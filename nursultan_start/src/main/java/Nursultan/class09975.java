/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

public final class class09975
extends Enum<class09975> {
    public static final /* enum */ class09975 ROW = new class09975();
    public static final /* enum */ class09975 COLUMN = new class09975();
    private static final /* synthetic */ class09975[] $VALUES;

    static {
        $VALUES = class09975.N();
    }

    public static class09975[] values() {
        return (class09975[])$VALUES.clone();
    }

    public static class09975 valueOf(String string) {
        return Enum.valueOf(class09975.class, string);
    }

    private static /* synthetic */ class09975[] N() {
        return new class09975[]{ROW, COLUMN};
    }
}

