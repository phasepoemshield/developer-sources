/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

public final class class09668
extends Enum<class09668> {
    public static final /* enum */ class09668 SINGLE = new class09668();
    public static final /* enum */ class09668 PADDING = new class09668();
    public static final /* enum */ class09668 POSITION_OFFSET = new class09668();
    public static final /* enum */ class09668 VISUAL_TRANSLATE = new class09668();
    private static final /* synthetic */ class09668[] $VALUES;

    static {
        $VALUES = class09668.N();
    }

    public static class09668[] values() {
        return (class09668[])$VALUES.clone();
    }

    public static class09668 valueOf(String string) {
        return Enum.valueOf(class09668.class, string);
    }

    private static /* synthetic */ class09668[] N() {
        return new class09668[]{SINGLE, PADDING, POSITION_OFFSET, VISUAL_TRANSLATE};
    }
}

