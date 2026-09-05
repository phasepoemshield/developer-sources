/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

public final class class10003
extends Enum<class10003> {
    public static final /* enum */ class10003 TOP = new class10003();
    public static final /* enum */ class10003 BOTTOM = new class10003();
    public static final /* enum */ class10003 LEFT = new class10003();
    public static final /* enum */ class10003 RIGHT = new class10003();
    private static final /* synthetic */ class10003[] $VALUES;

    static {
        $VALUES = class10003.N();
    }

    public static class10003[] values() {
        return (class10003[])$VALUES.clone();
    }

    public static class10003 valueOf(String string) {
        return Enum.valueOf(class10003.class, string);
    }

    private static /* synthetic */ class10003[] N() {
        return new class10003[]{TOP, BOTTOM, LEFT, RIGHT};
    }
}

