/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

public final class class09981
extends Enum<class09981> {
    public static final /* enum */ class09981 INSIDE = new class09981();
    public static final /* enum */ class09981 OUTSIDE = new class09981();
    private static final /* synthetic */ class09981[] $VALUES;

    static {
        $VALUES = class09981.N();
    }

    public static class09981[] values() {
        return (class09981[])$VALUES.clone();
    }

    public static class09981 valueOf(String string) {
        return Enum.valueOf(class09981.class, string);
    }

    private static /* synthetic */ class09981[] N() {
        return new class09981[]{INSIDE, OUTSIDE};
    }
}

