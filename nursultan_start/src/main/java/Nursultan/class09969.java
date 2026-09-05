/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

public final class class09969
extends Enum<class09969> {
    public static final /* enum */ class09969 FLOW = new class09969();
    public static final /* enum */ class09969 FLOATING = new class09969();
    public static final /* enum */ class09969 FIXED = new class09969();
    private static final /* synthetic */ class09969[] $VALUES;

    static {
        $VALUES = class09969.N();
    }

    public static class09969[] values() {
        return (class09969[])$VALUES.clone();
    }

    public static class09969 valueOf(String string) {
        return Enum.valueOf(class09969.class, string);
    }

    private static /* synthetic */ class09969[] N() {
        return new class09969[]{FLOW, FLOATING, FIXED};
    }
}

