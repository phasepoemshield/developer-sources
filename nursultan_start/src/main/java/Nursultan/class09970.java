/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

public final class class09970
extends Enum<class09970> {
    public static final /* enum */ class09970 HIDDEN = new class09970();
    public static final /* enum */ class09970 OVERLAY = new class09970();
    public static final /* enum */ class09970 CLASSIC = new class09970();
    private static final /* synthetic */ class09970[] $VALUES;

    static {
        $VALUES = class09970.N();
    }

    public static class09970[] values() {
        return (class09970[])$VALUES.clone();
    }

    public static class09970 valueOf(String string) {
        return Enum.valueOf(class09970.class, string);
    }

    private static /* synthetic */ class09970[] N() {
        return new class09970[]{HIDDEN, OVERLAY, CLASSIC};
    }
}

