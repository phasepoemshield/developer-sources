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

public final class class07328
extends Enum<class07328>
implements class05033 {
    public static final /* enum */ class07328 field_40888 = new class07328("none");
    public static final /* enum */ class07328 field_40889 = new class07328("block");
    public static final /* enum */ class07328 field_40890 = new class07328("mob");
    public static final /* enum */ class07328 field_40891 = new class07328("tnt");
    public static final /* enum */ class07328 field_51779 = new class07328("trigger");
    public static final Codec<class07328> field_51780;
    private final String field_51781;
    private static final /* synthetic */ class07328[] field_40892;

    private class07328(String string2) {
        this.field_51781 = string2;
    }

    public static class07328[] values() {
        return (class07328[])field_40892.clone();
    }

    public static class07328 valueOf(String string) {
        return Enum.valueOf(class07328.class, string);
    }

    private static /* synthetic */ class07328[] N() {
        return new class07328[]{field_40888, field_40889, field_40890, field_40891, field_51779};
    }

    public String method_15434() {
        return this.field_51781;
    }

    static {
        field_40892 = class07328.N();
        field_51780 = class05033.N(class07328::values);
    }
}

