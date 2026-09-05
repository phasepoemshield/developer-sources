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

public final class class05346
extends Enum<class05346>
implements class05033 {
    public static final /* enum */ class05346 field_18424 = new class05346("major_negative", -5, 100, 10, 10);
    public static final /* enum */ class05346 field_18425 = new class05346("minor_negative", -1, 200, 20, 20);
    public static final /* enum */ class05346 field_18426 = new class05346("minor_positive", 1, 25, 1, 5);
    public static final /* enum */ class05346 field_18427 = new class05346("major_positive", 5, 20, 0, 20);
    public static final /* enum */ class05346 field_18428 = new class05346("trading", 1, 25, 2, 20);
    public static final int field_30240 = 25;
    public static final int field_30241 = 20;
    public static final int field_30242 = 2;
    public final String field_18430;
    public final int field_18431;
    public final int field_18432;
    public final int field_19354;
    public final int field_18434;
    public static final Codec<class05346> field_41672;
    private static final /* synthetic */ class05346[] field_18436;

    private class05346(String string2, int n2, int n3, int n4, int n5) {
        this.field_18430 = string2;
        this.field_18431 = n2;
        this.field_18432 = n3;
        this.field_19354 = n4;
        this.field_18434 = n5;
    }

    static {
        field_18436 = class05346.N();
        field_41672 = class05033.N(class05346::values);
    }

    public static class05346[] values() {
        return (class05346[])field_18436.clone();
    }

    public static class05346 valueOf(String string) {
        return Enum.valueOf(class05346.class, string);
    }

    private static /* synthetic */ class05346[] N() {
        return new class05346[]{field_18424, field_18425, field_18426, field_18427, field_18428};
    }

    public String method_15434() {
        return this.field_18430;
    }
}

