/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

public class class11903
extends Enum<class11903> {
    public static final /* enum */ class11903 FORWARDS;
    public static final /* enum */ class11903 BACKWARDS;
    private static final /* synthetic */ class11903[] $VALUES;

    public boolean L() {
        return this == FORWARDS;
    }

    static {
        class11903.R();
        FORWARDS = new class11903();
        BACKWARDS = new class11903();
        $VALUES = class11903.i();
    }

    public static class11903[] values() {
        return (class11903[])$VALUES.clone();
    }

    public static class11903 valueOf(String string) {
        return Enum.valueOf(class11903.class, string);
    }

    private static /* synthetic */ class11903[] i() {
        return new class11903[]{FORWARDS, BACKWARDS};
    }

    public class11903 y() {
        return this == FORWARDS ? BACKWARDS : FORWARDS;
    }

    public boolean N() {
        return this == BACKWARDS;
    }

    private static void R() {
    }
}

