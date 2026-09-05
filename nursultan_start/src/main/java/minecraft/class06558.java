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

public final class class06558
extends Enum<class06558>
implements class05033 {
    public static final /* enum */ class06558 field_55206 = new class06558("none");
    public static final /* enum */ class06558 field_55207 = new class06558("arrow");
    public static final /* enum */ class06558 field_55208 = new class06558("rocket");
    public static final Codec<class06558> field_55209;
    private final String field_55210;
    private static final /* synthetic */ class06558[] field_55211;

    private class06558(String string2) {
        this.field_55210 = string2;
    }

    public static class06558[] values() {
        return (class06558[])field_55211.clone();
    }

    public static class06558 valueOf(String string) {
        return Enum.valueOf(class06558.class, string);
    }

    private static /* synthetic */ class06558[] N() {
        return new class06558[]{field_55206, field_55207, field_55208};
    }

    public String method_15434() {
        return this.field_55210;
    }

    static {
        field_55211 = class06558.N();
        field_55209 = class05033.N(class06558::values);
    }
}

