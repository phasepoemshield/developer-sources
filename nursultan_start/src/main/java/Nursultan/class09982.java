/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

public final class class09982
extends Enum<class09982> {
    public static final /* enum */ class09982 FIT = new class09982();
    public static final /* enum */ class09982 GROW = new class09982();
    public static final /* enum */ class09982 PERCENT = new class09982();
    public static final /* enum */ class09982 FIXED = new class09982();
    private static final /* synthetic */ class09982[] $VALUES;

    static {
        $VALUES = class09982.N();
    }

    public static class09982[] values() {
        return (class09982[])$VALUES.clone();
    }

    public static class09982 valueOf(String string) {
        return Enum.valueOf(class09982.class, string);
    }

    private static /* synthetic */ class09982[] N() {
        return new class09982[]{FIT, GROW, PERCENT, FIXED};
    }
}

