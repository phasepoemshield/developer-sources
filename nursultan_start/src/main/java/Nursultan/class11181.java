/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

public class class11181
extends Enum<class11181> {
    public static final /* enum */ class11181 RGBA8;
    public static final /* enum */ class11181 RGB8;
    public static final /* enum */ class11181 RGB16F;
    public static final /* enum */ class11181 RG16F;
    public static final /* enum */ class11181 DEPTH32;
    private static final /* synthetic */ class11181[] $VALUES;

    static {
        class11181.u();
        RGBA8 = new class11181();
        RGB8 = new class11181();
        RGB16F = new class11181();
        RG16F = new class11181();
        DEPTH32 = new class11181();
        $VALUES = class11181.R();
    }

    public static class11181[] values() {
        return (class11181[])$VALUES.clone();
    }

    public static class11181 valueOf(String string) {
        return Enum.valueOf(class11181.class, string);
    }

    private static void u() {
    }

    private static /* synthetic */ class11181[] R() {
        return new class11181[]{RGBA8, RGB8, RGB16F, RG16F, DEPTH32};
    }
}

