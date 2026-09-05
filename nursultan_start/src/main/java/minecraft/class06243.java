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

public final class class06243
extends Enum<class06243>
implements class05033 {
    public static final /* enum */ class06243 field_17160 = new class06243("none");
    public static final /* enum */ class06243 field_17161 = new class06243("partial");
    public static final /* enum */ class06243 field_17162 = new class06243("full");
    public static final Codec<class06243> field_55540;
    private final String field_17164;
    private static final /* synthetic */ class06243[] field_17165;

    private class06243(String string2) {
        this.field_17164 = string2;
    }

    static {
        field_17165 = class06243.N();
        field_55540 = class05033.N(class06243::values);
    }

    public static class06243[] values() {
        return (class06243[])field_17165.clone();
    }

    public static class06243 valueOf(String string) {
        return Enum.valueOf(class06243.class, string);
    }

    private static /* synthetic */ class06243[] N() {
        return new class06243[]{field_17160, field_17161, field_17162};
    }

    public String method_15434() {
        return this.field_17164;
    }
}

