/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

public final class class09997
extends Enum<class09997> {
    public static final /* enum */ class09997 FIXED = new class09997();
    public static final /* enum */ class09997 AUTO = new class09997();
    private static final /* synthetic */ class09997[] $VALUES;

    static {
        $VALUES = class09997.N();
    }

    public static class09997[] values() {
        return (class09997[])$VALUES.clone();
    }

    public static class09997 valueOf(String string) {
        return Enum.valueOf(class09997.class, string);
    }

    private static /* synthetic */ class09997[] N() {
        return new class09997[]{FIXED, AUTO};
    }
}

