/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

public class class11175
extends Enum<class11175> {
    public static final /* enum */ class11175 CLAMP_TO_EDGE;
    public static final /* enum */ class11175 CLAMP_TO_BORDER;
    public static final /* enum */ class11175 REPEAT;
    public static final /* enum */ class11175 MIRRORED_REPEAT;
    private static final /* synthetic */ class11175[] $VALUES;

    static {
        class11175.u();
        CLAMP_TO_EDGE = new class11175();
        CLAMP_TO_BORDER = new class11175();
        REPEAT = new class11175();
        MIRRORED_REPEAT = new class11175();
        $VALUES = class11175.i();
    }

    public static class11175[] values() {
        return (class11175[])$VALUES.clone();
    }

    public static class11175 valueOf(String string) {
        return Enum.valueOf(class11175.class, string);
    }

    private static /* synthetic */ class11175[] i() {
        return new class11175[]{CLAMP_TO_EDGE, CLAMP_TO_BORDER, REPEAT, MIRRORED_REPEAT};
    }

    private static void u() {
    }
}

