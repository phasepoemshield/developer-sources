/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

final class class10036
extends Enum<class10036> {
    public static final /* enum */ class10036 WIDTH = new class10036();
    public static final /* enum */ class10036 HEIGHT = new class10036();
    private static final /* synthetic */ class10036[] $VALUES;

    static {
        $VALUES = class10036.N();
    }

    public static class10036[] values() {
        return (class10036[])$VALUES.clone();
    }

    public static class10036 valueOf(String string) {
        return Enum.valueOf(class10036.class, string);
    }

    private static /* synthetic */ class10036[] N() {
        return new class10036[]{WIDTH, HEIGHT};
    }
}

