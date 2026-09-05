/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

public final class class09940
extends Enum<class09940> {
    public static final /* enum */ class09940 ALPHA8 = new class09940(1);
    public static final /* enum */ class09940 RGBA8 = new class09940(4);
    private final int bytesPerPixel;
    private static final /* synthetic */ class09940[] $VALUES;

    private class09940(int n2) {
        this.bytesPerPixel = n2;
    }

    static {
        $VALUES = class09940.y();
    }

    public static class09940[] values() {
        return (class09940[])$VALUES.clone();
    }

    public static class09940 valueOf(String string) {
        return Enum.valueOf(class09940.class, string);
    }

    private static /* synthetic */ class09940[] y() {
        return new class09940[]{ALPHA8, RGBA8};
    }

    public int N() {
        return this.bytesPerPixel;
    }
}

