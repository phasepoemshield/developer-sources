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

public final class class02610
extends Enum<class02610>
implements class05033 {
    public static final /* enum */ class02610 field_52237 = new class02610("ignore_waterlogging");
    public static final /* enum */ class02610 field_52238 = new class02610("apply_waterlogging");
    public static Codec<class02610> field_52239;
    private final String field_52240;
    private static final /* synthetic */ class02610[] field_52241;

    private class02610(String string2) {
        this.field_52240 = string2;
    }

    public static class02610[] values() {
        return (class02610[])field_52241.clone();
    }

    public static class02610 valueOf(String string) {
        return Enum.valueOf(class02610.class, string);
    }

    private static /* synthetic */ class02610[] N() {
        return new class02610[]{field_52237, field_52238};
    }

    public String method_15434() {
        return this.field_52240;
    }

    static {
        field_52241 = class02610.N();
        field_52239 = class05033.y(class02610::values);
    }
}

