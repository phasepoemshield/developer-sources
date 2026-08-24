/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package oxxxde;

import lombok.Generated;

public final class \u0635\u0652
extends Enum<\u0635\u0652> {
    public static final /* enum */ \u0635\u0652 ZERO;
    public static final /* enum */ \u0635\u0652 CONSTANT_ALPHA;
    public static final /* enum */ \u0635\u0652 DST_ALPHA;
    public static final /* enum */ \u0635\u0652 CONSTANT_COLOR;
    public static final /* enum */ \u0635\u0652 ONE_MINUS_DST_COLOR;
    public static final /* enum */ \u0635\u0652 SRC_ALPHA_SATURATE;
    public static final /* enum */ \u0635\u0652 SRC_ALPHA;
    public static final /* enum */ \u0635\u0652 ONE_MINUS_SRC_COLOR;
    public static final /* enum */ \u0635\u0652 ONE_MINUS_CONSTANT_ALPHA;
    public static final /* enum */ \u0635\u0652 ONE_MINUS_SRC_ALPHA;
    private static final /* synthetic */ \u0635\u0652[] $VALUES;
    public static final /* enum */ \u0635\u0652 DST_COLOR;
    public final int glId;
    public static final /* enum */ \u0635\u0652 ONE_MINUS_CONSTANT_COLOR;
    public static final /* enum */ \u0635\u0652 ONE_MINUS_DST_ALPHA;
    public static final /* enum */ \u0635\u0652 SRC_COLOR;
    public static final /* enum */ \u0635\u0652 ONE;

    public static \u0635\u0652 valueOf(String name) {
        return Enum.valueOf(\u0635\u0652.class, name);
    }

    @Generated
    private \u0635\u0652(int glId) {
        this.glId = glId;
    }

    private static /* synthetic */ \u0635\u0652[] $values() {
        \u0635\u0652[] \u0635\u0652Array = new \u0635\u0652[15];
        \u0635\u0652Array[0] = CONSTANT_ALPHA;
        \u0635\u0652Array[1] = CONSTANT_COLOR;
        \u0635\u0652Array[2] = DST_ALPHA;
        \u0635\u0652Array[3] = DST_COLOR;
        \u0635\u0652Array[4] = ONE;
        \u0635\u0652Array[5] = ONE_MINUS_CONSTANT_ALPHA;
        \u0635\u0652Array[6] = ONE_MINUS_CONSTANT_COLOR;
        \u0635\u0652Array[7] = ONE_MINUS_DST_ALPHA;
        \u0635\u0652Array[8] = ONE_MINUS_DST_COLOR;
        \u0635\u0652Array[9] = ONE_MINUS_SRC_ALPHA;
        \u0635\u0652Array[10] = ONE_MINUS_SRC_COLOR;
        \u0635\u0652Array[11] = SRC_ALPHA;
        \u0635\u0652Array[12] = SRC_ALPHA_SATURATE;
        \u0635\u0652Array[13] = SRC_COLOR;
        \u0635\u0652Array[14] = ZERO;
        return \u0635\u0652Array;
    }

    public static \u0635\u0652[] values() {
        return (\u0635\u0652[])$VALUES.clone();
    }

    static {
        CONSTANT_ALPHA = new \u0635\u0652(32771);
        CONSTANT_COLOR = new \u0635\u0652(32769);
        DST_ALPHA = new \u0635\u0652(772);
        DST_COLOR = new \u0635\u0652(774);
        ONE = new \u0635\u0652(1);
        ONE_MINUS_CONSTANT_ALPHA = new \u0635\u0652(32772);
        ONE_MINUS_CONSTANT_COLOR = new \u0635\u0652(32770);
        ONE_MINUS_DST_ALPHA = new \u0635\u0652(773);
        ONE_MINUS_DST_COLOR = new \u0635\u0652(775);
        ONE_MINUS_SRC_ALPHA = new \u0635\u0652(771);
        ONE_MINUS_SRC_COLOR = new \u0635\u0652(769);
        SRC_ALPHA = new \u0635\u0652(770);
        SRC_ALPHA_SATURATE = new \u0635\u0652(776);
        SRC_COLOR = new \u0635\u0652(768);
        ZERO = new \u0635\u0652(0);
        $VALUES = \u0635\u0652.$values();
    }
}

