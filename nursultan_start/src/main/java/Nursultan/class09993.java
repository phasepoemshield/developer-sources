/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

public final class class09993
extends Enum<class09993> {
    public static final /* enum */ class09993 VISIBLE = new class09993();
    public static final /* enum */ class09993 AUTO = new class09993();
    private static final /* synthetic */ class09993[] $VALUES;

    static {
        $VALUES = class09993.N();
    }

    public static class09993[] values() {
        return (class09993[])$VALUES.clone();
    }

    public static class09993 valueOf(String string) {
        return Enum.valueOf(class09993.class, string);
    }

    private static /* synthetic */ class09993[] N() {
        return new class09993[]{VISIBLE, AUTO};
    }
}

