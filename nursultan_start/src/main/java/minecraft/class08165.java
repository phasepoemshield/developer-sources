/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class05033
 */
package minecraft;

import com.mojang.serialization.Codec;
import minecraft.class05033;

public final class class08165
extends Enum<class08165>
implements class05033 {
    public static final /* enum */ class08165 field_63425 = new class08165(0, "full_moon");
    public static final /* enum */ class08165 field_63426 = new class08165(1, "waning_gibbous");
    public static final /* enum */ class08165 field_63427 = new class08165(2, "third_quarter");
    public static final /* enum */ class08165 field_63428 = new class08165(3, "waning_crescent");
    public static final /* enum */ class08165 field_63429 = new class08165(4, "new_moon");
    public static final /* enum */ class08165 field_63430 = new class08165(5, "waxing_crescent");
    public static final /* enum */ class08165 field_63431 = new class08165(6, "first_quarter");
    public static final /* enum */ class08165 field_63432 = new class08165(7, "waxing_gibbous");
    public static final Codec<class08165> field_64378;
    public static final int field_63433;
    public static final int field_64379 = 24000;
    private final int field_63434;
    private final String field_63435;
    private static final /* synthetic */ class08165[] field_63436;

    private static /* synthetic */ class08165[] L() {
        return new class08165[]{field_63425, field_63426, field_63427, field_63428, field_63429, field_63430, field_63431, field_63432};
    }

    private class08165(int n2, String string2) {
        this.field_63434 = n2;
        this.field_63435 = string2;
    }

    public static class08165[] values() {
        return (class08165[])field_63436.clone();
    }

    public static class08165 valueOf(String string) {
        return Enum.valueOf(class08165.class, string);
    }

    public int y() {
        return this.field_63434 * 24000;
    }

    public int N() {
        return this.field_63434;
    }

    public String method_15434() {
        return this.field_63435;
    }

    static {
        field_63436 = class08165.L();
        field_64378 = class05033.N(class08165::values);
        field_63433 = class08165.values().length;
    }
}

