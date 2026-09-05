/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

public final class class09735
extends Enum<class09735> {
    public static final /* enum */ class09735 SDF = new class09735(1, 0, false);
    public static final /* enum */ class09735 MSDF = new class09735(3, 2, true);
    public static final /* enum */ class09735 MTSDF = new class09735(4, 3, true);
    private final int channels;
    private final int bitmapType;
    private final boolean colored;
    private static final /* synthetic */ class09735[] $VALUES;

    public boolean L() {
        return this.colored;
    }

    private class09735(int n2, int n3, boolean bl) {
        this.channels = n2;
        this.bitmapType = n3;
        this.colored = bl;
    }

    static {
        $VALUES = class09735.u();
    }

    public static class09735[] values() {
        return (class09735[])$VALUES.clone();
    }

    public static class09735 valueOf(String string) {
        return Enum.valueOf(class09735.class, string);
    }

    private static /* synthetic */ class09735[] u() {
        return new class09735[]{SDF, MSDF, MTSDF};
    }

    public int y() {
        return this.bitmapType;
    }

    public int N() {
        return this.channels;
    }
}

