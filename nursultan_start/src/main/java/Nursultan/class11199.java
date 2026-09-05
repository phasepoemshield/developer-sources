/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

public class class11199
extends Enum<class11199> {
    public static final /* enum */ class11199 NEAREST;
    public static final /* enum */ class11199 LINEAR;
    public static final /* enum */ class11199 NEAREST_MIPMAP_NEAREST;
    public static final /* enum */ class11199 LINEAR_MIPMAP_NEAREST;
    public static final /* enum */ class11199 NEAREST_MIPMAP_LINEAR;
    public static final /* enum */ class11199 LINEAR_MIPMAP_LINEAR;
    private static final /* synthetic */ class11199[] $VALUES;

    private static void L() {
    }

    static {
        class11199.L();
        NEAREST = new class11199();
        LINEAR = new class11199();
        NEAREST_MIPMAP_NEAREST = new class11199();
        LINEAR_MIPMAP_NEAREST = new class11199();
        NEAREST_MIPMAP_LINEAR = new class11199();
        LINEAR_MIPMAP_LINEAR = new class11199();
        $VALUES = class11199.R();
    }

    public static class11199[] values() {
        return (class11199[])$VALUES.clone();
    }

    public static class11199 valueOf(String string) {
        return Enum.valueOf(class11199.class, string);
    }

    private static /* synthetic */ class11199[] R() {
        return new class11199[]{NEAREST, LINEAR, NEAREST_MIPMAP_NEAREST, LINEAR_MIPMAP_NEAREST, NEAREST_MIPMAP_LINEAR, LINEAR_MIPMAP_LINEAR};
    }
}

