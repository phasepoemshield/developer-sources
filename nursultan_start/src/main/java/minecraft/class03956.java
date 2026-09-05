/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  org.joml.Vector3fc
 */
package minecraft;

import org.joml.Vector3fc;

public final class class03956
extends Enum<class03956> {
    public static final /* enum */ class03956 field_64559 = new class03956();
    public static final /* enum */ class03956 field_64560 = new class03956();
    public static final /* enum */ class03956 field_64561 = new class03956();
    public static final /* enum */ class03956 field_64562 = new class03956();
    public static final /* enum */ class03956 field_64563 = new class03956();
    public static final /* enum */ class03956 field_64564 = new class03956();
    private static final /* synthetic */ class03956[] field_64565;

    public static class03956[] values() {
        return (class03956[])field_64565.clone();
    }

    public static class03956 valueOf(String string) {
        return Enum.valueOf(class03956.class, string);
    }

    public float N(Vector3fc vector3fc, Vector3fc vector3fc2) {
        return switch (this.ordinal()) {
            default -> throw new MatchException(null, null);
            case 0 -> vector3fc.x();
            case 1 -> vector3fc.y();
            case 2 -> vector3fc.z();
            case 3 -> vector3fc2.x();
            case 4 -> vector3fc2.y();
            case 5 -> vector3fc2.z();
        };
    }

    private static /* synthetic */ class03956[] N() {
        return new class03956[]{field_64559, field_64560, field_64561, field_64562, field_64563, field_64564};
    }

    public float N(float f, float f2, float f3, float f4, float f5, float f6) {
        return switch (this.ordinal()) {
            default -> throw new MatchException(null, null);
            case 0 -> f;
            case 1 -> f2;
            case 2 -> f3;
            case 3 -> f4;
            case 4 -> f5;
            case 5 -> f6;
        };
    }

    static {
        field_64565 = class03956.N();
    }
}

