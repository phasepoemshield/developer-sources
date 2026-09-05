/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

public final class class09870
extends Enum<class09870> {
    public static final /* enum */ class09870 NORMAL = new class09870();
    public static final /* enum */ class09870 ITALIC = new class09870();
    private static final /* synthetic */ class09870[] $VALUES;

    static {
        $VALUES = class09870.N();
    }

    public static class09870[] values() {
        return (class09870[])$VALUES.clone();
    }

    public static class09870 valueOf(String string) {
        return Enum.valueOf(class09870.class, string);
    }

    private static /* synthetic */ class09870[] N() {
        return new class09870[]{NORMAL, ITALIC};
    }
}

