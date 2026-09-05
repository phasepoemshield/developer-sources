/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

public final class class09964
extends Enum<class09964> {
    public static final /* enum */ class09964 NOWRAP = new class09964();
    public static final /* enum */ class09964 WORDS = new class09964();
    private static final /* synthetic */ class09964[] $VALUES;

    static {
        $VALUES = class09964.N();
    }

    public static class09964[] values() {
        return (class09964[])$VALUES.clone();
    }

    public static class09964 valueOf(String string) {
        return Enum.valueOf(class09964.class, string);
    }

    private static /* synthetic */ class09964[] N() {
        return new class09964[]{NOWRAP, WORDS};
    }
}

