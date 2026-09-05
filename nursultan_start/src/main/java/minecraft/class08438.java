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

public final class class08438
extends Enum<class08438>
implements class05033 {
    public static final /* enum */ class08438 field_56429 = new class08438("normal");
    public static final /* enum */ class08438 field_56430 = new class08438("cold");
    public static final /* enum */ class08438 field_56431 = new class08438("warm");
    public static final Codec<class08438> field_56432;
    private final String field_56433;
    private static final /* synthetic */ class08438[] field_56434;

    private class08438(String string2) {
        this.field_56433 = string2;
    }

    public static class08438[] values() {
        return (class08438[])field_56434.clone();
    }

    public static class08438 valueOf(String string) {
        return Enum.valueOf(class08438.class, string);
    }

    private static /* synthetic */ class08438[] N() {
        return new class08438[]{field_56429, field_56430, field_56431};
    }

    public String method_15434() {
        return this.field_56433;
    }

    static {
        field_56434 = class08438.N();
        field_56432 = class05033.N(class08438::values);
    }
}

