/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  it.unimi.dsi.fastutil.doubles.Double2DoubleFunction
 *  minecraft.class05033
 */
package minecraft;

import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.doubles.Double2DoubleFunction;
import minecraft.class03911;
import minecraft.class05033;

public final class class03873
extends Enum<class03873>
implements class05033 {
    public static final /* enum */ class03873 field_37066 = new class03873("type_1", class03911::y, 2.0);
    public static final /* enum */ class03873 field_37067 = new class03873("type_2", class03911::N, 3.0);
    public static final Codec<class03873> field_37068;
    private final String field_37070;
    final Double2DoubleFunction field_37071;
    final double field_37072;
    private static final /* synthetic */ class03873[] field_37073;

    private class03873(String string2, Double2DoubleFunction double2DoubleFunction, double d) {
        this.field_37070 = string2;
        this.field_37071 = double2DoubleFunction;
        this.field_37072 = d;
    }

    public static class03873[] values() {
        return (class03873[])field_37073.clone();
    }

    public static class03873 valueOf(String string) {
        return Enum.valueOf(class03873.class, string);
    }

    private static /* synthetic */ class03873[] N() {
        return new class03873[]{field_37066, field_37067};
    }

    public String method_15434() {
        return this.field_37070;
    }

    static {
        field_37073 = class03873.N();
        field_37068 = class05033.N(class03873::values);
    }
}

