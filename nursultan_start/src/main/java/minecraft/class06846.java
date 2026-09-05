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

public final class class06846
extends Enum<class06846>
implements class05033 {
    public static final /* enum */ class06846 field_64076 = new class06846("auto");
    public static final /* enum */ class06846 field_64077 = new class06846("mean");
    public static final /* enum */ class06846 field_64078 = new class06846("cutout");
    public static final /* enum */ class06846 field_64079 = new class06846("strict_cutout");
    public static final /* enum */ class06846 field_64080 = new class06846("dark_cutout");
    public static final Codec<class06846> field_64081;
    private final String field_64082;
    private static final /* synthetic */ class06846[] field_64083;

    private class06846(String string2) {
        this.field_64082 = string2;
    }

    public static class06846[] values() {
        return (class06846[])field_64083.clone();
    }

    public static class06846 valueOf(String string) {
        return Enum.valueOf(class06846.class, string);
    }

    private static /* synthetic */ class06846[] N() {
        return new class06846[]{field_64076, field_64077, field_64078, field_64079, field_64080};
    }

    public String method_15434() {
        return this.field_64082;
    }

    static {
        field_64083 = class06846.N();
        field_64081 = class05033.y(class06846::values);
    }
}

