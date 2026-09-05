/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

public final class class09782
extends Enum<class09782> {
    public static final /* enum */ class09782 FLOAT = new class09782();
    public static final /* enum */ class09782 COLOR = new class09782();
    public static final /* enum */ class09782 AXIS_SIZE = new class09782();
    public static final /* enum */ class09782 TRANSLATE_LENGTH = new class09782();
    private static final /* synthetic */ class09782[] $VALUES;

    static {
        $VALUES = class09782.N();
    }

    public static class09782[] values() {
        return (class09782[])$VALUES.clone();
    }

    public static class09782 valueOf(String string) {
        return Enum.valueOf(class09782.class, string);
    }

    private static /* synthetic */ class09782[] N() {
        return new class09782[]{FLOAT, COLOR, AXIS_SIZE, TRANSLATE_LENGTH};
    }
}

