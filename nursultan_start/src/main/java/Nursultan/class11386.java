/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

public class class11386
extends Enum<class11386> {
    public static final /* enum */ class11386 ACTIVATED;
    public static final /* enum */ class11386 DEACTIVATED;
    public static final /* enum */ class11386 UPDATED;
    private static final /* synthetic */ class11386[] $VALUES;

    static {
        class11386.R();
        ACTIVATED = new class11386();
        DEACTIVATED = new class11386();
        UPDATED = new class11386();
        $VALUES = class11386.u();
    }

    public static class11386[] values() {
        return (class11386[])$VALUES.clone();
    }

    public static class11386 valueOf(String string) {
        return Enum.valueOf(class11386.class, string);
    }

    private static /* synthetic */ class11386[] u() {
        return new class11386[]{ACTIVATED, DEACTIVATED, UPDATED};
    }

    private static void R() {
    }
}

