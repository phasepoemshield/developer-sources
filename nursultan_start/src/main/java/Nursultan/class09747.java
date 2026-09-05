/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

public final class class09747
extends Enum<class09747> {
    public static final /* enum */ class09747 JTS = new class09747();
    public static final /* enum */ class09747 AWT_AREA = new class09747();
    private static final /* synthetic */ class09747[] $VALUES;

    static {
        $VALUES = class09747.N();
    }

    public static class09747[] values() {
        return (class09747[])$VALUES.clone();
    }

    public static class09747 valueOf(String string) {
        return Enum.valueOf(class09747.class, string);
    }

    private static /* synthetic */ class09747[] N() {
        return new class09747[]{JTS, AWT_AREA};
    }
}

