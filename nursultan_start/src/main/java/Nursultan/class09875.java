/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

public final class class09875
extends Enum<class09875> {
    public static final /* enum */ class09875 CAPTURE = new class09875();
    public static final /* enum */ class09875 AT_TARGET = new class09875();
    public static final /* enum */ class09875 BUBBLE = new class09875();
    private static final /* synthetic */ class09875[] $VALUES;

    static {
        $VALUES = class09875.N();
    }

    public static class09875[] values() {
        return (class09875[])$VALUES.clone();
    }

    public static class09875 valueOf(String string) {
        return Enum.valueOf(class09875.class, string);
    }

    private static /* synthetic */ class09875[] N() {
        return new class09875[]{CAPTURE, AT_TARGET, BUBBLE};
    }
}

