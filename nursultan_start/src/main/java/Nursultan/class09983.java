/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

public final class class09983
extends Enum<class09983> {
    public static final /* enum */ class09983 CONTENT_BOX = new class09983();
    public static final /* enum */ class09983 BORDER_BOX = new class09983();
    private static final /* synthetic */ class09983[] $VALUES;

    static {
        $VALUES = class09983.N();
    }

    public static class09983[] values() {
        return (class09983[])$VALUES.clone();
    }

    public static class09983 valueOf(String string) {
        return Enum.valueOf(class09983.class, string);
    }

    private static /* synthetic */ class09983[] N() {
        return new class09983[]{CONTENT_BOX, BORDER_BOX};
    }
}

