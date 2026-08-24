/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package oxxxde;

import lombok.Generated;

public final class \u062d\u0646
extends Enum<\u062d\u0646> {
    public static final /* enum */ \u062d\u0646 ONE_MINUS_SRC_ALPHA;
    public static final /* enum */ \u062d\u0646 ONE_MINUS_CONSTANT_ALPHA;
    public static final /* enum */ \u062d\u0646 SRC_COLOR;
    public final int glId;
    public static final /* enum */ \u062d\u0646 DST_COLOR;
    private static final /* synthetic */ \u062d\u0646[] $VALUES;
    public static final /* enum */ \u062d\u0646 ZERO;
    public static final /* enum */ \u062d\u0646 CONSTANT_ALPHA;
    public static final /* enum */ \u062d\u0646 ONE_MINUS_DST_COLOR;
    public static final /* enum */ \u062d\u0646 ONE_MINUS_SRC_COLOR;
    public static final /* enum */ \u062d\u0646 ONE;
    public static final /* enum */ \u062d\u0646 CONSTANT_COLOR;
    public static final /* enum */ \u062d\u0646 SRC_ALPHA;
    public static final /* enum */ \u062d\u0646 ONE_MINUS_CONSTANT_COLOR;
    public static final /* enum */ \u062d\u0646 DST_ALPHA;
    public static final /* enum */ \u062d\u0646 ONE_MINUS_DST_ALPHA;

    @Generated
    private \u062d\u0646(int glId) {
        this.glId = glId;
    }

    public static \u062d\u0646[] values() {
        return (\u062d\u0646[])$VALUES.clone();
    }

    public static \u062d\u0646 valueOf(String name) {
        return Enum.valueOf(\u062d\u0646.class, name);
    }

    private static /* synthetic */ \u062d\u0646[] $values() {
        \u062d\u0646[] \u062d\u0646Array = new \u062d\u0646[14];
        \u062d\u0646Array[0] = CONSTANT_ALPHA;
        \u062d\u0646Array[1] = CONSTANT_COLOR;
        \u062d\u0646Array[2] = DST_ALPHA;
        \u062d\u0646Array[3] = DST_COLOR;
        \u062d\u0646Array[4] = ONE;
        \u062d\u0646Array[5] = ONE_MINUS_CONSTANT_ALPHA;
        \u062d\u0646Array[6] = ONE_MINUS_CONSTANT_COLOR;
        \u062d\u0646Array[7] = ONE_MINUS_DST_ALPHA;
        \u062d\u0646Array[8] = ONE_MINUS_DST_COLOR;
        \u062d\u0646Array[9] = ONE_MINUS_SRC_ALPHA;
        \u062d\u0646Array[10] = ONE_MINUS_SRC_COLOR;
        \u062d\u0646Array[11] = SRC_ALPHA;
        \u062d\u0646Array[12] = SRC_COLOR;
        \u062d\u0646Array[13] = ZERO;
        return \u062d\u0646Array;
    }

    static {
        CONSTANT_ALPHA = new \u062d\u0646(32771);
        CONSTANT_COLOR = new \u062d\u0646(32769);
        DST_ALPHA = new \u062d\u0646(772);
        DST_COLOR = new \u062d\u0646(774);
        ONE = new \u062d\u0646(1);
        ONE_MINUS_CONSTANT_ALPHA = new \u062d\u0646(32772);
        ONE_MINUS_CONSTANT_COLOR = new \u062d\u0646(32770);
        ONE_MINUS_DST_ALPHA = new \u062d\u0646(773);
        ONE_MINUS_DST_COLOR = new \u062d\u0646(775);
        ONE_MINUS_SRC_ALPHA = new \u062d\u0646(771);
        ONE_MINUS_SRC_COLOR = new \u062d\u0646(769);
        SRC_ALPHA = new \u062d\u0646(770);
        SRC_COLOR = new \u062d\u0646(768);
        ZERO = new \u062d\u0646(0);
        $VALUES = \u062d\u0646.$values();
    }
}

