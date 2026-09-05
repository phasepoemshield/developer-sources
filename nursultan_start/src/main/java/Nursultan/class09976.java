/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

public final class class09976
extends Enum<class09976> {
    public static final /* enum */ class09976 NONE = new class09976();
    public static final /* enum */ class09976 SELF = new class09976();
    public static final /* enum */ class09976 PARENT = new class09976();
    private static final /* synthetic */ class09976[] $VALUES;

    static {
        $VALUES = class09976.N();
    }

    public static class09976[] values() {
        return (class09976[])$VALUES.clone();
    }

    public static class09976 valueOf(String string) {
        return Enum.valueOf(class09976.class, string);
    }

    private static /* synthetic */ class09976[] N() {
        return new class09976[]{NONE, SELF, PARENT};
    }
}

