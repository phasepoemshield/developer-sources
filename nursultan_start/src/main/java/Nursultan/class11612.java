/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

public class class11612
extends Enum<class11612> {
    public static final /* enum */ class11612 REGULAR;
    public static final /* enum */ class11612 MTSDF;
    private static final /* synthetic */ class11612[] $VALUES;

    private static /* synthetic */ class11612[] L() {
        return new class11612[]{REGULAR, MTSDF};
    }

    static {
        class11612.y();
        REGULAR = new class11612();
        MTSDF = new class11612();
        $VALUES = class11612.L();
    }

    public static class11612[] values() {
        return (class11612[])$VALUES.clone();
    }

    public static class11612 valueOf(String string) {
        return Enum.valueOf(class11612.class, string);
    }

    private static void y() {
    }
}

