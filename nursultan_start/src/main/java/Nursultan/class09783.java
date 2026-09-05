/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

public final class class09783
extends Enum<class09783> {
    public static final /* enum */ class09783 WHILE_MOUNTED = new class09783();
    public static final /* enum */ class09783 KEEP_BY_KEY = new class09783();
    public static final /* enum */ class09783 MANUAL = new class09783();
    private static final /* synthetic */ class09783[] $VALUES;

    static {
        $VALUES = class09783.N();
    }

    public static class09783[] values() {
        return (class09783[])$VALUES.clone();
    }

    public static class09783 valueOf(String string) {
        return Enum.valueOf(class09783.class, string);
    }

    private static /* synthetic */ class09783[] N() {
        return new class09783[]{WHILE_MOUNTED, KEEP_BY_KEY, MANUAL};
    }
}

