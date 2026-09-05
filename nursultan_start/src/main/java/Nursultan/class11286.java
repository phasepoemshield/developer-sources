/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

public class class11286
extends Enum<class11286> {
    public static final /* enum */ class11286 PRESS;
    public static final /* enum */ class11286 RELEASE;
    public static final /* enum */ class11286 REPEAT;
    private static final /* synthetic */ class11286[] $VALUES;

    private static void L() {
    }

    static {
        class11286.L();
        PRESS = new class11286();
        RELEASE = new class11286();
        REPEAT = new class11286();
        $VALUES = class11286.i();
    }

    public static class11286[] values() {
        return (class11286[])$VALUES.clone();
    }

    public static class11286 valueOf(String string) {
        return Enum.valueOf(class11286.class, string);
    }

    private static /* synthetic */ class11286[] i() {
        return new class11286[]{PRESS, RELEASE, REPEAT};
    }

    public static class11286 N(int n) {
        switch (n) {
            case 1: {
                return PRESS;
            }
            case 2: {
                return REPEAT;
            }
            case 0: {
                return RELEASE;
            }
        }
        throw new IllegalArgumentException("Invalid action: " + n);
    }

    public boolean N(class11286 class112862) {
        return this == class112862;
    }
}

