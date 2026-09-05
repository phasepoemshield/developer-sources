/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

public final class class09787
extends Enum<class09787> {
    public static final /* enum */ class09787 ANIMATE_REMOVALS = new class09787();
    public static final /* enum */ class09787 REMOVE_IMMEDIATELY = new class09787();
    private static final /* synthetic */ class09787[] $VALUES;

    static {
        $VALUES = class09787.N();
    }

    public static class09787[] values() {
        return (class09787[])$VALUES.clone();
    }

    public static class09787 valueOf(String string) {
        return Enum.valueOf(class09787.class, string);
    }

    private static /* synthetic */ class09787[] N() {
        return new class09787[]{ANIMATE_REMOVALS, REMOVE_IMMEDIATELY};
    }
}

