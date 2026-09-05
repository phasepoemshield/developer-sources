/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

final class class09733
extends Enum<class09733> {
    public static final /* enum */ class09733 COLOR = new class09733();
    public static final /* enum */ class09733 FLOAT = new class09733();
    public static final /* enum */ class09733 RUNTIME_VALUE = new class09733();
    public static final /* enum */ class09733 AXIS_SIZE = new class09733();
    public static final /* enum */ class09733 TRANSLATE_LENGTH = new class09733();
    private static final /* synthetic */ class09733[] $VALUES;

    static {
        $VALUES = class09733.N();
    }

    public static class09733[] values() {
        return (class09733[])$VALUES.clone();
    }

    public static class09733 valueOf(String string) {
        return Enum.valueOf(class09733.class, string);
    }

    private static /* synthetic */ class09733[] N() {
        return new class09733[]{COLOR, FLOAT, RUNTIME_VALUE, AXIS_SIZE, TRANSLATE_LENGTH};
    }
}

