/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  java.lang.MatchException
 *  minecraft.class05033
 *  minecraft.class06069
 */
package minecraft;

import com.mojang.serialization.Codec;
import minecraft.class05033;
import minecraft.class06069;

public final class class03553
extends Enum<class03553>
implements class05033 {
    public static final /* enum */ class03553 field_36421 = new class03553("linear");
    public static final /* enum */ class03553 field_36422 = new class03553("triangular");
    public static final Codec<class03553> field_36423;
    private final String field_36425;
    private static final /* synthetic */ class03553[] field_36426;

    private class03553(String string2) {
        this.field_36425 = string2;
    }

    public static class03553[] values() {
        return (class03553[])field_36426.clone();
    }

    public static class03553 valueOf(String string) {
        return Enum.valueOf(class03553.class, string);
    }

    private static /* synthetic */ class03553[] N() {
        return new class03553[]{field_36421, field_36422};
    }

    public int N(class06069 class060692, int n) {
        return switch (this.ordinal()) {
            default -> throw new MatchException(null, null);
            case 0 -> class060692.y(n);
            case 1 -> (class060692.y(n) + class060692.y(n)) / 2;
        };
    }

    public String method_15434() {
        return this.field_36425;
    }

    static {
        field_36426 = class03553.N();
        field_36423 = class05033.N(class03553::values);
    }
}

