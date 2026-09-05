/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

public final class class09871
extends Enum<class09871> {
    public static final /* enum */ class09871 NONE = new class09871();
    public static final /* enum */ class09871 TRACK = new class09871();
    public static final /* enum */ class09871 THUMB = new class09871();
    private static final /* synthetic */ class09871[] $VALUES;

    static {
        $VALUES = class09871.N();
    }

    public static class09871[] values() {
        return (class09871[])$VALUES.clone();
    }

    public static class09871 valueOf(String string) {
        return Enum.valueOf(class09871.class, string);
    }

    private static /* synthetic */ class09871[] N() {
        return new class09871[]{NONE, TRACK, THUMB};
    }
}

