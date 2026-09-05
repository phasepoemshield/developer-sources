/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

public class class11381
extends Enum<class11381> {
    public static final /* enum */ class11381 MOUSE;
    public static final /* enum */ class11381 KEYBOARD;
    private static final /* synthetic */ class11381[] $VALUES;

    static {
        class11381.y();
        MOUSE = new class11381();
        KEYBOARD = new class11381();
        $VALUES = class11381.R();
    }

    public static class11381[] values() {
        return (class11381[])$VALUES.clone();
    }

    public static class11381 valueOf(String string) {
        return Enum.valueOf(class11381.class, string);
    }

    private static void y() {
    }

    public boolean N(class11381 class113812) {
        return this == class113812;
    }

    private static /* synthetic */ class11381[] R() {
        return new class11381[]{MOUSE, KEYBOARD};
    }
}

