/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 */
package Nursultan;

import Nursultan.class09693;

public final class class09759
extends Enum<class09759> {
    public static final /* enum */ class09759 LINEAR = new class09759();
    public static final /* enum */ class09759 EASE = new class09759();
    public static final /* enum */ class09759 EASE_IN = new class09759();
    public static final /* enum */ class09759 EASE_OUT = new class09759();
    public static final /* enum */ class09759 EASE_IN_OUT = new class09759();
    public static final /* enum */ class09759 EASE_OUT_QUINT = new class09759();
    public static final /* enum */ class09759 STEP_START = new class09759();
    public static final /* enum */ class09759 STEP_END = new class09759();
    private static final /* synthetic */ class09759[] $VALUES;

    static {
        $VALUES = class09759.N();
    }

    public static class09759[] values() {
        return (class09759[])$VALUES.clone();
    }

    public static class09759 valueOf(String string) {
        return Enum.valueOf(class09759.class, string);
    }

    private static /* synthetic */ class09759[] N() {
        return new class09759[]{LINEAR, EASE, EASE_IN, EASE_OUT, EASE_IN_OUT, EASE_OUT_QUINT, STEP_START, STEP_END};
    }

    public float N(float f) {
        float f2 = class09693.N(f);
        return switch (this.ordinal()) {
            default -> throw new MatchException(null, null);
            case 0 -> f2;
            case 1 -> f2 * f2 * (3.0f - 2.0f * f2);
            case 2 -> f2 * f2;
            case 3 -> 1.0f - (1.0f - f2) * (1.0f - f2);
            case 4 -> {
                if (f2 < 0.5f) {
                    yield 2.0f * f2 * f2;
                }
                yield 1.0f - 2.0f * (1.0f - f2) * (1.0f - f2);
            }
            case 5 -> {
                float var3_3 = 1.0f - f2;
                yield 1.0f - var3_3 * var3_3 * var3_3 * var3_3 * var3_3;
            }
            case 6 -> {
                if (f2 <= 0.0f) {
                    yield 0.0f;
                }
                yield 1.0f;
            }
            case 7 -> f2 < 1.0f ? 0.0f : 1.0f;
        };
    }
}

